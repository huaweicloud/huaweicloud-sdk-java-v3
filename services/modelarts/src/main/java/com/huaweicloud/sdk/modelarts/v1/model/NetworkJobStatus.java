package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：网络诊断作业状态。 **取值范围**：   - CREATING：创建中   - RUNNING：诊断中   - FAILED：作业失败   - SUCCEEDED：作业成功   - TIMEOUT：作业超时
 */
public class NetworkJobStatus {

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final NetworkJobStatus CREATING = new NetworkJobStatus("CREATING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final NetworkJobStatus RUNNING = new NetworkJobStatus("RUNNING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final NetworkJobStatus FAILED = new NetworkJobStatus("FAILED");

    /**
     * Enum SUCCEEDED for value: "SUCCEEDED"
     */
    public static final NetworkJobStatus SUCCEEDED = new NetworkJobStatus("SUCCEEDED");

    /**
     * Enum TIMEOUT for value: "TIMEOUT"
     */
    public static final NetworkJobStatus TIMEOUT = new NetworkJobStatus("TIMEOUT");

    private static final Map<String, NetworkJobStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, NetworkJobStatus> createStaticFields() {
        Map<String, NetworkJobStatus> map = new HashMap<>();
        map.put("CREATING", CREATING);
        map.put("RUNNING", RUNNING);
        map.put("FAILED", FAILED);
        map.put("SUCCEEDED", SUCCEEDED);
        map.put("TIMEOUT", TIMEOUT);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    NetworkJobStatus(String value) {
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
    public static NetworkJobStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkJobStatus(value));
    }

    public static NetworkJobStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof NetworkJobStatus) {
            return this.value.equals(((NetworkJobStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
