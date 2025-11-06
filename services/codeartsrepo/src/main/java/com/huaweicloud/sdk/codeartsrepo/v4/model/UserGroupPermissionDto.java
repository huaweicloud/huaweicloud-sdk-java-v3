package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * current user group permission
 */
public class UserGroupPermissionDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_create_group")

    private Boolean canCreateGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_craete_project")

    private Boolean canCraeteProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_set_group")

    private Boolean canSetGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_visibility")

    private String groupVisibility;

    public UserGroupPermissionDto withCanCreateGroup(Boolean canCreateGroup) {
        this.canCreateGroup = canCreateGroup;
        return this;
    }

    /**
     * **参数解释：** 是否可以创建代码组。
     * @return canCreateGroup
     */
    public Boolean getCanCreateGroup() {
        return canCreateGroup;
    }

    public void setCanCreateGroup(Boolean canCreateGroup) {
        this.canCreateGroup = canCreateGroup;
    }

    public UserGroupPermissionDto withCanCraeteProject(Boolean canCraeteProject) {
        this.canCraeteProject = canCraeteProject;
        return this;
    }

    /**
     * **参数解释：** 是否可以创建仓库。
     * @return canCraeteProject
     */
    public Boolean getCanCraeteProject() {
        return canCraeteProject;
    }

    public void setCanCraeteProject(Boolean canCraeteProject) {
        this.canCraeteProject = canCraeteProject;
    }

    public UserGroupPermissionDto withCanSetGroup(Boolean canSetGroup) {
        this.canSetGroup = canSetGroup;
        return this;
    }

    /**
     * **参数解释：** 是否可以设置代码组。
     * @return canSetGroup
     */
    public Boolean getCanSetGroup() {
        return canSetGroup;
    }

    public void setCanSetGroup(Boolean canSetGroup) {
        this.canSetGroup = canSetGroup;
    }

    public UserGroupPermissionDto withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 代码组id。
     * minimum: 1
     * maximum: 2147483647
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public UserGroupPermissionDto withGroupVisibility(String groupVisibility) {
        this.groupVisibility = groupVisibility;
        return this;
    }

    /**
     * **参数解释：** 可见性, private public。
     * @return groupVisibility
     */
    public String getGroupVisibility() {
        return groupVisibility;
    }

    public void setGroupVisibility(String groupVisibility) {
        this.groupVisibility = groupVisibility;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserGroupPermissionDto that = (UserGroupPermissionDto) obj;
        return Objects.equals(this.canCreateGroup, that.canCreateGroup)
            && Objects.equals(this.canCraeteProject, that.canCraeteProject)
            && Objects.equals(this.canSetGroup, that.canSetGroup) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupVisibility, that.groupVisibility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(canCreateGroup, canCraeteProject, canSetGroup, groupId, groupVisibility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserGroupPermissionDto {\n");
        sb.append("    canCreateGroup: ").append(toIndentedString(canCreateGroup)).append("\n");
        sb.append("    canCraeteProject: ").append(toIndentedString(canCraeteProject)).append("\n");
        sb.append("    canSetGroup: ").append(toIndentedString(canSetGroup)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupVisibility: ").append(toIndentedString(groupVisibility)).append("\n");
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
