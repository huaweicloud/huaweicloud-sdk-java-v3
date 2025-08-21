package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * A empty base object for subgroup and project.
 */
public class SubgroupAndProjectBaseDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_namecn")

    private String roleNamecn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_nameen")

    private String roleNameen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name")

    private String fullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_path")

    private String fullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at_timestamp")

    private String updatedAtTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "star_time")

    private String starTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starred")

    private Boolean starred;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_mode")

    private String developMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_level")

    private Integer groupLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subgroup_count")

    private Integer subgroupCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_count")

    private Integer projectCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_role")

    private Integer groupRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_members_count")

    private Integer groupMembersCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "descendant_type")

    private String descendantType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility_level")

    private Integer visibilityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_project_admin")

    private Integer isProjectAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_group_creator")

    private Integer isGroupCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_repo_creator")

    private Integer isRepoCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_show_flag")

    private Integer roleShowFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uuid")

    private String uuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forks_count")

    private Integer forksCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_kia")

    private Boolean isKia;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_owner")

    private Boolean isOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archived")

    private Boolean archived;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_repository_updated_at")

    private String lastRepositoryUpdatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_merge_requests_count")

    private Integer openMergeRequestsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_merge_requests_count")

    private Integer allMergeRequestsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_role")

    private Integer projectRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_members_count")

    private Integer projectMembersCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_creator")

    private ProjectCreatorDto projectCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "star_count")

    private Integer starCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_list")

    private List<String> tagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_url_to_repo")

    private String httpUrlToRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssh_url_to_repo")

    private String sshUrlToRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_statistic")

    private List<Integer> activeStatistic = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_tag")

    private String securityTag;

    public SubgroupAndProjectBaseDto withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public SubgroupAndProjectBaseDto withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 项目名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public SubgroupAndProjectBaseDto withRoleNamecn(String roleNamecn) {
        this.roleNamecn = roleNamecn;
        return this;
    }

    /**
     * **参数解释：** 角色中文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return roleNamecn
     */
    public String getRoleNamecn() {
        return roleNamecn;
    }

    public void setRoleNamecn(String roleNamecn) {
        this.roleNamecn = roleNamecn;
    }

    public SubgroupAndProjectBaseDto withRoleNameen(String roleNameen) {
        this.roleNameen = roleNameen;
        return this;
    }

    /**
     * **参数解释：** 角色英文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return roleNameen
     */
    public String getRoleNameen() {
        return roleNameen;
    }

    public void setRoleNameen(String roleNameen) {
        this.roleNameen = roleNameen;
    }

    public SubgroupAndProjectBaseDto withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * **参数解释：** 全名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public SubgroupAndProjectBaseDto withFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    /**
     * **参数解释：** 全路径。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return fullPath
     */
    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public SubgroupAndProjectBaseDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public SubgroupAndProjectBaseDto withUpdatedAtTimestamp(String updatedAtTimestamp) {
        this.updatedAtTimestamp = updatedAtTimestamp;
        return this;
    }

    /**
     * **参数解释：** 更新时间戳。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return updatedAtTimestamp
     */
    public String getUpdatedAtTimestamp() {
        return updatedAtTimestamp;
    }

    public void setUpdatedAtTimestamp(String updatedAtTimestamp) {
        this.updatedAtTimestamp = updatedAtTimestamp;
    }

    public SubgroupAndProjectBaseDto withStarTime(String starTime) {
        this.starTime = starTime;
        return this;
    }

    /**
     * **参数解释：** 开始时间戳。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return starTime
     */
    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public SubgroupAndProjectBaseDto withStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }

    /**
     * **参数解释：** 是否收藏。
     * @return starred
     */
    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public SubgroupAndProjectBaseDto withDevelopMode(String developMode) {
        this.developMode = developMode;
        return this;
    }

    /**
     * **参数解释：** 开发模式，cr,\"normal\"。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return developMode
     */
    public String getDevelopMode() {
        return developMode;
    }

    public void setDevelopMode(String developMode) {
        this.developMode = developMode;
    }

    public SubgroupAndProjectBaseDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 仓库或者代码组id。
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

    public SubgroupAndProjectBaseDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 代码组或仓库名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SubgroupAndProjectBaseDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 路径。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public SubgroupAndProjectBaseDto withGroupLevel(Integer groupLevel) {
        this.groupLevel = groupLevel;
        return this;
    }

    /**
     * **参数解释：** 代码组层级。
     * minimum: 1
     * maximum: 2147483647
     * @return groupLevel
     */
    public Integer getGroupLevel() {
        return groupLevel;
    }

    public void setGroupLevel(Integer groupLevel) {
        this.groupLevel = groupLevel;
    }

    public SubgroupAndProjectBaseDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 代码组或仓库描述。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubgroupAndProjectBaseDto withSubgroupCount(Integer subgroupCount) {
        this.subgroupCount = subgroupCount;
        return this;
    }

    /**
     * **参数解释：** 子代码组数量。
     * minimum: 1
     * maximum: 2147483647
     * @return subgroupCount
     */
    public Integer getSubgroupCount() {
        return subgroupCount;
    }

    public void setSubgroupCount(Integer subgroupCount) {
        this.subgroupCount = subgroupCount;
    }

    public SubgroupAndProjectBaseDto withProjectCount(Integer projectCount) {
        this.projectCount = projectCount;
        return this;
    }

    /**
     * **参数解释：** 仓库数量。
     * minimum: 1
     * maximum: 2147483647
     * @return projectCount
     */
    public Integer getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(Integer projectCount) {
        this.projectCount = projectCount;
    }

    public SubgroupAndProjectBaseDto withGroupRole(Integer groupRole) {
        this.groupRole = groupRole;
        return this;
    }

    /**
     * **参数解释：** 代码组角色。
     * minimum: 1
     * maximum: 2147483647
     * @return groupRole
     */
    public Integer getGroupRole() {
        return groupRole;
    }

    public void setGroupRole(Integer groupRole) {
        this.groupRole = groupRole;
    }

    public SubgroupAndProjectBaseDto withGroupMembersCount(Integer groupMembersCount) {
        this.groupMembersCount = groupMembersCount;
        return this;
    }

    /**
     * **参数解释：** 代码组成员数量。
     * minimum: 1
     * maximum: 2147483647
     * @return groupMembersCount
     */
    public Integer getGroupMembersCount() {
        return groupMembersCount;
    }

    public void setGroupMembersCount(Integer groupMembersCount) {
        this.groupMembersCount = groupMembersCount;
    }

    public SubgroupAndProjectBaseDto withDescendantType(String descendantType) {
        this.descendantType = descendantType;
        return this;
    }

    /**
     * **参数解释：** 资源类型 group,project。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return descendantType
     */
    public String getDescendantType() {
        return descendantType;
    }

    public void setDescendantType(String descendantType) {
        this.descendantType = descendantType;
    }

    public SubgroupAndProjectBaseDto withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }

    /**
     * **参数解释：** 可见性level 0(私有),20(公开)
     * minimum: 1
     * maximum: 2147483647
     * @return visibilityLevel
     */
    public Integer getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public SubgroupAndProjectBaseDto withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释：** 可见性 private public。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public SubgroupAndProjectBaseDto withIsProjectAdmin(Integer isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
        return this;
    }

    /**
     * **参数解释：** 当前用户是否为项目创建者。
     * minimum: 1
     * maximum: 2147483647
     * @return isProjectAdmin
     */
    public Integer getIsProjectAdmin() {
        return isProjectAdmin;
    }

    public void setIsProjectAdmin(Integer isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
    }

    public SubgroupAndProjectBaseDto withIsGroupCreator(Integer isGroupCreator) {
        this.isGroupCreator = isGroupCreator;
        return this;
    }

    /**
     * **参数解释：** 当前用户是否为代码组创建者。
     * minimum: 1
     * maximum: 2147483647
     * @return isGroupCreator
     */
    public Integer getIsGroupCreator() {
        return isGroupCreator;
    }

    public void setIsGroupCreator(Integer isGroupCreator) {
        this.isGroupCreator = isGroupCreator;
    }

    public SubgroupAndProjectBaseDto withIsRepoCreator(Integer isRepoCreator) {
        this.isRepoCreator = isRepoCreator;
        return this;
    }

    /**
     * **参数解释：** 当前用户是否为仓库创建者。
     * minimum: 1
     * maximum: 2147483647
     * @return isRepoCreator
     */
    public Integer getIsRepoCreator() {
        return isRepoCreator;
    }

    public void setIsRepoCreator(Integer isRepoCreator) {
        this.isRepoCreator = isRepoCreator;
    }

    public SubgroupAndProjectBaseDto withRoleShowFlag(Integer roleShowFlag) {
        this.roleShowFlag = roleShowFlag;
        return this;
    }

    /**
     * **参数解释：** 角色展示标记。
     * minimum: 1
     * maximum: 2147483647
     * @return roleShowFlag
     */
    public Integer getRoleShowFlag() {
        return roleShowFlag;
    }

    public void setRoleShowFlag(Integer roleShowFlag) {
        this.roleShowFlag = roleShowFlag;
    }

    public SubgroupAndProjectBaseDto withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    /**
     * **参数解释：** 仓库的uuid。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public SubgroupAndProjectBaseDto withForksCount(Integer forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    /**
     * **参数解释：** fork数量。
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

    public SubgroupAndProjectBaseDto withIsKia(Boolean isKia) {
        this.isKia = isKia;
        return this;
    }

    /**
     * **参数解释：** 是否为kia。
     * @return isKia
     */
    public Boolean getIsKia() {
        return isKia;
    }

    public void setIsKia(Boolean isKia) {
        this.isKia = isKia;
    }

    public SubgroupAndProjectBaseDto withIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
        return this;
    }

    /**
     * **参数解释：** 是否为所有者。
     * @return isOwner
     */
    public Boolean getIsOwner() {
        return isOwner;
    }

    public void setIsOwner(Boolean isOwner) {
        this.isOwner = isOwner;
    }

    public SubgroupAndProjectBaseDto withArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * **参数解释：** 是否为存档。
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public SubgroupAndProjectBaseDto withLastRepositoryUpdatedAt(String lastRepositoryUpdatedAt) {
        this.lastRepositoryUpdatedAt = lastRepositoryUpdatedAt;
        return this;
    }

    /**
     * **参数解释：** 仓库的最后更新时间。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return lastRepositoryUpdatedAt
     */
    public String getLastRepositoryUpdatedAt() {
        return lastRepositoryUpdatedAt;
    }

    public void setLastRepositoryUpdatedAt(String lastRepositoryUpdatedAt) {
        this.lastRepositoryUpdatedAt = lastRepositoryUpdatedAt;
    }

    public SubgroupAndProjectBaseDto withOpenMergeRequestsCount(Integer openMergeRequestsCount) {
        this.openMergeRequestsCount = openMergeRequestsCount;
        return this;
    }

    /**
     * **参数解释：** 开启的mr数量。
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

    public SubgroupAndProjectBaseDto withAllMergeRequestsCount(Integer allMergeRequestsCount) {
        this.allMergeRequestsCount = allMergeRequestsCount;
        return this;
    }

    /**
     * **参数解释：** 所有的mr数量。
     * minimum: 1
     * maximum: 2147483647
     * @return allMergeRequestsCount
     */
    public Integer getAllMergeRequestsCount() {
        return allMergeRequestsCount;
    }

    public void setAllMergeRequestsCount(Integer allMergeRequestsCount) {
        this.allMergeRequestsCount = allMergeRequestsCount;
    }

    public SubgroupAndProjectBaseDto withProjectRole(Integer projectRole) {
        this.projectRole = projectRole;
        return this;
    }

    /**
     * **参数解释：** 仓库角色。
     * minimum: 1
     * maximum: 2147483647
     * @return projectRole
     */
    public Integer getProjectRole() {
        return projectRole;
    }

    public void setProjectRole(Integer projectRole) {
        this.projectRole = projectRole;
    }

    public SubgroupAndProjectBaseDto withProjectMembersCount(Integer projectMembersCount) {
        this.projectMembersCount = projectMembersCount;
        return this;
    }

    /**
     * **参数解释：** fork数量。
     * minimum: 1
     * maximum: 2147483647
     * @return projectMembersCount
     */
    public Integer getProjectMembersCount() {
        return projectMembersCount;
    }

    public void setProjectMembersCount(Integer projectMembersCount) {
        this.projectMembersCount = projectMembersCount;
    }

    public SubgroupAndProjectBaseDto withProjectCreator(ProjectCreatorDto projectCreator) {
        this.projectCreator = projectCreator;
        return this;
    }

    public SubgroupAndProjectBaseDto withProjectCreator(Consumer<ProjectCreatorDto> projectCreatorSetter) {
        if (this.projectCreator == null) {
            this.projectCreator = new ProjectCreatorDto();
            projectCreatorSetter.accept(this.projectCreator);
        }

        return this;
    }

    /**
     * Get projectCreator
     * @return projectCreator
     */
    public ProjectCreatorDto getProjectCreator() {
        return projectCreator;
    }

    public void setProjectCreator(ProjectCreatorDto projectCreator) {
        this.projectCreator = projectCreator;
    }

    public SubgroupAndProjectBaseDto withStarCount(Integer starCount) {
        this.starCount = starCount;
        return this;
    }

    /**
     * **参数解释：** fork数量。
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

    public SubgroupAndProjectBaseDto withTagList(List<String> tagList) {
        this.tagList = tagList;
        return this;
    }

    public SubgroupAndProjectBaseDto addTagListItem(String tagListItem) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        this.tagList.add(tagListItem);
        return this;
    }

    public SubgroupAndProjectBaseDto withTagList(Consumer<List<String>> tagListSetter) {
        if (this.tagList == null) {
            this.tagList = new ArrayList<>();
        }
        tagListSetter.accept(this.tagList);
        return this;
    }

    /**
     * **参数解释：** tag列表。
     * @return tagList
     */
    public List<String> getTagList() {
        return tagList;
    }

    public void setTagList(List<String> tagList) {
        this.tagList = tagList;
    }

    public SubgroupAndProjectBaseDto withHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
        return this;
    }

    /**
     * **参数解释：** 仓库的http url。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return httpUrlToRepo
     */
    public String getHttpUrlToRepo() {
        return httpUrlToRepo;
    }

    public void setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
    }

    public SubgroupAndProjectBaseDto withSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
        return this;
    }

    /**
     * **参数解释：** 仓库的ssh url。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return sshUrlToRepo
     */
    public String getSshUrlToRepo() {
        return sshUrlToRepo;
    }

    public void setSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
    }

    public SubgroupAndProjectBaseDto withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 状态。
     * minimum: 1
     * maximum: 2147483647
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SubgroupAndProjectBaseDto withActiveStatistic(List<Integer> activeStatistic) {
        this.activeStatistic = activeStatistic;
        return this;
    }

    public SubgroupAndProjectBaseDto addActiveStatisticItem(Integer activeStatisticItem) {
        if (this.activeStatistic == null) {
            this.activeStatistic = new ArrayList<>();
        }
        this.activeStatistic.add(activeStatisticItem);
        return this;
    }

    public SubgroupAndProjectBaseDto withActiveStatistic(Consumer<List<Integer>> activeStatisticSetter) {
        if (this.activeStatistic == null) {
            this.activeStatistic = new ArrayList<>();
        }
        activeStatisticSetter.accept(this.activeStatistic);
        return this;
    }

    /**
     * **参数解释：** 活跃统计。
     * @return activeStatistic
     */
    public List<Integer> getActiveStatistic() {
        return activeStatistic;
    }

    public void setActiveStatistic(List<Integer> activeStatistic) {
        this.activeStatistic = activeStatistic;
    }

    public SubgroupAndProjectBaseDto withSecurityTag(String securityTag) {
        this.securityTag = securityTag;
        return this;
    }

    /**
     * **参数解释：** 安全标签。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return securityTag
     */
    public String getSecurityTag() {
        return securityTag;
    }

    public void setSecurityTag(String securityTag) {
        this.securityTag = securityTag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubgroupAndProjectBaseDto that = (SubgroupAndProjectBaseDto) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.roleNamecn, that.roleNamecn) && Objects.equals(this.roleNameen, that.roleNameen)
            && Objects.equals(this.fullName, that.fullName) && Objects.equals(this.fullPath, that.fullPath)
            && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAtTimestamp, that.updatedAtTimestamp)
            && Objects.equals(this.starTime, that.starTime) && Objects.equals(this.starred, that.starred)
            && Objects.equals(this.developMode, that.developMode) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.path, that.path)
            && Objects.equals(this.groupLevel, that.groupLevel) && Objects.equals(this.description, that.description)
            && Objects.equals(this.subgroupCount, that.subgroupCount)
            && Objects.equals(this.projectCount, that.projectCount) && Objects.equals(this.groupRole, that.groupRole)
            && Objects.equals(this.groupMembersCount, that.groupMembersCount)
            && Objects.equals(this.descendantType, that.descendantType)
            && Objects.equals(this.visibilityLevel, that.visibilityLevel)
            && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.isProjectAdmin, that.isProjectAdmin)
            && Objects.equals(this.isGroupCreator, that.isGroupCreator)
            && Objects.equals(this.isRepoCreator, that.isRepoCreator)
            && Objects.equals(this.roleShowFlag, that.roleShowFlag) && Objects.equals(this.uuid, that.uuid)
            && Objects.equals(this.forksCount, that.forksCount) && Objects.equals(this.isKia, that.isKia)
            && Objects.equals(this.isOwner, that.isOwner) && Objects.equals(this.archived, that.archived)
            && Objects.equals(this.lastRepositoryUpdatedAt, that.lastRepositoryUpdatedAt)
            && Objects.equals(this.openMergeRequestsCount, that.openMergeRequestsCount)
            && Objects.equals(this.allMergeRequestsCount, that.allMergeRequestsCount)
            && Objects.equals(this.projectRole, that.projectRole)
            && Objects.equals(this.projectMembersCount, that.projectMembersCount)
            && Objects.equals(this.projectCreator, that.projectCreator)
            && Objects.equals(this.starCount, that.starCount) && Objects.equals(this.tagList, that.tagList)
            && Objects.equals(this.httpUrlToRepo, that.httpUrlToRepo)
            && Objects.equals(this.sshUrlToRepo, that.sshUrlToRepo) && Objects.equals(this.status, that.status)
            && Objects.equals(this.activeStatistic, that.activeStatistic)
            && Objects.equals(this.securityTag, that.securityTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            projectName,
            roleNamecn,
            roleNameen,
            fullName,
            fullPath,
            createdAt,
            updatedAtTimestamp,
            starTime,
            starred,
            developMode,
            id,
            name,
            path,
            groupLevel,
            description,
            subgroupCount,
            projectCount,
            groupRole,
            groupMembersCount,
            descendantType,
            visibilityLevel,
            visibility,
            isProjectAdmin,
            isGroupCreator,
            isRepoCreator,
            roleShowFlag,
            uuid,
            forksCount,
            isKia,
            isOwner,
            archived,
            lastRepositoryUpdatedAt,
            openMergeRequestsCount,
            allMergeRequestsCount,
            projectRole,
            projectMembersCount,
            projectCreator,
            starCount,
            tagList,
            httpUrlToRepo,
            sshUrlToRepo,
            status,
            activeStatistic,
            securityTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubgroupAndProjectBaseDto {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    roleNamecn: ").append(toIndentedString(roleNamecn)).append("\n");
        sb.append("    roleNameen: ").append(toIndentedString(roleNameen)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAtTimestamp: ").append(toIndentedString(updatedAtTimestamp)).append("\n");
        sb.append("    starTime: ").append(toIndentedString(starTime)).append("\n");
        sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
        sb.append("    developMode: ").append(toIndentedString(developMode)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    groupLevel: ").append(toIndentedString(groupLevel)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    subgroupCount: ").append(toIndentedString(subgroupCount)).append("\n");
        sb.append("    projectCount: ").append(toIndentedString(projectCount)).append("\n");
        sb.append("    groupRole: ").append(toIndentedString(groupRole)).append("\n");
        sb.append("    groupMembersCount: ").append(toIndentedString(groupMembersCount)).append("\n");
        sb.append("    descendantType: ").append(toIndentedString(descendantType)).append("\n");
        sb.append("    visibilityLevel: ").append(toIndentedString(visibilityLevel)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    isProjectAdmin: ").append(toIndentedString(isProjectAdmin)).append("\n");
        sb.append("    isGroupCreator: ").append(toIndentedString(isGroupCreator)).append("\n");
        sb.append("    isRepoCreator: ").append(toIndentedString(isRepoCreator)).append("\n");
        sb.append("    roleShowFlag: ").append(toIndentedString(roleShowFlag)).append("\n");
        sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
        sb.append("    forksCount: ").append(toIndentedString(forksCount)).append("\n");
        sb.append("    isKia: ").append(toIndentedString(isKia)).append("\n");
        sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    lastRepositoryUpdatedAt: ").append(toIndentedString(lastRepositoryUpdatedAt)).append("\n");
        sb.append("    openMergeRequestsCount: ").append(toIndentedString(openMergeRequestsCount)).append("\n");
        sb.append("    allMergeRequestsCount: ").append(toIndentedString(allMergeRequestsCount)).append("\n");
        sb.append("    projectRole: ").append(toIndentedString(projectRole)).append("\n");
        sb.append("    projectMembersCount: ").append(toIndentedString(projectMembersCount)).append("\n");
        sb.append("    projectCreator: ").append(toIndentedString(projectCreator)).append("\n");
        sb.append("    starCount: ").append(toIndentedString(starCount)).append("\n");
        sb.append("    tagList: ").append(toIndentedString(tagList)).append("\n");
        sb.append("    httpUrlToRepo: ").append(toIndentedString(httpUrlToRepo)).append("\n");
        sb.append("    sshUrlToRepo: ").append(toIndentedString(sshUrlToRepo)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    activeStatistic: ").append(toIndentedString(activeStatistic)).append("\n");
        sb.append("    securityTag: ").append(toIndentedString(securityTag)).append("\n");
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
