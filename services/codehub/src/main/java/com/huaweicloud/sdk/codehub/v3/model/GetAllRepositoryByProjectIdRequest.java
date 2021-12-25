package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class GetAllRepositoryByProjectIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_index")

    private Integer pageIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    public GetAllRepositoryByProjectIdRequest withPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /** 分页索引，从1开始计数
     * 
     * @return pageIndex */
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public GetAllRepositoryByProjectIdRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /** 每页条目数
     * 
     * @return pageSize */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public GetAllRepositoryByProjectIdRequest withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /** 项目的uuid
     * 
     * @return projectUuid */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public GetAllRepositoryByProjectIdRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /** 搜索关键字
     * 
     * @return search */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAllRepositoryByProjectIdRequest getAllRepositoryByProjectIdRequest = (GetAllRepositoryByProjectIdRequest) o;
        return Objects.equals(this.pageIndex, getAllRepositoryByProjectIdRequest.pageIndex)
            && Objects.equals(this.pageSize, getAllRepositoryByProjectIdRequest.pageSize)
            && Objects.equals(this.projectUuid, getAllRepositoryByProjectIdRequest.projectUuid)
            && Objects.equals(this.search, getAllRepositoryByProjectIdRequest.search);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageIndex, pageSize, projectUuid, search);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAllRepositoryByProjectIdRequest {\n");
        sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
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
