package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectIssuesRecordsV4Request {

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
    @JsonProperty(value = "operated_time_interval")

    private String operatedTimeInterval;

    public ListProjectIssuesRecordsV4Request withProjectId(String projectId) {
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

    public ListProjectIssuesRecordsV4Request withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量 从0开始,offset是limit的整数倍，limit=10,offset=0,10,20...
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectIssuesRecordsV4Request withLimit(Integer limit) {
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

    public ListProjectIssuesRecordsV4Request withOperatedTimeInterval(String operatedTimeInterval) {
        this.operatedTimeInterval = operatedTimeInterval;
        return this;
    }

    /**
     * 变更工作项的时间(查询的起始时间,查询的结束时间)
     * @return operatedTimeInterval
     */
    public String getOperatedTimeInterval() {
        return operatedTimeInterval;
    }

    public void setOperatedTimeInterval(String operatedTimeInterval) {
        this.operatedTimeInterval = operatedTimeInterval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectIssuesRecordsV4Request listProjectIssuesRecordsV4Request = (ListProjectIssuesRecordsV4Request) o;
        return Objects.equals(this.projectId, listProjectIssuesRecordsV4Request.projectId)
            && Objects.equals(this.offset, listProjectIssuesRecordsV4Request.offset)
            && Objects.equals(this.limit, listProjectIssuesRecordsV4Request.limit)
            && Objects.equals(this.operatedTimeInterval, listProjectIssuesRecordsV4Request.operatedTimeInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, offset, limit, operatedTimeInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectIssuesRecordsV4Request {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    operatedTimeInterval: ").append(toIndentedString(operatedTimeInterval)).append("\n");
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
