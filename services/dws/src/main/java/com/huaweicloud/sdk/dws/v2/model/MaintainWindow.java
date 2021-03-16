package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 集群维护时间窗信息
 */
public class MaintainWindow  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="day")
    
    private String day;

    public MaintainWindow withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 维护开始时间，显示格式为 HH：mm，时区为GMT+0。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public MaintainWindow withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 维护结束时间，显示格式为 HH：mm, 时区为GMT+0。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    

    public MaintainWindow withDay(String day) {
        this.day = day;
        return this;
    }

    


    /**
     * 每周的维护时间，以天为粒度，取值如下  Mon：星期一  Tue：星期二  Wed：星期三  Thu：星期四  Fri： 星期五  Sat：星期六  Sun：星期日
     * @return day
     */
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MaintainWindow maintainWindow = (MaintainWindow) o;
        return Objects.equals(this.startTime, maintainWindow.startTime) &&
            Objects.equals(this.endTime, maintainWindow.endTime) &&
            Objects.equals(this.day, maintainWindow.day);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, day);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MaintainWindow {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
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

