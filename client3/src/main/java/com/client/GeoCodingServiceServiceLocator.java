/**
 * GeoCodingServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.client;

public class GeoCodingServiceServiceLocator extends org.apache.axis.client.Service implements com.client.GeoCodingServiceService {

    public GeoCodingServiceServiceLocator() {
    }


    public GeoCodingServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GeoCodingServiceServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GeoCodingServicePort
    private String GeoCodingServicePort_address = "http://10.0.219.107:80/geocoder-ws/soap";

    public String getGeoCodingServicePortAddress() {
        return GeoCodingServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private String GeoCodingServicePortWSDDServiceName = "GeoCodingServicePort";

    public String getGeoCodingServicePortWSDDServiceName() {
        return GeoCodingServicePortWSDDServiceName;
    }

    public void setGeoCodingServicePortWSDDServiceName(String name) {
        GeoCodingServicePortWSDDServiceName = name;
    }

    public com.client.GeoCodingService getGeoCodingServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GeoCodingServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGeoCodingServicePort(endpoint);
    }

    public com.client.GeoCodingService getGeoCodingServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.client.GeoCodingServicePortBindingStub _stub = new com.client.GeoCodingServicePortBindingStub(portAddress, this);
            _stub.setPortName(getGeoCodingServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGeoCodingServicePortEndpointAddress(String address) {
        GeoCodingServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.client.GeoCodingService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.client.GeoCodingServicePortBindingStub _stub = new com.client.GeoCodingServicePortBindingStub(new java.net.URL(GeoCodingServicePort_address), this);
                _stub.setPortName(getGeoCodingServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("GeoCodingServicePort".equals(inputPortName)) {
            return getGeoCodingServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soapresources.webservice.geocoding.yellowbook.com/", "GeoCodingServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soapresources.webservice.geocoding.yellowbook.com/", "GeoCodingServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

if ("GeoCodingServicePort".equals(portName)) {
            setGeoCodingServicePortEndpointAddress(address);
        }
        else
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
