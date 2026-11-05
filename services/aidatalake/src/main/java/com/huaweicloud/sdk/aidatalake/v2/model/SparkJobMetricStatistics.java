package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SparkJob运行实例上资源的指标信息。
 */
public class SparkJobMetricStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_cpu")

    private Long currentCpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_memory")

    private Long currentMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cu_seconds")

    private Long totalCuSeconds;

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

    public SparkJobMetricStatistics withTotalCuSeconds(Long totalCuSeconds) {
        this.totalCuSeconds = totalCuSeconds;
        return this;
    }

    /**
     * **参数解释**：估算 CU 秒（折算后的秒数，四舍五入取整，如 262）。
     * @return totalCuSeconds
     */
    public Long getTotalCuSeconds() {
        return totalCuSeconds;
    }

    public void setTotalCuSeconds(Long totalCuSeconds) {
        this.totalCuSeconds = totalCuSeconds;
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
        return Objects.equals(this.currentCpu, that.currentCpu)
            && Objects.equals(this.currentMemory, that.currentMemory)
            && Objects.equals(this.totalCuSeconds, that.totalCuSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentCpu, currentMemory, totalCuSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkJobMetricStatistics {\n");
        sb.append("    currentCpu: ").append(toIndentedString(currentCpu)).append("\n");
        sb.append("    currentMemory: ").append(toIndentedString(currentMemory)).append("\n");
        sb.append("    totalCuSeconds: ").append(toIndentedString(totalCuSeconds)).append("\n");
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
