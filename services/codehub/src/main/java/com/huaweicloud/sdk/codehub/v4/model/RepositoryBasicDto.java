package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepositoryBasicDto
 */
public class RepositoryBasicDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_with_namespace")

    private String nameWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_with_namespace")

    private String pathWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived")

    private Boolean archived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_url_to_repo")

    private String sshUrlToRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_url_to_repo")

    private String httpUrlToRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readme_url")

    private String readmeUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    /**
     * **参数解释：** 仓库开发模式。 **取值范围：** - normal - CR
     */
    public static final class DevelopModeEnum {

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final DevelopModeEnum NORMAL = new DevelopModeEnum("normal");

        /**
         * Enum CR for value: "CR"
         */
        public static final DevelopModeEnum CR = new DevelopModeEnum("CR");

        private static final Map<String, DevelopModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DevelopModeEnum> createStaticFields() {
            Map<String, DevelopModeEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("CR", CR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DevelopModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DevelopModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DevelopModeEnum(value));
        }

        public static DevelopModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DevelopModeEnum) {
                return this.value.equals(((DevelopModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_mode")

    private DevelopModeEnum developMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_result")

    private Boolean moderationResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_branch")

    private String defaultBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avatar_url")

    private String avatarUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "star_count")

    private Integer starCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forks_count")

    private Integer forksCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_issues_count")

    private Integer openIssuesCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_merge_requests_count")

    private Integer openMergeRequestsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_activity_at")

    private String lastActivityAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private NamespaceBasicDto namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "empty_repo")

    private Boolean emptyRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starred")

    private Boolean starred;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_tag")

    private String securityTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security")

    private String security;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_type")

    private String networkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private RepositoryUserBasicDto owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private RepositoryUserBasicDto creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private Integer creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forked_from_repository")

    private RepositorySimpleDto forkedFromRepository;

    public RepositoryBasicDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库ID。
     * minimum: 1
     * maximum: 2147483647
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public RepositoryBasicDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 仓库描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RepositoryBasicDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 仓库名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryBasicDto withNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    /**
     * **参数解释：** 仓库完整名称。
     * @return nameWithNamespace
     */
    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public void setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
    }

    public RepositoryBasicDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 仓库路径。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RepositoryBasicDto withPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }

    /**
     * **参数解释：** 仓库完整路径。
     * @return pathWithNamespace
     */
    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    public void setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
    }

    public RepositoryBasicDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RepositoryBasicDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RepositoryBasicDto withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * **参数解释：** 是否归档。
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public RepositoryBasicDto withSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
        return this;
    }

    /**
     * **参数解释：** 仓库ssh地址。
     * @return sshUrlToRepo
     */
    public String getSshUrlToRepo() {
        return sshUrlToRepo;
    }

    public void setSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
    }

    public RepositoryBasicDto withHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
        return this;
    }

    /**
     * **参数解释：** 仓库http地址。
     * @return httpUrlToRepo
     */
    public String getHttpUrlToRepo() {
        return httpUrlToRepo;
    }

    public void setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
    }

    public RepositoryBasicDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * **参数解释：** 仓库页面链接。
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public RepositoryBasicDto withReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
        return this;
    }

    /**
     * **参数解释：** 仓库readme文件链接。
     * @return readmeUrl
     */
    public String getReadmeUrl() {
        return readmeUrl;
    }

    public void setReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
    }

    public RepositoryBasicDto withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 仓库所属项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RepositoryBasicDto withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 仓库所属项目名称。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public RepositoryBasicDto withDevelopMode(DevelopModeEnum developMode) {
        this.developMode = developMode;
        return this;
    }

    /**
     * **参数解释：** 仓库开发模式。 **取值范围：** - normal - CR
     * @return developMode
     */
    public DevelopModeEnum getDevelopMode() {
        return developMode;
    }

    public void setDevelopMode(DevelopModeEnum developMode) {
        this.developMode = developMode;
    }

    public RepositoryBasicDto withModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
        return this;
    }

    /**
     * **参数解释：** 审核状态。
     * @return moderationResult
     */
    public Boolean getModerationResult() {
        return moderationResult;
    }

    public void setModerationResult(Boolean moderationResult) {
        this.moderationResult = moderationResult;
    }

    public RepositoryBasicDto withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    /**
     * **参数解释：** 仓库默认分支 **约束限制：** 不涉及。
     * @return defaultBranch
     */
    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public RepositoryBasicDto withAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * **参数解释：** 仓库图标url **约束限制：** 不涉及。
     * @return avatarUrl
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public RepositoryBasicDto withStarCount(Integer starCount) {
        this.starCount = starCount;
        return this;
    }

    /**
     * **参数解释：** 关注数 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return starCount
     */
    public Integer getStarCount() {
        return starCount;
    }

    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    public RepositoryBasicDto withForksCount(Integer forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    /**
     * **参数解释：** fork数 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return forksCount
     */
    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public RepositoryBasicDto withOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    /**
     * **参数解释：** 开启issue数 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return openIssuesCount
     */
    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public RepositoryBasicDto withOpenMergeRequestsCount(Integer openMergeRequestsCount) {
        this.openMergeRequestsCount = openMergeRequestsCount;
        return this;
    }

    /**
     * **参数解释：** 开启中的CR、MR数量 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return openMergeRequestsCount
     */
    public Integer getOpenMergeRequestsCount() {
        return openMergeRequestsCount;
    }

    public void setOpenMergeRequestsCount(Integer openMergeRequestsCount) {
        this.openMergeRequestsCount = openMergeRequestsCount;
    }

    public RepositoryBasicDto withLastActivityAt(String lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
        return this;
    }

    /**
     * **参数解释：** 最后活跃时间 **约束限制：** 不涉及。
     * @return lastActivityAt
     */
    public String getLastActivityAt() {
        return lastActivityAt;
    }

    public void setLastActivityAt(String lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    public RepositoryBasicDto withNamespace(NamespaceBasicDto namespace) {
        this.namespace = namespace;
        return this;
    }

    public RepositoryBasicDto withNamespace(Consumer<NamespaceBasicDto> namespaceSetter) {
        if (this.namespace == null) {
            this.namespace = new NamespaceBasicDto();
            namespaceSetter.accept(this.namespace);
        }

        return this;
    }

    /**
     * Get namespace
     * @return namespace
     */
    public NamespaceBasicDto getNamespace() {
        return namespace;
    }

    public void setNamespace(NamespaceBasicDto namespace) {
        this.namespace = namespace;
    }

    public RepositoryBasicDto withEmptyRepo(Boolean emptyRepo) {
        this.emptyRepo = emptyRepo;
        return this;
    }

    /**
     * **参数解释：** 空仓库 **约束限制：** 不涉及。
     * @return emptyRepo
     */
    public Boolean getEmptyRepo() {
        return emptyRepo;
    }

    public void setEmptyRepo(Boolean emptyRepo) {
        this.emptyRepo = emptyRepo;
    }

    public RepositoryBasicDto withStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }

    /**
     * **参数解释：** 是否已关注 **约束限制：** 不涉及。
     * @return starred
     */
    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public RepositoryBasicDto withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释：** 仓库可见等级 **约束限制：** 不涉及。
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public RepositoryBasicDto withSecurityTag(String securityTag) {
        this.securityTag = securityTag;
        return this;
    }

    /**
     * **参数解释：** 仓库保密等级 **约束限制：** 不涉及。
     * @return securityTag
     */
    public String getSecurityTag() {
        return securityTag;
    }

    public void setSecurityTag(String securityTag) {
        this.securityTag = securityTag;
    }

    public RepositoryBasicDto withSecurity(String security) {
        this.security = security;
        return this;
    }

    /**
     * **参数解释：** 仓库保密等级 **约束限制：** 不涉及。
     * @return security
     */
    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public RepositoryBasicDto withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * **参数解释：** 网络类型 **约束限制：** 不涉及。
     * @return networkType
     */
    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public RepositoryBasicDto withOwner(RepositoryUserBasicDto owner) {
        this.owner = owner;
        return this;
    }

    public RepositoryBasicDto withOwner(Consumer<RepositoryUserBasicDto> ownerSetter) {
        if (this.owner == null) {
            this.owner = new RepositoryUserBasicDto();
            ownerSetter.accept(this.owner);
        }

        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    public RepositoryUserBasicDto getOwner() {
        return owner;
    }

    public void setOwner(RepositoryUserBasicDto owner) {
        this.owner = owner;
    }

    public RepositoryBasicDto withCreator(RepositoryUserBasicDto creator) {
        this.creator = creator;
        return this;
    }

    public RepositoryBasicDto withCreator(Consumer<RepositoryUserBasicDto> creatorSetter) {
        if (this.creator == null) {
            this.creator = new RepositoryUserBasicDto();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public RepositoryUserBasicDto getCreator() {
        return creator;
    }

    public void setCreator(RepositoryUserBasicDto creator) {
        this.creator = creator;
    }

    public RepositoryBasicDto withCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释：** 创建者ID **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return creatorId
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public RepositoryBasicDto withForkedFromRepository(RepositorySimpleDto forkedFromRepository) {
        this.forkedFromRepository = forkedFromRepository;
        return this;
    }

    public RepositoryBasicDto withForkedFromRepository(Consumer<RepositorySimpleDto> forkedFromRepositorySetter) {
        if (this.forkedFromRepository == null) {
            this.forkedFromRepository = new RepositorySimpleDto();
            forkedFromRepositorySetter.accept(this.forkedFromRepository);
        }

        return this;
    }

    /**
     * Get forkedFromRepository
     * @return forkedFromRepository
     */
    public RepositorySimpleDto getForkedFromRepository() {
        return forkedFromRepository;
    }

    public void setForkedFromRepository(RepositorySimpleDto forkedFromRepository) {
        this.forkedFromRepository = forkedFromRepository;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryBasicDto that = (RepositoryBasicDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nameWithNamespace, that.nameWithNamespace)
            && Objects.equals(this.path, that.path) && Objects.equals(this.pathWithNamespace, that.pathWithNamespace)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.archived, that.archived) && Objects.equals(this.sshUrlToRepo, that.sshUrlToRepo)
            && Objects.equals(this.httpUrlToRepo, that.httpUrlToRepo) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.readmeUrl, that.readmeUrl) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.developMode, that.developMode)
            && Objects.equals(this.moderationResult, that.moderationResult)
            && Objects.equals(this.defaultBranch, that.defaultBranch) && Objects.equals(this.avatarUrl, that.avatarUrl)
            && Objects.equals(this.starCount, that.starCount) && Objects.equals(this.forksCount, that.forksCount)
            && Objects.equals(this.openIssuesCount, that.openIssuesCount)
            && Objects.equals(this.openMergeRequestsCount, that.openMergeRequestsCount)
            && Objects.equals(this.lastActivityAt, that.lastActivityAt)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.emptyRepo, that.emptyRepo)
            && Objects.equals(this.starred, that.starred) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.securityTag, that.securityTag) && Objects.equals(this.security, that.security)
            && Objects.equals(this.networkType, that.networkType) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.creator, that.creator) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.forkedFromRepository, that.forkedFromRepository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            name,
            nameWithNamespace,
            path,
            pathWithNamespace,
            createdAt,
            updatedAt,
            archived,
            sshUrlToRepo,
            httpUrlToRepo,
            webUrl,
            readmeUrl,
            projectId,
            projectName,
            developMode,
            moderationResult,
            defaultBranch,
            avatarUrl,
            starCount,
            forksCount,
            openIssuesCount,
            openMergeRequestsCount,
            lastActivityAt,
            namespace,
            emptyRepo,
            starred,
            visibility,
            securityTag,
            security,
            networkType,
            owner,
            creator,
            creatorId,
            forkedFromRepository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryBasicDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nameWithNamespace: ").append(toIndentedString(nameWithNamespace)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    pathWithNamespace: ").append(toIndentedString(pathWithNamespace)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    sshUrlToRepo: ").append(toIndentedString(sshUrlToRepo)).append("\n");
        sb.append("    httpUrlToRepo: ").append(toIndentedString(httpUrlToRepo)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    readmeUrl: ").append(toIndentedString(readmeUrl)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    developMode: ").append(toIndentedString(developMode)).append("\n");
        sb.append("    moderationResult: ").append(toIndentedString(moderationResult)).append("\n");
        sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    starCount: ").append(toIndentedString(starCount)).append("\n");
        sb.append("    forksCount: ").append(toIndentedString(forksCount)).append("\n");
        sb.append("    openIssuesCount: ").append(toIndentedString(openIssuesCount)).append("\n");
        sb.append("    openMergeRequestsCount: ").append(toIndentedString(openMergeRequestsCount)).append("\n");
        sb.append("    lastActivityAt: ").append(toIndentedString(lastActivityAt)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    emptyRepo: ").append(toIndentedString(emptyRepo)).append("\n");
        sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    securityTag: ").append(toIndentedString(securityTag)).append("\n");
        sb.append("    security: ").append(toIndentedString(security)).append("\n");
        sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    forkedFromRepository: ").append(toIndentedString(forkedFromRepository)).append("\n");
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
