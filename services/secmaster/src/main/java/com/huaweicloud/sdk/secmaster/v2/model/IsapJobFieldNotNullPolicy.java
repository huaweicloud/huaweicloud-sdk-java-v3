package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 参数解释: 作业表非空字段处理策略  LOOSE 宽松 STRICT 严格 约束限制 不涉及 取值范围:  LOOSE STRICT 默认值 LOOSE
 */
public class IsapJobFieldNotNullPolicy {

    /**
     * Enum LOOSE for value: "LOOSE"
     */
    public static final IsapJobFieldNotNullPolicy LOOSE = new IsapJobFieldNotNullPolicy("LOOSE");

    /**
     * Enum STRICT for value: "STRICT"
     */
    public static final IsapJobFieldNotNullPolicy STRICT = new IsapJobFieldNotNullPolicy("STRICT");

    private static final Map<String, IsapJobFieldNotNullPolicy> STATIC_FIELDS = createStaticFields();

    private static Map<String, IsapJobFieldNotNullPolicy> createStaticFields() {
        Map<String, IsapJobFieldNotNullPolicy> map = new HashMap<>();
        map.put("LOOSE", LOOSE);
        map.put("STRICT", STRICT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    IsapJobFieldNotNullPolicy(String value) {
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
    public static IsapJobFieldNotNullPolicy fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsapJobFieldNotNullPolicy(value));
    }

    public static IsapJobFieldNotNullPolicy valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IsapJobFieldNotNullPolicy) {
            return this.value.equals(((IsapJobFieldNotNullPolicy) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
