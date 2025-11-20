package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 发送通知的方式。  - 1: 短信  - 2: 企业微信  - 3: 钉钉  - 4: 飞书  - 5: 电话 
 */
public class NotificationMode {

    /**
     * Enum _1 for value: "1"
     */
    public static final NotificationMode _1 = new NotificationMode("1");

    /**
     * Enum _2 for value: "2"
     */
    public static final NotificationMode _2 = new NotificationMode("2");

    /**
     * Enum _3 for value: "3"
     */
    public static final NotificationMode _3 = new NotificationMode("3");

    /**
     * Enum _4 for value: "4"
     */
    public static final NotificationMode _4 = new NotificationMode("4");

    /**
     * Enum _5 for value: "5"
     */
    public static final NotificationMode _5 = new NotificationMode("5");

    private static final Map<String, NotificationMode> STATIC_FIELDS = createStaticFields();

    private static Map<String, NotificationMode> createStaticFields() {
        Map<String, NotificationMode> map = new HashMap<>();
        map.put("1", _1);
        map.put("2", _2);
        map.put("3", _3);
        map.put("4", _4);
        map.put("5", _5);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NotificationMode(String value) {
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
    public static NotificationMode fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NotificationMode(value));
    }

    public static NotificationMode valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NotificationMode) {
            return this.value.equals(((NotificationMode) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
