package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RestAllowWaitingParticipantReqBody
 */
public class RestAllowWaitingParticipantReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participantID")

    private String participantID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowAll")

    private Boolean allowAll;

    public RestAllowWaitingParticipantReqBody withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    /**
     * 等候室成员标志。通过监听[[会议级事件推送中的“等候室成员列表信息”](https://support.huaweicloud.com/api-meeting/meeting_21_1507.html)](tag:hws)[[会议级事件推送中的“等候室成员列表信息”](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_1507.html)](tag:hk)事件获得。 
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    public RestAllowWaitingParticipantReqBody withAllowAll(Boolean allowAll) {
        this.allowAll = allowAll;
        return this;
    }

    /**
     * 允许所有等候者入会。 * false：指定等候者 * true：所有等候者入会 
     * @return allowAll
     */
    public Boolean getAllowAll() {
        return allowAll;
    }

    public void setAllowAll(Boolean allowAll) {
        this.allowAll = allowAll;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestAllowWaitingParticipantReqBody restAllowWaitingParticipantReqBody = (RestAllowWaitingParticipantReqBody) o;
        return Objects.equals(this.participantID, restAllowWaitingParticipantReqBody.participantID)
            && Objects.equals(this.allowAll, restAllowWaitingParticipantReqBody.allowAll);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantID, allowAll);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestAllowWaitingParticipantReqBody {\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
        sb.append("    allowAll: ").append(toIndentedString(allowAll)).append("\n");
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
