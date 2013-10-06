package example;

import com.client.*;

/**
 * Created with IntelliJ IDEA.
 * User: JimQiao
 * Date: 4/9/13
 * Time: 5:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestClient {
    //            www.americantowns.com/ny/yonkers-zip-code
//            System.out.println("Zip Code 	Area Code 	Latitude 	Longitude 	Time Zone 	UTC 	Daylight Savings 	State FIPS Code 	County FIPS Code 	MSA Code 	City 	County 	State");
//            System.out.println("10701 	914 	40.941652 	-73.877562 	Eastern 	-5 	Y 	36 	36119 	5600 	Yonkers 	Westchester 	NY");
    public static void main(String[] args) {
        try {
            GeoCodeRequestUsType type = new GeoCodeRequestUsType();
            type.setAddressOne("");
            type.setCity("213131231231");
            type.setState("NY");
            type.setZip("");

//            out put
//            Edison
//            longitude = -74.4120953
//            latitude = 40.5187154
//            Edson
//            longitude = -75.6612953
//            latitude = 42.026746


            GeoCodeRequest request = new GeoCodeRequest();
            request.setGeoCodeRequestUs(type);

            GeoCodingServiceService serviceService = new GeoCodingServiceServiceLocator();
            GeoCodingService geoCodingServicePort = serviceService.getGeoCodingServicePort();
            GeoCodeResponse response = geoCodingServicePort.getLatitudeAndLongitude(request);
            System.out.println("response = " + response);
            double latitude = response.getLatitude();
            double longitude = response.getLongitude();
            String resultAccuracy = response.getResultAccuracy();
            String status = response.getStatus();
            String resultType = response.getResultType();
            System.out.println("longitude = " + longitude);
            System.out.println("latitude = " + latitude);
            System.out.println("resultAccuracy = " + resultAccuracy);
            System.out.println("resultType = " + resultType);
            System.out.println("status = " + status);
            System.out.println(latitude + "," + longitude);
        } catch (Exception axisFault) {
            axisFault.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
