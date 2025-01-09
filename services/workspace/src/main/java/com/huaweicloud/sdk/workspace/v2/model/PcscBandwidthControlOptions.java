package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PcscBandwidthControlOptions
 */
public class PcscBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcsc_bandwidth_control_value")

    private Integer pcscBandwidthControlValue;

    public PcscBandwidthControlOptions withPcscBandwidthControlValue(Integer pcscBandwidthControlValue) {
        this.pcscBandwidthControlValue = pcscBandwidthControlValue;
        return this;
    }

    /**
     * PCSC带宽控制量（Kbps）。取值范围为[1000-5000]。默认：2000。
     * minimum: 1000
     * maximum: 5000
     * @return pcscBandwidthControlValue
     */
    public Integer getPcscBandwidthControlValue() {
        return pcscBandwidthControlValue;
    }

    public void setPcscBandwidthControlValue(Integer pcscBandwidthControlValue) {
        this.pcscBandwidthControlValue = pcscBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PcscBandwidthControlOptions that = (PcscBandwidthControlOptions) obj;
        return Objects.equals(this.pcscBandwidthControlValue, that.pcscBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pcscBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PcscBandwidthControlOptions {\n");
        sb.append("    pcscBandwidthControlValue: ").append(toIndentedString(pcscBandwidthControlValue)).append("\n");
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
