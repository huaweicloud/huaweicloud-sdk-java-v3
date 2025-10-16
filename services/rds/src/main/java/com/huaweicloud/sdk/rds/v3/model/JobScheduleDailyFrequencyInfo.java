package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 策略每日频率。
 */
public class JobScheduleDailyFrequencyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freq_subday_type")

    private String freqSubdayType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_start_time")

    private String activeStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_end_time")

    private String activeEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freq_subday_interval")

    private Integer freqSubdayInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freq_interval_unit")

    private String freqIntervalUnit;

    public JobScheduleDailyFrequencyInfo withFreqSubdayType(String freqSubdayType) {
        this.freqSubdayType = freqSubdayType;
        return this;
    }

    /**
     * 每日频率类型 once:每日一次, multiple:每日多次。
     * @return freqSubdayType
     */
    public String getFreqSubdayType() {
        return freqSubdayType;
    }

    public void setFreqSubdayType(String freqSubdayType) {
        this.freqSubdayType = freqSubdayType;
    }

    public JobScheduleDailyFrequencyInfo withActiveStartTime(String activeStartTime) {
        this.activeStartTime = activeStartTime;
        return this;
    }

    /**
     * 每日第一次执行时间。每日频率类型为每日一次时，则只执行这一次。 HH:mm:ss
     * @return activeStartTime
     */
    public String getActiveStartTime() {
        return activeStartTime;
    }

    public void setActiveStartTime(String activeStartTime) {
        this.activeStartTime = activeStartTime;
    }

    public JobScheduleDailyFrequencyInfo withActiveEndTime(String activeEndTime) {
        this.activeEndTime = activeEndTime;
        return this;
    }

    /**
     * 最后一次执行时间。每日执行多次时该参数必传，每日执行一次时不生效。 HH:mm:ss
     * @return activeEndTime
     */
    public String getActiveEndTime() {
        return activeEndTime;
    }

    public void setActiveEndTime(String activeEndTime) {
        this.activeEndTime = activeEndTime;
    }

    public JobScheduleDailyFrequencyInfo withFreqSubdayInterval(Integer freqSubdayInterval) {
        this.freqSubdayInterval = freqSubdayInterval;
        return this;
    }

    /**
     * 执行间隔。每日执行多次时该参数必传，每日执行一次时不生效。取值范围1至99
     * @return freqSubdayInterval
     */
    public Integer getFreqSubdayInterval() {
        return freqSubdayInterval;
    }

    public void setFreqSubdayInterval(Integer freqSubdayInterval) {
        this.freqSubdayInterval = freqSubdayInterval;
    }

    public JobScheduleDailyFrequencyInfo withFreqIntervalUnit(String freqIntervalUnit) {
        this.freqIntervalUnit = freqIntervalUnit;
        return this;
    }

    /**
     * 执行间隔的单位。每日执行多次时该参数必传，每日执行一次时不生效。 second:秒, minute:分, hour:时
     * @return freqIntervalUnit
     */
    public String getFreqIntervalUnit() {
        return freqIntervalUnit;
    }

    public void setFreqIntervalUnit(String freqIntervalUnit) {
        this.freqIntervalUnit = freqIntervalUnit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScheduleDailyFrequencyInfo that = (JobScheduleDailyFrequencyInfo) obj;
        return Objects.equals(this.freqSubdayType, that.freqSubdayType)
            && Objects.equals(this.activeStartTime, that.activeStartTime)
            && Objects.equals(this.activeEndTime, that.activeEndTime)
            && Objects.equals(this.freqSubdayInterval, that.freqSubdayInterval)
            && Objects.equals(this.freqIntervalUnit, that.freqIntervalUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freqSubdayType, activeStartTime, activeEndTime, freqSubdayInterval, freqIntervalUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScheduleDailyFrequencyInfo {\n");
        sb.append("    freqSubdayType: ").append(toIndentedString(freqSubdayType)).append("\n");
        sb.append("    activeStartTime: ").append(toIndentedString(activeStartTime)).append("\n");
        sb.append("    activeEndTime: ").append(toIndentedString(activeEndTime)).append("\n");
        sb.append("    freqSubdayInterval: ").append(toIndentedString(freqSubdayInterval)).append("\n");
        sb.append("    freqIntervalUnit: ").append(toIndentedString(freqIntervalUnit)).append("\n");
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
