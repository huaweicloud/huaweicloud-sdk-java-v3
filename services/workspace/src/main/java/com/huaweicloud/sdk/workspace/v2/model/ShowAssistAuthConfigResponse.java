package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAssistAuthConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "otp_config_info")

    private OtpConfigInfo otpConfigInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_auth_config_id")

    private String mainAuthConfigId;

    public ShowAssistAuthConfigResponse withOtpConfigInfo(OtpConfigInfo otpConfigInfo) {
        this.otpConfigInfo = otpConfigInfo;
        return this;
    }

    public ShowAssistAuthConfigResponse withOtpConfigInfo(Consumer<OtpConfigInfo> otpConfigInfoSetter) {
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

    public ShowAssistAuthConfigResponse withMainAuthConfigId(String mainAuthConfigId) {
        this.mainAuthConfigId = mainAuthConfigId;
        return this;
    }

    /**
     * 主认证配置id
     * @return mainAuthConfigId
     */
    public String getMainAuthConfigId() {
        return mainAuthConfigId;
    }

    public void setMainAuthConfigId(String mainAuthConfigId) {
        this.mainAuthConfigId = mainAuthConfigId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAssistAuthConfigResponse that = (ShowAssistAuthConfigResponse) obj;
        return Objects.equals(this.otpConfigInfo, that.otpConfigInfo)
            && Objects.equals(this.mainAuthConfigId, that.mainAuthConfigId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otpConfigInfo, mainAuthConfigId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssistAuthConfigResponse {\n");
        sb.append("    otpConfigInfo: ").append(toIndentedString(otpConfigInfo)).append("\n");
        sb.append("    mainAuthConfigId: ").append(toIndentedString(mainAuthConfigId)).append("\n");
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
