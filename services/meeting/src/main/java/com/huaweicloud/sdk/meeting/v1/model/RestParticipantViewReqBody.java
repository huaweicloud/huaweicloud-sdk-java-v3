package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会场选看请求。
 */
public class RestParticipantViewReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "viewType")

    private Integer viewType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    private String participantID;

    public RestParticipantViewReqBody withViewType(Integer viewType) {
        this.viewType = viewType;
        return this;
    }

    /**
     * 选看类型。 - 2: 选看会场
     * @return viewType
     */
    public Integer getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

    public RestParticipantViewReqBody withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /**
     * 被选看的与会者标识。
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
        RestParticipantViewReqBody restParticipantViewReqBody = (RestParticipantViewReqBody) o;
        return Objects.equals(this.viewType, restParticipantViewReqBody.viewType)
            && Objects.equals(this.participantID, restParticipantViewReqBody.participantID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(viewType, participantID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestParticipantViewReqBody {\n");
        sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
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
