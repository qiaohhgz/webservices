package example;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: JimQiao
 * Date: 4/10/13
 * Time: 3:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestGeoCoder {
    //            www.americantowns.com/ny/yonkers-zip-code
//            System.out.println("Zip Code 	Area Code 	Latitude 	Longitude 	Time Zone 	UTC 	Daylight Savings 	State FIPS Code 	County FIPS Code 	MSA Code 	City 	County 	State");
//            System.out.println("10701 	914 	40.941652 	-73.877562 	Eastern 	-5 	Y 	36 	36119 	5600 	Yonkers 	Westchester 	NY");


    //            out put
//            Edison
//            longitude = -74.4120953
//            latitude = 40.5187154
//            Edson
//            longitude = -75.6612953
//            latitude = 42.026746

    @Test
    public void testLocation() throws Exception {
        GeoCoder g = new GeoCoder();
        String location = "Eastern,NY";
        g.geoCoding(location);
    }

    //    CityName: Moody
//    Category:	City
//    State:	Alabama
//    County:	Saint Clair
//    Area code:	205
//    FIPS code:	01115
//    Time zone:	CST
//    ZIP code:	35004
    @Test
    public void test2() throws Exception {
        GeoCoder g = new GeoCoder();
        String country = "Saint Clair";
        String zip = "35004";
        String state = "Alabama";
        String city = "Moody";
        String address = "";
        g.geoCoding(address, city, state, zip);
    }

//    Buskirk
//    Category:	City
//    State:	New York
//    County:	Rensselaer
//    Area code:	518
//    FIPS code:	36083
//    Time zone:	EST
//    ZIP code:	12028
//    calculate distance to another city


    @Test
    public void test3() throws Exception {
        GeoCoder g = new GeoCoder();
        String zip = "12028";
        String state = "New York";
        String city = "Buskirk";
        String address = "";
        g = g.geoCoding(address, city, state, zip);
    }

    @Test
    public void test4() throws Exception {
        GeoCoder g = new GeoCoder();
        String zip = "asdasdsa";
        String state = "asdsadsadad";
        String city = "asdasdadsad";
        String address = "adasdsadasd";
        g = g.geoCoding(address, city, state, zip);
    }

    @Test
    public void test5() throws Exception {
        GeoCoder g = new GeoCoder();
        String zip = "";
        String state = "New York";
        String city = "Buskirk";
        String address = "";
        g = g.geoCoding(address, city, state, zip);
    }

    @Test
    public void test6() throws Exception {
        GeoCoder g = new GeoCoder();
        String zip = "";
        String state = "New York";
        String city = "";
        String address = "";
        g = g.geoCoding(address, city, state, zip);
    }

    @Test
    public void test7() throws Exception {
        GeoCoder g = new GeoCoder();
        String zip = "", state = "", city = "", address = "";
//        g.geoCoding(address, city, state, zip);
//        g.geoCoding("", "", "", "12028");
//        g.geoCoding("", "Buskirk", "New York", "");
//        g.geoCoding("", "Buskirk", "NY", "");
//        g.geoCoding("", "Buskirk", "US-NY", "");
//        g.geoCoding("", "Buskirk", "US-NY", "");
//        g.geoCoding("Buskirk,New York", "", "", "");
//        g.geoCoding("Buskirk,US-NY", "", "", "");
//        g.geoCoding("aaaaaaaaa,aaaaaaa", "aaaaaaaa", "aaaaaaa", "aaaaaaaa");
//        g.geoCoding("Eastern,NY");
//        g.geoCoding("Buskirk,US-NY");

        // state Puerto Rico
        // city Puerto
//        g.geoCoding("", "", "", "00602");
//        g.geoCoding("", "Puerto", "Puerto Rico", "");
//        g.geoCoding("", "Puerto", "PR", "");
//        g.geoCoding("", "Puerto", "PR-PR", "");
//        g.geoCoding("PR-PR", "", "", "");
//        g.geoCoding("", "", "Puerto", "");
//        g.geoCoding("", "", "Puerto Rico", "");
//        g.geoCoding("", "ShangHai", "New York", "");
        int i = Address.length - 1;
        g.geoCoding(Address[i], City[i], State[i], "");  //26.3202524,-98.1917639
    }


    public static final String[] Address = new String[]{
            "5327 N Saint Louis Ave", "PO Box 2271", "611 N Rockford Ave",
            "2720 S Crowell St", "128 E 51st St", "1569 Childers Rd",
            "802 Stephanie Ln", "10711 S Sangamon St", "1409 S Second Ave",
            "37 Fernwood Rd", "208 23rd Ave", "2723 Earle Ave ",
            "8483 Indian Trail Rd", "135 Ilene St", "4101 Cornwallis Dr ",
            "635 Clyde Ave", "117 Brittany Dr N", "335 Coosa St ",
            "1292 Ortiz Ct", "124 Julie St", "9713 Westfield Pl",
            "801 S University Blvd", "14011 Ash Ave", "236 Pinehill Cir",
            "5053 Falling Creek Ln", "2716 Sunrise St ", "7761 Blackthorn Dr ",
            "1016 Morrison Ave ", "17 N Main St", "6248 N 104th St",
            "222 E Sycamore St ", "5102 Denview Way ", "E9157 Blueberry Rd",
            "10002 Saint Vincent Cir ", "1178 County Road 39",
            "3089 Florence Ave ", "2700 Mizell Ave ", "110 Spicewood Ct",
            "650 Main St, Ste 2 ", "3001 Avon St ", "1232 Carmelita Dr ",
            "5 Calvert St ", "2150 Grass Valley Hwy", "1125 Riley St ",
            "4933 Manderson St ", "49 Avenel Pl", "4029 Trenton St",
            "10010 Hulda Ave ", "1370 Powell Rd ", "1301 N McColl Rd "};

    public static final String[] City = new String[]{"Chicago", "Danville",
            "Rockford", "Chicago", "Chicago", "Marion", "Winnebago", "Chicago",
            "Morton", "Montgomery", "Bellwood", "Rosemead", "Ashley",
            "Rainbow City", "Virginia Beach", "Mountain View", "Elmore",
            "Montgomery", "Sunnyvale", "Russellville", "Birmingham", "Mobile",
            "Flushing", "Laceys Spring", "Birmingham", "Yorktown Heights",
            "Indianapolis", "Troy", "Glen Ellyn", "Milwaukee",
            "Columbus Grove", "Baltimore", "New London", "Cypress", "Linden",
            "San Jose", "Fernandina Beach", "Atlanta", "Grand Junction",
            "Midland", "Sierra Vista", "Pittston", "Auburn", "Folsom", "Omaha",
            "Fort Thomas", "Detroit", "Cleveland", "Brookhaven", "Edinburg"};

    public static final String[] State = new String[]{"IL", "IL", "IL", "IL",
            "IL", "IL", "IL", "IL", "IL", "IL", "IL", "CA", "IL", "AL", "VA",
            "CA", "AL", "AL", "CA", "AL", "AL", "AL", "NY", "AL", "AL", "NY",
            "IN", "NY", "IL", "WI", "OH", "MD", "WI", "CA", "AL", "CA", "FL",
            "GA", "CO", "MI", "AZ", "PA", "CA", "CA", "NE", "KY", "MI", "OH",
            "PA", "TX"};

    public static final String[] Zip = new String[]{"99504-4196",
            "35215-1324", "35215-4644", "35204-3133", "99501-4819",
            "99505-1113", "99669-7625", "99504-1168", "99801-1957",
            "99703-1310", "99801-1993", "35215-5256", "36040-2035",
            "99503-1947", "99505-8104", "94002-3624", "95928-6407",
            "35541-4560", "35214-1328", "99705-6319", "36502-8006",
            "99516-2411", "99703-8714", "99516-7520", "99503-6629",
            "99709-4014", "35010-7756", "36507-4615", "35214-3009",
            "99517-1405", "99577-7309", "99504-4219", "99824-5337",
            "99508-3116", "99645-9331", "36502-6826", "35023-2366",
            "99516-2764", "99654-2712", "99703-7304", "35016-1521",
            "99577-9452", "99577-6711", "99701-2730", "99703-1020",
            "99503-2545", "99801-9743", "72404-0585", "85331-8697",
            "35758-7897"};
}
