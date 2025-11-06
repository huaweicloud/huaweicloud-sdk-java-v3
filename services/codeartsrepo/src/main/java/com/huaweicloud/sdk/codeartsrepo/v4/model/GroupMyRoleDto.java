package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupMyRoleDto
 */
public class GroupMyRoleDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_level")

    private Integer accessLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_namecn")

    private String roleNamecn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_namen")

    private String roleNamen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private Integer sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private Integer userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notification_level")

    private Integer notificationLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by_id")

    private Integer createdById;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invite_email")

    private String inviteEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invite_token")

    private String inviteToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invite_accepted_at")

    private String inviteAcceptedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "requested_at")

    private String requestedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expires_at")

    private String expiresAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limited")

    private Boolean limited;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isProjectAdmin")

    private Integer isProjectAdmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isGroupCreator")

    private Integer isGroupCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isRepoCreator")

    private Integer isRepoCreator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "roleShowFlag")

    private Integer roleShowFlag;

    public GroupMyRoleDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 成员id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GroupMyRoleDto withAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    /**
     * 成员角色值
     * @return accessLevel
     */
    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    public GroupMyRoleDto withRoleNamecn(String roleNamecn) {
        this.roleNamecn = roleNamecn;
        return this;
    }

    /**
     * 角色中文名称
     * @return roleNamecn
     */
    public String getRoleNamecn() {
        return roleNamecn;
    }

    public void setRoleNamecn(String roleNamecn) {
        this.roleNamecn = roleNamecn;
    }

    public GroupMyRoleDto withRoleNamen(String roleNamen) {
        this.roleNamen = roleNamen;
        return this;
    }

    /**
     * 角色名称
     * @return roleNamen
     */
    public String getRoleNamen() {
        return roleNamen;
    }

    public void setRoleNamen(String roleNamen) {
        this.roleNamen = roleNamen;
    }

    public GroupMyRoleDto withSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 来源代码组id
     * @return sourceId
     */
    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public GroupMyRoleDto withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 来源类型
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public GroupMyRoleDto withUserId(Integer userId) {
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

    public GroupMyRoleDto withNotificationLevel(Integer notificationLevel) {
        this.notificationLevel = notificationLevel;
        return this;
    }

    /**
     * 提示级别
     * @return notificationLevel
     */
    public Integer getNotificationLevel() {
        return notificationLevel;
    }

    public void setNotificationLevel(Integer notificationLevel) {
        this.notificationLevel = notificationLevel;
    }

    public GroupMyRoleDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public GroupMyRoleDto withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GroupMyRoleDto withCreatedById(Integer createdById) {
        this.createdById = createdById;
        return this;
    }

    /**
     * 创建者id
     * @return createdById
     */
    public Integer getCreatedById() {
        return createdById;
    }

    public void setCreatedById(Integer createdById) {
        this.createdById = createdById;
    }

    public GroupMyRoleDto withInviteEmail(String inviteEmail) {
        this.inviteEmail = inviteEmail;
        return this;
    }

    /**
     * 邀请邮箱
     * @return inviteEmail
     */
    public String getInviteEmail() {
        return inviteEmail;
    }

    public void setInviteEmail(String inviteEmail) {
        this.inviteEmail = inviteEmail;
    }

    public GroupMyRoleDto withInviteToken(String inviteToken) {
        this.inviteToken = inviteToken;
        return this;
    }

    /**
     * 邀请token
     * @return inviteToken
     */
    public String getInviteToken() {
        return inviteToken;
    }

    public void setInviteToken(String inviteToken) {
        this.inviteToken = inviteToken;
    }

    public GroupMyRoleDto withInviteAcceptedAt(String inviteAcceptedAt) {
        this.inviteAcceptedAt = inviteAcceptedAt;
        return this;
    }

    /**
     * 邀请接受时间
     * @return inviteAcceptedAt
     */
    public String getInviteAcceptedAt() {
        return inviteAcceptedAt;
    }

    public void setInviteAcceptedAt(String inviteAcceptedAt) {
        this.inviteAcceptedAt = inviteAcceptedAt;
    }

    public GroupMyRoleDto withRequestedAt(String requestedAt) {
        this.requestedAt = requestedAt;
        return this;
    }

    /**
     * 请求时间
     * @return requestedAt
     */
    public String getRequestedAt() {
        return requestedAt;
    }

    public void setRequestedAt(String requestedAt) {
        this.requestedAt = requestedAt;
    }

    public GroupMyRoleDto withExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * 过期时间
     * @return expiresAt
     */
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public GroupMyRoleDto withLimited(Boolean limited) {
        this.limited = limited;
        return this;
    }

    /**
     * 限制
     * @return limited
     */
    public Boolean getLimited() {
        return limited;
    }

    public void setLimited(Boolean limited) {
        this.limited = limited;
    }

    public GroupMyRoleDto withIsProjectAdmin(Integer isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
        return this;
    }

    /**
     * 是否为项目管理员
     * @return isProjectAdmin
     */
    public Integer getIsProjectAdmin() {
        return isProjectAdmin;
    }

    public void setIsProjectAdmin(Integer isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
    }

    public GroupMyRoleDto withIsGroupCreator(Integer isGroupCreator) {
        this.isGroupCreator = isGroupCreator;
        return this;
    }

    /**
     * 是否为组织创建者
     * @return isGroupCreator
     */
    public Integer getIsGroupCreator() {
        return isGroupCreator;
    }

    public void setIsGroupCreator(Integer isGroupCreator) {
        this.isGroupCreator = isGroupCreator;
    }

    public GroupMyRoleDto withIsRepoCreator(Integer isRepoCreator) {
        this.isRepoCreator = isRepoCreator;
        return this;
    }

    /**
     * 是否仓库创建者
     * @return isRepoCreator
     */
    public Integer getIsRepoCreator() {
        return isRepoCreator;
    }

    public void setIsRepoCreator(Integer isRepoCreator) {
        this.isRepoCreator = isRepoCreator;
    }

    public GroupMyRoleDto withRoleShowFlag(Integer roleShowFlag) {
        this.roleShowFlag = roleShowFlag;
        return this;
    }

    /**
     * 展示标记
     * @return roleShowFlag
     */
    public Integer getRoleShowFlag() {
        return roleShowFlag;
    }

    public void setRoleShowFlag(Integer roleShowFlag) {
        this.roleShowFlag = roleShowFlag;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupMyRoleDto that = (GroupMyRoleDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.accessLevel, that.accessLevel)
            && Objects.equals(this.roleNamecn, that.roleNamecn) && Objects.equals(this.roleNamen, that.roleNamen)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.notificationLevel, that.notificationLevel)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.createdById, that.createdById) && Objects.equals(this.inviteEmail, that.inviteEmail)
            && Objects.equals(this.inviteToken, that.inviteToken)
            && Objects.equals(this.inviteAcceptedAt, that.inviteAcceptedAt)
            && Objects.equals(this.requestedAt, that.requestedAt) && Objects.equals(this.expiresAt, that.expiresAt)
            && Objects.equals(this.limited, that.limited) && Objects.equals(this.isProjectAdmin, that.isProjectAdmin)
            && Objects.equals(this.isGroupCreator, that.isGroupCreator)
            && Objects.equals(this.isRepoCreator, that.isRepoCreator)
            && Objects.equals(this.roleShowFlag, that.roleShowFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            accessLevel,
            roleNamecn,
            roleNamen,
            sourceId,
            sourceType,
            userId,
            notificationLevel,
            createdAt,
            updatedAt,
            createdById,
            inviteEmail,
            inviteToken,
            inviteAcceptedAt,
            requestedAt,
            expiresAt,
            limited,
            isProjectAdmin,
            isGroupCreator,
            isRepoCreator,
            roleShowFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupMyRoleDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accessLevel: ").append(toIndentedString(accessLevel)).append("\n");
        sb.append("    roleNamecn: ").append(toIndentedString(roleNamecn)).append("\n");
        sb.append("    roleNamen: ").append(toIndentedString(roleNamen)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    notificationLevel: ").append(toIndentedString(notificationLevel)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    createdById: ").append(toIndentedString(createdById)).append("\n");
        sb.append("    inviteEmail: ").append(toIndentedString(inviteEmail)).append("\n");
        sb.append("    inviteToken: ").append(toIndentedString(inviteToken)).append("\n");
        sb.append("    inviteAcceptedAt: ").append(toIndentedString(inviteAcceptedAt)).append("\n");
        sb.append("    requestedAt: ").append(toIndentedString(requestedAt)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    limited: ").append(toIndentedString(limited)).append("\n");
        sb.append("    isProjectAdmin: ").append(toIndentedString(isProjectAdmin)).append("\n");
        sb.append("    isGroupCreator: ").append(toIndentedString(isGroupCreator)).append("\n");
        sb.append("    isRepoCreator: ").append(toIndentedString(isRepoCreator)).append("\n");
        sb.append("    roleShowFlag: ").append(toIndentedString(roleShowFlag)).append("\n");
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
