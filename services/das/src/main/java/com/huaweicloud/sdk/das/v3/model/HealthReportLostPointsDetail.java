package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HealthReportLostPointsDetail
 */
public class HealthReportLostPointsDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private String metric;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lost_points")

    private Double lostPoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    public HealthReportLostPointsDetail withMetric(String metric) {
        this.metric = metric;
        return this;
    }

    /**
     * 扣分项。
     * @return metric
     */
    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public HealthReportLostPointsDetail withLostPoints(Double lostPoints) {
        this.lostPoints = lostPoints;
        return this;
    }

    /**
     * 所扣分数。
     * @return lostPoints
     */
    public Double getLostPoints() {
        return lostPoints;
    }

    public void setLostPoints(Double lostPoints) {
        this.lostPoints = lostPoints;
    }

    public HealthReportLostPointsDetail withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 事件等级。
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthReportLostPointsDetail that = (HealthReportLostPointsDetail) obj;
        return Objects.equals(this.metric, that.metric) && Objects.equals(this.lostPoints, that.lostPoints)
            && Objects.equals(this.riskLevel, that.riskLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, lostPoints, riskLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthReportLostPointsDetail {\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    lostPoints: ").append(toIndentedString(lostPoints)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
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
