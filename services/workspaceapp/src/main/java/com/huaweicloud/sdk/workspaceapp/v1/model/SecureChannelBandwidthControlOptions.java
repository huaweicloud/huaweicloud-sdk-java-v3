package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecureChannelBandwidthControlOptions
 */
public class SecureChannelBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secure_channel_bandwidth_control_value")

    private Integer secureChannelBandwidthControlValue;

    public SecureChannelBandwidthControlOptions withSecureChannelBandwidthControlValue(
        Integer secureChannelBandwidthControlValue) {
        this.secureChannelBandwidthControlValue = secureChannelBandwidthControlValue;
        return this;
    }

    /**
     * 安全通道带宽控制量（Kbps）。取值范围为[500-20000]。默认：10000。
     * minimum: 500
     * maximum: 20000
     * @return secureChannelBandwidthControlValue
     */
    public Integer getSecureChannelBandwidthControlValue() {
        return secureChannelBandwidthControlValue;
    }

    public void setSecureChannelBandwidthControlValue(Integer secureChannelBandwidthControlValue) {
        this.secureChannelBandwidthControlValue = secureChannelBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecureChannelBandwidthControlOptions that = (SecureChannelBandwidthControlOptions) obj;
        return Objects.equals(this.secureChannelBandwidthControlValue, that.secureChannelBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secureChannelBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecureChannelBandwidthControlOptions {\n");
        sb.append("    secureChannelBandwidthControlValue: ")
            .append(toIndentedString(secureChannelBandwidthControlValue))
            .append("\n");
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
