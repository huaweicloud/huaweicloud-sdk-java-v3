package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 电源状态 power_state 会根据不同的操作和事件发生转换，常见的状态转换流程如下：   - 开机流程：off -&gt; on   - 关机流程：on -&gt; off   - 重启流程：on -&gt; off -&gt; on  **约束限制**： 不涉及 **取值范围**： - on：表示节点的电源已开启，硬件处于通电状态，操作系统正在运行或者可以正常启动。这意味着节点能够执行计算任务，为上层应用提供服务。 - off：表明节点的电源已关闭，硬件停止供电，所有组件处于非工作状态，无法执行任何计算任务。  **默认取值**： 不涉及 
 */
public class PowerState {

    /**
     * Enum ON for value: "on"
     */
    public static final PowerState ON = new PowerState("on");

    /**
     * Enum OFF for value: "off"
     */
    public static final PowerState OFF = new PowerState("off");

    private static final Map<String, PowerState> STATIC_FIELDS = createStaticFields();

    private static Map<String, PowerState> createStaticFields() {
        Map<String, PowerState> map = new HashMap<>();
        map.put("on", ON);
        map.put("off", OFF);
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
