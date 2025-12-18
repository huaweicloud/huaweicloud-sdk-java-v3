package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：巡检结果。 **取值范围**：   - ABNORMAL：异常   - NORMAL：正常 
 */
public class ResultStatus {

    /**
     * Enum ABNORMAL for value: "ABNORMAL"
     */
    public static final ResultStatus ABNORMAL = new ResultStatus("ABNORMAL");

    /**
     * Enum NORMAL for value: "NORMAL"
     */
    public static final ResultStatus NORMAL = new ResultStatus("NORMAL");

    private static final Map<String, ResultStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ResultStatus> createStaticFields() {
        Map<String, ResultStatus> map = new HashMap<>();
        map.put("ABNORMAL", ABNORMAL);
        map.put("NORMAL", NORMAL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    ResultStatus(String value) {
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
    public static ResultStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ResultStatus(value));
    }

    public static ResultStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ResultStatus) {
            return this.value.equals(((ResultStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
