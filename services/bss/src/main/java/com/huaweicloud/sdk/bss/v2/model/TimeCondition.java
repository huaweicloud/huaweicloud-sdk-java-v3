package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TimeCondition
 */
public class TimeCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_measure_id")

    private Integer timeMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public TimeCondition withTimeMeasureId(Integer timeMeasureId) {
        this.timeMeasureId = timeMeasureId;
        return this;
    }

    /**
     * 时间单位。1：天2：月
     * minimum: 1
     * maximum: 2
     * @return timeMeasureId
     */
    public Integer getTimeMeasureId() {
        return timeMeasureId;
    }

    public void setTimeMeasureId(Integer timeMeasureId) {
        this.timeMeasureId = timeMeasureId;
    }

    public TimeCondition withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 查询开始时间，必须是日期格式。当time_measure_id值为1或为空时，格式为YYYY-MM-DD当time_measure_id值为2时，格式为YYYY-MM
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public TimeCondition withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询结束时间：必须是日期格式。当time_measure_id值为1或为空时，格式为YYYY-MM-DD当time_measure_id值为2时，格式为YYYY-MM
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeCondition that = (TimeCondition) obj;
        return Objects.equals(this.timeMeasureId, that.timeMeasureId) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeMeasureId, beginTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeCondition {\n");
        sb.append("    timeMeasureId: ").append(toIndentedString(timeMeasureId)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
