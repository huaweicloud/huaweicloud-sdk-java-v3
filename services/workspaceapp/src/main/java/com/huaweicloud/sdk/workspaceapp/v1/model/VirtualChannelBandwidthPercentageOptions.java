package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VirtualChannelBandwidthPercentageOptions
 */
public class VirtualChannelBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_channel_bandwidth_percentage_value")

    private Integer virtualChannelBandwidthPercentageValue;

    public VirtualChannelBandwidthPercentageOptions withVirtualChannelBandwidthPercentageValue(
        Integer virtualChannelBandwidthPercentageValue) {
        this.virtualChannelBandwidthPercentageValue = virtualChannelBandwidthPercentageValue;
        return this;
    }

    /**
     * 虚拟通道带宽百分比控制量（%）。取值范围为[0-100]。默认：65。
     * minimum: 0
     * maximum: 100
     * @return virtualChannelBandwidthPercentageValue
     */
    public Integer getVirtualChannelBandwidthPercentageValue() {
        return virtualChannelBandwidthPercentageValue;
    }

    public void setVirtualChannelBandwidthPercentageValue(Integer virtualChannelBandwidthPercentageValue) {
        this.virtualChannelBandwidthPercentageValue = virtualChannelBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VirtualChannelBandwidthPercentageOptions that = (VirtualChannelBandwidthPercentageOptions) obj;
        return Objects.equals(this.virtualChannelBandwidthPercentageValue, that.virtualChannelBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualChannelBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualChannelBandwidthPercentageOptions {\n");
        sb.append("    virtualChannelBandwidthPercentageValue: ")
            .append(toIndentedString(virtualChannelBandwidthPercentageValue))
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
