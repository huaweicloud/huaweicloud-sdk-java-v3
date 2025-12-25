package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 目录类型 - STREAMING 实时流 - INDEX 索引 - APPLICATION 应用 - TENANT_BUCKET 租户桶 - LAKE 数据湖  **约束限制** 不涉及 **取值范围**: - STREAMING - INDEX - APPLICATION - TENANT_BUCKET - LAKE  **默认值** 不涉及     
 */
public class IsapTableCategory {

    /**
     * Enum STREAMING for value: "STREAMING"
     */
    public static final IsapTableCategory STREAMING = new IsapTableCategory("STREAMING");

    /**
     * Enum INDEX for value: "INDEX"
     */
    public static final IsapTableCategory INDEX = new IsapTableCategory("INDEX");

    /**
     * Enum APPLICATION for value: "APPLICATION"
     */
    public static final IsapTableCategory APPLICATION = new IsapTableCategory("APPLICATION");

    /**
     * Enum TENANT_BUCKET for value: "TENANT_BUCKET"
     */
    public static final IsapTableCategory TENANT_BUCKET = new IsapTableCategory("TENANT_BUCKET");

    /**
     * Enum LAKE for value: "LAKE"
     */
    public static final IsapTableCategory LAKE = new IsapTableCategory("LAKE");

    private static final Map<String, IsapTableCategory> STATIC_FIELDS = createStaticFields();

    private static Map<String, IsapTableCategory> createStaticFields() {
        Map<String, IsapTableCategory> map = new HashMap<>();
        map.put("STREAMING", STREAMING);
        map.put("INDEX", INDEX);
        map.put("APPLICATION", APPLICATION);
        map.put("TENANT_BUCKET", TENANT_BUCKET);
        map.put("LAKE", LAKE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    IsapTableCategory(String value) {
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
    public static IsapTableCategory fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsapTableCategory(value));
    }

    public static IsapTableCategory valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IsapTableCategory) {
            return this.value.equals(((IsapTableCategory) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
