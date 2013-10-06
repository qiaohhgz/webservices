
package com.client.batch.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}maxResults"/>
 *         &lt;element ref="{}thumbMaps"/>
 *         &lt;element ref="{}ignoreLatLngInput"/>
 *         &lt;element ref="{}boundingBox"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "maxResults",
    "thumbMaps",
    "ignoreLatLngInput",
    "boundingBox"
})
@XmlRootElement(name = "options")
public class Options {

    @XmlElement(required = true)
    protected String maxResults;
    @XmlElement(required = true)
    protected String thumbMaps;
    @XmlElement(required = true)
    protected String ignoreLatLngInput;
    @XmlElement(required = true)
    protected String boundingBox;

    /**
     * Gets the value of the maxResults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxResults() {
        return maxResults;
    }

    /**
     * Sets the value of the maxResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxResults(String value) {
        this.maxResults = value;
    }

    /**
     * Gets the value of the thumbMaps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThumbMaps() {
        return thumbMaps;
    }

    /**
     * Sets the value of the thumbMaps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThumbMaps(String value) {
        this.thumbMaps = value;
    }

    /**
     * Gets the value of the ignoreLatLngInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreLatLngInput() {
        return ignoreLatLngInput;
    }

    /**
     * Sets the value of the ignoreLatLngInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreLatLngInput(String value) {
        this.ignoreLatLngInput = value;
    }

    /**
     * Gets the value of the boundingBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundingBox() {
        return boundingBox;
    }

    /**
     * Sets the value of the boundingBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundingBox(String value) {
        this.boundingBox = value;
    }

}
