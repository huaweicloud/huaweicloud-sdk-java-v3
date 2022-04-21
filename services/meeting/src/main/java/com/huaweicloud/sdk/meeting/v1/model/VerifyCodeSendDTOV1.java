package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VerifyCodeSendDTOV1
 */
public class VerifyCodeSendDTOV1 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sendMethod")

    private String sendMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    public VerifyCodeSendDTOV1 withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * 用户身份信息（手机号码或邮箱账号或用户真实账号） 说明：必须和发送滑块验证码时带的用户身份信息相同。 maxLength：255 minLength：1 
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public VerifyCodeSendDTOV1 withSendMethod(String sendMethod) {
        this.sendMethod = sendMethod;
        return this;
    }

    /**
     * 验证码发送方式 user类型是用户真实账号时必选；如果没有选择的话，优先短信方式。 * sms：短信方式 * email：邮件方式 
     * @return sendMethod
     */
    public String getSendMethod() {
        return sendMethod;
    }

    public void setSendMethod(String sendMethod) {
        this.sendMethod = sendMethod;
    }

    public VerifyCodeSendDTOV1 withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * 校验滑块验证码返回的token字符串。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VerifyCodeSendDTOV1 verifyCodeSendDTOV1 = (VerifyCodeSendDTOV1) o;
        return Objects.equals(this.user, verifyCodeSendDTOV1.user)
            && Objects.equals(this.sendMethod, verifyCodeSendDTOV1.sendMethod)
            && Objects.equals(this.token, verifyCodeSendDTOV1.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, sendMethod, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VerifyCodeSendDTOV1 {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    sendMethod: ").append(toIndentedString(sendMethod)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
