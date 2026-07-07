package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowDeadLockAnalysisResultRespSqlList
 */
public class ShowDeadLockAnalysisResultRespSqlList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occurrence_time")

    private Long occurrenceTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time")

    private Long queryTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_id")

    private String sqlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_user")

    private String dbUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    private String client;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Long status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_no")

    private Long errorNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_affected")

    private Long rowsAffected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_sent")

    private Long rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private Long lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    private Long rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private Long cpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_bytes")

    private Long sendBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_tables")

    private String queryTables;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "innodb_io_read_bytes")

    private Long innodbIoReadBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "innodb_io_read")

    private Long innodbIoRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "innodb_io_read_wait")

    private Long innodbIoReadWait;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "innodb_lock_wait")

    private Long innodbLockWait;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "innodb_queue_wait")

    private Long innodbQueueWait;

    public ShowDeadLockAnalysisResultRespSqlList withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * SQL语句
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public ShowDeadLockAnalysisResultRespSqlList withOccurrenceTime(Long occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
        return this;
    }

    /**
     * 发生时间
     * @return occurrenceTime
     */
    public Long getOccurrenceTime() {
        return occurrenceTime;
    }

    public void setOccurrenceTime(Long occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }

    public ShowDeadLockAnalysisResultRespSqlList withQueryTime(Long queryTime) {
        this.queryTime = queryTime;
        return this;
    }

    /**
     * 执行耗时毫秒
     * @return queryTime
     */
    public Long getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(Long queryTime) {
        this.queryTime = queryTime;
    }

    public ShowDeadLockAnalysisResultRespSqlList withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * 事务ID
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ShowDeadLockAnalysisResultRespSqlList withSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
        return this;
    }

    /**
     * 模板ID
     * @return sqlTemplateId
     */
    public String getSqlTemplateId() {
        return sqlTemplateId;
    }

    public void setSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
    }

    public ShowDeadLockAnalysisResultRespSqlList withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ShowDeadLockAnalysisResultRespSqlList withDbUser(String dbUser) {
        this.dbUser = dbUser;
        return this;
    }

    /**
     * 用户名
     * @return dbUser
     */
    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public ShowDeadLockAnalysisResultRespSqlList withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ShowDeadLockAnalysisResultRespSqlList withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * 客户端IP
     * @return client
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public ShowDeadLockAnalysisResultRespSqlList withSqlType(String sqlType) {
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

    public ShowDeadLockAnalysisResultRespSqlList withStatus(Long status) {
        this.status = status;
        return this;
    }

    /**
     * 执行状态
     * @return status
     */
    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public ShowDeadLockAnalysisResultRespSqlList withErrorNo(Long errorNo) {
        this.errorNo = errorNo;
        return this;
    }

    /**
     * 错误码
     * @return errorNo
     */
    public Long getErrorNo() {
        return errorNo;
    }

    public void setErrorNo(Long errorNo) {
        this.errorNo = errorNo;
    }

    public ShowDeadLockAnalysisResultRespSqlList withRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
        return this;
    }

    /**
     * 更新行数
     * @return rowsAffected
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public ShowDeadLockAnalysisResultRespSqlList withRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
        return this;
    }

    /**
     * 返回行数
     * @return rowsSent
     */
    public Long getRowsSent() {
        return rowsSent;
    }

    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    public ShowDeadLockAnalysisResultRespSqlList withLockTime(Long lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * 锁等待时间毫秒
     * @return lockTime
     */
    public Long getLockTime() {
        return lockTime;
    }

    public void setLockTime(Long lockTime) {
        this.lockTime = lockTime;
    }

    public ShowDeadLockAnalysisResultRespSqlList withRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * 扫描行数
     * @return rowsExamined
     */
    public Long getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public ShowDeadLockAnalysisResultRespSqlList withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 线程ID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public ShowDeadLockAnalysisResultRespSqlList withCpuTime(Long cpuTime) {
        this.cpuTime = cpuTime;
        return this;
    }

    /**
     * CPU耗时(us)
     * @return cpuTime
     */
    public Long getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Long cpuTime) {
        this.cpuTime = cpuTime;
    }

    public ShowDeadLockAnalysisResultRespSqlList withSendBytes(Long sendBytes) {
        this.sendBytes = sendBytes;
        return this;
    }

    /**
     * 网络发送字节数
     * @return sendBytes
     */
    public Long getSendBytes() {
        return sendBytes;
    }

    public void setSendBytes(Long sendBytes) {
        this.sendBytes = sendBytes;
    }

    public ShowDeadLockAnalysisResultRespSqlList withQueryTables(String queryTables) {
        this.queryTables = queryTables;
        return this;
    }

    /**
     * 查询中所有的表名
     * @return queryTables
     */
    public String getQueryTables() {
        return queryTables;
    }

    public void setQueryTables(String queryTables) {
        this.queryTables = queryTables;
    }

    public ShowDeadLockAnalysisResultRespSqlList withInnodbIoReadBytes(Long innodbIoReadBytes) {
        this.innodbIoReadBytes = innodbIoReadBytes;
        return this;
    }

    /**
     * 物理I/O读字节数
     * @return innodbIoReadBytes
     */
    public Long getInnodbIoReadBytes() {
        return innodbIoReadBytes;
    }

    public void setInnodbIoReadBytes(Long innodbIoReadBytes) {
        this.innodbIoReadBytes = innodbIoReadBytes;
    }

    public ShowDeadLockAnalysisResultRespSqlList withInnodbIoRead(Long innodbIoRead) {
        this.innodbIoRead = innodbIoRead;
        return this;
    }

    /**
     * 物理I/O读次数
     * @return innodbIoRead
     */
    public Long getInnodbIoRead() {
        return innodbIoRead;
    }

    public void setInnodbIoRead(Long innodbIoRead) {
        this.innodbIoRead = innodbIoRead;
    }

    public ShowDeadLockAnalysisResultRespSqlList withInnodbIoReadWait(Long innodbIoReadWait) {
        this.innodbIoReadWait = innodbIoReadWait;
        return this;
    }

    /**
     * 物理I/O读取等待耗时(ms)
     * @return innodbIoReadWait
     */
    public Long getInnodbIoReadWait() {
        return innodbIoReadWait;
    }

    public void setInnodbIoReadWait(Long innodbIoReadWait) {
        this.innodbIoReadWait = innodbIoReadWait;
    }

    public ShowDeadLockAnalysisResultRespSqlList withInnodbLockWait(Long innodbLockWait) {
        this.innodbLockWait = innodbLockWait;
        return this;
    }

    /**
     * 物理I/O读取等待耗时(ms)
     * @return innodbLockWait
     */
    public Long getInnodbLockWait() {
        return innodbLockWait;
    }

    public void setInnodbLockWait(Long innodbLockWait) {
        this.innodbLockWait = innodbLockWait;
    }

    public ShowDeadLockAnalysisResultRespSqlList withInnodbQueueWait(Long innodbQueueWait) {
        this.innodbQueueWait = innodbQueueWait;
        return this;
    }

    /**
     * 行锁等待耗时(ms)
     * @return innodbQueueWait
     */
    public Long getInnodbQueueWait() {
        return innodbQueueWait;
    }

    public void setInnodbQueueWait(Long innodbQueueWait) {
        this.innodbQueueWait = innodbQueueWait;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockAnalysisResultRespSqlList that = (ShowDeadLockAnalysisResultRespSqlList) obj;
        return Objects.equals(this.sql, that.sql) && Objects.equals(this.occurrenceTime, that.occurrenceTime)
            && Objects.equals(this.queryTime, that.queryTime) && Objects.equals(this.transactionId, that.transactionId)
            && Objects.equals(this.sqlTemplateId, that.sqlTemplateId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.dbUser, that.dbUser) && Objects.equals(this.database, that.database)
            && Objects.equals(this.client, that.client) && Objects.equals(this.sqlType, that.sqlType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.errorNo, that.errorNo)
            && Objects.equals(this.rowsAffected, that.rowsAffected) && Objects.equals(this.rowsSent, that.rowsSent)
            && Objects.equals(this.lockTime, that.lockTime) && Objects.equals(this.rowsExamined, that.rowsExamined)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.cpuTime, that.cpuTime)
            && Objects.equals(this.sendBytes, that.sendBytes) && Objects.equals(this.queryTables, that.queryTables)
            && Objects.equals(this.innodbIoReadBytes, that.innodbIoReadBytes)
            && Objects.equals(this.innodbIoRead, that.innodbIoRead)
            && Objects.equals(this.innodbIoReadWait, that.innodbIoReadWait)
            && Objects.equals(this.innodbLockWait, that.innodbLockWait)
            && Objects.equals(this.innodbQueueWait, that.innodbQueueWait);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql,
            occurrenceTime,
            queryTime,
            transactionId,
            sqlTemplateId,
            nodeId,
            dbUser,
            database,
            client,
            sqlType,
            status,
            errorNo,
            rowsAffected,
            rowsSent,
            lockTime,
            rowsExamined,
            sessionId,
            cpuTime,
            sendBytes,
            queryTables,
            innodbIoReadBytes,
            innodbIoRead,
            innodbIoReadWait,
            innodbLockWait,
            innodbQueueWait);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockAnalysisResultRespSqlList {\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    occurrenceTime: ").append(toIndentedString(occurrenceTime)).append("\n");
        sb.append("    queryTime: ").append(toIndentedString(queryTime)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    dbUser: ").append(toIndentedString(dbUser)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorNo: ").append(toIndentedString(errorNo)).append("\n");
        sb.append("    rowsAffected: ").append(toIndentedString(rowsAffected)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    cpuTime: ").append(toIndentedString(cpuTime)).append("\n");
        sb.append("    sendBytes: ").append(toIndentedString(sendBytes)).append("\n");
        sb.append("    queryTables: ").append(toIndentedString(queryTables)).append("\n");
        sb.append("    innodbIoReadBytes: ").append(toIndentedString(innodbIoReadBytes)).append("\n");
        sb.append("    innodbIoRead: ").append(toIndentedString(innodbIoRead)).append("\n");
        sb.append("    innodbIoReadWait: ").append(toIndentedString(innodbIoReadWait)).append("\n");
        sb.append("    innodbLockWait: ").append(toIndentedString(innodbLockWait)).append("\n");
        sb.append("    innodbQueueWait: ").append(toIndentedString(innodbQueueWait)).append("\n");
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
