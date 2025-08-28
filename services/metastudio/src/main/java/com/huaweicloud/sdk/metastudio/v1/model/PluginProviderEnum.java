package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 插件供应商 * AMAP_WEATHER：高德天气 * BOCHA：博查
 */
public class PluginProviderEnum {

    /**
     * Enum AMAP_WEATHER for value: "AMAP_WEATHER"
     */
    public static final PluginProviderEnum AMAP_WEATHER = new PluginProviderEnum("AMAP_WEATHER");

    /**
     * Enum BOCHA for value: "BOCHA"
     */
    public static final PluginProviderEnum BOCHA = new PluginProviderEnum("BOCHA");

    private static final Map<String, PluginProviderEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, PluginProviderEnum> createStaticFields() {
        Map<String, PluginProviderEnum> map = new HashMap<>();
        map.put("AMAP_WEATHER", AMAP_WEATHER);
        map.put("BOCHA", BOCHA);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PluginProviderEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static PluginProviderEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PluginProviderEnum(value));
    }

    public static PluginProviderEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PluginProviderEnum) {
            return this.value.equals(((PluginProviderEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
