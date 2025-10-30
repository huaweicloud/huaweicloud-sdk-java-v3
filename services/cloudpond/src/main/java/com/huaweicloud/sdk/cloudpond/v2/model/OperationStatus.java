package com.huaweicloud.sdk.cloudpond.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 运维状态说明： - FREEZE - 已冻结
 */
public class OperationStatus {

    /**
     * Enum FREEZE for value: "FREEZE"
     */
    public static final OperationStatus FREEZE = new OperationStatus("FREEZE");

    private static final Map<String, OperationStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, OperationStatus> createStaticFields() {
        Map<String, OperationStatus> map = new HashMap<>();
        map.put("FREEZE", FREEZE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    OperationStatus(String value) {
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
    public static OperationStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperationStatus(value));
    }

    public static OperationStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OperationStatus) {
            return this.value.equals(((OperationStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
