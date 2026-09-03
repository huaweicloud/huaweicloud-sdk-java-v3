package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练指标响应体
 */
public class FtMetricData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format_version")

    private String formatVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private String timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<FtMetric> metrics = null;

    public FtMetricData withFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
        return this;
    }

    /**
     * 固定值 \"1.0\"，标识数据格式版本
     * @return formatVersion
     */
    public String getFormatVersion() {
        return formatVersion;
    }

    public void setFormatVersion(String formatVersion) {
        this.formatVersion = formatVersion;
    }

    public FtMetricData withTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 文件生成时间，ISO 8601 格式（如 2026-07-18T10:30:00Z）
     * @return timestamp
     */
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public FtMetricData withMetrics(List<FtMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public FtMetricData addMetricsItem(FtMetric metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public FtMetricData withMetrics(Consumer<List<FtMetric>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public List<FtMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<FtMetric> metrics) {
        this.metrics = metrics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FtMetricData that = (FtMetricData) obj;
        return Objects.equals(this.formatVersion, that.formatVersion) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.metrics, that.metrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formatVersion, timestamp, metrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FtMetricData {\n");
        sb.append("    formatVersion: ").append(toIndentedString(formatVersion)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
