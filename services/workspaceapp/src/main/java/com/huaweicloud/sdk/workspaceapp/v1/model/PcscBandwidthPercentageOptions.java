package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PcscBandwidthPercentageOptions
 */
public class PcscBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pcsc_bandwidth_percentage_value")

    private Integer pcscBandwidthPercentageValue;

    public PcscBandwidthPercentageOptions withPcscBandwidthPercentageValue(Integer pcscBandwidthPercentageValue) {
        this.pcscBandwidthPercentageValue = pcscBandwidthPercentageValue;
        return this;
    }

    /**
     * PCSC带宽百分比控制量（%）。取值范围为[0-100]。默认：5。
     * minimum: 0
     * maximum: 100
     * @return pcscBandwidthPercentageValue
     */
    public Integer getPcscBandwidthPercentageValue() {
        return pcscBandwidthPercentageValue;
    }

    public void setPcscBandwidthPercentageValue(Integer pcscBandwidthPercentageValue) {
        this.pcscBandwidthPercentageValue = pcscBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PcscBandwidthPercentageOptions that = (PcscBandwidthPercentageOptions) obj;
        return Objects.equals(this.pcscBandwidthPercentageValue, that.pcscBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pcscBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PcscBandwidthPercentageOptions {\n");
        sb.append("    pcscBandwidthPercentageValue: ")
            .append(toIndentedString(pcscBandwidthPercentageValue))
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
