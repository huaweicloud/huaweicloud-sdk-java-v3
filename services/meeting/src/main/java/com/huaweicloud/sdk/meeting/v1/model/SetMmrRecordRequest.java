package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class SetMmrRecordRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Conference-Authorization")

    private String xConferenceAuthorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private RestSetMmrRecordReqBody body;

    public SetMmrRecordRequest withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    /**
     * 会议ID。
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public SetMmrRecordRequest withXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
        return this;
    }

    /**
     * 会控Token，通过[[获取会控token](https://support.huaweicloud.com/api-meeting/meeting_21_0027.html)](tag:hws)[[获取会控token](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0027.html)](tag:hk)接口获得。
     * @return xConferenceAuthorization
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Conference-Authorization")
    public String getXConferenceAuthorization() {
        return xConferenceAuthorization;
    }

    public void setXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
    }

    public SetMmrRecordRequest withBody(RestSetMmrRecordReqBody body) {
        this.body = body;
        return this;
    }

    public SetMmrRecordRequest withBody(Consumer<RestSetMmrRecordReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new RestSetMmrRecordReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RestSetMmrRecordReqBody getBody() {
        return body;
    }

    public void setBody(RestSetMmrRecordReqBody body) {
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
        SetMmrRecordRequest that = (SetMmrRecordRequest) obj;
        return Objects.equals(this.conferenceID, that.conferenceID)
            && Objects.equals(this.xConferenceAuthorization, that.xConferenceAuthorization)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, xConferenceAuthorization, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetMmrRecordRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    xConferenceAuthorization: ").append(toIndentedString(xConferenceAuthorization)).append("\n");
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
