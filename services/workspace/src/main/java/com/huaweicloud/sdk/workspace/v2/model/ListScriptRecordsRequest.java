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
public class ListScriptRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private List<String> resourceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_group_id")

    private List<String> resourceGroupId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private List<String> scriptId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private List<String> scriptName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_first_order")

    private Boolean isFirstOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_task_id")

    private String scriptTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private String taskType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_history")

    private Boolean showHistory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_start")

    private String executeTimeStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time_end")

    private String executeTimeEnd;

    public ListScriptRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量。
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

    public ListScriptRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单次查询的大小[1-100]。
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

    public ListScriptRecordsRequest withResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public ListScriptRecordsRequest addResourceIdItem(String resourceIdItem) {
        if (this.resourceId == null) {
            this.resourceId = new ArrayList<>();
        }
        this.resourceId.add(resourceIdItem);
        return this;
    }

    public ListScriptRecordsRequest withResourceId(Consumer<List<String>> resourceIdSetter) {
        if (this.resourceId == null) {
            this.resourceId = new ArrayList<>();
        }
        resourceIdSetter.accept(this.resourceId);
        return this;
    }

    /**
     * 执行脚本的资源ID列表。
     * @return resourceId
     */
    public List<String> getResourceId() {
        return resourceId;
    }

    public void setResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
    }

    public ListScriptRecordsRequest withResourceGroupId(List<String> resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }

    public ListScriptRecordsRequest addResourceGroupIdItem(String resourceGroupIdItem) {
        if (this.resourceGroupId == null) {
            this.resourceGroupId = new ArrayList<>();
        }
        this.resourceGroupId.add(resourceGroupIdItem);
        return this;
    }

    public ListScriptRecordsRequest withResourceGroupId(Consumer<List<String>> resourceGroupIdSetter) {
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

    public ListScriptRecordsRequest withScriptId(List<String> scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    public ListScriptRecordsRequest addScriptIdItem(String scriptIdItem) {
        if (this.scriptId == null) {
            this.scriptId = new ArrayList<>();
        }
        this.scriptId.add(scriptIdItem);
        return this;
    }

    public ListScriptRecordsRequest withScriptId(Consumer<List<String>> scriptIdSetter) {
        if (this.scriptId == null) {
            this.scriptId = new ArrayList<>();
        }
        scriptIdSetter.accept(this.scriptId);
        return this;
    }

    /**
     * 执行的脚本ID。
     * @return scriptId
     */
    public List<String> getScriptId() {
        return scriptId;
    }

    public void setScriptId(List<String> scriptId) {
        this.scriptId = scriptId;
    }

    public ListScriptRecordsRequest withScriptName(List<String> scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    public ListScriptRecordsRequest addScriptNameItem(String scriptNameItem) {
        if (this.scriptName == null) {
            this.scriptName = new ArrayList<>();
        }
        this.scriptName.add(scriptNameItem);
        return this;
    }

    public ListScriptRecordsRequest withScriptName(Consumer<List<String>> scriptNameSetter) {
        if (this.scriptName == null) {
            this.scriptName = new ArrayList<>();
        }
        scriptNameSetter.accept(this.scriptName);
        return this;
    }

    /**
     * 执行的脚本名称。
     * @return scriptName
     */
    public List<String> getScriptName() {
        return scriptName;
    }

    public void setScriptName(List<String> scriptName) {
        this.scriptName = scriptName;
    }

    public ListScriptRecordsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 执行脚本的执行情况。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListScriptRecordsRequest withIsFirstOrder(Boolean isFirstOrder) {
        this.isFirstOrder = isFirstOrder;
        return this;
    }

    /**
     * 是否首批执行。
     * @return isFirstOrder
     */
    public Boolean getIsFirstOrder() {
        return isFirstOrder;
    }

    public void setIsFirstOrder(Boolean isFirstOrder) {
        this.isFirstOrder = isFirstOrder;
    }

    public ListScriptRecordsRequest withScriptTaskId(String scriptTaskId) {
        this.scriptTaskId = scriptTaskId;
        return this;
    }

    /**
     * 执行脚本的任务ID。
     * @return scriptTaskId
     */
    public String getScriptTaskId() {
        return scriptTaskId;
    }

    public void setScriptTaskId(String scriptTaskId) {
        this.scriptTaskId = scriptTaskId;
    }

    public ListScriptRecordsRequest withTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }

    /**
     * 执行记录的任务类型(SCRIPT/COMMAND)。
     * @return taskType
     */
    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public ListScriptRecordsRequest withShowHistory(Boolean showHistory) {
        this.showHistory = showHistory;
        return this;
    }

    /**
     * 是否查询历史记录，默认为false，为true时需要同时传入resource_id与script_id。
     * @return showHistory
     */
    public Boolean getShowHistory() {
        return showHistory;
    }

    public void setShowHistory(Boolean showHistory) {
        this.showHistory = showHistory;
    }

    public ListScriptRecordsRequest withExecuteTimeStart(String executeTimeStart) {
        this.executeTimeStart = executeTimeStart;
        return this;
    }

    /**
     * 按执行时间查询的起始时间。指定该参数后，返回的结果为此时间之后的所有执行记录。时间格式如：“2021-10-01T12:00:00Z”。
     * @return executeTimeStart
     */
    public String getExecuteTimeStart() {
        return executeTimeStart;
    }

    public void setExecuteTimeStart(String executeTimeStart) {
        this.executeTimeStart = executeTimeStart;
    }

    public ListScriptRecordsRequest withExecuteTimeEnd(String executeTimeEnd) {
        this.executeTimeEnd = executeTimeEnd;
        return this;
    }

    /**
     * 按执行时间查询的终止时间。指定该参数后，返回的结果为此时间之前的所有执行记录。时间格式如：“2021-10-01T12:00:00Z”。
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
        ListScriptRecordsRequest that = (ListScriptRecordsRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceGroupId, that.resourceGroupId)
            && Objects.equals(this.scriptId, that.scriptId) && Objects.equals(this.scriptName, that.scriptName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.isFirstOrder, that.isFirstOrder)
            && Objects.equals(this.scriptTaskId, that.scriptTaskId) && Objects.equals(this.taskType, that.taskType)
            && Objects.equals(this.showHistory, that.showHistory)
            && Objects.equals(this.executeTimeStart, that.executeTimeStart)
            && Objects.equals(this.executeTimeEnd, that.executeTimeEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            resourceId,
            resourceGroupId,
            scriptId,
            scriptName,
            status,
            isFirstOrder,
            scriptTaskId,
            taskType,
            showHistory,
            executeTimeStart,
            executeTimeEnd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScriptRecordsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceGroupId: ").append(toIndentedString(resourceGroupId)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isFirstOrder: ").append(toIndentedString(isFirstOrder)).append("\n");
        sb.append("    scriptTaskId: ").append(toIndentedString(scriptTaskId)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    showHistory: ").append(toIndentedString(showHistory)).append("\n");
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
