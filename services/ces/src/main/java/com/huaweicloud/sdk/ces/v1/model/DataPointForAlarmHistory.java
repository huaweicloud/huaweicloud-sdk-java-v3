package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 计算出该条告警历史的资源监控数据上报时间和监控数值。
 */
public class DataPointForAlarmHistory  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private Long time;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private Double value;

    public DataPointForAlarmHistory withTime(Long time) {
        this.time = time;
        return this;
    }

    


    /**
     * 计算出该条告警历史的资源监控数据上报时间，UNIX时间戳，单位毫秒，如：1603131028000。
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    

    public DataPointForAlarmHistory withValue(Double value) {
        this.value = value;
        return this;
    }

    


    /**
     * 计算出该条告警历史的资源监控数据在该时间点的监控数值，如：7.019。
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataPointForAlarmHistory dataPointForAlarmHistory = (DataPointForAlarmHistory) o;
        return Objects.equals(this.time, dataPointForAlarmHistory.time) &&
            Objects.equals(this.value, dataPointForAlarmHistory.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(time, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataPointForAlarmHistory {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

