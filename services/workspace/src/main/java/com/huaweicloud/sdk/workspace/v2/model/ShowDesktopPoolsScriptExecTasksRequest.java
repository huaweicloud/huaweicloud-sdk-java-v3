package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowDesktopPoolsScriptExecTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_id")

    private String desktopPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_start")

    private String executeTimeStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_end")

    private String executeTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private List<String> taskId = null;

    public ShowDesktopPoolsScriptExecTasksRequest withDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
        return this;
    }

    /**
     * 桌面池id。
     * @return desktopPoolId
     */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }

    public void setDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
    }

    public ShowDesktopPoolsScriptExecTasksRequest withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 脚本id。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public ShowDesktopPoolsScriptExecTasksRequest withScriptName(String scriptName) {
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

    public ShowDesktopPoolsScriptExecTasksRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 执行情况。SUCCESS：成功，FAILED：失败，RUNNING：执行中，WAITING：等待。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDesktopPoolsScriptExecTasksRequest withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 查询的任务类型。支持SCRIPT、COMMAND。
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ShowDesktopPoolsScriptExecTasksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 用于分页查询，查询的起始记录序号，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowDesktopPoolsScriptExecTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 用于分页查询，返回桌面数量限制。取值范围0-100，默认值是10。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowDesktopPoolsScriptExecTasksRequest withExecuteTimeStart(String executeTimeStart) {
        this.executeTimeStart = executeTimeStart;
        return this;
    }

    /**
     * 按执行时间查询的起始时间。指定该参数后，返回的结果为此时间之后的所有任务记录。时间格式如：“2021-10-01T12:00:00Z”。
     * @return executeTimeStart
     */
    public String getExecuteTimeStart() {
        return executeTimeStart;
    }

    public void setExecuteTimeStart(String executeTimeStart) {
        this.executeTimeStart = executeTimeStart;
    }

    public ShowDesktopPoolsScriptExecTasksRequest withExecuteTimeEnd(String executeTimeEnd) {
        this.executeTimeEnd = executeTimeEnd;
        return this;
    }

    /**
     * 按执行时间查询的终止时间。指定该参数后，返回的结果为此时间之前的所有任务记录。时间格式如：“2021-10-01T12:00:00Z”。
     * @return executeTimeEnd
     */
    public String getExecuteTimeEnd() {
        return executeTimeEnd;
    }

    public void setExecuteTimeEnd(String executeTimeEnd) {
        this.executeTimeEnd = executeTimeEnd;
    }

    public ShowDesktopPoolsScriptExecTasksRequest withTaskId(List<String> taskId) {
        this.taskId = taskId;
        return this;
    }

    public ShowDesktopPoolsScriptExecTasksRequest addTaskIdItem(String taskIdItem) {
        if (this.taskId == null) {
            this.taskId = new ArrayList<>();
        }
        this.taskId.add(taskIdItem);
        return this;
    }

    public ShowDesktopPoolsScriptExecTasksRequest withTaskId(Consumer<List<String>> taskIdSetter) {
        if (this.taskId == null) {
            this.taskId = new ArrayList<>();
        }
        taskIdSetter.accept(this.taskId);
        return this;
    }

    /**
     * 任务id。
     * @return taskId
     */
    public List<String> getTaskId() {
        return taskId;
    }

    public void setTaskId(List<String> taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDesktopPoolsScriptExecTasksRequest that = (ShowDesktopPoolsScriptExecTasksRequest) obj;
        return Objects.equals(this.desktopPoolId, that.desktopPoolId) && Objects.equals(this.scriptId, that.scriptId)
            && Objects.equals(this.scriptName, that.scriptName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.executeTimeStart, that.executeTimeStart)
            && Objects.equals(this.executeTimeEnd, that.executeTimeEnd) && Objects.equals(this.taskId, that.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopPoolId,
            scriptId,
            scriptName,
            status,
            taskType,
            offset,
            limit,
            executeTimeStart,
            executeTimeEnd,
            taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDesktopPoolsScriptExecTasksRequest {\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    executeTimeStart: ").append(toIndentedString(executeTimeStart)).append("\n");
        sb.append("    executeTimeEnd: ").append(toIndentedString(executeTimeEnd)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
