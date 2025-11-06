package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlarmPeriod
 */
public class AlarmPeriod {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_time")

    private String completeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private Integer period;

    public AlarmPeriod withCompleteTime(String completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    /**
     * 任务完成时间。
     * @return completeTime
     */
    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }

    public AlarmPeriod withPeriod(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * 周期。
     * @return period
     */
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmPeriod that = (AlarmPeriod) obj;
        return Objects.equals(this.completeTime, that.completeTime) && Objects.equals(this.period, that.period);
    }

    @Override
    public int hashCode() {
        return Objects.hash(completeTime, period);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmPeriod {\n");
        sb.append("    completeTime: ").append(toIndentedString(completeTime)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
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
