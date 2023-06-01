package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ResumeEventStreamingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventstreaming_id")

    private String eventstreamingId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EventStreamingOperateReq body;

    public ResumeEventStreamingRequest withEventstreamingId(String eventstreamingId) {
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

    public ResumeEventStreamingRequest withBody(EventStreamingOperateReq body) {
        this.body = body;
        return this;
    }

    public ResumeEventStreamingRequest withBody(Consumer<EventStreamingOperateReq> bodySetter) {
        if (this.body == null) {
            this.body = new EventStreamingOperateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EventStreamingOperateReq getBody() {
        return body;
    }

    public void setBody(EventStreamingOperateReq body) {
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
        ResumeEventStreamingRequest resumeEventStreamingRequest = (ResumeEventStreamingRequest) o;
        return Objects.equals(this.eventstreamingId, resumeEventStreamingRequest.eventstreamingId)
            && Objects.equals(this.body, resumeEventStreamingRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventstreamingId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResumeEventStreamingRequest {\n");
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
