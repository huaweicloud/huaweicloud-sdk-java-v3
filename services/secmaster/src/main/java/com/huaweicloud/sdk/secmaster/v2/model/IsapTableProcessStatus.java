package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 处理状态 - COMPLETED 已完成 - CREATING 创建中 - UPDATING 更新中 - DELETING 删除中 - TRUNCATING 清空中 - UPGRADING   升级中       - CREATE_FAILED 创建失败 - UPDATE_FAILED 更新失败 - DELETE_FAILED 删除失败 - TRUNCATE_FAILED 清空失败 - UPGRADE_FAILED 升级失败        **约束限制** 不涉及 **取值范围**: - COMPLETED - CREATING - UPDATING - DELETING - TRUNCATING - UPGRADING       - CREATE_FAILED - UPDATE_FAILED - DELETE_FAILED - TRUNCATE_FAILED - UPGRADE_FAILED  **默认值** 不涉及    
 */
public class IsapTableProcessStatus {

    /**
     * Enum COMPLETED for value: "COMPLETED"
     */
    public static final IsapTableProcessStatus COMPLETED = new IsapTableProcessStatus("COMPLETED");

    /**
     * Enum CREATING for value: "CREATING"
     */
    public static final IsapTableProcessStatus CREATING = new IsapTableProcessStatus("CREATING");

    /**
     * Enum UPDATING for value: "UPDATING"
     */
    public static final IsapTableProcessStatus UPDATING = new IsapTableProcessStatus("UPDATING");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final IsapTableProcessStatus DELETING = new IsapTableProcessStatus("DELETING");

    /**
     * Enum TRUNCATING for value: "TRUNCATING"
     */
    public static final IsapTableProcessStatus TRUNCATING = new IsapTableProcessStatus("TRUNCATING");

    /**
     * Enum UPGRADING for value: "UPGRADING"
     */
    public static final IsapTableProcessStatus UPGRADING = new IsapTableProcessStatus("UPGRADING");

    /**
     * Enum CREATE_FAILED for value: "CREATE_FAILED"
     */
    public static final IsapTableProcessStatus CREATE_FAILED = new IsapTableProcessStatus("CREATE_FAILED");

    /**
     * Enum UPDATE_FAILED for value: "UPDATE_FAILED"
     */
    public static final IsapTableProcessStatus UPDATE_FAILED = new IsapTableProcessStatus("UPDATE_FAILED");

    /**
     * Enum DELETING_FAILED for value: "DELETING_FAILED"
     */
    public static final IsapTableProcessStatus DELETING_FAILED = new IsapTableProcessStatus("DELETING_FAILED");

    /**
     * Enum TRUNCATE_FAILED for value: "TRUNCATE_FAILED"
     */
    public static final IsapTableProcessStatus TRUNCATE_FAILED = new IsapTableProcessStatus("TRUNCATE_FAILED");

    /**
     * Enum UPGRADE_FAILED for value: "UPGRADE_FAILED"
     */
    public static final IsapTableProcessStatus UPGRADE_FAILED = new IsapTableProcessStatus("UPGRADE_FAILED");

    private static final Map<String, IsapTableProcessStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, IsapTableProcessStatus> createStaticFields() {
        Map<String, IsapTableProcessStatus> map = new HashMap<>();
        map.put("COMPLETED", COMPLETED);
        map.put("CREATING", CREATING);
        map.put("UPDATING", UPDATING);
        map.put("DELETING", DELETING);
        map.put("TRUNCATING", TRUNCATING);
        map.put("UPGRADING", UPGRADING);
        map.put("CREATE_FAILED", CREATE_FAILED);
        map.put("UPDATE_FAILED", UPDATE_FAILED);
        map.put("DELETING_FAILED", DELETING_FAILED);
        map.put("TRUNCATE_FAILED", TRUNCATE_FAILED);
        map.put("UPGRADE_FAILED", UPGRADE_FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    IsapTableProcessStatus(String value) {
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
    public static IsapTableProcessStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsapTableProcessStatus(value));
    }

    public static IsapTableProcessStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IsapTableProcessStatus) {
            return this.value.equals(((IsapTableProcessStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
