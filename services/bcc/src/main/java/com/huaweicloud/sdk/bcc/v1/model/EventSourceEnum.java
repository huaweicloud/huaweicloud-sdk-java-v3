package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 事件来源，取值范围：SYS.CBR,SYS.RDS,SYS.GaussDB
 */
public class EventSourceEnum {

    /**
     * Enum SYS_CBR for value: "SYS.CBR"
     */
    public static final EventSourceEnum SYS_CBR = new EventSourceEnum("SYS.CBR");

    /**
     * Enum SYS_RDS for value: "SYS.RDS"
     */
    public static final EventSourceEnum SYS_RDS = new EventSourceEnum("SYS.RDS");

    /**
     * Enum SYS_GAUSSDB for value: "SYS.GaussDB"
     */
    public static final EventSourceEnum SYS_GAUSSDB = new EventSourceEnum("SYS.GaussDB");

    private static final Map<String, EventSourceEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, EventSourceEnum> createStaticFields() {
        Map<String, EventSourceEnum> map = new HashMap<>();
        map.put("SYS.CBR", SYS_CBR);
        map.put("SYS.RDS", SYS_RDS);
        map.put("SYS.GaussDB", SYS_GAUSSDB);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    EventSourceEnum(String value) {
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
    public static EventSourceEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventSourceEnum(value));
    }

    public static EventSourceEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof EventSourceEnum) {
            return this.value.equals(((EventSourceEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
