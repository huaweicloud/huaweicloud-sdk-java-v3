package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 插件类型 * WEATHER_QUERY：天气查询 * WEB_SEARCH：网络搜索
 */
public class PluginTypeEnum {

    /**
     * Enum WEATHER_QUERY for value: "WEATHER_QUERY"
     */
    public static final PluginTypeEnum WEATHER_QUERY = new PluginTypeEnum("WEATHER_QUERY");

    /**
     * Enum WEB_SEARCH for value: "WEB_SEARCH"
     */
    public static final PluginTypeEnum WEB_SEARCH = new PluginTypeEnum("WEB_SEARCH");

    private static final Map<String, PluginTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, PluginTypeEnum> createStaticFields() {
        Map<String, PluginTypeEnum> map = new HashMap<>();
        map.put("WEATHER_QUERY", WEATHER_QUERY);
        map.put("WEB_SEARCH", WEB_SEARCH);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PluginTypeEnum(String value) {
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
    public static PluginTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PluginTypeEnum(value));
    }

    public static PluginTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PluginTypeEnum) {
            return this.value.equals(((PluginTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
