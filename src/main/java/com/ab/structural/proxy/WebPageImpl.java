package com.ab.structural.proxy;

public class WebPageImpl implements WebPage {
    @Override
    public void renderPage(String url) throws RuntimeException {
        System.out.println(url + " rendered successfully ...");
    }
}
