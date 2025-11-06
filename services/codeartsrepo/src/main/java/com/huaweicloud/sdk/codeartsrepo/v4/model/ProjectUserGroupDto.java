package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ProjectUserGroupDto
 */
public class ProjectUserGroupDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group_id")

    private String userGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_type")

    private String groupType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_count")

    private Integer memberCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public ProjectUserGroupDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 用户组记录id。
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

    public ProjectUserGroupDto withUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }

    /**
     * **参数解释：** 用户组id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return userGroupId
     */
    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    public ProjectUserGroupDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 用户组名称。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectUserGroupDto withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 用户组所在项目id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ProjectUserGroupDto withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释：** 用户组所在租户id。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ProjectUserGroupDto withGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }

    /**
     * **参数解释：** 用户组类型。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return groupType
     */
    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public ProjectUserGroupDto withMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
        return this;
    }

    /**
     * **参数解释：** 用户组成员数量。
     * minimum: 0
     * maximum: 2147483647
     * @return memberCount
     */
    public Integer getMemberCount() {
        return memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public ProjectUserGroupDto withCreatedAt(String createdAt) {
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

    public ProjectUserGroupDto withUpdatedAt(String updatedAt) {
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

    public ProjectUserGroupDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 描述信息。 **取值范围：** 字符串长度不少于1，不超过1000。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectUserGroupDto that = (ProjectUserGroupDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userGroupId, that.userGroupId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.groupType, that.groupType)
            && Objects.equals(this.memberCount, that.memberCount) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            userGroupId,
            name,
            projectId,
            tenantId,
            groupType,
            memberCount,
            createdAt,
            updatedAt,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectUserGroupDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    groupType: ").append(toIndentedString(groupType)).append("\n");
        sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
