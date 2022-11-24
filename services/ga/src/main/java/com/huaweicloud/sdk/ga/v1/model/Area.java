package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 地区，取值： - OUTOFCM：中国大陆以外 - CM：中国大陆
 */
public class Area {

    /**
     * Enum OUTOFCM for value: "OUTOFCM"
     */
    public static final Area OUTOFCM = new Area("OUTOFCM");

    /**
     * Enum CM for value: "CM"
     */
    public static final Area CM = new Area("CM");

    private static final Map<String, Area> STATIC_FIELDS = createStaticFields();

    private static Map<String, Area> createStaticFields() {
        Map<String, Area> map = new HashMap<>();
        map.put("OUTOFCM", OUTOFCM);
        map.put("CM", CM);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    Area(String value) {
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
    public static Area fromValue(String value) {
        if (value == null) {
            return null;
        }
        Area result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new Area(value);
        }
        return result;
    }

    public static Area valueOf(String value) {
        if (value == null) {
            return null;
        }
        Area result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Area) {
            return this.value.equals(((Area) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
