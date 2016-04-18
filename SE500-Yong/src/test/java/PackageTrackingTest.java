import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.ASMClassLoader;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2016/4/17 0017.
 */
public class PackageTrackingTest {
    @Test
    public void parseFromJson() throws IOException {
        // get the json code
        URL url = new URL("https://api.goshippo.com/v1/tracks/usps/9200199999977453249942");
        URLConnection con = url.openConnection();
        InputStream in = con.getInputStream();
        String encoding = con.getContentEncoding();
        encoding = encoding == null ? "UTF-8" : encoding;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        int len = 0;
        while ((len = in.read(buf)) != -1) {
            baos.write(buf, 0, len);
        }
        String body = new String(baos.toByteArray(), encoding);

        // parse the json code
        PackageTracking tracking = JSON.parseObject(body,PackageTracking.class);
        Assert.assertEquals(tracking.carrier,"usps");
        Assert.assertEquals(tracking.tracking_number,"9200199999977453249942");
        Assert.assertEquals(tracking.tracking_status.status,"DELIVERED");
        Assert.assertEquals(tracking.tracking_history.size(),6);

    }
}
