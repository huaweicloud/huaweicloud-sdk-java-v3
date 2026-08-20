package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：运行及恢复策略配置，包含重试次数、超时时间等信息。 
 */
public class ShowSparkRestoreStrategyResponse {

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

    public ShowSparkRestoreStrategyResponse withMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
        return this;
    }

    /**
     * **参数解释**：最大重试次数，用于控制作业失败后的自动重试。 **取值范围**：大于0表示开启失败重试，0表示不开启重试。 
     * @return maxRetry
     */
    public Integer getMaxRetry() {
        return maxRetry;
    }

    public void setMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
    }

    public ShowSparkRestoreStrategyResponse withRetryDelay(Integer retryDelay) {
        this.retryDelay = retryDelay;
        return this;
    }

    /**
     * **参数解释**：重试间隔时间，用于指定每次重试之间的等待时间。 **取值范围**：单位为秒，默认值为30秒。 
     * @return retryDelay
     */
    public Integer getRetryDelay() {
        return retryDelay;
    }

    public void setRetryDelay(Integer retryDelay) {
        this.retryDelay = retryDelay;
    }

    public ShowSparkRestoreStrategyResponse withQueuedTimeout(Integer queuedTimeout) {
        this.queuedTimeout = queuedTimeout;
        return this;
    }

    /**
     * **参数解释**：排队超时时间，用于指定作业提交后的最大等待时间。 **取值范围**：单位为分钟，默认值为180分钟，最小值为10分钟，最大值180分钟。超过此时间作业仍未运行则作业失败。 
     * @return queuedTimeout
     */
    public Integer getQueuedTimeout() {
        return queuedTimeout;
    }

    public void setQueuedTimeout(Integer queuedTimeout) {
        this.queuedTimeout = queuedTimeout;
    }

    public ShowSparkRestoreStrategyResponse withRunningTimeout(Integer runningTimeout) {
        this.runningTimeout = runningTimeout;
        return this;
    }

    /**
     * **参数解释**：运行超时时间，用于指定作业运行的最大时长。 **取值范围**：单位为分钟，默认值为-1（表示不限制），最小值为10分钟，最大值为525600分钟（10年）。超过此时间作业未结束则作业会取消运行并标记失败。 
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
        ShowSparkRestoreStrategyResponse that = (ShowSparkRestoreStrategyResponse) obj;
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
        sb.append("class ShowSparkRestoreStrategyResponse {\n");
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
