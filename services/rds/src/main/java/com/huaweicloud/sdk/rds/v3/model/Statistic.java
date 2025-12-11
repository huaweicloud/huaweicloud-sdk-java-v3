package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Statistic
 */
public class Statistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calls")

    private Long calls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows")

    private Long rows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canUse")

    private Double canUse;

    public Statistic withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Statistic withDatabase(String database) {
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

    public Statistic withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * 由SQL的语法解析树计算出的内部哈希码。
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public Statistic withCalls(Long calls) {
        this.calls = calls;
        return this;
    }

    /**
     * 调用次数
     * @return calls
     */
    public Long getCalls() {
        return calls;
    }

    public void setCalls(Long calls) {
        this.calls = calls;
    }

    public Statistic withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * SQL语句的文本形式。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Statistic withRows(Long rows) {
        this.rows = rows;
        return this;
    }

    /**
     * 扫描行数
     * @return rows
     */
    public Long getRows() {
        return rows;
    }

    public void setRows(Long rows) {
        this.rows = rows;
    }

    public Statistic withCanUse(Double canUse) {
        this.canUse = canUse;
        return this;
    }

    /**
     * 是否可以执行sql限流
     * @return canUse
     */
    public Double getCanUse() {
        return canUse;
    }

    public void setCanUse(Double canUse) {
        this.canUse = canUse;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Statistic that = (Statistic) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.database, that.database)
            && Objects.equals(this.queryId, that.queryId) && Objects.equals(this.calls, that.calls)
            && Objects.equals(this.query, that.query) && Objects.equals(this.rows, that.rows)
            && Objects.equals(this.canUse, that.canUse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, database, queryId, calls, query, rows, canUse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Statistic {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
        sb.append("    canUse: ").append(toIndentedString(canUse)).append("\n");
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
