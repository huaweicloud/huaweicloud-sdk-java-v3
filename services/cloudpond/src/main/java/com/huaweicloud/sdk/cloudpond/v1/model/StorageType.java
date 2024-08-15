package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 存储类型。 - SAS：高IO - SSD：超高IO - SAS_SD：高IO(软件定义型专用) - SSD_SD：超高IO(软件定义型专用) - SAS_ARM：高IO（鲲鹏） - SSD_ARM：超高IO（鲲鹏） [- VS_SMALL_CAP：视图存储-小容量型](tag:cmcc) [- VS_MEDIUM_CAP：视图存储-中容量型](tag:cmcc) [- VS_LARGE_CAP：视图存储-大容量型](tag:cmcc)
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
     * Enum SAS_SD for value: "SAS_SD"
     */
    public static final StorageType SAS_SD = new StorageType("SAS_SD");

    /**
     * Enum SSD_SD for value: "SSD_SD"
     */
    public static final StorageType SSD_SD = new StorageType("SSD_SD");

    /**
     * Enum SAS_ARM for value: "SAS_ARM"
     */
    public static final StorageType SAS_ARM = new StorageType("SAS_ARM");

    /**
     * Enum SSD_ARM for value: "SSD_ARM"
     */
    public static final StorageType SSD_ARM = new StorageType("SSD_ARM");

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
        map.put("SAS_SD", SAS_SD);
        map.put("SSD_SD", SSD_SD);
        map.put("SAS_ARM", SAS_ARM);
        map.put("SSD_ARM", SSD_ARM);
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
