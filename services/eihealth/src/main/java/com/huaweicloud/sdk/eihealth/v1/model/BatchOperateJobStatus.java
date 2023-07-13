package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 批量操作作业的结果
 */
public class BatchOperateJobStatus {

    /**
     * Enum SUCCEEDED for value: "SUCCEEDED"
     */
    public static final BatchOperateJobStatus SUCCEEDED = new BatchOperateJobStatus("SUCCEEDED");

    /**
     * Enum FAILED for value: "FAILED"
     */
    public static final BatchOperateJobStatus FAILED = new BatchOperateJobStatus("FAILED");

    private static final Map<String, BatchOperateJobStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, BatchOperateJobStatus> createStaticFields() {
        Map<String, BatchOperateJobStatus> map = new HashMap<>();
        map.put("SUCCEEDED", SUCCEEDED);
        map.put("FAILED", FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    BatchOperateJobStatus(String value) {
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
    public static BatchOperateJobStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BatchOperateJobStatus(value));
    }

    public static BatchOperateJobStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BatchOperateJobStatus) {
            return this.value.equals(((BatchOperateJobStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
