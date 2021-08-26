package com.ab.structural.proxy;

public class ClientBrowser {
    public static void main(String[] args) {
        WebBrowserProxy webBrowserProxy = new WebBrowserProxy();
        try {
            webBrowserProxy.renderPage("www.youtube1.com");
        } catch (Exception e) {
            System.out.println("Exception Occurred !!");
            e.printStackTrace();
        }

    }
}
