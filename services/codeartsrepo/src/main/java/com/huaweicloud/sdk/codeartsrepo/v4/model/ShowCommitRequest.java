package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowCommitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    private String sha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stats")

    private Boolean stats;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_code_changes")

    private Boolean showCodeChanges;

    public ShowCommitRequest withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库的ID，通过[[查询用户所有仓库](https://support.huaweicloud.com/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws)[[查询用户所有仓库](https://support.huaweicloud.com/intl/en-us/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_hk)[[查询用户所有仓库](https://support.huaweicloud.com/eu/api-codeartsrepo/ListUserAllRepositories.html)](tag:hws_eu)[查询项目列表](tag:hcs,hcs_sm)接口查询项目列表获取。 **约束限制：** 不涉及。
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

    public ShowCommitRequest withSha(String sha) {
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

    public ShowCommitRequest withStats(Boolean stats) {
        this.stats = stats;
        return this;
    }

    /**
     * **参数解释：** 是否包含状态信息。 **取值范围：** - true，包含。 - false，不包含。
     * @return stats
     */
    public Boolean getStats() {
        return stats;
    }

    public void setStats(Boolean stats) {
        this.stats = stats;
    }

    public ShowCommitRequest withShowCodeChanges(Boolean showCodeChanges) {
        this.showCodeChanges = showCodeChanges;
        return this;
    }

    /**
     * **参数解释：** 是否包含代码变化信息。 **取值范围：** - true，包含。 - false，不包含。
     * @return showCodeChanges
     */
    public Boolean getShowCodeChanges() {
        return showCodeChanges;
    }

    public void setShowCodeChanges(Boolean showCodeChanges) {
        this.showCodeChanges = showCodeChanges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCommitRequest that = (ShowCommitRequest) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.sha, that.sha)
            && Objects.equals(this.stats, that.stats) && Objects.equals(this.showCodeChanges, that.showCodeChanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId, sha, stats, showCodeChanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCommitRequest {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
        sb.append("    showCodeChanges: ").append(toIndentedString(showCodeChanges)).append("\n");
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
