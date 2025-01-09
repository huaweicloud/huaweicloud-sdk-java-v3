package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 脚本执行记录信息。
 */
public class ScriptRecordSimpleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_task_id")

    private String scriptTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_order")

    private Integer executeOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_content")

    private String commandContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command_type")

    private String commandType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason")

    private String reason;

    public ScriptRecordSimpleInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 脚本执行记录ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScriptRecordSimpleInfo withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 脚本ID。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public ScriptRecordSimpleInfo withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * 脚本名称。
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public ScriptRecordSimpleInfo withScriptTaskId(String scriptTaskId) {
        this.scriptTaskId = scriptTaskId;
        return this;
    }

    /**
     * 脚本执行的任务ID。
     * @return scriptTaskId
     */
    public String getScriptTaskId() {
        return scriptTaskId;
    }

    public void setScriptTaskId(String scriptTaskId) {
        this.scriptTaskId = scriptTaskId;
    }

    public ScriptRecordSimpleInfo withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 执行脚本的资源ID，如桌面ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ScriptRecordSimpleInfo withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 执行脚本的资源名称，如桌面名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ScriptRecordSimpleInfo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，如桌面(DESKTOP)。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ScriptRecordSimpleInfo withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 脚本执行开始时间。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public ScriptRecordSimpleInfo withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 脚本执行结束时间。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public ScriptRecordSimpleInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 脚本执行状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ScriptRecordSimpleInfo withExecuteOrder(Integer executeOrder) {
        this.executeOrder = executeOrder;
        return this;
    }

    /**
     * 执行批次（默认：0，灰度：1，非灰度：2）。
     * @return executeOrder
     */
    public Integer getExecuteOrder() {
        return executeOrder;
    }

    public void setExecuteOrder(Integer executeOrder) {
        this.executeOrder = executeOrder;
    }

    public ScriptRecordSimpleInfo withCommandContent(String commandContent) {
        this.commandContent = commandContent;
        return this;
    }

    /**
     * 命令行内容。
     * @return commandContent
     */
    public String getCommandContent() {
        return commandContent;
    }

    public void setCommandContent(String commandContent) {
        this.commandContent = commandContent;
    }

    public ScriptRecordSimpleInfo withCommandType(String commandType) {
        this.commandType = commandType;
        return this;
    }

    /**
     * 命令行类型(POWERSHELL/BAT/SHELL)。
     * @return commandType
     */
    public String getCommandType() {
        return commandType;
    }

    public void setCommandType(String commandType) {
        this.commandType = commandType;
    }

    public ScriptRecordSimpleInfo withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 错误码。
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public ScriptRecordSimpleInfo withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * 原因。
     * @return reason
     */
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScriptRecordSimpleInfo that = (ScriptRecordSimpleInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.scriptId, that.scriptId)
            && Objects.equals(this.scriptName, that.scriptName) && Objects.equals(this.scriptTaskId, that.scriptTaskId)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.executeOrder, that.executeOrder)
            && Objects.equals(this.commandContent, that.commandContent)
            && Objects.equals(this.commandType, that.commandType) && Objects.equals(this.resultCode, that.resultCode)
            && Objects.equals(this.reason, that.reason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            scriptId,
            scriptName,
            scriptTaskId,
            resourceId,
            resourceName,
            resourceType,
            startTime,
            endTime,
            status,
            executeOrder,
            commandContent,
            commandType,
            resultCode,
            reason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScriptRecordSimpleInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    scriptTaskId: ").append(toIndentedString(scriptTaskId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    executeOrder: ").append(toIndentedString(executeOrder)).append("\n");
        sb.append("    commandContent: ").append(toIndentedString(commandContent)).append("\n");
        sb.append("    commandType: ").append(toIndentedString(commandType)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
