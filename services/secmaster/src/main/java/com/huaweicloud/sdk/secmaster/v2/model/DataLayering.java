package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 数据分层 - ODS 操作数据存储层 - DWS 数据汇总层 - ADS 应用数据服务层  **约束限制** 不涉及 **取值范围**: - ODS - DWS - ADS  **默认值** 不涉及     
 */
public class DataLayering {

    /**
     * Enum ODS for value: "ODS"
     */
    public static final DataLayering ODS = new DataLayering("ODS");

    /**
     * Enum DWS for value: "DWS"
     */
    public static final DataLayering DWS = new DataLayering("DWS");

    /**
     * Enum ADS for value: "ADS"
     */
    public static final DataLayering ADS = new DataLayering("ADS");

    private static final Map<String, DataLayering> STATIC_FIELDS = createStaticFields();

    private static Map<String, DataLayering> createStaticFields() {
        Map<String, DataLayering> map = new HashMap<>();
        map.put("ODS", ODS);
        map.put("DWS", DWS);
        map.put("ADS", ADS);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DataLayering(String value) {
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
    public static DataLayering fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataLayering(value));
    }

    public static DataLayering valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DataLayering) {
            return this.value.equals(((DataLayering) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
