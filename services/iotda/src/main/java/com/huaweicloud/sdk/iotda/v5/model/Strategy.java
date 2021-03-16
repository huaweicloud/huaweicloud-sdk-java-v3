package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 配置条件处理策略，用于确定规则是否判断上次数据是否满足条件。当rule_type类型为 “DEVICE_LINKAGE”时，为必选参数。默认为pulse触发类型，事件有效性为永久有效
 */
public class Strategy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trigger")
    
    private String trigger;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_valid_time")
    
    private Integer eventValidTime;

    public Strategy withTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    


    /**
     * 规则条件触发的判断策略，默认为pulse。 - pulse：设备上报的数据满足条件则触发，不判断上一次上报的数据。 - reverse：设备上一次上报的数据不满足条件，本次上报的数据满足条件则触发。 
     * @return trigger
     */
    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    

    public Strategy withEventValidTime(Integer eventValidTime) {
        this.eventValidTime = eventValidTime;
        return this;
    }

    


    /**
     * 设备数据的有效时间，单位为秒，设备数据的产生时间以上报数据中的eventTime为基准。
     * minimum: -1
     * @return eventValidTime
     */
    public Integer getEventValidTime() {
        return eventValidTime;
    }

    public void setEventValidTime(Integer eventValidTime) {
        this.eventValidTime = eventValidTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Strategy strategy = (Strategy) o;
        return Objects.equals(this.trigger, strategy.trigger) &&
            Objects.equals(this.eventValidTime, strategy.eventValidTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(trigger, eventValidTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Strategy {\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    eventValidTime: ").append(toIndentedString(eventValidTime)).append("\n");
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

