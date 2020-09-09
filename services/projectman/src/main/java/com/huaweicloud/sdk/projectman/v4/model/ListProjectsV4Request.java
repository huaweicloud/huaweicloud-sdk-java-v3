package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListProjectsV4Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="search")
    
    private String search;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="project_type")
    
    private String projectType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort")
    
    private String sort;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="archive")
    
    private String archive;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="query_type")
    
    private String queryType;

    public ListProjectsV4Request withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * minimum: 0
     * maximum: 10000
     * @return offset
     */
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

    


    /**
     * Get limit
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
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

    


    /**
     * Get search
     * @return search
     */
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

    


    /**
     * Get projectType
     * @return projectType
     */
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

    


    /**
     * Get sort
     * @return sort
     */
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

    


    /**
     * Get archive
     * @return archive
     */
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

    


    /**
     * Get queryType
     * @return queryType
     */
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
        return Objects.equals(this.offset, listProjectsV4Request.offset) &&
            Objects.equals(this.limit, listProjectsV4Request.limit) &&
            Objects.equals(this.search, listProjectsV4Request.search) &&
            Objects.equals(this.projectType, listProjectsV4Request.projectType) &&
            Objects.equals(this.sort, listProjectsV4Request.sort) &&
            Objects.equals(this.archive, listProjectsV4Request.archive) &&
            Objects.equals(this.queryType, listProjectsV4Request.queryType);
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

