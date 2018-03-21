import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class URLConnectionReader {


    public static void processInputURL(URL url) throws Exception {
        URLConnection yc = url.openConnection();

        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        conn.setRequestProperty("Accept", "text/csv");
        conn.setRequestProperty("x-api-key", "55193451-1409-4729-9cd4-7c65d63b8e76");


        BufferedReader in = new BufferedReader(new InputStreamReader(
                conn.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);


    }
}
