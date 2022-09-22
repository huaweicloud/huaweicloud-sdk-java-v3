package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 静音与会者请求。
 */
public class RestMuteParticipantReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isMute")

    private Integer isMute;

    public RestMuteParticipantReqBody withIsMute(Integer isMute) {
        this.isMute = isMute;
        return this;
    }

    /**
     * - 0: 取消静音 - 1: 静音
     * @return isMute
     */
    public Integer getIsMute() {
        return isMute;
    }

    public void setIsMute(Integer isMute) {
        this.isMute = isMute;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestMuteParticipantReqBody restMuteParticipantReqBody = (RestMuteParticipantReqBody) o;
        return Objects.equals(this.isMute, restMuteParticipantReqBody.isMute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isMute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestMuteParticipantReqBody {\n");
        sb.append("    isMute: ").append(toIndentedString(isMute)).append("\n");
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
