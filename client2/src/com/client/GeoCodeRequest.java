/**
 * GeoCodeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.client;

public class GeoCodeRequest  implements java.io.Serializable {
    private com.client.GeoCodeRequestBaseType geoCodeRequestBase;

    private com.client.GeoCodeRequestUkType geoCodeRequestUk;

    private com.client.GeoCodeRequestUsType geoCodeRequestUs;

    public GeoCodeRequest() {
    }

    public GeoCodeRequest(
           com.client.GeoCodeRequestBaseType geoCodeRequestBase,
           com.client.GeoCodeRequestUkType geoCodeRequestUk,
           com.client.GeoCodeRequestUsType geoCodeRequestUs) {
           this.geoCodeRequestBase = geoCodeRequestBase;
           this.geoCodeRequestUk = geoCodeRequestUk;
           this.geoCodeRequestUs = geoCodeRequestUs;
    }


    /**
     * Gets the geoCodeRequestBase value for this GeoCodeRequest.
     * 
     * @return geoCodeRequestBase
     */
    public com.client.GeoCodeRequestBaseType getGeoCodeRequestBase() {
        return geoCodeRequestBase;
    }


    /**
     * Sets the geoCodeRequestBase value for this GeoCodeRequest.
     * 
     * @param geoCodeRequestBase
     */
    public void setGeoCodeRequestBase(com.client.GeoCodeRequestBaseType geoCodeRequestBase) {
        this.geoCodeRequestBase = geoCodeRequestBase;
    }


    /**
     * Gets the geoCodeRequestUk value for this GeoCodeRequest.
     * 
     * @return geoCodeRequestUk
     */
    public com.client.GeoCodeRequestUkType getGeoCodeRequestUk() {
        return geoCodeRequestUk;
    }


    /**
     * Sets the geoCodeRequestUk value for this GeoCodeRequest.
     * 
     * @param geoCodeRequestUk
     */
    public void setGeoCodeRequestUk(com.client.GeoCodeRequestUkType geoCodeRequestUk) {
        this.geoCodeRequestUk = geoCodeRequestUk;
    }


    /**
     * Gets the geoCodeRequestUs value for this GeoCodeRequest.
     * 
     * @return geoCodeRequestUs
     */
    public com.client.GeoCodeRequestUsType getGeoCodeRequestUs() {
        return geoCodeRequestUs;
    }


    /**
     * Sets the geoCodeRequestUs value for this GeoCodeRequest.
     * 
     * @param geoCodeRequestUs
     */
    public void setGeoCodeRequestUs(com.client.GeoCodeRequestUsType geoCodeRequestUs) {
        this.geoCodeRequestUs = geoCodeRequestUs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeoCodeRequest)) return false;
        GeoCodeRequest other = (GeoCodeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.geoCodeRequestBase==null && other.getGeoCodeRequestBase()==null) || 
             (this.geoCodeRequestBase!=null &&
              this.geoCodeRequestBase.equals(other.getGeoCodeRequestBase()))) &&
            ((this.geoCodeRequestUk==null && other.getGeoCodeRequestUk()==null) || 
             (this.geoCodeRequestUk!=null &&
              this.geoCodeRequestUk.equals(other.getGeoCodeRequestUk()))) &&
            ((this.geoCodeRequestUs==null && other.getGeoCodeRequestUs()==null) || 
             (this.geoCodeRequestUs!=null &&
              this.geoCodeRequestUs.equals(other.getGeoCodeRequestUs())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGeoCodeRequestBase() != null) {
            _hashCode += getGeoCodeRequestBase().hashCode();
        }
        if (getGeoCodeRequestUk() != null) {
            _hashCode += getGeoCodeRequestUk().hashCode();
        }
        if (getGeoCodeRequestUs() != null) {
            _hashCode += getGeoCodeRequestUs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoCodeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", ">geoCodeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoCodeRequestBase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "GeoCodeRequestBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "GeoCodeRequestBaseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoCodeRequestUk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "GeoCodeRequestUk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "GeoCodeRequestUkType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoCodeRequestUs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "GeoCodeRequestUs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "GeoCodeRequestUsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
