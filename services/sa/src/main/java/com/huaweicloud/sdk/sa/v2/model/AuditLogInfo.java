package com.huaweicloud.sdk.sa.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Audit Log Info
 */
public class AuditLogInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_name")

    private String actionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_instance_id")

    private String parentInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_level")

    private String logLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private String input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output")

    private String output;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    public AuditLogInfo withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * instance type.
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public AuditLogInfo withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * Action id.
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public AuditLogInfo withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * action name.
     * @return actionName
     */
    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public AuditLogInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * Instance id.
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AuditLogInfo withParentInstanceId(String parentInstanceId) {
        this.parentInstanceId = parentInstanceId;
        return this;
    }

    /**
     * parent instance id.
     * @return parentInstanceId
     */
    public String getParentInstanceId() {
        return parentInstanceId;
    }

    public void setParentInstanceId(String parentInstanceId) {
        this.parentInstanceId = parentInstanceId;
    }

    public AuditLogInfo withLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }

    /**
     * log level.
     * @return logLevel
     */
    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    public AuditLogInfo withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * input.
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public AuditLogInfo withOutput(String output) {
        this.output = output;
        return this;
    }

    /**
     * output.
     * @return output
     */
    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public AuditLogInfo withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * error_msg.
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public AuditLogInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * start_time.
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public AuditLogInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * end_time.
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public AuditLogInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * status.
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AuditLogInfo withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * trigger type.
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuditLogInfo auditLogInfo = (AuditLogInfo) o;
        return Objects.equals(this.instanceType, auditLogInfo.instanceType)
            && Objects.equals(this.actionId, auditLogInfo.actionId)
            && Objects.equals(this.actionName, auditLogInfo.actionName)
            && Objects.equals(this.instanceId, auditLogInfo.instanceId)
            && Objects.equals(this.parentInstanceId, auditLogInfo.parentInstanceId)
            && Objects.equals(this.logLevel, auditLogInfo.logLevel) && Objects.equals(this.input, auditLogInfo.input)
            && Objects.equals(this.output, auditLogInfo.output) && Objects.equals(this.errorMsg, auditLogInfo.errorMsg)
            && Objects.equals(this.startTime, auditLogInfo.startTime)
            && Objects.equals(this.endTime, auditLogInfo.endTime) && Objects.equals(this.status, auditLogInfo.status)
            && Objects.equals(this.triggerType, auditLogInfo.triggerType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceType,
            actionId,
            actionName,
            instanceId,
            parentInstanceId,
            logLevel,
            input,
            output,
            errorMsg,
            startTime,
            endTime,
            status,
            triggerType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditLogInfo {\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    parentInstanceId: ").append(toIndentedString(parentInstanceId)).append("\n");
        sb.append("    logLevel: ").append(toIndentedString(logLevel)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
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
