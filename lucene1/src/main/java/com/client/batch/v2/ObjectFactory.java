
package com.client.batch.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Text_QNAME = new QName("", "text");
    private final static QName _ImageUrl_QNAME = new QName("", "imageUrl");
    private final static QName _Street_QNAME = new QName("", "street");
    private final static QName _ImageAltText_QNAME = new QName("", "imageAltText");
    private final static QName _Lng_QNAME = new QName("", "lng");
    private final static QName _IgnoreLatLngInput_QNAME = new QName("", "ignoreLatLngInput");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _ThumbMaps_QNAME = new QName("", "thumbMaps");
    private final static QName _MaxResults_QNAME = new QName("", "maxResults");
    private final static QName _Messages_QNAME = new QName("", "messages");
    private final static QName _StatusCode_QNAME = new QName("", "statusCode");
    private final static QName _BoundingBox_QNAME = new QName("", "boundingBox");
    private final static QName _LinkId_QNAME = new QName("", "linkId");
    private final static QName _PostalCode_QNAME = new QName("", "postalCode");
    private final static QName _DragPoint_QNAME = new QName("", "dragPoint");
    private final static QName _SideOfStreet_QNAME = new QName("", "sideOfStreet");
    private final static QName _GeocodeQuality_QNAME = new QName("", "geocodeQuality");
    private final static QName _GeocodeQualityCode_QNAME = new QName("", "geocodeQualityCode");
    private final static QName _Lat_QNAME = new QName("", "lat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DisplayLatLng }
     * 
     */
    public DisplayLatLng createDisplayLatLng() {
        return new DisplayLatLng();
    }

    /**
     * Create an instance of {@link Locations }
     * 
     */
    public Locations createLocations() {
        return new Locations();
    }

    /**
     * Create an instance of {@link LatLng }
     * 
     */
    public LatLng createLatLng() {
        return new LatLng();
    }

    /**
     * Create an instance of {@link AdminArea5 }
     * 
     */
    public AdminArea5 createAdminArea5() {
        return new AdminArea5();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Options }
     * 
     */
    public Options createOptions() {
        return new Options();
    }

    /**
     * Create an instance of {@link AdminArea4 }
     * 
     */
    public AdminArea4 createAdminArea4() {
        return new AdminArea4();
    }

    /**
     * Create an instance of {@link AdminArea1 }
     * 
     */
    public AdminArea1 createAdminArea1() {
        return new AdminArea1();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link AdminArea3 }
     * 
     */
    public AdminArea3 createAdminArea3() {
        return new AdminArea3();
    }

    /**
     * Create an instance of {@link ProvidedLocation }
     * 
     */
    public ProvidedLocation createProvidedLocation() {
        return new ProvidedLocation();
    }

    /**
     * Create an instance of {@link Info }
     * 
     */
    public Info createInfo() {
        return new Info();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link Copyright }
     * 
     */
    public Copyright createCopyright() {
        return new Copyright();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "imageUrl")
    public JAXBElement<String> createImageUrl(String value) {
        return new JAXBElement<String>(_ImageUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "street")
    public JAXBElement<String> createStreet(String value) {
        return new JAXBElement<String>(_Street_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "imageAltText")
    public JAXBElement<String> createImageAltText(String value) {
        return new JAXBElement<String>(_ImageAltText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lng")
    public JAXBElement<String> createLng(String value) {
        return new JAXBElement<String>(_Lng_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ignoreLatLngInput")
    public JAXBElement<String> createIgnoreLatLngInput(String value) {
        return new JAXBElement<String>(_IgnoreLatLngInput_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "thumbMaps")
    public JAXBElement<String> createThumbMaps(String value) {
        return new JAXBElement<String>(_ThumbMaps_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "maxResults")
    public JAXBElement<String> createMaxResults(String value) {
        return new JAXBElement<String>(_MaxResults_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "messages")
    public JAXBElement<String> createMessages(String value) {
        return new JAXBElement<String>(_Messages_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "statusCode")
    public JAXBElement<String> createStatusCode(String value) {
        return new JAXBElement<String>(_StatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "boundingBox")
    public JAXBElement<String> createBoundingBox(String value) {
        return new JAXBElement<String>(_BoundingBox_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "linkId")
    public JAXBElement<String> createLinkId(String value) {
        return new JAXBElement<String>(_LinkId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postalCode")
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "dragPoint")
    public JAXBElement<String> createDragPoint(String value) {
        return new JAXBElement<String>(_DragPoint_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sideOfStreet")
    public JAXBElement<String> createSideOfStreet(String value) {
        return new JAXBElement<String>(_SideOfStreet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "geocodeQuality")
    public JAXBElement<String> createGeocodeQuality(String value) {
        return new JAXBElement<String>(_GeocodeQuality_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "geocodeQualityCode")
    public JAXBElement<String> createGeocodeQualityCode(String value) {
        return new JAXBElement<String>(_GeocodeQualityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lat")
    public JAXBElement<String> createLat(String value) {
        return new JAXBElement<String>(_Lat_QNAME, String.class, null, value);
    }

}
