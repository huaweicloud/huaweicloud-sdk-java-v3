package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Gets or Sets DatabaseStatusEnum
 */
public class DatabaseStatusEnum {

    /**
     * Enum DEPLOYING for value: "DEPLOYING"
     */
    public static final DatabaseStatusEnum DEPLOYING = new DatabaseStatusEnum("DEPLOYING");

    /**
     * Enum NORMAL for value: "NORMAL"
     */
    public static final DatabaseStatusEnum NORMAL = new DatabaseStatusEnum("NORMAL");

    /**
     * Enum UPDATINTG for value: "UPDATINTG"
     */
    public static final DatabaseStatusEnum UPDATINTG = new DatabaseStatusEnum("UPDATINTG");

    /**
     * Enum ABNORMAL for value: "ABNORMAL"
     */
    public static final DatabaseStatusEnum ABNORMAL = new DatabaseStatusEnum("ABNORMAL");

    /**
     * Enum FREEZE for value: "FREEZE"
     */
    public static final DatabaseStatusEnum FREEZE = new DatabaseStatusEnum("FREEZE");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final DatabaseStatusEnum DELETING = new DatabaseStatusEnum("DELETING");

    private static final Map<String, DatabaseStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, DatabaseStatusEnum> createStaticFields() {
        Map<String, DatabaseStatusEnum> map = new HashMap<>();
        map.put("DEPLOYING", DEPLOYING);
        map.put("NORMAL", NORMAL);
        map.put("UPDATINTG", UPDATINTG);
        map.put("ABNORMAL", ABNORMAL);
        map.put("FREEZE", FREEZE);
        map.put("DELETING", DELETING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    DatabaseStatusEnum(String value) {
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
    public static DatabaseStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        DatabaseStatusEnum result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new DatabaseStatusEnum(value);
        }
        return result;
    }

    public static DatabaseStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        DatabaseStatusEnum result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DatabaseStatusEnum) {
            return this.value.equals(((DatabaseStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
