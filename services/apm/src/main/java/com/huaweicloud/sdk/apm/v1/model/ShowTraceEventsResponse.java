package com.huaweicloud.sdk.apm.v1.model;

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
public class ShowTraceEventsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span_event_list")

    @JacksonXmlProperty(localName = "span_event_list")

    private List<SpanEventInfo> spanEventList = null;

    public ShowTraceEventsResponse withSpanEventList(List<SpanEventInfo> spanEventList) {
        this.spanEventList = spanEventList;
        return this;
    }

    public ShowTraceEventsResponse addSpanEventListItem(SpanEventInfo spanEventListItem) {
        if (this.spanEventList == null) {
            this.spanEventList = new ArrayList<>();
        }
        this.spanEventList.add(spanEventListItem);
        return this;
    }

    public ShowTraceEventsResponse withSpanEventList(Consumer<List<SpanEventInfo>> spanEventListSetter) {
        if (this.spanEventList == null) {
            this.spanEventList = new ArrayList<>();
        }
        spanEventListSetter.accept(this.spanEventList);
        return this;
    }

    /**
     * span event信息列表
     * @return spanEventList
     */
    public List<SpanEventInfo> getSpanEventList() {
        return spanEventList;
    }

    public void setSpanEventList(List<SpanEventInfo> spanEventList) {
        this.spanEventList = spanEventList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTraceEventsResponse showTraceEventsResponse = (ShowTraceEventsResponse) o;
        return Objects.equals(this.spanEventList, showTraceEventsResponse.spanEventList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spanEventList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTraceEventsResponse {\n");
        sb.append("    spanEventList: ").append(toIndentedString(spanEventList)).append("\n");
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
