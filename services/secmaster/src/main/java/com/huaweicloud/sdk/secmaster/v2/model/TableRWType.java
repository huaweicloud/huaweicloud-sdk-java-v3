package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 表读写类型 - READ_ONLY 只读 - READ_WRITE 读写 - WRITE_ONLY 只写  **约束限制** 不涉及 **取值范围**: - READ_ONLY - READ_WRITE - WRITE_ONLY  **默认值** 不涉及       
 */
public class TableRWType {

    /**
     * Enum READ_ONLY for value: "READ_ONLY"
     */
    public static final TableRWType READ_ONLY = new TableRWType("READ_ONLY");

    /**
     * Enum READ_WRITE for value: "READ_WRITE"
     */
    public static final TableRWType READ_WRITE = new TableRWType("READ_WRITE");

    /**
     * Enum WRITE_ONLY for value: "WRITE_ONLY"
     */
    public static final TableRWType WRITE_ONLY = new TableRWType("WRITE_ONLY");

    private static final Map<String, TableRWType> STATIC_FIELDS = createStaticFields();

    private static Map<String, TableRWType> createStaticFields() {
        Map<String, TableRWType> map = new HashMap<>();
        map.put("READ_ONLY", READ_ONLY);
        map.put("READ_WRITE", READ_WRITE);
        map.put("WRITE_ONLY", WRITE_ONLY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TableRWType(String value) {
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
    public static TableRWType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableRWType(value));
    }

    public static TableRWType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TableRWType) {
            return this.value.equals(((TableRWType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
