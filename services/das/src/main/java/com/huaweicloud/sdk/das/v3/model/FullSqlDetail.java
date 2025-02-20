package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * FullSqlDetail
 */
public class FullSqlDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_id")

    private String sqlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_no")

    private String errorNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    private String threadId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    private Long rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_sent")

    private Long rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_affected")

    private Long rowsAffected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_id")

    private Long trxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private Double cpuTime;

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

    private Integer innodbIoRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "innodb_io_read_wait")

    private Double innodbIoReadWait;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "innodb_lock_wait")

    private Double innodbLockWait;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "innodb_queue_wait")

    private Double innodbQueueWait;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_version")

    private String kernelVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_time_detail")

    private String queryTimeDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    public FullSqlDetail withSql(String sql) {
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

    public FullSqlDetail withSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
        return this;
    }

    /**
     * SQL模板ID。
     * @return sqlTemplateId
     */
    public String getSqlTemplateId() {
        return sqlTemplateId;
    }

    public void setSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
    }

    public FullSqlDetail withOperateType(String operateType) {
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

    public FullSqlDetail withStatus(String status) {
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

    public FullSqlDetail withErrorNo(String errorNo) {
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

    public FullSqlDetail withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public FullSqlDetail withThreadId(String threadId) {
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

    public FullSqlDetail withClient(String client) {
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

    public FullSqlDetail withUser(String user) {
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

    public FullSqlDetail withExecuteAt(Long executeAt) {
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

    public FullSqlDetail withQueryTime(Double queryTime) {
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

    public FullSqlDetail withLockTime(Double lockTime) {
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

    public FullSqlDetail withRowsExamined(Long rowsExamined) {
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

    public FullSqlDetail withRowsSent(Long rowsSent) {
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

    public FullSqlDetail withRowsAffected(Long rowsAffected) {
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

    public FullSqlDetail withTrxId(Long trxId) {
        this.trxId = trxId;
        return this;
    }

    /**
     * 事务ID。
     * @return trxId
     */
    public Long getTrxId() {
        return trxId;
    }

    public void setTrxId(Long trxId) {
        this.trxId = trxId;
    }

    public FullSqlDetail withCpuTime(Double cpuTime) {
        this.cpuTime = cpuTime;
        return this;
    }

    /**
     * CPU耗时（微秒）。
     * @return cpuTime
     */
    public Double getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Double cpuTime) {
        this.cpuTime = cpuTime;
    }

    public FullSqlDetail withSendBytes(Long sendBytes) {
        this.sendBytes = sendBytes;
        return this;
    }

    /**
     * 网络发送字节数。
     * @return sendBytes
     */
    public Long getSendBytes() {
        return sendBytes;
    }

    public void setSendBytes(Long sendBytes) {
        this.sendBytes = sendBytes;
    }

    public FullSqlDetail withQueryTables(String queryTables) {
        this.queryTables = queryTables;
        return this;
    }

    /**
     * 查询中所有的表名（格式：库名.表名|库名.表名）。
     * @return queryTables
     */
    public String getQueryTables() {
        return queryTables;
    }

    public void setQueryTables(String queryTables) {
        this.queryTables = queryTables;
    }

    public FullSqlDetail withInnodbIoReadBytes(Long innodbIoReadBytes) {
        this.innodbIoReadBytes = innodbIoReadBytes;
        return this;
    }

    /**
     * 物理I/O读字节数。
     * @return innodbIoReadBytes
     */
    public Long getInnodbIoReadBytes() {
        return innodbIoReadBytes;
    }

    public void setInnodbIoReadBytes(Long innodbIoReadBytes) {
        this.innodbIoReadBytes = innodbIoReadBytes;
    }

    public FullSqlDetail withInnodbIoRead(Integer innodbIoRead) {
        this.innodbIoRead = innodbIoRead;
        return this;
    }

    /**
     * 物理I/O读次数。
     * @return innodbIoRead
     */
    public Integer getInnodbIoRead() {
        return innodbIoRead;
    }

    public void setInnodbIoRead(Integer innodbIoRead) {
        this.innodbIoRead = innodbIoRead;
    }

    public FullSqlDetail withInnodbIoReadWait(Double innodbIoReadWait) {
        this.innodbIoReadWait = innodbIoReadWait;
        return this;
    }

    /**
     * 物理I/O读取等待耗时（毫秒）。
     * @return innodbIoReadWait
     */
    public Double getInnodbIoReadWait() {
        return innodbIoReadWait;
    }

    public void setInnodbIoReadWait(Double innodbIoReadWait) {
        this.innodbIoReadWait = innodbIoReadWait;
    }

    public FullSqlDetail withInnodbLockWait(Double innodbLockWait) {
        this.innodbLockWait = innodbLockWait;
        return this;
    }

    /**
     * 行锁等待耗时（毫秒）。
     * @return innodbLockWait
     */
    public Double getInnodbLockWait() {
        return innodbLockWait;
    }

    public void setInnodbLockWait(Double innodbLockWait) {
        this.innodbLockWait = innodbLockWait;
    }

    public FullSqlDetail withInnodbQueueWait(Double innodbQueueWait) {
        this.innodbQueueWait = innodbQueueWait;
        return this;
    }

    /**
     * 进入innodb的等待耗时（毫秒）。
     * @return innodbQueueWait
     */
    public Double getInnodbQueueWait() {
        return innodbQueueWait;
    }

    public void setInnodbQueueWait(Double innodbQueueWait) {
        this.innodbQueueWait = innodbQueueWait;
    }

    public FullSqlDetail withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * 内核版本号，DDM实例使用。
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public FullSqlDetail withQueryTimeDetail(String queryTimeDetail) {
        this.queryTimeDetail = queryTimeDetail;
        return this;
    }

    /**
     * SQL执行各阶段细分耗时，DDM实例使用。
     * @return queryTimeDetail
     */
    public String getQueryTimeDetail() {
        return queryTimeDetail;
    }

    public void setQueryTimeDetail(String queryTimeDetail) {
        this.queryTimeDetail = queryTimeDetail;
    }

    public FullSqlDetail withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话ID。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public FullSqlDetail withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullSqlDetail that = (FullSqlDetail) obj;
        return Objects.equals(this.sql, that.sql) && Objects.equals(this.sqlTemplateId, that.sqlTemplateId)
            && Objects.equals(this.operateType, that.operateType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errorNo, that.errorNo) && Objects.equals(this.database, that.database)
            && Objects.equals(this.threadId, that.threadId) && Objects.equals(this.client, that.client)
            && Objects.equals(this.user, that.user) && Objects.equals(this.executeAt, that.executeAt)
            && Objects.equals(this.queryTime, that.queryTime) && Objects.equals(this.lockTime, that.lockTime)
            && Objects.equals(this.rowsExamined, that.rowsExamined) && Objects.equals(this.rowsSent, that.rowsSent)
            && Objects.equals(this.rowsAffected, that.rowsAffected) && Objects.equals(this.trxId, that.trxId)
            && Objects.equals(this.cpuTime, that.cpuTime) && Objects.equals(this.sendBytes, that.sendBytes)
            && Objects.equals(this.queryTables, that.queryTables)
            && Objects.equals(this.innodbIoReadBytes, that.innodbIoReadBytes)
            && Objects.equals(this.innodbIoRead, that.innodbIoRead)
            && Objects.equals(this.innodbIoReadWait, that.innodbIoReadWait)
            && Objects.equals(this.innodbLockWait, that.innodbLockWait)
            && Objects.equals(this.innodbQueueWait, that.innodbQueueWait)
            && Objects.equals(this.kernelVersion, that.kernelVersion)
            && Objects.equals(this.queryTimeDetail, that.queryTimeDetail)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.nodeId, that.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sql,
            sqlTemplateId,
            operateType,
            status,
            errorNo,
            database,
            threadId,
            client,
            user,
            executeAt,
            queryTime,
            lockTime,
            rowsExamined,
            rowsSent,
            rowsAffected,
            trxId,
            cpuTime,
            sendBytes,
            queryTables,
            innodbIoReadBytes,
            innodbIoRead,
            innodbIoReadWait,
            innodbLockWait,
            innodbQueueWait,
            kernelVersion,
            queryTimeDetail,
            sessionId,
            nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullSqlDetail {\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorNo: ").append(toIndentedString(errorNo)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    executeAt: ").append(toIndentedString(executeAt)).append("\n");
        sb.append("    queryTime: ").append(toIndentedString(queryTime)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    rowsAffected: ").append(toIndentedString(rowsAffected)).append("\n");
        sb.append("    trxId: ").append(toIndentedString(trxId)).append("\n");
        sb.append("    cpuTime: ").append(toIndentedString(cpuTime)).append("\n");
        sb.append("    sendBytes: ").append(toIndentedString(sendBytes)).append("\n");
        sb.append("    queryTables: ").append(toIndentedString(queryTables)).append("\n");
        sb.append("    innodbIoReadBytes: ").append(toIndentedString(innodbIoReadBytes)).append("\n");
        sb.append("    innodbIoRead: ").append(toIndentedString(innodbIoRead)).append("\n");
        sb.append("    innodbIoReadWait: ").append(toIndentedString(innodbIoReadWait)).append("\n");
        sb.append("    innodbLockWait: ").append(toIndentedString(innodbLockWait)).append("\n");
        sb.append("    innodbQueueWait: ").append(toIndentedString(innodbQueueWait)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
        sb.append("    queryTimeDetail: ").append(toIndentedString(queryTimeDetail)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
