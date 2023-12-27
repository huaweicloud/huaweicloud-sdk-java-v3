package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateNotMavenRepoDO
 */
public class UpdateNotMavenRepoDO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_ids")

    private List<String> repositoryIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includes_pattern")

    private String includesPattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_policy")

    private String deploymentPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_clean_snapshot")

    private Boolean autoCleanSnapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_alive_days")

    private String snapshotAliveDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_unique_snapshots")

    private String maxUniqueSnapshots;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_anonymous")

    private Boolean allowAnonymous;

    public UpdateNotMavenRepoDO withRepoName(String repoName) {
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

    public UpdateNotMavenRepoDO withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 仓库格式
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public UpdateNotMavenRepoDO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 仓库描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateNotMavenRepoDO withRepositoryIds(List<String> repositoryIds) {
        this.repositoryIds = repositoryIds;
        return this;
    }

    public UpdateNotMavenRepoDO addRepositoryIdsItem(String repositoryIdsItem) {
        if (this.repositoryIds == null) {
            this.repositoryIds = new ArrayList<>();
        }
        this.repositoryIds.add(repositoryIdsItem);
        return this;
    }

    public UpdateNotMavenRepoDO withRepositoryIds(Consumer<List<String>> repositoryIdsSetter) {
        if (this.repositoryIds == null) {
            this.repositoryIds = new ArrayList<>();
        }
        repositoryIdsSetter.accept(this.repositoryIds);
        return this;
    }

    /**
     * 仓库id列表
     * @return repositoryIds
     */
    public List<String> getRepositoryIds() {
        return repositoryIds;
    }

    public void setRepositoryIds(List<String> repositoryIds) {
        this.repositoryIds = repositoryIds;
    }

    public UpdateNotMavenRepoDO withIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
        return this;
    }

    /**
     * 路径白名单
     * @return includesPattern
     */
    public String getIncludesPattern() {
        return includesPattern;
    }

    public void setIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
    }

    public UpdateNotMavenRepoDO withDeploymentPolicy(String deploymentPolicy) {
        this.deploymentPolicy = deploymentPolicy;
        return this;
    }

    /**
     * 仓库属性-覆盖策略
     * @return deploymentPolicy
     */
    public String getDeploymentPolicy() {
        return deploymentPolicy;
    }

    public void setDeploymentPolicy(String deploymentPolicy) {
        this.deploymentPolicy = deploymentPolicy;
    }

    public UpdateNotMavenRepoDO withAutoCleanSnapshot(Boolean autoCleanSnapshot) {
        this.autoCleanSnapshot = autoCleanSnapshot;
        return this;
    }

    /**
     * 自动清理快照
     * @return autoCleanSnapshot
     */
    public Boolean getAutoCleanSnapshot() {
        return autoCleanSnapshot;
    }

    public void setAutoCleanSnapshot(Boolean autoCleanSnapshot) {
        this.autoCleanSnapshot = autoCleanSnapshot;
    }

    public UpdateNotMavenRepoDO withSnapshotAliveDays(String snapshotAliveDays) {
        this.snapshotAliveDays = snapshotAliveDays;
        return this;
    }

    /**
     * 快照保存时间长度
     * @return snapshotAliveDays
     */
    public String getSnapshotAliveDays() {
        return snapshotAliveDays;
    }

    public void setSnapshotAliveDays(String snapshotAliveDays) {
        this.snapshotAliveDays = snapshotAliveDays;
    }

    public UpdateNotMavenRepoDO withMaxUniqueSnapshots(String maxUniqueSnapshots) {
        this.maxUniqueSnapshots = maxUniqueSnapshots;
        return this;
    }

    /**
     * 最大不同快照个数
     * @return maxUniqueSnapshots
     */
    public String getMaxUniqueSnapshots() {
        return maxUniqueSnapshots;
    }

    public void setMaxUniqueSnapshots(String maxUniqueSnapshots) {
        this.maxUniqueSnapshots = maxUniqueSnapshots;
    }

    public UpdateNotMavenRepoDO withAllowAnonymous(Boolean allowAnonymous) {
        this.allowAnonymous = allowAnonymous;
        return this;
    }

    /**
     * 是否允许匿名
     * @return allowAnonymous
     */
    public Boolean getAllowAnonymous() {
        return allowAnonymous;
    }

    public void setAllowAnonymous(Boolean allowAnonymous) {
        this.allowAnonymous = allowAnonymous;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNotMavenRepoDO that = (UpdateNotMavenRepoDO) obj;
        return Objects.equals(this.repoName, that.repoName) && Objects.equals(this.format, that.format)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.repositoryIds, that.repositoryIds)
            && Objects.equals(this.includesPattern, that.includesPattern)
            && Objects.equals(this.deploymentPolicy, that.deploymentPolicy)
            && Objects.equals(this.autoCleanSnapshot, that.autoCleanSnapshot)
            && Objects.equals(this.snapshotAliveDays, that.snapshotAliveDays)
            && Objects.equals(this.maxUniqueSnapshots, that.maxUniqueSnapshots)
            && Objects.equals(this.allowAnonymous, that.allowAnonymous);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repoName,
            format,
            description,
            repositoryIds,
            includesPattern,
            deploymentPolicy,
            autoCleanSnapshot,
            snapshotAliveDays,
            maxUniqueSnapshots,
            allowAnonymous);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNotMavenRepoDO {\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    repositoryIds: ").append(toIndentedString(repositoryIds)).append("\n");
        sb.append("    includesPattern: ").append(toIndentedString(includesPattern)).append("\n");
        sb.append("    deploymentPolicy: ").append(toIndentedString(deploymentPolicy)).append("\n");
        sb.append("    autoCleanSnapshot: ").append(toIndentedString(autoCleanSnapshot)).append("\n");
        sb.append("    snapshotAliveDays: ").append(toIndentedString(snapshotAliveDays)).append("\n");
        sb.append("    maxUniqueSnapshots: ").append(toIndentedString(maxUniqueSnapshots)).append("\n");
        sb.append("    allowAnonymous: ").append(toIndentedString(allowAnonymous)).append("\n");
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
