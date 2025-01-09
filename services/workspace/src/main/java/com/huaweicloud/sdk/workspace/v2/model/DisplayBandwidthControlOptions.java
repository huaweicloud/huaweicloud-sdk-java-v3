package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DisplayBandwidthControlOptions
 */
public class DisplayBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_bandwidth_control_value")

    private Integer displayBandwidthControlValue;

    public DisplayBandwidthControlOptions withDisplayBandwidthControlValue(Integer displayBandwidthControlValue) {
        this.displayBandwidthControlValue = displayBandwidthControlValue;
        return this;
    }

    /**
     * 显示带宽控制量（Kbps）。取值范围为[500-50000]。默认：20000。
     * minimum: 500
     * maximum: 50000
     * @return displayBandwidthControlValue
     */
    public Integer getDisplayBandwidthControlValue() {
        return displayBandwidthControlValue;
    }

    public void setDisplayBandwidthControlValue(Integer displayBandwidthControlValue) {
        this.displayBandwidthControlValue = displayBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisplayBandwidthControlOptions that = (DisplayBandwidthControlOptions) obj;
        return Objects.equals(this.displayBandwidthControlValue, that.displayBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisplayBandwidthControlOptions {\n");
        sb.append("    displayBandwidthControlValue: ")
            .append(toIndentedString(displayBandwidthControlValue))
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
