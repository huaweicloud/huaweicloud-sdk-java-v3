package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 慢日志明细
 */
public class SlowLogDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occurrence_time")

    private Long occurrenceTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_template_id")

    private String sqlTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_sql")

    private String originalSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    private String client;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_time")

    private Double executeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_wait_time")

    private Double lockWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_examined")

    private Long rowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_sent")

    private Long rowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tunable")

    private Boolean tunable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_affected")

    private Long rowsAffected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private Double cpuTime;

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
    @JsonProperty(value = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection")

    private String collection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_examined")

    private Long keyExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "killed")

    private String killed;

    public SlowLogDetail withOccurrenceTime(Long occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
        return this;
    }

    /**
     * 执行时间(sqlserver、mongodb：结束时间；其他引擎：开始时间)（Unix timestamp），单位：毫秒
     * @return occurrenceTime
     */
    public Long getOccurrenceTime() {
        return occurrenceTime;
    }

    public void setOccurrenceTime(Long occurrenceTime) {
        this.occurrenceTime = occurrenceTime;
    }

    public SlowLogDetail withSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
        return this;
    }

    /**
     * SQL模板ID
     * @return sqlTemplateId
     */
    public String getSqlTemplateId() {
        return sqlTemplateId;
    }

    public void setSqlTemplateId(String sqlTemplateId) {
        this.sqlTemplateId = sqlTemplateId;
    }

    public SlowLogDetail withOriginalSql(String originalSql) {
        this.originalSql = originalSql;
        return this;
    }

    /**
     * 原始SQL语句
     * @return originalSql
     */
    public String getOriginalSql() {
        return originalSql;
    }

    public void setOriginalSql(String originalSql) {
        this.originalSql = originalSql;
    }

    public SlowLogDetail withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 数据库名
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public SlowLogDetail withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * 客户端
     * @return client
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public SlowLogDetail withUser(String user) {
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

    public SlowLogDetail withExecuteTime(Double executeTime) {
        this.executeTime = executeTime;
        return this;
    }

    /**
     * 执行耗时（秒）
     * @return executeTime
     */
    public Double getExecuteTime() {
        return executeTime;
    }

    public void setExecuteTime(Double executeTime) {
        this.executeTime = executeTime;
    }

    public SlowLogDetail withLockWaitTime(Double lockWaitTime) {
        this.lockWaitTime = lockWaitTime;
        return this;
    }

    /**
     * 锁等待耗时（秒）
     * @return lockWaitTime
     */
    public Double getLockWaitTime() {
        return lockWaitTime;
    }

    public void setLockWaitTime(Double lockWaitTime) {
        this.lockWaitTime = lockWaitTime;
    }

    public SlowLogDetail withRowsExamined(Long rowsExamined) {
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

    public SlowLogDetail withRowsSent(Long rowsSent) {
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

    public SlowLogDetail withTunable(Boolean tunable) {
        this.tunable = tunable;
        return this;
    }

    /**
     * 是否可诊断优化
     * @return tunable
     */
    public Boolean getTunable() {
        return tunable;
    }

    public void setTunable(Boolean tunable) {
        this.tunable = tunable;
    }

    public SlowLogDetail withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * sqlserver：执行完成时间（Unix timestamp），单位：毫秒
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public SlowLogDetail withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * sqlserver：应用名
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public SlowLogDetail withRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
        return this;
    }

    /**
     * sqlserver：影响行数
     * @return rowsAffected
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    public SlowLogDetail withCpuTime(Double cpuTime) {
        this.cpuTime = cpuTime;
        return this;
    }

    /**
     * sqlserver：CPU耗时（ms）
     * @return cpuTime
     */
    public Double getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Double cpuTime) {
        this.cpuTime = cpuTime;
    }

    public SlowLogDetail withLogicalReads(Long logicalReads) {
        this.logicalReads = logicalReads;
        return this;
    }

    /**
     * sqlserver：IO逻辑读
     * @return logicalReads
     */
    public Long getLogicalReads() {
        return logicalReads;
    }

    public void setLogicalReads(Long logicalReads) {
        this.logicalReads = logicalReads;
    }

    public SlowLogDetail withPhysicalReads(Long physicalReads) {
        this.physicalReads = physicalReads;
        return this;
    }

    /**
     * sqlserver：IO物理读
     * @return physicalReads
     */
    public Long getPhysicalReads() {
        return physicalReads;
    }

    public void setPhysicalReads(Long physicalReads) {
        this.physicalReads = physicalReads;
    }

    public SlowLogDetail withWrites(Long writes) {
        this.writes = writes;
        return this;
    }

    /**
     * sqlserver：IO写
     * @return writes
     */
    public Long getWrites() {
        return writes;
    }

    public void setWrites(Long writes) {
        this.writes = writes;
    }

    public SlowLogDetail withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * SQL操作类型
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public SlowLogDetail withCollection(String collection) {
        this.collection = collection;
        return this;
    }

    /**
     * mongodb：数据库表
     * @return collection
     */
    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public SlowLogDetail withKeyExamined(Long keyExamined) {
        this.keyExamined = keyExamined;
        return this;
    }

    /**
     * mongodb：扫描索引数
     * @return keyExamined
     */
    public Long getKeyExamined() {
        return keyExamined;
    }

    public void setKeyExamined(Long keyExamined) {
        this.keyExamined = keyExamined;
    }

    public SlowLogDetail withNodeId(String nodeId) {
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

    public SlowLogDetail withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public SlowLogDetail withKilled(String killed) {
        this.killed = killed;
        return this;
    }

    /**
     * 执行状态
     * @return killed
     */
    public String getKilled() {
        return killed;
    }

    public void setKilled(String killed) {
        this.killed = killed;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowLogDetail that = (SlowLogDetail) obj;
        return Objects.equals(this.occurrenceTime, that.occurrenceTime)
            && Objects.equals(this.sqlTemplateId, that.sqlTemplateId)
            && Objects.equals(this.originalSql, that.originalSql) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.client, that.client) && Objects.equals(this.user, that.user)
            && Objects.equals(this.executeTime, that.executeTime)
            && Objects.equals(this.lockWaitTime, that.lockWaitTime)
            && Objects.equals(this.rowsExamined, that.rowsExamined) && Objects.equals(this.rowsSent, that.rowsSent)
            && Objects.equals(this.tunable, that.tunable) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.rowsAffected, that.rowsAffected)
            && Objects.equals(this.cpuTime, that.cpuTime) && Objects.equals(this.logicalReads, that.logicalReads)
            && Objects.equals(this.physicalReads, that.physicalReads) && Objects.equals(this.writes, that.writes)
            && Objects.equals(this.sqlType, that.sqlType) && Objects.equals(this.collection, that.collection)
            && Objects.equals(this.keyExamined, that.keyExamined) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.killed, that.killed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(occurrenceTime,
            sqlTemplateId,
            originalSql,
            dbName,
            client,
            user,
            executeTime,
            lockWaitTime,
            rowsExamined,
            rowsSent,
            tunable,
            endTime,
            appName,
            rowsAffected,
            cpuTime,
            logicalReads,
            physicalReads,
            writes,
            sqlType,
            collection,
            keyExamined,
            nodeId,
            nodeName,
            killed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowLogDetail {\n");
        sb.append("    occurrenceTime: ").append(toIndentedString(occurrenceTime)).append("\n");
        sb.append("    sqlTemplateId: ").append(toIndentedString(sqlTemplateId)).append("\n");
        sb.append("    originalSql: ").append(toIndentedString(originalSql)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    executeTime: ").append(toIndentedString(executeTime)).append("\n");
        sb.append("    lockWaitTime: ").append(toIndentedString(lockWaitTime)).append("\n");
        sb.append("    rowsExamined: ").append(toIndentedString(rowsExamined)).append("\n");
        sb.append("    rowsSent: ").append(toIndentedString(rowsSent)).append("\n");
        sb.append("    tunable: ").append(toIndentedString(tunable)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    rowsAffected: ").append(toIndentedString(rowsAffected)).append("\n");
        sb.append("    cpuTime: ").append(toIndentedString(cpuTime)).append("\n");
        sb.append("    logicalReads: ").append(toIndentedString(logicalReads)).append("\n");
        sb.append("    physicalReads: ").append(toIndentedString(physicalReads)).append("\n");
        sb.append("    writes: ").append(toIndentedString(writes)).append("\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
        sb.append("    keyExamined: ").append(toIndentedString(keyExamined)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    killed: ").append(toIndentedString(killed)).append("\n");
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
