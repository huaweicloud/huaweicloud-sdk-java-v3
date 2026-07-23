package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 可观测性配置（日志+指标）。 
 */
public class CoreRunObservabilityResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private CoreRunLogsConfigResp logs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private CoreRunMetricsObservabilityConfigResp metrics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracing")

    private CoreRunTracingObservabilityConfigResp tracing;

    public CoreRunObservabilityResp withLogs(CoreRunLogsConfigResp logs) {
        this.logs = logs;
        return this;
    }

    public CoreRunObservabilityResp withLogs(Consumer<CoreRunLogsConfigResp> logsSetter) {
        if (this.logs == null) {
            this.logs = new CoreRunLogsConfigResp();
            logsSetter.accept(this.logs);
        }

        return this;
    }

    /**
     * Get logs
     * @return logs
     */
    public CoreRunLogsConfigResp getLogs() {
        return logs;
    }

    public void setLogs(CoreRunLogsConfigResp logs) {
        this.logs = logs;
    }

    public CoreRunObservabilityResp withMetrics(CoreRunMetricsObservabilityConfigResp metrics) {
        this.metrics = metrics;
        return this;
    }

    public CoreRunObservabilityResp withMetrics(Consumer<CoreRunMetricsObservabilityConfigResp> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new CoreRunMetricsObservabilityConfigResp();
            metricsSetter.accept(this.metrics);
        }

        return this;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public CoreRunMetricsObservabilityConfigResp getMetrics() {
        return metrics;
    }

    public void setMetrics(CoreRunMetricsObservabilityConfigResp metrics) {
        this.metrics = metrics;
    }

    public CoreRunObservabilityResp withTracing(CoreRunTracingObservabilityConfigResp tracing) {
        this.tracing = tracing;
        return this;
    }

    public CoreRunObservabilityResp withTracing(Consumer<CoreRunTracingObservabilityConfigResp> tracingSetter) {
        if (this.tracing == null) {
            this.tracing = new CoreRunTracingObservabilityConfigResp();
            tracingSetter.accept(this.tracing);
        }

        return this;
    }

    /**
     * Get tracing
     * @return tracing
     */
    public CoreRunTracingObservabilityConfigResp getTracing() {
        return tracing;
    }

    public void setTracing(CoreRunTracingObservabilityConfigResp tracing) {
        this.tracing = tracing;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreRunObservabilityResp that = (CoreRunObservabilityResp) obj;
        return Objects.equals(this.logs, that.logs) && Objects.equals(this.metrics, that.metrics)
            && Objects.equals(this.tracing, that.tracing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logs, metrics, tracing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreRunObservabilityResp {\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    tracing: ").append(toIndentedString(tracing)).append("\n");
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
