package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户迁移信息用户列表字段。当前支持的场景：  - 实时迁移场景：MySQL迁移，MongoDB迁移。
 */
public class UserMigrationList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_set_password")

    private Boolean isSetPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public UserMigrationList withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserMigrationList withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 用户。
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public UserMigrationList withIsSetPassword(Boolean isSetPassword) {
        this.isSetPassword = isSetPassword;
        return this;
    }

    /**
     * 是否重置该用户密码。当前支持的场景： - 实时迁移场景：MySQL迁移。
     * @return isSetPassword
     */
    public Boolean getIsSetPassword() {
        return isSetPassword;
    }

    public void setIsSetPassword(Boolean isSetPassword) {
        this.isSetPassword = isSetPassword;
    }

    public UserMigrationList withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 重置后的密码。统一重置密码或单个用户重置密码为true时必填，约束：密码不能为空。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserMigrationList that = (UserMigrationList) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.account, that.account)
            && Objects.equals(this.isSetPassword, that.isSetPassword) && Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, isSetPassword, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserMigrationList {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    isSetPassword: ").append(toIndentedString(isSetPassword)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
