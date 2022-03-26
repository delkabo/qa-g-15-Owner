package com.delkabo.config;

import org.aeonbits.owner.Config;

import java.util.List;

public interface FruitsConfig extends Config {

    @Key("array")
    String[] getFruitsArray();

    @Key("array-with-default")
    @DefaultValue("orange,apple")
    String[] getFruitsArrayWithDefault();

    @Key("list")
    List<String> getFruitsList();

    @Separator(";")
    @Key("list-with-separator")
    List<String> getFruitsListWithSeparator();
}
