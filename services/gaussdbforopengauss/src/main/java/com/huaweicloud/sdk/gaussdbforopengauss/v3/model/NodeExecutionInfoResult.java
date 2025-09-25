package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SQL链路节点执行信息
 */
public class NodeExecutionInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_exec_id")

    private String sqlExecId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_time")

    private Long allTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_addr")

    private String clientAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    private Integer clientPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_slow_sql")

    private Boolean isSlowSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_time_details")

    private ExecutionTimeDetailsInfo executionTimeDetails;

    public NodeExecutionInfoResult withComponentId(String componentId) {
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

    public NodeExecutionInfoResult withNodeId(String nodeId) {
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

    public NodeExecutionInfoResult withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * **参数解释**: 事务ID。 **取值范围**: 不涉及。
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public NodeExecutionInfoResult withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: 归一化SQL ID。 **取值范围**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public NodeExecutionInfoResult withSqlExecId(String sqlExecId) {
        this.sqlExecId = sqlExecId;
        return this;
    }

    /**
     * **参数解释**: 唯一SQL ID。 **取值范围**: 不涉及。
     * @return sqlExecId
     */
    public String getSqlExecId() {
        return sqlExecId;
    }

    public void setSqlExecId(String sqlExecId) {
        this.sqlExecId = sqlExecId;
    }

    public NodeExecutionInfoResult withDbName(String dbName) {
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

    public NodeExecutionInfoResult withSchemaName(String schemaName) {
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

    public NodeExecutionInfoResult withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 语句启动的时间，格式为“yyyy-mm-ddThh:mm: ssssssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **取值范围**: 不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public NodeExecutionInfoResult withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * **参数解释**: 语句结束的时间，格式为“yyyy-mm-ddThh:mm: ssssssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **取值范围**: 不涉及。
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public NodeExecutionInfoResult withAllTime(Long allTime) {
        this.allTime = allTime;
        return this;
    }

    /**
     * **参数解释**: 执行总耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return allTime
     */
    public Long getAllTime() {
        return allTime;
    }

    public void setAllTime(Long allTime) {
        this.allTime = allTime;
    }

    public NodeExecutionInfoResult withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 用户名。 **取值范围**: 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public NodeExecutionInfoResult withClientAddr(String clientAddr) {
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

    public NodeExecutionInfoResult withClientPort(Integer clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * **参数解释**: 用户发起的请求的客户端端口。 **取值范围**: 不涉及。
     * @return clientPort
     */
    public Integer getClientPort() {
        return clientPort;
    }

    public void setClientPort(Integer clientPort) {
        this.clientPort = clientPort;
    }

    public NodeExecutionInfoResult withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * **参数解释**: 驱动传入的trace id，与应用的一次请求相关联。 **取值范围**: 不涉及。
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public NodeExecutionInfoResult withApplicationName(String applicationName) {
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

    public NodeExecutionInfoResult withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**: 用户session id。 **取值范围**: 不涉及。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public NodeExecutionInfoResult withIsSlowSql(Boolean isSlowSql) {
        this.isSlowSql = isSlowSql;
        return this;
    }

    /**
     * **参数解释**: 该SQL是否为slow SQL。 **取值范围**: 不涉及。
     * @return isSlowSql
     */
    public Boolean getIsSlowSql() {
        return isSlowSql;
    }

    public void setIsSlowSql(Boolean isSlowSql) {
        this.isSlowSql = isSlowSql;
    }

    public NodeExecutionInfoResult withExecutionTimeDetails(ExecutionTimeDetailsInfo executionTimeDetails) {
        this.executionTimeDetails = executionTimeDetails;
        return this;
    }

    public NodeExecutionInfoResult withExecutionTimeDetails(
        Consumer<ExecutionTimeDetailsInfo> executionTimeDetailsSetter) {
        if (this.executionTimeDetails == null) {
            this.executionTimeDetails = new ExecutionTimeDetailsInfo();
            executionTimeDetailsSetter.accept(this.executionTimeDetails);
        }

        return this;
    }

    /**
     * Get executionTimeDetails
     * @return executionTimeDetails
     */
    public ExecutionTimeDetailsInfo getExecutionTimeDetails() {
        return executionTimeDetails;
    }

    public void setExecutionTimeDetails(ExecutionTimeDetailsInfo executionTimeDetails) {
        this.executionTimeDetails = executionTimeDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeExecutionInfoResult that = (NodeExecutionInfoResult) obj;
        return Objects.equals(this.componentId, that.componentId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.transactionId, that.transactionId) && Objects.equals(this.sqlId, that.sqlId)
            && Objects.equals(this.sqlExecId, that.sqlExecId) && Objects.equals(this.dbName, that.dbName)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.allTime, that.allTime)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.clientAddr, that.clientAddr)
            && Objects.equals(this.clientPort, that.clientPort) && Objects.equals(this.traceId, that.traceId)
            && Objects.equals(this.applicationName, that.applicationName)
            && Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.isSlowSql, that.isSlowSql)
            && Objects.equals(this.executionTimeDetails, that.executionTimeDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(componentId,
            nodeId,
            transactionId,
            sqlId,
            sqlExecId,
            dbName,
            schemaName,
            startTime,
            finishTime,
            allTime,
            userName,
            clientAddr,
            clientPort,
            traceId,
            applicationName,
            sessionId,
            isSlowSql,
            executionTimeDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeExecutionInfoResult {\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    sqlExecId: ").append(toIndentedString(sqlExecId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    allTime: ").append(toIndentedString(allTime)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    clientAddr: ").append(toIndentedString(clientAddr)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    isSlowSql: ").append(toIndentedString(isSlowSql)).append("\n");
        sb.append("    executionTimeDetails: ").append(toIndentedString(executionTimeDetails)).append("\n");
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
