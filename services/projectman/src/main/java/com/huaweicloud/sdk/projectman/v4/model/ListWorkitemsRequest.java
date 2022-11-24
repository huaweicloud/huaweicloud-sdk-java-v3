package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListWorkitemsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time_interval")

    private String createdTimeInterval;

    public ListWorkitemsRequest withProjectId(String projectId) {
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

    public ListWorkitemsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量 从0开始
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListWorkitemsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页数量 最小1,最大100
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

    public ListWorkitemsRequest withCreatedTimeInterval(String createdTimeInterval) {
        this.createdTimeInterval = createdTimeInterval;
        return this;
    }

    /**
     * 创建工作项的时间(查询的起始时间,查询的结束时间)
     * @return createdTimeInterval
     */
    public String getCreatedTimeInterval() {
        return createdTimeInterval;
    }

    public void setCreatedTimeInterval(String createdTimeInterval) {
        this.createdTimeInterval = createdTimeInterval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkitemsRequest listWorkitemsRequest = (ListWorkitemsRequest) o;
        return Objects.equals(this.projectId, listWorkitemsRequest.projectId)
            && Objects.equals(this.offset, listWorkitemsRequest.offset)
            && Objects.equals(this.limit, listWorkitemsRequest.limit)
            && Objects.equals(this.createdTimeInterval, listWorkitemsRequest.createdTimeInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, offset, limit, createdTimeInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkitemsRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    createdTimeInterval: ").append(toIndentedString(createdTimeInterval)).append("\n");
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
