package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 任务类型枚举
 */
public class TaskTypeEnum {

    /**
     * Enum BACKUP for value: "backup"
     */
    public static final TaskTypeEnum BACKUP = new TaskTypeEnum("backup");

    /**
     * Enum REPLICATION for value: "replication"
     */
    public static final TaskTypeEnum REPLICATION = new TaskTypeEnum("replication");

    /**
     * Enum RESTORE for value: "restore"
     */
    public static final TaskTypeEnum RESTORE = new TaskTypeEnum("restore");

    /**
     * Enum DELETE for value: "delete"
     */
    public static final TaskTypeEnum DELETE = new TaskTypeEnum("delete");

    /**
     * Enum VAULT_DELETE for value: "vault_delete"
     */
    public static final TaskTypeEnum VAULT_DELETE = new TaskTypeEnum("vault_delete");

    /**
     * Enum REMOVE_RESOURCE for value: "remove_resource"
     */
    public static final TaskTypeEnum REMOVE_RESOURCE = new TaskTypeEnum("remove_resource");

    private static final Map<String, TaskTypeEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, TaskTypeEnum> createStaticFields() {
        Map<String, TaskTypeEnum> map = new HashMap<>();
        map.put("backup", BACKUP);
        map.put("replication", REPLICATION);
        map.put("restore", RESTORE);
        map.put("delete", DELETE);
        map.put("vault_delete", VAULT_DELETE);
        map.put("remove_resource", REMOVE_RESOURCE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TaskTypeEnum(String value) {
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
    public static TaskTypeEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskTypeEnum(value));
    }

    public static TaskTypeEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TaskTypeEnum) {
            return this.value.equals(((TaskTypeEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
