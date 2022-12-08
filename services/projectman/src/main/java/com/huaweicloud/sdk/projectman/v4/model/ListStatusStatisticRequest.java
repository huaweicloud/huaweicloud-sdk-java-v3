package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListStatusStatisticRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iteration_id")

    private Integer iterationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracker_id")

    private Integer trackerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private Integer statusId;

    public ListStatusStatisticRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * devcloud项目的32位id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListStatusStatisticRequest withIterationId(Integer iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    /**
     * 迭代数字id
     * @return iterationId
     */
    public Integer getIterationId() {
        return iterationId;
    }

    public void setIterationId(Integer iterationId) {
        this.iterationId = iterationId;
    }

    public ListStatusStatisticRequest withTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
        return this;
    }

    /**
     * 自定义字段支持的工作项类型 2任务/Task,3缺陷/Bug,7Story
     * @return trackerId
     */
    public Integer getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(Integer trackerId) {
        this.trackerId = trackerId;
    }

    public ListStatusStatisticRequest withStatusId(Integer statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 工作项状态数字id
     * @return statusId
     */
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListStatusStatisticRequest listStatusStatisticRequest = (ListStatusStatisticRequest) o;
        return Objects.equals(this.projectId, listStatusStatisticRequest.projectId)
            && Objects.equals(this.iterationId, listStatusStatisticRequest.iterationId)
            && Objects.equals(this.trackerId, listStatusStatisticRequest.trackerId)
            && Objects.equals(this.statusId, listStatusStatisticRequest.statusId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, iterationId, trackerId, statusId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStatusStatisticRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    iterationId: ").append(toIndentedString(iterationId)).append("\n");
        sb.append("    trackerId: ").append(toIndentedString(trackerId)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
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
