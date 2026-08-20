package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户信息详情
 */
public class UserVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_num_id")

    private Integer userNumId;

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
    @JsonProperty(value = "role_id")

    private String roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_code")

    private String roleCode;

    public UserVO withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserVO withUserNumId(Integer userNumId) {
        this.userNumId = userNumId;
        return this;
    }

    /**
     * 用户短ID。
     * minimum: 0
     * maximum: 99999999
     * @return userNumId
     */
    public Integer getUserNumId() {
        return userNumId;
    }

    public void setUserNumId(Integer userNumId) {
        this.userNumId = userNumId;
    }

    public UserVO withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserVO withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 用户所属域ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public UserVO withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 租户名称。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public UserVO withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 用户昵称。
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public UserVO withRoleId(String roleId) {
        this.roleId = roleId;
        return this;
    }

    /**
     * 角色ID，用户在项目中具有多个角色时用英文逗号分隔。
     * @return roleId
     */
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public UserVO withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * 用户角色名称，多个角色用英文逗号分隔。
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public UserVO withRoleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }

    /**
     * 用户角色编码，多个角色用英文逗号分隔。
     * @return roleCode
     */
    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserVO that = (UserVO) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.userNumId, that.userNumId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.domainName, that.domainName) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.roleId, that.roleId) && Objects.equals(this.roleName, that.roleName)
            && Objects.equals(this.roleCode, that.roleCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userNumId, userName, domainId, domainName, nickName, roleId, roleName, roleCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserVO {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userNumId: ").append(toIndentedString(userNumId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
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
