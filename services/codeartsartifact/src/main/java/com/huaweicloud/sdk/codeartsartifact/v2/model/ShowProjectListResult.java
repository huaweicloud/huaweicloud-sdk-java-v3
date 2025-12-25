package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowProjectListResult
 */
public class ShowProjectListResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdTime")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdUserId")

    private String createdUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdUserName")

    private String createdUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifiedTime")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifiedUserId")

    private String modifiedUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifiedUserName")

    private String modifiedUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoType")

    private String repoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includesPattern")

    private String includesPattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excludesPattern")

    private String excludesPattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storageSummaryInfo")

    private String storageSummaryInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shareRight")

    private String shareRight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploymentPolicy")

    private String deploymentPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositoryName")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayName")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private String policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tabId")

    private String tabId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domainId")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private Boolean disable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "packageType")

    private String packageType;

    public ShowProjectListResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 序号。 **取值范围**： 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowProjectListResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 仓库ID。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowProjectListResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 仓库描述。 **取值范围**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowProjectListResult withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间，时间格式：yyyy-MM-dd HH:mm:ss。 **取值范围**： 不涉及。 
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ShowProjectListResult withCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    /**
     * **参数解释**： 创建人ID。 **取值范围**： 不涉及。 
     * @return createdUserId
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public ShowProjectListResult withCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
        return this;
    }

    /**
     * **参数解释**： 创建人名称。 **取值范围**： 不涉及。 
     * @return createdUserName
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    public ShowProjectListResult withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * **参数解释**： 修改时间，时间格式：yyyy-MM-dd HH:mm:ss。 **取值范围**： 不涉及。 
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public ShowProjectListResult withModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
        return this;
    }

    /**
     * **参数解释**： 修改人ID。 **取值范围**： 不涉及。 
     * @return modifiedUserId
     */
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public ShowProjectListResult withModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
        return this;
    }

    /**
     * **参数解释**： 修改人名称。 **取值范围**： 不涉及。 
     * @return modifiedUserName
     */
    public String getModifiedUserName() {
        return modifiedUserName;
    }

    public void setModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
    }

    public ShowProjectListResult withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * **参数解释**： 制品类型。 **取值范围**： maven2|docker|npm|go|pypi|rpm|composer|debian|conan|nuget|docker2|cocoapods|ohpm|generic。 
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public ShowProjectListResult withRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }

    /**
     * **参数解释**： 仓库类型。 **取值范围**： - hosted：本地仓库。 - remote：代理仓库。 - virtual：虚拟仓库。 
     * @return repoType
     */
    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public ShowProjectListResult withIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
        return this;
    }

    /**
     * **参数解释**： 路径包含规则。 **取值范围**： 不涉及。 
     * @return includesPattern
     */
    public String getIncludesPattern() {
        return includesPattern;
    }

    public void setIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
    }

    public ShowProjectListResult withExcludesPattern(String excludesPattern) {
        this.excludesPattern = excludesPattern;
        return this;
    }

    /**
     * **参数解释**： 路径排除规则。 **取值范围**： 不涉及。 
     * @return excludesPattern
     */
    public String getExcludesPattern() {
        return excludesPattern;
    }

    public void setExcludesPattern(String excludesPattern) {
        this.excludesPattern = excludesPattern;
    }

    public ShowProjectListResult withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**： 仓库地址。 **取值范围**： 不涉及。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowProjectListResult withStorageSummaryInfo(String storageSummaryInfo) {
        this.storageSummaryInfo = storageSummaryInfo;
        return this;
    }

    /**
     * **参数解释**： storageSummaryInfo。 **取值范围**： 不涉及。 
     * @return storageSummaryInfo
     */
    public String getStorageSummaryInfo() {
        return storageSummaryInfo;
    }

    public void setStorageSummaryInfo(String storageSummaryInfo) {
        this.storageSummaryInfo = storageSummaryInfo;
    }

    public ShowProjectListResult withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目id。 **取值范围**： 不涉及。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowProjectListResult withShareRight(String shareRight) {
        this.shareRight = shareRight;
        return this;
    }

    /**
     * **参数解释**： 共享权限级别。 **取值范围**： PROJECT。 
     * @return shareRight
     */
    public String getShareRight() {
        return shareRight;
    }

    public void setShareRight(String shareRight) {
        this.shareRight = shareRight;
    }

    public ShowProjectListResult withDeploymentPolicy(String deploymentPolicy) {
        this.deploymentPolicy = deploymentPolicy;
        return this;
    }

    /**
     * **参数解释**： 覆盖策略。 **取值范围**： 不涉及。 
     * @return deploymentPolicy
     */
    public String getDeploymentPolicy() {
        return deploymentPolicy;
    }

    public void setDeploymentPolicy(String deploymentPolicy) {
        this.deploymentPolicy = deploymentPolicy;
    }

    public ShowProjectListResult withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * **参数解释**： 仓库名称。 **取值范围**： 不涉及。 
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public ShowProjectListResult withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**： 仓库展示名称。 **取值范围**： 不涉及。 
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowProjectListResult withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * **参数解释**： 仓库策略。 **取值范围**： - release：正式仓库。 - snapshot：快照仓库。 
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public ShowProjectListResult withTabId(String tabId) {
        this.tabId = tabId;
        return this;
    }

    /**
     * **参数解释**： 用于标记一对Maven仓库(release、snapshot)，相同的tab_id即为一对Maven仓库。 **取值范围**： 不涉及。 
     * @return tabId
     */
    public String getTabId() {
        return tabId;
    }

    public void setTabId(String tabId) {
        this.tabId = tabId;
    }

    public ShowProjectListResult withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 仓库状态。 **取值范围**： - active：正常。 - delete：删除。 - disabled：无效。 - view：可浏览。 - trash：废弃。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowProjectListResult withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 租户ID。 **取值范围**： 不涉及。 
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowProjectListResult withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 区域。 **取值范围**： 不涉及。 
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowProjectListResult withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * **参数解释**： URI。 **取值范围**： 不涉及。 
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ShowProjectListResult withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * **参数解释**： 仓库是否禁用。 **取值范围**： - true：是。 - false：否。 
     * @return disable
     */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public ShowProjectListResult withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * **参数解释**： 制品类型。 **取值范围**： 不涉及。 
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProjectListResult that = (ShowProjectListResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.createdUserId, that.createdUserId)
            && Objects.equals(this.createdUserName, that.createdUserName)
            && Objects.equals(this.modifiedTime, that.modifiedTime)
            && Objects.equals(this.modifiedUserId, that.modifiedUserId)
            && Objects.equals(this.modifiedUserName, that.modifiedUserName) && Objects.equals(this.format, that.format)
            && Objects.equals(this.repoType, that.repoType)
            && Objects.equals(this.includesPattern, that.includesPattern)
            && Objects.equals(this.excludesPattern, that.excludesPattern) && Objects.equals(this.url, that.url)
            && Objects.equals(this.storageSummaryInfo, that.storageSummaryInfo)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.shareRight, that.shareRight)
            && Objects.equals(this.deploymentPolicy, that.deploymentPolicy)
            && Objects.equals(this.repositoryName, that.repositoryName)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.tabId, that.tabId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.disable, that.disable)
            && Objects.equals(this.packageType, that.packageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            createdTime,
            createdUserId,
            createdUserName,
            modifiedTime,
            modifiedUserId,
            modifiedUserName,
            format,
            repoType,
            includesPattern,
            excludesPattern,
            url,
            storageSummaryInfo,
            projectId,
            shareRight,
            deploymentPolicy,
            repositoryName,
            displayName,
            policy,
            tabId,
            status,
            domainId,
            region,
            uri,
            disable,
            packageType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProjectListResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    createdUserId: ").append(toIndentedString(createdUserId)).append("\n");
        sb.append("    createdUserName: ").append(toIndentedString(createdUserName)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    modifiedUserId: ").append(toIndentedString(modifiedUserId)).append("\n");
        sb.append("    modifiedUserName: ").append(toIndentedString(modifiedUserName)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    includesPattern: ").append(toIndentedString(includesPattern)).append("\n");
        sb.append("    excludesPattern: ").append(toIndentedString(excludesPattern)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    storageSummaryInfo: ").append(toIndentedString(storageSummaryInfo)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    shareRight: ").append(toIndentedString(shareRight)).append("\n");
        sb.append("    deploymentPolicy: ").append(toIndentedString(deploymentPolicy)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
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
