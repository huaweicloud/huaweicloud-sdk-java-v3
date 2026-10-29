package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SparkJob运行实例上资源的指标信息。
 */
public class SparkJobMetricStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_attempt")

    private Integer retryAttempt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_time")

    private Long metricTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cpu")

    private Long currentCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_memory")

    private Long currentMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cu_hours")

    private Double totalCuHours;

    public SparkJobMetricStatistics withRetryAttempt(Integer retryAttempt) {
        this.retryAttempt = retryAttempt;
        return this;
    }

    /**
     * **参数解释**：当前第几次重试，用于区分同一作业不同重试批次的指标 **取值范围**：最小值为1。
     * @return retryAttempt
     */
    public Integer getRetryAttempt() {
        return retryAttempt;
    }

    public void setRetryAttempt(Integer retryAttempt) {
        this.retryAttempt = retryAttempt;
    }

    public SparkJobMetricStatistics withMetricTime(Long metricTime) {
        this.metricTime = metricTime;
        return this;
    }

    /**
     * **参数解释**：指标生成时间。 **取值范围**：unix时间戳，单位为毫秒。
     * @return metricTime
     */
    public Long getMetricTime() {
        return metricTime;
    }

    public void setMetricTime(Long metricTime) {
        this.metricTime = metricTime;
    }

    public SparkJobMetricStatistics withCurrentCpu(Long currentCpu) {
        this.currentCpu = currentCpu;
        return this;
    }

    /**
     * **参数解释**：当前CPU使用量，单位毫核。 **取值范围**：大于等于1000。
     * @return currentCpu
     */
    public Long getCurrentCpu() {
        return currentCpu;
    }

    public void setCurrentCpu(Long currentCpu) {
        this.currentCpu = currentCpu;
    }

    public SparkJobMetricStatistics withCurrentMemory(Long currentMemory) {
        this.currentMemory = currentMemory;
        return this;
    }

    /**
     * **参数解释**：当前内存使用量，单位MB。 **取值范围**：大于等于1024。
     * @return currentMemory
     */
    public Long getCurrentMemory() {
        return currentMemory;
    }

    public void setCurrentMemory(Long currentMemory) {
        this.currentMemory = currentMemory;
    }

    public SparkJobMetricStatistics withTotalCuHours(Double totalCuHours) {
        this.totalCuHours = totalCuHours;
        return this;
    }

    /**
     * **参数解释**：估算 CU 时（折算后的小时数，保留4位小数，如 2.3500）。 **取值范围**：大于等于0。
     * @return totalCuHours
     */
    public Double getTotalCuHours() {
        return totalCuHours;
    }

    public void setTotalCuHours(Double totalCuHours) {
        this.totalCuHours = totalCuHours;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkJobMetricStatistics that = (SparkJobMetricStatistics) obj;
        return Objects.equals(this.retryAttempt, that.retryAttempt) && Objects.equals(this.metricTime, that.metricTime)
            && Objects.equals(this.currentCpu, that.currentCpu)
            && Objects.equals(this.currentMemory, that.currentMemory)
            && Objects.equals(this.totalCuHours, that.totalCuHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retryAttempt, metricTime, currentCpu, currentMemory, totalCuHours);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkJobMetricStatistics {\n");
        sb.append("    retryAttempt: ").append(toIndentedString(retryAttempt)).append("\n");
        sb.append("    metricTime: ").append(toIndentedString(metricTime)).append("\n");
        sb.append("    currentCpu: ").append(toIndentedString(currentCpu)).append("\n");
        sb.append("    currentMemory: ").append(toIndentedString(currentMemory)).append("\n");
        sb.append("    totalCuHours: ").append(toIndentedString(totalCuHours)).append("\n");
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
