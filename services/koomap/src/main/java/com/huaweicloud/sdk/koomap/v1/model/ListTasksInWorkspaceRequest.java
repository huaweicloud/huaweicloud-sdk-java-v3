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
public class ListTasksInWorkspaceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type")

    private List<String> taskType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modeling_type")

    private String modelingType;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ids")

    private List<String> taskIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private List<String> taskStatus = null;

    public ListTasksInWorkspaceRequest withWorkspaceId(String workspaceId) {
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

    public ListTasksInWorkspaceRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量。查询时忽略的记录数量。
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

    public ListTasksInWorkspaceRequest withLimit(Integer limit) {
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

    public ListTasksInWorkspaceRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。支持中文、英文、数字以及“_”字符，长度限制1~50个字符。支持模糊查询。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListTasksInWorkspaceRequest withTaskType(List<String> taskType) {
        this.taskType = taskType;
        return this;
    }

    public ListTasksInWorkspaceRequest addTaskTypeItem(String taskTypeItem) {
        if (this.taskType == null) {
            this.taskType = new ArrayList<>();
        }
        this.taskType.add(taskTypeItem);
        return this;
    }

    public ListTasksInWorkspaceRequest withTaskType(Consumer<List<String>> taskTypeSetter) {
        if (this.taskType == null) {
            this.taskType = new ArrayList<>();
        }
        taskTypeSetter.accept(this.taskType);
        return this;
    }

    /**
     * 任务类型。支持过滤多种任务类型。
     * @return taskType
     */
    public List<String> getTaskType() {
        return taskType;
    }

    public void setTaskType(List<String> taskType) {
        this.taskType = taskType;
    }

    public ListTasksInWorkspaceRequest withModelingType(String modelingType) {
        this.modelingType = modelingType;
        return this;
    }

    /**
     * 建模类型。支持Mesh和Nerf。
     * @return modelingType
     */
    public String getModelingType() {
        return modelingType;
    }

    public void setModelingType(String modelingType) {
        this.modelingType = modelingType;
    }

    public ListTasksInWorkspaceRequest withCreateTimeFrom(String createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
        return this;
    }

    /**
     * 创建时间起始。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTimeFrom
     */
    public String getCreateTimeFrom() {
        return createTimeFrom;
    }

    public void setCreateTimeFrom(String createTimeFrom) {
        this.createTimeFrom = createTimeFrom;
    }

    public ListTasksInWorkspaceRequest withCreateTimeTo(String createTimeTo) {
        this.createTimeTo = createTimeTo;
        return this;
    }

    /**
     * 创建时间终止。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTimeTo
     */
    public String getCreateTimeTo() {
        return createTimeTo;
    }

    public void setCreateTimeTo(String createTimeTo) {
        this.createTimeTo = createTimeTo;
    }

    public ListTasksInWorkspaceRequest withUpdateTimeFrom(String updateTimeFrom) {
        this.updateTimeFrom = updateTimeFrom;
        return this;
    }

    /**
     * 更新时间起始。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTimeFrom
     */
    public String getUpdateTimeFrom() {
        return updateTimeFrom;
    }

    public void setUpdateTimeFrom(String updateTimeFrom) {
        this.updateTimeFrom = updateTimeFrom;
    }

    public ListTasksInWorkspaceRequest withUpdateTimeTo(String updateTimeTo) {
        this.updateTimeTo = updateTimeTo;
        return this;
    }

    /**
     * 更新时间终止。格式为UTC时间：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return updateTimeTo
     */
    public String getUpdateTimeTo() {
        return updateTimeTo;
    }

    public void setUpdateTimeTo(String updateTimeTo) {
        this.updateTimeTo = updateTimeTo;
    }

    public ListTasksInWorkspaceRequest withTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public ListTasksInWorkspaceRequest addTaskIdsItem(String taskIdsItem) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskIdsItem);
        return this;
    }

    public ListTasksInWorkspaceRequest withTaskIds(Consumer<List<String>> taskIdsSetter) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        taskIdsSetter.accept(this.taskIds);
        return this;
    }

    /**
     * 根据任务ID查询。支持过滤多个任务ID。
     * @return taskIds
     */
    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    public ListTasksInWorkspaceRequest withTaskStatus(List<String> taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    public ListTasksInWorkspaceRequest addTaskStatusItem(String taskStatusItem) {
        if (this.taskStatus == null) {
            this.taskStatus = new ArrayList<>();
        }
        this.taskStatus.add(taskStatusItem);
        return this;
    }

    public ListTasksInWorkspaceRequest withTaskStatus(Consumer<List<String>> taskStatusSetter) {
        if (this.taskStatus == null) {
            this.taskStatus = new ArrayList<>();
        }
        taskStatusSetter.accept(this.taskStatus);
        return this;
    }

    /**
     * 根据任务状态查询。支持过滤多个任务状态。
     * @return taskStatus
     */
    public List<String> getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(List<String> taskStatus) {
        this.taskStatus = taskStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTasksInWorkspaceRequest that = (ListTasksInWorkspaceRequest) obj;
        return Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.taskType, that.taskType) && Objects.equals(this.modelingType, that.modelingType)
            && Objects.equals(this.createTimeFrom, that.createTimeFrom)
            && Objects.equals(this.createTimeTo, that.createTimeTo)
            && Objects.equals(this.updateTimeFrom, that.updateTimeFrom)
            && Objects.equals(this.updateTimeTo, that.updateTimeTo) && Objects.equals(this.taskIds, that.taskIds)
            && Objects.equals(this.taskStatus, that.taskStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId,
            offset,
            limit,
            taskName,
            taskType,
            modelingType,
            createTimeFrom,
            createTimeTo,
            updateTimeFrom,
            updateTimeTo,
            taskIds,
            taskStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTasksInWorkspaceRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
        sb.append("    modelingType: ").append(toIndentedString(modelingType)).append("\n");
        sb.append("    createTimeFrom: ").append(toIndentedString(createTimeFrom)).append("\n");
        sb.append("    createTimeTo: ").append(toIndentedString(createTimeTo)).append("\n");
        sb.append("    updateTimeFrom: ").append(toIndentedString(updateTimeFrom)).append("\n");
        sb.append("    updateTimeTo: ").append(toIndentedString(updateTimeTo)).append("\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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
