package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 受体的数据源：外部网络数据（如RCSB在线数据库）、用户私有数据中心、承载租户公共数据（含样例/公共库）
 */
public class DrugFileSource {

    /**
     * Enum EXTRANET for value: "EXTRANET"
     */
    public static final DrugFileSource EXTRANET = new DrugFileSource("EXTRANET");

    /**
     * Enum PRIVATE for value: "PRIVATE"
     */
    public static final DrugFileSource PRIVATE = new DrugFileSource("PRIVATE");

    /**
     * Enum PUBLIC for value: "PUBLIC"
     */
    public static final DrugFileSource PUBLIC = new DrugFileSource("PUBLIC");

    /**
     * Enum RAW for value: "RAW"
     */
    public static final DrugFileSource RAW = new DrugFileSource("RAW");

    private static final Map<String, DrugFileSource> STATIC_FIELDS = createStaticFields();

    private static Map<String, DrugFileSource> createStaticFields() {
        Map<String, DrugFileSource> map = new HashMap<>();
        map.put("EXTRANET", EXTRANET);
        map.put("PRIVATE", PRIVATE);
        map.put("PUBLIC", PUBLIC);
        map.put("RAW", RAW);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DrugFileSource(String value) {
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
    public static DrugFileSource fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DrugFileSource(value));
    }

    public static DrugFileSource valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DrugFileSource) {
            return this.value.equals(((DrugFileSource) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
