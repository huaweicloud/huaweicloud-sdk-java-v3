package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AuthorizeScheduledEventRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AuthorizeScheduledEventRequestBody body;

    public AuthorizeScheduledEventRequest withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 计划事件id。
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public AuthorizeScheduledEventRequest withBody(AuthorizeScheduledEventRequestBody body) {
        this.body = body;
        return this;
    }

    public AuthorizeScheduledEventRequest withBody(Consumer<AuthorizeScheduledEventRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AuthorizeScheduledEventRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AuthorizeScheduledEventRequestBody getBody() {
        return body;
    }

    public void setBody(AuthorizeScheduledEventRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizeScheduledEventRequest that = (AuthorizeScheduledEventRequest) obj;
        return Objects.equals(this.eventId, that.eventId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizeScheduledEventRequest {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
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
