package com.delkabo.config;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class LegacyWebDriverConfig {

    public String getBaseURL() {
        String baseUrl = System.getProperty("baseUrl");
        if(Objects.isNull(baseUrl)) {
            baseUrl = "https:/github.com";
        }
        return baseUrl;
    }

    public boolean isRemote() {
        String isRemote = System.getProperty("isRemote");
        if(Objects.isNull(isRemote)){
            return false;
        }
        return Boolean.parseBoolean(isRemote);
    }

    public Browser getBrowser() {
        String browser = System.getProperty("browser");
        if (Objects.isNull(browser)) {
            return Browser.CHROME;
        }
        return Browser.valueOf(browser);
    }

    public URL getRemoteUrl() {
        String remoteUrl = System.getProperty("remoteUrl");
        if(Objects.isNull(remoteUrl)){
            return null;
        }
        try {
            return new URL(remoteUrl);
        } catch (MalformedURLException e) {
            return null;
        }
    }
}
