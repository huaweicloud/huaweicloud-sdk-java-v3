package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SecureChannelBandwidthPercentageOptions
 */
public class SecureChannelBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secure_channel_bandwidth_percentage_value")

    private Integer secureChannelBandwidthPercentageValue;

    public SecureChannelBandwidthPercentageOptions withSecureChannelBandwidthPercentageValue(
        Integer secureChannelBandwidthPercentageValue) {
        this.secureChannelBandwidthPercentageValue = secureChannelBandwidthPercentageValue;
        return this;
    }

    /**
     * 安全通道带宽百分比控制量（%）。取值范围为[0-100]。默认：30。
     * minimum: 0
     * maximum: 100
     * @return secureChannelBandwidthPercentageValue
     */
    public Integer getSecureChannelBandwidthPercentageValue() {
        return secureChannelBandwidthPercentageValue;
    }

    public void setSecureChannelBandwidthPercentageValue(Integer secureChannelBandwidthPercentageValue) {
        this.secureChannelBandwidthPercentageValue = secureChannelBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SecureChannelBandwidthPercentageOptions that = (SecureChannelBandwidthPercentageOptions) obj;
        return Objects.equals(this.secureChannelBandwidthPercentageValue, that.secureChannelBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secureChannelBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecureChannelBandwidthPercentageOptions {\n");
        sb.append("    secureChannelBandwidthPercentageValue: ")
            .append(toIndentedString(secureChannelBandwidthPercentageValue))
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
