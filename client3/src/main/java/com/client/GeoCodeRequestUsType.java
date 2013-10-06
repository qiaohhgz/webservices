/**
 * GeoCodeRequestUsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.client;

public class GeoCodeRequestUsType  extends com.client.GeoCodeRequestBaseType  implements java.io.Serializable {
    private String city;

    private String state;

    private String zip;

    public GeoCodeRequestUsType() {
    }

    public GeoCodeRequestUsType(
           String businessName,
           String businessPhone,
           String addressOne,
           String addressTwo,
           String addressThree,
           String city,
           String state,
           String zip) {
        super(
            businessName,
            businessPhone,
            addressOne,
            addressTwo,
            addressThree);
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


    /**
     * Gets the city value for this GeoCodeRequestUsType.
     *
     * @return city
     */
    public String getCity() {
        return city;
    }


    /**
     * Sets the city value for this GeoCodeRequestUsType.
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this GeoCodeRequestUsType.
     *
     * @return state
     */
    public String getState() {
        return state;
    }


    /**
     * Sets the state value for this GeoCodeRequestUsType.
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this GeoCodeRequestUsType.
     *
     * @return zip
     */
    public String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this GeoCodeRequestUsType.
     *
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GeoCodeRequestUsType)) return false;
        GeoCodeRequestUsType other = (GeoCodeRequestUsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
            ((this.city==null && other.getCity()==null) ||
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) ||
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) ||
             (this.zip!=null &&
              this.zip.equals(other.getZip())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoCodeRequestUsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "GeoCodeRequestUsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
