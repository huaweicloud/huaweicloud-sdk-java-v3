package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 用户迁移信息体。
 */
public class UserMigrationInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_migrate_user")

    private Boolean isMigrateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_set_password")

    private Boolean isSetPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_list")

    private List<UserMigrationList> userList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_list")

    private List<UserMigrationRole> roleList = null;

    public UserMigrationInfo withIsMigrateUser(Boolean isMigrateUser) {
        this.isMigrateUser = isMigrateUser;
        return this;
    }

    /**
     * 是否迁移用户。
     * @return isMigrateUser
     */
    public Boolean getIsMigrateUser() {
        return isMigrateUser;
    }

    public void setIsMigrateUser(Boolean isMigrateUser) {
        this.isMigrateUser = isMigrateUser;
    }

    public UserMigrationInfo withIsSetPassword(Boolean isSetPassword) {
        this.isSetPassword = isSetPassword;
        return this;
    }

    /**
     * 是否统一重置密码。取值： - true：重置密码为统一密码。 - false：不统一重置密码。 当前支持的场景：  - 实时迁移场景：MySQL迁移。
     * @return isSetPassword
     */
    public Boolean getIsSetPassword() {
        return isSetPassword;
    }

    public void setIsSetPassword(Boolean isSetPassword) {
        this.isSetPassword = isSetPassword;
    }

    public UserMigrationInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 重置后的统一密码。统一重置密码为true时必填。 约束：密码不能为空。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserMigrationInfo withUserList(List<UserMigrationList> userList) {
        this.userList = userList;
        return this;
    }

    public UserMigrationInfo addUserListItem(UserMigrationList userListItem) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        this.userList.add(userListItem);
        return this;
    }

    public UserMigrationInfo withUserList(Consumer<List<UserMigrationList>> userListSetter) {
        if (this.userList == null) {
            this.userList = new ArrayList<>();
        }
        userListSetter.accept(this.userList);
        return this;
    }

    /**
     * Get userList
     * @return userList
     */
    public List<UserMigrationList> getUserList() {
        return userList;
    }

    public void setUserList(List<UserMigrationList> userList) {
        this.userList = userList;
    }

    public UserMigrationInfo withRoleList(List<UserMigrationRole> roleList) {
        this.roleList = roleList;
        return this;
    }

    public UserMigrationInfo addRoleListItem(UserMigrationRole roleListItem) {
        if (this.roleList == null) {
            this.roleList = new ArrayList<>();
        }
        this.roleList.add(roleListItem);
        return this;
    }

    public UserMigrationInfo withRoleList(Consumer<List<UserMigrationRole>> roleListSetter) {
        if (this.roleList == null) {
            this.roleList = new ArrayList<>();
        }
        roleListSetter.accept(this.roleList);
        return this;
    }

    /**
     * Get roleList
     * @return roleList
     */
    public List<UserMigrationRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<UserMigrationRole> roleList) {
        this.roleList = roleList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserMigrationInfo userMigrationInfo = (UserMigrationInfo) o;
        return Objects.equals(this.isMigrateUser, userMigrationInfo.isMigrateUser)
            && Objects.equals(this.isSetPassword, userMigrationInfo.isSetPassword)
            && Objects.equals(this.password, userMigrationInfo.password)
            && Objects.equals(this.userList, userMigrationInfo.userList)
            && Objects.equals(this.roleList, userMigrationInfo.roleList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isMigrateUser, isSetPassword, password, userList, roleList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserMigrationInfo {\n");
        sb.append("    isMigrateUser: ").append(toIndentedString(isMigrateUser)).append("\n");
        sb.append("    isSetPassword: ").append(toIndentedString(isSetPassword)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    userList: ").append(toIndentedString(userList)).append("\n");
        sb.append("    roleList: ").append(toIndentedString(roleList)).append("\n");
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
