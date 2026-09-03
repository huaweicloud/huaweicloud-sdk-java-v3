package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SubscriptionExtensionResponse
 */
public class SubscriptionExtensionResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_code_enabled")

    private Boolean verificationCodeEnabled;

    public SubscriptionExtensionResponse withVerificationCodeEnabled(Boolean verificationCodeEnabled) {
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
        SubscriptionExtensionResponse that = (SubscriptionExtensionResponse) obj;
        return Objects.equals(this.verificationCodeEnabled, that.verificationCodeEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(verificationCodeEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscriptionExtensionResponse {\n");
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
