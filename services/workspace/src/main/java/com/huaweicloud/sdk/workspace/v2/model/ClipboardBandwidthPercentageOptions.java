package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClipboardBandwidthPercentageOptions
 */
public class ClipboardBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clipboard_bandwidth_percentage_value")

    private Integer clipboardBandwidthPercentageValue;

    public ClipboardBandwidthPercentageOptions withClipboardBandwidthPercentageValue(
        Integer clipboardBandwidthPercentageValue) {
        this.clipboardBandwidthPercentageValue = clipboardBandwidthPercentageValue;
        return this;
    }

    /**
     * 剪切板带宽百分比控制量（%）。取值范围为[0-100]。默认：3。
     * minimum: 0
     * maximum: 100
     * @return clipboardBandwidthPercentageValue
     */
    public Integer getClipboardBandwidthPercentageValue() {
        return clipboardBandwidthPercentageValue;
    }

    public void setClipboardBandwidthPercentageValue(Integer clipboardBandwidthPercentageValue) {
        this.clipboardBandwidthPercentageValue = clipboardBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClipboardBandwidthPercentageOptions that = (ClipboardBandwidthPercentageOptions) obj;
        return Objects.equals(this.clipboardBandwidthPercentageValue, that.clipboardBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clipboardBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClipboardBandwidthPercentageOptions {\n");
        sb.append("    clipboardBandwidthPercentageValue: ")
            .append(toIndentedString(clipboardBandwidthPercentageValue))
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
