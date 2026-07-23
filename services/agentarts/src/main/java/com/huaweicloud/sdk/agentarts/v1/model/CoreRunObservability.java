package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 可观测性配置（日志+指标）。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
 */
public class CoreRunObservability {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private CoreRunLogsConfig logs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private CoreRunMetricsObservabilityConfig metrics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracing")

    private CoreRunTracingObservabilityConfig tracing;

    public CoreRunObservability withLogs(CoreRunLogsConfig logs) {
        this.logs = logs;
        return this;
    }

    public CoreRunObservability withLogs(Consumer<CoreRunLogsConfig> logsSetter) {
        if (this.logs == null) {
            this.logs = new CoreRunLogsConfig();
            logsSetter.accept(this.logs);
        }

        return this;
    }

    /**
     * Get logs
     * @return logs
     */
    public CoreRunLogsConfig getLogs() {
        return logs;
    }

    public void setLogs(CoreRunLogsConfig logs) {
        this.logs = logs;
    }

    public CoreRunObservability withMetrics(CoreRunMetricsObservabilityConfig metrics) {
        this.metrics = metrics;
        return this;
    }

    public CoreRunObservability withMetrics(Consumer<CoreRunMetricsObservabilityConfig> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new CoreRunMetricsObservabilityConfig();
            metricsSetter.accept(this.metrics);
        }

        return this;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public CoreRunMetricsObservabilityConfig getMetrics() {
        return metrics;
    }

    public void setMetrics(CoreRunMetricsObservabilityConfig metrics) {
        this.metrics = metrics;
    }

    public CoreRunObservability withTracing(CoreRunTracingObservabilityConfig tracing) {
        this.tracing = tracing;
        return this;
    }

    public CoreRunObservability withTracing(Consumer<CoreRunTracingObservabilityConfig> tracingSetter) {
        if (this.tracing == null) {
            this.tracing = new CoreRunTracingObservabilityConfig();
            tracingSetter.accept(this.tracing);
        }

        return this;
    }

    /**
     * Get tracing
     * @return tracing
     */
    public CoreRunTracingObservabilityConfig getTracing() {
        return tracing;
    }

    public void setTracing(CoreRunTracingObservabilityConfig tracing) {
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
        CoreRunObservability that = (CoreRunObservability) obj;
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
        sb.append("class CoreRunObservability {\n");
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
