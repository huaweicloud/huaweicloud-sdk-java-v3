package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 告警状态，取值范围：ok,alarm,invalid
 */
public class AlarmStatusEnum {

    /**
     * Enum OK for value: "ok"
     */
    public static final AlarmStatusEnum OK = new AlarmStatusEnum("ok");

    /**
     * Enum ALARM for value: "alarm"
     */
    public static final AlarmStatusEnum ALARM = new AlarmStatusEnum("alarm");

    /**
     * Enum INVALID for value: "invalid"
     */
    public static final AlarmStatusEnum INVALID = new AlarmStatusEnum("invalid");

    private static final Map<String, AlarmStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, AlarmStatusEnum> createStaticFields() {
        Map<String, AlarmStatusEnum> map = new HashMap<>();
        map.put("ok", OK);
        map.put("alarm", ALARM);
        map.put("invalid", INVALID);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AlarmStatusEnum(String value) {
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
    public static AlarmStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AlarmStatusEnum(value));
    }

    public static AlarmStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AlarmStatusEnum) {
            return this.value.equals(((AlarmStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
