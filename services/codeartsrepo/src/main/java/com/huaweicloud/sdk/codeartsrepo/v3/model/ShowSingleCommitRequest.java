package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowSingleCommitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private Integer repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    private String sha;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stats")

    private Boolean stats;

    public ShowSingleCommitRequest withRepoId(Integer repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * 仓库短id
     * @return repoId
     */
    public Integer getRepoId() {
        return repoId;
    }

    public void setRepoId(Integer repoId) {
        this.repoId = repoId;
    }

    public ShowSingleCommitRequest withSha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * commit id，仓库的branch名或tag名
     * @return sha
     */
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public ShowSingleCommitRequest withStats(Boolean stats) {
        this.stats = stats;
        return this;
    }

    /**
     * 包括提交统计信息。默认值为true
     * @return stats
     */
    public Boolean getStats() {
        return stats;
    }

    public void setStats(Boolean stats) {
        this.stats = stats;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSingleCommitRequest that = (ShowSingleCommitRequest) obj;
        return Objects.equals(this.repoId, that.repoId) && Objects.equals(this.sha, that.sha)
            && Objects.equals(this.stats, that.stats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoId, sha, stats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSingleCommitRequest {\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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
