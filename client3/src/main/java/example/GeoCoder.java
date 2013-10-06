package example;

import com.client.*;
import org.apache.log4j.Logger;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: JimQiao
 * Date: 4/9/13
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class GeoCoder {
    protected static final Logger log = Logger.getLogger(GeoCoder.class);
    private String latitude;
    private String longitude;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String warning;
    private String mapQuestApi;

    public GeoCoder() {
    }

    public GeoCoder(String latitude, String longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public GeoCoder geoCoding(String location) {
        GeoCoder g = new GeoCoder();
        try {
            GeoCodeRequestUsType request = getRequest(location, "", "", "");
            GeoCodeResponse response = getResponse(request);
            printResponse(response);
            g = build(response);
        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
        return g;
    }

    public GeoCoder geoCoding(String address, String city, String state, String zip) {
        GeoCoder g = new GeoCoder();
        try {
            GeoCodeRequestUsType request = getRequest(address, city, state, zip);
            GeoCodeResponse response = getResponse(request);
            printResponse(response);
            g = build(response);
        } catch (Exception ex) {
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }
        return g;
    }

    private GeoCodeRequestUsType getRequest(String address, String city, String state, String zip) {
        GeoCodeRequestUsType type = new GeoCodeRequestUsType();
        type.setAddressOne(address);
        type.setCity(city);
        type.setState(state);
        type.setZip(zip);
        System.out.print("address = " + address + " ");
        System.out.print("city = " + city + " ");
        System.out.print("state = " + state + " ");
        System.out.println("zip = " + zip + " ");
        return type;
    }

    private GeoCoder build(GeoCodeResponse response) {
        double latitude = response.getLatitude();
        double longitude = response.getLongitude();
        String resultAccuracy = response.getResultAccuracy();
        String status = response.getStatus();
        String resultType = response.getResultType();
        GeoCoder g = new GeoCoder(String.valueOf(latitude), String.valueOf(longitude));
        return g;
    }

    private void printResponse(GeoCodeResponse response) {
        System.out.println("response.getLongitude() = " + response.getLongitude());
        System.out.println("response.getLatitude() = " + response.getLatitude());
        System.out.println("response.getResultAccuracy() = " + response.getResultAccuracy());
        System.out.println("response.getResultType() = " + response.getResultType());
        System.out.println("response.getStatus() = " + response.getStatus());
        final String googleMapUrl = "https://maps.google.com.hk/maps?q=";
        System.out.println(googleMapUrl + response.getLatitude() + "," + response.getLongitude());
        System.out.println("=======================================================");
    }

    private GeoCodeResponse getResponse(GeoCodeRequestUsType type) throws ServiceException, RemoteException {
        GeoCodeRequest request = new GeoCodeRequest();
        request.setGeoCodeRequestUs(type);

        GeoCodingServiceService serviceService = new GeoCodingServiceServiceLocator();
        GeoCodingService geoCodingServicePort = serviceService.getGeoCodingServicePort();
        GeoCodeResponse response = geoCodingServicePort.getLatitudeAndLongitude(request);

        return response;
    }


    @Override
    public String toString() {
        return "GeoCoder{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", warning='" + warning + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", country='" + country + '\'' +
                ", mapQuestApi='" + mapQuestApi + '\'' +
                '}';
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMapQuestApi() {
        return mapQuestApi;
    }

    public void setMapQuestApi(String mapQuestApi) {
        this.mapQuestApi = mapQuestApi;
    }
}
