package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RepositorySimplestDto
 */
public class RepositorySimplestDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_mode")

    private String developMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security")

    private String security;

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
    @JsonProperty(value = "starred")

    private Boolean starred;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_with_namespace")

    private String nameWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_activity_at")

    private String lastActivityAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forked_from_repository")

    private ForkedFromRepositorySimplestDto forkedFromRepository;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private Integer permissions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived")

    private Boolean archived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_count")

    private Integer memberCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_repository_updated_at")

    private String lastRepositoryUpdatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_url_to_repo")

    private String sshUrlToRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_url_to_repo")

    private String httpUrlToRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_statistic")

    private List<Integer> activeStatistic = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_is_delete")

    private Boolean projectIsDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private Integer creatorId;

    public RepositorySimplestDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库ID **约束限制：** 不涉及。
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

    public RepositorySimplestDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 仓库名称。 **约束限制：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositorySimplestDto withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释：** 命名空间。 **约束限制：** 不涉及。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public RepositorySimplestDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 仓库路径。 **约束限制：** 不涉及。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RepositorySimplestDto withDevelopMode(String developMode) {
        this.developMode = developMode;
        return this;
    }

    /**
     * **参数解释：** 开发模式。 **约束限制：** 不涉及。
     * @return developMode
     */
    public String getDevelopMode() {
        return developMode;
    }

    public void setDevelopMode(String developMode) {
        this.developMode = developMode;
    }

    public RepositorySimplestDto withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释：** 可见性。 **约束限制：** 不涉及。
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public RepositorySimplestDto withSecurity(String security) {
        this.security = security;
        return this;
    }

    /**
     * **参数解释：** 安全级别。 **约束限制：** 不涉及。
     * @return security
     */
    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public RepositorySimplestDto withStarCount(Integer starCount) {
        this.starCount = starCount;
        return this;
    }

    /**
     * **参数解释：** 关注数。 **约束限制：** 不涉及。
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

    public RepositorySimplestDto withForksCount(Integer forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    /**
     * **参数解释：** Fork数。 **约束限制：** 不涉及。
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

    public RepositorySimplestDto withOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    /**
     * **参数解释：** 开放的问题数。 **约束限制：** 不涉及。
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

    public RepositorySimplestDto withOpenMergeRequestsCount(Integer openMergeRequestsCount) {
        this.openMergeRequestsCount = openMergeRequestsCount;
        return this;
    }

    /**
     * **参数解释：** 开放的合并请求数。 **约束限制：** 不涉及。
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

    public RepositorySimplestDto withStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }

    /**
     * **参数解释：** 是否已关注。 **约束限制：** 不涉及。
     * @return starred
     */
    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public RepositorySimplestDto withNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    /**
     * **参数解释：** 包含命名空间的仓库名称。 **约束限制：** 不涉及。
     * @return nameWithNamespace
     */
    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public void setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
    }

    public RepositorySimplestDto withLastActivityAt(String lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
        return this;
    }

    /**
     * **参数解释：** 最后活跃时间。 **约束限制：** 不涉及。
     * @return lastActivityAt
     */
    public String getLastActivityAt() {
        return lastActivityAt;
    }

    public void setLastActivityAt(String lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    public RepositorySimplestDto withForkedFromRepository(ForkedFromRepositorySimplestDto forkedFromRepository) {
        this.forkedFromRepository = forkedFromRepository;
        return this;
    }

    public RepositorySimplestDto withForkedFromRepository(
        Consumer<ForkedFromRepositorySimplestDto> forkedFromRepositorySetter) {
        if (this.forkedFromRepository == null) {
            this.forkedFromRepository = new ForkedFromRepositorySimplestDto();
            forkedFromRepositorySetter.accept(this.forkedFromRepository);
        }

        return this;
    }

    /**
     * Get forkedFromRepository
     * @return forkedFromRepository
     */
    public ForkedFromRepositorySimplestDto getForkedFromRepository() {
        return forkedFromRepository;
    }

    public void setForkedFromRepository(ForkedFromRepositorySimplestDto forkedFromRepository) {
        this.forkedFromRepository = forkedFromRepository;
    }

    public RepositorySimplestDto withPermissions(Integer permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * **参数解释：** 权限。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return permissions
     */
    public Integer getPermissions() {
        return permissions;
    }

    public void setPermissions(Integer permissions) {
        this.permissions = permissions;
    }

    public RepositorySimplestDto withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * **参数解释：** 是否归档。 **约束限制：** 不涉及。
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public RepositorySimplestDto withMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
        return this;
    }

    /**
     * **参数解释：** 成员数。 **约束限制：** 不涉及。
     * minimum: 1
     * maximum: 2147483647
     * @return memberCount
     */
    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public RepositorySimplestDto withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * **参数解释：** 仓库唯一标识符。 **约束限制：** 不涉及。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public RepositorySimplestDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 仓库描述。 **约束限制：** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RepositorySimplestDto withLastRepositoryUpdatedAt(String lastRepositoryUpdatedAt) {
        this.lastRepositoryUpdatedAt = lastRepositoryUpdatedAt;
        return this;
    }

    /**
     * **参数解释：** 最后更新时间。 **约束限制：** 不涉及。
     * @return lastRepositoryUpdatedAt
     */
    public String getLastRepositoryUpdatedAt() {
        return lastRepositoryUpdatedAt;
    }

    public void setLastRepositoryUpdatedAt(String lastRepositoryUpdatedAt) {
        this.lastRepositoryUpdatedAt = lastRepositoryUpdatedAt;
    }

    public RepositorySimplestDto withSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
        return this;
    }

    /**
     * **参数解释：** SSH仓库URL。 **约束限制：** 不涉及。
     * @return sshUrlToRepo
     */
    public String getSshUrlToRepo() {
        return sshUrlToRepo;
    }

    public void setSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
    }

    public RepositorySimplestDto withHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
        return this;
    }

    /**
     * **参数解释：** HTTP仓库URL。 **约束限制：** 不涉及。
     * @return httpUrlToRepo
     */
    public String getHttpUrlToRepo() {
        return httpUrlToRepo;
    }

    public void setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
    }

    public RepositorySimplestDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 仓库状态。 **约束限制：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RepositorySimplestDto withActiveStatistic(List<Integer> activeStatistic) {
        this.activeStatistic = activeStatistic;
        return this;
    }

    public RepositorySimplestDto addActiveStatisticItem(Integer activeStatisticItem) {
        if (this.activeStatistic == null) {
            this.activeStatistic = new ArrayList<>();
        }
        this.activeStatistic.add(activeStatisticItem);
        return this;
    }

    public RepositorySimplestDto withActiveStatistic(Consumer<List<Integer>> activeStatisticSetter) {
        if (this.activeStatistic == null) {
            this.activeStatistic = new ArrayList<>();
        }
        activeStatisticSetter.accept(this.activeStatistic);
        return this;
    }

    /**
     * **参数解释：** 活跃统计。 **约束限制：** 不涉及。
     * @return activeStatistic
     */
    public List<Integer> getActiveStatistic() {
        return activeStatistic;
    }

    public void setActiveStatistic(List<Integer> activeStatistic) {
        this.activeStatistic = activeStatistic;
    }

    public RepositorySimplestDto withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 项目名称。 **约束限制：** 不涉及。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public RepositorySimplestDto withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目ID。 **约束限制：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RepositorySimplestDto withProjectIsDelete(Boolean projectIsDelete) {
        this.projectIsDelete = projectIsDelete;
        return this;
    }

    /**
     * **参数解释：** 项目是否删除。 **约束限制：** 不涉及。
     * @return projectIsDelete
     */
    public Boolean getProjectIsDelete() {
        return projectIsDelete;
    }

    public void setProjectIsDelete(Boolean projectIsDelete) {
        this.projectIsDelete = projectIsDelete;
    }

    public RepositorySimplestDto withCreatorId(Integer creatorId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositorySimplestDto that = (RepositorySimplestDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.path, that.path)
            && Objects.equals(this.developMode, that.developMode) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.security, that.security) && Objects.equals(this.starCount, that.starCount)
            && Objects.equals(this.forksCount, that.forksCount)
            && Objects.equals(this.openIssuesCount, that.openIssuesCount)
            && Objects.equals(this.openMergeRequestsCount, that.openMergeRequestsCount)
            && Objects.equals(this.starred, that.starred)
            && Objects.equals(this.nameWithNamespace, that.nameWithNamespace)
            && Objects.equals(this.lastActivityAt, that.lastActivityAt)
            && Objects.equals(this.forkedFromRepository, that.forkedFromRepository)
            && Objects.equals(this.permissions, that.permissions) && Objects.equals(this.archived, that.archived)
            && Objects.equals(this.memberCount, that.memberCount) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.lastRepositoryUpdatedAt, that.lastRepositoryUpdatedAt)
            && Objects.equals(this.sshUrlToRepo, that.sshUrlToRepo)
            && Objects.equals(this.httpUrlToRepo, that.httpUrlToRepo) && Objects.equals(this.status, that.status)
            && Objects.equals(this.activeStatistic, that.activeStatistic)
            && Objects.equals(this.projectName, that.projectName) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.projectIsDelete, that.projectIsDelete)
            && Objects.equals(this.creatorId, that.creatorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            namespace,
            path,
            developMode,
            visibility,
            security,
            starCount,
            forksCount,
            openIssuesCount,
            openMergeRequestsCount,
            starred,
            nameWithNamespace,
            lastActivityAt,
            forkedFromRepository,
            permissions,
            archived,
            memberCount,
            uuid,
            description,
            lastRepositoryUpdatedAt,
            sshUrlToRepo,
            httpUrlToRepo,
            status,
            activeStatistic,
            projectName,
            projectId,
            projectIsDelete,
            creatorId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositorySimplestDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    developMode: ").append(toIndentedString(developMode)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    security: ").append(toIndentedString(security)).append("\n");
        sb.append("    starCount: ").append(toIndentedString(starCount)).append("\n");
        sb.append("    forksCount: ").append(toIndentedString(forksCount)).append("\n");
        sb.append("    openIssuesCount: ").append(toIndentedString(openIssuesCount)).append("\n");
        sb.append("    openMergeRequestsCount: ").append(toIndentedString(openMergeRequestsCount)).append("\n");
        sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
        sb.append("    nameWithNamespace: ").append(toIndentedString(nameWithNamespace)).append("\n");
        sb.append("    lastActivityAt: ").append(toIndentedString(lastActivityAt)).append("\n");
        sb.append("    forkedFromRepository: ").append(toIndentedString(forkedFromRepository)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lastRepositoryUpdatedAt: ").append(toIndentedString(lastRepositoryUpdatedAt)).append("\n");
        sb.append("    sshUrlToRepo: ").append(toIndentedString(sshUrlToRepo)).append("\n");
        sb.append("    httpUrlToRepo: ").append(toIndentedString(httpUrlToRepo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    activeStatistic: ").append(toIndentedString(activeStatistic)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectIsDelete: ").append(toIndentedString(projectIsDelete)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
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
