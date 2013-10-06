package lucene1;

import org.htmlparser.Parser;
import org.htmlparser.filters.CssSelectorNodeFilter;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;
import java.net.URLConnection;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void test1() throws Exception {
        final String url = "http://www.zip-area.com/";
        URLConnection connection = new URL(url).openConnection();
        Parser parser = new Parser(connection);
        System.out.println("open connection");
        CssSelectorNodeFilter filter = new CssSelectorNodeFilter("");
        parser.parse(filter);
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
}
