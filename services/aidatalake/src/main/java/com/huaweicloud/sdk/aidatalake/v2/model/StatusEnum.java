package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：运行状态。 **约束限制**：不涉及。 **取值范围**：   - QUEUED：排队中。   - PENDING：待处理。   - RUNNING：运行中。   - CANCELING：取消中。   - CANCELED：已取消。   - FAILED：失败。   - QUEUED_TIMEOUT：排队超时。   - RUNNING_TIMEOUT：运行超时。   - SUCCEEDED：成功 **默认取值**：不涉及。
 */
public class StatusEnum {

    /**
     * Enum QUEUED for value: "QUEUED"
     */
    public static final StatusEnum QUEUED = new StatusEnum("QUEUED");

    /**
     * Enum PENDING for value: "PENDING"
     */
    public static final StatusEnum PENDING = new StatusEnum("PENDING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final StatusEnum RUNNING = new StatusEnum("RUNNING");

    /**
     * Enum CANCELING for value: "CANCELING"
     */
    public static final StatusEnum CANCELING = new StatusEnum("CANCELING");

    /**
     * Enum CANCELED for value: "CANCELED"
     */
    public static final StatusEnum CANCELED = new StatusEnum("CANCELED");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final StatusEnum FAILED = new StatusEnum("FAILED");

    /**
     * Enum QUEUED_TIMEOUT for value: "QUEUED_TIMEOUT"
     */
    public static final StatusEnum QUEUED_TIMEOUT = new StatusEnum("QUEUED_TIMEOUT");

    /**
     * Enum RUNNING_TIMEOUT for value: "RUNNING_TIMEOUT"
     */
    public static final StatusEnum RUNNING_TIMEOUT = new StatusEnum("RUNNING_TIMEOUT");

    /**
     * Enum SUCCEEDED for value: "SUCCEEDED"
     */
    public static final StatusEnum SUCCEEDED = new StatusEnum("SUCCEEDED");

    private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

    private static Map<String, StatusEnum> createStaticFields() {
        Map<String, StatusEnum> map = new HashMap<>();
        map.put("QUEUED", QUEUED);
        map.put("PENDING", PENDING);
        map.put("RUNNING", RUNNING);
        map.put("CANCELING", CANCELING);
        map.put("CANCELED", CANCELED);
        map.put("FAILED", FAILED);
        map.put("QUEUED_TIMEOUT", QUEUED_TIMEOUT);
        map.put("RUNNING_TIMEOUT", RUNNING_TIMEOUT);
        map.put("SUCCEEDED", SUCCEEDED);
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
