package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会话信息
 */
public class Session {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample_time")

    private String sampleTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blocked_process_id")

    private String blockedProcessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_oid")

    private Integer databaseOid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private Integer sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_leader_id")

    private Integer parallelLeaderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_user_oid")

    private Integer backendUserOid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip_address")

    private String clientIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_host_name")

    private String clientHostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    private Integer clientPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_start_time")

    private String sessionStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_start_time")

    private String transactionStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_execution_time")

    private Integer transactionExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_start_time")

    private String queryStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_change_time")

    private String stateChangeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_event_type")

    private String waitEventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_event_name")

    private String waitEventName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_status")

    private String sessionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_xid")

    private Integer backendXid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_xmin")

    private Integer backendXmin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private String queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_type")

    private String processType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_usage")

    private Float memoryUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_status")

    private String processStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage")

    private Float cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_wait_status")

    private Float ioWaitStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_read_rate")

    private Float diskReadRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_write_rate")

    private Float diskWriteRate;

    public Session withSampleTime(String sampleTime) {
        this.sampleTime = sampleTime;
        return this;
    }

    /**
     * 采样时间
     * @return sampleTime
     */
    public String getSampleTime() {
        return sampleTime;
    }

    public void setSampleTime(String sampleTime) {
        this.sampleTime = sampleTime;
    }

    public Session withBlockedProcessId(String blockedProcessId) {
        this.blockedProcessId = blockedProcessId;
        return this;
    }

    /**
     * 阻塞进程ID
     * @return blockedProcessId
     */
    public String getBlockedProcessId() {
        return blockedProcessId;
    }

    public void setBlockedProcessId(String blockedProcessId) {
        this.blockedProcessId = blockedProcessId;
    }

    public Session withDatabaseOid(Integer databaseOid) {
        this.databaseOid = databaseOid;
        return this;
    }

    /**
     * 数据库OID
     * @return databaseOid
     */
    public Integer getDatabaseOid() {
        return databaseOid;
    }

    public void setDatabaseOid(Integer databaseOid) {
        this.databaseOid = databaseOid;
    }

    public Session withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Session withSessionId(Integer sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * 会话ID
     * @return sessionId
     */
    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public Session withParallelLeaderId(Integer parallelLeaderId) {
        this.parallelLeaderId = parallelLeaderId;
        return this;
    }

    /**
     * 并行会话ID
     * @return parallelLeaderId
     */
    public Integer getParallelLeaderId() {
        return parallelLeaderId;
    }

    public void setParallelLeaderId(Integer parallelLeaderId) {
        this.parallelLeaderId = parallelLeaderId;
    }

    public Session withBackendUserOid(Integer backendUserOid) {
        this.backendUserOid = backendUserOid;
        return this;
    }

    /**
     * 后端用户OID
     * @return backendUserOid
     */
    public Integer getBackendUserOid() {
        return backendUserOid;
    }

    public void setBackendUserOid(Integer backendUserOid) {
        this.backendUserOid = backendUserOid;
    }

    public Session withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Session withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Session withClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
        return this;
    }

    /**
     * 客户端地址
     * @return clientIpAddress
     */
    public String getClientIpAddress() {
        return clientIpAddress;
    }

    public void setClientIpAddress(String clientIpAddress) {
        this.clientIpAddress = clientIpAddress;
    }

    public Session withClientHostName(String clientHostName) {
        this.clientHostName = clientHostName;
        return this;
    }

    /**
     * 客户端名称
     * @return clientHostName
     */
    public String getClientHostName() {
        return clientHostName;
    }

    public void setClientHostName(String clientHostName) {
        this.clientHostName = clientHostName;
    }

    public Session withClientPort(Integer clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * 客户端端口
     * @return clientPort
     */
    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public Session withSessionStartTime(String sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
        return this;
    }

    /**
     * 会话建立时间
     * @return sessionStartTime
     */
    public String getSessionStartTime() {
        return sessionStartTime;
    }

    public void setSessionStartTime(String sessionStartTime) {
        this.sessionStartTime = sessionStartTime;
    }

    public Session withTransactionStartTime(String transactionStartTime) {
        this.transactionStartTime = transactionStartTime;
        return this;
    }

    /**
     * 事务启动时间
     * @return transactionStartTime
     */
    public String getTransactionStartTime() {
        return transactionStartTime;
    }

    public void setTransactionStartTime(String transactionStartTime) {
        this.transactionStartTime = transactionStartTime;
    }

    public Session withTransactionExecutionTime(Integer transactionExecutionTime) {
        this.transactionExecutionTime = transactionExecutionTime;
        return this;
    }

    /**
     * 事务执行时间(s)
     * @return transactionExecutionTime
     */
    public Integer getTransactionExecutionTime() {
        return transactionExecutionTime;
    }

    public void setTransactionExecutionTime(Integer transactionExecutionTime) {
        this.transactionExecutionTime = transactionExecutionTime;
    }

    public Session withQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }

    /**
     * 查询开始时间
     * @return queryStartTime
     */
    public String getQueryStartTime() {
        return queryStartTime;
    }

    public void setQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
    }

    public Session withStateChangeTime(String stateChangeTime) {
        this.stateChangeTime = stateChangeTime;
        return this;
    }

    /**
     * state改变时间
     * @return stateChangeTime
     */
    public String getStateChangeTime() {
        return stateChangeTime;
    }

    public void setStateChangeTime(String stateChangeTime) {
        this.stateChangeTime = stateChangeTime;
    }

    public Session withWaitEventType(String waitEventType) {
        this.waitEventType = waitEventType;
        return this;
    }

    /**
     * 等待事件类型
     * @return waitEventType
     */
    public String getWaitEventType() {
        return waitEventType;
    }

    public void setWaitEventType(String waitEventType) {
        this.waitEventType = waitEventType;
    }

    public Session withWaitEventName(String waitEventName) {
        this.waitEventName = waitEventName;
        return this;
    }

    /**
     * 等待事件名称
     * @return waitEventName
     */
    public String getWaitEventName() {
        return waitEventName;
    }

    public void setWaitEventName(String waitEventName) {
        this.waitEventName = waitEventName;
    }

    public Session withSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
        return this;
    }

    /**
     * 会话状态
     * @return sessionStatus
     */
    public String getSessionStatus() {
        return sessionStatus;
    }

    public void setSessionStatus(String sessionStatus) {
        this.sessionStatus = sessionStatus;
    }

    public Session withBackendXid(Integer backendXid) {
        this.backendXid = backendXid;
        return this;
    }

    /**
     * Backend XID
     * @return backendXid
     */
    public Integer getBackendXid() {
        return backendXid;
    }

    public void setBackendXid(Integer backendXid) {
        this.backendXid = backendXid;
    }

    public Session withBackendXmin(Integer backendXmin) {
        this.backendXmin = backendXmin;
        return this;
    }

    /**
     * Backend Xmin
     * @return backendXmin
     */
    public Integer getBackendXmin() {
        return backendXmin;
    }

    public void setBackendXmin(Integer backendXmin) {
        this.backendXmin = backendXmin;
    }

    public Session withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * Query ID
     * @return queryId
     */
    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public Session withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * SQL语句
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public Session withProcessType(String processType) {
        this.processType = processType;
        return this;
    }

    /**
     * 进程类型
     * @return processType
     */
    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public Session withMemoryUsage(Float memoryUsage) {
        this.memoryUsage = memoryUsage;
        return this;
    }

    /**
     * 内存占比(%)
     * @return memoryUsage
     */
    public Float getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(Float memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public Session withProcessStatus(String processStatus) {
        this.processStatus = processStatus;
        return this;
    }

    /**
     * 进程状态
     * @return processStatus
     */
    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public Session withCpuUsage(Float cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * 3秒内平均CPU占用率(%)
     * @return cpuUsage
     */
    public Float getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Float cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public Session withIoWaitStatus(Float ioWaitStatus) {
        this.ioWaitStatus = ioWaitStatus;
        return this;
    }

    /**
     * I/O等待时间(s)
     * @return ioWaitStatus
     */
    public Float getIoWaitStatus() {
        return ioWaitStatus;
    }

    public void setIoWaitStatus(Float ioWaitStatus) {
        this.ioWaitStatus = ioWaitStatus;
    }

    public Session withDiskReadRate(Float diskReadRate) {
        this.diskReadRate = diskReadRate;
        return this;
    }

    /**
     * 磁盘读速率(MB/s)
     * @return diskReadRate
     */
    public Float getDiskReadRate() {
        return diskReadRate;
    }

    public void setDiskReadRate(Float diskReadRate) {
        this.diskReadRate = diskReadRate;
    }

    public Session withDiskWriteRate(Float diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
        return this;
    }

    /**
     * 磁盘写速率(MB/s)
     * @return diskWriteRate
     */
    public Float getDiskWriteRate() {
        return diskWriteRate;
    }

    public void setDiskWriteRate(Float diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Session that = (Session) obj;
        return Objects.equals(this.sampleTime, that.sampleTime)
            && Objects.equals(this.blockedProcessId, that.blockedProcessId)
            && Objects.equals(this.databaseOid, that.databaseOid)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.parallelLeaderId, that.parallelLeaderId)
            && Objects.equals(this.backendUserOid, that.backendUserOid) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.clientIpAddress, that.clientIpAddress)
            && Objects.equals(this.clientHostName, that.clientHostName)
            && Objects.equals(this.clientPort, that.clientPort)
            && Objects.equals(this.sessionStartTime, that.sessionStartTime)
            && Objects.equals(this.transactionStartTime, that.transactionStartTime)
            && Objects.equals(this.transactionExecutionTime, that.transactionExecutionTime)
            && Objects.equals(this.queryStartTime, that.queryStartTime)
            && Objects.equals(this.stateChangeTime, that.stateChangeTime)
            && Objects.equals(this.waitEventType, that.waitEventType)
            && Objects.equals(this.waitEventName, that.waitEventName)
            && Objects.equals(this.sessionStatus, that.sessionStatus)
            && Objects.equals(this.backendXid, that.backendXid) && Objects.equals(this.backendXmin, that.backendXmin)
            && Objects.equals(this.queryId, that.queryId) && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.processType, that.processType) && Objects.equals(this.memoryUsage, that.memoryUsage)
            && Objects.equals(this.processStatus, that.processStatus) && Objects.equals(this.cpuUsage, that.cpuUsage)
            && Objects.equals(this.ioWaitStatus, that.ioWaitStatus)
            && Objects.equals(this.diskReadRate, that.diskReadRate)
            && Objects.equals(this.diskWriteRate, that.diskWriteRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sampleTime,
            blockedProcessId,
            databaseOid,
            databaseName,
            sessionId,
            parallelLeaderId,
            backendUserOid,
            userName,
            appName,
            clientIpAddress,
            clientHostName,
            clientPort,
            sessionStartTime,
            transactionStartTime,
            transactionExecutionTime,
            queryStartTime,
            stateChangeTime,
            waitEventType,
            waitEventName,
            sessionStatus,
            backendXid,
            backendXmin,
            queryId,
            sqlStatement,
            processType,
            memoryUsage,
            processStatus,
            cpuUsage,
            ioWaitStatus,
            diskReadRate,
            diskWriteRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Session {\n");
        sb.append("    sampleTime: ").append(toIndentedString(sampleTime)).append("\n");
        sb.append("    blockedProcessId: ").append(toIndentedString(blockedProcessId)).append("\n");
        sb.append("    databaseOid: ").append(toIndentedString(databaseOid)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    parallelLeaderId: ").append(toIndentedString(parallelLeaderId)).append("\n");
        sb.append("    backendUserOid: ").append(toIndentedString(backendUserOid)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    clientIpAddress: ").append(toIndentedString(clientIpAddress)).append("\n");
        sb.append("    clientHostName: ").append(toIndentedString(clientHostName)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    sessionStartTime: ").append(toIndentedString(sessionStartTime)).append("\n");
        sb.append("    transactionStartTime: ").append(toIndentedString(transactionStartTime)).append("\n");
        sb.append("    transactionExecutionTime: ").append(toIndentedString(transactionExecutionTime)).append("\n");
        sb.append("    queryStartTime: ").append(toIndentedString(queryStartTime)).append("\n");
        sb.append("    stateChangeTime: ").append(toIndentedString(stateChangeTime)).append("\n");
        sb.append("    waitEventType: ").append(toIndentedString(waitEventType)).append("\n");
        sb.append("    waitEventName: ").append(toIndentedString(waitEventName)).append("\n");
        sb.append("    sessionStatus: ").append(toIndentedString(sessionStatus)).append("\n");
        sb.append("    backendXid: ").append(toIndentedString(backendXid)).append("\n");
        sb.append("    backendXmin: ").append(toIndentedString(backendXmin)).append("\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    processType: ").append(toIndentedString(processType)).append("\n");
        sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
        sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    ioWaitStatus: ").append(toIndentedString(ioWaitStatus)).append("\n");
        sb.append("    diskReadRate: ").append(toIndentedString(diskReadRate)).append("\n");
        sb.append("    diskWriteRate: ").append(toIndentedString(diskWriteRate)).append("\n");
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
