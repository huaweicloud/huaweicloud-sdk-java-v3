package com.huaweicloud.sdk.ies.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 存储类型。 - SAS：高IO - SSD：超高IO
 */
public class StorageType {

    /**
     * Enum SAS for value: "SAS"
     */
    public static final StorageType SAS = new StorageType("SAS");

    /**
     * Enum SSD for value: "SSD"
     */
    public static final StorageType SSD = new StorageType("SSD");

    /**
     * Enum VS_SMALL_CAP for value: "VS_SMALL_CAP"
     */
    public static final StorageType VS_SMALL_CAP = new StorageType("VS_SMALL_CAP");

    /**
     * Enum VS_MEDIUM_CAP for value: "VS_MEDIUM_CAP"
     */
    public static final StorageType VS_MEDIUM_CAP = new StorageType("VS_MEDIUM_CAP");

    /**
     * Enum VS_LARGE_CAP for value: "VS_LARGE_CAP"
     */
    public static final StorageType VS_LARGE_CAP = new StorageType("VS_LARGE_CAP");

    private static final Map<String, StorageType> STATIC_FIELDS = createStaticFields();

    private static Map<String, StorageType> createStaticFields() {
        Map<String, StorageType> map = new HashMap<>();
        map.put("SAS", SAS);
        map.put("SSD", SSD);
        map.put("VS_SMALL_CAP", VS_SMALL_CAP);
        map.put("VS_MEDIUM_CAP", VS_MEDIUM_CAP);
        map.put("VS_LARGE_CAP", VS_LARGE_CAP);
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
        StorageType result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new StorageType(value);
        }
        return result;
    }

    public static StorageType valueOf(String value) {
        if (value == null) {
            return null;
        }
        StorageType result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
