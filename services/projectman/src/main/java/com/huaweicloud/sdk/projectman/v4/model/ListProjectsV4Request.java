package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListProjectsV4Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_type")

    private String projectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive")

    private String archive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private String queryType;

    public ListProjectsV4Request withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量 从0开始 minimum: 0 maximum: 10000
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListProjectsV4Request withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 条数 最小1条,最大1000 minimum: 1 maximum: 1000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListProjectsV4Request withSearch(String search) {
        this.search = search;
        return this;
    }

    /** 模糊查询项目名称或描述,不支持通配符等高级查询
     * 
     * @return search */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListProjectsV4Request withProjectType(String projectType) {
        this.projectType = projectType;
        return this;
    }

    /** 项目类型 scrum|xboard
     * 
     * @return projectType */
    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public ListProjectsV4Request withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /** 排序条件 默认创建时间降序(name|created_on)(asc|desc)
     * 
     * @return sort */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListProjectsV4Request withArchive(String archive) {
        this.archive = archive;
        return this;
    }

    /** 是否归档 true已归档|false未归档
     * 
     * @return archive */
    public String getArchive() {
        return archive;
    }

    public void setArchive(String archive) {
        this.archive = archive;
    }

    public ListProjectsV4Request withQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }

    /** 默认返回当前用户参与的项目列表,domain_projects租户下的所有项目列表,absent返回当前用户未参与的租户项目列表
     * 
     * @return queryType */
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProjectsV4Request listProjectsV4Request = (ListProjectsV4Request) o;
        return Objects.equals(this.offset, listProjectsV4Request.offset)
            && Objects.equals(this.limit, listProjectsV4Request.limit)
            && Objects.equals(this.search, listProjectsV4Request.search)
            && Objects.equals(this.projectType, listProjectsV4Request.projectType)
            && Objects.equals(this.sort, listProjectsV4Request.sort)
            && Objects.equals(this.archive, listProjectsV4Request.archive)
            && Objects.equals(this.queryType, listProjectsV4Request.queryType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, search, projectType, sort, archive, queryType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProjectsV4Request {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
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
