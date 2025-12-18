package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**:  操作状态 **约束限制**:  不涉及 **取值范围**:  - install-processing: 安装OS中 - install-succeed: 安装OS成功 - install-failed: 安装OS失败 - reinstall-processing: 重装OS中 - reinstall-succeed: 重装OS成功 - reinstall-failed: 重装OS失败 - switch-install-processing: 切换OS中 - switch-install-succeed: 切换OS成功 - switch-install-failed: 切换OS失败 - modify-ip-processing: 修改IP地址中 - modify-ip-succeed: 修改IP地址成功 - modify-ip-failed: 修改IP地址失败 - uninstall-processing: 卸载OS中 - uninstall-succeed: 卸载OS成功 - uninstall-failed: 卸载OS失败  **默认取值**:  不涉及
 */
public class InstanceOperationStatus {

    /**
     * Enum INSTALL_PROCESSING for value: "install-processing"
     */
    public static final InstanceOperationStatus INSTALL_PROCESSING = new InstanceOperationStatus("install-processing");

    /**
     * Enum INSTALL_SUCCEED for value: "install-succeed"
     */
    public static final InstanceOperationStatus INSTALL_SUCCEED = new InstanceOperationStatus("install-succeed");

    /**
     * Enum INSTALL_FAILED for value: "install-failed"
     */
    public static final InstanceOperationStatus INSTALL_FAILED = new InstanceOperationStatus("install-failed");

    /**
     * Enum REINSTALL_PROCESSING for value: "reinstall-processing"
     */
    public static final InstanceOperationStatus REINSTALL_PROCESSING =
        new InstanceOperationStatus("reinstall-processing");

    /**
     * Enum REINSTALL_SUCCEED for value: "reinstall-succeed"
     */
    public static final InstanceOperationStatus REINSTALL_SUCCEED = new InstanceOperationStatus("reinstall-succeed");

    /**
     * Enum REINSTALL_FAILED for value: "reinstall-failed"
     */
    public static final InstanceOperationStatus REINSTALL_FAILED = new InstanceOperationStatus("reinstall-failed");

    /**
     * Enum SWITCH_INSTALL_PROCESSING for value: "switch-install-processing"
     */
    public static final InstanceOperationStatus SWITCH_INSTALL_PROCESSING =
        new InstanceOperationStatus("switch-install-processing");

    /**
     * Enum SWITCH_INSTALL_SUCCEED for value: "switch-install-succeed"
     */
    public static final InstanceOperationStatus SWITCH_INSTALL_SUCCEED =
        new InstanceOperationStatus("switch-install-succeed");

    /**
     * Enum SWITCH_INSTALL_FAILED for value: "switch-install-failed"
     */
    public static final InstanceOperationStatus SWITCH_INSTALL_FAILED =
        new InstanceOperationStatus("switch-install-failed");

    /**
     * Enum MODIFY_IP_PROCESSING for value: "modify-ip-processing"
     */
    public static final InstanceOperationStatus MODIFY_IP_PROCESSING =
        new InstanceOperationStatus("modify-ip-processing");

    /**
     * Enum MODIFY_IP_SUCCEED for value: "modify-ip-succeed"
     */
    public static final InstanceOperationStatus MODIFY_IP_SUCCEED = new InstanceOperationStatus("modify-ip-succeed");

    /**
     * Enum MODIFY_IP_FAILED for value: "modify-ip-failed"
     */
    public static final InstanceOperationStatus MODIFY_IP_FAILED = new InstanceOperationStatus("modify-ip-failed");

    /**
     * Enum UNINSTALL_PROCESSING for value: "uninstall-processing"
     */
    public static final InstanceOperationStatus UNINSTALL_PROCESSING =
        new InstanceOperationStatus("uninstall-processing");

    /**
     * Enum UNINSTALL_SUCCEED for value: "uninstall-succeed"
     */
    public static final InstanceOperationStatus UNINSTALL_SUCCEED = new InstanceOperationStatus("uninstall-succeed");

    /**
     * Enum UNINSTALL_FAILED for value: "uninstall-failed"
     */
    public static final InstanceOperationStatus UNINSTALL_FAILED = new InstanceOperationStatus("uninstall-failed");

    private static final Map<String, InstanceOperationStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstanceOperationStatus> createStaticFields() {
        Map<String, InstanceOperationStatus> map = new HashMap<>();
        map.put("install-processing", INSTALL_PROCESSING);
        map.put("install-succeed", INSTALL_SUCCEED);
        map.put("install-failed", INSTALL_FAILED);
        map.put("reinstall-processing", REINSTALL_PROCESSING);
        map.put("reinstall-succeed", REINSTALL_SUCCEED);
        map.put("reinstall-failed", REINSTALL_FAILED);
        map.put("switch-install-processing", SWITCH_INSTALL_PROCESSING);
        map.put("switch-install-succeed", SWITCH_INSTALL_SUCCEED);
        map.put("switch-install-failed", SWITCH_INSTALL_FAILED);
        map.put("modify-ip-processing", MODIFY_IP_PROCESSING);
        map.put("modify-ip-succeed", MODIFY_IP_SUCCEED);
        map.put("modify-ip-failed", MODIFY_IP_FAILED);
        map.put("uninstall-processing", UNINSTALL_PROCESSING);
        map.put("uninstall-succeed", UNINSTALL_SUCCEED);
        map.put("uninstall-failed", UNINSTALL_FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InstanceOperationStatus(String value) {
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
    public static InstanceOperationStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceOperationStatus(value));
    }

    public static InstanceOperationStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstanceOperationStatus) {
            return this.value.equals(((InstanceOperationStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
