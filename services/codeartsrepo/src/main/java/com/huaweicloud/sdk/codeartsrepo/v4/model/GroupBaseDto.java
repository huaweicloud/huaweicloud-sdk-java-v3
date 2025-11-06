package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * A empty base object for group.
 */
public class GroupBaseDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ancestor_ids")

    private List<Integer> ancestorIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ancestor_names")

    private List<String> ancestorNames = null;

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
    @JsonProperty(value = "lfs_enabled")

    private Boolean lfsEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name")

    private String fullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_path")

    private String fullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_type")

    private String itemType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private Integer parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "my_role")

    private GroupMyRoleDtoV4 myRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private Integer members;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_group_count")

    private Integer subGroupCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_owner")

    private Boolean lastOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starred")

    private Boolean starred;

    public GroupBaseDto withProjectId(String projectId) {
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

    public GroupBaseDto withProjectName(String projectName) {
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

    public GroupBaseDto withAncestorIds(List<Integer> ancestorIds) {
        this.ancestorIds = ancestorIds;
        return this;
    }

    public GroupBaseDto addAncestorIdsItem(Integer ancestorIdsItem) {
        if (this.ancestorIds == null) {
            this.ancestorIds = new ArrayList<>();
        }
        this.ancestorIds.add(ancestorIdsItem);
        return this;
    }

    public GroupBaseDto withAncestorIds(Consumer<List<Integer>> ancestorIdsSetter) {
        if (this.ancestorIds == null) {
            this.ancestorIds = new ArrayList<>();
        }
        ancestorIdsSetter.accept(this.ancestorIds);
        return this;
    }

    /**
     * **参数解释：** 代码组id。
     * @return ancestorIds
     */
    public List<Integer> getAncestorIds() {
        return ancestorIds;
    }

    public void setAncestorIds(List<Integer> ancestorIds) {
        this.ancestorIds = ancestorIds;
    }

    public GroupBaseDto withAncestorNames(List<String> ancestorNames) {
        this.ancestorNames = ancestorNames;
        return this;
    }

    public GroupBaseDto addAncestorNamesItem(String ancestorNamesItem) {
        if (this.ancestorNames == null) {
            this.ancestorNames = new ArrayList<>();
        }
        this.ancestorNames.add(ancestorNamesItem);
        return this;
    }

    public GroupBaseDto withAncestorNames(Consumer<List<String>> ancestorNamesSetter) {
        if (this.ancestorNames == null) {
            this.ancestorNames = new ArrayList<>();
        }
        ancestorNamesSetter.accept(this.ancestorNames);
        return this;
    }

    /**
     * **参数解释：** 代码组名称。
     * @return ancestorNames
     */
    public List<String> getAncestorNames() {
        return ancestorNames;
    }

    public void setAncestorNames(List<String> ancestorNames) {
        this.ancestorNames = ancestorNames;
    }

    public GroupBaseDto withDevelopMode(String developMode) {
        this.developMode = developMode;
        return this;
    }

    /**
     * **参数解释：** 开发模式，normal，cr。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return developMode
     */
    public String getDevelopMode() {
        return developMode;
    }

    public void setDevelopMode(String developMode) {
        this.developMode = developMode;
    }

    public GroupBaseDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 记录id。
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

    public GroupBaseDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupBaseDto withPath(String path) {
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

    public GroupBaseDto withGroupLevel(Integer groupLevel) {
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

    public GroupBaseDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GroupBaseDto withSubgroupCount(Integer subgroupCount) {
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

    public GroupBaseDto withProjectCount(Integer projectCount) {
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

    public GroupBaseDto withGroupRole(Integer groupRole) {
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

    public GroupBaseDto withGroupMembersCount(Integer groupMembersCount) {
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

    public GroupBaseDto withDescendantType(String descendantType) {
        this.descendantType = descendantType;
        return this;
    }

    /**
     * **参数解释：** 类型。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return descendantType
     */
    public String getDescendantType() {
        return descendantType;
    }

    public void setDescendantType(String descendantType) {
        this.descendantType = descendantType;
    }

    public GroupBaseDto withVisibilityLevel(Integer visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
        return this;
    }

    /**
     * **参数解释：** 可见性 0 20。
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

    public GroupBaseDto withVisibility(String visibility) {
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

    public GroupBaseDto withIsProjectAdmin(Integer isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
        return this;
    }

    /**
     * **参数解释：** 是否为项目创建者。
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

    public GroupBaseDto withIsGroupCreator(Integer isGroupCreator) {
        this.isGroupCreator = isGroupCreator;
        return this;
    }

    /**
     * **参数解释：** 是否为代码组创建者。
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

    public GroupBaseDto withIsRepoCreator(Integer isRepoCreator) {
        this.isRepoCreator = isRepoCreator;
        return this;
    }

    /**
     * **参数解释：** 是否为仓库创建者。
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

    public GroupBaseDto withLfsEnabled(Boolean lfsEnabled) {
        this.lfsEnabled = lfsEnabled;
        return this;
    }

    /**
     * **参数解释：** lfs是否开启。
     * @return lfsEnabled
     */
    public Boolean getLfsEnabled() {
        return lfsEnabled;
    }

    public void setLfsEnabled(Boolean lfsEnabled) {
        this.lfsEnabled = lfsEnabled;
    }

    public GroupBaseDto withFullName(String fullName) {
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

    public GroupBaseDto withFullPath(String fullPath) {
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

    public GroupBaseDto withItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
     * **参数解释：** item类型。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return itemType
     */
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public GroupBaseDto withParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释：** 父代码组id。
     * minimum: 1
     * maximum: 2147483647
     * @return parentId
     */
    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public GroupBaseDto withMyRole(GroupMyRoleDtoV4 myRole) {
        this.myRole = myRole;
        return this;
    }

    public GroupBaseDto withMyRole(Consumer<GroupMyRoleDtoV4> myRoleSetter) {
        if (this.myRole == null) {
            this.myRole = new GroupMyRoleDtoV4();
            myRoleSetter.accept(this.myRole);
        }

        return this;
    }

    /**
     * Get myRole
     * @return myRole
     */
    public GroupMyRoleDtoV4 getMyRole() {
        return myRole;
    }

    public void setMyRole(GroupMyRoleDtoV4 myRole) {
        this.myRole = myRole;
    }

    public GroupBaseDto withMembers(Integer members) {
        this.members = members;
        return this;
    }

    /**
     * **参数解释：** 成员。
     * minimum: 1
     * maximum: 2147483647
     * @return members
     */
    public Integer getMembers() {
        return members;
    }

    public void setMembers(Integer members) {
        this.members = members;
    }

    public GroupBaseDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * **参数解释：** url地址。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public GroupBaseDto withCreatedAt(String createdAt) {
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

    public GroupBaseDto withSubGroupCount(Integer subGroupCount) {
        this.subGroupCount = subGroupCount;
        return this;
    }

    /**
     * **参数解释：** 子代码组数量。
     * minimum: 1
     * maximum: 2147483647
     * @return subGroupCount
     */
    public Integer getSubGroupCount() {
        return subGroupCount;
    }

    public void setSubGroupCount(Integer subGroupCount) {
        this.subGroupCount = subGroupCount;
    }

    public GroupBaseDto withLastOwner(Boolean lastOwner) {
        this.lastOwner = lastOwner;
        return this;
    }

    /**
     * **参数解释：** 是否为最后所有者。
     * @return lastOwner
     */
    public Boolean getLastOwner() {
        return lastOwner;
    }

    public void setLastOwner(Boolean lastOwner) {
        this.lastOwner = lastOwner;
    }

    public GroupBaseDto withStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }

    /**
     * **参数解释：** 是否关注。
     * @return starred
     */
    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupBaseDto that = (GroupBaseDto) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.ancestorIds, that.ancestorIds)
            && Objects.equals(this.ancestorNames, that.ancestorNames)
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
            && Objects.equals(this.lfsEnabled, that.lfsEnabled) && Objects.equals(this.fullName, that.fullName)
            && Objects.equals(this.fullPath, that.fullPath) && Objects.equals(this.itemType, that.itemType)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.myRole, that.myRole)
            && Objects.equals(this.members, that.members) && Objects.equals(this.webUrl, that.webUrl)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.subGroupCount, that.subGroupCount)
            && Objects.equals(this.lastOwner, that.lastOwner) && Objects.equals(this.starred, that.starred);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            projectName,
            ancestorIds,
            ancestorNames,
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
            lfsEnabled,
            fullName,
            fullPath,
            itemType,
            parentId,
            myRole,
            members,
            webUrl,
            createdAt,
            subGroupCount,
            lastOwner,
            starred);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupBaseDto {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    ancestorIds: ").append(toIndentedString(ancestorIds)).append("\n");
        sb.append("    ancestorNames: ").append(toIndentedString(ancestorNames)).append("\n");
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
        sb.append("    lfsEnabled: ").append(toIndentedString(lfsEnabled)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    myRole: ").append(toIndentedString(myRole)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    subGroupCount: ").append(toIndentedString(subGroupCount)).append("\n");
        sb.append("    lastOwner: ").append(toIndentedString(lastOwner)).append("\n");
        sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
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
