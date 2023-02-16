package com.huaweicloud.sdk.aom.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.EventModel;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListEventsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="events")
    
    
    private List<EventModel> events = null;
    
    public ListEventsResponse withEvents(List<EventModel> events) {
        this.events = events;
        return this;
    }

    
    public ListEventsResponse addEventsItem(EventModel eventsItem) {
        if(this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public ListEventsResponse withEvents(Consumer<List<EventModel>> eventsSetter) {
        if(this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 事件或者告警详情。
     * @return events
     */
    public List<EventModel> getEvents() {
        return events;
    }

    public void setEvents(List<EventModel> events) {
        this.events = events;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEventsResponse listEventsResponse = (ListEventsResponse) o;
        return Objects.equals(this.events, listEventsResponse.events);
    }
    @Override
    public int hashCode() {
        return Objects.hash(events);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventsResponse {\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

