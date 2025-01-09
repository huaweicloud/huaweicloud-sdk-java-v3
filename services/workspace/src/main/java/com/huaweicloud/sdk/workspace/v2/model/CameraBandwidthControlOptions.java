package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CameraBandwidthControlOptions
 */
public class CameraBandwidthControlOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_bandwidth_control_value")

    private Integer cameraBandwidthControlValue;

    public CameraBandwidthControlOptions withCameraBandwidthControlValue(Integer cameraBandwidthControlValue) {
        this.cameraBandwidthControlValue = cameraBandwidthControlValue;
        return this;
    }

    /**
     * 摄像头带宽控制量（Kbps）。取值范围为[0-10000]。默认：10000。
     * minimum: 0
     * maximum: 10000
     * @return cameraBandwidthControlValue
     */
    public Integer getCameraBandwidthControlValue() {
        return cameraBandwidthControlValue;
    }

    public void setCameraBandwidthControlValue(Integer cameraBandwidthControlValue) {
        this.cameraBandwidthControlValue = cameraBandwidthControlValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CameraBandwidthControlOptions that = (CameraBandwidthControlOptions) obj;
        return Objects.equals(this.cameraBandwidthControlValue, that.cameraBandwidthControlValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cameraBandwidthControlValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CameraBandwidthControlOptions {\n");
        sb.append("    cameraBandwidthControlValue: ")
            .append(toIndentedString(cameraBandwidthControlValue))
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
