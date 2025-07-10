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
public class ListScriptTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_group_id")

    private List<String> resourceGroupId = null;

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
    @JsonProperty(value = "resource_group_type")

    private String resourceGroupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private List<String> taskId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_start")

    private String executeTimeStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_end")

    private String executeTimeEnd;

    public ListScriptTasksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量，默认值0。
     * minimum: 0
     * maximum: 2147483646
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListScriptTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的大小[1-100]，默认值10。
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

    public ListScriptTasksRequest withResourceGroupId(List<String> resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public ListScriptTasksRequest addResourceGroupIdItem(String resourceGroupIdItem) {
        if (this.resourceGroupId == null) {
            this.resourceGroupId = new ArrayList<>();
        }
        this.resourceGroupId.add(resourceGroupIdItem);
        return this;
    }

    public ListScriptTasksRequest withResourceGroupId(Consumer<List<String>> resourceGroupIdSetter) {
        if (this.resourceGroupId == null) {
            this.resourceGroupId = new ArrayList<>();
        }
        resourceGroupIdSetter.accept(this.resourceGroupId);
        return this;
    }

    /**
     * 执行脚本的资源组ID。
     * @return resourceGroupId
     */
    public List<String> getResourceGroupId() {
        return resourceGroupId;
    }

    public void setResourceGroupId(List<String> resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
    }

    public ListScriptTasksRequest withScriptId(String scriptId) {
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

    public ListScriptTasksRequest withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * 脚本名。
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public ListScriptTasksRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 执行情况。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListScriptTasksRequest withResourceGroupType(String resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
        return this;
    }

    /**
     * 资源组类型。
     * @return resourceGroupType
     */
    public String getResourceGroupType() {
        return resourceGroupType;
    }

    public void setResourceGroupType(String resourceGroupType) {
        this.resourceGroupType = resourceGroupType;
    }

    public ListScriptTasksRequest withTaskId(List<String> taskId) {
        this.taskId = taskId;
        return this;
    }

    public ListScriptTasksRequest addTaskIdItem(String taskIdItem) {
        if (this.taskId == null) {
            this.taskId = new ArrayList<>();
        }
        this.taskId.add(taskIdItem);
        return this;
    }

    public ListScriptTasksRequest withTaskId(Consumer<List<String>> taskIdSetter) {
        if (this.taskId == null) {
            this.taskId = new ArrayList<>();
        }
        taskIdSetter.accept(this.taskId);
        return this;
    }

    /**
     * 执行脚本的任务ID。
     * @return taskId
     */
    public List<String> getTaskId() {
        return taskId;
    }

    public void setTaskId(List<String> taskId) {
        this.taskId = taskId;
    }

    public ListScriptTasksRequest withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 任务类型(SCRIPT/COMMAND)。
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ListScriptTasksRequest withExecuteTimeStart(String executeTimeStart) {
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

    public ListScriptTasksRequest withExecuteTimeEnd(String executeTimeEnd) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScriptTasksRequest that = (ListScriptTasksRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.resourceGroupId, that.resourceGroupId)
            && Objects.equals(this.scriptId, that.scriptId) && Objects.equals(this.scriptName, that.scriptName)
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.resourceGroupType, that.resourceGroupType)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.executeTimeStart, that.executeTimeStart)
            && Objects.equals(this.executeTimeEnd, that.executeTimeEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            resourceGroupId,
            scriptId,
            scriptName,
            status,
            resourceGroupType,
            taskId,
            taskType,
            executeTimeStart,
            executeTimeEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScriptTasksRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    resourceGroupId: ").append(toIndentedString(resourceGroupId)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    resourceGroupType: ").append(toIndentedString(resourceGroupType)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    executeTimeStart: ").append(toIndentedString(executeTimeStart)).append("\n");
        sb.append("    executeTimeEnd: ").append(toIndentedString(executeTimeEnd)).append("\n");
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
