package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 处理状态 - COMPLETED 已完成 - CREATING 创建中 - UPDATING 更新中 - ENABLING 启用中 - DISABLING 停用中 - DELETING 删除中 - CREATE_FAILED 创建失败 - UPDATE_FAILED 更新失败 - ENABLE_FAILED 启用失败 - DISABLE_FAILED 停用失败 - DELETE_FAILED 删除失败 - RECOVERING 恢复中  **约束限制** 不涉及 **取值范围**: - COMPLETED - CREATING - UPDATING - ENABLING - DISABLING - DELETING - CREATE_FAILED - UPDATE_FAILED - ENABLE_FAILED - DISABLE_FAILED - DELETE_FAILED - RECOVERING  **默认值** 不涉及
 */
public class ProcessStatus {

    /**
     * Enum COMPLETED for value: "COMPLETED"
     */
    public static final ProcessStatus COMPLETED = new ProcessStatus("COMPLETED");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final ProcessStatus CREATING = new ProcessStatus("CREATING");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final ProcessStatus UPDATING = new ProcessStatus("UPDATING");

    /**
     * Enum ENABLING for value: "ENABLING"
     */
    public static final ProcessStatus ENABLING = new ProcessStatus("ENABLING");

    /**
     * Enum DISABLING for value: "DISABLING"
     */
    public static final ProcessStatus DISABLING = new ProcessStatus("DISABLING");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final ProcessStatus DELETING = new ProcessStatus("DELETING");

    /**
     * Enum CREATE_FAILED for value: "CREATE_FAILED"
     */
    public static final ProcessStatus CREATE_FAILED = new ProcessStatus("CREATE_FAILED");

    /**
     * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
     */
    public static final ProcessStatus UPDATE_FAILED = new ProcessStatus("UPDATE_FAILED");

    /**
     * Enum ENABLE_FAILED for value: "ENABLE_FAILED"
     */
    public static final ProcessStatus ENABLE_FAILED = new ProcessStatus("ENABLE_FAILED");

    /**
     * Enum DISABLE_FAILED for value: "DISABLE_FAILED"
     */
    public static final ProcessStatus DISABLE_FAILED = new ProcessStatus("DISABLE_FAILED");

    /**
     * Enum DELETE_FAILED for value: "DELETE_FAILED"
     */
    public static final ProcessStatus DELETE_FAILED = new ProcessStatus("DELETE_FAILED");

    /**
     * Enum RECOVERING for value: "RECOVERING"
     */
    public static final ProcessStatus RECOVERING = new ProcessStatus("RECOVERING");

    private static final Map<String, ProcessStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, ProcessStatus> createStaticFields() {
        Map<String, ProcessStatus> map = new HashMap<>();
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

    ProcessStatus(String value) {
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
    public static ProcessStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProcessStatus(value));
    }

    public static ProcessStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ProcessStatus) {
            return this.value.equals(((ProcessStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
