package com.delkabo.config;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface TypeConfig extends Config {

    @Key("integer")
    Integer getInteger();

    @Key("double")
    Double getDouble();

    @Key("boolean")
    Boolean getBoolean();

    @Key("enum")
    Browser getEnum();

    @Key("url")
    URL getUrl();
}
