package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CancelMeetingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    @JacksonXmlProperty(localName = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userUUID")

    @JacksonXmlProperty(localName = "userUUID")

    private String userUUID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Authorization-Type")

    @JacksonXmlProperty(localName = "X-Authorization-Type")

    private String xAuthorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site-Id")

    @JacksonXmlProperty(localName = "X-Site-Id")

    private String xSiteId;

    public CancelMeetingRequest withConferenceID(String conferenceID) {
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

    public CancelMeetingRequest withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * 用户的UUID（已在USG注册过的）
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public CancelMeetingRequest withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 取消会议操作类型，1表示需要结束在线会议。
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CancelMeetingRequest withXAuthorizationType(String xAuthorizationType) {
        this.xAuthorizationType = xAuthorizationType;
        return this;
    }

    /**
     * 标识是否为第三方portal过来的请求。
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

    public CancelMeetingRequest withXSiteId(String xSiteId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelMeetingRequest cancelMeetingRequest = (CancelMeetingRequest) o;
        return Objects.equals(this.conferenceID, cancelMeetingRequest.conferenceID)
            && Objects.equals(this.userUUID, cancelMeetingRequest.userUUID)
            && Objects.equals(this.type, cancelMeetingRequest.type)
            && Objects.equals(this.xAuthorizationType, cancelMeetingRequest.xAuthorizationType)
            && Objects.equals(this.xSiteId, cancelMeetingRequest.xSiteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, userUUID, type, xAuthorizationType, xSiteId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelMeetingRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    xAuthorizationType: ").append(toIndentedString(xAuthorizationType)).append("\n");
        sb.append("    xSiteId: ").append(toIndentedString(xSiteId)).append("\n");
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
