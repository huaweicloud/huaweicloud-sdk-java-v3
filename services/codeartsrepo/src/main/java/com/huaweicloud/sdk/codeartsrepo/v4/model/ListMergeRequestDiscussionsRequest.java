package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListMergeRequestDiscussionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_request_iid")

    private Integer mergeRequestIid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unresolved")

    private String unresolved;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author_id")

    private Integer authorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListMergeRequestDiscussionsRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ListMergeRequestDiscussionsRequest withMergeRequestIid(Integer mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
        return this;
    }

    /**
     * **参数解释：**  合并请求 iid。
     * minimum: 1
     * maximum: 2147483647
     * @return mergeRequestIid
     */
    public Integer getMergeRequestIid() {
        return mergeRequestIid;
    }

    public void setMergeRequestIid(Integer mergeRequestIid) {
        this.mergeRequestIid = mergeRequestIid;
    }

    public ListMergeRequestDiscussionsRequest withUnresolved(String unresolved) {
        this.unresolved = unresolved;
        return this;
    }

    /**
     * **参数解释：** 是否筛选解决的检视意见 - true 筛选所有未解决的检视意见 - false 筛选所有已解决的检视意见 - '' 不传此值时默认查询所有检视意见
     * @return unresolved
     */
    public String getUnresolved() {
        return unresolved;
    }

    public void setUnresolved(String unresolved) {
        this.unresolved = unresolved;
    }

    public ListMergeRequestDiscussionsRequest withAuthorId(Integer authorId) {
        this.authorId = authorId;
        return this;
    }

    /**
     * **参数解释：** 操作者id。
     * minimum: 1
     * maximum: 2147483647
     * @return authorId
     */
    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public ListMergeRequestDiscussionsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * **参数解释：** 检视意见返回排序 - asc 按创建时间正序返回 - desc 按创建时间倒序返回
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListMergeRequestDiscussionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释：** 偏移量，从0开始。
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListMergeRequestDiscussionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释：** 返回数量。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMergeRequestDiscussionsRequest that = (ListMergeRequestDiscussionsRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.mergeRequestIid, that.mergeRequestIid)
            && Objects.equals(this.unresolved, that.unresolved) && Objects.equals(this.authorId, that.authorId)
            && Objects.equals(this.sort, that.sort) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, mergeRequestIid, unresolved, authorId, sort, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMergeRequestDiscussionsRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    mergeRequestIid: ").append(toIndentedString(mergeRequestIid)).append("\n");
        sb.append("    unresolved: ").append(toIndentedString(unresolved)).append("\n");
        sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
