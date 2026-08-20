package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：作业恢复策略配置，用于定义作业失败后的重试机制和超时控制。 **约束限制**：不涉及。 
 */
public class SparkRestoreStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retry")

    private Integer maxRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_delay")

    private Integer retryDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queued_timeout")

    private Integer queuedTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_timeout")

    private Integer runningTimeout;

    public SparkRestoreStrategy withMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
        return this;
    }

    /**
     * **参数解释**：最大重试次数，用于控制作业失败后的自动重试次数。如果配置的值大于0，则自动开启失败重试；如果不配置或者配置为0，则不开启作业失败重试。 **约束限制**：不涉及。 **取值范围**：0~65535。 **默认取值**：0。 
     * minimum: 0
     * maximum: 65535
     * @return maxRetry
     */
    public Integer getMaxRetry() {
        return maxRetry;
    }

    public void setMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
    }

    public SparkRestoreStrategy withRetryDelay(Integer retryDelay) {
        this.retryDelay = retryDelay;
        return this;
    }

    /**
     * **参数解释**：重试间隔时间，用于指定作业失败重试机制中每次重试的时间间隔，单位为秒。 **约束限制**：不涉及。 **取值范围**：1~3600。 **默认取值**：30。 
     * minimum: 1
     * maximum: 3600
     * @return retryDelay
     */
    public Integer getRetryDelay() {
        return retryDelay;
    }

    public void setRetryDelay(Integer retryDelay) {
        this.retryDelay = retryDelay;
    }

    public SparkRestoreStrategy withQueuedTimeout(Integer queuedTimeout) {
        this.queuedTimeout = queuedTimeout;
        return this;
    }

    /**
     * **参数解释**：排队超时时间，用于指定作业提交后等待运行的最长时间，单位为分钟。如果超过此时间作业仍未运行，则作业失败。 **约束限制**：不涉及。 **取值范围**：10~180。 **默认取值**：180。 
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

    public SparkRestoreStrategy withRunningTimeout(Integer runningTimeout) {
        this.runningTimeout = runningTimeout;
        return this;
    }

    /**
     * **参数解释**：运行超时时间，用于指定作业运行的最大时长，单位为分钟。如果超过此时间作业还未运行结束，则作业会取消运行并标记为运行超时。 **约束限制**：不涉及。 **取值范围**：10~525600。 **默认取值**：不涉及。 
     * minimum: 10
     * maximum: 525600
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
        SparkRestoreStrategy that = (SparkRestoreStrategy) obj;
        return Objects.equals(this.maxRetry, that.maxRetry) && Objects.equals(this.retryDelay, that.retryDelay)
            && Objects.equals(this.queuedTimeout, that.queuedTimeout)
            && Objects.equals(this.runningTimeout, that.runningTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxRetry, retryDelay, queuedTimeout, runningTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkRestoreStrategy {\n");
        sb.append("    maxRetry: ").append(toIndentedString(maxRetry)).append("\n");
        sb.append("    retryDelay: ").append(toIndentedString(retryDelay)).append("\n");
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
