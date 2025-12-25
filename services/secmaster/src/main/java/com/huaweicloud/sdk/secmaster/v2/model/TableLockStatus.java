package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 表锁状态 - LOCKED 已锁 - UNLOCKED 未锁  **约束限制** 不涉及 **取值范围**: - LOCKED - UNLOCKED  **默认值** 不涉及      
 */
public class TableLockStatus {

    /**
     * Enum LOCKED for value: "LOCKED"
     */
    public static final TableLockStatus LOCKED = new TableLockStatus("LOCKED");

    /**
     * Enum UNLOCKED for value: "UNLOCKED"
     */
    public static final TableLockStatus UNLOCKED = new TableLockStatus("UNLOCKED");

    private static final Map<String, TableLockStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, TableLockStatus> createStaticFields() {
        Map<String, TableLockStatus> map = new HashMap<>();
        map.put("LOCKED", LOCKED);
        map.put("UNLOCKED", UNLOCKED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TableLockStatus(String value) {
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
    public static TableLockStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableLockStatus(value));
    }

    public static TableLockStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TableLockStatus) {
            return this.value.equals(((TableLockStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
