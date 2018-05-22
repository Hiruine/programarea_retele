

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class URLConnectionReader {

    private URL url;
    private String dateSince;
    private String dateTill;


    public URLConnectionReader(URL url, String dateSince) {
        this.url = url;
        this.dateSince = dateSince;
        this.dateTill = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

    }

    public URLConnectionReader(URL url) {
        this.url = url;
    }

    public void processInputURL() throws Exception {
        URL url = new URL("https://evil-legacy-service.herokuapp.com/api/v101/orders/?start=2017-09-01&end=2017-10-03");

//        URLConnection yc = url.openConnection();

        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        conn.setRequestProperty("Accept", "text/csv");
        conn.setRequestProperty("x-api-key", "55193451-1409-4729-9cd4-7c65d63b8e76");


        //conn.setRequestProperty("start", dateSince);
        //conn.setRequestProperty("end", dateTill);


        BufferedReader in = new BufferedReader(new InputStreamReader(
                conn.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);


    }
}
