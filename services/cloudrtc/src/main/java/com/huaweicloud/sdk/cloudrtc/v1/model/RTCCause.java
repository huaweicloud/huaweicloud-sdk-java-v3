package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RTCCause
 */
public class RTCCause {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ts")

    private String ts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_id")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_id")

    private String peerId;

    public RTCCause withTs(String ts) {
        this.ts = ts;
        return this;
    }

    /**
     * 异常事件的时间戳 
     * @return ts
     */
    public String getTs() {
        return ts;
    }

    public void setTs(String ts) {
        this.ts = ts;
    }

    public RTCCause withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * 异常事件ID 
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public RTCCause withPeerId(String peerId) {
        this.peerId = peerId;
        return this;
    }

    /**
     * 对端的用户ID 
     * @return peerId
     */
    public String getPeerId() {
        return peerId;
    }

    public void setPeerId(String peerId) {
        this.peerId = peerId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RTCCause that = (RTCCause) obj;
        return Objects.equals(this.ts, that.ts) && Objects.equals(this.eventId, that.eventId)
            && Objects.equals(this.peerId, that.peerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ts, eventId, peerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RTCCause {\n");
        sb.append("    ts: ").append(toIndentedString(ts)).append("\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
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
