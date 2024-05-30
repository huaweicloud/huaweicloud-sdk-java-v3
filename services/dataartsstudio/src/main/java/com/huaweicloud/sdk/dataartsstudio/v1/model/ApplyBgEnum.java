package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 适用bg。
 */
public class ApplyBgEnum {

    /**
     * Enum CLOUD_BU for value: "CLOUD_BU"
     */
    public static final ApplyBgEnum CLOUD_BU = new ApplyBgEnum("CLOUD_BU");

    /**
     * Enum BG1 for value: "BG1"
     */
    public static final ApplyBgEnum BG1 = new ApplyBgEnum("BG1");

    /**
     * Enum BG2 for value: "BG2"
     */
    public static final ApplyBgEnum BG2 = new ApplyBgEnum("BG2");

    /**
     * Enum BG3 for value: "BG3"
     */
    public static final ApplyBgEnum BG3 = new ApplyBgEnum("BG3");

    private static final Map<String, ApplyBgEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, ApplyBgEnum> createStaticFields() {
        Map<String, ApplyBgEnum> map = new HashMap<>();
        map.put("CLOUD_BU", CLOUD_BU);
        map.put("BG1", BG1);
        map.put("BG2", BG2);
        map.put("BG3", BG3);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ApplyBgEnum(String value) {
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
    public static ApplyBgEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ApplyBgEnum(value));
    }

    public static ApplyBgEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ApplyBgEnum) {
            return this.value.equals(((ApplyBgEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
