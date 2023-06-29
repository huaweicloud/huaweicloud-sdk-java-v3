package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UsbBandwidthControlOptions
 */
public class UsbBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_bandwidth_control_value")

    private Integer usbBandwidthControlValue;

    public UsbBandwidthControlOptions withUsbBandwidthControlValue(Integer usbBandwidthControlValue) {
        this.usbBandwidthControlValue = usbBandwidthControlValue;
        return this;
    }

    /**
     * USB带宽控制量（Kbps）。取值范围为[1000-30000]。默认：30000。
     * minimum: 1000
     * maximum: 30000
     * @return usbBandwidthControlValue
     */
    public Integer getUsbBandwidthControlValue() {
        return usbBandwidthControlValue;
    }

    public void setUsbBandwidthControlValue(Integer usbBandwidthControlValue) {
        this.usbBandwidthControlValue = usbBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UsbBandwidthControlOptions that = (UsbBandwidthControlOptions) obj;
        return Objects.equals(this.usbBandwidthControlValue, that.usbBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usbBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsbBandwidthControlOptions {\n");
        sb.append("    usbBandwidthControlValue: ").append(toIndentedString(usbBandwidthControlValue)).append("\n");
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
