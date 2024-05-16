package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改数据库账号权限
 */
public class StarRocksDatabaseUserPSinfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<String> databases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dml")

    private Integer dml;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ddl")

    private Integer ddl;

    public StarRocksDatabaseUserPSinfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 数据库账号名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public StarRocksDatabaseUserPSinfo withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    public StarRocksDatabaseUserPSinfo addDatabasesItem(String databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public StarRocksDatabaseUserPSinfo withDatabases(Consumer<List<String>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 数据库列表。
     * @return databases
     */
    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    public StarRocksDatabaseUserPSinfo withDml(Integer dml) {
        this.dml = dml;
        return this;
    }

    /**
     * DML权限。 取值范围： - 0：读写权限 - 1：只读权限 - 2：只读和设置权限 - 3：读写和设置权限
     * @return dml
     */
    public Integer getDml() {
        return dml;
    }

    public void setDml(Integer dml) {
        this.dml = dml;
    }

    public StarRocksDatabaseUserPSinfo withDdl(Integer ddl) {
        this.ddl = ddl;
        return this;
    }

    /**
     * DDL权限。 取值范围： - 0：无DDL权限 - 1：有DDL权限
     * @return ddl
     */
    public Integer getDdl() {
        return ddl;
    }

    public void setDdl(Integer ddl) {
        this.ddl = ddl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StarRocksDatabaseUserPSinfo that = (StarRocksDatabaseUserPSinfo) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.databases, that.databases)
            && Objects.equals(this.dml, that.dml) && Objects.equals(this.ddl, that.ddl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, databases, dml, ddl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StarRocksDatabaseUserPSinfo {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
        sb.append("    dml: ").append(toIndentedString(dml)).append("\n");
        sb.append("    ddl: ").append(toIndentedString(ddl)).append("\n");
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
