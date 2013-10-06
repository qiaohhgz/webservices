package lucene1;

import com.client.batch.v1.*;
import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.InputSource;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: JimQiao
 * Date: 4/12/13
 * Time: 10:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class MapQuestBatchTest {
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

    public static final String[] Latitude = new String[]{
            "41.875621", "40.125222", "42.271394", "41.875621", "41.875621", "37.714728",
            "42.325528", "41.875621", "40.612735", "39.205263", "41.88142", "34.067617",
            "33.061235", "33.940123", "36.852984", "38.00912", "36.855867", "40.854156",
            "37.36883", "34.462396", "33.570499", "39.092585", "40.76543", "34.534258",
            "33.570499", "41.270927", "39.76838", "42.728412", "41.877529", "43.034993",
            "40.919496", "39.284603", "44.392758", "33.818988", "41.62901", "37.34385",
            "30.652584", "33.749099", "39.059542", "31.923184", "31.56033", "41.325913",
            "38.88838", "38.674545", "41.258732", "39.078591", "42.348664", "41.487189",
            "39.869279", "26.25277"};
    public static final String[] Longitude = new String[]{
            "-87.624371", "-87.630461", "-89.093966", "-87.624371", "-87.624371", "-88.929619",
            "-89.149657", "-87.624371", "-89.459323", "-89.505713", "-87.883117", "-118.087976",
            "-91.486129", "-86.090408", "-75.977418", "-122.116837", "-121.401075", "-78.271103",
            "-122.03635", "-87.706238", "-86.765783", "-84.853229", "-73.817429", "-86.60416",
            "-86.765783", "-73.777634", "-86.158045", "-73.691785", "-88.067012", "-87.922497",
            "-84.05689", "-76.620472", "-88.739826", "-118.041337", "-80.156921", "-121.883135",
            "-81.438031", "-84.390185", "-108.587185", "-101.825585", "-110.336185", "-75.78936",
            "-121.108006", "-121.143917", "-95.937873", "-84.448536", "-83.056738", "-81.677869",
            "-75.382414", "-98.193678"};

    private final String key = "Fmjtd%7Cluub2q6b29%2C2l%3Do5-961l1w";
//    private final String key = "Dmjtd%7Cluu729ur21%2C7x%3Do5-5w1wq";
    private String url;

    @Test
    public void test1() throws Exception {
        url = "http://open.mapquestapi.com/geocoding/v1/batch?key=YOUR_KEY_HERE&outFormat=xml&callback=renderBatch" +
                "&location=York,PA" +
                "&location=Red Lion" +
                "&location=19036" +
                "&location=300 Granite Run Dr, Lancaster, PA";
    }

    @Test
    public void test2() throws Exception {
        url = "http://open.mapquestapi.com/geocoding/v1/address?key=YOUR_KEY_HERE&callback=renderGeocode&outFormat=xml" +
                "&location=Lancaster,PA";
    }

    @Test
    public void test4() throws Exception {
        int i = Address.length - 1;
        url = "http://open.mapquestapi.com/geocoding/v1/address?key=YOUR_KEY_HERE&callback=renderGeocode&outFormat=xml" +
                "&location=";
        String location = "{0} {1}";
        location = MessageFormat.format(location, City[i], State[i]);
        System.out.println("location = " + location);
        url += URLEncoder.encode(location, "UTF-8");
    }

    @Test
    public void test3() throws Exception {
        List<String> locations = new ArrayList<String>();
        locations.add("York,PA");
        locations.add("Red Lion");
        locations.add("19036");
        locations.add("300 Granite Run Dr, Lancaster, PA");

        url = "http://open.mapquestapi.com/geocoding/v1/batch?key=YOUR_KEY_HERE&outFormat=json&callback=renderBatch";
        for (String location : locations) {
            url += "&location=" + URLEncoder.encode(location, "UTF-8");
        }
        url = url.replaceAll("YOUR_KEY_HERE", key);
        System.out.println(url);
        String data = getData(url);
        System.out.println("data = " + data);

//        parserByXPath(locations.size(), data);
        isNotExecute();
    }

    @Test
    public void test5() throws Exception {
        try {
            List<String> locations = new ArrayList<String>();
            int length = Address.length;
//            length = 10;
            for (int i = 0; i < length; i++) {
                String location = MessageFormat.format("{0} {1}", City[i], State[i]);
                locations.add(location);
            }
            url = "http://open.mapquestapi.com/geocoding/v1/batch?key=YOUR_KEY_HERE&outFormat=xml&callback=renderBatch&maxResults=1";
            url = url.replaceAll("YOUR_KEY_HERE", key);
            for (String location : locations) {
                url += "&location=" + URLEncoder.encode(location, "UTF-8");
            }
            System.out.println(url);
            long begin = System.currentTimeMillis();
            String data = getData(url);
            long after = System.currentTimeMillis();
            System.out.println("after-begin = " + (after - begin));

            begin = System.currentTimeMillis();
//            List<GeoCoder> geoCoders = parserByJaxb(data);
            List<GeoCoder> geoCoders = parserByXPath(length, data);
            after = System.currentTimeMillis();
            System.out.println("after-begin = " + (after - begin));

            StringBuffer lats = new StringBuffer("public static final String[] Latitude = new String[]{\n");
            StringBuffer longs = new StringBuffer("public static final String[] Longitude = new String[]{\n");
            int c = 0;
            boolean start = true;
            for (GeoCoder geoCoder : geoCoders) {
                String latitude = geoCoder.getLatitude();
                String longitude = geoCoder.getLongitude();
                if (!start) {
                    lats.append(", ");
                    longs.append(", ");
                }
                lats.append("\"" + latitude + "\"");
                longs.append("\"" + longitude + "\"");
                if (++c == 5) {
                    c = 0;
                    lats.append("\n");
                    longs.append("\n");
                }
                start = false;
            }

            System.out.println(lats + "};");
            System.out.println(longs + "};");

        } catch (Exception e) {
            System.out.println(e.getClass().getName());
        } finally {
            isNotExecute();
        }

    }

    private List<GeoCoder> parserByJaxb(String data) throws Exception {
        List<GeoCoder> list = new ArrayList<GeoCoder>();
        JAXBContext ctx = JAXBContext.newInstance(Response.class);
        Object o = ctx.createUnmarshaller().unmarshal(new StringReader(data));
        assert o instanceof Response;
        Response response = (Response) o;
        List<Result> resultList = response.getResults().getResult();
        int size = resultList.size();
        System.out.println("size = " + size);
        assert size > 0;
        for (Result result : resultList) {
            Location location = result.getLocations().getLocation();
            list.add(build(location));
        }
        return list;
    }

    private GeoCoder build(Location location) {
        System.out.println("location = " + location);
        List<Object> data = location.getContent();
        GeoCoder geoCoder = new GeoCoder();
        if (data == null) {
            return geoCoder;
        }
        for (Object o : data) {
            if (o instanceof AdminArea5) {
                geoCoder.setCity(((AdminArea5) o).getValue());
            } else if (o instanceof AdminArea3) {
                geoCoder.setState(((AdminArea3) o).getValue());
            } else if (o instanceof AdminArea4) {
                geoCoder.setCountry(((AdminArea4) o).getValue());
            } else if (o instanceof LatLng) {
                geoCoder.setLatitude(((LatLng) o).getLat());
                geoCoder.setLongitude(((LatLng) o).getLng());
            } else if (o instanceof JAXBElement) {
                QName name = ((JAXBElement) o).getName();
                String value = ((JAXBElement) o).getValue().toString();
                System.out.println("value = " + value);
            }
        }
        return geoCoder;
    }

    private List<GeoCoder> parserByXPath(int size, String data) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        org.w3c.dom.Document doc = builder.parse(new InputSource(new StringReader(data)));

        String locationBaseExpression = "/response/results/result[1]/locations/location[1]/";

        List<GeoCoder> list = new ArrayList<GeoCoder>();
        for (int i = 1; i <= size; i++) {
            locationBaseExpression = "/response/results/result[" + i + "]/locations/location[1]/";
            GeoCoder geoCoder = new GeoCoder();

            String streetExpression = locationBaseExpression + "street[1]";
            geoCoder.setAddress(getContent(doc, streetExpression));

            String cityExp = locationBaseExpression + "*[@type='City'][1]";
            geoCoder.setCity(getContent(doc, cityExp));

            String stateExp = locationBaseExpression + "*[@type='State'][1]";
            String state = getContent(doc, stateExp);
            geoCoder.setState(state);

            String zipCodeExp = locationBaseExpression + "postalCode[1]";
            geoCoder.setZip(getContent(doc, zipCodeExp));

            String countryExp = locationBaseExpression + "*[@type='Country'][1]";
            geoCoder.setCountry(getContent(doc, countryExp));

            String latExp = locationBaseExpression + "latLng/lat[1]";
            geoCoder.setLatitude(getContent(doc, latExp));

            String lngExp = locationBaseExpression + "latLng/lng[1]";
            geoCoder.setLongitude(getContent(doc, lngExp));
            list.add(geoCoder);
        }
        return list;
    }

    private String getContent(org.w3c.dom.Document doc, String xpathExpression) throws Exception {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        XPathExpression expr = xpath.compile(xpathExpression);
        String value = (String) expr.evaluate(doc, XPathConstants.STRING);
        return value;
    }

    private void isNotExecute() {
        url = null;
    }

    private String marshall(Class c, Object o) {
        try {
            JAXBContext ctx = JAXBContext.newInstance(c);
            Marshaller m = ctx.createMarshaller();
            StringWriter writer = new StringWriter();
            m.marshal(o, writer);
            return writer.toString();
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private Object unmarshall(Class c, String xml) {
        try {
            JAXBContext ctx = JAXBContext.newInstance(c);
            Unmarshaller cu = ctx.createUnmarshaller();
            StringReader reader = new StringReader(xml);
            Object o = cu.unmarshal(reader);
            return o;
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Before
    public void applyProxy() {
        System.getProperties().put("http.proxySet", "true");
        System.getProperties().put("http.proxyHost", "172.20.230.5");
        System.getProperties().put("http.proxyPort", "3128");
        System.getProperties().put("https.proxySet", "true");
        System.getProperties().put("https.proxyHost", "172.20.230.5");
        System.getProperties().put("https.proxyPort", "3128");
    }

    @After
    public void execute() throws Exception {
        if (null != url) {
            url = url.replaceAll("YOUR_KEY_HERE", key);
            System.out.println("url = " + url);
            String html = getData(url);
            html = format(html);
            System.out.println(html);
        }
    }

    private String getData(String url) throws IOException {
        URLConnection connection = new URL(url).openConnection();
        InputStream is = connection.getInputStream();
        byte[] bs = new byte[1024];
        StringBuffer sb = new StringBuffer();
        for (int len = is.read(bs); len != -1; len = is.read(bs)) {
            sb.append(new String(bs, 0, len));
        }
        return sb.toString();
    }

    private String format(String str) {
        try {
            if (str == null) {
                return null;
            }
            SAXReader reader = new SAXReader();
//        注释：创建一个串的字符输入流
            StringReader in = new StringReader(str);
            Document doc = reader.read(in);
//        注释：创建输出格式
            OutputFormat formater = OutputFormat.createPrettyPrint();
//        注释：设置xml的输出编码
            formater.setEncoding("utf-8");
//        注释：创建输出(目标)
            StringWriter out = new StringWriter();
//        注释：创建输出流
            XMLWriter writer = new XMLWriter(out, formater);
//        注释：输出格式化的串到目标中，执行后。格式化后的串保存在out中。
            writer.write(doc);
//        注释：返回我们格式化后的结果
            return out.toString();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
