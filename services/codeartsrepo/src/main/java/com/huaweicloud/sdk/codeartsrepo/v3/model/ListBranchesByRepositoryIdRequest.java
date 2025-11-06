package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListBranchesByRepositoryIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private String page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_page")

    private String perPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match")

    private String match;

    public ListBranchesByRepositoryIdRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库短id
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ListBranchesByRepositoryIdRequest withPage(String page) {
        this.page = page;
        return this;
    }

    /**
     * 分页页数
     * @return page
     */
    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public ListBranchesByRepositoryIdRequest withPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

    /**
     * 每页数据数
     * @return perPage
     */
    public String getPerPage() {
        return perPage;
    }

    public void setPerPage(String perPage) {
        this.perPage = perPage;
    }

    public ListBranchesByRepositoryIdRequest withMatch(String match) {
        this.match = match;
        return this;
    }

    /**
     * 匹配条件
     * @return match
     */
    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBranchesByRepositoryIdRequest that = (ListBranchesByRepositoryIdRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.page, that.page)
            && Objects.equals(this.perPage, that.perPage) && Objects.equals(this.match, that.match);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, page, perPage, match);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBranchesByRepositoryIdRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
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
