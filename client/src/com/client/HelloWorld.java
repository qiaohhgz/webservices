
package com.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "HelloWorld", targetNamespace = "http://example/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HelloWorld {


    /**
     * 
     * @param from
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorldFrom", targetNamespace = "http://example/", className = "com.client.SayHelloWorldFrom")
    @ResponseWrapper(localName = "sayHelloWorldFromResponse", targetNamespace = "http://example/", className = "com.client.SayHelloWorldFromResponse")
    public String sayHelloWorldFrom(
        @WebParam(name = "from", targetNamespace = "")
        String from);

}
