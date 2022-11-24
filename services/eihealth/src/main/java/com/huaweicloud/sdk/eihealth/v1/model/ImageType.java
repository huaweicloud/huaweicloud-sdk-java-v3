package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets ImageType
 */
public class ImageType {

    /**
     * Enum APP for value: "APP"
     */
    public static final ImageType APP = new ImageType("APP");

    /**
     * Enum NOTEBOOK for value: "NOTEBOOK"
     */
    public static final ImageType NOTEBOOK = new ImageType("NOTEBOOK");

    private static final Map<String, ImageType> STATIC_FIELDS = createStaticFields();

    private static Map<String, ImageType> createStaticFields() {
        Map<String, ImageType> map = new HashMap<>();
        map.put("APP", APP);
        map.put("NOTEBOOK", NOTEBOOK);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ImageType(String value) {
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
    public static ImageType fromValue(String value) {
        if (value == null) {
            return null;
        }
        ImageType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new ImageType(value);
        }
        return result;
    }

    public static ImageType valueOf(String value) {
        if (value == null) {
            return null;
        }
        ImageType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ImageType) {
            return this.value.equals(((ImageType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
