package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEventStreamingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventstreaming_id")

    private String eventstreamingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EventStreamingUpdateReq body;

    public UpdateEventStreamingRequest withEventstreamingId(String eventstreamingId) {
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

    public UpdateEventStreamingRequest withBody(EventStreamingUpdateReq body) {
        this.body = body;
        return this;
    }

    public UpdateEventStreamingRequest withBody(Consumer<EventStreamingUpdateReq> bodySetter) {
        if (this.body == null) {
            this.body = new EventStreamingUpdateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EventStreamingUpdateReq getBody() {
        return body;
    }

    public void setBody(EventStreamingUpdateReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEventStreamingRequest updateEventStreamingRequest = (UpdateEventStreamingRequest) o;
        return Objects.equals(this.eventstreamingId, updateEventStreamingRequest.eventstreamingId)
            && Objects.equals(this.body, updateEventStreamingRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventstreamingId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEventStreamingRequest {\n");
        sb.append("    eventstreamingId: ").append(toIndentedString(eventstreamingId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
