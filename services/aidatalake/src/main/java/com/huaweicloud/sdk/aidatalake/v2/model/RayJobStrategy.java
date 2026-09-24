package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：Ray Job提交策略。 **约束限制**：不涉及。
 */
public class RayJobStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queued_timeout")

    private Integer queuedTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_timeout")

    private Integer runningTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retry")

    private Integer maxRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_delay")

    private Integer retryDelay;

    public RayJobStrategy withQueuedTimeout(Integer queuedTimeout) {
        this.queuedTimeout = queuedTimeout;
        return this;
    }

    /**
     * 作业提交超时时间，如果超过此时间作业仍未运行，则作业失败。默认作业提交超时时间为3小时，最大值为1天，最小值为10分钟。单位：分钟。取值范围为10~1440，单位为分钟。
     * minimum: 10
     * maximum: 1440
     * @return queuedTimeout
     */
    public Integer getQueuedTimeout() {
        return queuedTimeout;
    }

    public void setQueuedTimeout(Integer queuedTimeout) {
        this.queuedTimeout = queuedTimeout;
    }

    public RayJobStrategy withRunningTimeout(Integer runningTimeout) {
        this.runningTimeout = runningTimeout;
        return this;
    }

    /**
     * 作业运行超时时间，如果超过此时间作业还未运行结束，则作业会取消运行，并标记失败。默认值为-1，表示没有配置作业运行超时时间。最小时间为10分钟，最大时间为7天。单位：分钟。取值范围为-1~10080（-1表示不配置超时），单位为分钟。
     * minimum: -1
     * maximum: 10080
     * @return runningTimeout
     */
    public Integer getRunningTimeout() {
        return runningTimeout;
    }

    public void setRunningTimeout(Integer runningTimeout) {
        this.runningTimeout = runningTimeout;
    }

    public RayJobStrategy withMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
        return this;
    }

    /**
     * **参数解释**：最大重试次数，用于控制作业失败后的自动重试次数。如果配置的值大于0，则自动开启失败重试；如果不配置或者配置为0，则不开启作业失败重试。 **约束限制**：不涉及。 **取值范围**：0~65535。 **默认取值**：0。
     * @return maxRetry
     */
    public Integer getMaxRetry() {
        return maxRetry;
    }

    public void setMaxRetry(Integer maxRetry) {
        this.maxRetry = maxRetry;
    }

    public RayJobStrategy withRetryDelay(Integer retryDelay) {
        this.retryDelay = retryDelay;
        return this;
    }

    /**
     * **参数解释**：重试间隔时间，用于指定作业失败重试机制中每次重试的时间间隔，单位为秒。 **约束限制**：不涉及。 **取值范围**：1~3600。 **默认取值**：30。
     * @return retryDelay
     */
    public Integer getRetryDelay() {
        return retryDelay;
    }

    public void setRetryDelay(Integer retryDelay) {
        this.retryDelay = retryDelay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RayJobStrategy that = (RayJobStrategy) obj;
        return Objects.equals(this.queuedTimeout, that.queuedTimeout)
            && Objects.equals(this.runningTimeout, that.runningTimeout) && Objects.equals(this.maxRetry, that.maxRetry)
            && Objects.equals(this.retryDelay, that.retryDelay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queuedTimeout, runningTimeout, maxRetry, retryDelay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayJobStrategy {\n");
        sb.append("    queuedTimeout: ").append(toIndentedString(queuedTimeout)).append("\n");
        sb.append("    runningTimeout: ").append(toIndentedString(runningTimeout)).append("\n");
        sb.append("    maxRetry: ").append(toIndentedString(maxRetry)).append("\n");
        sb.append("    retryDelay: ").append(toIndentedString(retryDelay)).append("\n");
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
