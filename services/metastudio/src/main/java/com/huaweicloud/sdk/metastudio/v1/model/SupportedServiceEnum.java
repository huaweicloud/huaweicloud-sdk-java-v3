package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 支持的业务类型。： * VIDEO_2D：分身数字人视频制作 * LIVE_2D：分身数字人直播 * CHAT_2D：分身数字人智能交互
 */
public class SupportedServiceEnum {

    /**
     * Enum VIDEO_2D for value: "VIDEO_2D"
     */
    public static final SupportedServiceEnum VIDEO_2D = new SupportedServiceEnum("VIDEO_2D");

    /**
     * Enum LIVE_2D for value: "LIVE_2D"
     */
    public static final SupportedServiceEnum LIVE_2D = new SupportedServiceEnum("LIVE_2D");

    /**
     * Enum CHAT_2D for value: "CHAT_2D"
     */
    public static final SupportedServiceEnum CHAT_2D = new SupportedServiceEnum("CHAT_2D");

    private static final Map<String, SupportedServiceEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SupportedServiceEnum> createStaticFields() {
        Map<String, SupportedServiceEnum> map = new HashMap<>();
        map.put("VIDEO_2D", VIDEO_2D);
        map.put("LIVE_2D", LIVE_2D);
        map.put("CHAT_2D", CHAT_2D);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SupportedServiceEnum(String value) {
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
    public static SupportedServiceEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SupportedServiceEnum(value));
    }

    public static SupportedServiceEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SupportedServiceEnum) {
            return this.value.equals(((SupportedServiceEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
