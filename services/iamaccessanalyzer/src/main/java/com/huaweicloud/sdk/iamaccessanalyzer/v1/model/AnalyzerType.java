package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 分析器的类型。
 */
public class AnalyzerType {

    /**
     * Enum ACCOUNT for value: "account"
     */
    public static final AnalyzerType ACCOUNT = new AnalyzerType("account");

    private static final Map<String, AnalyzerType> STATIC_FIELDS = createStaticFields();

    private static Map<String, AnalyzerType> createStaticFields() {
        Map<String, AnalyzerType> map = new HashMap<>();
        map.put("account", ACCOUNT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AnalyzerType(String value) {
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
    public static AnalyzerType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AnalyzerType(value));
    }

    public static AnalyzerType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AnalyzerType) {
            return this.value.equals(((AnalyzerType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
