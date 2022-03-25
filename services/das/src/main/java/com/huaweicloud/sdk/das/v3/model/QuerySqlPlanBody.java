package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** QuerySqlPlanBody */
public class QuerySqlPlanBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user_id")

    private String dbUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    public QuerySqlPlanBody withDbUserId(String dbUserId) {
        this.dbUserId = dbUserId;
        return this;
    }

    /** 数据库用户ID
     * 
     * @return dbUserId */
    public String getDbUserId() {
        return dbUserId;
    }

    public void setDbUserId(String dbUserId) {
        this.dbUserId = dbUserId;
    }

    public QuerySqlPlanBody withDatabase(String database) {
        this.database = database;
        return this;
    }

    /** 数据库名称
     * 
     * @return database */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public QuerySqlPlanBody withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /** SQL语句
     * 
     * @return sql */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySqlPlanBody querySqlPlanBody = (QuerySqlPlanBody) o;
        return Objects.equals(this.dbUserId, querySqlPlanBody.dbUserId)
            && Objects.equals(this.database, querySqlPlanBody.database)
            && Objects.equals(this.sql, querySqlPlanBody.sql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbUserId, database, sql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuerySqlPlanBody {\n");
        sb.append("    dbUserId: ").append(toIndentedString(dbUserId)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
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
