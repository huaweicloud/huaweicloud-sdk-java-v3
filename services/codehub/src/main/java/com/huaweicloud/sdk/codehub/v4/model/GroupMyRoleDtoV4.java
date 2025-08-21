package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * GroupMyRoleDtoV4
 */
public class GroupMyRoleDtoV4 {

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

    public GroupMyRoleDtoV4 withId(Integer id) {
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

    public GroupMyRoleDtoV4 withAccessLevel(Integer accessLevel) {
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

    public GroupMyRoleDtoV4 withRoleNamecn(String roleNamecn) {
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

    public GroupMyRoleDtoV4 withRoleNamen(String roleNamen) {
        this.roleNamen = roleNamen;
        return this;
    }

    /**
     * **参数解释：** 角色英文名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return roleNamen
     */
    public String getRoleNamen() {
        return roleNamen;
    }

    public void setRoleNamen(String roleNamen) {
        this.roleNamen = roleNamen;
    }

    public GroupMyRoleDtoV4 withSourceId(Integer sourceId) {
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

    public GroupMyRoleDtoV4 withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * **参数解释：** 资源类型。 **取值范围：Group Project** 字符串长度不少于1，不超过1000。
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public GroupMyRoleDtoV4 withUserId(Integer userId) {
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

    public GroupMyRoleDtoV4 withNotificationLevel(Integer notificationLevel) {
        this.notificationLevel = notificationLevel;
        return this;
    }

    /**
     * **参数解释：** 通知。
     * minimum: 1
     * maximum: 2147483647
     * @return notificationLevel
     */
    public Integer getNotificationLevel() {
        return notificationLevel;
    }

    public void setNotificationLevel(Integer notificationLevel) {
        this.notificationLevel = notificationLevel;
    }

    public GroupMyRoleDtoV4 withCreatedAt(String createdAt) {
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

    public GroupMyRoleDtoV4 withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GroupMyRoleDtoV4 withIsProjectAdmin(Integer isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
        return this;
    }

    /**
     * **参数解释：** 是否是项目创建者。
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

    public GroupMyRoleDtoV4 withIsGroupCreator(Integer isGroupCreator) {
        this.isGroupCreator = isGroupCreator;
        return this;
    }

    /**
     * **参数解释：** 是否是代码组创建者。
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

    public GroupMyRoleDtoV4 withIsRepoCreator(Integer isRepoCreator) {
        this.isRepoCreator = isRepoCreator;
        return this;
    }

    /**
     * **参数解释：** 是否是仓库创建者。
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

    public GroupMyRoleDtoV4 withRoleShowFlag(Integer roleShowFlag) {
        this.roleShowFlag = roleShowFlag;
        return this;
    }

    /**
     * **参数解释：** 角色展示。
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupMyRoleDtoV4 that = (GroupMyRoleDtoV4) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.accessLevel, that.accessLevel)
            && Objects.equals(this.roleNamecn, that.roleNamecn) && Objects.equals(this.roleNamen, that.roleNamen)
            && Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.notificationLevel, that.notificationLevel)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.isProjectAdmin, that.isProjectAdmin)
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
            isProjectAdmin,
            isGroupCreator,
            isRepoCreator,
            roleShowFlag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupMyRoleDtoV4 {\n");
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
