package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UsersDetailsResult
 */
public class UsersDetailsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_id")

    private String orgId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile")

    private String mobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_must_modify")

    private Boolean pwdMustModify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pwd_change_at")

    private String pwdChangeAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private String disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grade")

    private String grade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private String locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension")

    private String extension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_org_relation_list")

    private List<UserOrgRelationListResult> userOrgRelationList = null;

    public UsersDetailsResult withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UsersDetailsResult withOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    /**
     * 用户所属组织。
     * @return orgId
     */
    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public UsersDetailsResult withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UsersDetailsResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsersDetailsResult withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * 手机号。
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public UsersDetailsResult withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UsersDetailsResult withPwdMustModify(Boolean pwdMustModify) {
        this.pwdMustModify = pwdMustModify;
        return this;
    }

    /**
     * 首次登录是否强制修改密码。
     * @return pwdMustModify
     */
    public Boolean getPwdMustModify() {
        return pwdMustModify;
    }

    public void setPwdMustModify(Boolean pwdMustModify) {
        this.pwdMustModify = pwdMustModify;
    }

    public UsersDetailsResult withPwdChangeAt(String pwdChangeAt) {
        this.pwdChangeAt = pwdChangeAt;
        return this;
    }

    /**
     * 密码修改时间。
     * @return pwdChangeAt
     */
    public String getPwdChangeAt() {
        return pwdChangeAt;
    }

    public void setPwdChangeAt(String pwdChangeAt) {
        this.pwdChangeAt = pwdChangeAt;
    }

    public UsersDetailsResult withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public UsersDetailsResult withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 最后一次修改时间。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UsersDetailsResult withDisabled(String disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 是否禁用。
     * @return disabled
     */
    public String getDisabled() {
        return disabled;
    }

    public void setDisabled(String disabled) {
        this.disabled = disabled;
    }

    public UsersDetailsResult withGrade(String grade) {
        this.grade = grade;
        return this;
    }

    /**
     * 可信等级。
     * @return grade
     */
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public UsersDetailsResult withLocked(String locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 是否锁定。
     * @return locked
     */
    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    public UsersDetailsResult withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * 自定义扩展属性。
     * @return extension
     */
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public UsersDetailsResult withUserOrgRelationList(List<UserOrgRelationListResult> userOrgRelationList) {
        this.userOrgRelationList = userOrgRelationList;
        return this;
    }

    public UsersDetailsResult addUserOrgRelationListItem(UserOrgRelationListResult userOrgRelationListItem) {
        if (this.userOrgRelationList == null) {
            this.userOrgRelationList = new ArrayList<>();
        }
        this.userOrgRelationList.add(userOrgRelationListItem);
        return this;
    }

    public UsersDetailsResult withUserOrgRelationList(
        Consumer<List<UserOrgRelationListResult>> userOrgRelationListSetter) {
        if (this.userOrgRelationList == null) {
            this.userOrgRelationList = new ArrayList<>();
        }
        userOrgRelationListSetter.accept(this.userOrgRelationList);
        return this;
    }

    /**
     * 用户组织关系集合。
     * @return userOrgRelationList
     */
    public List<UserOrgRelationListResult> getUserOrgRelationList() {
        return userOrgRelationList;
    }

    public void setUserOrgRelationList(List<UserOrgRelationListResult> userOrgRelationList) {
        this.userOrgRelationList = userOrgRelationList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UsersDetailsResult that = (UsersDetailsResult) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.orgId, that.orgId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.name, that.name)
            && Objects.equals(this.mobile, that.mobile) && Objects.equals(this.email, that.email)
            && Objects.equals(this.pwdMustModify, that.pwdMustModify)
            && Objects.equals(this.pwdChangeAt, that.pwdChangeAt) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.grade, that.grade) && Objects.equals(this.locked, that.locked)
            && Objects.equals(this.extension, that.extension)
            && Objects.equals(this.userOrgRelationList, that.userOrgRelationList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId,
            orgId,
            userName,
            name,
            mobile,
            email,
            pwdMustModify,
            pwdChangeAt,
            createdAt,
            updatedAt,
            disabled,
            grade,
            locked,
            extension,
            userOrgRelationList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersDetailsResult {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    pwdMustModify: ").append(toIndentedString(pwdMustModify)).append("\n");
        sb.append("    pwdChangeAt: ").append(toIndentedString(pwdChangeAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
        sb.append("    userOrgRelationList: ").append(toIndentedString(userOrgRelationList)).append("\n");
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
