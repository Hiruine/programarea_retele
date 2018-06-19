package com.programareaRetele;

import com.sun.net.httpserver.Headers;

import java.net.URL;

public class Connection implements Runnable{

    private URL link;
    private Headers headers;

    public Connection(URL link, Headers headers) {
        this.link = link;
        this.headers = headers;
    }

    @Override
    public void run() {

    }

}
