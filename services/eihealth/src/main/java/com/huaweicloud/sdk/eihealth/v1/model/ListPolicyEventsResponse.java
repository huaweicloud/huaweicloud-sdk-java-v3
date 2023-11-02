package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListPolicyEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    private List<PolicyEventRsp> events = null;

    public ListPolicyEventsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 策略事件总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListPolicyEventsResponse withEvents(List<PolicyEventRsp> events) {
        this.events = events;
        return this;
    }

    public ListPolicyEventsResponse addEventsItem(PolicyEventRsp eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public ListPolicyEventsResponse withEvents(Consumer<List<PolicyEventRsp>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 策略事件列表
     * @return events
     */
    public List<PolicyEventRsp> getEvents() {
        return events;
    }

    public void setEvents(List<PolicyEventRsp> events) {
        this.events = events;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPolicyEventsResponse that = (ListPolicyEventsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.events, that.events);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, events);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyEventsResponse {\n");
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
