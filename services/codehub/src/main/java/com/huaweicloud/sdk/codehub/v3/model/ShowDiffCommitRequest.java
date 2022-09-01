package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDiffCommitRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    @JacksonXmlProperty(localName = "repo_id")

    private Integer repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha")

    @JacksonXmlProperty(localName = "sha")

    private String sha;

    public ShowDiffCommitRequest withRepoId(Integer repoId) {
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

    public ShowDiffCommitRequest withSha(String sha) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDiffCommitRequest showDiffCommitRequest = (ShowDiffCommitRequest) o;
        return Objects.equals(this.repoId, showDiffCommitRequest.repoId)
            && Objects.equals(this.sha, showDiffCommitRequest.sha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoId, sha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDiffCommitRequest {\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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
