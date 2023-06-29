package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * StageKpiItems
 */
public class StageKpiItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_response_time")

    private StageKpiItem averageResponseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_rate")

    private StageKpiItem successRate;

    public StageKpiItems withAverageResponseTime(StageKpiItem averageResponseTime) {
        this.averageResponseTime = averageResponseTime;
        return this;
    }

    public StageKpiItems withAverageResponseTime(Consumer<StageKpiItem> averageResponseTimeSetter) {
        if (this.averageResponseTime == null) {
            this.averageResponseTime = new StageKpiItem();
            averageResponseTimeSetter.accept(this.averageResponseTime);
        }

        return this;
    }

    /**
     * Get averageResponseTime
     * @return averageResponseTime
     */
    public StageKpiItem getAverageResponseTime() {
        return averageResponseTime;
    }

    public void setAverageResponseTime(StageKpiItem averageResponseTime) {
        this.averageResponseTime = averageResponseTime;
    }

    public StageKpiItems withSuccessRate(StageKpiItem successRate) {
        this.successRate = successRate;
        return this;
    }

    public StageKpiItems withSuccessRate(Consumer<StageKpiItem> successRateSetter) {
        if (this.successRate == null) {
            this.successRate = new StageKpiItem();
            successRateSetter.accept(this.successRate);
        }

        return this;
    }

    /**
     * Get successRate
     * @return successRate
     */
    public StageKpiItem getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(StageKpiItem successRate) {
        this.successRate = successRate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StageKpiItems that = (StageKpiItems) obj;
        return Objects.equals(this.averageResponseTime, that.averageResponseTime)
            && Objects.equals(this.successRate, that.successRate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(averageResponseTime, successRate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StageKpiItems {\n");
        sb.append("    averageResponseTime: ").append(toIndentedString(averageResponseTime)).append("\n");
        sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
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
