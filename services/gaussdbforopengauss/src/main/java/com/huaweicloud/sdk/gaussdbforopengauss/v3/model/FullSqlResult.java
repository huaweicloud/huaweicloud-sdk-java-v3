package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 全量SQL。
 */
public class FullSqlResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_addr")

    private String clientAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    private String clientPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_exec_id")

    private String sqlExecId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_time")

    private Long allTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_time")

    private Long dbTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private Long cpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_io_time")

    private Long dataIoTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private Long executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_lines")

    private Long scanLines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_rows")

    private Long insertRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_rows")

    private Long updateRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_rows")

    private Long deleteRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_slow_sql")

    private Boolean isSlowSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_timestamp")

    private Long startTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_timestamp")

    private Long finishTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_rate")

    private Double hitRate;

    public FullSqlResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: SQL记录唯一键ID。 **取值范围**: 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FullSqlResult withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**: 实例ID。 **取值范围**: 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public FullSqlResult withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**: 节点ID。 **取值范围**: 不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public FullSqlResult withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * **参数解释**: 组件ID。 **取值范围**: 不涉及。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public FullSqlResult withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **取值范围**: 不涉及。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public FullSqlResult withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * **参数解释**: schema名称。 **取值范围**: 不涉及。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public FullSqlResult withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释**: 用户名称。 **取值范围**: 不涉及。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public FullSqlResult withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * **参数解释**: 用户发起的请求的应用程序名称。 **取值范围**: 不涉及。
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public FullSqlResult withClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
        return this;
    }

    /**
     * **参数解释**: 用户发起的请求的客户端地址。 **取值范围**: 不涉及。
     * @return clientAddr
     */
    public String getClientAddr() {
        return clientAddr;
    }

    public void setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
    }

    public FullSqlResult withClientPort(String clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * **参数解释**: 用户发起请求的客户端端口。 **取值范围**: 不涉及。
     * @return clientPort
     */
    public String getClientPort() {
        return clientPort;
    }

    public void setClientPort(String clientPort) {
        this.clientPort = clientPort;
    }

    public FullSqlResult withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: 归一化SQL ID，对应内核字段：unique_sql_id。 **取值范围**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public FullSqlResult withSqlExecId(String sqlExecId) {
        this.sqlExecId = sqlExecId;
        return this;
    }

    /**
     * **参数解释**: 唯一SQL ID，对应内核字段：debug_query_id。 **取值范围**: 不涉及。
     * @return sqlExecId
     */
    public String getSqlExecId() {
        return sqlExecId;
    }

    public void setSqlExecId(String sqlExecId) {
        this.sqlExecId = sqlExecId;
    }

    public FullSqlResult withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * **参数解释**: 事务ID，对应内核字段：debug_query_id。 **取值范围**: 不涉及。
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public FullSqlResult withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * **参数解释**: 链路ID。 **取值范围**: 不涉及。
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public FullSqlResult withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释**: 归一化SQL。 **取值范围**: 不涉及。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public FullSqlResult withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * **参数解释**: 解析后的原始SQL文本。 **取值范围**: 开启track_stmt_parameter参数后，会把SQL文本中的变量替换成真实值，展示原始的SQL。对于track_stmt_parameter参数关闭时采集的SQL文本，无法获取到SQL参数变量的值，展示的内容为空。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public FullSqlResult withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**: 开始时间，格式为“yyyy-mm-ddThh:mm:ss.SSSSSZ”。 **取值范围**: 不涉及。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public FullSqlResult withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 结束时间，格式为“yyyy-mm-ddThh:mm:ss.SSSSSZ”。 **取值范围**: 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public FullSqlResult withAllTime(Long allTime) {
        this.allTime = allTime;
        return this;
    }

    /**
     * **参数解释**: 执行总时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return allTime
     */
    public Long getAllTime() {
        return allTime;
    }

    public void setAllTime(Long allTime) {
        this.allTime = allTime;
    }

    public FullSqlResult withDbTime(Long dbTime) {
        this.dbTime = dbTime;
        return this;
    }

    /**
     * **参数解释**: 有效DB时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return dbTime
     */
    public Long getDbTime() {
        return dbTime;
    }

    public void setDbTime(Long dbTime) {
        this.dbTime = dbTime;
    }

    public FullSqlResult withCpuTime(Long cpuTime) {
        this.cpuTime = cpuTime;
        return this;
    }

    /**
     * **参数解释**: CPU时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return cpuTime
     */
    public Long getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Long cpuTime) {
        this.cpuTime = cpuTime;
    }

    public FullSqlResult withDataIoTime(Long dataIoTime) {
        this.dataIoTime = dataIoTime;
        return this;
    }

    /**
     * **参数解释**: IO时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return dataIoTime
     */
    public Long getDataIoTime() {
        return dataIoTime;
    }

    public void setDataIoTime(Long dataIoTime) {
        this.dataIoTime = dataIoTime;
    }

    public FullSqlResult withExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
        return this;
    }

    /**
     * **参数解释**: 执行器内执行时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return executionTime
     */
    public Long getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Long executionTime) {
        this.executionTime = executionTime;
    }

    public FullSqlResult withScanLines(Long scanLines) {
        this.scanLines = scanLines;
        return this;
    }

    /**
     * **参数解释**: 扫描行。 **取值范围**: 不涉及。
     * @return scanLines
     */
    public Long getScanLines() {
        return scanLines;
    }

    public void setScanLines(Long scanLines) {
        this.scanLines = scanLines;
    }

    public FullSqlResult withInsertRows(Long insertRows) {
        this.insertRows = insertRows;
        return this;
    }

    /**
     * **参数解释**: 插入行。 **取值范围**: 不涉及。
     * @return insertRows
     */
    public Long getInsertRows() {
        return insertRows;
    }

    public void setInsertRows(Long insertRows) {
        this.insertRows = insertRows;
    }

    public FullSqlResult withUpdateRows(Long updateRows) {
        this.updateRows = updateRows;
        return this;
    }

    /**
     * **参数解释**: 更新行。 **取值范围**: 不涉及。
     * @return updateRows
     */
    public Long getUpdateRows() {
        return updateRows;
    }

    public void setUpdateRows(Long updateRows) {
        this.updateRows = updateRows;
    }

    public FullSqlResult withDeleteRows(Long deleteRows) {
        this.deleteRows = deleteRows;
        return this;
    }

    /**
     * **参数解释**: 删除行。 **取值范围**: 不涉及。
     * @return deleteRows
     */
    public Long getDeleteRows() {
        return deleteRows;
    }

    public void setDeleteRows(Long deleteRows) {
        this.deleteRows = deleteRows;
    }

    public FullSqlResult withIsSlowSql(Boolean isSlowSql) {
        this.isSlowSql = isSlowSql;
        return this;
    }

    /**
     * **参数解释**: 是否慢SQL。 **取值范围**: 不涉及。
     * @return isSlowSql
     */
    public Boolean getIsSlowSql() {
        return isSlowSql;
    }

    public void setIsSlowSql(Boolean isSlowSql) {
        this.isSlowSql = isSlowSql;
    }

    public FullSqlResult withStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }

    /**
     * **参数解释**: SQL开始时间。格式为13位标准时间戳，如1754647168354。 **取值范围**: 不涉及。
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public FullSqlResult withFinishTimestamp(Long finishTimestamp) {
        this.finishTimestamp = finishTimestamp;
        return this;
    }

    /**
     * **参数解释**: SQL结束时间，格式为13位标准时间戳，如1754647168355。 **取值范围**: 不涉及。
     * @return finishTimestamp
     */
    public Long getFinishTimestamp() {
        return finishTimestamp;
    }

    public void setFinishTimestamp(Long finishTimestamp) {
        this.finishTimestamp = finishTimestamp;
    }

    public FullSqlResult withHitRate(Double hitRate) {
        this.hitRate = hitRate;
        return this;
    }

    /**
     * **参数解释**: SQL命中率。 计划即将下线，请勿使用。 **取值范围**: 不涉及。
     * @return hitRate
     */
    public Double getHitRate() {
        return hitRate;
    }

    public void setHitRate(Double hitRate) {
        this.hitRate = hitRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullSqlResult that = (FullSqlResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.username, that.username)
            && Objects.equals(this.applicationName, that.applicationName)
            && Objects.equals(this.clientAddr, that.clientAddr) && Objects.equals(this.clientPort, that.clientPort)
            && Objects.equals(this.sqlId, that.sqlId) && Objects.equals(this.sqlExecId, that.sqlExecId)
            && Objects.equals(this.transactionId, that.transactionId) && Objects.equals(this.traceId, that.traceId)
            && Objects.equals(this.query, that.query) && Objects.equals(this.sql, that.sql)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.allTime, that.allTime) && Objects.equals(this.dbTime, that.dbTime)
            && Objects.equals(this.cpuTime, that.cpuTime) && Objects.equals(this.dataIoTime, that.dataIoTime)
            && Objects.equals(this.executionTime, that.executionTime) && Objects.equals(this.scanLines, that.scanLines)
            && Objects.equals(this.insertRows, that.insertRows) && Objects.equals(this.updateRows, that.updateRows)
            && Objects.equals(this.deleteRows, that.deleteRows) && Objects.equals(this.isSlowSql, that.isSlowSql)
            && Objects.equals(this.startTimestamp, that.startTimestamp)
            && Objects.equals(this.finishTimestamp, that.finishTimestamp) && Objects.equals(this.hitRate, that.hitRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            instanceId,
            nodeId,
            componentId,
            dbName,
            schemaName,
            username,
            applicationName,
            clientAddr,
            clientPort,
            sqlId,
            sqlExecId,
            transactionId,
            traceId,
            query,
            sql,
            beginTime,
            endTime,
            allTime,
            dbTime,
            cpuTime,
            dataIoTime,
            executionTime,
            scanLines,
            insertRows,
            updateRows,
            deleteRows,
            isSlowSql,
            startTimestamp,
            finishTimestamp,
            hitRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullSqlResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    clientAddr: ").append(toIndentedString(clientAddr)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    sqlExecId: ").append(toIndentedString(sqlExecId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
        sb.append("    dbTime: ").append(toIndentedString(dbTime)).append("\n");
        sb.append("    cpuTime: ").append(toIndentedString(cpuTime)).append("\n");
        sb.append("    dataIoTime: ").append(toIndentedString(dataIoTime)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    scanLines: ").append(toIndentedString(scanLines)).append("\n");
        sb.append("    insertRows: ").append(toIndentedString(insertRows)).append("\n");
        sb.append("    updateRows: ").append(toIndentedString(updateRows)).append("\n");
        sb.append("    deleteRows: ").append(toIndentedString(deleteRows)).append("\n");
        sb.append("    isSlowSql: ").append(toIndentedString(isSlowSql)).append("\n");
        sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
        sb.append("    finishTimestamp: ").append(toIndentedString(finishTimestamp)).append("\n");
        sb.append("    hitRate: ").append(toIndentedString(hitRate)).append("\n");
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
