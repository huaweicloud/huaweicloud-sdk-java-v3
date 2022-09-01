package com.huaweicloud.sdk.ces.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "events")

    @JacksonXmlProperty(localName = "events")

    private List<EventInfo> events = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_data")

    @JacksonXmlProperty(localName = "meta_data")

    private TotalMetaData metaData;

    public ListEventsResponse withEvents(List<EventInfo> events) {
        this.events = events;
        return this;
    }

    public ListEventsResponse addEventsItem(EventInfo eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    public ListEventsResponse withEvents(Consumer<List<EventInfo>> eventsSetter) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        eventsSetter.accept(this.events);
        return this;
    }

    /**
     * 一条或者多条事件数据。
     * @return events
     */
    public List<EventInfo> getEvents() {
        return events;
    }

    public void setEvents(List<EventInfo> events) {
        this.events = events;
    }

    public ListEventsResponse withMetaData(TotalMetaData metaData) {
        this.metaData = metaData;
        return this;
    }

    public ListEventsResponse withMetaData(Consumer<TotalMetaData> metaDataSetter) {
        if (this.metaData == null) {
            this.metaData = new TotalMetaData();
            metaDataSetter.accept(this.metaData);
        }

        return this;
    }

    /**
     * Get metaData
     * @return metaData
     */
    public TotalMetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(TotalMetaData metaData) {
        this.metaData = metaData;
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
        return Objects.equals(this.events, listEventsResponse.events)
            && Objects.equals(this.metaData, listEventsResponse.metaData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(events, metaData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEventsResponse {\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
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
