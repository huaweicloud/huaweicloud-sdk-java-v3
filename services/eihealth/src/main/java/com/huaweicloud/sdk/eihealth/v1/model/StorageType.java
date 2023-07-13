package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets StorageType
 */
public class StorageType {

    /**
     * Enum STANDARD for value: "STANDARD"
     */
    public static final StorageType STANDARD = new StorageType("STANDARD");

    /**
     * Enum COLD for value: "COLD"
     */
    public static final StorageType COLD = new StorageType("COLD");

    private static final Map<String, StorageType> STATIC_FIELDS = createStaticFields();

    private static Map<String, StorageType> createStaticFields() {
        Map<String, StorageType> map = new HashMap<>();
        map.put("STANDARD", STANDARD);
        map.put("COLD", COLD);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    StorageType(String value) {
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
    public static StorageType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StorageType(value));
    }

    public static StorageType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StorageType) {
            return this.value.equals(((StorageType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
