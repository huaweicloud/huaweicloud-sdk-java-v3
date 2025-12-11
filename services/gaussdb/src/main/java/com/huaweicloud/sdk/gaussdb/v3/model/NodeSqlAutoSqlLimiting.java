package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NodeSqlAutoSqlLimiting
 */
public class NodeSqlAutoSqlLimiting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage")

    private Integer cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_sessions")

    private Integer activeSessions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clear_time")

    private Integer clearTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_concurrency")

    private Integer maxConcurrency;

    public NodeSqlAutoSqlLimiting withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**：  节点ID。  **取值范围**：  只能由英文字母、数字组成，前面为UUID，后缀为no07，长度为36个字符。  **默认取值**：  不涉及。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NodeSqlAutoSqlLimiting withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：  自治限流规则每天生效开始时间。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public NodeSqlAutoSqlLimiting withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：  自治限流规则每天生效开始时间。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public NodeSqlAutoSqlLimiting withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * **参数解释**：  限流策略CPU利用率和活跃会话数的关联关系。  **取值范围**：    - and：且。   - or：或。  **默认取值**：  不涉及。
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public NodeSqlAutoSqlLimiting withCpuUsage(Integer cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * **参数解释**：  限流策略CPU利用率。  **约束限制**：  不涉及。  **取值范围**：  [70~100]。  **默认取值**：  不涉及。
     * @return cpuUsage
     */
    public Integer getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Integer cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public NodeSqlAutoSqlLimiting withActiveSessions(Integer activeSessions) {
        this.activeSessions = activeSessions;
        return this;
    }

    /**
     * **参数解释**：  限流策略活跃会话数。  **约束限制**：  不涉及。  **取值范围**：  [1~5000]。  **默认取值**：  不涉及。
     * @return activeSessions
     */
    public Integer getActiveSessions() {
        return activeSessions;
    }

    public void setActiveSessions(Integer activeSessions) {
        this.activeSessions = activeSessions;
    }

    public NodeSqlAutoSqlLimiting withClearTime(Integer clearTime) {
        this.clearTime = clearTime;
        return this;
    }

    /**
     * **参数解释**：  每次最大限流时长（分钟）。  **取值范围**：  [1~1440]。  **默认取值**：  不涉及。
     * @return clearTime
     */
    public Integer getClearTime() {
        return clearTime;
    }

    public void setClearTime(Integer clearTime) {
        this.clearTime = clearTime;
    }

    public NodeSqlAutoSqlLimiting withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**：  限流策略满足限流条件的事件持续时间（分钟）。  **取值范围**：  [2~60]。  **默认取值**：  不涉及。
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public NodeSqlAutoSqlLimiting withMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * **参数解释**：  最大并发数。  **取值范围**：  [0~1000000000]。  **默认取值**：  不涉及。
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return maxConcurrency;
    }

    public void setMaxConcurrency(Integer maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSqlAutoSqlLimiting that = (NodeSqlAutoSqlLimiting) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.condition, that.condition)
            && Objects.equals(this.cpuUsage, that.cpuUsage) && Objects.equals(this.activeSessions, that.activeSessions)
            && Objects.equals(this.clearTime, that.clearTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.maxConcurrency, that.maxConcurrency);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(nodeId, startTime, endTime, condition, cpuUsage, activeSessions, clearTime, duration, maxConcurrency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSqlAutoSqlLimiting {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    activeSessions: ").append(toIndentedString(activeSessions)).append("\n");
        sb.append("    clearTime: ").append(toIndentedString(clearTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    maxConcurrency: ").append(toIndentedString(maxConcurrency)).append("\n");
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
