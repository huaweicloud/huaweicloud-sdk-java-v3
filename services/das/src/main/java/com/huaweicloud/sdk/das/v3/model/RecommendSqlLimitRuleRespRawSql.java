package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * mysql 提供原始sql的信息， taurus 只提供一条sql信息
 */
public class RecommendSqlLimitRuleRespRawSql {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private BigDecimal sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db")

    private String db;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private Long time;

    public RecommendSqlLimitRuleRespRawSql withSessionId(BigDecimal sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话id
     * @return sessionId
     */
    public BigDecimal getSessionId() {
        return sessionId;
    }

    public void setSessionId(BigDecimal sessionId) {
        this.sessionId = sessionId;
    }

    public RecommendSqlLimitRuleRespRawSql withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 主机ip
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public RecommendSqlLimitRuleRespRawSql withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * sql
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public RecommendSqlLimitRuleRespRawSql withDb(String db) {
        this.db = db;
        return this;
    }

    /**
     * 数据库名称
     * @return db
     */
    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public RecommendSqlLimitRuleRespRawSql withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 会话用户名
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public RecommendSqlLimitRuleRespRawSql withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * SQL类型
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public RecommendSqlLimitRuleRespRawSql withTime(Long time) {
        this.time = time;
        return this;
    }

    /**
     * 时间
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecommendSqlLimitRuleRespRawSql that = (RecommendSqlLimitRuleRespRawSql) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.host, that.host)
            && Objects.equals(this.sql, that.sql) && Objects.equals(this.db, that.db)
            && Objects.equals(this.user, that.user) && Objects.equals(this.sqlType, that.sqlType)
            && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, host, sql, db, user, sqlType, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecommendSqlLimitRuleRespRawSql {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    db: ").append(toIndentedString(db)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
