package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取DataArtsStudio工作空间角色信息
 */
public class ApigWorkspaceUserDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_ids")

    private List<ApigIamUserDto> userIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groups")

    private List<Group> groups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roles_ids")

    private List<ApigRole> rolesIds = null;

    public ApigWorkspaceUserDto withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 用户类型，0:添加用户;1:添加用户组
     * minimum: 0
     * maximum: 1
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ApigWorkspaceUserDto withUserIds(List<ApigIamUserDto> userIds) {
        this.userIds = userIds;
        return this;
    }

    public ApigWorkspaceUserDto addUserIdsItem(ApigIamUserDto userIdsItem) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        this.userIds.add(userIdsItem);
        return this;
    }

    public ApigWorkspaceUserDto withUserIds(Consumer<List<ApigIamUserDto>> userIdsSetter) {
        if (this.userIds == null) {
            this.userIds = new ArrayList<>();
        }
        userIdsSetter.accept(this.userIds);
        return this;
    }

    /**
     * 用户列表信息
     * @return userIds
     */
    public List<ApigIamUserDto> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<ApigIamUserDto> userIds) {
        this.userIds = userIds;
    }

    public ApigWorkspaceUserDto withGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    public ApigWorkspaceUserDto addGroupsItem(Group groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    public ApigWorkspaceUserDto withGroups(Consumer<List<Group>> groupsSetter) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        groupsSetter.accept(this.groups);
        return this;
    }

    /**
     * 用户组列表信息
     * @return groups
     */
    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public ApigWorkspaceUserDto withRolesIds(List<ApigRole> rolesIds) {
        this.rolesIds = rolesIds;
        return this;
    }

    public ApigWorkspaceUserDto addRolesIdsItem(ApigRole rolesIdsItem) {
        if (this.rolesIds == null) {
            this.rolesIds = new ArrayList<>();
        }
        this.rolesIds.add(rolesIdsItem);
        return this;
    }

    public ApigWorkspaceUserDto withRolesIds(Consumer<List<ApigRole>> rolesIdsSetter) {
        if (this.rolesIds == null) {
            this.rolesIds = new ArrayList<>();
        }
        rolesIdsSetter.accept(this.rolesIds);
        return this;
    }

    /**
     * 空间角色列表
     * @return rolesIds
     */
    public List<ApigRole> getRolesIds() {
        return rolesIds;
    }

    public void setRolesIds(List<ApigRole> rolesIds) {
        this.rolesIds = rolesIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApigWorkspaceUserDto apigWorkspaceUserDto = (ApigWorkspaceUserDto) o;
        return Objects.equals(this.type, apigWorkspaceUserDto.type)
            && Objects.equals(this.userIds, apigWorkspaceUserDto.userIds)
            && Objects.equals(this.groups, apigWorkspaceUserDto.groups)
            && Objects.equals(this.rolesIds, apigWorkspaceUserDto.rolesIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, userIds, groups, rolesIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApigWorkspaceUserDto {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
        sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
        sb.append("    rolesIds: ").append(toIndentedString(rolesIds)).append("\n");
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
