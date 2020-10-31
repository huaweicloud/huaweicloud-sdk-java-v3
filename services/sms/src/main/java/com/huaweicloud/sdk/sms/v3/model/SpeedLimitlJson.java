package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 速率参数
 */
public class SpeedLimitlJson  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start")
    
    private String start;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end")
    
    private String end;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="speed")
    
    private Integer speed;

    public SpeedLimitlJson withStart(String start) {
        this.start = start;
        return this;
    }

    


    /**
     * 时间段开始时间，格式：XX:XX。
     * @return start
     */
    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public SpeedLimitlJson withEnd(String end) {
        this.end = end;
        return this;
    }

    


    /**
     * 时间段结束时间，格式：XX:XX。
     * @return end
     */
    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public SpeedLimitlJson withSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    


    /**
     * 时间段的速率，0-1000的整数，单位：Mbit/s。
     * @return speed
     */
    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpeedLimitlJson speedLimitlJson = (SpeedLimitlJson) o;
        return Objects.equals(this.start, speedLimitlJson.start) &&
            Objects.equals(this.end, speedLimitlJson.end) &&
            Objects.equals(this.speed, speedLimitlJson.speed);
    }
    @Override
    public int hashCode() {
        return Objects.hash(start, end, speed);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpeedLimitlJson {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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

