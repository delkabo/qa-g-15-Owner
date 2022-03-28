package com.delkabo.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "file:'C:/Users/delkabo/Desktop/auth2.properties'",
        "classpath:auth.properties"
})
public interface AuthConfig extends Config {

    @Key("username")
    String username();

    @Key("password")
    String passsword();
}
