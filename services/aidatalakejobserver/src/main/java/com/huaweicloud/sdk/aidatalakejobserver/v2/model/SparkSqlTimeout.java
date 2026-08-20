package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SparkSql作业超时配置信息，包含排队超时和运行超时时间。 
 */
public class SparkSqlTimeout {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queued_timeout")

    private Integer queuedTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_timeout")

    private Integer runningTimeout;

    public SparkSqlTimeout withQueuedTimeout(Integer queuedTimeout) {
        this.queuedTimeout = queuedTimeout;
        return this;
    }

    /**
     * **参数解释**：作业排队超时时间，单位为分钟。如果超过此时间作业仍未开始运行，则作业会被标记为排队超时并失败。 **取值范围**：10~180分钟。 
     * minimum: 10
     * maximum: 180
     * @return queuedTimeout
     */
    public Integer getQueuedTimeout() {
        return queuedTimeout;
    }

    public void setQueuedTimeout(Integer queuedTimeout) {
        this.queuedTimeout = queuedTimeout;
    }

    public SparkSqlTimeout withRunningTimeout(Integer runningTimeout) {
        this.runningTimeout = runningTimeout;
        return this;
    }

    /**
     * **参数解释**：作业运行超时时间，单位为分钟。如果超过此时间作业仍未运行结束，则作业会被取消并标记为运行超时。 **取值范围**：10~720分钟。 
     * minimum: 10
     * maximum: 720
     * @return runningTimeout
     */
    public Integer getRunningTimeout() {
        return runningTimeout;
    }

    public void setRunningTimeout(Integer runningTimeout) {
        this.runningTimeout = runningTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkSqlTimeout that = (SparkSqlTimeout) obj;
        return Objects.equals(this.queuedTimeout, that.queuedTimeout)
            && Objects.equals(this.runningTimeout, that.runningTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queuedTimeout, runningTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkSqlTimeout {\n");
        sb.append("    queuedTimeout: ").append(toIndentedString(queuedTimeout)).append("\n");
        sb.append("    runningTimeout: ").append(toIndentedString(runningTimeout)).append("\n");
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
