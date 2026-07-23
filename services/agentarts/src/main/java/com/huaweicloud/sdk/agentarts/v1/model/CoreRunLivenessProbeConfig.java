package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**: 探针配置，用于沙箱健康检查探测。
 */
public class CoreRunLivenessProbeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_delay_seconds")

    private Integer initialDelaySeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_seconds")

    private Integer timeoutSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_seconds")

    private Integer periodSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_threshold")

    private Integer successThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_threshold")

    private Integer failureThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_threshold_seconds")

    private Integer failureThresholdSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_delay_milliseconds")

    private Integer initialDelayMilliseconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_milliseconds")

    private Integer timeoutMilliseconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_milliseconds")

    private Integer periodMilliseconds;

    public CoreRunLivenessProbeConfig withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * **参数解释**: 容器启动后多少秒开始探测 
     * minimum: 0
     * maximum: 300
     * @return initialDelaySeconds
     */
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    public CoreRunLivenessProbeConfig withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * **参数解释**: 探测超时时间（秒） 
     * minimum: 0
     * maximum: 300
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public CoreRunLivenessProbeConfig withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * **参数解释**: 探测间隔（秒） 
     * minimum: 1
     * maximum: 300
     * @return periodSeconds
     */
    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public CoreRunLivenessProbeConfig withSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * **参数解释**: 探测连续成功次数阈值 
     * minimum: 1
     * maximum: 100
     * @return successThreshold
     */
    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    public CoreRunLivenessProbeConfig withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * **参数解释**: 探测连续失败次数阈值 
     * minimum: 1
     * maximum: 100
     * @return failureThreshold
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public CoreRunLivenessProbeConfig withFailureThresholdSeconds(Integer failureThresholdSeconds) {
        this.failureThresholdSeconds = failureThresholdSeconds;
        return this;
    }

    /**
     * **参数解释**: 就绪检查连续失败时长阈值（秒） 
     * minimum: 1
     * maximum: 300
     * @return failureThresholdSeconds
     */
    public Integer getFailureThresholdSeconds() {
        return failureThresholdSeconds;
    }

    public void setFailureThresholdSeconds(Integer failureThresholdSeconds) {
        this.failureThresholdSeconds = failureThresholdSeconds;
    }

    public CoreRunLivenessProbeConfig withInitialDelayMilliseconds(Integer initialDelayMilliseconds) {
        this.initialDelayMilliseconds = initialDelayMilliseconds;
        return this;
    }

    /**
     * **参数解释**: 开始探测的延迟检查时间（毫秒） 
     * minimum: 0
     * maximum: 30000
     * @return initialDelayMilliseconds
     */
    public Integer getInitialDelayMilliseconds() {
        return initialDelayMilliseconds;
    }

    public void setInitialDelayMilliseconds(Integer initialDelayMilliseconds) {
        this.initialDelayMilliseconds = initialDelayMilliseconds;
    }

    public CoreRunLivenessProbeConfig withTimeoutMilliseconds(Integer timeoutMilliseconds) {
        this.timeoutMilliseconds = timeoutMilliseconds;
        return this;
    }

    /**
     * **参数解释**: 探测超时时间（毫秒） 
     * minimum: 0
     * maximum: 30000
     * @return timeoutMilliseconds
     */
    public Integer getTimeoutMilliseconds() {
        return timeoutMilliseconds;
    }

    public void setTimeoutMilliseconds(Integer timeoutMilliseconds) {
        this.timeoutMilliseconds = timeoutMilliseconds;
    }

    public CoreRunLivenessProbeConfig withPeriodMilliseconds(Integer periodMilliseconds) {
        this.periodMilliseconds = periodMilliseconds;
        return this;
    }

    /**
     * **参数解释**: 探测间隔（毫秒） 
     * minimum: 1000
     * maximum: 30000
     * @return periodMilliseconds
     */
    public Integer getPeriodMilliseconds() {
        return periodMilliseconds;
    }

    public void setPeriodMilliseconds(Integer periodMilliseconds) {
        this.periodMilliseconds = periodMilliseconds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunLivenessProbeConfig that = (CoreRunLivenessProbeConfig) obj;
        return Objects.equals(this.initialDelaySeconds, that.initialDelaySeconds)
            && Objects.equals(this.timeoutSeconds, that.timeoutSeconds)
            && Objects.equals(this.periodSeconds, that.periodSeconds)
            && Objects.equals(this.successThreshold, that.successThreshold)
            && Objects.equals(this.failureThreshold, that.failureThreshold)
            && Objects.equals(this.failureThresholdSeconds, that.failureThresholdSeconds)
            && Objects.equals(this.initialDelayMilliseconds, that.initialDelayMilliseconds)
            && Objects.equals(this.timeoutMilliseconds, that.timeoutMilliseconds)
            && Objects.equals(this.periodMilliseconds, that.periodMilliseconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(initialDelaySeconds,
            timeoutSeconds,
            periodSeconds,
            successThreshold,
            failureThreshold,
            failureThresholdSeconds,
            initialDelayMilliseconds,
            timeoutMilliseconds,
            periodMilliseconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunLivenessProbeConfig {\n");
        sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
        sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
        sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
        sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
        sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
        sb.append("    failureThresholdSeconds: ").append(toIndentedString(failureThresholdSeconds)).append("\n");
        sb.append("    initialDelayMilliseconds: ").append(toIndentedString(initialDelayMilliseconds)).append("\n");
        sb.append("    timeoutMilliseconds: ").append(toIndentedString(timeoutMilliseconds)).append("\n");
        sb.append("    periodMilliseconds: ").append(toIndentedString(periodMilliseconds)).append("\n");
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
