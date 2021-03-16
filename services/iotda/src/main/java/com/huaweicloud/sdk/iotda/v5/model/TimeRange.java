package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 规则有效时间段
 */
public class TimeRange  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="days_of_week")
    
    private String daysOfWeek;

    public TimeRange withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 规则条件触发的开始时间，格式：HH:mm。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public TimeRange withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 规则条件触发的结束时间，格式：HH:mm。若结束时间与开始时间一致，则时间为全天。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public TimeRange withDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    


    /**
     * 星期列表，以逗号分隔。1代表周日，2代表周一，依次类推，默认为每天。星期列表中的日期为开始时间的日期。
     * @return daysOfWeek
     */
    public String getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimeRange timeRange = (TimeRange) o;
        return Objects.equals(this.startTime, timeRange.startTime) &&
            Objects.equals(this.endTime, timeRange.endTime) &&
            Objects.equals(this.daysOfWeek, timeRange.daysOfWeek);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, daysOfWeek);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeRange {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    daysOfWeek: ").append(toIndentedString(daysOfWeek)).append("\n");
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

