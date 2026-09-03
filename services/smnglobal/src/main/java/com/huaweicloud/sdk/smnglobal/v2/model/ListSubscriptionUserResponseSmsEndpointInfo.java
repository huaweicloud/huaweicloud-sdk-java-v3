package com.huaweicloud.sdk.smnglobal.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListSubscriptionUserResponseSmsEndpointInfo
 */
public class ListSubscriptionUserResponseSmsEndpointInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_code_enabled")

    private Boolean verificationCodeEnabled;

    public ListSubscriptionUserResponseSmsEndpointInfo withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * 终端地址。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ListSubscriptionUserResponseSmsEndpointInfo withVerificationCodeEnabled(Boolean verificationCodeEnabled) {
        this.verificationCodeEnabled = verificationCodeEnabled;
        return this;
    }

    /**
     * 是否启用验证码发送确认短信，默认为false。
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
        ListSubscriptionUserResponseSmsEndpointInfo that = (ListSubscriptionUserResponseSmsEndpointInfo) obj;
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
        sb.append("class ListSubscriptionUserResponseSmsEndpointInfo {\n");
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
