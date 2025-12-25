package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 告警规则时间表
 */
public class AlertRuleSchedule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_interval")

    private Integer delayInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency_interval")

    private Integer frequencyInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frequency_unit")

    private FrequencyUnit frequencyUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overtime_interval")

    private Integer overtimeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_interval")

    private Integer periodInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_unit")

    private FrequencyUnit periodUnit;

    public AlertRuleSchedule withDelayInterval(Integer delayInterval) {
        this.delayInterval = delayInterval;
        return this;
    }

    /**
     * 整型时长
     * minimum: 0
     * maximum: 2147483640
     * @return delayInterval
     */
    public Integer getDelayInterval() {
        return delayInterval;
    }

    public void setDelayInterval(Integer delayInterval) {
        this.delayInterval = delayInterval;
    }

    public AlertRuleSchedule withFrequencyInterval(Integer frequencyInterval) {
        this.frequencyInterval = frequencyInterval;
        return this;
    }

    /**
     * 整型时长
     * minimum: 0
     * maximum: 2147483640
     * @return frequencyInterval
     */
    public Integer getFrequencyInterval() {
        return frequencyInterval;
    }

    public void setFrequencyInterval(Integer frequencyInterval) {
        this.frequencyInterval = frequencyInterval;
    }

    public AlertRuleSchedule withFrequencyUnit(FrequencyUnit frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
        return this;
    }

    /**
     * Get frequencyUnit
     * @return frequencyUnit
     */
    public FrequencyUnit getFrequencyUnit() {
        return frequencyUnit;
    }

    public void setFrequencyUnit(FrequencyUnit frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
    }

    public AlertRuleSchedule withOvertimeInterval(Integer overtimeInterval) {
        this.overtimeInterval = overtimeInterval;
        return this;
    }

    /**
     * 整型时长
     * minimum: 0
     * maximum: 2147483640
     * @return overtimeInterval
     */
    public Integer getOvertimeInterval() {
        return overtimeInterval;
    }

    public void setOvertimeInterval(Integer overtimeInterval) {
        this.overtimeInterval = overtimeInterval;
    }

    public AlertRuleSchedule withPeriodInterval(Integer periodInterval) {
        this.periodInterval = periodInterval;
        return this;
    }

    /**
     * 整型时长
     * minimum: 0
     * maximum: 2147483640
     * @return periodInterval
     */
    public Integer getPeriodInterval() {
        return periodInterval;
    }

    public void setPeriodInterval(Integer periodInterval) {
        this.periodInterval = periodInterval;
    }

    public AlertRuleSchedule withPeriodUnit(FrequencyUnit periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }

    /**
     * Get periodUnit
     * @return periodUnit
     */
    public FrequencyUnit getPeriodUnit() {
        return periodUnit;
    }

    public void setPeriodUnit(FrequencyUnit periodUnit) {
        this.periodUnit = periodUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlertRuleSchedule that = (AlertRuleSchedule) obj;
        return Objects.equals(this.delayInterval, that.delayInterval)
            && Objects.equals(this.frequencyInterval, that.frequencyInterval)
            && Objects.equals(this.frequencyUnit, that.frequencyUnit)
            && Objects.equals(this.overtimeInterval, that.overtimeInterval)
            && Objects.equals(this.periodInterval, that.periodInterval)
            && Objects.equals(this.periodUnit, that.periodUnit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(delayInterval, frequencyInterval, frequencyUnit, overtimeInterval, periodInterval, periodUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlertRuleSchedule {\n");
        sb.append("    delayInterval: ").append(toIndentedString(delayInterval)).append("\n");
        sb.append("    frequencyInterval: ").append(toIndentedString(frequencyInterval)).append("\n");
        sb.append("    frequencyUnit: ").append(toIndentedString(frequencyUnit)).append("\n");
        sb.append("    overtimeInterval: ").append(toIndentedString(overtimeInterval)).append("\n");
        sb.append("    periodInterval: ").append(toIndentedString(periodInterval)).append("\n");
        sb.append("    periodUnit: ").append(toIndentedString(periodUnit)).append("\n");
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
