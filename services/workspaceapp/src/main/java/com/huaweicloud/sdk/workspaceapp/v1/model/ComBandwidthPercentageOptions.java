package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ComBandwidthPercentageOptions
 */
public class ComBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "com_bandwidth_percentage_value")

    private Integer comBandwidthPercentageValue;

    public ComBandwidthPercentageOptions withComBandwidthPercentageValue(Integer comBandwidthPercentageValue) {
        this.comBandwidthPercentageValue = comBandwidthPercentageValue;
        return this;
    }

    /**
     * 串口带宽百分比控制量（%）。取值范围为[0-100]。默认：3。
     * minimum: 0
     * maximum: 100
     * @return comBandwidthPercentageValue
     */
    public Integer getComBandwidthPercentageValue() {
        return comBandwidthPercentageValue;
    }

    public void setComBandwidthPercentageValue(Integer comBandwidthPercentageValue) {
        this.comBandwidthPercentageValue = comBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComBandwidthPercentageOptions that = (ComBandwidthPercentageOptions) obj;
        return Objects.equals(this.comBandwidthPercentageValue, that.comBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComBandwidthPercentageOptions {\n");
        sb.append("    comBandwidthPercentageValue: ")
            .append(toIndentedString(comBandwidthPercentageValue))
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
