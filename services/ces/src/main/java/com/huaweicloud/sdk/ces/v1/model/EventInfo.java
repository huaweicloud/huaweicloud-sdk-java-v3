package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 一条事件监控信息
 */
public class EventInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_name")
    
    private String eventName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_type")
    
    private String eventType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_count")
    
    private String eventCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="latest_occur_time")
    
    private String latestOccurTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="latest_event_source")
    
    private String latestEventSource;

    public EventInfo withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    


    /**
     * 事件名称。
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public EventInfo withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    


    /**
     * 事件类型。
     * @return eventType
     */
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public EventInfo withEventCount(String eventCount) {
        this.eventCount = eventCount;
        return this;
    }

    


    /**
     * 选择查询的时间范围内，此事件发生的数量。
     * @return eventCount
     */
    public String getEventCount() {
        return eventCount;
    }

    public void setEventCount(String eventCount) {
        this.eventCount = eventCount;
    }

    public EventInfo withLatestOccurTime(String latestOccurTime) {
        this.latestOccurTime = latestOccurTime;
        return this;
    }

    


    /**
     * 此事件最近一次发生的时间。
     * @return latestOccurTime
     */
    public String getLatestOccurTime() {
        return latestOccurTime;
    }

    public void setLatestOccurTime(String latestOccurTime) {
        this.latestOccurTime = latestOccurTime;
    }

    public EventInfo withLatestEventSource(String latestEventSource) {
        this.latestEventSource = latestEventSource;
        return this;
    }

    


    /**
     * 事件来源，如果是系统事件则值为各服务的命名空间，各服务的命名空间可查看：“[服务命名空间](https://support.huaweicloud.com/usermanual-ces/zh-cn_topic_0202622212.html)”；如果是自定义事件，则为用户自定义上报定义。
     * @return latestEventSource
     */
    public String getLatestEventSource() {
        return latestEventSource;
    }

    public void setLatestEventSource(String latestEventSource) {
        this.latestEventSource = latestEventSource;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventInfo eventInfo = (EventInfo) o;
        return Objects.equals(this.eventName, eventInfo.eventName) &&
            Objects.equals(this.eventType, eventInfo.eventType) &&
            Objects.equals(this.eventCount, eventInfo.eventCount) &&
            Objects.equals(this.latestOccurTime, eventInfo.latestOccurTime) &&
            Objects.equals(this.latestEventSource, eventInfo.latestEventSource);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventType, eventCount, latestOccurTime, latestEventSource);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventInfo {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventCount: ").append(toIndentedString(eventCount)).append("\n");
        sb.append("    latestOccurTime: ").append(toIndentedString(latestOccurTime)).append("\n");
        sb.append("    latestEventSource: ").append(toIndentedString(latestEventSource)).append("\n");
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

