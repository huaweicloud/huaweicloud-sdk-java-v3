package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：作业状态。 **取值范围**：   - CREATING：创建中   - CREATE_FAILED: 创建失败   - PENDING：排队中   - RUNNING：运行中   - FAILED：作业失败   - SUCCEEDED：作业成功   - TIMEOUT：作业超时   - PARTIAILLY_SUCCEEDED：部分成功   - TERMINATING：终止中   - TERMINATED：作业终止 
 */
public class LogJobStatus {

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final LogJobStatus CREATING = new LogJobStatus("CREATING");

    /**
     * Enum CREATE_FAILED for value: "CREATE_FAILED"
     */
    public static final LogJobStatus CREATE_FAILED = new LogJobStatus("CREATE_FAILED");

    /**
     * Enum PENDING for value: "PENDING"
     */
    public static final LogJobStatus PENDING = new LogJobStatus("PENDING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final LogJobStatus RUNNING = new LogJobStatus("RUNNING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final LogJobStatus FAILED = new LogJobStatus("FAILED");

    /**
     * Enum SUCCEEDED for value: "SUCCEEDED"
     */
    public static final LogJobStatus SUCCEEDED = new LogJobStatus("SUCCEEDED");

    /**
     * Enum TIMEOUT for value: "TIMEOUT"
     */
    public static final LogJobStatus TIMEOUT = new LogJobStatus("TIMEOUT");

    /**
     * Enum PARTIAILLY_SUCCEEDED for value: "PARTIAILLY_SUCCEEDED"
     */
    public static final LogJobStatus PARTIAILLY_SUCCEEDED = new LogJobStatus("PARTIAILLY_SUCCEEDED");

    /**
     * Enum TERMINATING for value: "TERMINATING"
     */
    public static final LogJobStatus TERMINATING = new LogJobStatus("TERMINATING");

    /**
     * Enum TERMINATED for value: "TERMINATED"
     */
    public static final LogJobStatus TERMINATED = new LogJobStatus("TERMINATED");

    private static final Map<String, LogJobStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, LogJobStatus> createStaticFields() {
        Map<String, LogJobStatus> map = new HashMap<>();
        map.put("CREATING", CREATING);
        map.put("CREATE_FAILED", CREATE_FAILED);
        map.put("PENDING", PENDING);
        map.put("RUNNING", RUNNING);
        map.put("FAILED", FAILED);
        map.put("SUCCEEDED", SUCCEEDED);
        map.put("TIMEOUT", TIMEOUT);
        map.put("PARTIAILLY_SUCCEEDED", PARTIAILLY_SUCCEEDED);
        map.put("TERMINATING", TERMINATING);
        map.put("TERMINATED", TERMINATED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    LogJobStatus(String value) {
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
    public static LogJobStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogJobStatus(value));
    }

    public static LogJobStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof LogJobStatus) {
            return this.value.equals(((LogJobStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
