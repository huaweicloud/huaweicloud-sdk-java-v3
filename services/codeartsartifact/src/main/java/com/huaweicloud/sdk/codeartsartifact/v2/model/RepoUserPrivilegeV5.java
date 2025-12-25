package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepoUserPrivilegeV5
 */
public class RepoUserPrivilegeV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_id")

    private String repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privilege")

    private String privilege;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    public RepoUserPrivilegeV5 withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * **参数解释**: 用户id。 **取值范围**: 不涉及。 
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public RepoUserPrivilegeV5 withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**: 租户id。 **取值范围**: 不涉及。 
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public RepoUserPrivilegeV5 withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 用户名。 **取值范围**: 不涉及。 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public RepoUserPrivilegeV5 withRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * **参数解释**: 仓库id。 **取值范围**: 不涉及。 
     * @return repoId
     */
    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public RepoUserPrivilegeV5 withPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }

    /**
     * **参数解释**: 权限信息。 **取值范围**: 不涉及。 
     * @return privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public RepoUserPrivilegeV5 withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * **参数解释**: 角色id。 **取值范围**: 不涉及。 
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public RepoUserPrivilegeV5 withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * **参数解释**: 角色名称。 **取值范围**: 不涉及。 
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoUserPrivilegeV5 that = (RepoUserPrivilegeV5) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.repoId, that.repoId)
            && Objects.equals(this.privilege, that.privilege) && Objects.equals(this.roleId, that.roleId)
            && Objects.equals(this.roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, domainId, userName, repoId, privilege, roleId, roleName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoUserPrivilegeV5 {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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
