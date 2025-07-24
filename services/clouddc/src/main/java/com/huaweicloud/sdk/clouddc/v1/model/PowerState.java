package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 电源状态 power_state 会根据不同的操作和事件发生转换，常见的状态转换流程如下：   - 开机流程：off -&gt; powering-on -&gt; on   - 关机流程：on -&gt; powering-off -&gt; off   - 重启流程：on -&gt; rebooting -&gt; on  **约束限制**： 不涉及 **取值范围**： - on：表示节点的电源已开启，硬件处于通电状态，操作系统正在运行或者可以正常启动。这意味着节点能够执行计算任务，为上层应用提供服务。 示例场景：当用户在 Ironic 中创建并激活一个节点，或者手动开启节点电源后，节点的 power_state 会变为 power on。 - off：表明节点的电源已关闭，硬件停止供电，所有组件处于非工作状态，无法执行任何计算任务。 示例场景：在维护节点或者不需要使用节点资源时，管理员可以将节点的电源关闭，此时 power_state 变为 power off。 - rebooting：节点正在进行重启操作，即先关闭电源，然后再重新开启。在这个过程中，节点会经历硬件初始化和操作系统启动等步骤。   示例场景：当管理员通过 Ironic API 发送重启节点的指令后，节点的 power_state 会暂时变为 rebooting，直到重启完成。 - powering-on：节点正在开启电源的过程中，此时硬件开始通电，但操作系统可能还未完全启动。 示例场景：当管理员发送开机指令后，节点会进入 powering on 状态，直到操作系统成功启动，power_state 变为 power on。 - powering-off：节点正在关闭电源的过程中，操作系统会进行一些清理工作，如保存数据、关闭服务等，然后切断硬件的电源供应。  示例场景：当管理员发送关机指令后，节点会进入 powering off 状态，直到电源完全关闭，power_state 变为  off。  **默认取值**： 不涉及 
 */
public class PowerState {

    /**
     * Enum ON for value: "on"
     */
    public static final PowerState ON = new PowerState("on");

    /**
     * Enum POWERING_ON for value: "powering-on"
     */
    public static final PowerState POWERING_ON = new PowerState("powering-on");

    /**
     * Enum OFF for value: "off"
     */
    public static final PowerState OFF = new PowerState("off");

    /**
     * Enum REBOOTING for value: "rebooting"
     */
    public static final PowerState REBOOTING = new PowerState("rebooting");

    /**
     * Enum POWERING_OFF for value: "powering-off"
     */
    public static final PowerState POWERING_OFF = new PowerState("powering-off");

    private static final Map<String, PowerState> STATIC_FIELDS = createStaticFields();

    private static Map<String, PowerState> createStaticFields() {
        Map<String, PowerState> map = new HashMap<>();
        map.put("on", ON);
        map.put("powering-on", POWERING_ON);
        map.put("off", OFF);
        map.put("rebooting", REBOOTING);
        map.put("powering-off", POWERING_OFF);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    PowerState(String value) {
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
    public static PowerState fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PowerState(value));
    }

    public static PowerState valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PowerState) {
            return this.value.equals(((PowerState) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
