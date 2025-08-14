package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueueScalingPolicy
 */
public class QueueScalingPolicy {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit_elastic_resource_pool_max_cu")

    private Boolean inheritElasticResourcePoolMaxCu;

    public QueueScalingPolicy withPriority(Integer priority) {
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

    public QueueScalingPolicy withImpactStartTime(String impactStartTime) {
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

    public QueueScalingPolicy withImpactStopTime(String impactStopTime) {
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

    public QueueScalingPolicy withMinCu(Integer minCu) {
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

    public QueueScalingPolicy withMaxCu(Integer maxCu) {
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

    public QueueScalingPolicy withInheritElasticResourcePoolMaxCu(Boolean inheritElasticResourcePoolMaxCu) {
        this.inheritElasticResourcePoolMaxCu = inheritElasticResourcePoolMaxCu;
        return this;
    }

    /**
     * 是否继承资源池最大CU
     * @return inheritElasticResourcePoolMaxCu
     */
    public Boolean getInheritElasticResourcePoolMaxCu() {
        return inheritElasticResourcePoolMaxCu;
    }

    public void setInheritElasticResourcePoolMaxCu(Boolean inheritElasticResourcePoolMaxCu) {
        this.inheritElasticResourcePoolMaxCu = inheritElasticResourcePoolMaxCu;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueueScalingPolicy that = (QueueScalingPolicy) obj;
        return Objects.equals(this.priority, that.priority)
            && Objects.equals(this.impactStartTime, that.impactStartTime)
            && Objects.equals(this.impactStopTime, that.impactStopTime) && Objects.equals(this.minCu, that.minCu)
            && Objects.equals(this.maxCu, that.maxCu)
            && Objects.equals(this.inheritElasticResourcePoolMaxCu, that.inheritElasticResourcePoolMaxCu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, impactStartTime, impactStopTime, minCu, maxCu, inheritElasticResourcePoolMaxCu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueueScalingPolicy {\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    impactStartTime: ").append(toIndentedString(impactStartTime)).append("\n");
        sb.append("    impactStopTime: ").append(toIndentedString(impactStopTime)).append("\n");
        sb.append("    minCu: ").append(toIndentedString(minCu)).append("\n");
        sb.append("    maxCu: ").append(toIndentedString(maxCu)).append("\n");
        sb.append("    inheritElasticResourcePoolMaxCu: ")
            .append(toIndentedString(inheritElasticResourcePoolMaxCu))
            .append("\n");
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
