package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 表编辑类型 - MODIFIABLE 可任意修改态 - APPENDED 追加态 (原来的内容锁定，只可追加) - LOCKED 锁定态 (完全锁定，不可修改)  **约束限制** 不涉及 **取值范围**: - MODIFIABLE - APPENDED - LOCKED  **默认值** 不涉及
 */
public class TableEditType {

    /**
     * Enum MODIFIABLE for value: "MODIFIABLE"
     */
    public static final TableEditType MODIFIABLE = new TableEditType("MODIFIABLE");

    /**
     * Enum APPENDED for value: "APPENDED"
     */
    public static final TableEditType APPENDED = new TableEditType("APPENDED");

    /**
     * Enum LOCKED for value: "LOCKED"
     */
    public static final TableEditType LOCKED = new TableEditType("LOCKED");

    private static final Map<String, TableEditType> STATIC_FIELDS = createStaticFields();

    private static Map<String, TableEditType> createStaticFields() {
        Map<String, TableEditType> map = new HashMap<>();
        map.put("MODIFIABLE", MODIFIABLE);
        map.put("APPENDED", APPENDED);
        map.put("LOCKED", LOCKED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TableEditType(String value) {
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
    public static TableEditType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableEditType(value));
    }

    public static TableEditType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TableEditType) {
            return this.value.equals(((TableEditType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
