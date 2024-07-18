package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 操作告警区间
 */
public class IntervalAlarmActionsV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation")

    private String operation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limits")

    private Integer limits;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lower_bound")

    private Double lowerBound;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upper_bound")

    private Double upperBound;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percentage")

    private Integer percentage;

    public IntervalAlarmActionsV2 withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * 操作选项，默认为ADD。 当scaling_resource_type为SCALING_GROUP，支持如下操作： ADD：增加 REMOVE/REDUCE：减少 SET：设置为 当scaling_resource_type为BANDWIDTH，支持如下操作： ADD：增加 REDUCE：减少
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public IntervalAlarmActionsV2 withLimits(Integer limits) {
        this.limits = limits;
        return this;
    }

    /**
     * 操作限制。当scaling_resource_type为BANDWIDTH，且operation不为SET时，limits参数生效，单位为Mbit/s。此时，当operation为ADD时，limits表示带宽可调整的上限；当operation为REDUCE时，limits表示带宽可调整的下限。
     * @return limits
     */
    public Integer getLimits() {
        return limits;
    }

    public void setLimits(Integer limits) {
        this.limits = limits;
    }

    public IntervalAlarmActionsV2 withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 操作大小，取值范围为0到300的整数，默认为1。当scaling_resource_type为SCALING_GROUP时，size为实例个数,取值范围为0-300的整数，默认为1。当scaling_resource_type为BANDWIDTH时，size表示带宽大小，单位为Mbit/s，取值范围为1到300的整数，默认为1。当scaling_resource_type为SCALING_GROUP时，size和percentage参数只能选其中一个进行配置。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public IntervalAlarmActionsV2 withLowerBound(Double lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    /**
     * Get lowerBound
     * @return lowerBound
     */
    public Double getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(Double lowerBound) {
        this.lowerBound = lowerBound;
    }

    public IntervalAlarmActionsV2 withUpperBound(Double upperBound) {
        this.upperBound = upperBound;
        return this;
    }

    /**
     * Get upperBound
     * @return upperBound
     */
    public Double getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(Double upperBound) {
        this.upperBound = upperBound;
    }

    public IntervalAlarmActionsV2 withPercentage(Integer percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * 操作百分比，取值为0到20000的整数。当scaling_resource_type为SCALING_GROUP时，size和instance_percentage参数均无配置，则size默认为1。当scaling_resource_type为BANDWIDTH时，不支持配置instance_percentage参数。
     * @return percentage
     */
    public Integer getPercentage() {
        return percentage;
    }

    public void setPercentage(Integer percentage) {
        this.percentage = percentage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IntervalAlarmActionsV2 that = (IntervalAlarmActionsV2) obj;
        return Objects.equals(this.operation, that.operation) && Objects.equals(this.limits, that.limits)
            && Objects.equals(this.size, that.size) && Objects.equals(this.lowerBound, that.lowerBound)
            && Objects.equals(this.upperBound, that.upperBound) && Objects.equals(this.percentage, that.percentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, limits, size, lowerBound, upperBound, percentage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntervalAlarmActionsV2 {\n");
        sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
        sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
        sb.append("    upperBound: ").append(toIndentedString(upperBound)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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
