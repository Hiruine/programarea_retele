package com.programareaRetele;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class TestURLConnectionReader {



    @Test
    public void testIfConnectionReadsFromTheServer() {

        URL url = null;
        try {
            url = new URL("https://evil-legacy-service.herokuapp.com/api/v101/categories/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        URLConnectionReader link = new URLConnectionReader(url, "2003-05-11", "2007-09-11");
        try {
            link.processInputURL();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
