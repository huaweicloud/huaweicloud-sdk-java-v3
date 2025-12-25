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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public UpdateNotMavenRepoDO withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * **参数解释**: 仓库名称。 **约束限制**: 长度1-20。 **取值范围**: 不涉及。 **默认取值**: 无。 
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
     * **参数解释**: 制品类型。 **约束限制**: 不涉及。 **取值范围**: docker|npm|go|pypi|rpm|composer|debian|conan|nuget|docker2|cocoapods|ohpm|generic。 **默认取值**: 无。
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
     * **参数解释**: 仓库描述。 **约束限制**: 最大长度200。 **取值范围**: 不涉及。 **默认取值**: 无。 
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
     * **参数解释**: 仓库id列表。仓库id，格式为{region}_{domainId}_{format}_{sequence}。可以从私有依赖库首页->仓库概览->仓库地址 url 中获取，最后两个\"/\"中间的字符串即为仓库id。 **约束限制**: 根据仓库id格式中region, domainId需要为有效值，format有效值为:npm|go|pypi|rpm|composer|maven|debian|conan|nuget|docker2|cocoapods|ohpm, sequence取值根据套餐不同有不同上限值。 **取值范围**: 不涉及。 **默认取值**: 无。 
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
     * **参数解释**: 路径包含规则。 **约束限制**: 最大长度512。 **取值范围**: 不涉及。 **默认取值**: 无。 
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
     * **参数解释**: 覆盖策略。 **约束限制**: 不涉及。 **取值范围**: allowRedeploy：允许覆盖 disableRedeploy：禁止覆盖 readOnly：只读。 **默认取值**: 无。 
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
     * **参数解释**: 自动清理快照。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 无。 
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
     * **参数解释**: 快照保存时间长度。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 无。 
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
     * **参数解释**: 最大不同快照个数。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 无。 
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
     * **参数解释**: 是否允许匿名。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     * @return allowAnonymous
     */
    public Boolean getAllowAnonymous() {
        return allowAnonymous;
    }

    public void setAllowAnonymous(Boolean allowAnonymous) {
        this.allowAnonymous = allowAnonymous;
    }

    public UpdateNotMavenRepoDO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 项目ID，可以从调用API处获取，也可以从控制台获取。获取方式请参考[获取项目ID](CloudArtifact_api_0015.xml)。 **约束限制**: 只能由英文字母、数字组成，且长度为32个字符。 **取值范围**: 不涉及。 **默认取值**: 无。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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
            && Objects.equals(this.allowAnonymous, that.allowAnonymous)
            && Objects.equals(this.projectId, that.projectId);
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
            allowAnonymous,
            projectId);
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
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
