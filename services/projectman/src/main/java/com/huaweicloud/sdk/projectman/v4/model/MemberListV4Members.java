package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** MemberListV4Members */
public class MemberListV4Members {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_num_id")

    private Integer userNumId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_id")

    private Integer roleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nick_name")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_name")

    private String roleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private String userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forbidden")

    private Integer forbidden;

    public MemberListV4Members withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** 租户id
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public MemberListV4Members withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** 租户名
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public MemberListV4Members withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /** 用户id
     * 
     * @return userId */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public MemberListV4Members withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /** 用户名
     * 
     * @return userName */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MemberListV4Members withUserNumId(Integer userNumId) {
        this.userNumId = userNumId;
        return this;
    }

    /** 创建人numId
     * 
     * @return userNumId */
    public Integer getUserNumId() {
        return userNumId;
    }

    public void setUserNumId(Integer userNumId) {
        this.userNumId = userNumId;
    }

    public MemberListV4Members withRoleId(Integer roleId) {
        this.roleId = roleId;
        return this;
    }

    /** 成员角色, -1 项目创建者, 3 项目经理, 4 开发人员, 5 测试经理, 6 测试人员, 7 参与者, 8 浏览者, 9 运维经理
     * 
     * @return roleId */
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public MemberListV4Members withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /** 用户昵称
     * 
     * @return nickName */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public MemberListV4Members withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /** 用户角色
     * 
     * @return roleName */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public MemberListV4Members withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /** 用户类型, User iam用户, Federation 联邦账号,
     * 
     * @return userType */
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public MemberListV4Members withForbidden(Integer forbidden) {
        this.forbidden = forbidden;
        return this;
    }

    /** 是否是禁用账号，1 禁用账号， 0非禁用账号
     * 
     * @return forbidden */
    public Integer getForbidden() {
        return forbidden;
    }

    public void setForbidden(Integer forbidden) {
        this.forbidden = forbidden;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberListV4Members memberListV4Members = (MemberListV4Members) o;
        return Objects.equals(this.domainId, memberListV4Members.domainId)
            && Objects.equals(this.domainName, memberListV4Members.domainName)
            && Objects.equals(this.userId, memberListV4Members.userId)
            && Objects.equals(this.userName, memberListV4Members.userName)
            && Objects.equals(this.userNumId, memberListV4Members.userNumId)
            && Objects.equals(this.roleId, memberListV4Members.roleId)
            && Objects.equals(this.nickName, memberListV4Members.nickName)
            && Objects.equals(this.roleName, memberListV4Members.roleName)
            && Objects.equals(this.userType, memberListV4Members.userType)
            && Objects.equals(this.forbidden, memberListV4Members.forbidden);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(domainId, domainName, userId, userName, userNumId, roleId, nickName, roleName, userType, forbidden);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberListV4Members {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userNumId: ").append(toIndentedString(userNumId)).append("\n");
        sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    forbidden: ").append(toIndentedString(forbidden)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
