package com.huaweicloud.sdk.smnglobal.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateSubscriptionUserRequestCallnotifyEndpointInfo
 */
public class CreateSubscriptionUserRequestCallnotifyEndpointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_code_enabled")

    private Boolean verificationCodeEnabled;

    public CreateSubscriptionUserRequestCallnotifyEndpointInfo withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 终端地址。必须是一个电话号码。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public CreateSubscriptionUserRequestCallnotifyEndpointInfo withVerificationCodeEnabled(
        Boolean verificationCodeEnabled) {
        this.verificationCodeEnabled = verificationCodeEnabled;
        return this;
    }

    /**
     * 是否启用验证码，默认为false。当protocol值为sms或callnotify，且该字段值设置为true时，发送订阅确认短信为验证码格式；该字段为false或者不存在时，发送的订阅确认短信为超链接格式。当protocol值为其他协议时，该字段不生效
     * @return verificationCodeEnabled
     */
    public Boolean getVerificationCodeEnabled() {
        return verificationCodeEnabled;
    }

    public void setVerificationCodeEnabled(Boolean verificationCodeEnabled) {
        this.verificationCodeEnabled = verificationCodeEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSubscriptionUserRequestCallnotifyEndpointInfo that =
            (CreateSubscriptionUserRequestCallnotifyEndpointInfo) obj;
        return Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.verificationCodeEnabled, that.verificationCodeEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, verificationCodeEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubscriptionUserRequestCallnotifyEndpointInfo {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    verificationCodeEnabled: ").append(toIndentedString(verificationCodeEnabled)).append("\n");
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
