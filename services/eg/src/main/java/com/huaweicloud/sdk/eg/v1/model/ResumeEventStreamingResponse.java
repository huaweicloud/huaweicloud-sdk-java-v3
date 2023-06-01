package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ResumeEventStreamingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventStreamingID")

    private String eventStreamingID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ResumeEventStreamingResponse withEventStreamingID(String eventStreamingID) {
        this.eventStreamingID = eventStreamingID;
        return this;
    }

    /**
     * 事件流ID
     * @return eventStreamingID
     */
    public String getEventStreamingID() {
        return eventStreamingID;
    }

    public void setEventStreamingID(String eventStreamingID) {
        this.eventStreamingID = eventStreamingID;
    }

    public ResumeEventStreamingResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResumeEventStreamingResponse resumeEventStreamingResponse = (ResumeEventStreamingResponse) o;
        return Objects.equals(this.eventStreamingID, resumeEventStreamingResponse.eventStreamingID)
            && Objects.equals(this.xRequestId, resumeEventStreamingResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventStreamingID, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResumeEventStreamingResponse {\n");
        sb.append("    eventStreamingID: ").append(toIndentedString(eventStreamingID)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
