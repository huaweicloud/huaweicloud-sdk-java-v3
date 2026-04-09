package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * **参数解释**： 实例状态 **约束限制**： 不涉及 **取值范围**： - pending：实例正在启动（分配资源/启动操作系统） - running：实例正常运行（可接受SSH/RDP连接） - stopped： 实例已完全关闭（存储卷保留） - shutting-down：实例正在终止（删除流程中） - terminated：实例已终止（资源完全删除，不可恢复） - error：实例处于异常状态（资源未完全删除）  &#x60;&#x60;&#x60;mermaid stateDiagram-v2     [*] --&gt; pending: CreateInstance     pending --&gt; running: CreateInstance Succeed     pending --&gt; shutting_down: DeleteInstance     running --&gt; stopped: PowerOff/PowerReboot     stopped --&gt; running: PowerOn/Provision Succeed     stopped --&gt; stopped: ChangePassword     pending --&gt; error: CreateInstance Failed     stopped --&gt; error: Provision Failed     error --&gt; running: Retry Provision Succeed     stopped --&gt; shutting_down: DeleteInstance     error --&gt; shutting_down: Retry DeleteInstance     shutting_down --&gt; error: DeleteInstance Failed     shutting_down --&gt; terminated: DeleteInstance Succeed &#x60;&#x60;&#x60;  **默认取值**： 不涉及
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
     * Enum STOPPED for value: "stopped"
     */
    public static final InstanceState STOPPED = new InstanceState("stopped");

    /**
     * Enum SHUTTING_DOWN for value: "shutting-down"
     */
    public static final InstanceState SHUTTING_DOWN = new InstanceState("shutting-down");

    /**
     * Enum TERMINATED for value: "terminated"
     */
    public static final InstanceState TERMINATED = new InstanceState("terminated");

    /**
     * Enum ERROR for value: "error"
     */
    public static final InstanceState ERROR = new InstanceState("error");

    private static final Map<String, InstanceState> STATIC_FIELDS = createStaticFields();

    private static Map<String, InstanceState> createStaticFields() {
        Map<String, InstanceState> map = new HashMap<>();
        map.put("pending", PENDING);
        map.put("running", RUNNING);
        map.put("stopped", STOPPED);
        map.put("shutting-down", SHUTTING_DOWN);
        map.put("terminated", TERMINATED);
        map.put("error", ERROR);
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
