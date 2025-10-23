package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCommitsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_name")

    private String refName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "since")

    private String since;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "until")

    private String until;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private String author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by_date")

    private Boolean orderByDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "follow")

    private Boolean follow;

    public ListCommitsRequest withRepositoryId(Integer repositoryId) {
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

    public ListCommitsRequest withOffset(Integer offset) {
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

    public ListCommitsRequest withLimit(Integer limit) {
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

    public ListCommitsRequest withRefName(String refName) {
        this.refName = refName;
        return this;
    }

    /**
     * 分支/tag名
     * @return refName
     */
    public String getRefName() {
        return refName;
    }

    public void setRefName(String refName) {
        this.refName = refName;
    }

    public ListCommitsRequest withSince(String since) {
        this.since = since;
        return this;
    }

    /**
     * 起始时间（不包含）
     * @return since
     */
    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public ListCommitsRequest withUntil(String until) {
        this.until = until;
        return this;
    }

    /**
     * 结束时间（不包含）
     * @return until
     */
    public String getUntil() {
        return until;
    }

    public void setUntil(String until) {
        this.until = until;
    }

    public ListCommitsRequest withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * The file path
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ListCommitsRequest withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * 提交信息或者commit id
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ListCommitsRequest withAuthor(String author) {
        this.author = author;
        return this;
    }

    /**
     * 代码作者名称
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public ListCommitsRequest withOrderByDate(Boolean orderByDate) {
        this.orderByDate = orderByDate;
        return this;
    }

    /**
     * 是否按照时间降序排序
     * @return orderByDate
     */
    public Boolean getOrderByDate() {
        return orderByDate;
    }

    public void setOrderByDate(Boolean orderByDate) {
        this.orderByDate = orderByDate;
    }

    public ListCommitsRequest withFollow(Boolean follow) {
        this.follow = follow;
        return this;
    }

    /**
     * 为true时可以追踪文件移动、改名前后的提交记录
     * @return follow
     */
    public Boolean getFollow() {
        return follow;
    }

    public void setFollow(Boolean follow) {
        this.follow = follow;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCommitsRequest that = (ListCommitsRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.refName, that.refName)
            && Objects.equals(this.since, that.since) && Objects.equals(this.until, that.until)
            && Objects.equals(this.path, that.path) && Objects.equals(this.message, that.message)
            && Objects.equals(this.author, that.author) && Objects.equals(this.orderByDate, that.orderByDate)
            && Objects.equals(this.follow, that.follow);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(repositoryId, offset, limit, refName, since, until, path, message, author, orderByDate, follow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCommitsRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    refName: ").append(toIndentedString(refName)).append("\n");
        sb.append("    since: ").append(toIndentedString(since)).append("\n");
        sb.append("    until: ").append(toIndentedString(until)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    orderByDate: ").append(toIndentedString(orderByDate)).append("\n");
        sb.append("    follow: ").append(toIndentedString(follow)).append("\n");
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
