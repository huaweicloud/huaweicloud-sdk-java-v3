package com.huaweicloud.sdk.codecheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowTaskDefectsRequest {

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
    @JsonProperty(value = "status_ids")

    private String statusIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private String severity;

    public ShowTaskDefectsRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /** 任务ID
     * 
     * @return taskId */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowTaskDefectsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 分页索引，偏移量 minimum: 0
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowTaskDefectsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的数量,每页最多显示100条 minimum: 1 maximum: 100
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowTaskDefectsRequest withStatusIds(String statusIds) {
        this.statusIds = statusIds;
        return this;
    }

    /** 问题状态筛选
     * 
     * @return statusIds */
    public String getStatusIds() {
        return statusIds;
    }

    public void setStatusIds(String statusIds) {
        this.statusIds = statusIds;
    }

    public ShowTaskDefectsRequest withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /** 严重级别，0致命，1严重，2一般，3提示
     * 
     * @return severity */
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTaskDefectsRequest showTaskDefectsRequest = (ShowTaskDefectsRequest) o;
        return Objects.equals(this.taskId, showTaskDefectsRequest.taskId)
            && Objects.equals(this.offset, showTaskDefectsRequest.offset)
            && Objects.equals(this.limit, showTaskDefectsRequest.limit)
            && Objects.equals(this.statusIds, showTaskDefectsRequest.statusIds)
            && Objects.equals(this.severity, showTaskDefectsRequest.severity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, offset, limit, statusIds, severity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskDefectsRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    statusIds: ").append(toIndentedString(statusIds)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
