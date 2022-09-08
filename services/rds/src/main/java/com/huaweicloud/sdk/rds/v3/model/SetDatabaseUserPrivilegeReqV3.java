package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SetDatabaseUserPrivilegeReqV3
 */
public class SetDatabaseUserPrivilegeReqV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_users")

    private Boolean allUsers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly")

    private Boolean readonly;

    public SetDatabaseUserPrivilegeReqV3 withAllUsers(Boolean allUsers) {
        this.allUsers = allUsers;
        return this;
    }

    /**
     * 是否设置所有用户。
     * @return allUsers
     */
    public Boolean getAllUsers() {
        return allUsers;
    }

    public void setAllUsers(Boolean allUsers) {
        this.allUsers = allUsers;
    }

    public SetDatabaseUserPrivilegeReqV3 withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 数据库用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SetDatabaseUserPrivilegeReqV3 withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    /**
     * 是否为只读权限。
     * @return readonly
     */
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetDatabaseUserPrivilegeReqV3 setDatabaseUserPrivilegeReqV3 = (SetDatabaseUserPrivilegeReqV3) o;
        return Objects.equals(this.allUsers, setDatabaseUserPrivilegeReqV3.allUsers)
            && Objects.equals(this.userName, setDatabaseUserPrivilegeReqV3.userName)
            && Objects.equals(this.readonly, setDatabaseUserPrivilegeReqV3.readonly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allUsers, userName, readonly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetDatabaseUserPrivilegeReqV3 {\n");
        sb.append("    allUsers: ").append(toIndentedString(allUsers)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
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
