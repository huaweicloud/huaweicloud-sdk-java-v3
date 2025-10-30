package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SendVerificationCodeV2Req
 */
public class SendVerificationCodeV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "receiver_type")

    private Integer receiverType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lang")

    private String lang;

    public SendVerificationCodeV2Req withReceiverType(Integer receiverType) {
        this.receiverType = receiverType;
        return this;
    }

    /**
     * 发送验证码的类型： 2：发送邮件验证码
     * minimum: 1
     * maximum: 2
     * @return receiverType
     */
    public Integer getReceiverType() {
        return receiverType;
    }

    public void setReceiverType(Integer receiverType) {
        this.receiverType = receiverType;
    }

    public SendVerificationCodeV2Req withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 验证码超时时间。此参数不携带或携带值为null时，采用系统默认超时时间10分钟。此参数值超过60时，取值固定为5分钟。单位：分钟
     * minimum: 1
     * maximum: 3000
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public SendVerificationCodeV2Req withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 指定发送验证码的邮箱地址。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SendVerificationCodeV2Req withLang(String lang) {
        this.lang = lang;
        return this;
    }

    /**
     * 根据该参数的取值选择发送邮件验证码的语言。 zh-cn：中文en-us：英文
     * @return lang
     */
    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SendVerificationCodeV2Req that = (SendVerificationCodeV2Req) obj;
        return Objects.equals(this.receiverType, that.receiverType) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.email, that.email) && Objects.equals(this.lang, that.lang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receiverType, timeout, email, lang);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SendVerificationCodeV2Req {\n");
        sb.append("    receiverType: ").append(toIndentedString(receiverType)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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
