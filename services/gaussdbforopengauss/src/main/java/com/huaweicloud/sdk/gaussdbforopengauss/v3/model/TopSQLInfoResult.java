package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Top SQL信息
 */
public class TopSQLInfoResult {

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
    @JsonProperty(value = "calls_percent")

    private String callsPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_percent")

    private String cpuPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_percent")

    private String ioPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "calls")

    private String calls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "returned_rows")

    private String returnedRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuple_read")

    private String tupleRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_elapse_time")

    private String avgElapseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_elapse_time")

    private String totalElapseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private String cpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_time")

    private String ioTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_elapse_time")

    private String minElapseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_elapse_time")

    private String maxElapseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_hit_ratio")

    private String sqlHitRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    public TopSQLInfoResult withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: Top SQL的归一化SQL ID。 **取值范围**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public TopSQLInfoResult withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: Top SQL的用户名。 **取值范围**: 不涉及。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public TopSQLInfoResult withSqlText(String sqlText) {
        this.sqlText = sqlText;
        return this;
    }

    /**
     * **参数解释**: Top SQL的SQL文本。 **取值范围**: 不涉及。
     * @return sqlText
     */
    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public TopSQLInfoResult withCallsPercent(String callsPercent) {
        this.callsPercent = callsPercent;
        return this;
    }

    /**
     * **参数解释**: Top SQL的调用频率占比（%）。 **取值范围**: 0-100。
     * @return callsPercent
     */
    public String getCallsPercent() {
        return callsPercent;
    }

    public void setCallsPercent(String callsPercent) {
        this.callsPercent = callsPercent;
    }

    public TopSQLInfoResult withCpuPercent(String cpuPercent) {
        this.cpuPercent = cpuPercent;
        return this;
    }

    /**
     * **参数解释**: Top SQL的调用频率占比。 **取值范围**: 0-100。
     * @return cpuPercent
     */
    public String getCpuPercent() {
        return cpuPercent;
    }

    public void setCpuPercent(String cpuPercent) {
        this.cpuPercent = cpuPercent;
    }

    public TopSQLInfoResult withIoPercent(String ioPercent) {
        this.ioPercent = ioPercent;
        return this;
    }

    /**
     * **参数解释**: Top SQL的IO开销占比。 **取值范围**: 0-100。
     * @return ioPercent
     */
    public String getIoPercent() {
        return ioPercent;
    }

    public void setIoPercent(String ioPercent) {
        this.ioPercent = ioPercent;
    }

    public TopSQLInfoResult withCalls(String calls) {
        this.calls = calls;
        return this;
    }

    /**
     * **参数解释** Top SQL的调用次数。 **取值范围** 大于等于0。
     * @return calls
     */
    public String getCalls() {
        return calls;
    }

    public void setCalls(String calls) {
        this.calls = calls;
    }

    public TopSQLInfoResult withReturnedRows(String returnedRows) {
        this.returnedRows = returnedRows;
        return this;
    }

    /**
     * **参数解释** Top SQL的返回元组数。 **取值范围** 大于等于0。
     * @return returnedRows
     */
    public String getReturnedRows() {
        return returnedRows;
    }

    public void setReturnedRows(String returnedRows) {
        this.returnedRows = returnedRows;
    }

    public TopSQLInfoResult withTupleRead(String tupleRead) {
        this.tupleRead = tupleRead;
        return this;
    }

    /**
     * **参数解释** Top SQL的读取元组数。 **取值范围** 大于等于0。
     * @return tupleRead
     */
    public String getTupleRead() {
        return tupleRead;
    }

    public void setTupleRead(String tupleRead) {
        this.tupleRead = tupleRead;
    }

    public TopSQLInfoResult withAvgElapseTime(String avgElapseTime) {
        this.avgElapseTime = avgElapseTime;
        return this;
    }

    /**
     * **参数解释** Top SQL的平均时间开销。单位ms。 **取值范围** 大于等于0。
     * @return avgElapseTime
     */
    public String getAvgElapseTime() {
        return avgElapseTime;
    }

    public void setAvgElapseTime(String avgElapseTime) {
        this.avgElapseTime = avgElapseTime;
    }

    public TopSQLInfoResult withTotalElapseTime(String totalElapseTime) {
        this.totalElapseTime = totalElapseTime;
        return this;
    }

    /**
     * **参数解释** Top SQL的总时间开销。单位ms。 **取值范围** 大于等于0。
     * @return totalElapseTime
     */
    public String getTotalElapseTime() {
        return totalElapseTime;
    }

    public void setTotalElapseTime(String totalElapseTime) {
        this.totalElapseTime = totalElapseTime;
    }

    public TopSQLInfoResult withCpuTime(String cpuTime) {
        this.cpuTime = cpuTime;
        return this;
    }

    /**
     * **参数解释**: Top SQL的CPU开销。单位ms。 **取值范围**: 不涉及。
     * @return cpuTime
     */
    public String getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(String cpuTime) {
        this.cpuTime = cpuTime;
    }

    public TopSQLInfoResult withIoTime(String ioTime) {
        this.ioTime = ioTime;
        return this;
    }

    /**
     * **参数解释**: Top SQL的IO开销。单位ms。 **取值范围**: 不涉及。
     * @return ioTime
     */
    public String getIoTime() {
        return ioTime;
    }

    public void setIoTime(String ioTime) {
        this.ioTime = ioTime;
    }

    public TopSQLInfoResult withMinElapseTime(String minElapseTime) {
        this.minElapseTime = minElapseTime;
        return this;
    }

    /**
     * **参数解释**: Top SQL的最小执行时间。单位ms。 **取值范围**: 不涉及。
     * @return minElapseTime
     */
    public String getMinElapseTime() {
        return minElapseTime;
    }

    public void setMinElapseTime(String minElapseTime) {
        this.minElapseTime = minElapseTime;
    }

    public TopSQLInfoResult withMaxElapseTime(String maxElapseTime) {
        this.maxElapseTime = maxElapseTime;
        return this;
    }

    /**
     * **参数解释**: Top SQL最大执行时间。单位ms。 **取值范围**: 不涉及。
     * @return maxElapseTime
     */
    public String getMaxElapseTime() {
        return maxElapseTime;
    }

    public void setMaxElapseTime(String maxElapseTime) {
        this.maxElapseTime = maxElapseTime;
    }

    public TopSQLInfoResult withSqlHitRatio(String sqlHitRatio) {
        this.sqlHitRatio = sqlHitRatio;
        return this;
    }

    /**
     * **参数解释** Top SQL的SQL命中率。 **取值范围** 大于等于0。
     * @return sqlHitRatio
     */
    public String getSqlHitRatio() {
        return sqlHitRatio;
    }

    public void setSqlHitRatio(String sqlHitRatio) {
        this.sqlHitRatio = sqlHitRatio;
    }

    public TopSQLInfoResult withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**: Top SQL的节点ID。 **取值范围**: 不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TopSQLInfoResult withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * **参数解释**: Top SQL的数据库名（引擎版本8.200及以上支持）。 **取值范围**: 不涉及。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public TopSQLInfoResult withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**: Top SQL的节点名称。 **取值范围**: 不涉及。
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
        TopSQLInfoResult that = (TopSQLInfoResult) obj;
        return Objects.equals(this.sqlId, that.sqlId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.sqlText, that.sqlText) && Objects.equals(this.callsPercent, that.callsPercent)
            && Objects.equals(this.cpuPercent, that.cpuPercent) && Objects.equals(this.ioPercent, that.ioPercent)
            && Objects.equals(this.calls, that.calls) && Objects.equals(this.returnedRows, that.returnedRows)
            && Objects.equals(this.tupleRead, that.tupleRead) && Objects.equals(this.avgElapseTime, that.avgElapseTime)
            && Objects.equals(this.totalElapseTime, that.totalElapseTime) && Objects.equals(this.cpuTime, that.cpuTime)
            && Objects.equals(this.ioTime, that.ioTime) && Objects.equals(this.minElapseTime, that.minElapseTime)
            && Objects.equals(this.maxElapseTime, that.maxElapseTime)
            && Objects.equals(this.sqlHitRatio, that.sqlHitRatio) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.nodeName, that.nodeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlId,
            userName,
            sqlText,
            callsPercent,
            cpuPercent,
            ioPercent,
            calls,
            returnedRows,
            tupleRead,
            avgElapseTime,
            totalElapseTime,
            cpuTime,
            ioTime,
            minElapseTime,
            maxElapseTime,
            sqlHitRatio,
            nodeId,
            dbName,
            nodeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopSQLInfoResult {\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    sqlText: ").append(toIndentedString(sqlText)).append("\n");
        sb.append("    callsPercent: ").append(toIndentedString(callsPercent)).append("\n");
        sb.append("    cpuPercent: ").append(toIndentedString(cpuPercent)).append("\n");
        sb.append("    ioPercent: ").append(toIndentedString(ioPercent)).append("\n");
        sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
        sb.append("    returnedRows: ").append(toIndentedString(returnedRows)).append("\n");
        sb.append("    tupleRead: ").append(toIndentedString(tupleRead)).append("\n");
        sb.append("    avgElapseTime: ").append(toIndentedString(avgElapseTime)).append("\n");
        sb.append("    totalElapseTime: ").append(toIndentedString(totalElapseTime)).append("\n");
        sb.append("    cpuTime: ").append(toIndentedString(cpuTime)).append("\n");
        sb.append("    ioTime: ").append(toIndentedString(ioTime)).append("\n");
        sb.append("    minElapseTime: ").append(toIndentedString(minElapseTime)).append("\n");
        sb.append("    maxElapseTime: ").append(toIndentedString(maxElapseTime)).append("\n");
        sb.append("    sqlHitRatio: ").append(toIndentedString(sqlHitRatio)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
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
