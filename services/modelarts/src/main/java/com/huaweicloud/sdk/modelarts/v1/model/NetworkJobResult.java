package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：网络诊断作业结果。 **取值范围**：   - NORMAL：正常   - ERROR：异常
 */
public class NetworkJobResult {

    /**
     * Enum NORMAL for value: "NORMAL"
     */
    public static final NetworkJobResult NORMAL = new NetworkJobResult("NORMAL");

    /**
     * Enum ERROR for value: "ERROR"
     */
    public static final NetworkJobResult ERROR = new NetworkJobResult("ERROR");

    private static final Map<String, NetworkJobResult> STATIC_FIELDS = createStaticFields();

    private static Map<String, NetworkJobResult> createStaticFields() {
        Map<String, NetworkJobResult> map = new HashMap<>();
        map.put("NORMAL", NORMAL);
        map.put("ERROR", ERROR);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NetworkJobResult(String value) {
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
    public static NetworkJobResult fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkJobResult(value));
    }

    public static NetworkJobResult valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NetworkJobResult) {
            return this.value.equals(((NetworkJobResult) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
