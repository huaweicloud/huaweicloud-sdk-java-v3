package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 告警类型
 */
public class AlarmTypeEnum {

    /**
     * Enum EVENT_SYS for value: "EVENT.SYS"
     */
    public static final AlarmTypeEnum EVENT_SYS = new AlarmTypeEnum("EVENT.SYS");

    /**
     * Enum EVENT_CUSTOM for value: "EVENT.CUSTOM"
     */
    public static final AlarmTypeEnum EVENT_CUSTOM = new AlarmTypeEnum("EVENT.CUSTOM");

    /**
     * Enum ALL_INSTANCE for value: "ALL_INSTANCE"
     */
    public static final AlarmTypeEnum ALL_INSTANCE = new AlarmTypeEnum("ALL_INSTANCE");

    /**
     * Enum MULTI_INSTANCE for value: "MULTI_INSTANCE"
     */
    public static final AlarmTypeEnum MULTI_INSTANCE = new AlarmTypeEnum("MULTI_INSTANCE");

    /**
     * Enum RESOURCE_GROUP for value: "RESOURCE_GROUP"
     */
    public static final AlarmTypeEnum RESOURCE_GROUP = new AlarmTypeEnum("RESOURCE_GROUP");

    private static final Map<String, AlarmTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AlarmTypeEnum> createStaticFields() {
        Map<String, AlarmTypeEnum> map = new HashMap<>();
        map.put("EVENT.SYS", EVENT_SYS);
        map.put("EVENT.CUSTOM", EVENT_CUSTOM);
        map.put("ALL_INSTANCE", ALL_INSTANCE);
        map.put("MULTI_INSTANCE", MULTI_INSTANCE);
        map.put("RESOURCE_GROUP", RESOURCE_GROUP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AlarmTypeEnum(String value) {
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
    public static AlarmTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmTypeEnum(value));
    }

    public static AlarmTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlarmTypeEnum) {
            return this.value.equals(((AlarmTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
