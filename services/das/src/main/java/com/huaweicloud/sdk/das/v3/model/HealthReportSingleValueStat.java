package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HealthReportSingleValueStat
 */
public class HealthReportSingleValueStat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private String metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private Double value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    private Double maxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normalized")

    private Double normalized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private String stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    public HealthReportSingleValueStat withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * 指标名。
     * @return metric
     */
    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public HealthReportSingleValueStat withValue(Double value) {
        this.value = value;
        return this;
    }

    /**
     * 数值。
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public HealthReportSingleValueStat withMaxValue(Double maxValue) {
        this.maxValue = maxValue;
        return this;
    }

    /**
     * 最大值。
     * @return maxValue
     */
    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public HealthReportSingleValueStat withNormalized(Double normalized) {
        this.normalized = normalized;
        return this;
    }

    /**
     * 归一化值。
     * @return normalized
     */
    public Double getNormalized() {
        return normalized;
    }

    public void setNormalized(Double normalized) {
        this.normalized = normalized;
    }

    public HealthReportSingleValueStat withStage(String stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 当前状态。
     * @return stage
     */
    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public HealthReportSingleValueStat withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 指标采集时间。
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportSingleValueStat that = (HealthReportSingleValueStat) obj;
        return Objects.equals(this.metric, that.metric) && Objects.equals(this.value, that.value)
            && Objects.equals(this.maxValue, that.maxValue) && Objects.equals(this.normalized, that.normalized)
            && Objects.equals(this.stage, that.stage) && Objects.equals(this.timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, value, maxValue, normalized, stage, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportSingleValueStat {\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    normalized: ").append(toIndentedString(normalized)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
