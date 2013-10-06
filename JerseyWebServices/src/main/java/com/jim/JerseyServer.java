package com.jim;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: Jim_qiao
 * Date: 8/28/13
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
// Plain old Java Object it does not extend as class or implements
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation.
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML.

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/hello")
public class JerseyServer {

    // This method is called if TEXT_PLAIN is request
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello Jersey";
    }

    // This method is called if XML is request
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
    }

    // This method is called if HTML is request
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
    }

    @POST
    @Path("/v1")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String sayJsonHello() {
        return "Hello world";
    }

    @POST
    @Path("/v2")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response sayJsonHello(@FormParam("name") String name) {
        return Response.ok("{text:\"Hello " + name + "+\"}").build();
    }

    @POST
    @Path("/v3")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response sayJsonHello(PersonBean personBean) {
        personBean = new PersonBean();
        personBean.setName("Hello " + personBean.getName());
        personBean.setHouse(new House("房子1"));

        TreeMap<String, House> treeMap = new TreeMap<String, House>();
        treeMap.put("house", new House("房子2"));
        personBean.setTreeMap(treeMap);

        //put array
        int[] budget = new int[3];
        budget[0] = 500;
        budget[1] = 800;
        budget[2] = 1000;
        personBean.setBudget(budget);
        return Response.ok(personBean).build();
    }
}
