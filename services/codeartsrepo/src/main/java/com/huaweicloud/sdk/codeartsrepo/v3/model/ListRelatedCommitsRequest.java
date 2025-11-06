package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListRelatedCommitsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_uuid")

    private String repositoryUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search")

    private String search;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private Integer perPage;

    public ListRelatedCommitsRequest withRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
        return this;
    }

    /**
     * 仓库长id
     * @return repositoryUuid
     */
    public String getRepositoryUuid() {
        return repositoryUuid;
    }

    public void setRepositoryUuid(String repositoryUuid) {
        this.repositoryUuid = repositoryUuid;
    }

    public ListRelatedCommitsRequest withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 关联工作项类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ListRelatedCommitsRequest withSearch(String search) {
        this.search = search;
        return this;
    }

    /**
     * 查询关键字
     * @return search
     */
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public ListRelatedCommitsRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * 页码
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListRelatedCommitsRequest withPerPage(Integer perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 每页数量
     * @return perPage
     */
    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRelatedCommitsRequest that = (ListRelatedCommitsRequest) obj;
        return Objects.equals(this.repositoryUuid, that.repositoryUuid) && Objects.equals(this.type, that.type)
            && Objects.equals(this.search, that.search) && Objects.equals(this.page, that.page)
            && Objects.equals(this.perPage, that.perPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryUuid, type, search, page, perPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelatedCommitsRequest {\n");
        sb.append("    repositoryUuid: ").append(toIndentedString(repositoryUuid)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
