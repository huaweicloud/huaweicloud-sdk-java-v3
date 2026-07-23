package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 可观测性配置（日志+指标）。
 */
public class CoreToolsObservability {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private CoreToolsLogsConfig logs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private CoreToolsMetricsObservabilityConfig metrics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracing")

    private CoreToolsTracingObservabilityConfig tracing;

    public CoreToolsObservability withLogs(CoreToolsLogsConfig logs) {
        this.logs = logs;
        return this;
    }

    public CoreToolsObservability withLogs(Consumer<CoreToolsLogsConfig> logsSetter) {
        if (this.logs == null) {
            this.logs = new CoreToolsLogsConfig();
            logsSetter.accept(this.logs);
        }

        return this;
    }

    /**
     * Get logs
     * @return logs
     */
    public CoreToolsLogsConfig getLogs() {
        return logs;
    }

    public void setLogs(CoreToolsLogsConfig logs) {
        this.logs = logs;
    }

    public CoreToolsObservability withMetrics(CoreToolsMetricsObservabilityConfig metrics) {
        this.metrics = metrics;
        return this;
    }

    public CoreToolsObservability withMetrics(Consumer<CoreToolsMetricsObservabilityConfig> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new CoreToolsMetricsObservabilityConfig();
            metricsSetter.accept(this.metrics);
        }

        return this;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public CoreToolsMetricsObservabilityConfig getMetrics() {
        return metrics;
    }

    public void setMetrics(CoreToolsMetricsObservabilityConfig metrics) {
        this.metrics = metrics;
    }

    public CoreToolsObservability withTracing(CoreToolsTracingObservabilityConfig tracing) {
        this.tracing = tracing;
        return this;
    }

    public CoreToolsObservability withTracing(Consumer<CoreToolsTracingObservabilityConfig> tracingSetter) {
        if (this.tracing == null) {
            this.tracing = new CoreToolsTracingObservabilityConfig();
            tracingSetter.accept(this.tracing);
        }

        return this;
    }

    /**
     * Get tracing
     * @return tracing
     */
    public CoreToolsTracingObservabilityConfig getTracing() {
        return tracing;
    }

    public void setTracing(CoreToolsTracingObservabilityConfig tracing) {
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
        CoreToolsObservability that = (CoreToolsObservability) obj;
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
        sb.append("class CoreToolsObservability {\n");
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
