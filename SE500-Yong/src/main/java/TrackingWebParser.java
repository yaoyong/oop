import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

/**
 * Created by Administrator on 2016/4/17 0017.
 */
public class TrackingWebParser {
    public static void main(String[] args) throws IOException {
        String url = "https://tools.usps.com/go/TrackConfirmAction.action?tRef=fullpage&tLc=1&text28777=&tLabels=9200199999977453249942%2C";
        Connection connect = Jsoup.connect(url);
        connect.header("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.97 Safari/537.36");
        Document document = connect.followRedirects(true).get();
        PackageTracking packageTracking = new PackageTracking();//  packageTracking.tracking_status
        String status  = document.select("#results-multi > div.panel.tracking-result.result-delivered.result-open > div > div.tracking-summary > div.tracking-progress.status-delivered > div.progress-indicator > h2").text();
        String datedetail = document.select("#tc-hits > tbody > tr.detail-wrapper.latest-detail > td.date-time > p").text();
//    System.out.println(packageTracking.carrier);
//        System.out.println(packageTracking.tracking_status.status);
        System.out.println(status);
        System.out.println(datedetail);
    }
}
