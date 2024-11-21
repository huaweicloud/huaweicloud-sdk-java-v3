package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 受体的数据源：用户私有数据中心、承载租户公共数据（含样例/公共库）。
 */
public class ClusteringFileSource {

    /**
     * Enum PRIVATE for value: "PRIVATE"
     */
    public static final ClusteringFileSource PRIVATE = new ClusteringFileSource("PRIVATE");

    /**
     * Enum PUBLIC for value: "PUBLIC"
     */
    public static final ClusteringFileSource PUBLIC = new ClusteringFileSource("PUBLIC");

    /**
     * Enum RAW for value: "RAW"
     */
    public static final ClusteringFileSource RAW = new ClusteringFileSource("RAW");

    private static final Map<String, ClusteringFileSource> STATIC_FIELDS = createStaticFields();

    private static Map<String, ClusteringFileSource> createStaticFields() {
        Map<String, ClusteringFileSource> map = new HashMap<>();
        map.put("PRIVATE", PRIVATE);
        map.put("PUBLIC", PUBLIC);
        map.put("RAW", RAW);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ClusteringFileSource(String value) {
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
    public static ClusteringFileSource fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClusteringFileSource(value));
    }

    public static ClusteringFileSource valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ClusteringFileSource) {
            return this.value.equals(((ClusteringFileSource) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
