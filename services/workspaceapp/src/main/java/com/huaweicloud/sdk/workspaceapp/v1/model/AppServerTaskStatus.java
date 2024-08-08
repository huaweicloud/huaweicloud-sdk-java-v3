package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * server的任务状态: * &#x60;scheduling&#x60; - 实例处于创建中，正在进行调度 * &#x60;block_device_mapping&#x60; - 实例处于创建中，正在准备磁盘 * &#x60;networking&#x60; - 实例处于创建中，正在准备网络 * &#x60;spawning&#x60; - 实例处于创建中，正在内部创建 * &#x60;rebooting&#x60; - 实例处于重启中 * &#x60;reboot_pending&#x60; - 实例处于重启中，正在下发重启。 * &#x60;reboot_started&#x60; - 实例处于重启中，开始内部重启 * &#x60;rebooting_hard&#x60; - 实例处于强制重启中 * &#x60;reboot_pending_hard&#x60; - 实例处于强制重启中，正在下发重启 * &#x60;reboot_started_hard&#x60; - 实例处于强制重启中，开始内部重启。 * &#x60;rebuilding&#x60; - 实例处于重建中。 * &#x60;rebuild_fail&#x60; - 实例重建失败。 * &#x60;updating_tsvi&#x60; - 实例处于虚拟会话IP更新中。 * &#x60;updating_tsvi_failed&#x60; - 实例虚拟会话IP更新失败。 * &#x60;rebuild_block_device_mapping&#x60; - 实例处于重建中，正在准备磁盘。 * &#x60;rebuild_spawning&#x60; - 实例处于重建中，正在内部重建。 * &#x60;migrating&#x60; - 实例处于热迁移中。 * &#x60;resize_prep&#x60; - 实例处于调整规格中，正在准备阶段。 * &#x60;resize_migrating&#x60; - 实例处于调整规格中，正在迁移阶段。 * &#x60;resize_migrated&#x60; - 实例处于调整规格中，已经完成迁移。 * &#x60;resize_finish&#x60; - 实例处于调整规格中，正在完成调整。 * &#x60;resize_reverting&#x60; - 实例处于调整规格中，正在回退调整。 * &#x60;powering-off&#x60; - 实例处于停止中。 * &#x60;powering-on&#x60; - 实例处于启动中。 * &#x60;deleting&#x60; - 实例处于删除中。 * &#x60;source_locking&#x60; - 资源锁定中 * &#x60;rejoining_domain&#x60; - 实例正在重新加域 * &#x60;delete_failed&#x60; - 实例删除失败 * &#x60;upgrading_access_agent&#x60; - 实例正在升级AccessAgent * &#x60;upgrad_access_agent_fail&#x60; - 实例升级AccessAgent失败 * &#x60;upgrad_access_agent_success&#x60; - 实例升级AccessAgent成功 * &#x60;updating_sid&#x60; - 实例处于创建中，等待更新SID * &#x60;migrate_failed&#x60; - 实例迁移失败 * &#x60;build_image&#x60; - 生成镜像中 * &#x60;build_snapshot&#x60; - 生成快照中 * &#x60;restore_snapshot&#x60; - 恢复快照中 * &#x60;null&#x60; - 未设置
 */
public class AppServerTaskStatus {

    /**
     * Enum SCHEDULING for value: "scheduling"
     */
    public static final AppServerTaskStatus SCHEDULING = new AppServerTaskStatus("scheduling");

    /**
     * Enum BLOCK_DEVICE_MAPPING for value: "block_device_mapping"
     */
    public static final AppServerTaskStatus BLOCK_DEVICE_MAPPING = new AppServerTaskStatus("block_device_mapping");

    /**
     * Enum NETWORKING for value: "networking"
     */
    public static final AppServerTaskStatus NETWORKING = new AppServerTaskStatus("networking");

    /**
     * Enum SPAWNING for value: "spawning"
     */
    public static final AppServerTaskStatus SPAWNING = new AppServerTaskStatus("spawning");

    /**
     * Enum REBOOTING for value: "rebooting"
     */
    public static final AppServerTaskStatus REBOOTING = new AppServerTaskStatus("rebooting");

    /**
     * Enum REBOOT_PENDING for value: "reboot_pending"
     */
    public static final AppServerTaskStatus REBOOT_PENDING = new AppServerTaskStatus("reboot_pending");

    /**
     * Enum REBOOTING_HARD for value: "rebooting_hard"
     */
    public static final AppServerTaskStatus REBOOTING_HARD = new AppServerTaskStatus("rebooting_hard");

    /**
     * Enum REBOOT_PENDING_HARD for value: "reboot_pending_hard"
     */
    public static final AppServerTaskStatus REBOOT_PENDING_HARD = new AppServerTaskStatus("reboot_pending_hard");

    /**
     * Enum REBOOT_STARTED_HARD for value: "reboot_started_hard"
     */
    public static final AppServerTaskStatus REBOOT_STARTED_HARD = new AppServerTaskStatus("reboot_started_hard");

    /**
     * Enum REBUILDING for value: "rebuilding"
     */
    public static final AppServerTaskStatus REBUILDING = new AppServerTaskStatus("rebuilding");

    /**
     * Enum REBUILD_FAIL for value: "rebuild_fail"
     */
    public static final AppServerTaskStatus REBUILD_FAIL = new AppServerTaskStatus("rebuild_fail");

    /**
     * Enum UPDATING_TSVI for value: "updating_tsvi"
     */
    public static final AppServerTaskStatus UPDATING_TSVI = new AppServerTaskStatus("updating_tsvi");

    /**
     * Enum UPDATING_TSVI_FAILED for value: "updating_tsvi_failed"
     */
    public static final AppServerTaskStatus UPDATING_TSVI_FAILED = new AppServerTaskStatus("updating_tsvi_failed");

    /**
     * Enum REBUILD_BLOCK_DEVICE_MAPPING for value: "rebuild_block_device_mapping"
     */
    public static final AppServerTaskStatus REBUILD_BLOCK_DEVICE_MAPPING =
        new AppServerTaskStatus("rebuild_block_device_mapping");

    /**
     * Enum REBUILD_SPAWNING for value: "rebuild_spawning"
     */
    public static final AppServerTaskStatus REBUILD_SPAWNING = new AppServerTaskStatus("rebuild_spawning");

    /**
     * Enum MIGRATING for value: "migrating"
     */
    public static final AppServerTaskStatus MIGRATING = new AppServerTaskStatus("migrating");

    /**
     * Enum RESIZE_PREP for value: "resize_prep"
     */
    public static final AppServerTaskStatus RESIZE_PREP = new AppServerTaskStatus("resize_prep");

    /**
     * Enum RESIZE_MIGRATING for value: "resize_migrating"
     */
    public static final AppServerTaskStatus RESIZE_MIGRATING = new AppServerTaskStatus("resize_migrating");

    /**
     * Enum RESIZE_MIGRATED for value: "resize_migrated"
     */
    public static final AppServerTaskStatus RESIZE_MIGRATED = new AppServerTaskStatus("resize_migrated");

    /**
     * Enum RESIZE_FINISH for value: "resize_finish"
     */
    public static final AppServerTaskStatus RESIZE_FINISH = new AppServerTaskStatus("resize_finish");

    /**
     * Enum RESIZE_REVERTING for value: "resize_reverting"
     */
    public static final AppServerTaskStatus RESIZE_REVERTING = new AppServerTaskStatus("resize_reverting");

    /**
     * Enum POWERING_OFF for value: "powering-off"
     */
    public static final AppServerTaskStatus POWERING_OFF = new AppServerTaskStatus("powering-off");

    /**
     * Enum POWERING_ON for value: "powering-on"
     */
    public static final AppServerTaskStatus POWERING_ON = new AppServerTaskStatus("powering-on");

    /**
     * Enum DELETING for value: "deleting"
     */
    public static final AppServerTaskStatus DELETING = new AppServerTaskStatus("deleting");

    /**
     * Enum REJOINING_DOMAIN for value: "rejoining_domain"
     */
    public static final AppServerTaskStatus REJOINING_DOMAIN = new AppServerTaskStatus("rejoining_domain");

    /**
     * Enum SOURCE_LOCKING for value: "source_locking"
     */
    public static final AppServerTaskStatus SOURCE_LOCKING = new AppServerTaskStatus("source_locking");

    /**
     * Enum DELETE_FAILED for value: "delete_failed"
     */
    public static final AppServerTaskStatus DELETE_FAILED = new AppServerTaskStatus("delete_failed");

    /**
     * Enum UPDATING_SID for value: "updating_sid"
     */
    public static final AppServerTaskStatus UPDATING_SID = new AppServerTaskStatus("updating_sid");

    /**
     * Enum UPGRADING_ACCESS_AGENT for value: "upgrading_access_agent"
     */
    public static final AppServerTaskStatus UPGRADING_ACCESS_AGENT = new AppServerTaskStatus("upgrading_access_agent");

    /**
     * Enum UPGRAD_ACCESS_AGENT_FAIL for value: "upgrad_access_agent_fail"
     */
    public static final AppServerTaskStatus UPGRAD_ACCESS_AGENT_FAIL =
        new AppServerTaskStatus("upgrad_access_agent_fail");

    /**
     * Enum UPGRAD_ACCESS_AGENT_SUCCESS for value: "upgrad_access_agent_success"
     */
    public static final AppServerTaskStatus UPGRAD_ACCESS_AGENT_SUCCESS =
        new AppServerTaskStatus("upgrad_access_agent_success");

    /**
     * Enum MIGRATE_FAILED for value: "migrate_failed"
     */
    public static final AppServerTaskStatus MIGRATE_FAILED = new AppServerTaskStatus("migrate_failed");

    /**
     * Enum BUILD_IMAGE for value: "build_image"
     */
    public static final AppServerTaskStatus BUILD_IMAGE = new AppServerTaskStatus("build_image");

    /**
     * Enum BUILD_SNAPSHOT for value: "build_snapshot"
     */
    public static final AppServerTaskStatus BUILD_SNAPSHOT = new AppServerTaskStatus("build_snapshot");

    /**
     * Enum RESTORE_SNAPSHOT for value: "restore_snapshot"
     */
    public static final AppServerTaskStatus RESTORE_SNAPSHOT = new AppServerTaskStatus("restore_snapshot");

    /**
     * Enum NULL for value: "null"
     */
    public static final AppServerTaskStatus NULL = new AppServerTaskStatus("null");

    private static final Map<String, AppServerTaskStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, AppServerTaskStatus> createStaticFields() {
        Map<String, AppServerTaskStatus> map = new HashMap<>();
        map.put("scheduling", SCHEDULING);
        map.put("block_device_mapping", BLOCK_DEVICE_MAPPING);
        map.put("networking", NETWORKING);
        map.put("spawning", SPAWNING);
        map.put("rebooting", REBOOTING);
        map.put("reboot_pending", REBOOT_PENDING);
        map.put("rebooting_hard", REBOOTING_HARD);
        map.put("reboot_pending_hard", REBOOT_PENDING_HARD);
        map.put("reboot_started_hard", REBOOT_STARTED_HARD);
        map.put("rebuilding", REBUILDING);
        map.put("rebuild_fail", REBUILD_FAIL);
        map.put("updating_tsvi", UPDATING_TSVI);
        map.put("updating_tsvi_failed", UPDATING_TSVI_FAILED);
        map.put("rebuild_block_device_mapping", REBUILD_BLOCK_DEVICE_MAPPING);
        map.put("rebuild_spawning", REBUILD_SPAWNING);
        map.put("migrating", MIGRATING);
        map.put("resize_prep", RESIZE_PREP);
        map.put("resize_migrating", RESIZE_MIGRATING);
        map.put("resize_migrated", RESIZE_MIGRATED);
        map.put("resize_finish", RESIZE_FINISH);
        map.put("resize_reverting", RESIZE_REVERTING);
        map.put("powering-off", POWERING_OFF);
        map.put("powering-on", POWERING_ON);
        map.put("deleting", DELETING);
        map.put("rejoining_domain", REJOINING_DOMAIN);
        map.put("source_locking", SOURCE_LOCKING);
        map.put("delete_failed", DELETE_FAILED);
        map.put("updating_sid", UPDATING_SID);
        map.put("upgrading_access_agent", UPGRADING_ACCESS_AGENT);
        map.put("upgrad_access_agent_fail", UPGRAD_ACCESS_AGENT_FAIL);
        map.put("upgrad_access_agent_success", UPGRAD_ACCESS_AGENT_SUCCESS);
        map.put("migrate_failed", MIGRATE_FAILED);
        map.put("build_image", BUILD_IMAGE);
        map.put("build_snapshot", BUILD_SNAPSHOT);
        map.put("restore_snapshot", RESTORE_SNAPSHOT);
        map.put("null", NULL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AppServerTaskStatus(String value) {
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
    public static AppServerTaskStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppServerTaskStatus(value));
    }

    public static AppServerTaskStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AppServerTaskStatus) {
            return this.value.equals(((AppServerTaskStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
