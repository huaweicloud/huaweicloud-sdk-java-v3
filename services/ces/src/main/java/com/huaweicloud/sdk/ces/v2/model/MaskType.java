package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 屏蔽类型。START_END_TIME：按起止时间屏蔽，FOREVER_TIME：永久时间屏蔽，CYCLE_TIME：按周期时间屏蔽。
 */
public class MaskType {

    /**
     * Enum START_END_TIME for value: "START_END_TIME"
     */
    public static final MaskType START_END_TIME = new MaskType("START_END_TIME");

    /**
     * Enum FOREVER_TIME for value: "FOREVER_TIME"
     */
    public static final MaskType FOREVER_TIME = new MaskType("FOREVER_TIME");

    /**
     * Enum CYCLE_TIME for value: "CYCLE_TIME"
     */
    public static final MaskType CYCLE_TIME = new MaskType("CYCLE_TIME");

    private static final Map<String, MaskType> STATIC_FIELDS = createStaticFields();

    private static Map<String, MaskType> createStaticFields() {
        Map<String, MaskType> map = new HashMap<>();
        map.put("START_END_TIME", START_END_TIME);
        map.put("FOREVER_TIME", FOREVER_TIME);
        map.put("CYCLE_TIME", CYCLE_TIME);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    MaskType(String value) {
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
    public static MaskType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MaskType(value));
    }

    public static MaskType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MaskType) {
            return this.value.equals(((MaskType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
