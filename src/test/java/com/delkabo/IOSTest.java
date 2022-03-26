package com.delkabo;

import com.delkabo.config.IOSConfig;
import com.delkabo.config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class IOSTest {

    @Test
    public void testIPhone() {
        IOSConfig config = ConfigFactory
                .create(IOSConfig.class, System.getProperties());
        assertThat(config.deviceName()).isEqualTo("IPhone Last");
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("11");

    }
}
