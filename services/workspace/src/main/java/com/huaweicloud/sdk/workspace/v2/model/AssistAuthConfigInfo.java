package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 辅助认证配置信息。
 */
public class AssistAuthConfigInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private String authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "otp_config_info")

    private OtpConfigInfo otpConfigInfo;

    public AssistAuthConfigInfo withAuthType(String authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 当前激活的辅助认证类型。
     * @return authType
     */
    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public AssistAuthConfigInfo withOtpConfigInfo(OtpConfigInfo otpConfigInfo) {
        this.otpConfigInfo = otpConfigInfo;
        return this;
    }

    public AssistAuthConfigInfo withOtpConfigInfo(Consumer<OtpConfigInfo> otpConfigInfoSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssistAuthConfigInfo that = (AssistAuthConfigInfo) obj;
        return Objects.equals(this.authType, that.authType) && Objects.equals(this.otpConfigInfo, that.otpConfigInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authType, otpConfigInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssistAuthConfigInfo {\n");
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
