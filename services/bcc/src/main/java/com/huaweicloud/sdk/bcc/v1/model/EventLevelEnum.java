package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件级别，取值范围：Critical,Major,Minor,Info
 */
public class EventLevelEnum {

    /**
     * Enum CRITICAL for value: "Critical"
     */
    public static final EventLevelEnum CRITICAL = new EventLevelEnum("Critical");

    /**
     * Enum MAJOR for value: "Major"
     */
    public static final EventLevelEnum MAJOR = new EventLevelEnum("Major");

    /**
     * Enum MINOR for value: "Minor"
     */
    public static final EventLevelEnum MINOR = new EventLevelEnum("Minor");

    /**
     * Enum INFO for value: "Info"
     */
    public static final EventLevelEnum INFO = new EventLevelEnum("Info");

    private static final Map<String, EventLevelEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, EventLevelEnum> createStaticFields() {
        Map<String, EventLevelEnum> map = new HashMap<>();
        map.put("Critical", CRITICAL);
        map.put("Major", MAJOR);
        map.put("Minor", MINOR);
        map.put("Info", INFO);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EventLevelEnum(String value) {
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
    public static EventLevelEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventLevelEnum(value));
    }

    public static EventLevelEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EventLevelEnum) {
            return this.value.equals(((EventLevelEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
