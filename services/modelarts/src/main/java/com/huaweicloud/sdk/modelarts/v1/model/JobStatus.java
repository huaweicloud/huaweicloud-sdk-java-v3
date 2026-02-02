package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**：作业状态。 **取值范围**：   - CREATING：创建中   - CREATE_FAILED: 创建失败   - PENDING：排队中   - RUNNING：运行中   - FAILED：作业失败   - SUCCEEDED：作业成功   - TIMEOUT：作业超时   - TERMINATING：终止中   - TERMINATED：作业终止 
 */
public class JobStatus {

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final JobStatus CREATING = new JobStatus("CREATING");

    /**
     * Enum CREATE_FAILED for value: "CREATE_FAILED"
     */
    public static final JobStatus CREATE_FAILED = new JobStatus("CREATE_FAILED");

    /**
     * Enum PENDING for value: "PENDING"
     */
    public static final JobStatus PENDING = new JobStatus("PENDING");

    /**
     * Enum RUNNING for value: "RUNNING"
     */
    public static final JobStatus RUNNING = new JobStatus("RUNNING");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final JobStatus FAILED = new JobStatus("FAILED");

    /**
     * Enum SUCCEEDED for value: "SUCCEEDED"
     */
    public static final JobStatus SUCCEEDED = new JobStatus("SUCCEEDED");

    /**
     * Enum TIMEOUT for value: "TIMEOUT"
     */
    public static final JobStatus TIMEOUT = new JobStatus("TIMEOUT");

    /**
     * Enum TERMINATING for value: "TERMINATING"
     */
    public static final JobStatus TERMINATING = new JobStatus("TERMINATING");

    /**
     * Enum TERMINATED for value: "TERMINATED"
     */
    public static final JobStatus TERMINATED = new JobStatus("TERMINATED");

    private static final Map<String, JobStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobStatus> createStaticFields() {
        Map<String, JobStatus> map = new HashMap<>();
        map.put("CREATING", CREATING);
        map.put("CREATE_FAILED", CREATE_FAILED);
        map.put("PENDING", PENDING);
        map.put("RUNNING", RUNNING);
        map.put("FAILED", FAILED);
        map.put("SUCCEEDED", SUCCEEDED);
        map.put("TIMEOUT", TIMEOUT);
        map.put("TERMINATING", TERMINATING);
        map.put("TERMINATED", TERMINATED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobStatus(String value) {
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
    public static JobStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobStatus(value));
    }

    public static JobStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobStatus) {
            return this.value.equals(((JobStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
