package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TelemetryConfig
 */
public class TelemetryConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private Metric metrics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessLogging")

    private AccessLogging accessLogging;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tracing")

    private Tracing tracing;

    public TelemetryConfig withMetrics(Metric metrics) {
        this.metrics = metrics;
        return this;
    }

    public TelemetryConfig withMetrics(Consumer<Metric> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new Metric();
            metricsSetter.accept(this.metrics);
        }

        return this;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public Metric getMetrics() {
        return metrics;
    }

    public void setMetrics(Metric metrics) {
        this.metrics = metrics;
    }

    public TelemetryConfig withAccessLogging(AccessLogging accessLogging) {
        this.accessLogging = accessLogging;
        return this;
    }

    public TelemetryConfig withAccessLogging(Consumer<AccessLogging> accessLoggingSetter) {
        if (this.accessLogging == null) {
            this.accessLogging = new AccessLogging();
            accessLoggingSetter.accept(this.accessLogging);
        }

        return this;
    }

    /**
     * Get accessLogging
     * @return accessLogging
     */
    public AccessLogging getAccessLogging() {
        return accessLogging;
    }

    public void setAccessLogging(AccessLogging accessLogging) {
        this.accessLogging = accessLogging;
    }

    public TelemetryConfig withTracing(Tracing tracing) {
        this.tracing = tracing;
        return this;
    }

    public TelemetryConfig withTracing(Consumer<Tracing> tracingSetter) {
        if (this.tracing == null) {
            this.tracing = new Tracing();
            tracingSetter.accept(this.tracing);
        }

        return this;
    }

    /**
     * Get tracing
     * @return tracing
     */
    public Tracing getTracing() {
        return tracing;
    }

    public void setTracing(Tracing tracing) {
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
        TelemetryConfig that = (TelemetryConfig) obj;
        return Objects.equals(this.metrics, that.metrics) && Objects.equals(this.accessLogging, that.accessLogging)
            && Objects.equals(this.tracing, that.tracing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metrics, accessLogging, tracing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TelemetryConfig {\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    accessLogging: ").append(toIndentedString(accessLogging)).append("\n");
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
