package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDiffCommitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    private String sha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_whitespace_change")

    private Boolean ignoreWhitespaceChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_statistic")

    private Boolean notStatistic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ShowDiffCommitRequest withRepositoryId(Integer repositoryId) {
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

    public ShowDiffCommitRequest withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * **参数解释：** 分支名、tag名、提交ID。
     * @return sha
     */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public ShowDiffCommitRequest withIgnoreWhitespaceChange(Boolean ignoreWhitespaceChange) {
        this.ignoreWhitespaceChange = ignoreWhitespaceChange;
        return this;
    }

    /**
     * **参数解释：** 是否忽略空白数量更改。 **取值范围：** - true，忽略空白数量的更改。 - false，不会忽略空白数量的更改。
     * @return ignoreWhitespaceChange
     */
    public Boolean getIgnoreWhitespaceChange() {
        return ignoreWhitespaceChange;
    }

    public void setIgnoreWhitespaceChange(Boolean ignoreWhitespaceChange) {
        this.ignoreWhitespaceChange = ignoreWhitespaceChange;
    }

    public ShowDiffCommitRequest withNotStatistic(Boolean notStatistic) {
        this.notStatistic = notStatistic;
        return this;
    }

    /**
     * **参数解释：** 是否返回统计数量。 **取值范围：** - true，不返回统计数量。 - false，返回统计数量。
     * @return notStatistic
     */
    public Boolean getNotStatistic() {
        return notStatistic;
    }

    public void setNotStatistic(Boolean notStatistic) {
        this.notStatistic = notStatistic;
    }

    public ShowDiffCommitRequest withOffset(Integer offset) {
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

    public ShowDiffCommitRequest withLimit(Integer limit) {
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
        ShowDiffCommitRequest that = (ShowDiffCommitRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.sha, that.sha)
            && Objects.equals(this.ignoreWhitespaceChange, that.ignoreWhitespaceChange)
            && Objects.equals(this.notStatistic, that.notStatistic) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, sha, ignoreWhitespaceChange, notStatistic, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDiffCommitRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    ignoreWhitespaceChange: ").append(toIndentedString(ignoreWhitespaceChange)).append("\n");
        sb.append("    notStatistic: ").append(toIndentedString(notStatistic)).append("\n");
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
