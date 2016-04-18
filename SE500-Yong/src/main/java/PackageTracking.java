import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Date;
import java.util.List;
/**
 * Created by Administrator on 2016/4/17 0017.
 */
class PackageTracking {
    public class TrackingStatus
    {
        public String status_details;
        public Date status_date;
        public Location location;
        public String status;
    }
    public String carrier;
    public String tracking_number;
    public TrackingStatus tracking_status;
    public List<TrackingStatus> tracking_history;
}
