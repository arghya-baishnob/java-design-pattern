package com.ab.structural.proxy;

public class WebBrowserProxy implements WebPage {
    private WebPage webPage;

    public WebBrowserProxy() {
        this.webPage = new WebPageImpl();
    }

    @Override
    public void renderPage(String url) throws RuntimeException {
        if (url.equalsIgnoreCase("www.youtube.com")) {
            throw new RuntimeException(url + " is blocked by ISP !!!");
        } else {
            webPage.renderPage(url);
        }
    }
}
