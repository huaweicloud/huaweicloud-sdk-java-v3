package com.huaweicloud.sdk.dataartsfabricep.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 运行状态PENDING, CREATING, RUNNING, UPDATING, SUCCEEDED, FAILED, STOPPING, STOPPED, DELETING, DELETED
 */
public class StatusEnum {

    /**
     * Enum PENDING for value: "PENDING"
     */
    public static final StatusEnum PENDING = new StatusEnum("PENDING");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final StatusEnum CREATING = new StatusEnum("CREATING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final StatusEnum UPDATING = new StatusEnum("UPDATING");

    /**
     * Enum SUCCEEDED for value: "SUCCEEDED"
     */
    public static final StatusEnum SUCCEEDED = new StatusEnum("SUCCEEDED");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final StatusEnum FAILED = new StatusEnum("FAILED");

    /**
     * Enum STOPPING for value: "STOPPING"
     */
    public static final StatusEnum STOPPING = new StatusEnum("STOPPING");

    /**
     * Enum STOPPED for value: "STOPPED"
     */
    public static final StatusEnum STOPPED = new StatusEnum("STOPPED");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final StatusEnum DELETING = new StatusEnum("DELETING");

    /**
     * Enum DELETED for value: "DELETED"
     */
    public static final StatusEnum DELETED = new StatusEnum("DELETED");

    private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, StatusEnum> createStaticFields() {
        Map<String, StatusEnum> map = new HashMap<>();
        map.put("PENDING", PENDING);
        map.put("CREATING", CREATING);
        map.put("RUNNING", RUNNING);
        map.put("UPDATING", UPDATING);
        map.put("SUCCEEDED", SUCCEEDED);
        map.put("FAILED", FAILED);
        map.put("STOPPING", STOPPING);
        map.put("STOPPED", STOPPED);
        map.put("DELETING", DELETING);
        map.put("DELETED", DELETED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
    }

    public static StatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof StatusEnum) {
            return this.value.equals(((StatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
