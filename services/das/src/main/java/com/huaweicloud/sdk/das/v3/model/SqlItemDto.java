package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SQL项详情
 */
public class SqlItemDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_id")

    private String sqlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    private Long threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_cost")

    private Double executeCost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_at")

    private Double executeAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_affected")

    private Integer rowsAffected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    private Integer rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_wait_time")

    private Double lockWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_returned")

    private Integer rowsReturned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_id")

    private Long trxId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private Integer cpuTime;

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
    @JsonProperty(value = "error_no")

    private Integer errorNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_reads")

    private Long logicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "physical_reads")

    private Long physicalReads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "writes")

    private Long writes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    public SqlItemDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * SQL的ID值
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SqlItemDto withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 操作类型
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public SqlItemDto withSqlTemplateId(String sqlTemplateId) {
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

    public SqlItemDto withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SqlItemDto withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * SQL文本
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SqlItemDto withDatabase(String database) {
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

    public SqlItemDto withThreadId(Long threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 线程ID
     * @return threadId
     */
    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public SqlItemDto withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名称
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public SqlItemDto withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * 客户端IP
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public SqlItemDto withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 执行状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SqlItemDto withExecuteCost(Double executeCost) {
        this.executeCost = executeCost;
        return this;
    }

    /**
     * 执行耗时(ms)
     * @return executeCost
     */
    public Double getExecuteCost() {
        return executeCost;
    }

    public void setExecuteCost(Double executeCost) {
        this.executeCost = executeCost;
    }

    public SqlItemDto withExecuteAt(Double executeAt) {
        this.executeAt = executeAt;
        return this;
    }

    /**
     * 执行时间点(ms)
     * @return executeAt
     */
    public Double getExecuteAt() {
        return executeAt;
    }

    public void setExecuteAt(Double executeAt) {
        this.executeAt = executeAt;
    }

    public SqlItemDto withRowsAffected(Integer rowsAffected) {
        this.rowsAffected = rowsAffected;
        return this;
    }

    /**
     * 更新行数
     * @return rowsAffected
     */
    public Integer getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(Integer rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public SqlItemDto withRowsExamined(Integer rowsExamined) {
        this.rowsExamined = rowsExamined;
        return this;
    }

    /**
     * 扫描行数
     * @return rowsExamined
     */
    public Integer getRowsExamined() {
        return rowsExamined;
    }

    public void setRowsExamined(Integer rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    public SqlItemDto withLockWaitTime(Double lockWaitTime) {
        this.lockWaitTime = lockWaitTime;
        return this;
    }

    /**
     * 锁等待时间
     * @return lockWaitTime
     */
    public Double getLockWaitTime() {
        return lockWaitTime;
    }

    public void setLockWaitTime(Double lockWaitTime) {
        this.lockWaitTime = lockWaitTime;
    }

    public SqlItemDto withRowsReturned(Integer rowsReturned) {
        this.rowsReturned = rowsReturned;
        return this;
    }

    /**
     * 返回行数
     * @return rowsReturned
     */
    public Integer getRowsReturned() {
        return rowsReturned;
    }

    public void setRowsReturned(Integer rowsReturned) {
        this.rowsReturned = rowsReturned;
    }

    public SqlItemDto withTrxId(Long trxId) {
        this.trxId = trxId;
        return this;
    }

    /**
     * 事务ID
     * @return trxId
     */
    public Long getTrxId() {
        return trxId;
    }

    public void setTrxId(Long trxId) {
        this.trxId = trxId;
    }

    public SqlItemDto withCpuTime(Integer cpuTime) {
        this.cpuTime = cpuTime;
        return this;
    }

    /**
     * CPU耗时
     * @return cpuTime
     */
    public Integer getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Integer cpuTime) {
        this.cpuTime = cpuTime;
    }

    public SqlItemDto withSendBytes(Long sendBytes) {
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

    public SqlItemDto withQueryTables(String queryTables) {
        this.queryTables = queryTables;
        return this;
    }

    /**
     * 查询中所有的表名（格式：库名.表名|库名.表名）
     * @return queryTables
     */
    public String getQueryTables() {
        return queryTables;
    }

    public void setQueryTables(String queryTables) {
        this.queryTables = queryTables;
    }

    public SqlItemDto withInnodbIoReadBytes(Long innodbIoReadBytes) {
        this.innodbIoReadBytes = innodbIoReadBytes;
        return this;
    }

    /**
     * 物理IO读字节数
     * @return innodbIoReadBytes
     */
    public Long getInnodbIoReadBytes() {
        return innodbIoReadBytes;
    }

    public void setInnodbIoReadBytes(Long innodbIoReadBytes) {
        this.innodbIoReadBytes = innodbIoReadBytes;
    }

    public SqlItemDto withInnodbIoRead(Integer innodbIoRead) {
        this.innodbIoRead = innodbIoRead;
        return this;
    }

    /**
     * 物理IO读次数
     * @return innodbIoRead
     */
    public Integer getInnodbIoRead() {
        return innodbIoRead;
    }

    public void setInnodbIoRead(Integer innodbIoRead) {
        this.innodbIoRead = innodbIoRead;
    }

    public SqlItemDto withInnodbIoReadWait(Double innodbIoReadWait) {
        this.innodbIoReadWait = innodbIoReadWait;
        return this;
    }

    /**
     * 物理IO读取等待耗时（ms）
     * @return innodbIoReadWait
     */
    public Double getInnodbIoReadWait() {
        return innodbIoReadWait;
    }

    public void setInnodbIoReadWait(Double innodbIoReadWait) {
        this.innodbIoReadWait = innodbIoReadWait;
    }

    public SqlItemDto withInnodbLockWait(Double innodbLockWait) {
        this.innodbLockWait = innodbLockWait;
        return this;
    }

    /**
     * 行锁等待耗时（ms）
     * @return innodbLockWait
     */
    public Double getInnodbLockWait() {
        return innodbLockWait;
    }

    public void setInnodbLockWait(Double innodbLockWait) {
        this.innodbLockWait = innodbLockWait;
    }

    public SqlItemDto withInnodbQueueWait(Double innodbQueueWait) {
        this.innodbQueueWait = innodbQueueWait;
        return this;
    }

    /**
     * 进入innodb的等待耗时（ms）
     * @return innodbQueueWait
     */
    public Double getInnodbQueueWait() {
        return innodbQueueWait;
    }

    public void setInnodbQueueWait(Double innodbQueueWait) {
        this.innodbQueueWait = innodbQueueWait;
    }

    public SqlItemDto withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * 内核版本号
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public SqlItemDto withQueryTimeDetail(String queryTimeDetail) {
        this.queryTimeDetail = queryTimeDetail;
        return this;
    }

    /**
     * SQL执行各阶段细分耗时
     * @return queryTimeDetail
     */
    public String getQueryTimeDetail() {
        return queryTimeDetail;
    }

    public void setQueryTimeDetail(String queryTimeDetail) {
        this.queryTimeDetail = queryTimeDetail;
    }

    public SqlItemDto withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话ID
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public SqlItemDto withErrorNo(Integer errorNo) {
        this.errorNo = errorNo;
        return this;
    }

    /**
     * 错误码
     * @return errorNo
     */
    public Integer getErrorNo() {
        return errorNo;
    }

    public void setErrorNo(Integer errorNo) {
        this.errorNo = errorNo;
    }

    public SqlItemDto withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，实例节点的唯一标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SqlItemDto withLogicalReads(Long logicalReads) {
        this.logicalReads = logicalReads;
        return this;
    }

    /**
     * sqlserver IO逻辑读
     * @return logicalReads
     */
    public Long getLogicalReads() {
        return logicalReads;
    }

    public void setLogicalReads(Long logicalReads) {
        this.logicalReads = logicalReads;
    }

    public SqlItemDto withPhysicalReads(Long physicalReads) {
        this.physicalReads = physicalReads;
        return this;
    }

    /**
     * sqlserver IO物理读
     * @return physicalReads
     */
    public Long getPhysicalReads() {
        return physicalReads;
    }

    public void setPhysicalReads(Long physicalReads) {
        this.physicalReads = physicalReads;
    }

    public SqlItemDto withWrites(Long writes) {
        this.writes = writes;
        return this;
    }

    /**
     * sqlserver IO写
     * @return writes
     */
    public Long getWrites() {
        return writes;
    }

    public void setWrites(Long writes) {
        this.writes = writes;
    }

    public SqlItemDto withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * sqlserver 应用名
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlItemDto that = (SqlItemDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.operateType, that.operateType)
            && Objects.equals(this.sqlTemplateId, that.sqlTemplateId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.sql, that.sql)
            && Objects.equals(this.database, that.database) && Objects.equals(this.threadId, that.threadId)
            && Objects.equals(this.username, that.username) && Objects.equals(this.clientIp, that.clientIp)
            && Objects.equals(this.status, that.status) && Objects.equals(this.executeCost, that.executeCost)
            && Objects.equals(this.executeAt, that.executeAt) && Objects.equals(this.rowsAffected, that.rowsAffected)
            && Objects.equals(this.rowsExamined, that.rowsExamined)
            && Objects.equals(this.lockWaitTime, that.lockWaitTime)
            && Objects.equals(this.rowsReturned, that.rowsReturned) && Objects.equals(this.trxId, that.trxId)
            && Objects.equals(this.cpuTime, that.cpuTime) && Objects.equals(this.sendBytes, that.sendBytes)
            && Objects.equals(this.queryTables, that.queryTables)
            && Objects.equals(this.innodbIoReadBytes, that.innodbIoReadBytes)
            && Objects.equals(this.innodbIoRead, that.innodbIoRead)
            && Objects.equals(this.innodbIoReadWait, that.innodbIoReadWait)
            && Objects.equals(this.innodbLockWait, that.innodbLockWait)
            && Objects.equals(this.innodbQueueWait, that.innodbQueueWait)
            && Objects.equals(this.kernelVersion, that.kernelVersion)
            && Objects.equals(this.queryTimeDetail, that.queryTimeDetail)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.errorNo, that.errorNo)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.logicalReads, that.logicalReads)
            && Objects.equals(this.physicalReads, that.physicalReads) && Objects.equals(this.writes, that.writes)
            && Objects.equals(this.appName, that.appName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            operateType,
            sqlTemplateId,
            instanceId,
            sql,
            database,
            threadId,
            username,
            clientIp,
            status,
            executeCost,
            executeAt,
            rowsAffected,
            rowsExamined,
            lockWaitTime,
            rowsReturned,
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
            errorNo,
            nodeId,
            logicalReads,
            physicalReads,
            writes,
            appName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlItemDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    executeCost: ").append(toIndentedString(executeCost)).append("\n");
        sb.append("    executeAt: ").append(toIndentedString(executeAt)).append("\n");
        sb.append("    rowsAffected: ").append(toIndentedString(rowsAffected)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    lockWaitTime: ").append(toIndentedString(lockWaitTime)).append("\n");
        sb.append("    rowsReturned: ").append(toIndentedString(rowsReturned)).append("\n");
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
        sb.append("    errorNo: ").append(toIndentedString(errorNo)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    logicalReads: ").append(toIndentedString(logicalReads)).append("\n");
        sb.append("    physicalReads: ").append(toIndentedString(physicalReads)).append("\n");
        sb.append("    writes: ").append(toIndentedString(writes)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
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
