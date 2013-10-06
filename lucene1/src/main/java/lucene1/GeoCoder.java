package lucene1;

/**
 * Created with IntelliJ IDEA.
 * User: JimQiao
 * Date: 4/12/13
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class GeoCoder {
    private String latitude;
    private String longitude;
    private String warning;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String mapQuestApi;

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
