package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 全量SQL组件信息
 */
public class FullSqlComponetResult {

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
    @JsonProperty(value = "origin_node")

    private String originNode;

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
    @JsonProperty(value = "parent_sql_id")

    private String parentSqlId;

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
    @JsonProperty(value = "thread_id")

    private String threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_query_threshold")

    private Long slowQueryThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_soft_parse")

    private Long nSoftParse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_hard_parse")

    private Long nHardParse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_plan")

    private String queryPlan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_return_rows")

    private Long nReturnRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_tuples_fetched")

    private Long nTuplesFetched;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_tuples_returned")

    private Long nTuplesReturned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_tuples_inserted")

    private Long nTuplesInserted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_tuples_updated")

    private Long nTuplesUpdated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_tuples_deleted")

    private Long nTuplesDeleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_blocks_fetched")

    private Long nBlocksFetched;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_blocks_hit")

    private Long nBlocksHit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_time")

    private Long dbTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private Long cpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time")

    private Long executionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parse_time")

    private Long parseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_time")

    private Long planTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rewrite_time")

    private Long rewriteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pl_execution_time")

    private Long plExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pl_compilation_time")

    private Long plCompilationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_io_time")

    private Long dataIoTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_count")

    private Long lockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private Long lockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_wait_count")

    private Long lockWaitCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_wait_time")

    private Long lockWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private String details;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_slow_sql")

    private Boolean isSlowSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advise")

    private String advise;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_status")

    private String finishStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_send_info")

    private String netSendInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_recv_info")

    private String netRecvInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_stream_send_info")

    private String netStreamSendInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_stream_recv_info")

    private String netStreamRecvInfo;

    public FullSqlComponetResult withComponentId(String componentId) {
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

    public FullSqlComponetResult withDbName(String dbName) {
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

    public FullSqlComponetResult withSchemaName(String schemaName) {
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

    public FullSqlComponetResult withOriginNode(String originNode) {
        this.originNode = originNode;
        return this;
    }

    /**
     * **参数解释**: 原始节点。 **取值范围**: 不涉及。
     * @return originNode
     */
    public String getOriginNode() {
        return originNode;
    }

    public void setOriginNode(String originNode) {
        this.originNode = originNode;
    }

    public FullSqlComponetResult withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释**: 用户名。 **取值范围**: 不涉及。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public FullSqlComponetResult withApplicationName(String applicationName) {
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

    public FullSqlComponetResult withClientAddr(String clientAddr) {
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

    public FullSqlComponetResult withClientPort(String clientPort) {
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

    public FullSqlComponetResult withParentSqlId(String parentSqlId) {
        this.parentSqlId = parentSqlId;
        return this;
    }

    /**
     * **参数解释**: 当前语句的外层SQL的归一化SQL ID。 **取值范围**: 不涉及。
     * @return parentSqlId
     */
    public String getParentSqlId() {
        return parentSqlId;
    }

    public void setParentSqlId(String parentSqlId) {
        this.parentSqlId = parentSqlId;
    }

    public FullSqlComponetResult withSqlId(String sqlId) {
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

    public FullSqlComponetResult withSqlExecId(String sqlExecId) {
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

    public FullSqlComponetResult withTransactionId(String transactionId) {
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

    public FullSqlComponetResult withTraceId(String traceId) {
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

    public FullSqlComponetResult withQuery(String query) {
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

    public FullSqlComponetResult withThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * **参数解释**: 线程ID。 **取值范围**: 不涉及。
     * @return threadId
     */
    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public FullSqlComponetResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**: 会话ID。 **取值范围**: 不涉及。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public FullSqlComponetResult withBeginTime(String beginTime) {
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

    public FullSqlComponetResult withEndTime(String endTime) {
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

    public FullSqlComponetResult withSlowQueryThreshold(Long slowQueryThreshold) {
        this.slowQueryThreshold = slowQueryThreshold;
        return this;
    }

    /**
     * **参数解释**: 慢SQL阈值。 **取值范围**: 不涉及。
     * @return slowQueryThreshold
     */
    public Long getSlowQueryThreshold() {
        return slowQueryThreshold;
    }

    public void setSlowQueryThreshold(Long slowQueryThreshold) {
        this.slowQueryThreshold = slowQueryThreshold;
    }

    public FullSqlComponetResult withNSoftParse(Long nSoftParse) {
        this.nSoftParse = nSoftParse;
        return this;
    }

    /**
     * **参数解释**: 软解析次数。 **取值范围**: 不涉及。
     * @return nSoftParse
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_soft_parse")
    public Long getNSoftParse() {
        return nSoftParse;
    }

    public void setNSoftParse(Long nSoftParse) {
        this.nSoftParse = nSoftParse;
    }

    public FullSqlComponetResult withNHardParse(Long nHardParse) {
        this.nHardParse = nHardParse;
        return this;
    }

    /**
     * **参数解释**: 硬解析次数。 **取值范围**: 不涉及。
     * @return nHardParse
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_hard_parse")
    public Long getNHardParse() {
        return nHardParse;
    }

    public void setNHardParse(Long nHardParse) {
        this.nHardParse = nHardParse;
    }

    public FullSqlComponetResult withQueryPlan(String queryPlan) {
        this.queryPlan = queryPlan;
        return this;
    }

    /**
     * **参数解释**: 执行计划。 **取值范围**: 不涉及。
     * @return queryPlan
     */
    public String getQueryPlan() {
        return queryPlan;
    }

    public void setQueryPlan(String queryPlan) {
        this.queryPlan = queryPlan;
    }

    public FullSqlComponetResult withNReturnRows(Long nReturnRows) {
        this.nReturnRows = nReturnRows;
        return this;
    }

    /**
     * **参数解释**: SELECT语句的返回结果集行数。 **取值范围**: 不涉及。
     * @return nReturnRows
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_return_rows")
    public Long getNReturnRows() {
        return nReturnRows;
    }

    public void setNReturnRows(Long nReturnRows) {
        this.nReturnRows = nReturnRows;
    }

    public FullSqlComponetResult withNTuplesFetched(Long nTuplesFetched) {
        this.nTuplesFetched = nTuplesFetched;
        return this;
    }

    /**
     * **参数解释**: 随机扫描行。 **取值范围**: 不涉及。
     * @return nTuplesFetched
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_tuples_fetched")
    public Long getNTuplesFetched() {
        return nTuplesFetched;
    }

    public void setNTuplesFetched(Long nTuplesFetched) {
        this.nTuplesFetched = nTuplesFetched;
    }

    public FullSqlComponetResult withNTuplesReturned(Long nTuplesReturned) {
        this.nTuplesReturned = nTuplesReturned;
        return this;
    }

    /**
     * **参数解释**: 顺序扫描行。 **取值范围**: 不涉及。
     * @return nTuplesReturned
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_tuples_returned")
    public Long getNTuplesReturned() {
        return nTuplesReturned;
    }

    public void setNTuplesReturned(Long nTuplesReturned) {
        this.nTuplesReturned = nTuplesReturned;
    }

    public FullSqlComponetResult withNTuplesInserted(Long nTuplesInserted) {
        this.nTuplesInserted = nTuplesInserted;
        return this;
    }

    /**
     * **参数解释**: 插入行。 **取值范围**: 不涉及。
     * @return nTuplesInserted
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_tuples_inserted")
    public Long getNTuplesInserted() {
        return nTuplesInserted;
    }

    public void setNTuplesInserted(Long nTuplesInserted) {
        this.nTuplesInserted = nTuplesInserted;
    }

    public FullSqlComponetResult withNTuplesUpdated(Long nTuplesUpdated) {
        this.nTuplesUpdated = nTuplesUpdated;
        return this;
    }

    /**
     * **参数解释**: 更新行。 **取值范围**: 不涉及。
     * @return nTuplesUpdated
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_tuples_updated")
    public Long getNTuplesUpdated() {
        return nTuplesUpdated;
    }

    public void setNTuplesUpdated(Long nTuplesUpdated) {
        this.nTuplesUpdated = nTuplesUpdated;
    }

    public FullSqlComponetResult withNTuplesDeleted(Long nTuplesDeleted) {
        this.nTuplesDeleted = nTuplesDeleted;
        return this;
    }

    /**
     * **参数解释**: 删除行。 **取值范围**: 不涉及。
     * @return nTuplesDeleted
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_tuples_deleted")
    public Long getNTuplesDeleted() {
        return nTuplesDeleted;
    }

    public void setNTuplesDeleted(Long nTuplesDeleted) {
        this.nTuplesDeleted = nTuplesDeleted;
    }

    public FullSqlComponetResult withNBlocksFetched(Long nBlocksFetched) {
        this.nBlocksFetched = nBlocksFetched;
        return this;
    }

    /**
     * **参数解释**: buffer的块访问次数。 **取值范围**: 不涉及。\"\"
     * @return nBlocksFetched
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_blocks_fetched")
    public Long getNBlocksFetched() {
        return nBlocksFetched;
    }

    public void setNBlocksFetched(Long nBlocksFetched) {
        this.nBlocksFetched = nBlocksFetched;
    }

    public FullSqlComponetResult withNBlocksHit(Long nBlocksHit) {
        this.nBlocksHit = nBlocksHit;
        return this;
    }

    /**
     * **参数解释**: buffer的块命中次数。 **取值范围**: 不涉及。
     * @return nBlocksHit
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "n_blocks_hit")
    public Long getNBlocksHit() {
        return nBlocksHit;
    }

    public void setNBlocksHit(Long nBlocksHit) {
        this.nBlocksHit = nBlocksHit;
    }

    public FullSqlComponetResult withDbTime(Long dbTime) {
        this.dbTime = dbTime;
        return this;
    }

    /**
     * **参数解释**: 有效DB时间花费。 **取值范围**: 不涉及。
     * @return dbTime
     */
    public Long getDbTime() {
        return dbTime;
    }

    public void setDbTime(Long dbTime) {
        this.dbTime = dbTime;
    }

    public FullSqlComponetResult withCpuTime(Long cpuTime) {
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

    public FullSqlComponetResult withExecutionTime(Long executionTime) {
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

    public FullSqlComponetResult withParseTime(Long parseTime) {
        this.parseTime = parseTime;
        return this;
    }

    /**
     * **参数解释**: SQL解析时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return parseTime
     */
    public Long getParseTime() {
        return parseTime;
    }

    public void setParseTime(Long parseTime) {
        this.parseTime = parseTime;
    }

    public FullSqlComponetResult withPlanTime(Long planTime) {
        this.planTime = planTime;
        return this;
    }

    /**
     * **参数解释**: 执行器内执行时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return planTime
     */
    public Long getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Long planTime) {
        this.planTime = planTime;
    }

    public FullSqlComponetResult withRewriteTime(Long rewriteTime) {
        this.rewriteTime = rewriteTime;
        return this;
    }

    /**
     * **参数解释**: SQL重写时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return rewriteTime
     */
    public Long getRewriteTime() {
        return rewriteTime;
    }

    public void setRewriteTime(Long rewriteTime) {
        this.rewriteTime = rewriteTime;
    }

    public FullSqlComponetResult withPlExecutionTime(Long plExecutionTime) {
        this.plExecutionTime = plExecutionTime;
        return this;
    }

    /**
     * **参数解释**: plpgsql上的执行时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return plExecutionTime
     */
    public Long getPlExecutionTime() {
        return plExecutionTime;
    }

    public void setPlExecutionTime(Long plExecutionTime) {
        this.plExecutionTime = plExecutionTime;
    }

    public FullSqlComponetResult withPlCompilationTime(Long plCompilationTime) {
        this.plCompilationTime = plCompilationTime;
        return this;
    }

    /**
     * **参数解释**: plpgsql上的编译时间（单位：微秒）。 **取值范围**: 不涉及。
     * @return plCompilationTime
     */
    public Long getPlCompilationTime() {
        return plCompilationTime;
    }

    public void setPlCompilationTime(Long plCompilationTime) {
        this.plCompilationTime = plCompilationTime;
    }

    public FullSqlComponetResult withDataIoTime(Long dataIoTime) {
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

    public FullSqlComponetResult withLockCount(Long lockCount) {
        this.lockCount = lockCount;
        return this;
    }

    /**
     * **参数解释**: 加锁次数。 **取值范围**: 不涉及。
     * @return lockCount
     */
    public Long getLockCount() {
        return lockCount;
    }

    public void setLockCount(Long lockCount) {
        this.lockCount = lockCount;
    }

    public FullSqlComponetResult withLockTime(Long lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * **参数解释**: 加锁耗时。 **取值范围**: 不涉及。
     * @return lockTime
     */
    public Long getLockTime() {
        return lockTime;
    }

    public void setLockTime(Long lockTime) {
        this.lockTime = lockTime;
    }

    public FullSqlComponetResult withLockWaitCount(Long lockWaitCount) {
        this.lockWaitCount = lockWaitCount;
        return this;
    }

    /**
     * **参数解释**: 加锁等待次数。 **取值范围**: 不涉及。
     * @return lockWaitCount
     */
    public Long getLockWaitCount() {
        return lockWaitCount;
    }

    public void setLockWaitCount(Long lockWaitCount) {
        this.lockWaitCount = lockWaitCount;
    }

    public FullSqlComponetResult withLockWaitTime(Long lockWaitTime) {
        this.lockWaitTime = lockWaitTime;
        return this;
    }

    /**
     * **参数解释**: 加锁等待时间。 **取值范围**: 不涉及。
     * @return lockWaitTime
     */
    public Long getLockWaitTime() {
        return lockWaitTime;
    }

    public void setLockWaitTime(Long lockWaitTime) {
        this.lockWaitTime = lockWaitTime;
    }

    public FullSqlComponetResult withDetails(String details) {
        this.details = details;
        return this;
    }

    /**
     * **参数解释**: 详细列表。 **取值范围**: 不涉及。
     * @return details
     */
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public FullSqlComponetResult withIsSlowSql(Boolean isSlowSql) {
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

    public FullSqlComponetResult withAdvise(String advise) {
        this.advise = advise;
        return this;
    }

    /**
     * **参数解释**: 可能导致该SQL为慢SQL的风险信息。 **取值范围**: 不涉及。
     * @return advise
     */
    public String getAdvise() {
        return advise;
    }

    public void setAdvise(String advise) {
        this.advise = advise;
    }

    public FullSqlComponetResult withFinishStatus(String finishStatus) {
        this.finishStatus = finishStatus;
        return this;
    }

    /**
     * **参数解释**: 语句完成状态。 **取值范围**: 不涉及。
     * @return finishStatus
     */
    public String getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(String finishStatus) {
        this.finishStatus = finishStatus;
    }

    public FullSqlComponetResult withNetSendInfo(String netSendInfo) {
        this.netSendInfo = netSendInfo;
        return this;
    }

    /**
     * **参数解释**: 通过物理连接发送消息的网络状态。 **取值范围**: 不涉及。
     * @return netSendInfo
     */
    public String getNetSendInfo() {
        return netSendInfo;
    }

    public void setNetSendInfo(String netSendInfo) {
        this.netSendInfo = netSendInfo;
    }

    public FullSqlComponetResult withNetRecvInfo(String netRecvInfo) {
        this.netRecvInfo = netRecvInfo;
        return this;
    }

    /**
     * **参数解释**: 通过物理连接接收消息的网络状态。 **取值范围**: 不涉及。
     * @return netRecvInfo
     */
    public String getNetRecvInfo() {
        return netRecvInfo;
    }

    public void setNetRecvInfo(String netRecvInfo) {
        this.netRecvInfo = netRecvInfo;
    }

    public FullSqlComponetResult withNetStreamSendInfo(String netStreamSendInfo) {
        this.netStreamSendInfo = netStreamSendInfo;
        return this;
    }

    /**
     * **参数解释**: 通过逻辑连接发送消息的网络状态。 **取值范围**: 不涉及。
     * @return netStreamSendInfo
     */
    public String getNetStreamSendInfo() {
        return netStreamSendInfo;
    }

    public void setNetStreamSendInfo(String netStreamSendInfo) {
        this.netStreamSendInfo = netStreamSendInfo;
    }

    public FullSqlComponetResult withNetStreamRecvInfo(String netStreamRecvInfo) {
        this.netStreamRecvInfo = netStreamRecvInfo;
        return this;
    }

    /**
     * **参数解释**: 通过逻辑连接接收消息的网络状态。 **取值范围**: 不涉及。
     * @return netStreamRecvInfo
     */
    public String getNetStreamRecvInfo() {
        return netStreamRecvInfo;
    }

    public void setNetStreamRecvInfo(String netStreamRecvInfo) {
        this.netStreamRecvInfo = netStreamRecvInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullSqlComponetResult that = (FullSqlComponetResult) obj;
        return Objects.equals(this.componentId, that.componentId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.originNode, that.originNode)
            && Objects.equals(this.username, that.username)
            && Objects.equals(this.applicationName, that.applicationName)
            && Objects.equals(this.clientAddr, that.clientAddr) && Objects.equals(this.clientPort, that.clientPort)
            && Objects.equals(this.parentSqlId, that.parentSqlId) && Objects.equals(this.sqlId, that.sqlId)
            && Objects.equals(this.sqlExecId, that.sqlExecId) && Objects.equals(this.transactionId, that.transactionId)
            && Objects.equals(this.traceId, that.traceId) && Objects.equals(this.query, that.query)
            && Objects.equals(this.threadId, that.threadId) && Objects.equals(this.sessionId, that.sessionId)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.slowQueryThreshold, that.slowQueryThreshold)
            && Objects.equals(this.nSoftParse, that.nSoftParse) && Objects.equals(this.nHardParse, that.nHardParse)
            && Objects.equals(this.queryPlan, that.queryPlan) && Objects.equals(this.nReturnRows, that.nReturnRows)
            && Objects.equals(this.nTuplesFetched, that.nTuplesFetched)
            && Objects.equals(this.nTuplesReturned, that.nTuplesReturned)
            && Objects.equals(this.nTuplesInserted, that.nTuplesInserted)
            && Objects.equals(this.nTuplesUpdated, that.nTuplesUpdated)
            && Objects.equals(this.nTuplesDeleted, that.nTuplesDeleted)
            && Objects.equals(this.nBlocksFetched, that.nBlocksFetched)
            && Objects.equals(this.nBlocksHit, that.nBlocksHit) && Objects.equals(this.dbTime, that.dbTime)
            && Objects.equals(this.cpuTime, that.cpuTime) && Objects.equals(this.executionTime, that.executionTime)
            && Objects.equals(this.parseTime, that.parseTime) && Objects.equals(this.planTime, that.planTime)
            && Objects.equals(this.rewriteTime, that.rewriteTime)
            && Objects.equals(this.plExecutionTime, that.plExecutionTime)
            && Objects.equals(this.plCompilationTime, that.plCompilationTime)
            && Objects.equals(this.dataIoTime, that.dataIoTime) && Objects.equals(this.lockCount, that.lockCount)
            && Objects.equals(this.lockTime, that.lockTime) && Objects.equals(this.lockWaitCount, that.lockWaitCount)
            && Objects.equals(this.lockWaitTime, that.lockWaitTime) && Objects.equals(this.details, that.details)
            && Objects.equals(this.isSlowSql, that.isSlowSql) && Objects.equals(this.advise, that.advise)
            && Objects.equals(this.finishStatus, that.finishStatus)
            && Objects.equals(this.netSendInfo, that.netSendInfo) && Objects.equals(this.netRecvInfo, that.netRecvInfo)
            && Objects.equals(this.netStreamSendInfo, that.netStreamSendInfo)
            && Objects.equals(this.netStreamRecvInfo, that.netStreamRecvInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId,
            dbName,
            schemaName,
            originNode,
            username,
            applicationName,
            clientAddr,
            clientPort,
            parentSqlId,
            sqlId,
            sqlExecId,
            transactionId,
            traceId,
            query,
            threadId,
            sessionId,
            beginTime,
            endTime,
            slowQueryThreshold,
            nSoftParse,
            nHardParse,
            queryPlan,
            nReturnRows,
            nTuplesFetched,
            nTuplesReturned,
            nTuplesInserted,
            nTuplesUpdated,
            nTuplesDeleted,
            nBlocksFetched,
            nBlocksHit,
            dbTime,
            cpuTime,
            executionTime,
            parseTime,
            planTime,
            rewriteTime,
            plExecutionTime,
            plCompilationTime,
            dataIoTime,
            lockCount,
            lockTime,
            lockWaitCount,
            lockWaitTime,
            details,
            isSlowSql,
            advise,
            finishStatus,
            netSendInfo,
            netRecvInfo,
            netStreamSendInfo,
            netStreamRecvInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullSqlComponetResult {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    originNode: ").append(toIndentedString(originNode)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    clientAddr: ").append(toIndentedString(clientAddr)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    parentSqlId: ").append(toIndentedString(parentSqlId)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    sqlExecId: ").append(toIndentedString(sqlExecId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    slowQueryThreshold: ").append(toIndentedString(slowQueryThreshold)).append("\n");
        sb.append("    nSoftParse: ").append(toIndentedString(nSoftParse)).append("\n");
        sb.append("    nHardParse: ").append(toIndentedString(nHardParse)).append("\n");
        sb.append("    queryPlan: ").append(toIndentedString(queryPlan)).append("\n");
        sb.append("    nReturnRows: ").append(toIndentedString(nReturnRows)).append("\n");
        sb.append("    nTuplesFetched: ").append(toIndentedString(nTuplesFetched)).append("\n");
        sb.append("    nTuplesReturned: ").append(toIndentedString(nTuplesReturned)).append("\n");
        sb.append("    nTuplesInserted: ").append(toIndentedString(nTuplesInserted)).append("\n");
        sb.append("    nTuplesUpdated: ").append(toIndentedString(nTuplesUpdated)).append("\n");
        sb.append("    nTuplesDeleted: ").append(toIndentedString(nTuplesDeleted)).append("\n");
        sb.append("    nBlocksFetched: ").append(toIndentedString(nBlocksFetched)).append("\n");
        sb.append("    nBlocksHit: ").append(toIndentedString(nBlocksHit)).append("\n");
        sb.append("    dbTime: ").append(toIndentedString(dbTime)).append("\n");
        sb.append("    cpuTime: ").append(toIndentedString(cpuTime)).append("\n");
        sb.append("    executionTime: ").append(toIndentedString(executionTime)).append("\n");
        sb.append("    parseTime: ").append(toIndentedString(parseTime)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    rewriteTime: ").append(toIndentedString(rewriteTime)).append("\n");
        sb.append("    plExecutionTime: ").append(toIndentedString(plExecutionTime)).append("\n");
        sb.append("    plCompilationTime: ").append(toIndentedString(plCompilationTime)).append("\n");
        sb.append("    dataIoTime: ").append(toIndentedString(dataIoTime)).append("\n");
        sb.append("    lockCount: ").append(toIndentedString(lockCount)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
        sb.append("    lockWaitCount: ").append(toIndentedString(lockWaitCount)).append("\n");
        sb.append("    lockWaitTime: ").append(toIndentedString(lockWaitTime)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    isSlowSql: ").append(toIndentedString(isSlowSql)).append("\n");
        sb.append("    advise: ").append(toIndentedString(advise)).append("\n");
        sb.append("    finishStatus: ").append(toIndentedString(finishStatus)).append("\n");
        sb.append("    netSendInfo: ").append(toIndentedString(netSendInfo)).append("\n");
        sb.append("    netRecvInfo: ").append(toIndentedString(netRecvInfo)).append("\n");
        sb.append("    netStreamSendInfo: ").append(toIndentedString(netStreamSendInfo)).append("\n");
        sb.append("    netStreamRecvInfo: ").append(toIndentedString(netStreamRecvInfo)).append("\n");
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
