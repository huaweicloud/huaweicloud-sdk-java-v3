package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UsbBandwidthPercentageOptions
 */
public class UsbBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usb_bandwidth_percentage_value")

    private Integer usbBandwidthPercentageValue;

    public UsbBandwidthPercentageOptions withUsbBandwidthPercentageValue(Integer usbBandwidthPercentageValue) {
        this.usbBandwidthPercentageValue = usbBandwidthPercentageValue;
        return this;
    }

    /**
     * USB带宽百分比控制量（%）。取值范围为[0-100]。默认：100。
     * minimum: 0
     * maximum: 100
     * @return usbBandwidthPercentageValue
     */
    public Integer getUsbBandwidthPercentageValue() {
        return usbBandwidthPercentageValue;
    }

    public void setUsbBandwidthPercentageValue(Integer usbBandwidthPercentageValue) {
        this.usbBandwidthPercentageValue = usbBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UsbBandwidthPercentageOptions that = (UsbBandwidthPercentageOptions) obj;
        return Objects.equals(this.usbBandwidthPercentageValue, that.usbBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usbBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsbBandwidthPercentageOptions {\n");
        sb.append("    usbBandwidthPercentageValue: ")
            .append(toIndentedString(usbBandwidthPercentageValue))
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
