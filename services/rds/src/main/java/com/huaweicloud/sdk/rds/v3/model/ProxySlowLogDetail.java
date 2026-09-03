package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据库代理慢日志详情
 */
public class ProxySlowLogDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_ip")

    private String sourceIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc_ip")

    private String descIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reaction_time")

    private String reactionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_time")

    private String logTime;

    public ProxySlowLogDetail withSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }

    /**
     * **参数解释**：  客户端IP。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return sourceIp
     */
    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public ProxySlowLogDetail withDescIp(String descIp) {
        this.descIp = descIp;
        return this;
    }

    /**
     * **参数解释**：  后端数据库IP。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return descIp
     */
    public String getDescIp() {
        return descIp;
    }

    public void setDescIp(String descIp) {
        this.descIp = descIp;
    }

    public ProxySlowLogDetail withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释**：  数据库用户。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public ProxySlowLogDetail withReactionTime(String reactionTime) {
        this.reactionTime = reactionTime;
        return this;
    }

    /**
     * **参数解释**：  响应时长，单位ms。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return reactionTime
     */
    public String getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(String reactionTime) {
        this.reactionTime = reactionTime;
    }

    public ProxySlowLogDetail withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * **参数解释**：  SQL执行跟踪ID。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public ProxySlowLogDetail withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * **参数解释**：  执行语句。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public ProxySlowLogDetail withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：  SQL语句执行开始时间，毫秒级时间戳。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ProxySlowLogDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：  SQL语句执行结束时间，毫秒级时间戳。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ProxySlowLogDetail withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * **参数解释**：  每次查询起始记录ID，用于获取后续数据时在请求中传入。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public ProxySlowLogDetail withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * **参数解释**：  数据库名称。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ProxySlowLogDetail withLogTime(String logTime) {
        this.logTime = logTime;
        return this;
    }

    /**
     * **参数解释**：  日志上报时间，毫秒级时间戳。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return logTime
     */
    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProxySlowLogDetail that = (ProxySlowLogDetail) obj;
        return Objects.equals(this.sourceIp, that.sourceIp) && Objects.equals(this.descIp, that.descIp)
            && Objects.equals(this.user, that.user) && Objects.equals(this.reactionTime, that.reactionTime)
            && Objects.equals(this.traceId, that.traceId) && Objects.equals(this.sql, that.sql)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.lineNum, that.lineNum) && Objects.equals(this.database, that.database)
            && Objects.equals(this.logTime, that.logTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(sourceIp, descIp, user, reactionTime, traceId, sql, startTime, endTime, lineNum, database, logTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxySlowLogDetail {\n");
        sb.append("    sourceIp: ").append(toIndentedString(sourceIp)).append("\n");
        sb.append("    descIp: ").append(toIndentedString(descIp)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    reactionTime: ").append(toIndentedString(reactionTime)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    logTime: ").append(toIndentedString(logTime)).append("\n");
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
