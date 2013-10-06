
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
 *         &lt;element ref="{}imageUrl"/>
 *         &lt;element ref="{}imageAltText"/>
 *         &lt;element ref="{}text"/>
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
    "imageUrl",
    "imageAltText",
    "text"
})
@XmlRootElement(name = "copyright")
public class Copyright {

    @XmlElement(required = true)
    protected String imageUrl;
    @XmlElement(required = true)
    protected String imageAltText;
    @XmlElement(required = true)
    protected String text;

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the imageAltText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageAltText() {
        return imageAltText;
    }

    /**
     * Sets the value of the imageAltText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageAltText(String value) {
        this.imageAltText = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
