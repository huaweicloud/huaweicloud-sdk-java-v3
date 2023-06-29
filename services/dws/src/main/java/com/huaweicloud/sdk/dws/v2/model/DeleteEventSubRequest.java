package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEventSubRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_sub_id")

    private String eventSubId;

    public DeleteEventSubRequest withEventSubId(String eventSubId) {
        this.eventSubId = eventSubId;
        return this;
    }

    /**
     * 事件订阅ID
     * @return eventSubId
     */
    public String getEventSubId() {
        return eventSubId;
    }

    public void setEventSubId(String eventSubId) {
        this.eventSubId = eventSubId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteEventSubRequest that = (DeleteEventSubRequest) obj;
        return Objects.equals(this.eventSubId, that.eventSubId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSubId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEventSubRequest {\n");
        sb.append("    eventSubId: ").append(toIndentedString(eventSubId)).append("\n");
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
