package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * job类型： * &#x60;CREATE_SERVER&#x60; - 创建服务器 * &#x60;DELETE_SERVER&#x60; - 删除服务器 * &#x60;UPDATE_FREEZE_STATUS&#x60; - 修改服务器冻结状态 * &#x60;CREATE_SERVER_IMAGE&#x60; - 构建镜像 * &#x60;REINSTALL_OS&#x60; - 重装操作系统 * &#x60;CHANGE_SERVER_IMAGE&#x60; - 更换镜像 * &#x60;REJOIN_DOMAIN&#x60; - 重新加域 * &#x60;MIGRATE_SERVER&#x60; - 迁移服务器 * &#x60;UPGRADE_ACCESS_AGENT&#x60; - hda升级 * &#x60;UPDATE_SERVER_TSVI&#x60; - 更新虚拟会话IP * &#x60;SCHEDULED_TASK&#x60; - 定时任务job * &#x60;COLLECT_HDA_LOG&#x60; - 收集hda日志 * &#x60;COLLECT_APS_LOG&#x60; - 收集aps日志 * &#x60;CREATE_SERVER_SNAPSHOT&#x60; - 创建服务器快照 * &#x60;DELETE_SERVER_SNAPSHOT&#x60; - 删除服务器快照 * &#x60;RESTORE_SERVER_SNAPSHOT&#x60; - 恢复服务器快照 * &#x60;BATCH_INSTALL_APP&#x60; - 批量安装应用
 */
public class JobType {

    /**
     * Enum CREATE_SERVER for value: "CREATE_SERVER"
     */
    public static final JobType CREATE_SERVER = new JobType("CREATE_SERVER");

    /**
     * Enum DELETE_SERVER for value: "DELETE_SERVER"
     */
    public static final JobType DELETE_SERVER = new JobType("DELETE_SERVER");

    /**
     * Enum UPDATE_FREEZE_STATUS for value: "UPDATE_FREEZE_STATUS"
     */
    public static final JobType UPDATE_FREEZE_STATUS = new JobType("UPDATE_FREEZE_STATUS");

    /**
     * Enum CREATE_SERVER_IMAGE for value: "CREATE_SERVER_IMAGE"
     */
    public static final JobType CREATE_SERVER_IMAGE = new JobType("CREATE_SERVER_IMAGE");

    /**
     * Enum REINSTALL_OS for value: "REINSTALL_OS"
     */
    public static final JobType REINSTALL_OS = new JobType("REINSTALL_OS");

    /**
     * Enum CHANGE_SERVER_IMAGE for value: "CHANGE_SERVER_IMAGE"
     */
    public static final JobType CHANGE_SERVER_IMAGE = new JobType("CHANGE_SERVER_IMAGE");

    /**
     * Enum REJOIN_DOMAIN for value: "REJOIN_DOMAIN"
     */
    public static final JobType REJOIN_DOMAIN = new JobType("REJOIN_DOMAIN");

    /**
     * Enum MIGRATE_SERVER for value: "MIGRATE_SERVER"
     */
    public static final JobType MIGRATE_SERVER = new JobType("MIGRATE_SERVER");

    /**
     * Enum UPGRADE_ACCESS_AGENT for value: "UPGRADE_ACCESS_AGENT"
     */
    public static final JobType UPGRADE_ACCESS_AGENT = new JobType("UPGRADE_ACCESS_AGENT");

    /**
     * Enum UPDATE_SERVER_TSVI for value: "UPDATE_SERVER_TSVI"
     */
    public static final JobType UPDATE_SERVER_TSVI = new JobType("UPDATE_SERVER_TSVI");

    /**
     * Enum SCHEDULED_TASK for value: "SCHEDULED_TASK"
     */
    public static final JobType SCHEDULED_TASK = new JobType("SCHEDULED_TASK");

    /**
     * Enum COLLECT_HDA_LOG for value: "COLLECT_HDA_LOG"
     */
    public static final JobType COLLECT_HDA_LOG = new JobType("COLLECT_HDA_LOG");

    /**
     * Enum COLLECT_APS_LOG for value: "COLLECT_APS_LOG"
     */
    public static final JobType COLLECT_APS_LOG = new JobType("COLLECT_APS_LOG");

    /**
     * Enum CREATE_SERVER_SNAPSHOT for value: "CREATE_SERVER_SNAPSHOT"
     */
    public static final JobType CREATE_SERVER_SNAPSHOT = new JobType("CREATE_SERVER_SNAPSHOT");

    /**
     * Enum DELETE_SERVER_SNAPSHOT for value: "DELETE_SERVER_SNAPSHOT"
     */
    public static final JobType DELETE_SERVER_SNAPSHOT = new JobType("DELETE_SERVER_SNAPSHOT");

    /**
     * Enum RESTORE_SERVER_SNAPSHOT for value: "RESTORE_SERVER_SNAPSHOT"
     */
    public static final JobType RESTORE_SERVER_SNAPSHOT = new JobType("RESTORE_SERVER_SNAPSHOT");

    /**
     * Enum BATCH_INSTALL_APP for value: "BATCH_INSTALL_APP"
     */
    public static final JobType BATCH_INSTALL_APP = new JobType("BATCH_INSTALL_APP");

    private static final Map<String, JobType> STATIC_FIELDS = createStaticFields();

    private static Map<String, JobType> createStaticFields() {
        Map<String, JobType> map = new HashMap<>();
        map.put("CREATE_SERVER", CREATE_SERVER);
        map.put("DELETE_SERVER", DELETE_SERVER);
        map.put("UPDATE_FREEZE_STATUS", UPDATE_FREEZE_STATUS);
        map.put("CREATE_SERVER_IMAGE", CREATE_SERVER_IMAGE);
        map.put("REINSTALL_OS", REINSTALL_OS);
        map.put("CHANGE_SERVER_IMAGE", CHANGE_SERVER_IMAGE);
        map.put("REJOIN_DOMAIN", REJOIN_DOMAIN);
        map.put("MIGRATE_SERVER", MIGRATE_SERVER);
        map.put("UPGRADE_ACCESS_AGENT", UPGRADE_ACCESS_AGENT);
        map.put("UPDATE_SERVER_TSVI", UPDATE_SERVER_TSVI);
        map.put("SCHEDULED_TASK", SCHEDULED_TASK);
        map.put("COLLECT_HDA_LOG", COLLECT_HDA_LOG);
        map.put("COLLECT_APS_LOG", COLLECT_APS_LOG);
        map.put("CREATE_SERVER_SNAPSHOT", CREATE_SERVER_SNAPSHOT);
        map.put("DELETE_SERVER_SNAPSHOT", DELETE_SERVER_SNAPSHOT);
        map.put("RESTORE_SERVER_SNAPSHOT", RESTORE_SERVER_SNAPSHOT);
        map.put("BATCH_INSTALL_APP", BATCH_INSTALL_APP);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    JobType(String value) {
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
    public static JobType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobType(value));
    }

    public static JobType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof JobType) {
            return this.value.equals(((JobType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
