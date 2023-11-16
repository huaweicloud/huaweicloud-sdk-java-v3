package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RevokePostgresqlDbPrivilegeRequestBody
 */
public class RevokePostgresqlDbPrivilegeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<RevokePostgresqlDbPrivilegeUser> users = null;

    public RevokePostgresqlDbPrivilegeRequestBody withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public RevokePostgresqlDbPrivilegeRequestBody withUsers(List<RevokePostgresqlDbPrivilegeUser> users) {
        this.users = users;
        return this;
    }

    public RevokePostgresqlDbPrivilegeRequestBody addUsersItem(RevokePostgresqlDbPrivilegeUser usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public RevokePostgresqlDbPrivilegeRequestBody withUsers(
        Consumer<List<RevokePostgresqlDbPrivilegeUser>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 用户信息，最大值50个
     * @return users
     */
    public List<RevokePostgresqlDbPrivilegeUser> getUsers() {
        return users;
    }

    public void setUsers(List<RevokePostgresqlDbPrivilegeUser> users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RevokePostgresqlDbPrivilegeRequestBody that = (RevokePostgresqlDbPrivilegeRequestBody) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokePostgresqlDbPrivilegeRequestBody {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
