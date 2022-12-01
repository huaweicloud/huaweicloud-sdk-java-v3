package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEventSubRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_sub_id")

    private String eventSubId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private EventSubUpdateRequest body;

    public UpdateEventSubRequest withEventSubId(String eventSubId) {
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

    public UpdateEventSubRequest withBody(EventSubUpdateRequest body) {
        this.body = body;
        return this;
    }

    public UpdateEventSubRequest withBody(Consumer<EventSubUpdateRequest> bodySetter) {
        if (this.body == null) {
            this.body = new EventSubUpdateRequest();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public EventSubUpdateRequest getBody() {
        return body;
    }

    public void setBody(EventSubUpdateRequest body) {
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
        UpdateEventSubRequest updateEventSubRequest = (UpdateEventSubRequest) o;
        return Objects.equals(this.eventSubId, updateEventSubRequest.eventSubId)
            && Objects.equals(this.body, updateEventSubRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSubId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEventSubRequest {\n");
        sb.append("    eventSubId: ").append(toIndentedString(eventSubId)).append("\n");
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
