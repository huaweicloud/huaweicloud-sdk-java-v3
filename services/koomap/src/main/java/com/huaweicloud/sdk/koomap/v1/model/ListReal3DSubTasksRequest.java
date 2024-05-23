package com.huaweicloud.sdk.koomap.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListReal3DSubTasksRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_id")

    private String subtaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_name")

    private String subtaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_status")

    private List<String> subtaskStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_from")

    private String createTimeFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_to")

    private String createTimeTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_from")

    private String updateTimeFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_to")

    private String updateTimeTo;

    public ListReal3DSubTasksRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作共享空间ID。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListReal3DSubTasksRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 原始实景三维建模任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListReal3DSubTasksRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。
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

    public ListReal3DSubTasksRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小。
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

    public ListReal3DSubTasksRequest withSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }

    /**
     * 精修后处理任务ID。
     * @return subtaskId
     */
    public String getSubtaskId() {
        return subtaskId;
    }

    public void setSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
    }

    public ListReal3DSubTasksRequest withSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
        return this;
    }

    /**
     * 精修后处理任务别名，支持模糊查询。
     * @return subtaskName
     */
    public String getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(String subtaskName) {
        this.subtaskName = subtaskName;
    }

    public ListReal3DSubTasksRequest withSubtaskStatus(List<String> subtaskStatus) {
        this.subtaskStatus = subtaskStatus;
        return this;
    }

    public ListReal3DSubTasksRequest addSubtaskStatusItem(String subtaskStatusItem) {
        if (this.subtaskStatus == null) {
            this.subtaskStatus = new ArrayList<>();
        }
        this.subtaskStatus.add(subtaskStatusItem);
        return this;
    }

    public ListReal3DSubTasksRequest withSubtaskStatus(Consumer<List<String>> subtaskStatusSetter) {
        if (this.subtaskStatus == null) {
            this.subtaskStatus = new ArrayList<>();
        }
        subtaskStatusSetter.accept(this.subtaskStatus);
        return this;
    }

    /**
     * 根据精修后处理任务状态查询，支持输入多个状态。
     * @return subtaskStatus
     */
    public List<String> getSubtaskStatus() {
        return subtaskStatus;
    }

    public void setSubtaskStatus(List<String> subtaskStatus) {
        this.subtaskStatus = subtaskStatus;
    }

    public ListReal3DSubTasksRequest withCreateTimeFrom(String createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
        return this;
    }

    /**
     * 创建精修后处理任务的起始时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTimeFrom
     */
    public String getCreateTimeFrom() {
        return createTimeFrom;
    }

    public void setCreateTimeFrom(String createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
    }

    public ListReal3DSubTasksRequest withCreateTimeTo(String createTimeTo) {
        this.createTimeTo = createTimeTo;
        return this;
    }

    /**
     * 创建精修后处理任务的截止时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTimeTo
     */
    public String getCreateTimeTo() {
        return createTimeTo;
    }

    public void setCreateTimeTo(String createTimeTo) {
        this.createTimeTo = createTimeTo;
    }

    public ListReal3DSubTasksRequest withUpdateTimeFrom(String updateTimeFrom) {
        this.updateTimeFrom = updateTimeFrom;
        return this;
    }

    /**
     * 更新精修后处理任务的起始时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTimeFrom
     */
    public String getUpdateTimeFrom() {
        return updateTimeFrom;
    }

    public void setUpdateTimeFrom(String updateTimeFrom) {
        this.updateTimeFrom = updateTimeFrom;
    }

    public ListReal3DSubTasksRequest withUpdateTimeTo(String updateTimeTo) {
        this.updateTimeTo = updateTimeTo;
        return this;
    }

    /**
     * 更新精修后处理任务的截止时间。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTimeTo
     */
    public String getUpdateTimeTo() {
        return updateTimeTo;
    }

    public void setUpdateTimeTo(String updateTimeTo) {
        this.updateTimeTo = updateTimeTo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListReal3DSubTasksRequest that = (ListReal3DSubTasksRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.subtaskId, that.subtaskId) && Objects.equals(this.subtaskName, that.subtaskName)
            && Objects.equals(this.subtaskStatus, that.subtaskStatus)
            && Objects.equals(this.createTimeFrom, that.createTimeFrom)
            && Objects.equals(this.createTimeTo, that.createTimeTo)
            && Objects.equals(this.updateTimeFrom, that.updateTimeFrom)
            && Objects.equals(this.updateTimeTo, that.updateTimeTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            taskId,
            offset,
            limit,
            subtaskId,
            subtaskName,
            subtaskStatus,
            createTimeFrom,
            createTimeTo,
            updateTimeFrom,
            updateTimeTo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReal3DSubTasksRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    subtaskId: ").append(toIndentedString(subtaskId)).append("\n");
        sb.append("    subtaskName: ").append(toIndentedString(subtaskName)).append("\n");
        sb.append("    subtaskStatus: ").append(toIndentedString(subtaskStatus)).append("\n");
        sb.append("    createTimeFrom: ").append(toIndentedString(createTimeFrom)).append("\n");
        sb.append("    createTimeTo: ").append(toIndentedString(createTimeTo)).append("\n");
        sb.append("    updateTimeFrom: ").append(toIndentedString(updateTimeFrom)).append("\n");
        sb.append("    updateTimeTo: ").append(toIndentedString(updateTimeTo)).append("\n");
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
