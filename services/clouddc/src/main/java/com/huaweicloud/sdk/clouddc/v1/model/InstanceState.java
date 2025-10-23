package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 实例状态 **约束限制**： 不涉及 **取值范围**： - pending：实例正在启动（分配资源/启动操作系统） - running：实例正常运行（可接受SSH/RDP连接） - stopping：实例正在关闭（停止/休眠过渡状态） - stopped： 实例已完全关闭（存储卷保留） - reinstalling：实例正在重装中 - shutting-down：实例正在终止（删除流程中） - terminated：实例已终止（资源完全删除，不可恢复） - failed：实例处于失败状态，对于reinstall操作可重试，其它操作不可重试并清除相关资源 - modifyIping：实例正在修改ip中 - switch-installing：实例正在切换系统中  &#x60;&#x60;&#x60;mermaid stateDiagram-v2      [*] --&gt; pending : RunInstances/CreateInstance     pending --&gt; running : Provision Finished     reinstalling --&gt; running : Provision Finished     running --&gt; stopping : PowerOff/PowerReboot     stopping --&gt; stopped : PowerOff Finished     stopped --&gt; running : PowerOn | ModifyIP     stopped --&gt; stopped : ChangePassword     pending --&gt; shutting_down : Abort by DeleteInstance     running --&gt; shutting_down : DeleteInstance     running --&gt; switch-installing : SwitchOS     switch-installing --&gt; running : SwitchOS finished     switch-installing --&gt; failed : SwitchOS failed     stopped --&gt; shutting_down : DeleteInstance     stopped --&gt; reinstalling : ReinstallOS     shutting_down --&gt;terminated: DeleteInstance Finished     pending --&gt; failed : Error     shutting_down --&gt; failed : Error     reinstalling --&gt; failed : Error     failed --&gt; reinstalling: Retry     running --&gt; modifyIping : Modify Ip     modifyIping --&gt; running : Modify Ip finished     modifyIping --&gt; failed : Modify Ip failed     failed --&gt; modifyIping : Retrey &#x60;&#x60;&#x60;    **默认取值**：   不涉及 
 */
public class InstanceState {

    /**
     * Enum PENDING for value: "pending"
     */
    public static final InstanceState PENDING = new InstanceState("pending");

    /**
     * Enum RUNNING for value: "running"
     */
    public static final InstanceState RUNNING = new InstanceState("running");

    /**
     * Enum STOPPING for value: "stopping"
     */
    public static final InstanceState STOPPING = new InstanceState("stopping");

    /**
     * Enum STOPPED for value: "stopped"
     */
    public static final InstanceState STOPPED = new InstanceState("stopped");

    /**
     * Enum REINSTALLING for value: "reinstalling"
     */
    public static final InstanceState REINSTALLING = new InstanceState("reinstalling");

    /**
     * Enum SHUTTING_DOWN for value: "shutting-down"
     */
    public static final InstanceState SHUTTING_DOWN = new InstanceState("shutting-down");

    /**
     * Enum TERMINATED for value: "terminated"
     */
    public static final InstanceState TERMINATED = new InstanceState("terminated");

    /**
     * Enum FAILED for value: "failed"
     */
    public static final InstanceState FAILED = new InstanceState("failed");

    /**
     * Enum MODIFYIPING for value: "modifyIping"
     */
    public static final InstanceState MODIFYIPING = new InstanceState("modifyIping");

    /**
     * Enum SWITCH_INSTALLING for value: "switch-installing"
     */
    public static final InstanceState SWITCH_INSTALLING = new InstanceState("switch-installing");

    private static final Map<String, InstanceState> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstanceState> createStaticFields() {
        Map<String, InstanceState> map = new HashMap<>();
        map.put("pending", PENDING);
        map.put("running", RUNNING);
        map.put("stopping", STOPPING);
        map.put("stopped", STOPPED);
        map.put("reinstalling", REINSTALLING);
        map.put("shutting-down", SHUTTING_DOWN);
        map.put("terminated", TERMINATED);
        map.put("failed", FAILED);
        map.put("modifyIping", MODIFYIPING);
        map.put("switch-installing", SWITCH_INSTALLING);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    InstanceState(String value) {
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
    public static InstanceState fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstanceState(value));
    }

    public static InstanceState valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof InstanceState) {
            return this.value.equals(((InstanceState) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
