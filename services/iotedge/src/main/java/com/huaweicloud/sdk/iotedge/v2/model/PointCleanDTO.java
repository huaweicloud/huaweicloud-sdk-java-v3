package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 点位清洗配置结构体
 */
public class PointCleanDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silent_window")

    private Integer silentWindow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deviation")

    private Double deviation;

    public PointCleanDTO withSilentWindow(Integer silentWindow) {
        this.silentWindow = silentWindow;
        return this;
    }

    /**
     * 静默时间窗口，在该时间窗口内，没有触发上报条件，点位将不会上
     * minimum: 0
     * maximum: 86400
     * @return silentWindow
     */
    public Integer getSilentWindow() {
        return silentWindow;
    }

    public void setSilentWindow(Integer silentWindow) {
        this.silentWindow = silentWindow;
    }

    public PointCleanDTO withDeviation(Double deviation) {
        this.deviation = deviation;
        return this;
    }

    /**
     * 偏差，在该偏差范围内表示是正常波动，点位将不进行上报
     * minimum: 0
     * maximum: 1E+2
     * @return deviation
     */
    public Double getDeviation() {
        return deviation;
    }

    public void setDeviation(Double deviation) {
        this.deviation = deviation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PointCleanDTO that = (PointCleanDTO) obj;
        return Objects.equals(this.silentWindow, that.silentWindow) && Objects.equals(this.deviation, that.deviation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(silentWindow, deviation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PointCleanDTO {\n");
        sb.append("    silentWindow: ").append(toIndentedString(silentWindow)).append("\n");
        sb.append("    deviation: ").append(toIndentedString(deviation)).append("\n");
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
