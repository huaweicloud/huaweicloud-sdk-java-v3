package com.huaweicloud.sdk.cloudbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ShowJobListByProjectIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_index")

    private Integer pageIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    public ShowJobListByProjectIdRequest withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** DevCloud项目ID，32位数字、小写字母组合。[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowJobListByProjectIdRequest withPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /** 分页页码， 表示从此页开始查询， page_index大于等于0 minimum: 0
     * 
     * @return pageIndex */
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public ShowJobListByProjectIdRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /** 每页显示的条目数量，page_size小于等于100 minimum: 0 maximum: 100
     * 
     * @return pageSize */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobListByProjectIdRequest showJobListByProjectIdRequest = (ShowJobListByProjectIdRequest) o;
        return Objects.equals(this.projectId, showJobListByProjectIdRequest.projectId)
            && Objects.equals(this.pageIndex, showJobListByProjectIdRequest.pageIndex)
            && Objects.equals(this.pageSize, showJobListByProjectIdRequest.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, pageIndex, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobListByProjectIdRequest {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
