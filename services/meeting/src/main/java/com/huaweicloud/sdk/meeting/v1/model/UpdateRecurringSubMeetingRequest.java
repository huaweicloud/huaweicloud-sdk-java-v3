package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateRecurringSubMeetingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")

    @JacksonXmlProperty(localName = "X-Authorization-Type")

    private String xAuthorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userUUID")

    @JacksonXmlProperty(localName = "userUUID")

    private String userUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")

    @JacksonXmlProperty(localName = "X-Site-Id")

    private String xSiteId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    @JacksonXmlProperty(localName = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private RestScheduleCycleConfDTO body;

    public UpdateRecurringSubMeetingRequest withXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
        return this;
    }

    /**
     * 标识是否为第三方portal过来的请求
     * @return xAuthorizationType
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")
    public String getXAuthorizationType() {
        return xAuthorizationType;
    }

    public void setXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
    }

    public UpdateRecurringSubMeetingRequest withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * 用户的uuid（已在USG注册过的）
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public UpdateRecurringSubMeetingRequest withXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
        return this;
    }

    /**
     * 用于区分到哪个HCSO站点鉴权。
     * @return xSiteId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")
    public String getXSiteId() {
        return xSiteId;
    }

    public void setXSiteId(String xSiteId) {
        this.xSiteId = xSiteId;
    }

    public UpdateRecurringSubMeetingRequest withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    /**
     * 会议标识
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public UpdateRecurringSubMeetingRequest withBody(RestScheduleCycleConfDTO body) {
        this.body = body;
        return this;
    }

    public UpdateRecurringSubMeetingRequest withBody(Consumer<RestScheduleCycleConfDTO> bodySetter) {
        if (this.body == null) {
            this.body = new RestScheduleCycleConfDTO();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public RestScheduleCycleConfDTO getBody() {
        return body;
    }

    public void setBody(RestScheduleCycleConfDTO body) {
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
        UpdateRecurringSubMeetingRequest updateRecurringSubMeetingRequest = (UpdateRecurringSubMeetingRequest) o;
        return Objects.equals(this.xAuthorizationType, updateRecurringSubMeetingRequest.xAuthorizationType)
            && Objects.equals(this.userUUID, updateRecurringSubMeetingRequest.userUUID)
            && Objects.equals(this.xSiteId, updateRecurringSubMeetingRequest.xSiteId)
            && Objects.equals(this.conferenceID, updateRecurringSubMeetingRequest.conferenceID)
            && Objects.equals(this.body, updateRecurringSubMeetingRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAuthorizationType, userUUID, xSiteId, conferenceID, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecurringSubMeetingRequest {\n");
        sb.append("    xAuthorizationType: ").append(toIndentedString(xAuthorizationType)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    xSiteId: ").append(toIndentedString(xSiteId)).append("\n");
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
