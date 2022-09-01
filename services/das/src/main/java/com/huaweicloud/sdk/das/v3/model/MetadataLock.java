package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 元数据锁
 */
public class MetadataLock {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    @JacksonXmlProperty(localName = "thread_id")

    private String threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    @JacksonXmlProperty(localName = "lock_status")

    private String lockStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_mode")

    @JacksonXmlProperty(localName = "lock_mode")

    private String lockMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_type")

    @JacksonXmlProperty(localName = "lock_type")

    private String lockType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_duration")

    @JacksonXmlProperty(localName = "lock_duration")

    private String lockDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_schema")

    @JacksonXmlProperty(localName = "table_schema")

    private String tableSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    @JacksonXmlProperty(localName = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    @JacksonXmlProperty(localName = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    @JacksonXmlProperty(localName = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    @JacksonXmlProperty(localName = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    @JacksonXmlProperty(localName = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    @JacksonXmlProperty(localName = "command")

    private String command;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    @JacksonXmlProperty(localName = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    @JacksonXmlProperty(localName = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trx_exec_time")

    @JacksonXmlProperty(localName = "trx_exec_time")

    private String trxExecTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "block_process")

    @JacksonXmlProperty(localName = "block_process")

    private List<Process> blockProcess = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_process")

    @JacksonXmlProperty(localName = "wait_process")

    private List<Process> waitProcess = null;

    public MetadataLock withThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 会话ID
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public MetadataLock withLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * 锁状态，取值为PENDING和GRANTED，分别表示等待锁和持有锁。
     * @return lockStatus
     */
    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public MetadataLock withLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    /**
     * 加锁模式，取值为MDL_SHARED 、MDL_EXCLUSIVE 、MDL_SHARED_READ、MDL_SHARED_WRITE等。
     * @return lockMode
     */
    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    public MetadataLock withLockType(String lockType) {
        this.lockType = lockType;
        return this;
    }

    /**
     * 锁类型，取值为Table metadata lock、Schema metadata lock、Tablespace lock、Global read lock，分别表示表元数据锁、库元数据锁、表空间锁、全局读锁。
     * @return lockType
     */
    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public MetadataLock withLockDuration(String lockDuration) {
        this.lockDuration = lockDuration;
        return this;
    }

    /**
     * 锁范围，取值为MDL_STATEMENT、MDL_TRANSACTION、MDL_EXPLICIT，分别表示语句级别、事务级别、global级别
     * @return lockDuration
     */
    public String getLockDuration() {
        return lockDuration;
    }

    public void setLockDuration(String lockDuration) {
        this.lockDuration = lockDuration;
    }

    public MetadataLock withTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
        return this;
    }

    /**
     * 锁所在的数据库，对于部分Global read lock级别的元数据锁，该值为空。
     * @return tableSchema
     */
    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    public MetadataLock withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public MetadataLock withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public MetadataLock withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public MetadataLock withHost(String host) {
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

    public MetadataLock withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 会话所在的数据库
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public MetadataLock withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 命令
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public MetadataLock withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public MetadataLock withSql(String sql) {
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

    public MetadataLock withTrxExecTime(String trxExecTime) {
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

    public MetadataLock withBlockProcess(List<Process> blockProcess) {
        this.blockProcess = blockProcess;
        return this;
    }

    public MetadataLock addBlockProcessItem(Process blockProcessItem) {
        if (this.blockProcess == null) {
            this.blockProcess = new ArrayList<>();
        }
        this.blockProcess.add(blockProcessItem);
        return this;
    }

    public MetadataLock withBlockProcess(Consumer<List<Process>> blockProcessSetter) {
        if (this.blockProcess == null) {
            this.blockProcess = new ArrayList<>();
        }
        blockProcessSetter.accept(this.blockProcess);
        return this;
    }

    /**
     * 阻塞会话列表
     * @return blockProcess
     */
    public List<Process> getBlockProcess() {
        return blockProcess;
    }

    public void setBlockProcess(List<Process> blockProcess) {
        this.blockProcess = blockProcess;
    }

    public MetadataLock withWaitProcess(List<Process> waitProcess) {
        this.waitProcess = waitProcess;
        return this;
    }

    public MetadataLock addWaitProcessItem(Process waitProcessItem) {
        if (this.waitProcess == null) {
            this.waitProcess = new ArrayList<>();
        }
        this.waitProcess.add(waitProcessItem);
        return this;
    }

    public MetadataLock withWaitProcess(Consumer<List<Process>> waitProcessSetter) {
        if (this.waitProcess == null) {
            this.waitProcess = new ArrayList<>();
        }
        waitProcessSetter.accept(this.waitProcess);
        return this;
    }

    /**
     * 等待会话列表
     * @return waitProcess
     */
    public List<Process> getWaitProcess() {
        return waitProcess;
    }

    public void setWaitProcess(List<Process> waitProcess) {
        this.waitProcess = waitProcess;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetadataLock metadataLock = (MetadataLock) o;
        return Objects.equals(this.threadId, metadataLock.threadId)
            && Objects.equals(this.lockStatus, metadataLock.lockStatus)
            && Objects.equals(this.lockMode, metadataLock.lockMode)
            && Objects.equals(this.lockType, metadataLock.lockType)
            && Objects.equals(this.lockDuration, metadataLock.lockDuration)
            && Objects.equals(this.tableSchema, metadataLock.tableSchema)
            && Objects.equals(this.tableName, metadataLock.tableName) && Objects.equals(this.user, metadataLock.user)
            && Objects.equals(this.time, metadataLock.time) && Objects.equals(this.host, metadataLock.host)
            && Objects.equals(this.database, metadataLock.database)
            && Objects.equals(this.command, metadataLock.command) && Objects.equals(this.state, metadataLock.state)
            && Objects.equals(this.sql, metadataLock.sql) && Objects.equals(this.trxExecTime, metadataLock.trxExecTime)
            && Objects.equals(this.blockProcess, metadataLock.blockProcess)
            && Objects.equals(this.waitProcess, metadataLock.waitProcess);
    }

    @Override
    public int hashCode() {
        return Objects.hash(threadId,
            lockStatus,
            lockMode,
            lockType,
            lockDuration,
            tableSchema,
            tableName,
            user,
            time,
            host,
            database,
            command,
            state,
            sql,
            trxExecTime,
            blockProcess,
            waitProcess);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetadataLock {\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    lockMode: ").append(toIndentedString(lockMode)).append("\n");
        sb.append("    lockType: ").append(toIndentedString(lockType)).append("\n");
        sb.append("    lockDuration: ").append(toIndentedString(lockDuration)).append("\n");
        sb.append("    tableSchema: ").append(toIndentedString(tableSchema)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    trxExecTime: ").append(toIndentedString(trxExecTime)).append("\n");
        sb.append("    blockProcess: ").append(toIndentedString(blockProcess)).append("\n");
        sb.append("    waitProcess: ").append(toIndentedString(waitProcess)).append("\n");
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
