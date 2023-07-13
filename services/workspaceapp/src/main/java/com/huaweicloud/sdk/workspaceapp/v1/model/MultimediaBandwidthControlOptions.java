package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MultimediaBandwidthControlOptions
 */
public class MultimediaBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multimedia_bandwidth_control_value")

    private Integer multimediaBandwidthControlValue;

    public MultimediaBandwidthControlOptions withMultimediaBandwidthControlValue(
        Integer multimediaBandwidthControlValue) {
        this.multimediaBandwidthControlValue = multimediaBandwidthControlValue;
        return this;
    }

    /**
     * 多媒体带宽控制量（Kbps）。取值范围为[5000-20000]。默认：15000。
     * minimum: 5000
     * maximum: 20000
     * @return multimediaBandwidthControlValue
     */
    public Integer getMultimediaBandwidthControlValue() {
        return multimediaBandwidthControlValue;
    }

    public void setMultimediaBandwidthControlValue(Integer multimediaBandwidthControlValue) {
        this.multimediaBandwidthControlValue = multimediaBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultimediaBandwidthControlOptions that = (MultimediaBandwidthControlOptions) obj;
        return Objects.equals(this.multimediaBandwidthControlValue, that.multimediaBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multimediaBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultimediaBandwidthControlOptions {\n");
        sb.append("    multimediaBandwidthControlValue: ")
            .append(toIndentedString(multimediaBandwidthControlValue))
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
