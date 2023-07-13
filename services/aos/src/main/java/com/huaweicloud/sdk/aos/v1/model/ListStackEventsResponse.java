package com.huaweicloud.sdk.aos.v1.model;

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
public class ListStackEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stack_events")

    private List<StackEvent> stackEvents = null;

    public ListStackEventsResponse withStackEvents(List<StackEvent> stackEvents) {
        this.stackEvents = stackEvents;
        return this;
    }

    public ListStackEventsResponse addStackEventsItem(StackEvent stackEventsItem) {
        if (this.stackEvents == null) {
            this.stackEvents = new ArrayList<>();
        }
        this.stackEvents.add(stackEventsItem);
        return this;
    }

    public ListStackEventsResponse withStackEvents(Consumer<List<StackEvent>> stackEventsSetter) {
        if (this.stackEvents == null) {
            this.stackEvents = new ArrayList<>();
        }
        stackEventsSetter.accept(this.stackEvents);
        return this;
    }

    /**
     * 资源栈事件列表
     * @return stackEvents
     */
    public List<StackEvent> getStackEvents() {
        return stackEvents;
    }

    public void setStackEvents(List<StackEvent> stackEvents) {
        this.stackEvents = stackEvents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListStackEventsResponse that = (ListStackEventsResponse) obj;
        return Objects.equals(this.stackEvents, that.stackEvents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stackEvents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListStackEventsResponse {\n");
        sb.append("    stackEvents: ").append(toIndentedString(stackEvents)).append("\n");
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
