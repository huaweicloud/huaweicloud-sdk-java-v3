package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 拥有者类型 - SYSTEM 系统 - USER 用户 - SYSTEM_ALLOWED_DELETE 系统可删除 - USER_ALLOWED_DELETE 用户可删除  **约束限制** 不涉及 **取值范围**: - SYSTEM - USER - SYSTEM_ALLOWED_DELETE - USER_ALLOWED_DELETE  **默认值** 不涉及
 */
public class TableOwnerType {

    /**
     * Enum SYSTEM for value: "SYSTEM"
     */
    public static final TableOwnerType SYSTEM = new TableOwnerType("SYSTEM");

    /**
     * Enum USER for value: "USER"
     */
    public static final TableOwnerType USER = new TableOwnerType("USER");

    /**
     * Enum SYSTEM_ALLOWED_DELETE for value: "SYSTEM_ALLOWED_DELETE"
     */
    public static final TableOwnerType SYSTEM_ALLOWED_DELETE = new TableOwnerType("SYSTEM_ALLOWED_DELETE");

    /**
     * Enum USER_ALLOWED_DELETE for value: "USER_ALLOWED_DELETE"
     */
    public static final TableOwnerType USER_ALLOWED_DELETE = new TableOwnerType("USER_ALLOWED_DELETE");

    private static final Map<String, TableOwnerType> STATIC_FIELDS = createStaticFields();

    private static Map<String, TableOwnerType> createStaticFields() {
        Map<String, TableOwnerType> map = new HashMap<>();
        map.put("SYSTEM", SYSTEM);
        map.put("USER", USER);
        map.put("SYSTEM_ALLOWED_DELETE", SYSTEM_ALLOWED_DELETE);
        map.put("USER_ALLOWED_DELETE", USER_ALLOWED_DELETE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TableOwnerType(String value) {
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
    public static TableOwnerType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableOwnerType(value));
    }

    public static TableOwnerType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TableOwnerType) {
            return this.value.equals(((TableOwnerType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
