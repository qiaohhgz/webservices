
package com.client.batch.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element ref="{}street" minOccurs="0"/>
 *         &lt;element ref="{}adminArea5" minOccurs="0"/>
 *         &lt;element ref="{}adminArea3" minOccurs="0"/>
 *         &lt;element ref="{}adminArea4" minOccurs="0"/>
 *         &lt;element ref="{}postalCode" minOccurs="0"/>
 *         &lt;element ref="{}adminArea1" minOccurs="0"/>
 *         &lt;element ref="{}geocodeQuality" minOccurs="0"/>
 *         &lt;element ref="{}geocodeQualityCode" minOccurs="0"/>
 *         &lt;element ref="{}dragPoint" minOccurs="0"/>
 *         &lt;element ref="{}sideOfStreet" minOccurs="0"/>
 *         &lt;element ref="{}displayLatLng" minOccurs="0"/>
 *         &lt;element ref="{}linkId" minOccurs="0"/>
 *         &lt;element ref="{}type" minOccurs="0"/>
 *         &lt;element ref="{}latLng" minOccurs="0"/>
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
    "content"
})
@XmlRootElement(name = "location")
public class Location {

    @XmlElementRefs({
        @XmlElementRef(name = "dragPoint", type = JAXBElement.class),
        @XmlElementRef(name = "displayLatLng", type = DisplayLatLng.class),
        @XmlElementRef(name = "latLng", type = LatLng.class),
        @XmlElementRef(name = "adminArea5", type = AdminArea5 .class),
        @XmlElementRef(name = "street", type = JAXBElement.class),
        @XmlElementRef(name = "geocodeQuality", type = JAXBElement.class),
        @XmlElementRef(name = "postalCode", type = JAXBElement.class),
        @XmlElementRef(name = "adminArea4", type = AdminArea4 .class),
        @XmlElementRef(name = "adminArea1", type = AdminArea1 .class),
        @XmlElementRef(name = "geocodeQualityCode", type = JAXBElement.class),
        @XmlElementRef(name = "sideOfStreet", type = JAXBElement.class),
        @XmlElementRef(name = "type", type = JAXBElement.class),
        @XmlElementRef(name = "adminArea3", type = AdminArea3 .class),
        @XmlElementRef(name = "linkId", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Object> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link DisplayLatLng }
     * {@link LatLng }
     * {@link AdminArea5 }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * {@link AdminArea4 }
     * {@link AdminArea1 }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link AdminArea3 }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

}
