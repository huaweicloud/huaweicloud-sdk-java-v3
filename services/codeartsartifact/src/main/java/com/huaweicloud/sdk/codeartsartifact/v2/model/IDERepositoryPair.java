package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IDERepositoryPair
 */
public class IDERepositoryPair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includes_pattern")

    private String includesPattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot")

    private String snapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release")

    private String release;

    public IDERepositoryPair withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * 仓库名称
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public IDERepositoryPair withIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
        return this;
    }

    /**
     * 路径
     * @return includesPattern
     */
    public String getIncludesPattern() {
        return includesPattern;
    }

    public void setIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
    }

    public IDERepositoryPair withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public IDERepositoryPair withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IDERepositoryPair withSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * snapshot仓库名称
     * @return snapshot
     */
    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public IDERepositoryPair withRelease(String release) {
        this.release = release;
        return this;
    }

    /**
     * release仓库名称
     * @return release
     */
    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IDERepositoryPair that = (IDERepositoryPair) obj;
        return Objects.equals(this.repoName, that.repoName)
            && Objects.equals(this.includesPattern, that.includesPattern)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.snapshot, that.snapshot) && Objects.equals(this.release, that.release);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoName, includesPattern, projectId, description, snapshot, release);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IDERepositoryPair {\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    includesPattern: ").append(toIndentedString(includesPattern)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
        sb.append("    release: ").append(toIndentedString(release)).append("\n");
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
