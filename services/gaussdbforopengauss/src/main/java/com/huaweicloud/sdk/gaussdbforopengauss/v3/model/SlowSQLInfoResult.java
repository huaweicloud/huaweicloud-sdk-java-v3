package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SlowSQLInfoResult
 */
public class SlowSQLInfoResult {

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
    @JsonProperty(value = "sql_text")

    private String sqlText;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_plan")

    private String queryPlan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calls")

    private Integer calls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_exec_time")

    private String avgExecTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_cpu_time")

    private String avgCpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_io_time")

    private String avgIoTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_returned_rows")

    private Integer avgReturnedRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_fetched_rows")

    private Integer avgFetchedRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "buffer_hit_ratio")

    private String bufferHitRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_hit_ratio")

    private String sqlHitRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    public SlowSQLInfoResult withDbName(String dbName) {
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

    public SlowSQLInfoResult withSchemaName(String schemaName) {
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

    public SlowSQLInfoResult withSql(String sql) {
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

    public SlowSQLInfoResult withSqlId(String sqlId) {
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

    public SlowSQLInfoResult withUserName(String userName) {
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

    public SlowSQLInfoResult withSqlText(String sqlText) {
        this.sqlText = sqlText;
        return this;
    }

    /**
     * **参数解释**: SQL文本。 **取值范围**: 不涉及。
     * @return sqlText
     */
    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public SlowSQLInfoResult withQueryPlan(String queryPlan) {
        this.queryPlan = queryPlan;
        return this;
    }

    /**
     * **参数解释**: SQL计划。 **取值范围**: 不涉及。
     * @return queryPlan
     */
    public String getQueryPlan() {
        return queryPlan;
    }

    public void setQueryPlan(String queryPlan) {
        this.queryPlan = queryPlan;
    }

    public SlowSQLInfoResult withCalls(Integer calls) {
        this.calls = calls;
        return this;
    }

    /**
     * **参数解释**: 执行次数（次）。 **取值范围**: 不涉及。
     * @return calls
     */
    public Integer getCalls() {
        return calls;
    }

    public void setCalls(Integer calls) {
        this.calls = calls;
    }

    public SlowSQLInfoResult withAvgExecTime(String avgExecTime) {
        this.avgExecTime = avgExecTime;
        return this;
    }

    /**
     * **参数解释**: 平均执行时间（us）。 **取值范围**: 不涉及。
     * @return avgExecTime
     */
    public String getAvgExecTime() {
        return avgExecTime;
    }

    public void setAvgExecTime(String avgExecTime) {
        this.avgExecTime = avgExecTime;
    }

    public SlowSQLInfoResult withAvgCpuTime(String avgCpuTime) {
        this.avgCpuTime = avgCpuTime;
        return this;
    }

    /**
     * **参数解释**: 平均CPU耗时（us）。 **取值范围**: 不涉及。
     * @return avgCpuTime
     */
    public String getAvgCpuTime() {
        return avgCpuTime;
    }

    public void setAvgCpuTime(String avgCpuTime) {
        this.avgCpuTime = avgCpuTime;
    }

    public SlowSQLInfoResult withAvgIoTime(String avgIoTime) {
        this.avgIoTime = avgIoTime;
        return this;
    }

    /**
     * **参数解释**: 平均IO耗时（us）。 **取值范围**: 不涉及。
     * @return avgIoTime
     */
    public String getAvgIoTime() {
        return avgIoTime;
    }

    public void setAvgIoTime(String avgIoTime) {
        this.avgIoTime = avgIoTime;
    }

    public SlowSQLInfoResult withAvgReturnedRows(Integer avgReturnedRows) {
        this.avgReturnedRows = avgReturnedRows;
        return this;
    }

    /**
     * **参数解释**: 平均返回行数（行）。 **取值范围**: 不涉及。
     * @return avgReturnedRows
     */
    public Integer getAvgReturnedRows() {
        return avgReturnedRows;
    }

    public void setAvgReturnedRows(Integer avgReturnedRows) {
        this.avgReturnedRows = avgReturnedRows;
    }

    public SlowSQLInfoResult withAvgFetchedRows(Integer avgFetchedRows) {
        this.avgFetchedRows = avgFetchedRows;
        return this;
    }

    /**
     * **参数解释**: 平均扫描行数（行）。 **取值范围**: 不涉及。
     * @return avgFetchedRows
     */
    public Integer getAvgFetchedRows() {
        return avgFetchedRows;
    }

    public void setAvgFetchedRows(Integer avgFetchedRows) {
        this.avgFetchedRows = avgFetchedRows;
    }

    public SlowSQLInfoResult withBufferHitRatio(String bufferHitRatio) {
        this.bufferHitRatio = bufferHitRatio;
        return this;
    }

    /**
     * **参数解释**: buffer命中率。 **取值范围**: 不涉及。
     * @return bufferHitRatio
     */
    public String getBufferHitRatio() {
        return bufferHitRatio;
    }

    public void setBufferHitRatio(String bufferHitRatio) {
        this.bufferHitRatio = bufferHitRatio;
    }

    public SlowSQLInfoResult withSqlHitRatio(String sqlHitRatio) {
        this.sqlHitRatio = sqlHitRatio;
        return this;
    }

    /**
     * **参数解释**: SQL命中率。 **取值范围**: 不涉及。
     * @return sqlHitRatio
     */
    public String getSqlHitRatio() {
        return sqlHitRatio;
    }

    public void setSqlHitRatio(String sqlHitRatio) {
        this.sqlHitRatio = sqlHitRatio;
    }

    public SlowSQLInfoResult withNodeId(String nodeId) {
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

    public SlowSQLInfoResult withNodeName(String nodeName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowSQLInfoResult that = (SlowSQLInfoResult) obj;
        return Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.sql, that.sql) && Objects.equals(this.sqlId, that.sqlId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.sqlText, that.sqlText)
            && Objects.equals(this.queryPlan, that.queryPlan) && Objects.equals(this.calls, that.calls)
            && Objects.equals(this.avgExecTime, that.avgExecTime) && Objects.equals(this.avgCpuTime, that.avgCpuTime)
            && Objects.equals(this.avgIoTime, that.avgIoTime)
            && Objects.equals(this.avgReturnedRows, that.avgReturnedRows)
            && Objects.equals(this.avgFetchedRows, that.avgFetchedRows)
            && Objects.equals(this.bufferHitRatio, that.bufferHitRatio)
            && Objects.equals(this.sqlHitRatio, that.sqlHitRatio) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeName, that.nodeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dbName,
            schemaName,
            sql,
            sqlId,
            userName,
            sqlText,
            queryPlan,
            calls,
            avgExecTime,
            avgCpuTime,
            avgIoTime,
            avgReturnedRows,
            avgFetchedRows,
            bufferHitRatio,
            sqlHitRatio,
            nodeId,
            nodeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowSQLInfoResult {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    sqlText: ").append(toIndentedString(sqlText)).append("\n");
        sb.append("    queryPlan: ").append(toIndentedString(queryPlan)).append("\n");
        sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
        sb.append("    avgExecTime: ").append(toIndentedString(avgExecTime)).append("\n");
        sb.append("    avgCpuTime: ").append(toIndentedString(avgCpuTime)).append("\n");
        sb.append("    avgIoTime: ").append(toIndentedString(avgIoTime)).append("\n");
        sb.append("    avgReturnedRows: ").append(toIndentedString(avgReturnedRows)).append("\n");
        sb.append("    avgFetchedRows: ").append(toIndentedString(avgFetchedRows)).append("\n");
        sb.append("    bufferHitRatio: ").append(toIndentedString(bufferHitRatio)).append("\n");
        sb.append("    sqlHitRatio: ").append(toIndentedString(sqlHitRatio)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
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
