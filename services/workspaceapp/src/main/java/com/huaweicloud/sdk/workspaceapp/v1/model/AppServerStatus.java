package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 服务器的稳态，完成某个操作的稳定状态。 * &#x60;BUILD&#x60; - 创建APS实例,APS实例进入运行之前的状态 * &#x60;BUILD_FAIL&#x60; - 创建APS实例失败 * &#x60;REBOOT&#x60; - 实例正在进行重启操作 * &#x60;HARD_REBOOT&#x60; - 实例正在进行强制重启操作 * &#x60;REBUILD&#x60; - 实例正在重建中 * &#x60;REBUILD_FAIL&#x60; - 实例重建失败 * &#x60;MIGRATING&#x60; - 实例正在热迁移中 * &#x60;RESIZE&#x60; - 实例接收变更请求，开始进行变更操作 * &#x60;ACTIVE&#x60; - 实例正常运行状态 * &#x60;SHUTOFF&#x60; - 实例被正常停止 * &#x60;REVERT_RESIZE&#x60; - 实例正在回退变更规格的配置 * &#x60;VERIFY_RESIZE&#x60; - 实例正在校验变更完成后的配置。 * &#x60;ERROR&#x60; - 实例处于异常状态。 * &#x60;DELETING&#x60; - 实例删除中。 * &#x60;FREEZE&#x60; - 冻结 * &#x60;BUILD_IMAGE&#x60; - 生成镜像中 * &#x60;BUILD_SNAPSHOT&#x60; - 生成快照中 * &#x60;RESTORE_SNAPSHOT&#x60; - 恢复快照中 * &#x60;NULL&#x60; - 未设置
 */
public class AppServerStatus {

    /**
     * Enum BUILD for value: "BUILD"
     */
    public static final AppServerStatus BUILD = new AppServerStatus("BUILD");

    /**
     * Enum BUILD_FAIL for value: "BUILD_FAIL"
     */
    public static final AppServerStatus BUILD_FAIL = new AppServerStatus("BUILD_FAIL");

    /**
     * Enum REBOOT for value: "REBOOT"
     */
    public static final AppServerStatus REBOOT = new AppServerStatus("REBOOT");

    /**
     * Enum HARD_REBOOT for value: "HARD_REBOOT"
     */
    public static final AppServerStatus HARD_REBOOT = new AppServerStatus("HARD_REBOOT");

    /**
     * Enum REBUILD for value: "REBUILD"
     */
    public static final AppServerStatus REBUILD = new AppServerStatus("REBUILD");

    /**
     * Enum REBUILD_FAIL for value: "REBUILD_FAIL"
     */
    public static final AppServerStatus REBUILD_FAIL = new AppServerStatus("REBUILD_FAIL");

    /**
     * Enum MIGRATING for value: "MIGRATING"
     */
    public static final AppServerStatus MIGRATING = new AppServerStatus("MIGRATING");

    /**
     * Enum RESIZE for value: "RESIZE"
     */
    public static final AppServerStatus RESIZE = new AppServerStatus("RESIZE");

    /**
     * Enum ACTIVE for value: "ACTIVE"
     */
    public static final AppServerStatus ACTIVE = new AppServerStatus("ACTIVE");

    /**
     * Enum SHUTOFF for value: "SHUTOFF"
     */
    public static final AppServerStatus SHUTOFF = new AppServerStatus("SHUTOFF");

    /**
     * Enum REVERT_RESIZE for value: "REVERT_RESIZE"
     */
    public static final AppServerStatus REVERT_RESIZE = new AppServerStatus("REVERT_RESIZE");

    /**
     * Enum VERIFY_RESIZE for value: "VERIFY_RESIZE"
     */
    public static final AppServerStatus VERIFY_RESIZE = new AppServerStatus("VERIFY_RESIZE");

    /**
     * Enum ERROR for value: "ERROR"
     */
    public static final AppServerStatus ERROR = new AppServerStatus("ERROR");

    /**
     * Enum DELETING for value: "DELETING"
     */
    public static final AppServerStatus DELETING = new AppServerStatus("DELETING");

    /**
     * Enum FREEZE for value: "FREEZE"
     */
    public static final AppServerStatus FREEZE = new AppServerStatus("FREEZE");

    /**
     * Enum BUILD_IMAGE for value: "BUILD_IMAGE"
     */
    public static final AppServerStatus BUILD_IMAGE = new AppServerStatus("BUILD_IMAGE");

    /**
     * Enum BUILD_SNAPSHOT for value: "BUILD_SNAPSHOT"
     */
    public static final AppServerStatus BUILD_SNAPSHOT = new AppServerStatus("BUILD_SNAPSHOT");

    /**
     * Enum RESTORE_SNAPSHOT for value: "RESTORE_SNAPSHOT"
     */
    public static final AppServerStatus RESTORE_SNAPSHOT = new AppServerStatus("RESTORE_SNAPSHOT");

    /**
     * Enum NULL for value: "null"
     */
    public static final AppServerStatus NULL = new AppServerStatus("null");

    private static final Map<String, AppServerStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, AppServerStatus> createStaticFields() {
        Map<String, AppServerStatus> map = new HashMap<>();
        map.put("BUILD", BUILD);
        map.put("BUILD_FAIL", BUILD_FAIL);
        map.put("REBOOT", REBOOT);
        map.put("HARD_REBOOT", HARD_REBOOT);
        map.put("REBUILD", REBUILD);
        map.put("REBUILD_FAIL", REBUILD_FAIL);
        map.put("MIGRATING", MIGRATING);
        map.put("RESIZE", RESIZE);
        map.put("ACTIVE", ACTIVE);
        map.put("SHUTOFF", SHUTOFF);
        map.put("REVERT_RESIZE", REVERT_RESIZE);
        map.put("VERIFY_RESIZE", VERIFY_RESIZE);
        map.put("ERROR", ERROR);
        map.put("DELETING", DELETING);
        map.put("FREEZE", FREEZE);
        map.put("BUILD_IMAGE", BUILD_IMAGE);
        map.put("BUILD_SNAPSHOT", BUILD_SNAPSHOT);
        map.put("RESTORE_SNAPSHOT", RESTORE_SNAPSHOT);
        map.put("null", NULL);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    AppServerStatus(String value) {
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
    public static AppServerStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AppServerStatus(value));
    }

    public static AppServerStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AppServerStatus) {
            return this.value.equals(((AppServerStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
