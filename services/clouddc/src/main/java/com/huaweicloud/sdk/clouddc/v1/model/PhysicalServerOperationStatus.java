package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **约束限制**： 不涉及 **取值范围**： - power-on-processing: 节点正在开启电源的过程中，此时硬件开始通电，但操作系统可能还未完全启动。 - power-on-succeed: 开启电源成功。 - power-on-failed: 开启电源失败。 - power-off-processing: 节点正在关闭电源的过程中，操作系统会进行一些清理工作，如保存数据、关闭服务等，然后切断硬件的电源供应。 - power-off-succeed: 关闭电源成功。 - power-off-failed: 关闭电源失败。 - reboot-processing: 节点正在进行重启操作，即先关闭电源，然后再重新开启。在这个过程中，节点会经历硬件初始化和操作系统启动等步骤。 - reboot-succeed: 重启操作成功。 - reboot-failed: 重启操作失败。  **默认取值**： 不涉及 
 */
public class PhysicalServerOperationStatus {

    /**
     * Enum POWER_ON_PROCESSING for value: "power-on-processing"
     */
    public static final PhysicalServerOperationStatus POWER_ON_PROCESSING =
        new PhysicalServerOperationStatus("power-on-processing");

    /**
     * Enum POWER_ON_SUCCEED for value: "power-on-succeed"
     */
    public static final PhysicalServerOperationStatus POWER_ON_SUCCEED =
        new PhysicalServerOperationStatus("power-on-succeed");

    /**
     * Enum POWER_ON_FAILED for value: "power-on-failed"
     */
    public static final PhysicalServerOperationStatus POWER_ON_FAILED =
        new PhysicalServerOperationStatus("power-on-failed");

    /**
     * Enum POWER_OFF_PROCESSING for value: "power-off-processing"
     */
    public static final PhysicalServerOperationStatus POWER_OFF_PROCESSING =
        new PhysicalServerOperationStatus("power-off-processing");

    /**
     * Enum POWER_OFF_SUCCEED for value: "power-off-succeed"
     */
    public static final PhysicalServerOperationStatus POWER_OFF_SUCCEED =
        new PhysicalServerOperationStatus("power-off-succeed");

    /**
     * Enum POWER_OFF_FAILED for value: "power-off-failed"
     */
    public static final PhysicalServerOperationStatus POWER_OFF_FAILED =
        new PhysicalServerOperationStatus("power-off-failed");

    /**
     * Enum REBOOT_PROCESSING for value: "reboot-processing"
     */
    public static final PhysicalServerOperationStatus REBOOT_PROCESSING =
        new PhysicalServerOperationStatus("reboot-processing");

    /**
     * Enum REBOOT_SUCCEED for value: "reboot-succeed"
     */
    public static final PhysicalServerOperationStatus REBOOT_SUCCEED =
        new PhysicalServerOperationStatus("reboot-succeed");

    /**
     * Enum REBOOT_FAILED for value: "reboot-failed"
     */
    public static final PhysicalServerOperationStatus REBOOT_FAILED =
        new PhysicalServerOperationStatus("reboot-failed");

    private static final Map<String, PhysicalServerOperationStatus> STATIC_FIELDS = createStaticFields();

    private static Map<String, PhysicalServerOperationStatus> createStaticFields() {
        Map<String, PhysicalServerOperationStatus> map = new HashMap<>();
        map.put("power-on-processing", POWER_ON_PROCESSING);
        map.put("power-on-succeed", POWER_ON_SUCCEED);
        map.put("power-on-failed", POWER_ON_FAILED);
        map.put("power-off-processing", POWER_OFF_PROCESSING);
        map.put("power-off-succeed", POWER_OFF_SUCCEED);
        map.put("power-off-failed", POWER_OFF_FAILED);
        map.put("reboot-processing", REBOOT_PROCESSING);
        map.put("reboot-succeed", REBOOT_SUCCEED);
        map.put("reboot-failed", REBOOT_FAILED);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PhysicalServerOperationStatus(String value) {
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
    public static PhysicalServerOperationStatus fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PhysicalServerOperationStatus(value));
    }

    public static PhysicalServerOperationStatus valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PhysicalServerOperationStatus) {
            return this.value.equals(((PhysicalServerOperationStatus) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
