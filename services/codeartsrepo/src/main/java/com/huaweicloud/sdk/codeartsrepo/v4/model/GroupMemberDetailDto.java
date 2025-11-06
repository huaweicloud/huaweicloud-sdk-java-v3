package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupMemberDetailDto
 */
public class GroupMemberDetailDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private Integer sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private Integer userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_from")

    private String userFrom;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cn_role_name")

    private String cnRoleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_role_id")

    private String reqRoleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "req_role_name")

    private String reqRoleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group_id")

    private String userGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_group_creator")

    private Boolean isGroupCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_project_admin")

    private Boolean isProjectAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_chinese_name")

    private String roleChineseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_remove")

    private Boolean canRemove;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_level")

    private Integer accessLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_license_status")

    private Integer serviceLicenseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_id")

    private String iamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_group_member")

    private Boolean currentGroupMember;

    public GroupMemberDetailDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 唯一标识id。
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

    public GroupMemberDetailDto withSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释：** 资源id。
     * minimum: 1
     * maximum: 2147483647
     * @return sourceId
     */
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public GroupMemberDetailDto withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释：** 用户id。
     * minimum: 1
     * maximum: 2147483647
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public GroupMemberDetailDto withUserFrom(String userFrom) {
        this.userFrom = userFrom;
        return this;
    }

    /**
     * **参数解释：** 用户来源。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return userFrom
     */
    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public GroupMemberDetailDto withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * **参数解释：** 角色id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public GroupMemberDetailDto withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * **参数解释：** 角色名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public GroupMemberDetailDto withCnRoleName(String cnRoleName) {
        this.cnRoleName = cnRoleName;
        return this;
    }

    /**
     * **参数解释：** 角色中文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return cnRoleName
     */
    public String getCnRoleName() {
        return cnRoleName;
    }

    public void setCnRoleName(String cnRoleName) {
        this.cnRoleName = cnRoleName;
    }

    public GroupMemberDetailDto withReqRoleId(String reqRoleId) {
        this.reqRoleId = reqRoleId;
        return this;
    }

    /**
     * **参数解释：** 项目角色id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return reqRoleId
     */
    public String getReqRoleId() {
        return reqRoleId;
    }

    public void setReqRoleId(String reqRoleId) {
        this.reqRoleId = reqRoleId;
    }

    public GroupMemberDetailDto withReqRoleName(String reqRoleName) {
        this.reqRoleName = reqRoleName;
        return this;
    }

    /**
     * **参数解释：** 项目角色名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return reqRoleName
     */
    public String getReqRoleName() {
        return reqRoleName;
    }

    public void setReqRoleName(String reqRoleName) {
        this.reqRoleName = reqRoleName;
    }

    public GroupMemberDetailDto withUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }

    /**
     * **参数解释：** 成员组id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return userGroupId
     */
    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    public GroupMemberDetailDto withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释：** 代码组名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public GroupMemberDetailDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释：** 用户名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public GroupMemberDetailDto withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释：** 租户id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public GroupMemberDetailDto withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释：** 租户名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public GroupMemberDetailDto withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * **参数解释：** 用户昵称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public GroupMemberDetailDto withIsGroupCreator(Boolean isGroupCreator) {
        this.isGroupCreator = isGroupCreator;
        return this;
    }

    /**
     * **参数解释：** 是否为代码组创建者。
     * @return isGroupCreator
     */
    public Boolean getIsGroupCreator() {
        return isGroupCreator;
    }

    public void setIsGroupCreator(Boolean isGroupCreator) {
        this.isGroupCreator = isGroupCreator;
    }

    public GroupMemberDetailDto withIsProjectAdmin(Boolean isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
        return this;
    }

    /**
     * **参数解释：** 是否为项目管理员。
     * @return isProjectAdmin
     */
    public Boolean getIsProjectAdmin() {
        return isProjectAdmin;
    }

    public void setIsProjectAdmin(Boolean isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
    }

    public GroupMemberDetailDto withPath(String path) {
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

    public GroupMemberDetailDto withRoleChineseName(String roleChineseName) {
        this.roleChineseName = roleChineseName;
        return this;
    }

    /**
     * **参数解释：** 角色中文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return roleChineseName
     */
    public String getRoleChineseName() {
        return roleChineseName;
    }

    public void setRoleChineseName(String roleChineseName) {
        this.roleChineseName = roleChineseName;
    }

    public GroupMemberDetailDto withCanRemove(Boolean canRemove) {
        this.canRemove = canRemove;
        return this;
    }

    /**
     * **参数解释：** 是否可移除。
     * @return canRemove
     */
    public Boolean getCanRemove() {
        return canRemove;
    }

    public void setCanRemove(Boolean canRemove) {
        this.canRemove = canRemove;
    }

    public GroupMemberDetailDto withAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    /**
     * **参数解释：** 角色。
     * minimum: 1
     * maximum: 2147483647
     * @return accessLevel
     */
    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    public GroupMemberDetailDto withServiceLicenseStatus(Integer serviceLicenseStatus) {
        this.serviceLicenseStatus = serviceLicenseStatus;
        return this;
    }

    /**
     * **参数解释：** 服务license状态。
     * minimum: 1
     * maximum: 2147483647
     * @return serviceLicenseStatus
     */
    public Integer getServiceLicenseStatus() {
        return serviceLicenseStatus;
    }

    public void setServiceLicenseStatus(Integer serviceLicenseStatus) {
        this.serviceLicenseStatus = serviceLicenseStatus;
    }

    public GroupMemberDetailDto withIamId(String iamId) {
        this.iamId = iamId;
        return this;
    }

    /**
     * **参数解释：** 用户iam_id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return iamId
     */
    public String getIamId() {
        return iamId;
    }

    public void setIamId(String iamId) {
        this.iamId = iamId;
    }

    public GroupMemberDetailDto withCurrentGroupMember(Boolean currentGroupMember) {
        this.currentGroupMember = currentGroupMember;
        return this;
    }

    /**
     * **参数解释：** 是否为当前代码组成员。
     * @return currentGroupMember
     */
    public Boolean getCurrentGroupMember() {
        return currentGroupMember;
    }

    public void setCurrentGroupMember(Boolean currentGroupMember) {
        this.currentGroupMember = currentGroupMember;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupMemberDetailDto that = (GroupMemberDetailDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sourceId, that.sourceId)
            && Objects.equals(this.userId, that.userId) && Objects.equals(this.userFrom, that.userFrom)
            && Objects.equals(this.roleId, that.roleId) && Objects.equals(this.roleName, that.roleName)
            && Objects.equals(this.cnRoleName, that.cnRoleName) && Objects.equals(this.reqRoleId, that.reqRoleId)
            && Objects.equals(this.reqRoleName, that.reqRoleName) && Objects.equals(this.userGroupId, that.userGroupId)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.nickName, that.nickName) && Objects.equals(this.isGroupCreator, that.isGroupCreator)
            && Objects.equals(this.isProjectAdmin, that.isProjectAdmin) && Objects.equals(this.path, that.path)
            && Objects.equals(this.roleChineseName, that.roleChineseName)
            && Objects.equals(this.canRemove, that.canRemove) && Objects.equals(this.accessLevel, that.accessLevel)
            && Objects.equals(this.serviceLicenseStatus, that.serviceLicenseStatus)
            && Objects.equals(this.iamId, that.iamId)
            && Objects.equals(this.currentGroupMember, that.currentGroupMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            sourceId,
            userId,
            userFrom,
            roleId,
            roleName,
            cnRoleName,
            reqRoleId,
            reqRoleName,
            userGroupId,
            groupName,
            userName,
            domainId,
            domainName,
            nickName,
            isGroupCreator,
            isProjectAdmin,
            path,
            roleChineseName,
            canRemove,
            accessLevel,
            serviceLicenseStatus,
            iamId,
            currentGroupMember);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupMemberDetailDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userFrom: ").append(toIndentedString(userFrom)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    cnRoleName: ").append(toIndentedString(cnRoleName)).append("\n");
        sb.append("    reqRoleId: ").append(toIndentedString(reqRoleId)).append("\n");
        sb.append("    reqRoleName: ").append(toIndentedString(reqRoleName)).append("\n");
        sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    isGroupCreator: ").append(toIndentedString(isGroupCreator)).append("\n");
        sb.append("    isProjectAdmin: ").append(toIndentedString(isProjectAdmin)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    roleChineseName: ").append(toIndentedString(roleChineseName)).append("\n");
        sb.append("    canRemove: ").append(toIndentedString(canRemove)).append("\n");
        sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
        sb.append("    serviceLicenseStatus: ").append(toIndentedString(serviceLicenseStatus)).append("\n");
        sb.append("    iamId: ").append(toIndentedString(iamId)).append("\n");
        sb.append("    currentGroupMember: ").append(toIndentedString(currentGroupMember)).append("\n");
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
