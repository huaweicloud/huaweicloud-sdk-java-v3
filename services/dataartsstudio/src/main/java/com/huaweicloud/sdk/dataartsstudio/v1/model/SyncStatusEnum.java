package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 限定类型
 */
public class SyncStatusEnum {

    /**
     * Enum NO_NEED for value: "NO_NEED"
     */
    public static final SyncStatusEnum NO_NEED = new SyncStatusEnum("NO_NEED");

    /**
     * Enum CREATE_SUCCESS for value: "CREATE_SUCCESS"
     */
    public static final SyncStatusEnum CREATE_SUCCESS = new SyncStatusEnum("CREATE_SUCCESS");

    /**
     * Enum CREATE_FAILED for value: "CREATE_FAILED"
     */
    public static final SyncStatusEnum CREATE_FAILED = new SyncStatusEnum("CREATE_FAILED");

    /**
     * Enum UPDATE_SUCCESS for value: "UPDATE_SUCCESS"
     */
    public static final SyncStatusEnum UPDATE_SUCCESS = new SyncStatusEnum("UPDATE_SUCCESS");

    /**
     * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
     */
    public static final SyncStatusEnum UPDATE_FAILED = new SyncStatusEnum("UPDATE_FAILED");

    /**
     * Enum SUMMARY_SUCCESS for value: "SUMMARY_SUCCESS"
     */
    public static final SyncStatusEnum SUMMARY_SUCCESS = new SyncStatusEnum("SUMMARY_SUCCESS");

    /**
     * Enum SUMMARY_FAILED for value: "SUMMARY_FAILED"
     */
    public static final SyncStatusEnum SUMMARY_FAILED = new SyncStatusEnum("SUMMARY_FAILED");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final SyncStatusEnum RUNNING = new SyncStatusEnum("RUNNING");

    /**
     * Enum OFFLINE for value: "OFFLINE"
     */
    public static final SyncStatusEnum OFFLINE = new SyncStatusEnum("OFFLINE");

    private static final Map<String, SyncStatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, SyncStatusEnum> createStaticFields() {
        Map<String, SyncStatusEnum> map = new HashMap<>();
        map.put("NO_NEED", NO_NEED);
        map.put("CREATE_SUCCESS", CREATE_SUCCESS);
        map.put("CREATE_FAILED", CREATE_FAILED);
        map.put("UPDATE_SUCCESS", UPDATE_SUCCESS);
        map.put("UPDATE_FAILED", UPDATE_FAILED);
        map.put("SUMMARY_SUCCESS", SUMMARY_SUCCESS);
        map.put("SUMMARY_FAILED", SUMMARY_FAILED);
        map.put("RUNNING", RUNNING);
        map.put("OFFLINE", OFFLINE);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    SyncStatusEnum(String value) {
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
    public static SyncStatusEnum fromValue(String value) {
        if (value == null) {
            return null;
        }
        SyncStatusEnum result = STATIC_FIELDS.get(value);
        if (result == null) {
            result = new SyncStatusEnum(value);
        }
        return result;
    }

    public static SyncStatusEnum valueOf(String value) {
        if (value == null) {
            return null;
        }
        SyncStatusEnum result = STATIC_FIELDS.get(value);
        if (result != null) {
            return result;
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SyncStatusEnum) {
            return this.value.equals(((SyncStatusEnum) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
