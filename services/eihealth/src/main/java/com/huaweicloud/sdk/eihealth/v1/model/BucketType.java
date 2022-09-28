package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets BucketType
 */
public class BucketType {

    /**
     * Enum OBJECT for value: "OBJECT"
     */
    public static final BucketType OBJECT = new BucketType("OBJECT");

    /**
     * Enum PFS for value: "PFS"
     */
    public static final BucketType PFS = new BucketType("PFS");

    private static final Map<String, BucketType> STATIC_FIELDS = createStaticFields();

    private static Map<String, BucketType> createStaticFields() {
        Map<String, BucketType> map = new HashMap<>();
        map.put("OBJECT", OBJECT);
        map.put("PFS", PFS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    BucketType(String value) {
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
    public static BucketType fromValue(String value) {
        if (value == null) {
            return null;
        }
        BucketType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new BucketType(value);
        }
        return result;
    }

    public static BucketType valueOf(String value) {
        if (value == null) {
            return null;
        }
        BucketType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BucketType) {
            return this.value.equals(((BucketType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
