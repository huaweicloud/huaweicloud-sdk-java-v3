package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 实例状态 - pending：实例正在启动（分配资源/启动操作系统） - running：实例正常运行（可接受SSH/RDP连接） - stopping：实例正在关闭（停止/休眠过渡状态） - stopped： 实例已完全关闭（存储卷保留） - reinstalling：实例正在重装中 - shutting-down：实例正在终止（删除流程中） - terminated：实例已终止（资源完全删除，不可恢复） - failed：实例处于失败状态，对于reinstall操作可重试，其它操作不可重试并清除相关资源  &#x60;&#x60;&#x60;mermaid stateDiagram-v2      [*] --&gt; pending : RunInstances/CreateInstance     pending --&gt; running : Provision Finished     reinstalling --&gt; running : Provision Finished     running --&gt; stopping : PowerOff/PowerReboot     stopping --&gt; stopped : PowerOff Finished     stopped --&gt; running : PowerOn | ModifyIP     stopped --&gt; stopped : ChangePassword     pending --&gt; shutting_down : Abort by DeleteInstance     running --&gt; shutting_down : DeleteInstance     stopped --&gt; reinstalling : ReinstallOS     shutting_down --&gt;terminated: DeleteInstance Finished     pending --&gt; failed : Error     shutting_down --&gt; failed : Error     reinstalling --&gt; failed : Error     failed --&gt; reinstalling: Retry &#x60;&#x60;&#x60;
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
     * Enum TEMINATED for value: "teminated"
     */
    public static final InstanceState TEMINATED = new InstanceState("teminated");

    /**
     * Enum FAILED for value: "failed"
     */
    public static final InstanceState FAILED = new InstanceState("failed");

    private static final Map<String, InstanceState> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstanceState> createStaticFields() {
        Map<String, InstanceState> map = new HashMap<>();
        map.put("pending", PENDING);
        map.put("running", RUNNING);
        map.put("stopping", STOPPING);
        map.put("stopped", STOPPED);
        map.put("reinstalling", REINSTALLING);
        map.put("shutting-down", SHUTTING_DOWN);
        map.put("teminated", TEMINATED);
        map.put("failed", FAILED);
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
