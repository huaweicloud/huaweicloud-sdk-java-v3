package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 仓库成员详情
 */
public class RepositoryMemberDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private Integer userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_iam_id")

    private String userIamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_nick_name")

    private String userNickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_repo_creator")

    private Integer isRepoCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_group_creator")

    private Integer isGroupCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_Project_admin")

    private Integer isProjectAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_role_name")

    private String projectRoleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_role_name")

    private String repositoryRoleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_role_Id")

    private String repositoryRoleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_source")

    private String memberSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_source")

    private String memberGroupSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_source_id")

    private String memberSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_license_status")

    private Integer serviceLicenseStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_enabled")

    private Boolean actionEnabled;

    public RepositoryMemberDto withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public RepositoryMemberDto withUserIamId(String userIamId) {
        this.userIamId = userIamId;
        return this;
    }

    /**
     * 用户iamId
     * @return userIamId
     */
    public String getUserIamId() {
        return userIamId;
    }

    public void setUserIamId(String userIamId) {
        this.userIamId = userIamId;
    }

    public RepositoryMemberDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public RepositoryMemberDto withUserNickName(String userNickName) {
        this.userNickName = userNickName;
        return this;
    }

    /**
     * 用户昵称
     * @return userNickName
     */
    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public RepositoryMemberDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 租户名称
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public RepositoryMemberDto withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 租户id
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public RepositoryMemberDto withIsRepoCreator(Integer isRepoCreator) {
        this.isRepoCreator = isRepoCreator;
        return this;
    }

    /**
     * 是否为仓库所有者
     * minimum: 0
     * maximum: 1
     * @return isRepoCreator
     */
    public Integer getIsRepoCreator() {
        return isRepoCreator;
    }

    public void setIsRepoCreator(Integer isRepoCreator) {
        this.isRepoCreator = isRepoCreator;
    }

    public RepositoryMemberDto withIsGroupCreator(Integer isGroupCreator) {
        this.isGroupCreator = isGroupCreator;
        return this;
    }

    /**
     * 是否为父代码组所有者
     * minimum: 0
     * maximum: 1
     * @return isGroupCreator
     */
    public Integer getIsGroupCreator() {
        return isGroupCreator;
    }

    public void setIsGroupCreator(Integer isGroupCreator) {
        this.isGroupCreator = isGroupCreator;
    }

    public RepositoryMemberDto withIsProjectAdmin(Integer isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
        return this;
    }

    /**
     * 是否为项目管理员
     * minimum: 0
     * maximum: 1
     * @return isProjectAdmin
     */
    public Integer getIsProjectAdmin() {
        return isProjectAdmin;
    }

    public void setIsProjectAdmin(Integer isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
    }

    public RepositoryMemberDto withProjectRoleName(String projectRoleName) {
        this.projectRoleName = projectRoleName;
        return this;
    }

    /**
     * 项目角色名称
     * @return projectRoleName
     */
    public String getProjectRoleName() {
        return projectRoleName;
    }

    public void setProjectRoleName(String projectRoleName) {
        this.projectRoleName = projectRoleName;
    }

    public RepositoryMemberDto withRepositoryRoleName(String repositoryRoleName) {
        this.repositoryRoleName = repositoryRoleName;
        return this;
    }

    /**
     * 仓库角色名称
     * @return repositoryRoleName
     */
    public String getRepositoryRoleName() {
        return repositoryRoleName;
    }

    public void setRepositoryRoleName(String repositoryRoleName) {
        this.repositoryRoleName = repositoryRoleName;
    }

    public RepositoryMemberDto withRepositoryRoleId(String repositoryRoleId) {
        this.repositoryRoleId = repositoryRoleId;
        return this;
    }

    /**
     * 仓库角色id
     * @return repositoryRoleId
     */
    public String getRepositoryRoleId() {
        return repositoryRoleId;
    }

    public void setRepositoryRoleId(String repositoryRoleId) {
        this.repositoryRoleId = repositoryRoleId;
    }

    public RepositoryMemberDto withMemberSource(String memberSource) {
        this.memberSource = memberSource;
        return this;
    }

    /**
     * 成员如果来自成员组，成员组名称
     * @return memberSource
     */
    public String getMemberSource() {
        return memberSource;
    }

    public void setMemberSource(String memberSource) {
        this.memberSource = memberSource;
    }

    public RepositoryMemberDto withMemberGroupSource(String memberGroupSource) {
        this.memberGroupSource = memberGroupSource;
        return this;
    }

    /**
     * 成员如果来自上层代码组，代码组名称
     * @return memberGroupSource
     */
    public String getMemberGroupSource() {
        return memberGroupSource;
    }

    public void setMemberGroupSource(String memberGroupSource) {
        this.memberGroupSource = memberGroupSource;
    }

    public RepositoryMemberDto withMemberSourceId(String memberSourceId) {
        this.memberSourceId = memberSourceId;
        return this;
    }

    /**
     * 成员来源id —— 代码组id或者成员组id
     * @return memberSourceId
     */
    public String getMemberSourceId() {
        return memberSourceId;
    }

    public void setMemberSourceId(String memberSourceId) {
        this.memberSourceId = memberSourceId;
    }

    public RepositoryMemberDto withServiceLicenseStatus(Integer serviceLicenseStatus) {
        this.serviceLicenseStatus = serviceLicenseStatus;
        return this;
    }

    /**
     * 成员服务级权限状态： 1-使用中、0-已停用
     * minimum: 0
     * maximum: 1
     * @return serviceLicenseStatus
     */
    public Integer getServiceLicenseStatus() {
        return serviceLicenseStatus;
    }

    public void setServiceLicenseStatus(Integer serviceLicenseStatus) {
        this.serviceLicenseStatus = serviceLicenseStatus;
    }

    public RepositoryMemberDto withActionEnabled(Boolean actionEnabled) {
        this.actionEnabled = actionEnabled;
        return this;
    }

    /**
     * 是否有对应权限： true-有权限、false-无权限
     * @return actionEnabled
     */
    public Boolean getActionEnabled() {
        return actionEnabled;
    }

    public void setActionEnabled(Boolean actionEnabled) {
        this.actionEnabled = actionEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryMemberDto that = (RepositoryMemberDto) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.userIamId, that.userIamId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userNickName, that.userNickName)
            && Objects.equals(this.tenantName, that.tenantName) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.isRepoCreator, that.isRepoCreator)
            && Objects.equals(this.isGroupCreator, that.isGroupCreator)
            && Objects.equals(this.isProjectAdmin, that.isProjectAdmin)
            && Objects.equals(this.projectRoleName, that.projectRoleName)
            && Objects.equals(this.repositoryRoleName, that.repositoryRoleName)
            && Objects.equals(this.repositoryRoleId, that.repositoryRoleId)
            && Objects.equals(this.memberSource, that.memberSource)
            && Objects.equals(this.memberGroupSource, that.memberGroupSource)
            && Objects.equals(this.memberSourceId, that.memberSourceId)
            && Objects.equals(this.serviceLicenseStatus, that.serviceLicenseStatus)
            && Objects.equals(this.actionEnabled, that.actionEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId,
            userIamId,
            userName,
            userNickName,
            tenantName,
            tenantId,
            isRepoCreator,
            isGroupCreator,
            isProjectAdmin,
            projectRoleName,
            repositoryRoleName,
            repositoryRoleId,
            memberSource,
            memberGroupSource,
            memberSourceId,
            serviceLicenseStatus,
            actionEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryMemberDto {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userIamId: ").append(toIndentedString(userIamId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userNickName: ").append(toIndentedString(userNickName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    isRepoCreator: ").append(toIndentedString(isRepoCreator)).append("\n");
        sb.append("    isGroupCreator: ").append(toIndentedString(isGroupCreator)).append("\n");
        sb.append("    isProjectAdmin: ").append(toIndentedString(isProjectAdmin)).append("\n");
        sb.append("    projectRoleName: ").append(toIndentedString(projectRoleName)).append("\n");
        sb.append("    repositoryRoleName: ").append(toIndentedString(repositoryRoleName)).append("\n");
        sb.append("    repositoryRoleId: ").append(toIndentedString(repositoryRoleId)).append("\n");
        sb.append("    memberSource: ").append(toIndentedString(memberSource)).append("\n");
        sb.append("    memberGroupSource: ").append(toIndentedString(memberGroupSource)).append("\n");
        sb.append("    memberSourceId: ").append(toIndentedString(memberSourceId)).append("\n");
        sb.append("    serviceLicenseStatus: ").append(toIndentedString(serviceLicenseStatus)).append("\n");
        sb.append("    actionEnabled: ").append(toIndentedString(actionEnabled)).append("\n");
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
