/**
 * GeoCodeRequestUkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.client;

public class GeoCodeRequestUkType  extends com.client.GeoCodeRequestBaseType  implements java.io.Serializable {
    private String locality;

    private String postTown;

    private String postalCode;

    public GeoCodeRequestUkType() {
    }

    public GeoCodeRequestUkType(
           String businessName,
           String businessPhone,
           String addressOne,
           String addressTwo,
           String addressThree,
           String locality,
           String postTown,
           String postalCode) {
        super(
            businessName,
            businessPhone,
            addressOne,
            addressTwo,
            addressThree);
        this.locality = locality;
        this.postTown = postTown;
        this.postalCode = postalCode;
    }


    /**
     * Gets the locality value for this GeoCodeRequestUkType.
     *
     * @return locality
     */
    public String getLocality() {
        return locality;
    }


    /**
     * Sets the locality value for this GeoCodeRequestUkType.
     *
     * @param locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }


    /**
     * Gets the postTown value for this GeoCodeRequestUkType.
     *
     * @return postTown
     */
    public String getPostTown() {
        return postTown;
    }


    /**
     * Sets the postTown value for this GeoCodeRequestUkType.
     *
     * @param postTown
     */
    public void setPostTown(String postTown) {
        this.postTown = postTown;
    }


    /**
     * Gets the postalCode value for this GeoCodeRequestUkType.
     *
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this GeoCodeRequestUkType.
     *
     * @param postalCode
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GeoCodeRequestUkType)) return false;
        GeoCodeRequestUkType other = (GeoCodeRequestUkType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) &&
            ((this.locality==null && other.getLocality()==null) ||
             (this.locality!=null &&
              this.locality.equals(other.getLocality()))) &&
            ((this.postTown==null && other.getPostTown()==null) ||
             (this.postTown!=null &&
              this.postTown.equals(other.getPostTown()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) ||
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode())));
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
        if (getLocality() != null) {
            _hashCode += getLocality().hashCode();
        }
        if (getPostTown() != null) {
            _hashCode += getPostTown().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoCodeRequestUkType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "GeoCodeRequestUkType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "locality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postTown");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "postTown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "postalCode"));
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
