package com.huaweicloud.sdk.dbss.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TimeRangeBean
 */
public class TimeRangeBean  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_range")
    
    
    private String timeRange;

    public TimeRangeBean withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 开始时间，必须和end_time成对出现。格式必须为yyyy-MM-dd HH:mm:ss。UTC时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public TimeRangeBean withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 结束时间，必须和start_time成对出现。格式必须为yyyy-MM-dd HH:mm:ss。UTC时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public TimeRangeBean withTimeRange(String timeRange) {
        this.timeRange = timeRange;
        return this;
    }

    


    /**
     * 请求查询的时间段，值为： • HALF_HOUR • HOUR • THREE_HOUR • TWELVE_HOUR • DAY（24小时） • WEEK（7天） • MONTH（30天） 枚举值：  HALF_HOUR  HOUR  THREE_HOUR  TWELVE_HOUR  DAY  WEEK  MONTH
     * @return timeRange
     */
    public String getTimeRange() {
        return timeRange;
    }

    public void setTimeRange(String timeRange) {
        this.timeRange = timeRange;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimeRangeBean timeRangeBean = (TimeRangeBean) o;
        return Objects.equals(this.endTime, timeRangeBean.endTime) &&
            Objects.equals(this.startTime, timeRangeBean.startTime) &&
            Objects.equals(this.timeRange, timeRangeBean.timeRange);
    }
    @Override
    public int hashCode() {
        return Objects.hash(endTime, startTime, timeRange);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeRangeBean {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    timeRange: ").append(toIndentedString(timeRange)).append("\n");
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

