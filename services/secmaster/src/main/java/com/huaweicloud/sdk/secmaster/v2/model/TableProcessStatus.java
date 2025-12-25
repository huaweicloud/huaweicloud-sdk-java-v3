package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 表处理状态 - COMPLETED 处理完成 - CREATING 创建中 - UPDATING 更新中 - DELETING 删除中 - TRUNCATING 清空中 - CREATE_FAILED 创建失败 - UPDATING_FAILED 更新失败 - DELETING_FAILED 删除失败 - TRUNCATE_FAILED 清空失败  **约束限制** 不涉及 **取值范围**: - COMPLETED - CREATING - UPDATING - DELETING - TRUNCATING - CREATE_FAILED - UPDATING_FAILED - DELETING_FAILED - TRUNCATE_FAILED  **默认值** 不涉及        
 */
public class TableProcessStatus {

    /**
     * Enum COMPLETED for value: "COMPLETED"
     */
    public static final TableProcessStatus COMPLETED = new TableProcessStatus("COMPLETED");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final TableProcessStatus CREATING = new TableProcessStatus("CREATING");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final TableProcessStatus UPDATING = new TableProcessStatus("UPDATING");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final TableProcessStatus DELETING = new TableProcessStatus("DELETING");

    /**
     * Enum TRUNCATING for value: "TRUNCATING"
     */
    public static final TableProcessStatus TRUNCATING = new TableProcessStatus("TRUNCATING");

    /**
     * Enum CREATE_FAILED for value: "CREATE_FAILED"
     */
    public static final TableProcessStatus CREATE_FAILED = new TableProcessStatus("CREATE_FAILED");

    /**
     * Enum UPDATING_FAILED for value: "UPDATING_FAILED"
     */
    public static final TableProcessStatus UPDATING_FAILED = new TableProcessStatus("UPDATING_FAILED");

    /**
     * Enum DELETING_FAILED for value: "DELETING_FAILED"
     */
    public static final TableProcessStatus DELETING_FAILED = new TableProcessStatus("DELETING_FAILED");

    /**
     * Enum TRUNCATE_FAILED for value: "TRUNCATE_FAILED"
     */
    public static final TableProcessStatus TRUNCATE_FAILED = new TableProcessStatus("TRUNCATE_FAILED");

    private static final Map<String, TableProcessStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, TableProcessStatus> createStaticFields() {
        Map<String, TableProcessStatus> map = new HashMap<>();
        map.put("COMPLETED", COMPLETED);
        map.put("CREATING", CREATING);
        map.put("UPDATING", UPDATING);
        map.put("DELETING", DELETING);
        map.put("TRUNCATING", TRUNCATING);
        map.put("CREATE_FAILED", CREATE_FAILED);
        map.put("UPDATING_FAILED", UPDATING_FAILED);
        map.put("DELETING_FAILED", DELETING_FAILED);
        map.put("TRUNCATE_FAILED", TRUNCATE_FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    TableProcessStatus(String value) {
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
    public static TableProcessStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableProcessStatus(value));
    }

    public static TableProcessStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof TableProcessStatus) {
            return this.value.equals(((TableProcessStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
