package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListScheduledEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<EventResponse> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListEventsResponsePageInfo pageInfo;

    public ListScheduledEventsResponse withEvents(List<EventResponse> events) {
        this.events = events;
        return this;
    }

    public ListScheduledEventsResponse addEventsItem(EventResponse eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public ListScheduledEventsResponse withEvents(Consumer<List<EventResponse>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 计划事件列表
     * @return events
     */
    public List<EventResponse> getEvents() {
        return events;
    }

    public void setEvents(List<EventResponse> events) {
        this.events = events;
    }

    public ListScheduledEventsResponse withPageInfo(ListEventsResponsePageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListScheduledEventsResponse withPageInfo(Consumer<ListEventsResponsePageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ListEventsResponsePageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ListEventsResponsePageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ListEventsResponsePageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListScheduledEventsResponse that = (ListScheduledEventsResponse) obj;
        return Objects.equals(this.events, that.events) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScheduledEventsResponse {\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
