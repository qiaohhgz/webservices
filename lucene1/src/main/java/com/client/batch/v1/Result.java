
package com.client.batch.v1;

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
 *         &lt;element ref="{}providedLocation"/>
 *         &lt;element ref="{}locations"/>
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
    "providedLocation",
    "locations"
})
@XmlRootElement(name = "result")
public class Result {

    @XmlElement(required = true)
    protected ProvidedLocation providedLocation;
    @XmlElement(required = true)
    protected Locations locations;

    /**
     * Gets the value of the providedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ProvidedLocation }
     *     
     */
    public ProvidedLocation getProvidedLocation() {
        return providedLocation;
    }

    /**
     * Sets the value of the providedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvidedLocation }
     *     
     */
    public void setProvidedLocation(ProvidedLocation value) {
        this.providedLocation = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * @return
     *     possible object is
     *     {@link Locations }
     *     
     */
    public Locations getLocations() {
        return locations;
    }

    /**
     * Sets the value of the locations property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locations }
     *     
     */
    public void setLocations(Locations value) {
        this.locations = value;
    }

}
