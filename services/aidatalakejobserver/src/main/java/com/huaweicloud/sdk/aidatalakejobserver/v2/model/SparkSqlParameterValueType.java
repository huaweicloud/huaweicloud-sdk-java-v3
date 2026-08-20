package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：占位符类型，用于标识占位符值的数据类型。 **约束限制**：不涉及。 **取值范围**：   - STRING：字符串类型。   - DECIMAL：定点数类型。   - INTEGER：整型类型。   - DATE：日期类型。   - TIMESTAMP：时间类型。 **默认取值**：STRING。 
 */
public class SparkSqlParameterValueType {

    /**
     * Enum STRING for value: "STRING"
     */
    public static final SparkSqlParameterValueType STRING = new SparkSqlParameterValueType("STRING");

    /**
     * Enum DECIMAL for value: "DECIMAL"
     */
    public static final SparkSqlParameterValueType DECIMAL = new SparkSqlParameterValueType("DECIMAL");

    /**
     * Enum INTEGER for value: "INTEGER"
     */
    public static final SparkSqlParameterValueType INTEGER = new SparkSqlParameterValueType("INTEGER");

    /**
     * Enum DATE for value: "DATE"
     */
    public static final SparkSqlParameterValueType DATE = new SparkSqlParameterValueType("DATE");

    /**
     * Enum TIMESTAMP for value: "TIMESTAMP"
     */
    public static final SparkSqlParameterValueType TIMESTAMP = new SparkSqlParameterValueType("TIMESTAMP");

    private static final Map<String, SparkSqlParameterValueType> STATIC_FIELDS = createStaticFields();

    private static Map<String, SparkSqlParameterValueType> createStaticFields() {
        Map<String, SparkSqlParameterValueType> map = new HashMap<>();
        map.put("STRING", STRING);
        map.put("DECIMAL", DECIMAL);
        map.put("INTEGER", INTEGER);
        map.put("DATE", DATE);
        map.put("TIMESTAMP", TIMESTAMP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SparkSqlParameterValueType(String value) {
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
    public static SparkSqlParameterValueType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SparkSqlParameterValueType(value));
    }

    public static SparkSqlParameterValueType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SparkSqlParameterValueType) {
            return this.value.equals(((SparkSqlParameterValueType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
