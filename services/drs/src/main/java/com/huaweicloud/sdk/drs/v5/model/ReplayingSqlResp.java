package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 正在回放的SQL信息
 */
public class ReplayingSqlResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_statement")

    private String sqlStatement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latency")

    private Integer latency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_latency")

    private Integer executeLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client")

    private String client;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replay_start_time")

    private String replayStartTime;

    public ReplayingSqlResp withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * 库名或shema名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public ReplayingSqlResp withSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
        return this;
    }

    /**
     * SQL语句
     * @return sqlStatement
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    public ReplayingSqlResp withLatency(Integer latency) {
        this.latency = latency;
        return this;
    }

    /**
     * 原始执行耗时
     * @return latency
     */
    public Integer getLatency() {
        return latency;
    }

    public void setLatency(Integer latency) {
        this.latency = latency;
    }

    public ReplayingSqlResp withExecuteLatency(Integer executeLatency) {
        this.executeLatency = executeLatency;
        return this;
    }

    /**
     * 回放执行耗时
     * @return executeLatency
     */
    public Integer getExecuteLatency() {
        return executeLatency;
    }

    public void setExecuteLatency(Integer executeLatency) {
        this.executeLatency = executeLatency;
    }

    public ReplayingSqlResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 执行状态 取值：INIT，RUNNING，FAILED，PAUSE，SUCCESS，FINISHED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ReplayingSqlResp withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * 客户端IP
     * @return client
     */
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public ReplayingSqlResp withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 连接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public ReplayingSqlResp withReplayStartTime(String replayStartTime) {
        this.replayStartTime = replayStartTime;
        return this;
    }

    /**
     * 回放开始时间
     * @return replayStartTime
     */
    public String getReplayStartTime() {
        return replayStartTime;
    }

    public void setReplayStartTime(String replayStartTime) {
        this.replayStartTime = replayStartTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReplayingSqlResp that = (ReplayingSqlResp) obj;
        return Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.sqlStatement, that.sqlStatement)
            && Objects.equals(this.latency, that.latency) && Objects.equals(this.executeLatency, that.executeLatency)
            && Objects.equals(this.status, that.status) && Objects.equals(this.client, that.client)
            && Objects.equals(this.connectionId, that.connectionId)
            && Objects.equals(this.replayStartTime, that.replayStartTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(schemaName, sqlStatement, latency, executeLatency, status, client, connectionId, replayStartTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReplayingSqlResp {\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    sqlStatement: ").append(toIndentedString(sqlStatement)).append("\n");
        sb.append("    latency: ").append(toIndentedString(latency)).append("\n");
        sb.append("    executeLatency: ").append(toIndentedString(executeLatency)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    client: ").append(toIndentedString(client)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    replayStartTime: ").append(toIndentedString(replayStartTime)).append("\n");
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
