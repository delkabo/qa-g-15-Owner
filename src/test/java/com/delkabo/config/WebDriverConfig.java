package com.delkabo.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Key("false")
    @DefaultValue("false")
    boolean isRemote();

    @Key("remoteUrl")
    URL getRemoteUrl();


}
