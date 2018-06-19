package com.programareaRetele;

import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpHeaders;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.Request;
import org.asynchttpclient.RequestBuilder;
import org.asynchttpclient.util.HttpConstants;

public class KamiClass {

    public static void main(String[] args) {
        String link = "https://evil-legacy-service.herokuapp.com/api/v101/categories/";

        AsyncHttpClient client = Dsl.asyncHttpClient();

        Request getRequest = Dsl.get(link)
                .addHeader("Accept", "text/csv")
                .addHeader("x-api-key", "55193451-1409-4729-9cd4-7c65d63b8e76")
                .build();
    }

}
