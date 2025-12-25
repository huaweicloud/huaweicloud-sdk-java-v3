package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepositoryDOV5
 */
public class RepositoryDOV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_time")

    private String modifiedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user_id")

    private String createdUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_user_name")

    private String createdUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_user_id")

    private String modifiedUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_user_name")

    private String modifiedUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release")

    private String release;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot")

    private String snapshot;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includes_pattern")

    private String includesPattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "excludes_pattern")

    private String excludesPattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_right")

    private String shareRight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable")

    private Boolean disable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private String policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npm")

    private String npm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repositories")

    private String repositories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy")

    private String proxy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private Integer scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tab_id")

    private String tabId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snapshot_status")

    private String snapshotStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_status")

    private String releaseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_ids")

    private String repositoryIds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_policy")

    private String deploymentPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_repo_name")

    private String parentRepoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_url")

    private String remoteUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_auth")

    private String remoteAuth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pypi_registry_url")

    private String pypiRegistryUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_deploy_repository")

    private String defaultDeployRepository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nexu_repo")

    private Boolean nexuRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_flag")

    private Integer migrateFlag;

    public RepositoryDOV5 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 仓库状态。 **取值范围**: active：正常。 delete：删除。 disabled：无效。 view：私有库浏览者。 trash：废弃。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RepositoryDOV5 withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**: 租户id。 **取值范围**: 不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public RepositoryDOV5 withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**: 区域。 **取值范围**: 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public RepositoryDOV5 withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * **参数解释**: 创建时间，时间格式：yyyy-MM-dd HH:mm:ss。 **取值范围**: 不涉及。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public RepositoryDOV5 withModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }

    /**
     * **参数解释**: 修改时间，时间格式：yyyy-MM-dd HH:mm:ss。 **取值范围**: 不涉及。
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public RepositoryDOV5 withCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
        return this;
    }

    /**
     * **参数解释**: 创建人id。 **取值范围**: 不涉及。
     * @return createdUserId
     */
    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public RepositoryDOV5 withCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
        return this;
    }

    /**
     * **参数解释**: 创建人。 **取值范围**: 不涉及。
     * @return createdUserName
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    public RepositoryDOV5 withModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
        return this;
    }

    /**
     * **参数解释**: 修改人id。 **取值范围**: 不涉及。
     * @return modifiedUserId
     */
    public String getModifiedUserId() {
        return modifiedUserId;
    }

    public void setModifiedUserId(String modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }

    public RepositoryDOV5 withModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
        return this;
    }

    /**
     * **参数解释**: 修改人。 **取值范围**: 不涉及。
     * @return modifiedUserName
     */
    public String getModifiedUserName() {
        return modifiedUserName;
    }

    public void setModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName;
    }

    public RepositoryDOV5 withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * **参数解释**: 仓库名称。 **取值范围**: 不涉及。
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public RepositoryDOV5 withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * **参数解释**: 制品类型。 **取值范围**: - maven - maven2 - npm - go - pypi - rpm - composer - debian - conan - nuget - docker2 - cocoapods - ohpm - generic - helm - conda
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public RepositoryDOV5 withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 仓库类型。 **取值范围**: hosted：本地仓库。 remote：代理仓库。 virtual：聚合仓库。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RepositoryDOV5 withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 仓库描述。 **取值范围**: 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RepositoryDOV5 withRelease(String release) {
        this.release = release;
        return this;
    }

    /**
     * **参数解释**: release仓库名称,release和snapshot至少二选一。 **取值范围**: 不涉及。
     * @return release
     */
    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    public RepositoryDOV5 withSnapshot(String snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    /**
     * **参数解释**: snapshot仓库名称,release和snapshot至少二选一。 **取值范围**: 不涉及。
     * @return snapshot
     */
    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public RepositoryDOV5 withIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
        return this;
    }

    /**
     * **参数解释**: 路径包含规则。 **取值范围**: 不涉及。
     * @return includesPattern
     */
    public String getIncludesPattern() {
        return includesPattern;
    }

    public void setIncludesPattern(String includesPattern) {
        this.includesPattern = includesPattern;
    }

    public RepositoryDOV5 withExcludesPattern(String excludesPattern) {
        this.excludesPattern = excludesPattern;
        return this;
    }

    /**
     * **参数解释**: 路径排除规则。 **取值范围**: 不涉及。
     * @return excludesPattern
     */
    public String getExcludesPattern() {
        return excludesPattern;
    }

    public void setExcludesPattern(String excludesPattern) {
        this.excludesPattern = excludesPattern;
    }

    public RepositoryDOV5 withShareRight(String shareRight) {
        this.shareRight = shareRight;
        return this;
    }

    /**
     * **参数解释**: 共享权限级别。 **取值范围**: PROJECT。
     * @return shareRight
     */
    public String getShareRight() {
        return shareRight;
    }

    public void setShareRight(String shareRight) {
        this.shareRight = shareRight;
    }

    public RepositoryDOV5 withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**: 项目ID。 **取值范围**: 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RepositoryDOV5 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 仓库id。 **取值范围**: 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryDOV5 withDisable(Boolean disable) {
        this.disable = disable;
        return this;
    }

    /**
     * **参数解释**: 是否禁用。 **取值范围**: 不涉及。
     * @return disable
     */
    public Boolean getDisable() {
        return disable;
    }

    public void setDisable(Boolean disable) {
        this.disable = disable;
    }

    public RepositoryDOV5 withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * **参数解释**: 仓库策略。 **取值范围**: release或snapshot。
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public RepositoryDOV5 withNpm(String npm) {
        this.npm = npm;
        return this;
    }

    /**
     * **参数解释**: npm。 **取值范围**: 不涉及。
     * @return npm
     */
    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public RepositoryDOV5 withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * **参数解释**: uri。 **取值范围**: 不涉及。
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public RepositoryDOV5 withRepositories(String repositories) {
        this.repositories = repositories;
        return this;
    }

    /**
     * **参数解释**: repositories。 **取值范围**: 不涉及。
     * @return repositories
     */
    public String getRepositories() {
        return repositories;
    }

    public void setRepositories(String repositories) {
        this.repositories = repositories;
    }

    public RepositoryDOV5 withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 账号。 **取值范围**: 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public RepositoryDOV5 withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * **参数解释**: 密码。 **取值范围**: 不涉及。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RepositoryDOV5 withProxy(String proxy) {
        this.proxy = proxy;
        return this;
    }

    /**
     * **参数解释**: 代理。 **取值范围**: 不涉及。
     * @return proxy
     */
    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public RepositoryDOV5 withScope(Integer scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数解释**: 范围。 **取值范围**: 不涉及。
     * @return scope
     */
    public Integer getScope() {
        return scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public RepositoryDOV5 withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释**: 地址。 **取值范围**: 不涉及。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public RepositoryDOV5 withTabId(String tabId) {
        this.tabId = tabId;
        return this;
    }

    /**
     * **参数解释**: 用于标记一对maven仓库(release、snapshot)，相同的tab_id即为一对maven仓库。 **取值范围**: 不涉及。 
     * @return tabId
     */
    public String getTabId() {
        return tabId;
    }

    public void setTabId(String tabId) {
        this.tabId = tabId;
    }

    public RepositoryDOV5 withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**: 展示的仓库名称。 **取值范围**: 不涉及。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public RepositoryDOV5 withSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
        return this;
    }

    /**
     * **参数解释**: 快照仓状态。 **取值范围**: 不涉及。
     * @return snapshotStatus
     */
    public String getSnapshotStatus() {
        return snapshotStatus;
    }

    public void setSnapshotStatus(String snapshotStatus) {
        this.snapshotStatus = snapshotStatus;
    }

    public RepositoryDOV5 withReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
        return this;
    }

    /**
     * **参数解释**: 发布仓状态。 **取值范围**: 不涉及。
     * @return releaseStatus
     */
    public String getReleaseStatus() {
        return releaseStatus;
    }

    public void setReleaseStatus(String releaseStatus) {
        this.releaseStatus = releaseStatus;
    }

    public RepositoryDOV5 withRepositoryIds(String repositoryIds) {
        this.repositoryIds = repositoryIds;
        return this;
    }

    /**
     * **参数解释**: 仓库id列表。 **取值范围**: 不涉及。
     * @return repositoryIds
     */
    public String getRepositoryIds() {
        return repositoryIds;
    }

    public void setRepositoryIds(String repositoryIds) {
        this.repositoryIds = repositoryIds;
    }

    public RepositoryDOV5 withDeploymentPolicy(String deploymentPolicy) {
        this.deploymentPolicy = deploymentPolicy;
        return this;
    }

    /**
     * **参数解释**: 覆盖策略。 **取值范围**: 不涉及。 
     * @return deploymentPolicy
     */
    public String getDeploymentPolicy() {
        return deploymentPolicy;
    }

    public void setDeploymentPolicy(String deploymentPolicy) {
        this.deploymentPolicy = deploymentPolicy;
    }

    public RepositoryDOV5 withParentRepoName(String parentRepoName) {
        this.parentRepoName = parentRepoName;
        return this;
    }

    /**
     * **参数解释**: 父仓库名。 **取值范围**: 不涉及。
     * @return parentRepoName
     */
    public String getParentRepoName() {
        return parentRepoName;
    }

    public void setParentRepoName(String parentRepoName) {
        this.parentRepoName = parentRepoName;
    }

    public RepositoryDOV5 withRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
        return this;
    }

    /**
     * **参数解释**: 代理仓地址。 **取值范围**: 不涉及。
     * @return remoteUrl
     */
    public String getRemoteUrl() {
        return remoteUrl;
    }

    public void setRemoteUrl(String remoteUrl) {
        this.remoteUrl = remoteUrl;
    }

    public RepositoryDOV5 withRemoteAuth(String remoteAuth) {
        this.remoteAuth = remoteAuth;
        return this;
    }

    /**
     * **参数解释**: 代理仓认证。 **取值范围**: 不涉及。
     * @return remoteAuth
     */
    public String getRemoteAuth() {
        return remoteAuth;
    }

    public void setRemoteAuth(String remoteAuth) {
        this.remoteAuth = remoteAuth;
    }

    public RepositoryDOV5 withPypiRegistryUrl(String pypiRegistryUrl) {
        this.pypiRegistryUrl = pypiRegistryUrl;
        return this;
    }

    /**
     * **参数解释**: pypi索引代理地址。 **取值范围**: 不涉及。
     * @return pypiRegistryUrl
     */
    public String getPypiRegistryUrl() {
        return pypiRegistryUrl;
    }

    public void setPypiRegistryUrl(String pypiRegistryUrl) {
        this.pypiRegistryUrl = pypiRegistryUrl;
    }

    public RepositoryDOV5 withDefaultDeployRepository(String defaultDeployRepository) {
        this.defaultDeployRepository = defaultDeployRepository;
        return this;
    }

    /**
     * **参数解释**: 虚仓的默认仓库。 **取值范围**: 不涉及。
     * @return defaultDeployRepository
     */
    public String getDefaultDeployRepository() {
        return defaultDeployRepository;
    }

    public void setDefaultDeployRepository(String defaultDeployRepository) {
        this.defaultDeployRepository = defaultDeployRepository;
    }

    public RepositoryDOV5 withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * **参数解释**: 制品类型。 **取值范围**: 不涉及。
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public RepositoryDOV5 withNexuRepo(Boolean nexuRepo) {
        this.nexuRepo = nexuRepo;
        return this;
    }

    /**
     * **参数解释**: 是否nexu仓库。 **取值范围**: 不涉及。
     * @return nexuRepo
     */
    public Boolean getNexuRepo() {
        return nexuRepo;
    }

    public void setNexuRepo(Boolean nexuRepo) {
        this.nexuRepo = nexuRepo;
    }

    public RepositoryDOV5 withMigrateFlag(Integer migrateFlag) {
        this.migrateFlag = migrateFlag;
        return this;
    }

    /**
     * **参数解释**: 迁移标识。 **取值范围**: 不涉及。
     * @return migrateFlag
     */
    public Integer getMigrateFlag() {
        return migrateFlag;
    }

    public void setMigrateFlag(Integer migrateFlag) {
        this.migrateFlag = migrateFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryDOV5 that = (RepositoryDOV5) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.region, that.region) && Objects.equals(this.createdTime, that.createdTime)
            && Objects.equals(this.modifiedTime, that.modifiedTime)
            && Objects.equals(this.createdUserId, that.createdUserId)
            && Objects.equals(this.createdUserName, that.createdUserName)
            && Objects.equals(this.modifiedUserId, that.modifiedUserId)
            && Objects.equals(this.modifiedUserName, that.modifiedUserName)
            && Objects.equals(this.repositoryName, that.repositoryName) && Objects.equals(this.format, that.format)
            && Objects.equals(this.type, that.type) && Objects.equals(this.description, that.description)
            && Objects.equals(this.release, that.release) && Objects.equals(this.snapshot, that.snapshot)
            && Objects.equals(this.includesPattern, that.includesPattern)
            && Objects.equals(this.excludesPattern, that.excludesPattern)
            && Objects.equals(this.shareRight, that.shareRight) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.disable, that.disable)
            && Objects.equals(this.policy, that.policy) && Objects.equals(this.npm, that.npm)
            && Objects.equals(this.uri, that.uri) && Objects.equals(this.repositories, that.repositories)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.password, that.password)
            && Objects.equals(this.proxy, that.proxy) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.url, that.url) && Objects.equals(this.tabId, that.tabId)
            && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.snapshotStatus, that.snapshotStatus)
            && Objects.equals(this.releaseStatus, that.releaseStatus)
            && Objects.equals(this.repositoryIds, that.repositoryIds)
            && Objects.equals(this.deploymentPolicy, that.deploymentPolicy)
            && Objects.equals(this.parentRepoName, that.parentRepoName)
            && Objects.equals(this.remoteUrl, that.remoteUrl) && Objects.equals(this.remoteAuth, that.remoteAuth)
            && Objects.equals(this.pypiRegistryUrl, that.pypiRegistryUrl)
            && Objects.equals(this.defaultDeployRepository, that.defaultDeployRepository)
            && Objects.equals(this.packageType, that.packageType) && Objects.equals(this.nexuRepo, that.nexuRepo)
            && Objects.equals(this.migrateFlag, that.migrateFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            domainId,
            region,
            createdTime,
            modifiedTime,
            createdUserId,
            createdUserName,
            modifiedUserId,
            modifiedUserName,
            repositoryName,
            format,
            type,
            description,
            release,
            snapshot,
            includesPattern,
            excludesPattern,
            shareRight,
            projectId,
            name,
            disable,
            policy,
            npm,
            uri,
            repositories,
            userName,
            password,
            proxy,
            scope,
            url,
            tabId,
            displayName,
            snapshotStatus,
            releaseStatus,
            repositoryIds,
            deploymentPolicy,
            parentRepoName,
            remoteUrl,
            remoteAuth,
            pypiRegistryUrl,
            defaultDeployRepository,
            packageType,
            nexuRepo,
            migrateFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryDOV5 {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
        sb.append("    createdUserId: ").append(toIndentedString(createdUserId)).append("\n");
        sb.append("    createdUserName: ").append(toIndentedString(createdUserName)).append("\n");
        sb.append("    modifiedUserId: ").append(toIndentedString(modifiedUserId)).append("\n");
        sb.append("    modifiedUserName: ").append(toIndentedString(modifiedUserName)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    release: ").append(toIndentedString(release)).append("\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
        sb.append("    includesPattern: ").append(toIndentedString(includesPattern)).append("\n");
        sb.append("    excludesPattern: ").append(toIndentedString(excludesPattern)).append("\n");
        sb.append("    shareRight: ").append(toIndentedString(shareRight)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    npm: ").append(toIndentedString(npm)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    snapshotStatus: ").append(toIndentedString(snapshotStatus)).append("\n");
        sb.append("    releaseStatus: ").append(toIndentedString(releaseStatus)).append("\n");
        sb.append("    repositoryIds: ").append(toIndentedString(repositoryIds)).append("\n");
        sb.append("    deploymentPolicy: ").append(toIndentedString(deploymentPolicy)).append("\n");
        sb.append("    parentRepoName: ").append(toIndentedString(parentRepoName)).append("\n");
        sb.append("    remoteUrl: ").append(toIndentedString(remoteUrl)).append("\n");
        sb.append("    remoteAuth: ").append(toIndentedString(remoteAuth)).append("\n");
        sb.append("    pypiRegistryUrl: ").append(toIndentedString(pypiRegistryUrl)).append("\n");
        sb.append("    defaultDeployRepository: ").append(toIndentedString(defaultDeployRepository)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    nexuRepo: ").append(toIndentedString(nexuRepo)).append("\n");
        sb.append("    migrateFlag: ").append(toIndentedString(migrateFlag)).append("\n");
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
