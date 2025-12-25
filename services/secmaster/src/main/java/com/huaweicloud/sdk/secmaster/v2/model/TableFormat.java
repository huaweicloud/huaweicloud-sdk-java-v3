package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 表格式 - JSON Json格式 - DEBEZIUM_JSON Debezium JSON 格式 - CSV CSV格式 - PARQUET PARQUET格式 - ORC ORC格式  **约束限制** 不涉及 **取值范围**: - JSON - DEBEZIUM_JSON - CSV - PARQUET - ORC  **默认值** 不涉及  
 */
public class TableFormat {

    /**
     * Enum JSON for value: "JSON"
     */
    public static final TableFormat JSON = new TableFormat("JSON");

    /**
     * Enum DEBEZIUM_JSON for value: "DEBEZIUM_JSON"
     */
    public static final TableFormat DEBEZIUM_JSON = new TableFormat("DEBEZIUM_JSON");

    /**
     * Enum CSV for value: "CSV"
     */
    public static final TableFormat CSV = new TableFormat("CSV");

    /**
     * Enum PARQUET for value: "PARQUET"
     */
    public static final TableFormat PARQUET = new TableFormat("PARQUET");

    /**
     * Enum ORC for value: "ORC"
     */
    public static final TableFormat ORC = new TableFormat("ORC");

    private static final Map<String, TableFormat> STATIC_FIELDS = createStaticFields();

    private static Map<String, TableFormat> createStaticFields() {
        Map<String, TableFormat> map = new HashMap<>();
        map.put("JSON", JSON);
        map.put("DEBEZIUM_JSON", DEBEZIUM_JSON);
        map.put("CSV", CSV);
        map.put("PARQUET", PARQUET);
        map.put("ORC", ORC);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TableFormat(String value) {
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
    public static TableFormat fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableFormat(value));
    }

    public static TableFormat valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TableFormat) {
            return this.value.equals(((TableFormat) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
