package com.huaweicloud.sdk.ces.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.EventItem;
import com.huaweicloud.sdk.ces.v1.model.EventItemDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 一条事件监控详细信息
 */
public class EventInfoDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_name")
    
    private String eventName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_source")
    
    private String eventSource;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private Long time;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private EventItemDetail detail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="event_id")
    
    private String eventId;

    public EventInfoDetail withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    


    /**
     * 事件名称。  必须以字母开头，只能包含0-9/a-z/A-Z/_，长度最短为1，最大为64。
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    

    public EventInfoDetail withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    


    /**
     * 事件来源。 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_，总长度最短为3，最大为32。
     * @return eventSource
     */
    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    

    public EventInfoDetail withTime(Long time) {
        this.time = time;
        return this;
    }

    


    /**
     * 事件发生时间。UNIX时间戳，单位毫秒。  说明： 因为客户端到服务器端有延时，因此插入数据的时间戳应该在[当前时间-1小时+20秒，当前时间+10分钟-20秒]区间内，保证到达服务器时不会因为传输时延造成数据不能插入数据库。
     * @return time
     */
    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    

    public EventInfoDetail withDetail(EventItemDetail detail) {
        this.detail = detail;
        return this;
    }

    public EventInfoDetail withDetail(Consumer<EventItemDetail> detailSetter) {
        if(this.detail == null ){
            this.detail = new EventItemDetail();
            detailSetter.accept(this.detail);
        }
        
        return this;
    }


    /**
     * Get detail
     * @return detail
     */
    public EventItemDetail getDetail() {
        return detail;
    }

    public void setDetail(EventItemDetail detail) {
        this.detail = detail;
    }

    

    public EventInfoDetail withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    


    /**
     * 事件ID。
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventInfoDetail eventInfoDetail = (EventInfoDetail) o;
        return Objects.equals(this.eventName, eventInfoDetail.eventName) &&
            Objects.equals(this.eventSource, eventInfoDetail.eventSource) &&
            Objects.equals(this.time, eventInfoDetail.time) &&
            Objects.equals(this.detail, eventInfoDetail.detail) &&
            Objects.equals(this.eventId, eventInfoDetail.eventId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventSource, time, detail, eventId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventInfoDetail {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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

