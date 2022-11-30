package com.huaweicloud.sdk.mpc.v1.model;

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
public class ListNotifyEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_name")

    private List<String> eventName = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListNotifyEventResponse withEventName(List<String> eventName) {
        this.eventName = eventName;
        return this;
    }

    public ListNotifyEventResponse addEventNameItem(String eventNameItem) {
        if (this.eventName == null) {
            this.eventName = new ArrayList<>();
        }
        this.eventName.add(eventNameItem);
        return this;
    }

    public ListNotifyEventResponse withEventName(Consumer<List<String>> eventNameSetter) {
        if (this.eventName == null) {
            this.eventName = new ArrayList<>();
        }
        eventNameSetter.accept(this.eventName);
        return this;
    }

    /**
     * 事件名称
     * @return eventName
     */
    public List<String> getEventName() {
        return eventName;
    }

    public void setEventName(List<String> eventName) {
        this.eventName = eventName;
    }

    public ListNotifyEventResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 点播通知事件总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNotifyEventResponse listNotifyEventResponse = (ListNotifyEventResponse) o;
        return Objects.equals(this.eventName, listNotifyEventResponse.eventName)
            && Objects.equals(this.total, listNotifyEventResponse.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotifyEventResponse {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
