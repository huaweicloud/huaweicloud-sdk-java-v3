package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 添加仓库成员信息
 */
public class CreateRepositoryMemberDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_iam_id")

    private String userIamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_role_Id")

    private String repositoryRoleId;

    public CreateRepositoryMemberDto withUserIamId(String userIamId) {
        this.userIamId = userIamId;
        return this;
    }

    /**
     * **参数解释：** 用户iamId **约束限制：** 不涉及。
     * @return userIamId
     */
    public String getUserIamId() {
        return userIamId;
    }

    public void setUserIamId(String userIamId) {
        this.userIamId = userIamId;
    }

    public CreateRepositoryMemberDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释：** 用户名称。 **约束限制：** 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateRepositoryMemberDto withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * **参数解释：** 租户名称。 **约束限制：** - 不涉及。
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public CreateRepositoryMemberDto withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释：** 租户id。 **约束限制：** - 不涉及。    
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public CreateRepositoryMemberDto withRepositoryRoleId(String repositoryRoleId) {
        this.repositoryRoleId = repositoryRoleId;
        return this;
    }

    /**
     * **参数解释：** 角色id。 **约束限制：** - 不涉及。    
     * @return repositoryRoleId
     */
    public String getRepositoryRoleId() {
        return repositoryRoleId;
    }

    public void setRepositoryRoleId(String repositoryRoleId) {
        this.repositoryRoleId = repositoryRoleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRepositoryMemberDto that = (CreateRepositoryMemberDto) obj;
        return Objects.equals(this.userIamId, that.userIamId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.tenantName, that.tenantName) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.repositoryRoleId, that.repositoryRoleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userIamId, userName, tenantName, tenantId, repositoryRoleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRepositoryMemberDto {\n");
        sb.append("    userIamId: ").append(toIndentedString(userIamId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    repositoryRoleId: ").append(toIndentedString(repositoryRoleId)).append("\n");
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
