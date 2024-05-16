package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SlowSqlStatistics
 */
public class SlowSqlStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_count")

    private Long executeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_execute_time")

    private Double avgExecuteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_execute_time")

    private Double maxExecuteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_lock_wait_time")

    private Double avgLockWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_lock_wait_time")

    private Double maxLockWaitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_sent")

    private Double avgRowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows_sent")

    private Double maxRowsSent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_rows_examined")

    private Double avgRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_rows_examined")

    private Double maxRowsExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_key_examined")

    private Double avgKeyExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_key_examined")

    private Double maxKeyExamined;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_type")

    private String sqlType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection")

    private String collection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    private String client;

    public SlowSqlStatistics withExecuteCount(Long executeCount) {
        this.executeCount = executeCount;
        return this;
    }

    /**
     * 执行次数。
     * @return executeCount
     */
    public Long getExecuteCount() {
        return executeCount;
    }

    public void setExecuteCount(Long executeCount) {
        this.executeCount = executeCount;
    }

    public SlowSqlStatistics withAvgExecuteTime(Double avgExecuteTime) {
        this.avgExecuteTime = avgExecuteTime;
        return this;
    }

    /**
     * 平均执行耗时(s)。
     * @return avgExecuteTime
     */
    public Double getAvgExecuteTime() {
        return avgExecuteTime;
    }

    public void setAvgExecuteTime(Double avgExecuteTime) {
        this.avgExecuteTime = avgExecuteTime;
    }

    public SlowSqlStatistics withMaxExecuteTime(Double maxExecuteTime) {
        this.maxExecuteTime = maxExecuteTime;
        return this;
    }

    /**
     * 最大执行耗时(s)。
     * @return maxExecuteTime
     */
    public Double getMaxExecuteTime() {
        return maxExecuteTime;
    }

    public void setMaxExecuteTime(Double maxExecuteTime) {
        this.maxExecuteTime = maxExecuteTime;
    }

    public SlowSqlStatistics withAvgLockWaitTime(Double avgLockWaitTime) {
        this.avgLockWaitTime = avgLockWaitTime;
        return this;
    }

    /**
     * 平均锁等待时间(s)。
     * @return avgLockWaitTime
     */
    public Double getAvgLockWaitTime() {
        return avgLockWaitTime;
    }

    public void setAvgLockWaitTime(Double avgLockWaitTime) {
        this.avgLockWaitTime = avgLockWaitTime;
    }

    public SlowSqlStatistics withMaxLockWaitTime(Double maxLockWaitTime) {
        this.maxLockWaitTime = maxLockWaitTime;
        return this;
    }

    /**
     * 最大锁等待时间(s)。
     * @return maxLockWaitTime
     */
    public Double getMaxLockWaitTime() {
        return maxLockWaitTime;
    }

    public void setMaxLockWaitTime(Double maxLockWaitTime) {
        this.maxLockWaitTime = maxLockWaitTime;
    }

    public SlowSqlStatistics withAvgRowsSent(Double avgRowsSent) {
        this.avgRowsSent = avgRowsSent;
        return this;
    }

    /**
     * 平均返回文档数。
     * @return avgRowsSent
     */
    public Double getAvgRowsSent() {
        return avgRowsSent;
    }

    public void setAvgRowsSent(Double avgRowsSent) {
        this.avgRowsSent = avgRowsSent;
    }

    public SlowSqlStatistics withMaxRowsSent(Double maxRowsSent) {
        this.maxRowsSent = maxRowsSent;
        return this;
    }

    /**
     * 最大返回文档数。
     * @return maxRowsSent
     */
    public Double getMaxRowsSent() {
        return maxRowsSent;
    }

    public void setMaxRowsSent(Double maxRowsSent) {
        this.maxRowsSent = maxRowsSent;
    }

    public SlowSqlStatistics withAvgRowsExamined(Double avgRowsExamined) {
        this.avgRowsExamined = avgRowsExamined;
        return this;
    }

    /**
     * 平均扫描文档数。
     * @return avgRowsExamined
     */
    public Double getAvgRowsExamined() {
        return avgRowsExamined;
    }

    public void setAvgRowsExamined(Double avgRowsExamined) {
        this.avgRowsExamined = avgRowsExamined;
    }

    public SlowSqlStatistics withMaxRowsExamined(Double maxRowsExamined) {
        this.maxRowsExamined = maxRowsExamined;
        return this;
    }

    /**
     * 最大扫描文档数。
     * @return maxRowsExamined
     */
    public Double getMaxRowsExamined() {
        return maxRowsExamined;
    }

    public void setMaxRowsExamined(Double maxRowsExamined) {
        this.maxRowsExamined = maxRowsExamined;
    }

    public SlowSqlStatistics withAvgKeyExamined(Double avgKeyExamined) {
        this.avgKeyExamined = avgKeyExamined;
        return this;
    }

    /**
     * 平均扫描索引数。
     * @return avgKeyExamined
     */
    public Double getAvgKeyExamined() {
        return avgKeyExamined;
    }

    public void setAvgKeyExamined(Double avgKeyExamined) {
        this.avgKeyExamined = avgKeyExamined;
    }

    public SlowSqlStatistics withMaxKeyExamined(Double maxKeyExamined) {
        this.maxKeyExamined = maxKeyExamined;
        return this;
    }

    /**
     * 最大扫描索引数。
     * @return maxKeyExamined
     */
    public Double getMaxKeyExamined() {
        return maxKeyExamined;
    }

    public void setMaxKeyExamined(Double maxKeyExamined) {
        this.maxKeyExamined = maxKeyExamined;
    }

    public SlowSqlStatistics withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，按node_id统计时赋值。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SlowSqlStatistics withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称，按node_id统计时赋值。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public SlowSqlStatistics withSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }

    /**
     * 语句类型，按sql_type统计时赋值。
     * @return sqlType
     */
    public String getSqlType() {
        return sqlType;
    }

    public void setSqlType(String sqlType) {
        this.sqlType = sqlType;
    }

    public SlowSqlStatistics withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * 库名，按db_name、collection统计时赋值。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public SlowSqlStatistics withCollection(String collection) {
        this.collection = collection;
        return this;
    }

    /**
     * 数据库表，按collection统计时赋值。
     * @return collection
     */
    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public SlowSqlStatistics withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户名，按user统计时赋值。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public SlowSqlStatistics withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * 客户端，按client统计时赋值。
     * @return client
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SlowSqlStatistics that = (SlowSqlStatistics) obj;
        return Objects.equals(this.executeCount, that.executeCount)
            && Objects.equals(this.avgExecuteTime, that.avgExecuteTime)
            && Objects.equals(this.maxExecuteTime, that.maxExecuteTime)
            && Objects.equals(this.avgLockWaitTime, that.avgLockWaitTime)
            && Objects.equals(this.maxLockWaitTime, that.maxLockWaitTime)
            && Objects.equals(this.avgRowsSent, that.avgRowsSent) && Objects.equals(this.maxRowsSent, that.maxRowsSent)
            && Objects.equals(this.avgRowsExamined, that.avgRowsExamined)
            && Objects.equals(this.maxRowsExamined, that.maxRowsExamined)
            && Objects.equals(this.avgKeyExamined, that.avgKeyExamined)
            && Objects.equals(this.maxKeyExamined, that.maxKeyExamined) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.sqlType, that.sqlType)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.collection, that.collection)
            && Objects.equals(this.user, that.user) && Objects.equals(this.client, that.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(executeCount,
            avgExecuteTime,
            maxExecuteTime,
            avgLockWaitTime,
            maxLockWaitTime,
            avgRowsSent,
            maxRowsSent,
            avgRowsExamined,
            maxRowsExamined,
            avgKeyExamined,
            maxKeyExamined,
            nodeId,
            nodeName,
            sqlType,
            dbName,
            collection,
            user,
            client);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlowSqlStatistics {\n");
        sb.append("    executeCount: ").append(toIndentedString(executeCount)).append("\n");
        sb.append("    avgExecuteTime: ").append(toIndentedString(avgExecuteTime)).append("\n");
        sb.append("    maxExecuteTime: ").append(toIndentedString(maxExecuteTime)).append("\n");
        sb.append("    avgLockWaitTime: ").append(toIndentedString(avgLockWaitTime)).append("\n");
        sb.append("    maxLockWaitTime: ").append(toIndentedString(maxLockWaitTime)).append("\n");
        sb.append("    avgRowsSent: ").append(toIndentedString(avgRowsSent)).append("\n");
        sb.append("    maxRowsSent: ").append(toIndentedString(maxRowsSent)).append("\n");
        sb.append("    avgRowsExamined: ").append(toIndentedString(avgRowsExamined)).append("\n");
        sb.append("    maxRowsExamined: ").append(toIndentedString(maxRowsExamined)).append("\n");
        sb.append("    avgKeyExamined: ").append(toIndentedString(avgKeyExamined)).append("\n");
        sb.append("    maxKeyExamined: ").append(toIndentedString(maxKeyExamined)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    sqlType: ").append(toIndentedString(sqlType)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
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
