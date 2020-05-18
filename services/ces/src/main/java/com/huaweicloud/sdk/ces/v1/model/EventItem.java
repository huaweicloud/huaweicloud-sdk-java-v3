package com.huaweicloud.sdk.ces.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ces.v1.model.EventItemDetail;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class EventItem  {



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
    
    private EventItemDetail detail = null;

    public EventItem withEventName(String eventName) {
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

    public EventItem withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    


    /**
     * 事件来源。  格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_，总长度最短为3，最大为32。
     * @return eventSource
     */
    public String getEventSource() {
        return eventSource;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public EventItem withTime(Long time) {
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

    public EventItem withDetail(EventItemDetail detail) {
        this.detail = detail;
        return this;
    }

    public EventItem withDetail(Consumer<EventItemDetail> detailSetter) {
        if(this.detail == null ){
            this.detail = new EventItemDetail();
        }
        detailSetter.accept(this.detail);
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventItem eventItem = (EventItem) o;
        return Objects.equals(this.eventName, eventItem.eventName) &&
            Objects.equals(this.eventSource, eventItem.eventSource) &&
            Objects.equals(this.time, eventItem.time) &&
            Objects.equals(this.detail, eventItem.detail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventSource, time, detail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventItem {\n");
            sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
            sb.append("    eventSource: ").append(toIndentedString(eventSource)).append("\n");
            sb.append("    time: ").append(toIndentedString(time)).append("\n");
            sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

