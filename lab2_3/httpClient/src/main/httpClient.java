package main;

import java.io.DataOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;


public class httpClient {
    public static void main(String[] arg) throws Exception {
        URL url = new URL("https://evil-legacy-service.herokuapp.com/api/v101/categories/");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty(("x-api-key", apiKey));

        Map<String, String> parameters = new HashMap<>();
        parameters.put("param1", "val");

        con.setDoOutput(true);
        DataOutputStream out = new DataOutputStream(con.getOutputStream());
        out.writeBytes(com.baeldung.http.ParameterStringBuilder.getParamsString(parameters));
        out.flush();
        out.close();

    }
}
