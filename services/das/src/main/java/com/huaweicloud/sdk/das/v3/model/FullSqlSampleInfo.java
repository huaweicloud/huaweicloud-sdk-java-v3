package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FullSqlSampleInfo对象
 */
public class FullSqlSampleInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_id")

    private String sqlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    private String client;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_at")

    private Long executeAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time")

    private Double queryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private Double lockTime;

    public FullSqlSampleInfo withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * SQL
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public FullSqlSampleInfo withSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
        return this;
    }

    /**
     * SQL模板
     * @return sqlTemplateId
     */
    public String getSqlTemplateId() {
        return sqlTemplateId;
    }

    public void setSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
    }

    public FullSqlSampleInfo withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名称
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public FullSqlSampleInfo withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * 客户端地址
     * @return client
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public FullSqlSampleInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public FullSqlSampleInfo withExecuteAt(Long executeAt) {
        this.executeAt = executeAt;
        return this;
    }

    /**
     * 执行时间
     * @return executeAt
     */
    public Long getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Long executeAt) {
        this.executeAt = executeAt;
    }

    public FullSqlSampleInfo withQueryTime(Double queryTime) {
        this.queryTime = queryTime;
        return this;
    }

    /**
     * 执行耗时（ms）
     * @return queryTime
     */
    public Double getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Double queryTime) {
        this.queryTime = queryTime;
    }

    public FullSqlSampleInfo withLockTime(Double lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 锁等待时间（ms）
     * @return lockTime
     */
    public Double getLockTime() {
        return lockTime;
    }

    public void setLockTime(Double lockTime) {
        this.lockTime = lockTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullSqlSampleInfo that = (FullSqlSampleInfo) obj;
        return Objects.equals(this.sql, that.sql) && Objects.equals(this.sqlTemplateId, that.sqlTemplateId)
            && Objects.equals(this.database, that.database) && Objects.equals(this.client, that.client)
            && Objects.equals(this.user, that.user) && Objects.equals(this.executeAt, that.executeAt)
            && Objects.equals(this.queryTime, that.queryTime) && Objects.equals(this.lockTime, that.lockTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql, sqlTemplateId, database, client, user, executeAt, queryTime, lockTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullSqlSampleInfo {\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    executeAt: ").append(toIndentedString(executeAt)).append("\n");
        sb.append("    queryTime: ").append(toIndentedString(queryTime)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
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
