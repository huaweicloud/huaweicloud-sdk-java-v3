package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改数据库账号权限请求体
 */
public class RedisModifyDbUserPrivilegeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privilege")

    private String privilege;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<String> databases = null;

    public RedisModifyDbUserPrivilegeRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 账号名称。  小于36个字符，以字母开头，仅包含数字、字母、中划线、下划线。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RedisModifyDbUserPrivilegeRequestBody withPrivilege(String privilege) {
        this.privilege = privilege;
        return this;
    }

    /**
     * 账号权限。  - 取值\"ReadOnly\"：账号为只读权限； - 取值\"ReadWrite\"：账号为读写权限。
     * @return privilege
     */
    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

    public RedisModifyDbUserPrivilegeRequestBody withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    public RedisModifyDbUserPrivilegeRequestBody addDatabasesItem(String databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public RedisModifyDbUserPrivilegeRequestBody withDatabases(Consumer<List<String>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 账号授权database列表。 不传值则对账号授权的db不做修改。
     * @return databases
     */
    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RedisModifyDbUserPrivilegeRequestBody redisModifyDbUserPrivilegeRequestBody =
            (RedisModifyDbUserPrivilegeRequestBody) o;
        return Objects.equals(this.name, redisModifyDbUserPrivilegeRequestBody.name)
            && Objects.equals(this.privilege, redisModifyDbUserPrivilegeRequestBody.privilege)
            && Objects.equals(this.databases, redisModifyDbUserPrivilegeRequestBody.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, privilege, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RedisModifyDbUserPrivilegeRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    privilege: ").append(toIndentedString(privilege)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
