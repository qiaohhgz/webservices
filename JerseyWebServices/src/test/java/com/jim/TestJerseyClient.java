package com.jim;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.Arrays;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: Jim_qiao
 * Date: 8/28/13
 * Time: 4:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestJerseyClient {
    @Test
    public void testDoRequest() throws Exception {
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create(config);
        client.addFilter(new LoggingFilter());

        WebResource service = client.resource(getBaseURI());
        // Fluent interfaces
        System.out.println(service.path("rest").path("hello").accept(MediaType.TEXT_PLAIN).get(ClientResponse.class).toString());
        // Get plain text
        System.out.println(service.path("rest").path("hello").accept(MediaType.TEXT_PLAIN).get(String.class));
        // Get XML
        System.out.println(service.path("rest").path("hello").accept(MediaType.TEXT_XML).get(String.class));
        // The HTML
        System.out.println(service.path("rest").path("hello").accept(MediaType.TEXT_HTML).get(String.class));
        // post hello
        System.out.println(service.path("rest").path("hello").path("v1").accept(MediaType.TEXT_PLAIN).post(String.class));

        // post
        // post
        PersonBean personBean = new PersonBean();
        personBean.setName("张三");
        ClientResponse response = service.path("rest")
                .path("hello").path("v3")
                .accept(MediaType.APPLICATION_JSON)
                .entity(personBean, MediaType.APPLICATION_JSON)
                .post(ClientResponse.class, personBean);
        int status = response.getStatus();
        System.out.println("status = " + status);
        if (status == 200) {
            PersonBean bean = response.getEntity(PersonBean.class);
            assertNotNull(bean.getName());
            assertNotNull(bean.getHouse());
            assertNotNull(bean.getHouse().getName());
            TreeMap<String, House> treeMap = bean.getTreeMap();
            assertNotNull(treeMap);
            assertNotNull(treeMap.get("house"));

            int[] budget = bean.getBudget();
            assertNotNull(budget);
            assertEquals(budget[0], 500);
            assertEquals(budget[1], 800);
            assertEquals(budget[2], 1000);

            System.out.println(Arrays.toString(budget));
        } else {
            System.out.println(response.toString());
        }
    }

    private URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/services").build();
    }
}
