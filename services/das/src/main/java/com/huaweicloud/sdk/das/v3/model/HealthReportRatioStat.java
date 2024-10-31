package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HealthReportRatioStat
 */
public class HealthReportRatioStat {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private String metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_value")

    private Double maxValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_ratio")

    private Double criticalRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium_ratio")

    private Double mediumRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "light_ratio")

    private Double lightRatio;

    public HealthReportRatioStat withMetric(String metric) {
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

    public HealthReportRatioStat withMaxValue(Double maxValue) {
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

    public HealthReportRatioStat withCriticalRatio(Double criticalRatio) {
        this.criticalRatio = criticalRatio;
        return this;
    }

    /**
     * 高水位占比。
     * @return criticalRatio
     */
    public Double getCriticalRatio() {
        return criticalRatio;
    }

    public void setCriticalRatio(Double criticalRatio) {
        this.criticalRatio = criticalRatio;
    }

    public HealthReportRatioStat withMediumRatio(Double mediumRatio) {
        this.mediumRatio = mediumRatio;
        return this;
    }

    /**
     * 中水位占比。
     * @return mediumRatio
     */
    public Double getMediumRatio() {
        return mediumRatio;
    }

    public void setMediumRatio(Double mediumRatio) {
        this.mediumRatio = mediumRatio;
    }

    public HealthReportRatioStat withLightRatio(Double lightRatio) {
        this.lightRatio = lightRatio;
        return this;
    }

    /**
     * 低水位占比。
     * @return lightRatio
     */
    public Double getLightRatio() {
        return lightRatio;
    }

    public void setLightRatio(Double lightRatio) {
        this.lightRatio = lightRatio;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportRatioStat that = (HealthReportRatioStat) obj;
        return Objects.equals(this.metric, that.metric) && Objects.equals(this.maxValue, that.maxValue)
            && Objects.equals(this.criticalRatio, that.criticalRatio)
            && Objects.equals(this.mediumRatio, that.mediumRatio) && Objects.equals(this.lightRatio, that.lightRatio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, maxValue, criticalRatio, mediumRatio, lightRatio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportRatioStat {\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
        sb.append("    criticalRatio: ").append(toIndentedString(criticalRatio)).append("\n");
        sb.append("    mediumRatio: ").append(toIndentedString(mediumRatio)).append("\n");
        sb.append("    lightRatio: ").append(toIndentedString(lightRatio)).append("\n");
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
