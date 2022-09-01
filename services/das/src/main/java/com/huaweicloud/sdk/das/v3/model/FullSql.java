package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * FullSql
 */
public class FullSql {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    @JacksonXmlProperty(localName = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    @JacksonXmlProperty(localName = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_no")

    @JacksonXmlProperty(localName = "error_no")

    private String errorNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    @JacksonXmlProperty(localName = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    @JacksonXmlProperty(localName = "client")

    private String client;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    @JacksonXmlProperty(localName = "thread_id")

    private String threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    @JacksonXmlProperty(localName = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_at")

    @JacksonXmlProperty(localName = "execute_at")

    private Long executeAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time")

    @JacksonXmlProperty(localName = "query_time")

    private Double queryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    @JacksonXmlProperty(localName = "lock_time")

    private Double lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    @JacksonXmlProperty(localName = "rows_examined")

    private Long rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_sent")

    @JacksonXmlProperty(localName = "rows_sent")

    private Long rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_affected")

    @JacksonXmlProperty(localName = "rows_affected")

    private Long rowsAffected;

    public FullSql withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * SQL语句。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public FullSql withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型。
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public FullSql withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FullSql withErrorNo(String errorNo) {
        this.errorNo = errorNo;
        return this;
    }

    /**
     * 错误码。
     * @return errorNo
     */
    public String getErrorNo() {
        return errorNo;
    }

    public void setErrorNo(String errorNo) {
        this.errorNo = errorNo;
    }

    public FullSql withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public FullSql withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * 客户端。
     * @return client
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public FullSql withThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 线程ID。
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public FullSql withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public FullSql withExecuteAt(Long executeAt) {
        this.executeAt = executeAt;
        return this;
    }

    /**
     * 执行开始时间（Unix timestamp），单位：毫秒。
     * @return executeAt
     */
    public Long getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Long executeAt) {
        this.executeAt = executeAt;
    }

    public FullSql withQueryTime(Double queryTime) {
        this.queryTime = queryTime;
        return this;
    }

    /**
     * 执行耗时（毫秒）。
     * @return queryTime
     */
    public Double getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Double queryTime) {
        this.queryTime = queryTime;
    }

    public FullSql withLockTime(Double lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 锁等待耗时（毫秒）。
     * @return lockTime
     */
    public Double getLockTime() {
        return lockTime;
    }

    public void setLockTime(Double lockTime) {
        this.lockTime = lockTime;
    }

    public FullSql withRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * 扫描行数。
     * @return rowsExamined
     */
    public Long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public FullSql withRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
        return this;
    }

    /**
     * 返回行数。
     * @return rowsSent
     */
    public Long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    public FullSql withRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
        return this;
    }

    /**
     * 更新行数。
     * @return rowsAffected
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FullSql fullSql = (FullSql) o;
        return Objects.equals(this.sql, fullSql.sql) && Objects.equals(this.operateType, fullSql.operateType)
            && Objects.equals(this.status, fullSql.status) && Objects.equals(this.errorNo, fullSql.errorNo)
            && Objects.equals(this.database, fullSql.database) && Objects.equals(this.client, fullSql.client)
            && Objects.equals(this.threadId, fullSql.threadId) && Objects.equals(this.user, fullSql.user)
            && Objects.equals(this.executeAt, fullSql.executeAt) && Objects.equals(this.queryTime, fullSql.queryTime)
            && Objects.equals(this.lockTime, fullSql.lockTime)
            && Objects.equals(this.rowsExamined, fullSql.rowsExamined)
            && Objects.equals(this.rowsSent, fullSql.rowsSent)
            && Objects.equals(this.rowsAffected, fullSql.rowsAffected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql,
            operateType,
            status,
            errorNo,
            database,
            client,
            threadId,
            user,
            executeAt,
            queryTime,
            lockTime,
            rowsExamined,
            rowsSent,
            rowsAffected);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullSql {\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorNo: ").append(toIndentedString(errorNo)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    executeAt: ").append(toIndentedString(executeAt)).append("\n");
        sb.append("    queryTime: ").append(toIndentedString(queryTime)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    rowsAffected: ").append(toIndentedString(rowsAffected)).append("\n");
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
