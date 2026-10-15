package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：Savepoint格式类型。 **约束限制**：不涉及。 **取值范围**：   - NATIVE：原生格式。   - CANONICAL：通用格式。 **默认取值**：NATIVE。 
 */
public class FlinkSavepointFormat {

    /**
     * Enum NATIVE for value: "NATIVE"
     */
    public static final FlinkSavepointFormat NATIVE = new FlinkSavepointFormat("NATIVE");

    /**
     * Enum CANONICAL for value: "CANONICAL"
     */
    public static final FlinkSavepointFormat CANONICAL = new FlinkSavepointFormat("CANONICAL");

    private static final Map<String, FlinkSavepointFormat> STATIC_FIELDS = createStaticFields();

    private static Map<String, FlinkSavepointFormat> createStaticFields() {
        Map<String, FlinkSavepointFormat> map = new HashMap<>();
        map.put("NATIVE", NATIVE);
        map.put("CANONICAL", CANONICAL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FlinkSavepointFormat(String value) {
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
    public static FlinkSavepointFormat fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlinkSavepointFormat(value));
    }

    public static FlinkSavepointFormat valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FlinkSavepointFormat) {
            return this.value.equals(((FlinkSavepointFormat) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
