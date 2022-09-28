package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets FeatureEnum
 */
public class FeatureEnum {

    /**
     * Enum TOOL for value: "TOOL"
     */
    public static final FeatureEnum TOOL = new FeatureEnum("TOOL");

    private static final Map<String, FeatureEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, FeatureEnum> createStaticFields() {
        Map<String, FeatureEnum> map = new HashMap<>();
        map.put("TOOL", TOOL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FeatureEnum(String value) {
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
    public static FeatureEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        FeatureEnum result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new FeatureEnum(value);
        }
        return result;
    }

    public static FeatureEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        FeatureEnum result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FeatureEnum) {
            return this.value.equals(((FeatureEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
