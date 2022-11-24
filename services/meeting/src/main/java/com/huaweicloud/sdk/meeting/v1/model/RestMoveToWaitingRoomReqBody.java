package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RestMoveToWaitingRoomReqBody
 */
public class RestMoveToWaitingRoomReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    private String participantID;

    public RestMoveToWaitingRoomReqBody withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /**
     * 与会者标识。
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestMoveToWaitingRoomReqBody restMoveToWaitingRoomReqBody = (RestMoveToWaitingRoomReqBody) o;
        return Objects.equals(this.participantID, restMoveToWaitingRoomReqBody.participantID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestMoveToWaitingRoomReqBody {\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
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
