package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComBandwidthControlOptions
 */
public class ComBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "com_bandwidth_control_value")

    private Integer comBandwidthControlValue;

    public ComBandwidthControlOptions withComBandwidthControlValue(Integer comBandwidthControlValue) {
        this.comBandwidthControlValue = comBandwidthControlValue;
        return this;
    }

    /**
     * 串口带宽控制量（Kbps）。取值范围为[500-2000]。默认：1000。
     * minimum: 500
     * maximum: 2000
     * @return comBandwidthControlValue
     */
    public Integer getComBandwidthControlValue() {
        return comBandwidthControlValue;
    }

    public void setComBandwidthControlValue(Integer comBandwidthControlValue) {
        this.comBandwidthControlValue = comBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComBandwidthControlOptions that = (ComBandwidthControlOptions) obj;
        return Objects.equals(this.comBandwidthControlValue, that.comBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComBandwidthControlOptions {\n");
        sb.append("    comBandwidthControlValue: ").append(toIndentedString(comBandwidthControlValue)).append("\n");
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
