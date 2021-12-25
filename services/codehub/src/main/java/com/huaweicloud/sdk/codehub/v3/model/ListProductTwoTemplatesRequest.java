package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListProductTwoTemplatesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_no")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    public ListProductTwoTemplatesRequest withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /** 项目ID
     * 
     * @return projectUuid */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public ListProductTwoTemplatesRequest withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /** 分页页数
     * 
     * @return pageNo */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ListProductTwoTemplatesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /** 每页数据数
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
        ListProductTwoTemplatesRequest listProductTwoTemplatesRequest = (ListProductTwoTemplatesRequest) o;
        return Objects.equals(this.projectUuid, listProductTwoTemplatesRequest.projectUuid)
            && Objects.equals(this.pageNo, listProductTwoTemplatesRequest.pageNo)
            && Objects.equals(this.pageSize, listProductTwoTemplatesRequest.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectUuid, pageNo, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductTwoTemplatesRequest {\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
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
