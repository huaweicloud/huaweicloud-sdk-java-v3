package com.huaweicloud.sdk.core;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.function.Consumer;


public interface CustomizationConfigure {

    // 自定义Json工具
    void configJson(Consumer<ObjectMapper> func);

}
