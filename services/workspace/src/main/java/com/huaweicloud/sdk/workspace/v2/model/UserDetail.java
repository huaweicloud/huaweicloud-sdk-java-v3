package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UserDetail
 */
public class UserDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_email")

    private String userEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "object_sid")

    private String objectSid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sam_account_name")

    private String samAccountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_principal_name")

    private String userPrincipalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name")

    private String fullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinguished_name")

    private String distinguishedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_type")

    private Integer accountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "when_created")

    private String whenCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_expires")

    private Long accountExpires;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_expired")

    private Boolean userExpired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled_change_password")

    private Boolean enabledChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_never_expired")

    private Boolean passwordNeverExpired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_login_change_password")

    private Boolean nextLoginChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_names")

    private List<String> groupNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_desktops")

    private Integer totalDesktops;

    public UserDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDetail withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserDetail withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * 用户邮箱。
     * @return userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public UserDetail withObjectSid(String objectSid) {
        this.objectSid = objectSid;
        return this;
    }

    /**
     * 用户sid。
     * @return objectSid
     */
    public String getObjectSid() {
        return objectSid;
    }

    public void setObjectSid(String objectSid) {
        this.objectSid = objectSid;
    }

    public UserDetail withSamAccountName(String samAccountName) {
        this.samAccountName = samAccountName;
        return this;
    }

    /**
     * 登录名(windows以前版本)。
     * @return samAccountName
     */
    public String getSamAccountName() {
        return samAccountName;
    }

    public void setSamAccountName(String samAccountName) {
        this.samAccountName = samAccountName;
    }

    public UserDetail withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * 用户登录名。
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return userPrincipalName;
    }

    public void setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
    }

    public UserDetail withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * 全名。
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserDetail withDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    /**
     * 用户在域树上的唯一位置。
     * @return distinguishedName
     */
    public String getDistinguishedName() {
        return distinguishedName;
    }

    public void setDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    public UserDetail withAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * 帐号类型(0：用户；1：用户组)。
     * minimum: 1
     * maximum: 55
     * @return accountType
     */
    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public UserDetail withWhenCreated(String whenCreated) {
        this.whenCreated = whenCreated;
        return this;
    }

    /**
     * UTC时间毫秒数对应的字符。
     * @return whenCreated
     */
    public String getWhenCreated() {
        return whenCreated;
    }

    public void setWhenCreated(String whenCreated) {
        this.whenCreated = whenCreated;
    }

    public UserDetail withAccountExpires(Long accountExpires) {
        this.accountExpires = accountExpires;
        return this;
    }

    /**
     * 账号有效期最后一天对应的UTC时间，以毫秒为单位。
     * minimum: 1
     * maximum: 55
     * @return accountExpires
     */
    public Long getAccountExpires() {
        return accountExpires;
    }

    public void setAccountExpires(Long accountExpires) {
        this.accountExpires = accountExpires;
    }

    public UserDetail withUserExpired(Boolean userExpired) {
        this.userExpired = userExpired;
        return this;
    }

    /**
     * 账户是否过期，true表示过期，false表示未过期。
     * @return userExpired
     */
    public Boolean getUserExpired() {
        return userExpired;
    }

    public void setUserExpired(Boolean userExpired) {
        this.userExpired = userExpired;
    }

    public UserDetail withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 账户是否被锁定，true表示被锁定，false表示未锁定。
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public UserDetail withEnabledChangePassword(Boolean enabledChangePassword) {
        this.enabledChangePassword = enabledChangePassword;
        return this;
    }

    /**
     * 是否允许修改密码，true表示允许修改密码，false表示不允许。
     * @return enabledChangePassword
     */
    public Boolean getEnabledChangePassword() {
        return enabledChangePassword;
    }

    public void setEnabledChangePassword(Boolean enabledChangePassword) {
        this.enabledChangePassword = enabledChangePassword;
    }

    public UserDetail withPasswordNeverExpired(Boolean passwordNeverExpired) {
        this.passwordNeverExpired = passwordNeverExpired;
        return this;
    }

    /**
     * 密码是否永不过期，true表示密码永不过期，false表示密码会过期。
     * @return passwordNeverExpired
     */
    public Boolean getPasswordNeverExpired() {
        return passwordNeverExpired;
    }

    public void setPasswordNeverExpired(Boolean passwordNeverExpired) {
        this.passwordNeverExpired = passwordNeverExpired;
    }

    public UserDetail withNextLoginChangePassword(Boolean nextLoginChangePassword) {
        this.nextLoginChangePassword = nextLoginChangePassword;
        return this;
    }

    /**
     * 下次登录是否需要重置密码，true表示需要重置密码，false表示不需要。
     * @return nextLoginChangePassword
     */
    public Boolean getNextLoginChangePassword() {
        return nextLoginChangePassword;
    }

    public void setNextLoginChangePassword(Boolean nextLoginChangePassword) {
        this.nextLoginChangePassword = nextLoginChangePassword;
    }

    public UserDetail withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 账户是否禁用，true表示被禁用，false表示未禁用。
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public UserDetail withGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }

    public UserDetail addGroupNamesItem(String groupNamesItem) {
        if (this.groupNames == null) {
            this.groupNames = new ArrayList<>();
        }
        this.groupNames.add(groupNamesItem);
        return this;
    }

    public UserDetail withGroupNames(Consumer<List<String>> groupNamesSetter) {
        if (this.groupNames == null) {
            this.groupNames = new ArrayList<>();
        }
        groupNamesSetter.accept(this.groupNames);
        return this;
    }

    /**
     * 加入的组列表。
     * @return groupNames
     */
    public List<String> getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
    }

    public UserDetail withTotalDesktops(Integer totalDesktops) {
        this.totalDesktops = totalDesktops;
        return this;
    }

    /**
     * 用户绑定桌面云总数。
     * minimum: 1
     * maximum: 55
     * @return totalDesktops
     */
    public Integer getTotalDesktops() {
        return totalDesktops;
    }

    public void setTotalDesktops(Integer totalDesktops) {
        this.totalDesktops = totalDesktops;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserDetail userDetail = (UserDetail) o;
        return Objects.equals(this.description, userDetail.description) && Objects.equals(this.id, userDetail.id)
            && Objects.equals(this.userName, userDetail.userName)
            && Objects.equals(this.userEmail, userDetail.userEmail)
            && Objects.equals(this.objectSid, userDetail.objectSid)
            && Objects.equals(this.samAccountName, userDetail.samAccountName)
            && Objects.equals(this.userPrincipalName, userDetail.userPrincipalName)
            && Objects.equals(this.fullName, userDetail.fullName)
            && Objects.equals(this.distinguishedName, userDetail.distinguishedName)
            && Objects.equals(this.accountType, userDetail.accountType)
            && Objects.equals(this.whenCreated, userDetail.whenCreated)
            && Objects.equals(this.accountExpires, userDetail.accountExpires)
            && Objects.equals(this.userExpired, userDetail.userExpired)
            && Objects.equals(this.locked, userDetail.locked)
            && Objects.equals(this.enabledChangePassword, userDetail.enabledChangePassword)
            && Objects.equals(this.passwordNeverExpired, userDetail.passwordNeverExpired)
            && Objects.equals(this.nextLoginChangePassword, userDetail.nextLoginChangePassword)
            && Objects.equals(this.disabled, userDetail.disabled)
            && Objects.equals(this.groupNames, userDetail.groupNames)
            && Objects.equals(this.totalDesktops, userDetail.totalDesktops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            id,
            userName,
            userEmail,
            objectSid,
            samAccountName,
            userPrincipalName,
            fullName,
            distinguishedName,
            accountType,
            whenCreated,
            accountExpires,
            userExpired,
            locked,
            enabledChangePassword,
            passwordNeverExpired,
            nextLoginChangePassword,
            disabled,
            groupNames,
            totalDesktops);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDetail {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    objectSid: ").append(toIndentedString(objectSid)).append("\n");
        sb.append("    samAccountName: ").append(toIndentedString(samAccountName)).append("\n");
        sb.append("    userPrincipalName: ").append(toIndentedString(userPrincipalName)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    whenCreated: ").append(toIndentedString(whenCreated)).append("\n");
        sb.append("    accountExpires: ").append(toIndentedString(accountExpires)).append("\n");
        sb.append("    userExpired: ").append(toIndentedString(userExpired)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    enabledChangePassword: ").append(toIndentedString(enabledChangePassword)).append("\n");
        sb.append("    passwordNeverExpired: ").append(toIndentedString(passwordNeverExpired)).append("\n");
        sb.append("    nextLoginChangePassword: ").append(toIndentedString(nextLoginChangePassword)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    groupNames: ").append(toIndentedString(groupNames)).append("\n");
        sb.append("    totalDesktops: ").append(toIndentedString(totalDesktops)).append("\n");
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
