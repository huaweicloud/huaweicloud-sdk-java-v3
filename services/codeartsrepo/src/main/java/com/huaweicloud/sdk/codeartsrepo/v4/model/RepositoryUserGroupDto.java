package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 仓库成员组详情
 */
public class RepositoryUserGroupDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group_name")

    private String userGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group_id")

    private String userGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_count")

    private String userCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public RepositoryUserGroupDto withUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
        return this;
    }

    /**
     * **参数解释：** 成员组名称 **约束限制：** 不涉及。
     * @return userGroupName
     */
    public String getUserGroupName() {
        return userGroupName;
    }

    public void setUserGroupName(String userGroupName) {
        this.userGroupName = userGroupName;
    }

    public RepositoryUserGroupDto withUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }

    /**
     * **参数解释：** 成员组id。 **约束限制：** 不涉及。
     * @return userGroupId
     */
    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }

    public RepositoryUserGroupDto withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目id。 **约束限制：** 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public RepositoryUserGroupDto withUserCount(String userCount) {
        this.userCount = userCount;
        return this;
    }

    /**
     * **参数解释：** 成员组用户数量。 **约束限制：** 不涉及。
     * @return userCount
     */
    public String getUserCount() {
        return userCount;
    }

    public void setUserCount(String userCount) {
        this.userCount = userCount;
    }

    public RepositoryUserGroupDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 成员组描述。 **约束限制：** 不涉及。
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
        RepositoryUserGroupDto that = (RepositoryUserGroupDto) obj;
        return Objects.equals(this.userGroupName, that.userGroupName)
            && Objects.equals(this.userGroupId, that.userGroupId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.userCount, that.userCount) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userGroupName, userGroupId, projectId, userCount, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryUserGroupDto {\n");
        sb.append("    userGroupName: ").append(toIndentedString(userGroupName)).append("\n");
        sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
