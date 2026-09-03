package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MDL锁等待信息
 */
public class MetaLockInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_id")

    private String lockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    private String threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private String lockStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_mode")

    private String lockMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_type")

    private String lockType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_duration")

    private String lockDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_schema")

    private String tableSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_number")

    private Integer blockNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_number")

    private Integer waitNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info")

    private String info;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_limit_rule")

    private String sqlLimitRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_exec_time")

    private String trxExecTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_process_info")

    private List<ProcessInfo> blockProcessInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_process_info")

    private List<ProcessInfo> waitProcessInfo = null;

    public MetaLockInfo withLockId(String lockId) {
        this.lockId = lockId;
        return this;
    }

    /**
     * MDL锁ID
     * @return lockId
     */
    public String getLockId() {
        return lockId;
    }

    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    public MetaLockInfo withThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 线程ID
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public MetaLockInfo withLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * MDL锁状态
     * @return lockStatus
     */
    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public MetaLockInfo withLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    /**
     * MDL锁等待模式
     * @return lockMode
     */
    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public MetaLockInfo withLockType(String lockType) {
        this.lockType = lockType;
        return this;
    }

    /**
     * MDL锁等待信息
     * @return lockType
     */
    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public MetaLockInfo withLockDuration(String lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * MDL锁等待持续时间
     * @return lockDuration
     */
    public String getLockDuration() {
        return lockDuration;
    }

    public void setLockDuration(String lockDuration) {
        this.lockDuration = lockDuration;
    }

    public MetaLockInfo withTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
        return this;
    }

    /**
     * 库表schema信息
     * @return tableSchema
     */
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public MetaLockInfo withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public MetaLockInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名称
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public MetaLockInfo withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * MDL锁等待时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MetaLockInfo withBlockNumber(Integer blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }

    /**
     * MDL锁等待阻塞数量
     * @return blockNumber
     */
    public Integer getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(Integer blockNumber) {
        this.blockNumber = blockNumber;
    }

    public MetaLockInfo withWaitNumber(Integer waitNumber) {
        this.waitNumber = waitNumber;
        return this;
    }

    /**
     * MDL锁等待数量
     * @return waitNumber
     */
    public Integer getWaitNumber() {
        return waitNumber;
    }

    public void setWaitNumber(Integer waitNumber) {
        this.waitNumber = waitNumber;
    }

    public MetaLockInfo withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 主机
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public MetaLockInfo withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名称
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public MetaLockInfo withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * MDL锁等待SQL语句
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public MetaLockInfo withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * MDL锁等待状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MetaLockInfo withInfo(String info) {
        this.info = info;
        return this;
    }

    /**
     * MDL锁等待额外信息
     * @return info
     */
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public MetaLockInfo withSqlLimitRule(String sqlLimitRule) {
        this.sqlLimitRule = sqlLimitRule;
        return this;
    }

    /**
     * 关联的SQL限流规则
     * @return sqlLimitRule
     */
    public String getSqlLimitRule() {
        return sqlLimitRule;
    }

    public void setSqlLimitRule(String sqlLimitRule) {
        this.sqlLimitRule = sqlLimitRule;
    }

    public MetaLockInfo withTrxExecTime(String trxExecTime) {
        this.trxExecTime = trxExecTime;
        return this;
    }

    /**
     * 事务执行时间
     * @return trxExecTime
     */
    public String getTrxExecTime() {
        return trxExecTime;
    }

    public void setTrxExecTime(String trxExecTime) {
        this.trxExecTime = trxExecTime;
    }

    public MetaLockInfo withBlockProcessInfo(List<ProcessInfo> blockProcessInfo) {
        this.blockProcessInfo = blockProcessInfo;
        return this;
    }

    public MetaLockInfo addBlockProcessInfoItem(ProcessInfo blockProcessInfoItem) {
        if (this.blockProcessInfo == null) {
            this.blockProcessInfo = new ArrayList<>();
        }
        this.blockProcessInfo.add(blockProcessInfoItem);
        return this;
    }

    public MetaLockInfo withBlockProcessInfo(Consumer<List<ProcessInfo>> blockProcessInfoSetter) {
        if (this.blockProcessInfo == null) {
            this.blockProcessInfo = new ArrayList<>();
        }
        blockProcessInfoSetter.accept(this.blockProcessInfo);
        return this;
    }

    /**
     * 阻塞的事务信息列表
     * @return blockProcessInfo
     */
    public List<ProcessInfo> getBlockProcessInfo() {
        return blockProcessInfo;
    }

    public void setBlockProcessInfo(List<ProcessInfo> blockProcessInfo) {
        this.blockProcessInfo = blockProcessInfo;
    }

    public MetaLockInfo withWaitProcessInfo(List<ProcessInfo> waitProcessInfo) {
        this.waitProcessInfo = waitProcessInfo;
        return this;
    }

    public MetaLockInfo addWaitProcessInfoItem(ProcessInfo waitProcessInfoItem) {
        if (this.waitProcessInfo == null) {
            this.waitProcessInfo = new ArrayList<>();
        }
        this.waitProcessInfo.add(waitProcessInfoItem);
        return this;
    }

    public MetaLockInfo withWaitProcessInfo(Consumer<List<ProcessInfo>> waitProcessInfoSetter) {
        if (this.waitProcessInfo == null) {
            this.waitProcessInfo = new ArrayList<>();
        }
        waitProcessInfoSetter.accept(this.waitProcessInfo);
        return this;
    }

    /**
     * 等待的事务信息列表
     * @return waitProcessInfo
     */
    public List<ProcessInfo> getWaitProcessInfo() {
        return waitProcessInfo;
    }

    public void setWaitProcessInfo(List<ProcessInfo> waitProcessInfo) {
        this.waitProcessInfo = waitProcessInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaLockInfo that = (MetaLockInfo) obj;
        return Objects.equals(this.lockId, that.lockId) && Objects.equals(this.threadId, that.threadId)
            && Objects.equals(this.lockStatus, that.lockStatus) && Objects.equals(this.lockMode, that.lockMode)
            && Objects.equals(this.lockType, that.lockType) && Objects.equals(this.lockDuration, that.lockDuration)
            && Objects.equals(this.tableSchema, that.tableSchema) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.user, that.user) && Objects.equals(this.time, that.time)
            && Objects.equals(this.blockNumber, that.blockNumber) && Objects.equals(this.waitNumber, that.waitNumber)
            && Objects.equals(this.host, that.host) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.command, that.command) && Objects.equals(this.state, that.state)
            && Objects.equals(this.info, that.info) && Objects.equals(this.sqlLimitRule, that.sqlLimitRule)
            && Objects.equals(this.trxExecTime, that.trxExecTime)
            && Objects.equals(this.blockProcessInfo, that.blockProcessInfo)
            && Objects.equals(this.waitProcessInfo, that.waitProcessInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockId,
            threadId,
            lockStatus,
            lockMode,
            lockType,
            lockDuration,
            tableSchema,
            tableName,
            user,
            time,
            blockNumber,
            waitNumber,
            host,
            dbName,
            command,
            state,
            info,
            sqlLimitRule,
            trxExecTime,
            blockProcessInfo,
            waitProcessInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaLockInfo {\n");
        sb.append("    lockId: ").append(toIndentedString(lockId)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    lockMode: ").append(toIndentedString(lockMode)).append("\n");
        sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
        sb.append("    lockDuration: ").append(toIndentedString(lockDuration)).append("\n");
        sb.append("    tableSchema: ").append(toIndentedString(tableSchema)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
        sb.append("    waitNumber: ").append(toIndentedString(waitNumber)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    sqlLimitRule: ").append(toIndentedString(sqlLimitRule)).append("\n");
        sb.append("    trxExecTime: ").append(toIndentedString(trxExecTime)).append("\n");
        sb.append("    blockProcessInfo: ").append(toIndentedString(blockProcessInfo)).append("\n");
        sb.append("    waitProcessInfo: ").append(toIndentedString(waitProcessInfo)).append("\n");
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
