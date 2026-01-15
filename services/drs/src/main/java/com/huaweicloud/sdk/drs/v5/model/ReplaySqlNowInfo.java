package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 正在回放的sql信息
 */
public class ReplaySqlNowInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thread_id")

    private Long threadId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified_at")

    private Long modifiedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shard_id")

    private Long shardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency")

    private Long latency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_latency")

    private Long executeLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_name")

    private String targetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ReplaySqlNowInfo withThreadId(Long threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * 会话id
     * @return threadId
     */
    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public ReplaySqlNowInfo withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public ReplaySqlNowInfo withModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }

    /**
     * 修改时间
     * @return modifiedAt
     */
    public Long getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(Long modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public ReplaySqlNowInfo withShardId(Long shardId) {
        this.shardId = shardId;
        return this;
    }

    /**
     * 分片id
     * @return shardId
     */
    public Long getShardId() {
        return shardId;
    }

    public void setShardId(Long shardId) {
        this.shardId = shardId;
    }

    public ReplaySqlNowInfo withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public ReplaySqlNowInfo withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * sql语句
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public ReplaySqlNowInfo withLatency(Long latency) {
        this.latency = latency;
        return this;
    }

    /**
     * 原始耗时
     * @return latency
     */
    public Long getLatency() {
        return latency;
    }

    public void setLatency(Long latency) {
        this.latency = latency;
    }

    public ReplaySqlNowInfo withExecuteLatency(Long executeLatency) {
        this.executeLatency = executeLatency;
        return this;
    }

    /**
     * 执行耗时
     * @return executeLatency
     */
    public Long getExecuteLatency() {
        return executeLatency;
    }

    public void setExecuteLatency(Long executeLatency) {
        this.executeLatency = executeLatency;
    }

    public ReplaySqlNowInfo withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 目标库类型
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public ReplaySqlNowInfo withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    /**
     * 目标库标识
     * @return targetName
     */
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public ReplaySqlNowInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 回放状态。取值： - running：执行中。 - finish：已完成。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplaySqlNowInfo that = (ReplaySqlNowInfo) obj;
        return Objects.equals(this.threadId, that.threadId) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.modifiedAt, that.modifiedAt) && Objects.equals(this.shardId, that.shardId)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.latency, that.latency) && Objects.equals(this.executeLatency, that.executeLatency)
            && Objects.equals(this.targetType, that.targetType) && Objects.equals(this.targetName, that.targetName)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(threadId,
            createdAt,
            modifiedAt,
            shardId,
            schemaName,
            sqlStatement,
            latency,
            executeLatency,
            targetType,
            targetName,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplaySqlNowInfo {\n");
        sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
        sb.append("    shardId: ").append(toIndentedString(shardId)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
        sb.append("    executeLatency: ").append(toIndentedString(executeLatency)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetName: ").append(toIndentedString(targetName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
