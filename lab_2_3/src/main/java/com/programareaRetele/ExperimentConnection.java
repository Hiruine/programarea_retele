package com.programareaRetele;


import io.netty.handler.codec.http.HttpHeaders;
import jdk.incubator.http.HttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.Request;

public class ExperimentConnection {

    HttpClient httpClient = HttpClient.newHttpClient();

    private HttpHeaders headers;
    private String link;


    public ExperimentConnection(HttpHeaders headers, String link) {
        this.headers = headers;
        this.link = link;
    }

    public Request createRequest() {

        return Dsl.get(link).setHeaders(headers).build();

    }

}
