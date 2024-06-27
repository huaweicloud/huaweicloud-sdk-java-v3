package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 账户信息。
 */
public class ClickHouseDatabaseUserInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<String> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dml")

    private Integer dml;

    public ClickHouseDatabaseUserInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 数据库账户名。长度为2-32个字符，必须以小写字母开头，小写字母或数字结尾，可以包含小写字母、数字以及下划线，不能包含其它特殊字符。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ClickHouseDatabaseUserInfo withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 账户密码。 - 8-32个字符 - 至少包含以下字符中的三种：大写字母、小写字母、数字和特殊字符~！@#%^*-_=+? - 不能与用户名或倒序的用户名相同
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ClickHouseDatabaseUserInfo withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    public ClickHouseDatabaseUserInfo addDatabasesItem(String databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public ClickHouseDatabaseUserInfo withDatabases(Consumer<List<String>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库列表。“*”表示所有数据库。
     * @return databases
     */
    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    public ClickHouseDatabaseUserInfo withDml(Integer dml) {
        this.dml = dml;
        return this;
    }

    /**
     * DML权限，默认2。 取值范围： - 1：只读权限 - 2：读取和设置权限
     * @return dml
     */
    public Integer getDml() {
        return dml;
    }

    public void setDml(Integer dml) {
        this.dml = dml;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClickHouseDatabaseUserInfo that = (ClickHouseDatabaseUserInfo) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.password, that.password)
            && Objects.equals(this.databases, that.databases) && Objects.equals(this.dml, that.dml);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, password, databases, dml);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClickHouseDatabaseUserInfo {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    dml: ").append(toIndentedString(dml)).append("\n");
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
