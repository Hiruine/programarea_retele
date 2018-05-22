package com.programareaRetele;



import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class URLConnectionReader {

    private URL url;
    private String dateSince;
    private String dateTill;


    public URLConnectionReader(URL url, String dateSince, String dateTill) {
        this.url = url;
        this.dateSince = dateSince;
        this.dateTill = dateTill;

    }

    public URLConnectionReader(URL url) {
        this.url = url;
    }

    public void processInputURL() throws Exception {

        StringBuilder urlParams = new StringBuilder("?start=");
        urlParams.append(URLEncoder.encode(dateSince, "UTF-8"));
        urlParams.append("&end=");
        urlParams.append(URLEncoder.encode(dateTill, "UTF-8"));


        HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();


        connection.setRequestMethod("POST");
        connection.setRequestProperty("Accept", "text/csv");
//        connection.setRequestProperty("Content-Type", "text/csv");
        connection.setRequestProperty("x-api-key", "55193451-1409-4729-9cd4-7c65d63b8e76");


//        System.out.println(connection.getContentType());

        connection.setDoOutput(true);


        try (OutputStreamWriter outputStream = new OutputStreamWriter(connection.getOutputStream())) {
            outputStream.write(urlParams.toString());
        }


//        int responseCode = connection.getResponseCode();
//        System.out.println("Response Code : " + responseCode);


        try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine);
        }
    }
}
