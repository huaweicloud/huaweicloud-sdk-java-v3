package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DAS指标信息
 */
public class DasMetricInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_index")

    private Integer thresholdIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private Object metrics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_metrics")

    private Object thresholdMetrics;

    public DasMetricInfo withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DasMetricInfo withThresholdIndex(Integer thresholdIndex) {
        this.thresholdIndex = thresholdIndex;
        return this;
    }

    /**
     * 阈值索引
     * @return thresholdIndex
     */
    public Integer getThresholdIndex() {
        return thresholdIndex;
    }

    public void setThresholdIndex(Integer thresholdIndex) {
        this.thresholdIndex = thresholdIndex;
    }

    public DasMetricInfo withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 实例状态
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public DasMetricInfo withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 指标采集时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public DasMetricInfo withMetrics(Object metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * 指标数据
     * @return metrics
     */
    public Object getMetrics() {
        return metrics;
    }

    public void setMetrics(Object metrics) {
        this.metrics = metrics;
    }

    public DasMetricInfo withThresholdMetrics(Object thresholdMetrics) {
        this.thresholdMetrics = thresholdMetrics;
        return this;
    }

    /**
     * 阈值指标数据
     * @return thresholdMetrics
     */
    public Object getThresholdMetrics() {
        return thresholdMetrics;
    }

    public void setThresholdMetrics(Object thresholdMetrics) {
        this.thresholdMetrics = thresholdMetrics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DasMetricInfo that = (DasMetricInfo) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.thresholdIndex, that.thresholdIndex)
            && Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.metrics, that.metrics)
            && Objects.equals(this.thresholdMetrics, that.thresholdMetrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, thresholdIndex, instanceStatus, timestamp, metrics, thresholdMetrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DasMetricInfo {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    thresholdIndex: ").append(toIndentedString(thresholdIndex)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    thresholdMetrics: ").append(toIndentedString(thresholdMetrics)).append("\n");
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
