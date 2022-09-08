package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueueScalingPoliciesResponse
 */
public class QueueScalingPoliciesResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impact_start_time")

    private String impactStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "impact_stop_time")

    private String impactStopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cu")

    private Integer minCu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cu")

    private Integer maxCu;

    public QueueScalingPoliciesResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 策略优先级1-100，100优先级最高
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public QueueScalingPoliciesResponse withImpactStartTime(String impactStartTime) {
        this.impactStartTime = impactStartTime;
        return this;
    }

    /**
     * 开始时间
     * @return impactStartTime
     */
    public String getImpactStartTime() {
        return impactStartTime;
    }

    public void setImpactStartTime(String impactStartTime) {
        this.impactStartTime = impactStartTime;
    }

    public QueueScalingPoliciesResponse withImpactStopTime(String impactStopTime) {
        this.impactStopTime = impactStopTime;
        return this;
    }

    /**
     * 结束时间
     * @return impactStopTime
     */
    public String getImpactStopTime() {
        return impactStopTime;
    }

    public void setImpactStopTime(String impactStopTime) {
        this.impactStopTime = impactStopTime;
    }

    public QueueScalingPoliciesResponse withMinCu(Integer minCu) {
        this.minCu = minCu;
        return this;
    }

    /**
     * 最小cu数量
     * @return minCu
     */
    public Integer getMinCu() {
        return minCu;
    }

    public void setMinCu(Integer minCu) {
        this.minCu = minCu;
    }

    public QueueScalingPoliciesResponse withMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
        return this;
    }

    /**
     * 最大cu数量
     * @return maxCu
     */
    public Integer getMaxCu() {
        return maxCu;
    }

    public void setMaxCu(Integer maxCu) {
        this.maxCu = maxCu;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueueScalingPoliciesResponse queueScalingPoliciesResponse = (QueueScalingPoliciesResponse) o;
        return Objects.equals(this.priority, queueScalingPoliciesResponse.priority)
            && Objects.equals(this.impactStartTime, queueScalingPoliciesResponse.impactStartTime)
            && Objects.equals(this.impactStopTime, queueScalingPoliciesResponse.impactStopTime)
            && Objects.equals(this.minCu, queueScalingPoliciesResponse.minCu)
            && Objects.equals(this.maxCu, queueScalingPoliciesResponse.maxCu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, impactStartTime, impactStopTime, minCu, maxCu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueScalingPoliciesResponse {\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    impactStartTime: ").append(toIndentedString(impactStartTime)).append("\n");
        sb.append("    impactStopTime: ").append(toIndentedString(impactStopTime)).append("\n");
        sb.append("    minCu: ").append(toIndentedString(minCu)).append("\n");
        sb.append("    maxCu: ").append(toIndentedString(maxCu)).append("\n");
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
