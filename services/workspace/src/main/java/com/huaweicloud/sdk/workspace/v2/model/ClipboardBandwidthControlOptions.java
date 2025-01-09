package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ClipboardBandwidthControlOptions
 */
public class ClipboardBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clipboard_bandwidth_control_value")

    private Integer clipboardBandwidthControlValue;

    public ClipboardBandwidthControlOptions withClipboardBandwidthControlValue(Integer clipboardBandwidthControlValue) {
        this.clipboardBandwidthControlValue = clipboardBandwidthControlValue;
        return this;
    }

    /**
     * 剪切板带宽控制量（Kbps）。取值范围为[100-2000]。默认：1000。
     * minimum: 100
     * maximum: 2000
     * @return clipboardBandwidthControlValue
     */
    public Integer getClipboardBandwidthControlValue() {
        return clipboardBandwidthControlValue;
    }

    public void setClipboardBandwidthControlValue(Integer clipboardBandwidthControlValue) {
        this.clipboardBandwidthControlValue = clipboardBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClipboardBandwidthControlOptions that = (ClipboardBandwidthControlOptions) obj;
        return Objects.equals(this.clipboardBandwidthControlValue, that.clipboardBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clipboardBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClipboardBandwidthControlOptions {\n");
        sb.append("    clipboardBandwidthControlValue: ")
            .append(toIndentedString(clipboardBandwidthControlValue))
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
