package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CameraBandwidthPercentageOptions
 */
public class CameraBandwidthPercentageOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_bandwidth_percentage_value")

    private Integer cameraBandwidthPercentageValue;

    public CameraBandwidthPercentageOptions withCameraBandwidthPercentageValue(Integer cameraBandwidthPercentageValue) {
        this.cameraBandwidthPercentageValue = cameraBandwidthPercentageValue;
        return this;
    }

    /**
     * 摄像头带宽百分比控制量（%）。取值范围为[0-100]。默认：30。
     * minimum: 0
     * maximum: 100
     * @return cameraBandwidthPercentageValue
     */
    public Integer getCameraBandwidthPercentageValue() {
        return cameraBandwidthPercentageValue;
    }

    public void setCameraBandwidthPercentageValue(Integer cameraBandwidthPercentageValue) {
        this.cameraBandwidthPercentageValue = cameraBandwidthPercentageValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CameraBandwidthPercentageOptions that = (CameraBandwidthPercentageOptions) obj;
        return Objects.equals(this.cameraBandwidthPercentageValue, that.cameraBandwidthPercentageValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cameraBandwidthPercentageValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CameraBandwidthPercentageOptions {\n");
        sb.append("    cameraBandwidthPercentageValue: ")
            .append(toIndentedString(cameraBandwidthPercentageValue))
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
