package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：Savepoint触发类型枚举。 **取值范围**：固定值USER_REQUEST，表示由用户手动生成。 
 */
public class FlinkSavepointTriggerType {

    /**
     * Enum USER_REQUEST for value: "USER_REQUEST"
     */
    public static final FlinkSavepointTriggerType USER_REQUEST = new FlinkSavepointTriggerType("USER_REQUEST");

    private static final Map<String, FlinkSavepointTriggerType> STATIC_FIELDS = createStaticFields();

    private static Map<String, FlinkSavepointTriggerType> createStaticFields() {
        Map<String, FlinkSavepointTriggerType> map = new HashMap<>();
        map.put("USER_REQUEST", USER_REQUEST);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FlinkSavepointTriggerType(String value) {
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
    public static FlinkSavepointTriggerType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FlinkSavepointTriggerType(value));
    }

    public static FlinkSavepointTriggerType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FlinkSavepointTriggerType) {
            return this.value.equals(((FlinkSavepointTriggerType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
