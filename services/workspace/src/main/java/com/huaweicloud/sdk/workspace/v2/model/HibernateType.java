package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * ECS休眠类型 - SUSPEND: 带外冷休眠 - PAUSE: 带外热休眠
 */
public class HibernateType {

    /**
     * Enum SUSPEND for value: "SUSPEND"
     */
    public static final HibernateType SUSPEND = new HibernateType("SUSPEND");

    /**
     * Enum PAUSE for value: "PAUSE"
     */
    public static final HibernateType PAUSE = new HibernateType("PAUSE");

    private static final Map<String, HibernateType> STATIC_FIELDS = createStaticFields();

    private static Map<String, HibernateType> createStaticFields() {
        Map<String, HibernateType> map = new HashMap<>();
        map.put("SUSPEND", SUSPEND);
        map.put("PAUSE", PAUSE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    HibernateType(String value) {
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
    public static HibernateType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HibernateType(value));
    }

    public static HibernateType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HibernateType) {
            return this.value.equals(((HibernateType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
