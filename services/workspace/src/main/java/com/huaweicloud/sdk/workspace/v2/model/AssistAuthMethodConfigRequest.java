package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 辅助认证策略请求
 */
public class AssistAuthMethodConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthAssistEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "otp_config_info")

    private OtpConfigInfo otpConfigInfo;

    public AssistAuthMethodConfigRequest withAuthType(AuthAssistEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * Get authType
     * @return authType
     */
    public AuthAssistEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthAssistEnum authType) {
        this.authType = authType;
    }

    public AssistAuthMethodConfigRequest withOtpConfigInfo(OtpConfigInfo otpConfigInfo) {
        this.otpConfigInfo = otpConfigInfo;
        return this;
    }

    public AssistAuthMethodConfigRequest withOtpConfigInfo(Consumer<OtpConfigInfo> otpConfigInfoSetter) {
        if (this.otpConfigInfo == null) {
            this.otpConfigInfo = new OtpConfigInfo();
            otpConfigInfoSetter.accept(this.otpConfigInfo);
        }

        return this;
    }

    /**
     * Get otpConfigInfo
     * @return otpConfigInfo
     */
    public OtpConfigInfo getOtpConfigInfo() {
        return otpConfigInfo;
    }

    public void setOtpConfigInfo(OtpConfigInfo otpConfigInfo) {
        this.otpConfigInfo = otpConfigInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssistAuthMethodConfigRequest assistAuthMethodConfigRequest = (AssistAuthMethodConfigRequest) o;
        return Objects.equals(this.authType, assistAuthMethodConfigRequest.authType)
            && Objects.equals(this.otpConfigInfo, assistAuthMethodConfigRequest.otpConfigInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType, otpConfigInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistAuthMethodConfigRequest {\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    otpConfigInfo: ").append(toIndentedString(otpConfigInfo)).append("\n");
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
