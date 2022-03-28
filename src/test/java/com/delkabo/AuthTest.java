package com.delkabo;

import com.delkabo.config.AuthConfig;
import jdk.jfr.Description;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthTest {

    Path props = Paths.get("C:/Users/delkabo/Desktop/auth2.properties");

//    @BeforeEach
//    public void clearFile() throws Exception {
//        Files.deleteIfExists(props);
//    }

    @Test
    public void testLocalFile() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("kamil");
        assertThat(config.passsword()).isEqualTo("1234512345");
    }

    @Test
    public void testRemoteFile() throws Exception{
        String content = "username=super-admin\npassword=super-pass";
        Files.write(props, content.getBytes());
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        assertThat(config.username()).isEqualTo("super-admin");
        assertThat(config.passsword()).isEqualTo("super-pass");
    }

    @Test
    @Description("Проверка чтения настроек из файла на копьютере или из resources")
    public void testRemoteFile2() throws Exception{
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());

//        String content = "username=super-admin\npassword=super-pass";
//        Files.write(props, content.getBytes());
        System.out.println(config.username() + "\n" + config.passsword());
        assertThat(config.username()).isEqualTo("super-admin");
        assertThat(config.passsword()).isEqualTo("super-pass");
    }
}
