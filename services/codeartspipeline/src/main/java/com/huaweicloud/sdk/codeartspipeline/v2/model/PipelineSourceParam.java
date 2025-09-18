package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 流水线源参数。 **取值范围**： 不涉及。 
 */
public class PipelineSourceParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_type")

    private String gitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codehub_id")

    private String codehubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_branch")

    private String defaultBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_url")

    private String gitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_git_url")

    private String sshGitUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_type")

    private String artifactType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifact_type_name")

    private String artifactTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branch_filter")

    private String branchFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_id")

    private String directoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organization")

    private String organization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_name")

    private String packageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_strategy")

    private String versionStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_system")

    private String sourceSystem;

    public PipelineSourceParam withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * **参数解释**： 代码/制品源参数 - 代码仓/制品源别名。 **取值范围**： 别名仅支持输入大小写英文字母、数字、“_”，至多128个字符。 
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public PipelineSourceParam withGitType(String gitType) {
        this.gitType = gitType;
        return this;
    }

    /**
     * **参数解释**： git代码仓类型。 **取值范围**： - codehub。 - gitee。 - github。 - gitcode。 - gitlab。 
     * @return gitType
     */
    public String getGitType() {
        return gitType;
    }

    public void setGitType(String gitType) {
        this.gitType = gitType;
    }

    public PipelineSourceParam withCodehubId(String codehubId) {
        this.codehubId = codehubId;
        return this;
    }

    /**
     * **参数解释**： Repo代码仓ID。 **取值范围**： 不涉及。 
     * @return codehubId
     */
    public String getCodehubId() {
        return codehubId;
    }

    public void setCodehubId(String codehubId) {
        this.codehubId = codehubId;
    }

    public PipelineSourceParam withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * **参数解释**： 扩展点id。 **取值范围**： 不涉及。 
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public PipelineSourceParam withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * **参数解释**： 默认分支。 **取值范围**： 不涉及。 
     * @return defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public PipelineSourceParam withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    /**
     * **参数解释**： git链接。 **取值范围**： 不涉及。 
     * @return gitUrl
     */
    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public PipelineSourceParam withSshGitUrl(String sshGitUrl) {
        this.sshGitUrl = sshGitUrl;
        return this;
    }

    /**
     * **参数解释**： ssh_git链接。 **取值范围**： 不涉及。 
     * @return sshGitUrl
     */
    public String getSshGitUrl() {
        return sshGitUrl;
    }

    public void setSshGitUrl(String sshGitUrl) {
        this.sshGitUrl = sshGitUrl;
    }

    public PipelineSourceParam withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * **参数解释**： 网页url。 **取值范围**： 不涉及。 
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public PipelineSourceParam withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * **参数解释**： 流水线源名称。 **取值范围**： 不涉及。 
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public PipelineSourceParam withArtifactType(String artifactType) {
        this.artifactType = artifactType;
        return this;
    }

    /**
     * **参数解释**： 制品源类型。 **取值范围**： 仅包含[generic，docker]。 
     * @return artifactType
     */
    public String getArtifactType() {
        return artifactType;
    }

    public void setArtifactType(String artifactType) {
        this.artifactType = artifactType;
    }

    public PipelineSourceParam withArtifactTypeName(String artifactTypeName) {
        this.artifactTypeName = artifactTypeName;
        return this;
    }

    /**
     * **参数解释**： 制品源类型名。 **取值范围**： 不涉及。 
     * @return artifactTypeName
     */
    public String getArtifactTypeName() {
        return artifactTypeName;
    }

    public void setArtifactTypeName(String artifactTypeName) {
        this.artifactTypeName = artifactTypeName;
    }

    public PipelineSourceParam withBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
        return this;
    }

    /**
     * **参数解释**： 过滤分支。 **取值范围**： 不涉及。 
     * @return branchFilter
     */
    public String getBranchFilter() {
        return branchFilter;
    }

    public void setBranchFilter(String branchFilter) {
        this.branchFilter = branchFilter;
    }

    public PipelineSourceParam withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * **参数解释**： 制品源所在目录。 **取值范围**： 不涉及。 
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public PipelineSourceParam withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * **参数解释**： 目录ID。 **取值范围**： 不涉及。 
     * @return directoryId
     */
    public String getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    public PipelineSourceParam withOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * **参数解释**： Docker组织。 **取值范围**： 不涉及。 
     * @return organization
     */
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public PipelineSourceParam withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * **参数解释**： 软件包名称。 **取值范围**： 不涉及。 
     * @return packageName
     */
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public PipelineSourceParam withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 制品源版本。 **取值范围**： 不涉及。 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PipelineSourceParam withVersionStrategy(String versionStrategy) {
        this.versionStrategy = versionStrategy;
        return this;
    }

    /**
     * **参数解释**： 获取制品源版本的策略。 **取值范围**： 仅包含[latest，specificVersion]。 
     * @return versionStrategy
     */
    public String getVersionStrategy() {
        return versionStrategy;
    }

    public void setVersionStrategy(String versionStrategy) {
        this.versionStrategy = versionStrategy;
    }

    public PipelineSourceParam withSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
        return this;
    }

    /**
     * **参数解释**： 制品源名称。 **取值范围**： 不涉及。 
     * @return sourceSystem
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineSourceParam that = (PipelineSourceParam) obj;
        return Objects.equals(this.alias, that.alias) && Objects.equals(this.gitType, that.gitType)
            && Objects.equals(this.codehubId, that.codehubId) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.defaultBranch, that.defaultBranch) && Objects.equals(this.gitUrl, that.gitUrl)
            && Objects.equals(this.sshGitUrl, that.sshGitUrl) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.repoName, that.repoName) && Objects.equals(this.artifactType, that.artifactType)
            && Objects.equals(this.artifactTypeName, that.artifactTypeName)
            && Objects.equals(this.branchFilter, that.branchFilter) && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.directoryId, that.directoryId)
            && Objects.equals(this.organization, that.organization)
            && Objects.equals(this.packageName, that.packageName) && Objects.equals(this.version, that.version)
            && Objects.equals(this.versionStrategy, that.versionStrategy)
            && Objects.equals(this.sourceSystem, that.sourceSystem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias,
            gitType,
            codehubId,
            endpointId,
            defaultBranch,
            gitUrl,
            sshGitUrl,
            webUrl,
            repoName,
            artifactType,
            artifactTypeName,
            branchFilter,
            directory,
            directoryId,
            organization,
            packageName,
            version,
            versionStrategy,
            sourceSystem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineSourceParam {\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    gitType: ").append(toIndentedString(gitType)).append("\n");
        sb.append("    codehubId: ").append(toIndentedString(codehubId)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    gitUrl: ").append(toIndentedString(gitUrl)).append("\n");
        sb.append("    sshGitUrl: ").append(toIndentedString(sshGitUrl)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    artifactType: ").append(toIndentedString(artifactType)).append("\n");
        sb.append("    artifactTypeName: ").append(toIndentedString(artifactTypeName)).append("\n");
        sb.append("    branchFilter: ").append(toIndentedString(branchFilter)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    versionStrategy: ").append(toIndentedString(versionStrategy)).append("\n");
        sb.append("    sourceSystem: ").append(toIndentedString(sourceSystem)).append("\n");
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
