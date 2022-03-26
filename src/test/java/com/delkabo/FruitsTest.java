package com.delkabo;

import com.delkabo.config.FruitsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FruitsTest {

    @Test
    public void testArray() {
        System.setProperty("array", "apple,orange,banana");

        FruitsConfig config = ConfigFactory
                .create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArray())
                .containsExactly("apple", "orange", "banana");
    }

    @Test
    public void testArrayWithDefault() {


        FruitsConfig config = ConfigFactory
                .create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsArrayWithDefault())
                .containsExactlyInAnyOrder("apple", "orange");
    }

    @Test
    public void testList() {
        System.setProperty("list", "apple,orange,banana");

        FruitsConfig config = ConfigFactory
                .create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsList())
                .containsExactly("apple", "orange", "banana");
    }

    @Test
    public void testListWithSeparator() {
        System.setProperty("list-with-separator", "apple;orange;banana");

        FruitsConfig config = ConfigFactory
                .create(FruitsConfig.class, System.getProperties());
        assertThat(config.getFruitsListWithSeparator())
                .containsExactly("apple", "orange", "banana");
    }
}
