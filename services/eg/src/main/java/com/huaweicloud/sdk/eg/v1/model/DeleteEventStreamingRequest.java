package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEventStreamingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventstreaming_id")

    private String eventstreamingId;

    public DeleteEventStreamingRequest withEventstreamingId(String eventstreamingId) {
        this.eventstreamingId = eventstreamingId;
        return this;
    }

    /**
     * 事件流ID
     * @return eventstreamingId
     */
    public String getEventstreamingId() {
        return eventstreamingId;
    }

    public void setEventstreamingId(String eventstreamingId) {
        this.eventstreamingId = eventstreamingId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteEventStreamingRequest deleteEventStreamingRequest = (DeleteEventStreamingRequest) o;
        return Objects.equals(this.eventstreamingId, deleteEventStreamingRequest.eventstreamingId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventstreamingId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEventStreamingRequest {\n");
        sb.append("    eventstreamingId: ").append(toIndentedString(eventstreamingId)).append("\n");
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
