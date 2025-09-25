package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SlowSqlDetailResult
 */
public class SlowSqlDetailResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    private String clientPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_text")

    private String sqlText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_plan")

    private String queryPlan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Integer startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private Integer finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returned_rows")

    private Integer returnedRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fetched_rows")

    private Integer fetchedRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fetched_pages")

    private Integer fetchedPages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_pages")

    private Integer hitPages;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time")

    private Integer totalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private Integer cpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_time")

    private Integer planTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_time")

    private Integer ioTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_count")

    private Integer lockCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_time")

    private Integer lockTime;

    public SlowSqlDetailResult withDbName(String dbName) {
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

    public SlowSqlDetailResult withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * **参数解释**: SCHEMA名称。 **取值范围**: 不涉及。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public SlowSqlDetailResult withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * **参数解释**: 变量替换后的完整SQL。当sql_text不返回变量值时，sql返回空字符串。 **取值范围**: 不涉及。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SlowSqlDetailResult withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: SQL ID。 **取值范围**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public SlowSqlDetailResult withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 用户名称。 **取值范围**: 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SlowSqlDetailResult withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * **参数解释**: 客户端IP。 **取值范围**: 不涉及。
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public SlowSqlDetailResult withClientPort(String clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * **参数解释**: 客户端端口。 **取值范围**: 不涉及。
     * @return clientPort
     */
    public String getClientPort() {
        return clientPort;
    }

    public void setClientPort(String clientPort) {
        this.clientPort = clientPort;
    }

    public SlowSqlDetailResult withNodeId(String nodeId) {
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

    public SlowSqlDetailResult withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**: 节点名称。 **取值范围**: 不涉及。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public SlowSqlDetailResult withSqlText(String sqlText) {
        this.sqlText = sqlText;
        return this;
    }

    /**
     * **参数解释**: SQL模版。 **取值范围**: 不涉及。
     * @return sqlText
     */
    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public SlowSqlDetailResult withQueryPlan(String queryPlan) {
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

    public SlowSqlDetailResult withStartTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**: 开始时间UTC时间。 **取值范围**: 格式为yyyy-mm-ddThh:mm:ss+0000。
     * @return startTime
     */
    public Integer getStartTime() {
        return startTime;
    }

    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public SlowSqlDetailResult withFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * **参数解释**: 结束时间UTC时间。 **取值范围**: 格式为yyyy-mm-ddThh:mm:ss+0000。
     * @return finishTime
     */
    public Integer getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Integer finishTime) {
        this.finishTime = finishTime;
    }

    public SlowSqlDetailResult withReturnedRows(Integer returnedRows) {
        this.returnedRows = returnedRows;
        return this;
    }

    /**
     * **参数解释**: 返回行。 **取值范围**: 不涉及。
     * @return returnedRows
     */
    public Integer getReturnedRows() {
        return returnedRows;
    }

    public void setReturnedRows(Integer returnedRows) {
        this.returnedRows = returnedRows;
    }

    public SlowSqlDetailResult withFetchedRows(Integer fetchedRows) {
        this.fetchedRows = fetchedRows;
        return this;
    }

    /**
     * **参数解释**: 扫描行。 **取值范围**: 不涉及。
     * @return fetchedRows
     */
    public Integer getFetchedRows() {
        return fetchedRows;
    }

    public void setFetchedRows(Integer fetchedRows) {
        this.fetchedRows = fetchedRows;
    }

    public SlowSqlDetailResult withFetchedPages(Integer fetchedPages) {
        this.fetchedPages = fetchedPages;
        return this;
    }

    /**
     * **参数解释**: 扫描页。 **取值范围**: 不涉及。
     * @return fetchedPages
     */
    public Integer getFetchedPages() {
        return fetchedPages;
    }

    public void setFetchedPages(Integer fetchedPages) {
        this.fetchedPages = fetchedPages;
    }

    public SlowSqlDetailResult withHitPages(Integer hitPages) {
        this.hitPages = hitPages;
        return this;
    }

    /**
     * **参数解释**: 命中页。 **取值范围**: 不涉及。
     * @return hitPages
     */
    public Integer getHitPages() {
        return hitPages;
    }

    public void setHitPages(Integer hitPages) {
        this.hitPages = hitPages;
    }

    public SlowSqlDetailResult withTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    /**
     * **参数解释**: 总耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return totalTime
     */
    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public SlowSqlDetailResult withCpuTime(Integer cpuTime) {
        this.cpuTime = cpuTime;
        return this;
    }

    /**
     * **参数解释**: CPU耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return cpuTime
     */
    public Integer getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Integer cpuTime) {
        this.cpuTime = cpuTime;
    }

    public SlowSqlDetailResult withPlanTime(Integer planTime) {
        this.planTime = planTime;
        return this;
    }

    /**
     * **参数解释**: 计划耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return planTime
     */
    public Integer getPlanTime() {
        return planTime;
    }

    public void setPlanTime(Integer planTime) {
        this.planTime = planTime;
    }

    public SlowSqlDetailResult withIoTime(Integer ioTime) {
        this.ioTime = ioTime;
        return this;
    }

    /**
     * **参数解释**: IO耗时（单位：微秒）。 **取值范围**: 不涉及。
     * @return ioTime
     */
    public Integer getIoTime() {
        return ioTime;
    }

    public void setIoTime(Integer ioTime) {
        this.ioTime = ioTime;
    }

    public SlowSqlDetailResult withLockCount(Integer lockCount) {
        this.lockCount = lockCount;
        return this;
    }

    /**
     * **参数解释**: 加锁次数。 **取值范围**: 不涉及。
     * @return lockCount
     */
    public Integer getLockCount() {
        return lockCount;
    }

    public void setLockCount(Integer lockCount) {
        this.lockCount = lockCount;
    }

    public SlowSqlDetailResult withLockTime(Integer lockTime) {
        this.lockTime = lockTime;
        return this;
    }

    /**
     * **参数解释**: 加锁耗时(单位：微秒)。 **取值范围**: 不涉及。
     * @return lockTime
     */
    public Integer getLockTime() {
        return lockTime;
    }

    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowSqlDetailResult that = (SlowSqlDetailResult) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.sql, that.sql) && Objects.equals(this.sqlId, that.sqlId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.clientIp, that.clientIp)
            && Objects.equals(this.clientPort, that.clientPort) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.sqlText, that.sqlText)
            && Objects.equals(this.queryPlan, that.queryPlan) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.returnedRows, that.returnedRows)
            && Objects.equals(this.fetchedRows, that.fetchedRows)
            && Objects.equals(this.fetchedPages, that.fetchedPages) && Objects.equals(this.hitPages, that.hitPages)
            && Objects.equals(this.totalTime, that.totalTime) && Objects.equals(this.cpuTime, that.cpuTime)
            && Objects.equals(this.planTime, that.planTime) && Objects.equals(this.ioTime, that.ioTime)
            && Objects.equals(this.lockCount, that.lockCount) && Objects.equals(this.lockTime, that.lockTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName,
            schemaName,
            sql,
            sqlId,
            userName,
            clientIp,
            clientPort,
            nodeId,
            nodeName,
            sqlText,
            queryPlan,
            startTime,
            finishTime,
            returnedRows,
            fetchedRows,
            fetchedPages,
            hitPages,
            totalTime,
            cpuTime,
            planTime,
            ioTime,
            lockCount,
            lockTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowSqlDetailResult {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    sqlText: ").append(toIndentedString(sqlText)).append("\n");
        sb.append("    queryPlan: ").append(toIndentedString(queryPlan)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    returnedRows: ").append(toIndentedString(returnedRows)).append("\n");
        sb.append("    fetchedRows: ").append(toIndentedString(fetchedRows)).append("\n");
        sb.append("    fetchedPages: ").append(toIndentedString(fetchedPages)).append("\n");
        sb.append("    hitPages: ").append(toIndentedString(hitPages)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
        sb.append("    cpuTime: ").append(toIndentedString(cpuTime)).append("\n");
        sb.append("    planTime: ").append(toIndentedString(planTime)).append("\n");
        sb.append("    ioTime: ").append(toIndentedString(ioTime)).append("\n");
        sb.append("    lockCount: ").append(toIndentedString(lockCount)).append("\n");
        sb.append("    lockTime: ").append(toIndentedString(lockTime)).append("\n");
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
