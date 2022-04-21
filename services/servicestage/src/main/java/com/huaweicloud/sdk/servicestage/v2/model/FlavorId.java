package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 资源规格。
 */
public class FlavorId {

    /**
     * Enum MICRO_5G_0_5C_1G for value: "MICRO-5G:0.5C:1G"
     */
    public static final FlavorId MICRO_5G_0_5C_1G = new FlavorId("MICRO-5G:0.5C:1G");

    /**
     * Enum SMALL_10G_1_0C_2G for value: "SMALL-10G:1.0C:2G"
     */
    public static final FlavorId SMALL_10G_1_0C_2G = new FlavorId("SMALL-10G:1.0C:2G");

    /**
     * Enum STANDARD_30G_2_0C_4G for value: "STANDARD-30G:2.0C:4G"
     */
    public static final FlavorId STANDARD_30G_2_0C_4G = new FlavorId("STANDARD-30G:2.0C:4G");

    /**
     * Enum LARGE_50G_4_0C_8G for value: "LARGE-50G:4.0C:8G"
     */
    public static final FlavorId LARGE_50G_4_0C_8G = new FlavorId("LARGE-50G:4.0C:8G");

    /**
     * Enum XLARGE_100G_4_0C_16G for value: "XLARGE-100G:4.0C:16G"
     */
    public static final FlavorId XLARGE_100G_4_0C_16G = new FlavorId("XLARGE-100G:4.0C:16G");

    /**
     * Enum CUSTOM_XG_X_X_X_X for value: "CUSTOM-XG:X-X:X-X"
     */
    public static final FlavorId CUSTOM_XG_X_X_X_X = new FlavorId("CUSTOM-XG:X-X:X-X");

    private static final Map<String, FlavorId> STATIC_FIELDS = createStaticFields();

    private static Map<String, FlavorId> createStaticFields() {
        Map<String, FlavorId> map = new HashMap<>();
        map.put("MICRO-5G:0.5C:1G", MICRO_5G_0_5C_1G);
        map.put("SMALL-10G:1.0C:2G", SMALL_10G_1_0C_2G);
        map.put("STANDARD-30G:2.0C:4G", STANDARD_30G_2_0C_4G);
        map.put("LARGE-50G:4.0C:8G", LARGE_50G_4_0C_8G);
        map.put("XLARGE-100G:4.0C:16G", XLARGE_100G_4_0C_16G);
        map.put("CUSTOM-XG:X-X:X-X", CUSTOM_XG_X_X_X_X);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FlavorId(String value) {
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
    public static FlavorId fromValue(String value) {
        if (value == null) {
            return null;
        }
        FlavorId result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new FlavorId(value);
        }
        return result;
    }

    public static FlavorId valueOf(String value) {
        if (value == null) {
            return null;
        }
        FlavorId result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FlavorId) {
            return this.value.equals(((FlavorId) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
