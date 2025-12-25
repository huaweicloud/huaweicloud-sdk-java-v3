package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 作业处理状态 - COMPLETED 已完成 - CREATING 创建中 - UPDATING 更新中 - ENABLING 启用中 - DISABLING 停用中 - DELETING 删除中 - CREATE_FAILED 创建失败 - UPDATE_FAILED 更新失败 - ENABLE_FAILED 启用失败 - DISABLE_FAILED 停用失败 - DELETE_FAILED 删除失败 - RECOVERING 恢复中  **约束限制** 不涉及 **取值范围**: - COMPLETED - CREATING - UPDATING - ENABLING - DISABLING - DELETING - CREATE_FAILED - UPDATE_FAILED - ENABLE_FAILED - DISABLE_FAILED - DELETE_FAILED - RECOVERING  **默认值** 不涉及   
 */
public class JobProcessStatus {

    /**
     * Enum COMPLETED for value: "COMPLETED"
     */
    public static final JobProcessStatus COMPLETED = new JobProcessStatus("COMPLETED");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final JobProcessStatus CREATING = new JobProcessStatus("CREATING");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final JobProcessStatus UPDATING = new JobProcessStatus("UPDATING");

    /**
     * Enum ENABLING for value: "ENABLING"
     */
    public static final JobProcessStatus ENABLING = new JobProcessStatus("ENABLING");

    /**
     * Enum DISABLING for value: "DISABLING"
     */
    public static final JobProcessStatus DISABLING = new JobProcessStatus("DISABLING");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final JobProcessStatus DELETING = new JobProcessStatus("DELETING");

    /**
     * Enum CREATE_FAILED for value: "CREATE_FAILED"
     */
    public static final JobProcessStatus CREATE_FAILED = new JobProcessStatus("CREATE_FAILED");

    /**
     * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
     */
    public static final JobProcessStatus UPDATE_FAILED = new JobProcessStatus("UPDATE_FAILED");

    /**
     * Enum ENABLE_FAILED for value: "ENABLE_FAILED"
     */
    public static final JobProcessStatus ENABLE_FAILED = new JobProcessStatus("ENABLE_FAILED");

    /**
     * Enum DISABLE_FAILED for value: "DISABLE_FAILED"
     */
    public static final JobProcessStatus DISABLE_FAILED = new JobProcessStatus("DISABLE_FAILED");

    /**
     * Enum DELETE_FAILED for value: "DELETE_FAILED"
     */
    public static final JobProcessStatus DELETE_FAILED = new JobProcessStatus("DELETE_FAILED");

    /**
     * Enum RECOVERING for value: "RECOVERING"
     */
    public static final JobProcessStatus RECOVERING = new JobProcessStatus("RECOVERING");

    private static final Map<String, JobProcessStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobProcessStatus> createStaticFields() {
        Map<String, JobProcessStatus> map = new HashMap<>();
        map.put("COMPLETED", COMPLETED);
        map.put("CREATING", CREATING);
        map.put("UPDATING", UPDATING);
        map.put("ENABLING", ENABLING);
        map.put("DISABLING", DISABLING);
        map.put("DELETING", DELETING);
        map.put("CREATE_FAILED", CREATE_FAILED);
        map.put("UPDATE_FAILED", UPDATE_FAILED);
        map.put("ENABLE_FAILED", ENABLE_FAILED);
        map.put("DISABLE_FAILED", DISABLE_FAILED);
        map.put("DELETE_FAILED", DELETE_FAILED);
        map.put("RECOVERING", RECOVERING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobProcessStatus(String value) {
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
    public static JobProcessStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobProcessStatus(value));
    }

    public static JobProcessStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobProcessStatus) {
            return this.value.equals(((JobProcessStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
