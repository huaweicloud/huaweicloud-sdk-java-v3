package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 流程实例
 */
public class ActionInstanceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private ActionInfo action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_log")

    private AuditLogInfo instanceLog;

    public ActionInstanceInfo withAction(ActionInfo action) {
        this.action = action;
        return this;
    }

    public ActionInstanceInfo withAction(Consumer<ActionInfo> actionSetter) {
        if (this.action == null) {
            this.action = new ActionInfo();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public ActionInfo getAction() {
        return action;
    }

    public void setAction(ActionInfo action) {
        this.action = action;
    }

    public ActionInstanceInfo withInstanceLog(AuditLogInfo instanceLog) {
        this.instanceLog = instanceLog;
        return this;
    }

    public ActionInstanceInfo withInstanceLog(Consumer<AuditLogInfo> instanceLogSetter) {
        if (this.instanceLog == null) {
            this.instanceLog = new AuditLogInfo();
            instanceLogSetter.accept(this.instanceLog);
        }

        return this;
    }

    /**
     * Get instanceLog
     * @return instanceLog
     */
    public AuditLogInfo getInstanceLog() {
        return instanceLog;
    }

    public void setInstanceLog(AuditLogInfo instanceLog) {
        this.instanceLog = instanceLog;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionInstanceInfo that = (ActionInstanceInfo) obj;
        return Objects.equals(this.action, that.action) && Objects.equals(this.instanceLog, that.instanceLog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, instanceLog);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionInstanceInfo {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    instanceLog: ").append(toIndentedString(instanceLog)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
