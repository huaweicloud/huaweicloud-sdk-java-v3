package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectWorkHoursTypeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    public ListProjectWorkHoursTypeRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListProjectWorkHoursTypeRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的数量，默认显示10条，最多显示100条
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

    public ListProjectWorkHoursTypeRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页索引，偏移量offset是limit的整数倍，limit=10,offset=0,10,20...
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectWorkHoursTypeRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 工时类型状态，支持按状态筛选查询，置空时查询所有工时类型，1表示查询启用的工时类型，2表示查询未启用的工时类型
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectWorkHoursTypeRequest listProjectWorkHoursTypeRequest = (ListProjectWorkHoursTypeRequest) o;
        return Objects.equals(this.projectId, listProjectWorkHoursTypeRequest.projectId)
            && Objects.equals(this.limit, listProjectWorkHoursTypeRequest.limit)
            && Objects.equals(this.offset, listProjectWorkHoursTypeRequest.offset)
            && Objects.equals(this.status, listProjectWorkHoursTypeRequest.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, limit, offset, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectWorkHoursTypeRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
