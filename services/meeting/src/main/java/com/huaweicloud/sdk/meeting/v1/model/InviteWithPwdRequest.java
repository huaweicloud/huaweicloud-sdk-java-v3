package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class InviteWithPwdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    @JacksonXmlProperty(localName = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private RestInviteWithPwdReqBody body;

    public InviteWithPwdRequest withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    /**
     * 会议ID
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public InviteWithPwdRequest withBody(RestInviteWithPwdReqBody body) {
        this.body = body;
        return this;
    }

    public InviteWithPwdRequest withBody(Consumer<RestInviteWithPwdReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new RestInviteWithPwdReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RestInviteWithPwdReqBody getBody() {
        return body;
    }

    public void setBody(RestInviteWithPwdReqBody body) {
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
        InviteWithPwdRequest inviteWithPwdRequest = (InviteWithPwdRequest) o;
        return Objects.equals(this.conferenceID, inviteWithPwdRequest.conferenceID)
            && Objects.equals(this.body, inviteWithPwdRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteWithPwdRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
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
