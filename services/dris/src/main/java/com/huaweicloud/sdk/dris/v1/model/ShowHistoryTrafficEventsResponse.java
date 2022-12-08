package com.huaweicloud.sdk.dris.v1.model;

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
public class ShowHistoryTrafficEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<HistoryTrafficEventDTO> events = null;

    public ShowHistoryTrafficEventsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * **参数说明**：条件查询返回的总条数。
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowHistoryTrafficEventsResponse withEvents(List<HistoryTrafficEventDTO> events) {
        this.events = events;
        return this;
    }

    public ShowHistoryTrafficEventsResponse addEventsItem(HistoryTrafficEventDTO eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public ShowHistoryTrafficEventsResponse withEvents(Consumer<List<HistoryTrafficEventDTO>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * **参数说明**：事件列表。
     * @return events
     */
    public List<HistoryTrafficEventDTO> getEvents() {
        return events;
    }

    public void setEvents(List<HistoryTrafficEventDTO> events) {
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
        ShowHistoryTrafficEventsResponse showHistoryTrafficEventsResponse = (ShowHistoryTrafficEventsResponse) o;
        return Objects.equals(this.count, showHistoryTrafficEventsResponse.count)
            && Objects.equals(this.events, showHistoryTrafficEventsResponse.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHistoryTrafficEventsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
