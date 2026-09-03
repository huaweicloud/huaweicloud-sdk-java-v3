package com.huaweicloud.sdk.das.v3.model;

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
public class ShowBinlogParseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_list")

    private List<EventEventsDto> eventList = null;

    public ShowBinlogParseResponse withEventList(List<EventEventsDto> eventList) {
        this.eventList = eventList;
        return this;
    }

    public ShowBinlogParseResponse addEventListItem(EventEventsDto eventListItem) {
        if (this.eventList == null) {
            this.eventList = new ArrayList<>();
        }
        this.eventList.add(eventListItem);
        return this;
    }

    public ShowBinlogParseResponse withEventList(Consumer<List<EventEventsDto>> eventListSetter) {
        if (this.eventList == null) {
            this.eventList = new ArrayList<>();
        }
        eventListSetter.accept(this.eventList);
        return this;
    }

    /**
     * binlog事件概览信息
     * @return eventList
     */
    public List<EventEventsDto> getEventList() {
        return eventList;
    }

    public void setEventList(List<EventEventsDto> eventList) {
        this.eventList = eventList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBinlogParseResponse that = (ShowBinlogParseResponse) obj;
        return Objects.equals(this.eventList, that.eventList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBinlogParseResponse {\n");
        sb.append("    eventList: ").append(toIndentedString(eventList)).append("\n");
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
