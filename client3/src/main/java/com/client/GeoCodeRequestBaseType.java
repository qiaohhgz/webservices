/**
 * GeoCodeRequestBaseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.client;

public abstract class GeoCodeRequestBaseType  implements java.io.Serializable {
    private String businessName;

    private String businessPhone;

    private String addressOne;

    private String addressTwo;

    private String addressThree;

    public GeoCodeRequestBaseType() {
    }

    public GeoCodeRequestBaseType(
           String businessName,
           String businessPhone,
           String addressOne,
           String addressTwo,
           String addressThree) {
           this.businessName = businessName;
           this.businessPhone = businessPhone;
           this.addressOne = addressOne;
           this.addressTwo = addressTwo;
           this.addressThree = addressThree;
    }


    /**
     * Gets the businessName value for this GeoCodeRequestBaseType.
     *
     * @return businessName
     */
    public String getBusinessName() {
        return businessName;
    }


    /**
     * Sets the businessName value for this GeoCodeRequestBaseType.
     *
     * @param businessName
     */
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }


    /**
     * Gets the businessPhone value for this GeoCodeRequestBaseType.
     *
     * @return businessPhone
     */
    public String getBusinessPhone() {
        return businessPhone;
    }


    /**
     * Sets the businessPhone value for this GeoCodeRequestBaseType.
     *
     * @param businessPhone
     */
    public void setBusinessPhone(String businessPhone) {
        this.businessPhone = businessPhone;
    }


    /**
     * Gets the addressOne value for this GeoCodeRequestBaseType.
     *
     * @return addressOne
     */
    public String getAddressOne() {
        return addressOne;
    }


    /**
     * Sets the addressOne value for this GeoCodeRequestBaseType.
     *
     * @param addressOne
     */
    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }


    /**
     * Gets the addressTwo value for this GeoCodeRequestBaseType.
     *
     * @return addressTwo
     */
    public String getAddressTwo() {
        return addressTwo;
    }


    /**
     * Sets the addressTwo value for this GeoCodeRequestBaseType.
     *
     * @param addressTwo
     */
    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }


    /**
     * Gets the addressThree value for this GeoCodeRequestBaseType.
     *
     * @return addressThree
     */
    public String getAddressThree() {
        return addressThree;
    }


    /**
     * Sets the addressThree value for this GeoCodeRequestBaseType.
     *
     * @param addressThree
     */
    public void setAddressThree(String addressThree) {
        this.addressThree = addressThree;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GeoCodeRequestBaseType)) return false;
        GeoCodeRequestBaseType other = (GeoCodeRequestBaseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.businessName==null && other.getBusinessName()==null) ||
             (this.businessName!=null &&
              this.businessName.equals(other.getBusinessName()))) &&
            ((this.businessPhone==null && other.getBusinessPhone()==null) ||
             (this.businessPhone!=null &&
              this.businessPhone.equals(other.getBusinessPhone()))) &&
            ((this.addressOne==null && other.getAddressOne()==null) ||
             (this.addressOne!=null &&
              this.addressOne.equals(other.getAddressOne()))) &&
            ((this.addressTwo==null && other.getAddressTwo()==null) ||
             (this.addressTwo!=null &&
              this.addressTwo.equals(other.getAddressTwo()))) &&
            ((this.addressThree==null && other.getAddressThree()==null) ||
             (this.addressThree!=null &&
              this.addressThree.equals(other.getAddressThree())));
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
        if (getBusinessName() != null) {
            _hashCode += getBusinessName().hashCode();
        }
        if (getBusinessPhone() != null) {
            _hashCode += getBusinessPhone().hashCode();
        }
        if (getAddressOne() != null) {
            _hashCode += getAddressOne().hashCode();
        }
        if (getAddressTwo() != null) {
            _hashCode += getAddressTwo().hashCode();
        }
        if (getAddressThree() != null) {
            _hashCode += getAddressThree().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeoCodeRequestBaseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "GeoCodeRequestBaseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "businessName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "businessPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressOne");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "addressOne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressTwo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "addressTwo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressThree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.webservices.geocoding.yellowbook.com", "addressThree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
