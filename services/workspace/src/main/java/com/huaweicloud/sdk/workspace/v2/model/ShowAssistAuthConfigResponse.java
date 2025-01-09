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
    @JsonProperty(value = "radius_config_info")

    private RadiusConfigInfo radiusConfigInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "radius_gateway_config_info")

    private RadiusGatewayConfigInfo radiusGatewayConfigInfo;

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

    public ShowAssistAuthConfigResponse withRadiusConfigInfo(RadiusConfigInfo radiusConfigInfo) {
        this.radiusConfigInfo = radiusConfigInfo;
        return this;
    }

    public ShowAssistAuthConfigResponse withRadiusConfigInfo(Consumer<RadiusConfigInfo> radiusConfigInfoSetter) {
        if (this.radiusConfigInfo == null) {
            this.radiusConfigInfo = new RadiusConfigInfo();
            radiusConfigInfoSetter.accept(this.radiusConfigInfo);
        }

        return this;
    }

    /**
     * Get radiusConfigInfo
     * @return radiusConfigInfo
     */
    public RadiusConfigInfo getRadiusConfigInfo() {
        return radiusConfigInfo;
    }

    public void setRadiusConfigInfo(RadiusConfigInfo radiusConfigInfo) {
        this.radiusConfigInfo = radiusConfigInfo;
    }

    public ShowAssistAuthConfigResponse withRadiusGatewayConfigInfo(RadiusGatewayConfigInfo radiusGatewayConfigInfo) {
        this.radiusGatewayConfigInfo = radiusGatewayConfigInfo;
        return this;
    }

    public ShowAssistAuthConfigResponse withRadiusGatewayConfigInfo(
        Consumer<RadiusGatewayConfigInfo> radiusGatewayConfigInfoSetter) {
        if (this.radiusGatewayConfigInfo == null) {
            this.radiusGatewayConfigInfo = new RadiusGatewayConfigInfo();
            radiusGatewayConfigInfoSetter.accept(this.radiusGatewayConfigInfo);
        }

        return this;
    }

    /**
     * Get radiusGatewayConfigInfo
     * @return radiusGatewayConfigInfo
     */
    public RadiusGatewayConfigInfo getRadiusGatewayConfigInfo() {
        return radiusGatewayConfigInfo;
    }

    public void setRadiusGatewayConfigInfo(RadiusGatewayConfigInfo radiusGatewayConfigInfo) {
        this.radiusGatewayConfigInfo = radiusGatewayConfigInfo;
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
            && Objects.equals(this.radiusConfigInfo, that.radiusConfigInfo)
            && Objects.equals(this.radiusGatewayConfigInfo, that.radiusGatewayConfigInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otpConfigInfo, radiusConfigInfo, radiusGatewayConfigInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssistAuthConfigResponse {\n");
        sb.append("    otpConfigInfo: ").append(toIndentedString(otpConfigInfo)).append("\n");
        sb.append("    radiusConfigInfo: ").append(toIndentedString(radiusConfigInfo)).append("\n");
        sb.append("    radiusGatewayConfigInfo: ").append(toIndentedString(radiusGatewayConfigInfo)).append("\n");
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
