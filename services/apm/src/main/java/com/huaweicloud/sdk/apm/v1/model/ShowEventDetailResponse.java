package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEventDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_info")

    @JacksonXmlProperty(localName = "event_info")

    private SpanEventInfo eventInfo;

    public ShowEventDetailResponse withEventInfo(SpanEventInfo eventInfo) {
        this.eventInfo = eventInfo;
        return this;
    }

    public ShowEventDetailResponse withEventInfo(Consumer<SpanEventInfo> eventInfoSetter) {
        if (this.eventInfo == null) {
            this.eventInfo = new SpanEventInfo();
            eventInfoSetter.accept(this.eventInfo);
        }

        return this;
    }

    /**
     * Get eventInfo
     * @return eventInfo
     */
    public SpanEventInfo getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(SpanEventInfo eventInfo) {
        this.eventInfo = eventInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEventDetailResponse showEventDetailResponse = (ShowEventDetailResponse) o;
        return Objects.equals(this.eventInfo, showEventDetailResponse.eventInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventDetailResponse {\n");
        sb.append("    eventInfo: ").append(toIndentedString(eventInfo)).append("\n");
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
