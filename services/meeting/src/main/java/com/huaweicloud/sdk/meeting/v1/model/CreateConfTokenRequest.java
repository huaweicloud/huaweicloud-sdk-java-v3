package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class CreateConfTokenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conferenceID")

    private String conferenceID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Conference-Authorization")

    private String xConferenceAuthorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Password")

    private String xPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Login-Type")

    private Integer xLoginType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Nonce")

    private String xNonce;

    public CreateConfTokenRequest withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    /** 会议ID。
     * 
     * @return conferenceID */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    public CreateConfTokenRequest withXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
        return this;
    }

    /** 如果携带该值，则表示是保活消息，如果会话已过期并且请求中携带了密码，则进行重新鉴权并回复新的会话标识。 该头域统一为BASE64编码。
     * 
     * @return xConferenceAuthorization */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Conference-Authorization")
    public String getXConferenceAuthorization() {
        return xConferenceAuthorization;
    }

    public void setXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
    }

    public CreateConfTokenRequest withXPassword(String xPassword) {
        this.xPassword = xPassword;
        return this;
    }

    /** 会议的主持人密码。 从创建会议的返回响应参数获取。 对于会控Token保活场景，可以不携带会议密码。
     * 
     * @return xPassword */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Password")
    public String getXPassword() {
        return xPassword;
    }

    public void setXPassword(String xPassword) {
        this.xPassword = xPassword;
    }

    public CreateConfTokenRequest withXLoginType(Integer xLoginType) {
        this.xLoginType = xLoginType;
        return this;
    }

    /** 请求类型。 - 1: 业务固定为1。
     * 
     * @return xLoginType */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Login-Type")
    public Integer getXLoginType() {
        return xLoginType;
    }

    public void setXLoginType(Integer xLoginType) {
        this.xLoginType = xLoginType;
    }

    public CreateConfTokenRequest withXNonce(String xNonce) {
        this.xNonce = xNonce;
        return this;
    }

    /** 用户临时nonce token。
     * 
     * @return xNonce */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Nonce")
    public String getXNonce() {
        return xNonce;
    }

    public void setXNonce(String xNonce) {
        this.xNonce = xNonce;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConfTokenRequest createConfTokenRequest = (CreateConfTokenRequest) o;
        return Objects.equals(this.conferenceID, createConfTokenRequest.conferenceID)
            && Objects.equals(this.xConferenceAuthorization, createConfTokenRequest.xConferenceAuthorization)
            && Objects.equals(this.xPassword, createConfTokenRequest.xPassword)
            && Objects.equals(this.xLoginType, createConfTokenRequest.xLoginType)
            && Objects.equals(this.xNonce, createConfTokenRequest.xNonce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, xConferenceAuthorization, xPassword, xLoginType, xNonce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfTokenRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    xConferenceAuthorization: ").append(toIndentedString(xConferenceAuthorization)).append("\n");
        sb.append("    xPassword: ").append(toIndentedString(xPassword)).append("\n");
        sb.append("    xLoginType: ").append(toIndentedString(xLoginType)).append("\n");
        sb.append("    xNonce: ").append(toIndentedString(xNonce)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
