package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VirtualChannelBandwidthControlOptions
 */
public class VirtualChannelBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_channel_bandwidth_control_value")

    private Integer virtualChannelBandwidthControlValue;

    public VirtualChannelBandwidthControlOptions withVirtualChannelBandwidthControlValue(
        Integer virtualChannelBandwidthControlValue) {
        this.virtualChannelBandwidthControlValue = virtualChannelBandwidthControlValue;
        return this;
    }

    /**
     * 虚拟通道带宽控制量（Kbps）。取值范围为[500-20000]。默认：20000。
     * minimum: 500
     * maximum: 20000
     * @return virtualChannelBandwidthControlValue
     */
    public Integer getVirtualChannelBandwidthControlValue() {
        return virtualChannelBandwidthControlValue;
    }

    public void setVirtualChannelBandwidthControlValue(Integer virtualChannelBandwidthControlValue) {
        this.virtualChannelBandwidthControlValue = virtualChannelBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VirtualChannelBandwidthControlOptions that = (VirtualChannelBandwidthControlOptions) obj;
        return Objects.equals(this.virtualChannelBandwidthControlValue, that.virtualChannelBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualChannelBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VirtualChannelBandwidthControlOptions {\n");
        sb.append("    virtualChannelBandwidthControlValue: ")
            .append(toIndentedString(virtualChannelBandwidthControlValue))
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
