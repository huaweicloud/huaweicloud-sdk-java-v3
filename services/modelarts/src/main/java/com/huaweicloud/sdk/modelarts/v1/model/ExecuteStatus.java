package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：巡检项执行状态。 **取值范围**：   - RUNNING：执行中   - ABNORMAL：异常   - NORMAL：正常 
 */
public class ExecuteStatus {

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final ExecuteStatus RUNNING = new ExecuteStatus("RUNNING");

    /**
     * Enum ABNORMAL for value: "ABNORMAL"
     */
    public static final ExecuteStatus ABNORMAL = new ExecuteStatus("ABNORMAL");

    /**
     * Enum NORMAL for value: "NORMAL"
     */
    public static final ExecuteStatus NORMAL = new ExecuteStatus("NORMAL");

    private static final Map<String, ExecuteStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ExecuteStatus> createStaticFields() {
        Map<String, ExecuteStatus> map = new HashMap<>();
        map.put("RUNNING", RUNNING);
        map.put("ABNORMAL", ABNORMAL);
        map.put("NORMAL", NORMAL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ExecuteStatus(String value) {
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
    public static ExecuteStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ExecuteStatus(value));
    }

    public static ExecuteStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ExecuteStatus) {
            return this.value.equals(((ExecuteStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
