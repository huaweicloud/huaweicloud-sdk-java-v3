package com.huaweicloud.sdk.codeartsdeploy.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDeployTaskHistoryByDateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_date")

    private String startDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_date")

    private String endDate;

    public ListDeployTaskHistoryByDateRequest withProjectId(String projectId) {
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

    public ListDeployTaskHistoryByDateRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListDeployTaskHistoryByDateRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 分页页码， 表示从此页开始查询， page大于等于1
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListDeployTaskHistoryByDateRequest withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 每页显示的条目数量，size小于等于100
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListDeployTaskHistoryByDateRequest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * 区间开始时间，格式yyyy-MM-dd。 开始时间和结束时间间隔不能超过30天
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public ListDeployTaskHistoryByDateRequest withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * 区间结束时间，格式yyyy-MM-dd。 开始时间和结束时间间隔不能超过30天
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDeployTaskHistoryByDateRequest that = (ListDeployTaskHistoryByDateRequest) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.page, that.page) && Objects.equals(this.size, that.size)
            && Objects.equals(this.startDate, that.startDate) && Objects.equals(this.endDate, that.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, id, page, size, startDate, endDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDeployTaskHistoryByDateRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
