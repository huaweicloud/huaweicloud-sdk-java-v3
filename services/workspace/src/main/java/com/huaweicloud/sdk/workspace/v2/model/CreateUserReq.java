package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateUserReq
 */
public class CreateUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_email")

    private String userEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_expires")

    private String accountExpires;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_change_password")

    private Boolean enableChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_login_change_password")

    private Boolean nextLoginChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_ids")

    private List<String> groupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_name")

    private String aliasName;

    public CreateUserReq withUserName(String userName) {
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

    public CreateUserReq withUserEmail(String userEmail) {
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

    public CreateUserReq withAccountExpires(String accountExpires) {
        this.accountExpires = accountExpires;
        return this;
    }

    /**
     * 账户过期时间，0表示永远不过期。时间格式：yyyy-MM-ddTHH:mm:ssZ或yyyy-MM-ddTHH:mm:ss.SSSZ。
     * @return accountExpires
     */
    public String getAccountExpires() {
        return accountExpires;
    }

    public void setAccountExpires(String accountExpires) {
        this.accountExpires = accountExpires;
    }

    public CreateUserReq withEnableChangePassword(Boolean enableChangePassword) {
        this.enableChangePassword = enableChangePassword;
        return this;
    }

    /**
     * 是否允许用户更改密码，缺省值为true。
     * @return enableChangePassword
     */
    public Boolean getEnableChangePassword() {
        return enableChangePassword;
    }

    public void setEnableChangePassword(Boolean enableChangePassword) {
        this.enableChangePassword = enableChangePassword;
    }

    public CreateUserReq withNextLoginChangePassword(Boolean nextLoginChangePassword) {
        this.nextLoginChangePassword = nextLoginChangePassword;
        return this;
    }

    /**
     * 下次登录是否必须更改密码，缺省值为true。
     * @return nextLoginChangePassword
     */
    public Boolean getNextLoginChangePassword() {
        return nextLoginChangePassword;
    }

    public void setNextLoginChangePassword(Boolean nextLoginChangePassword) {
        this.nextLoginChangePassword = nextLoginChangePassword;
    }

    public CreateUserReq withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    public CreateUserReq addGroupIdsItem(String groupIdsItem) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        this.groupIds.add(groupIdsItem);
        return this;
    }

    public CreateUserReq withGroupIds(Consumer<List<String>> groupIdsSetter) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        groupIdsSetter.accept(this.groupIds);
        return this;
    }

    /**
     * 用户组的专有ID列表。
     * @return groupIds
     */
    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    public CreateUserReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户描述，字符串长度区间[0, 255]。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateUserReq withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * 别名。
     * @return aliasName
     */
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateUserReq createUserReq = (CreateUserReq) o;
        return Objects.equals(this.userName, createUserReq.userName)
            && Objects.equals(this.userEmail, createUserReq.userEmail)
            && Objects.equals(this.accountExpires, createUserReq.accountExpires)
            && Objects.equals(this.enableChangePassword, createUserReq.enableChangePassword)
            && Objects.equals(this.nextLoginChangePassword, createUserReq.nextLoginChangePassword)
            && Objects.equals(this.groupIds, createUserReq.groupIds)
            && Objects.equals(this.description, createUserReq.description)
            && Objects.equals(this.aliasName, createUserReq.aliasName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName,
            userEmail,
            accountExpires,
            enableChangePassword,
            nextLoginChangePassword,
            groupIds,
            description,
            aliasName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserReq {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    accountExpires: ").append(toIndentedString(accountExpires)).append("\n");
        sb.append("    enableChangePassword: ").append(toIndentedString(enableChangePassword)).append("\n");
        sb.append("    nextLoginChangePassword: ").append(toIndentedString(nextLoginChangePassword)).append("\n");
        sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
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
