package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**: 表处理错误 - NONE 无 - MISSING_ASSOCIATIONS 关联缺失 - FAILED_INIT_STORAGE_RESOURCES_WHEN_CREATING 创建时初始化存储资源失败 - FAILED_INIT_FLINK_RESOURCES_WHEN_CREATING 创建时初始化 Flink 资源失败 - FAILED_DELETE_FLINK_RESOURCES_WHEN_DELETING 删除时删除 Flink 资源失败 - FAILED_DELETE_STORAGE_RESOURCES_WHEN_DELETING 删除时删除存储资源失败 - FAILED_DELETE_ALL_RESOURCES_WHEN_DELETING 删除时删除所有资源失败 - FAILED_UPDATE_STORAGE_SETTING 更新存储配置失败 - FAILED_UPDATE_FLINK_SCHEMA 更新 Flink 模式失败 - FAILED_UPDATE_STORAGE_SCHEMA 更新存储模式失败 - FAILED_TO_APPLY_RESOURCE 应用资源失败 - FAILED_TO_UPGRADE_RESOURCE_MODEL 升级资源模型失败  **约束限制** 不涉及 **取值范围**: - NONE - MISSING_ASSOCIATIONS - FAILED_INIT_STORAGE_RESOURCES_WHEN_CREATING - FAILED_INIT_FLINK_RESOURCES_WHEN_CREATING - FAILED_DELETE_FLINK_RESOURCES_WHEN_DELETING - FAILED_DELETE_STORAGE_RESOURCES_WHEN_DELETING - FAILED_DELETE_ALL_RESOURCES_WHEN_DELETING - FAILED_UPDATE_STORAGE_SETTING - FAILED_UPDATE_FLINK_SCHEMA - FAILED_UPDATE_STORAGE_SCHEMA - FAILED_TO_APPLY_RESOURCE - FAILED_TO_UPGRADE_RESOURCE_MODEL  **默认值** 不涉及 
 */
public class IsapTableProcessError {

    /**
     * Enum NONE for value: "NONE"
     */
    public static final IsapTableProcessError NONE = new IsapTableProcessError("NONE");

    /**
     * Enum MISSING_ASSOCIATIONS for value: "MISSING_ASSOCIATIONS"
     */
    public static final IsapTableProcessError MISSING_ASSOCIATIONS = new IsapTableProcessError("MISSING_ASSOCIATIONS");

    /**
     * Enum FAILED_INIT_STORAGE_RESOURCES_WHEN_CREATING for value: "FAILED_INIT_STORAGE_RESOURCES_WHEN_CREATING"
     */
    public static final IsapTableProcessError FAILED_INIT_STORAGE_RESOURCES_WHEN_CREATING =
        new IsapTableProcessError("FAILED_INIT_STORAGE_RESOURCES_WHEN_CREATING");

    /**
     * Enum FAILED_INIT_FLINK_RESOURCES_WHEN_CREATING for value: "FAILED_INIT_FLINK_RESOURCES_WHEN_CREATING"
     */
    public static final IsapTableProcessError FAILED_INIT_FLINK_RESOURCES_WHEN_CREATING =
        new IsapTableProcessError("FAILED_INIT_FLINK_RESOURCES_WHEN_CREATING");

    /**
     * Enum FAILED_DELETE_FLINK_RESOURCES_WHEN_DELETING for value: "FAILED_DELETE_FLINK_RESOURCES_WHEN_DELETING"
     */
    public static final IsapTableProcessError FAILED_DELETE_FLINK_RESOURCES_WHEN_DELETING =
        new IsapTableProcessError("FAILED_DELETE_FLINK_RESOURCES_WHEN_DELETING");

    /**
     * Enum FAILED_DELETE_STORAGE_RESOURCES_WHEN_DELETING for value: "FAILED_DELETE_STORAGE_RESOURCES_WHEN_DELETING"
     */
    public static final IsapTableProcessError FAILED_DELETE_STORAGE_RESOURCES_WHEN_DELETING =
        new IsapTableProcessError("FAILED_DELETE_STORAGE_RESOURCES_WHEN_DELETING");

    /**
     * Enum FAILED_DELETE_ALL_RESOURCES_WHEN_DELETING for value: "FAILED_DELETE_ALL_RESOURCES_WHEN_DELETING"
     */
    public static final IsapTableProcessError FAILED_DELETE_ALL_RESOURCES_WHEN_DELETING =
        new IsapTableProcessError("FAILED_DELETE_ALL_RESOURCES_WHEN_DELETING");

    /**
     * Enum FAILED_UPDATE_STORAGE_SETTING for value: "FAILED_UPDATE_STORAGE_SETTING"
     */
    public static final IsapTableProcessError FAILED_UPDATE_STORAGE_SETTING =
        new IsapTableProcessError("FAILED_UPDATE_STORAGE_SETTING");

    /**
     * Enum FAILED_UPDATE_FLINK_SCHEMA for value: "FAILED_UPDATE_FLINK_SCHEMA"
     */
    public static final IsapTableProcessError FAILED_UPDATE_FLINK_SCHEMA =
        new IsapTableProcessError("FAILED_UPDATE_FLINK_SCHEMA");

    /**
     * Enum FAILED_UPDATE_STORAGE_SCHEMA for value: "FAILED_UPDATE_STORAGE_SCHEMA"
     */
    public static final IsapTableProcessError FAILED_UPDATE_STORAGE_SCHEMA =
        new IsapTableProcessError("FAILED_UPDATE_STORAGE_SCHEMA");

    /**
     * Enum FAILED_TO_APPLY_RESOURCE for value: "FAILED_TO_APPLY_RESOURCE"
     */
    public static final IsapTableProcessError FAILED_TO_APPLY_RESOURCE =
        new IsapTableProcessError("FAILED_TO_APPLY_RESOURCE");

    /**
     * Enum FAILED_TO_UPGRADE_RESOURCE_MODEL for value: "FAILED_TO_UPGRADE_RESOURCE_MODEL"
     */
    public static final IsapTableProcessError FAILED_TO_UPGRADE_RESOURCE_MODEL =
        new IsapTableProcessError("FAILED_TO_UPGRADE_RESOURCE_MODEL");

    private static final Map<String, IsapTableProcessError> STATIC_FIELDS = createStaticFields();

    private static Map<String, IsapTableProcessError> createStaticFields() {
        Map<String, IsapTableProcessError> map = new HashMap<>();
        map.put("NONE", NONE);
        map.put("MISSING_ASSOCIATIONS", MISSING_ASSOCIATIONS);
        map.put("FAILED_INIT_STORAGE_RESOURCES_WHEN_CREATING", FAILED_INIT_STORAGE_RESOURCES_WHEN_CREATING);
        map.put("FAILED_INIT_FLINK_RESOURCES_WHEN_CREATING", FAILED_INIT_FLINK_RESOURCES_WHEN_CREATING);
        map.put("FAILED_DELETE_FLINK_RESOURCES_WHEN_DELETING", FAILED_DELETE_FLINK_RESOURCES_WHEN_DELETING);
        map.put("FAILED_DELETE_STORAGE_RESOURCES_WHEN_DELETING", FAILED_DELETE_STORAGE_RESOURCES_WHEN_DELETING);
        map.put("FAILED_DELETE_ALL_RESOURCES_WHEN_DELETING", FAILED_DELETE_ALL_RESOURCES_WHEN_DELETING);
        map.put("FAILED_UPDATE_STORAGE_SETTING", FAILED_UPDATE_STORAGE_SETTING);
        map.put("FAILED_UPDATE_FLINK_SCHEMA", FAILED_UPDATE_FLINK_SCHEMA);
        map.put("FAILED_UPDATE_STORAGE_SCHEMA", FAILED_UPDATE_STORAGE_SCHEMA);
        map.put("FAILED_TO_APPLY_RESOURCE", FAILED_TO_APPLY_RESOURCE);
        map.put("FAILED_TO_UPGRADE_RESOURCE_MODEL", FAILED_TO_UPGRADE_RESOURCE_MODEL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    IsapTableProcessError(String value) {
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
    public static IsapTableProcessError fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsapTableProcessError(value));
    }

    public static IsapTableProcessError valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof IsapTableProcessError) {
            return this.value.equals(((IsapTableProcessError) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
