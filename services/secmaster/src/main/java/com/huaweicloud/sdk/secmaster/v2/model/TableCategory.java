package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 表类别 - STREAMING 流式传输 - INDEX 索引 - APPLICATION 应用 - TENANT_OBS 租户对象存储 - LAKE 数据湖  **约束限制** 不涉及 **取值范围**: - STREAMING - INDEX - APPLICATION - TENANT_OBS - LAKE  **默认值** 不涉及      
 */
public class TableCategory {

    /**
     * Enum STREAMING for value: "STREAMING"
     */
    public static final TableCategory STREAMING = new TableCategory("STREAMING");

    /**
     * Enum INDEX for value: "INDEX"
     */
    public static final TableCategory INDEX = new TableCategory("INDEX");

    /**
     * Enum APPLICATION for value: "APPLICATION"
     */
    public static final TableCategory APPLICATION = new TableCategory("APPLICATION");

    /**
     * Enum TENANT_OBS for value: "TENANT_OBS"
     */
    public static final TableCategory TENANT_OBS = new TableCategory("TENANT_OBS");

    /**
     * Enum LAKE for value: "LAKE"
     */
    public static final TableCategory LAKE = new TableCategory("LAKE");

    private static final Map<String, TableCategory> STATIC_FIELDS = createStaticFields();

    private static Map<String, TableCategory> createStaticFields() {
        Map<String, TableCategory> map = new HashMap<>();
        map.put("STREAMING", STREAMING);
        map.put("INDEX", INDEX);
        map.put("APPLICATION", APPLICATION);
        map.put("TENANT_OBS", TENANT_OBS);
        map.put("LAKE", LAKE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TableCategory(String value) {
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
    public static TableCategory fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableCategory(value));
    }

    public static TableCategory valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TableCategory) {
            return this.value.equals(((TableCategory) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
