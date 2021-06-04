package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 条件中简单定时类型的信息，自定义结构。
 */
public class SimpleTimerType  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repeat_interval")
    
    private Integer repeatInterval;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="repeat_count")
    
    private Integer repeatCount;

    public SimpleTimerType withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * **参数说明**：规则触发的开始时间，使用UTC时区，格式：yyyyMMdd'T'HHmmss'Z'。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public SimpleTimerType withRepeatInterval(Integer repeatInterval) {
        this.repeatInterval = repeatInterval;
        return this;
    }

    


    /**
     * **参数说明**：规则触发的重复时间间隔，单位为秒。
     * minimum: 1
     * maximum: 31536000
     * @return repeatInterval
     */
    public Integer getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(Integer repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    

    public SimpleTimerType withRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }

    


    /**
     * **参数说明**：规则触发的重复次数。
     * minimum: 1
     * maximum: 9999
     * @return repeatCount
     */
    public Integer getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleTimerType simpleTimerType = (SimpleTimerType) o;
        return Objects.equals(this.startTime, simpleTimerType.startTime) &&
            Objects.equals(this.repeatInterval, simpleTimerType.repeatInterval) &&
            Objects.equals(this.repeatCount, simpleTimerType.repeatCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, repeatInterval, repeatCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleTimerType {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    repeatInterval: ").append(toIndentedString(repeatInterval)).append("\n");
        sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
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

