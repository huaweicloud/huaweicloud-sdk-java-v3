package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 配额-资源类型 * GPU_INSTANCES：GPU资源实例数，单位个 * INSTANCES：普通实例数，单位个 * VOLUME_GIGABYTES：磁盘总容量，单位GB * VOLUMES：磁盘数量，单位个 * CORES：CPU数量，单位个 * MEMORY：内存容量，单位MB
 */
public class QuotaResourceTypeEnum {

    /**
     * Enum GPU_INSTANCES for value: "GPU_INSTANCES"
     */
    public static final QuotaResourceTypeEnum GPU_INSTANCES = new QuotaResourceTypeEnum("GPU_INSTANCES");

    /**
     * Enum INSTANCES for value: "INSTANCES"
     */
    public static final QuotaResourceTypeEnum INSTANCES = new QuotaResourceTypeEnum("INSTANCES");

    /**
     * Enum VOLUME_GIGABYTES for value: "VOLUME_GIGABYTES"
     */
    public static final QuotaResourceTypeEnum VOLUME_GIGABYTES = new QuotaResourceTypeEnum("VOLUME_GIGABYTES");

    /**
     * Enum VOLUMES for value: "VOLUMES"
     */
    public static final QuotaResourceTypeEnum VOLUMES = new QuotaResourceTypeEnum("VOLUMES");

    /**
     * Enum CORES for value: "CORES"
     */
    public static final QuotaResourceTypeEnum CORES = new QuotaResourceTypeEnum("CORES");

    /**
     * Enum MEMORY for value: "MEMORY"
     */
    public static final QuotaResourceTypeEnum MEMORY = new QuotaResourceTypeEnum("MEMORY");

    private static final Map<String, QuotaResourceTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, QuotaResourceTypeEnum> createStaticFields() {
        Map<String, QuotaResourceTypeEnum> map = new HashMap<>();
        map.put("GPU_INSTANCES", GPU_INSTANCES);
        map.put("INSTANCES", INSTANCES);
        map.put("VOLUME_GIGABYTES", VOLUME_GIGABYTES);
        map.put("VOLUMES", VOLUMES);
        map.put("CORES", CORES);
        map.put("MEMORY", MEMORY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    QuotaResourceTypeEnum(String value) {
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
    public static QuotaResourceTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QuotaResourceTypeEnum(value));
    }

    public static QuotaResourceTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof QuotaResourceTypeEnum) {
            return this.value.equals(((QuotaResourceTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
