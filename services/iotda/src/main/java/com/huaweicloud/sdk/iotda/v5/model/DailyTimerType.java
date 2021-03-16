package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 条件中每日定时类型的信息，自定义结构。
 */
public class DailyTimerType  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private String time;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="days_of_week")
    
    private String daysOfWeek;

    public DailyTimerType withTime(String time) {
        this.time = time;
        return this;
    }

    


    /**
     * 规则触发的时间，格式：HH:MM。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    

    public DailyTimerType withDaysOfWeek(String daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
        return this;
    }

    


    /**
     * 星期列表，以逗号分隔。1代表周日，2代表周一，依次类推，默认为每天。
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
        DailyTimerType dailyTimerType = (DailyTimerType) o;
        return Objects.equals(this.time, dailyTimerType.time) &&
            Objects.equals(this.daysOfWeek, dailyTimerType.daysOfWeek);
    }
    @Override
    public int hashCode() {
        return Objects.hash(time, daysOfWeek);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DailyTimerType {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

