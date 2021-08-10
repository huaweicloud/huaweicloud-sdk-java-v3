package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** RevokeRequestBody */
public class RevokeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<RevokeRequestBodyUsers> users = null;

    public RevokeRequestBody withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /** 数据库名称。
     * 
     * @return dbName */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public RevokeRequestBody withUsers(List<RevokeRequestBodyUsers> users) {
        this.users = users;
        return this;
    }

    public RevokeRequestBody addUsersItem(RevokeRequestBodyUsers usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public RevokeRequestBody withUsers(Consumer<List<RevokeRequestBodyUsers>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /** 解除授权的用户列表。
     * 
     * @return users */
    public List<RevokeRequestBodyUsers> getUsers() {
        return users;
    }

    public void setUsers(List<RevokeRequestBodyUsers> users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RevokeRequestBody revokeRequestBody = (RevokeRequestBody) o;
        return Objects.equals(this.dbName, revokeRequestBody.dbName)
            && Objects.equals(this.users, revokeRequestBody.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName, users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokeRequestBody {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
