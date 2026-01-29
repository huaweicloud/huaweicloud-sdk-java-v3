package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 作业处理状态 - COMPLETED 已完成 - CREATING 创建中 - UPDATING 更新中 - DELETING 删除中 - UPDATING_FAILED 更新失败 - DELETING_FAILED 删除失败  **约束限制** 不涉及 **取值范围**: - COMPLETED - CREATING - UPDATING - DELETING - UPDATING_FAILED - DELETING_FAILED  **默认值** 不涉及
 */
public class PipeProcessStatus {

    /**
     * Enum COMPLETED for value: "COMPLETED"
     */
    public static final PipeProcessStatus COMPLETED = new PipeProcessStatus("COMPLETED");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final PipeProcessStatus CREATING = new PipeProcessStatus("CREATING");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final PipeProcessStatus UPDATING = new PipeProcessStatus("UPDATING");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final PipeProcessStatus DELETING = new PipeProcessStatus("DELETING");

    /**
     * Enum CREATE_FAILED for value: "CREATE_FAILED"
     */
    public static final PipeProcessStatus CREATE_FAILED = new PipeProcessStatus("CREATE_FAILED");

    /**
     * Enum UPDATING_FAILED for value: "UPDATING_FAILED"
     */
    public static final PipeProcessStatus UPDATING_FAILED = new PipeProcessStatus("UPDATING_FAILED");

    /**
     * Enum DELETING_FAILED for value: "DELETING_FAILED"
     */
    public static final PipeProcessStatus DELETING_FAILED = new PipeProcessStatus("DELETING_FAILED");

    private static final Map<String, PipeProcessStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, PipeProcessStatus> createStaticFields() {
        Map<String, PipeProcessStatus> map = new HashMap<>();
        map.put("COMPLETED", COMPLETED);
        map.put("CREATING", CREATING);
        map.put("UPDATING", UPDATING);
        map.put("DELETING", DELETING);
        map.put("CREATE_FAILED", CREATE_FAILED);
        map.put("UPDATING_FAILED", UPDATING_FAILED);
        map.put("DELETING_FAILED", DELETING_FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PipeProcessStatus(String value) {
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
    public static PipeProcessStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PipeProcessStatus(value));
    }

    public static PipeProcessStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PipeProcessStatus) {
            return this.value.equals(((PipeProcessStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
