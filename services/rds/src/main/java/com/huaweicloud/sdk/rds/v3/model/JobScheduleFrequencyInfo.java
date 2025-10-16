package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略间隔周期。
 */
public class JobScheduleFrequencyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freq_type")

    private String freqType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freq_interval")

    private Integer freqInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freq_interval_weekly")

    private List<String> freqIntervalWeekly = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freq_interval_day_monthly")

    private Integer freqIntervalDayMonthly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freq_interval_monthly")

    private String freqIntervalMonthly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freq_relative_interval_monthly")

    private String freqRelativeIntervalMonthly;

    public JobScheduleFrequencyInfo withFreqType(String freqType) {
        this.freqType = freqType;
        return this;
    }

    /**
     * 策略频率类型 daily:按天, weekly:按周, monthly_day:按月、每月按天, monthly_week:按月、每月按周。
     * @return freqType
     */
    public String getFreqType() {
        return freqType;
    }

    public void setFreqType(String freqType) {
        this.freqType = freqType;
    }

    public JobScheduleFrequencyInfo withFreqInterval(Integer freqInterval) {
        this.freqInterval = freqInterval;
        return this;
    }

    /**
     * 执行间隔。取值范围1至99。
     * @return freqInterval
     */
    public Integer getFreqInterval() {
        return freqInterval;
    }

    public void setFreqInterval(Integer freqInterval) {
        this.freqInterval = freqInterval;
    }

    public JobScheduleFrequencyInfo withFreqIntervalWeekly(List<String> freqIntervalWeekly) {
        this.freqIntervalWeekly = freqIntervalWeekly;
        return this;
    }

    public JobScheduleFrequencyInfo addFreqIntervalWeeklyItem(String freqIntervalWeeklyItem) {
        if (this.freqIntervalWeekly == null) {
            this.freqIntervalWeekly = new ArrayList<>();
        }
        this.freqIntervalWeekly.add(freqIntervalWeeklyItem);
        return this;
    }

    public JobScheduleFrequencyInfo withFreqIntervalWeekly(Consumer<List<String>> freqIntervalWeeklySetter) {
        if (this.freqIntervalWeekly == null) {
            this.freqIntervalWeekly = new ArrayList<>();
        }
        freqIntervalWeeklySetter.accept(this.freqIntervalWeekly);
        return this;
    }

    /**
     * 频率类型为按周时该参数必传，不为按周时不生效。 每周执行哪几天。参数值：Monday，Tuesday … Sunday
     * @return freqIntervalWeekly
     */
    public List<String> getFreqIntervalWeekly() {
        return freqIntervalWeekly;
    }

    public void setFreqIntervalWeekly(List<String> freqIntervalWeekly) {
        this.freqIntervalWeekly = freqIntervalWeekly;
    }

    public JobScheduleFrequencyInfo withFreqIntervalDayMonthly(Integer freqIntervalDayMonthly) {
        this.freqIntervalDayMonthly = freqIntervalDayMonthly;
        return this;
    }

    /**
     * 频率类型为按月、每月按天时该参数必传，不为按月、每月按天时时不生效。 每月执行的日期。取值范围1-31。
     * @return freqIntervalDayMonthly
     */
    public Integer getFreqIntervalDayMonthly() {
        return freqIntervalDayMonthly;
    }

    public void setFreqIntervalDayMonthly(Integer freqIntervalDayMonthly) {
        this.freqIntervalDayMonthly = freqIntervalDayMonthly;
    }

    public JobScheduleFrequencyInfo withFreqIntervalMonthly(String freqIntervalMonthly) {
        this.freqIntervalMonthly = freqIntervalMonthly;
        return this;
    }

    /**
     * 频率类型为按月、每月按周时该参数必传，不为按月、每月按周时时不生效。 每周执行哪几天。 Sunday, Monday,Tuesday ... Saturday, day, weekday, weekend
     * @return freqIntervalMonthly
     */
    public String getFreqIntervalMonthly() {
        return freqIntervalMonthly;
    }

    public void setFreqIntervalMonthly(String freqIntervalMonthly) {
        this.freqIntervalMonthly = freqIntervalMonthly;
    }

    public JobScheduleFrequencyInfo withFreqRelativeIntervalMonthly(String freqRelativeIntervalMonthly) {
        this.freqRelativeIntervalMonthly = freqRelativeIntervalMonthly;
        return this;
    }

    /**
     * 频率类型为按月、每月按周时该参数必传，不为按月、每月按周时时不生效。 每月在哪周执行。 first, second, third, fourth, last
     * @return freqRelativeIntervalMonthly
     */
    public String getFreqRelativeIntervalMonthly() {
        return freqRelativeIntervalMonthly;
    }

    public void setFreqRelativeIntervalMonthly(String freqRelativeIntervalMonthly) {
        this.freqRelativeIntervalMonthly = freqRelativeIntervalMonthly;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScheduleFrequencyInfo that = (JobScheduleFrequencyInfo) obj;
        return Objects.equals(this.freqType, that.freqType) && Objects.equals(this.freqInterval, that.freqInterval)
            && Objects.equals(this.freqIntervalWeekly, that.freqIntervalWeekly)
            && Objects.equals(this.freqIntervalDayMonthly, that.freqIntervalDayMonthly)
            && Objects.equals(this.freqIntervalMonthly, that.freqIntervalMonthly)
            && Objects.equals(this.freqRelativeIntervalMonthly, that.freqRelativeIntervalMonthly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(freqType,
            freqInterval,
            freqIntervalWeekly,
            freqIntervalDayMonthly,
            freqIntervalMonthly,
            freqRelativeIntervalMonthly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScheduleFrequencyInfo {\n");
        sb.append("    freqType: ").append(toIndentedString(freqType)).append("\n");
        sb.append("    freqInterval: ").append(toIndentedString(freqInterval)).append("\n");
        sb.append("    freqIntervalWeekly: ").append(toIndentedString(freqIntervalWeekly)).append("\n");
        sb.append("    freqIntervalDayMonthly: ").append(toIndentedString(freqIntervalDayMonthly)).append("\n");
        sb.append("    freqIntervalMonthly: ").append(toIndentedString(freqIntervalMonthly)).append("\n");
        sb.append("    freqRelativeIntervalMonthly: ")
            .append(toIndentedString(freqRelativeIntervalMonthly))
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
