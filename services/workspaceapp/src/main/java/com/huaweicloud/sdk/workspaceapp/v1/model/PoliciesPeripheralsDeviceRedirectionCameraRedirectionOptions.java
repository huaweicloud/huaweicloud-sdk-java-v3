package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 摄像头设备重定向控制的选项。
 */
public class PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_frame_rate")

    private Integer cameraFrameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_max_width")

    private Integer cameraMaxWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_max_heigth")

    private Integer cameraMaxHeigth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "camera_compression_method")

    private String cameraCompressionMethod;

    public PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions withCameraFrameRate(Integer cameraFrameRate) {
        this.cameraFrameRate = cameraFrameRate;
        return this;
    }

    /**
     * 摄像头帧率（fps）。取值范围为[1-30]。默认：15。
     * minimum: 1
     * maximum: 30
     * @return cameraFrameRate
     */
    public Integer getCameraFrameRate() {
        return cameraFrameRate;
    }

    public void setCameraFrameRate(Integer cameraFrameRate) {
        this.cameraFrameRate = cameraFrameRate;
    }

    public PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions withCameraMaxWidth(Integer cameraMaxWidth) {
        this.cameraMaxWidth = cameraMaxWidth;
        return this;
    }

    /**
     * 摄像头最大宽度（pixel）。取值范围为[1-9999]。默认：3000。
     * minimum: 1
     * maximum: 9999
     * @return cameraMaxWidth
     */
    public Integer getCameraMaxWidth() {
        return cameraMaxWidth;
    }

    public void setCameraMaxWidth(Integer cameraMaxWidth) {
        this.cameraMaxWidth = cameraMaxWidth;
    }

    public PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions withCameraMaxHeigth(Integer cameraMaxHeigth) {
        this.cameraMaxHeigth = cameraMaxHeigth;
        return this;
    }

    /**
     * 摄像头最大高度（pixel）。取值范围为[1-9999]。默认：3000。
     * minimum: 1
     * maximum: 9999
     * @return cameraMaxHeigth
     */
    public Integer getCameraMaxHeigth() {
        return cameraMaxHeigth;
    }

    public void setCameraMaxHeigth(Integer cameraMaxHeigth) {
        this.cameraMaxHeigth = cameraMaxHeigth;
    }

    public PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions withCameraCompressionMethod(
        String cameraCompressionMethod) {
        this.cameraCompressionMethod = cameraCompressionMethod;
        return this;
    }

    /**
     * 摄像头数据压缩方式。取值为：H.264。
     * @return cameraCompressionMethod
     */
    public String getCameraCompressionMethod() {
        return cameraCompressionMethod;
    }

    public void setCameraCompressionMethod(String cameraCompressionMethod) {
        this.cameraCompressionMethod = cameraCompressionMethod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions that =
            (PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions) obj;
        return Objects.equals(this.cameraFrameRate, that.cameraFrameRate)
            && Objects.equals(this.cameraMaxWidth, that.cameraMaxWidth)
            && Objects.equals(this.cameraMaxHeigth, that.cameraMaxHeigth)
            && Objects.equals(this.cameraCompressionMethod, that.cameraCompressionMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cameraFrameRate, cameraMaxWidth, cameraMaxHeigth, cameraCompressionMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPeripheralsDeviceRedirectionCameraRedirectionOptions {\n");
        sb.append("    cameraFrameRate: ").append(toIndentedString(cameraFrameRate)).append("\n");
        sb.append("    cameraMaxWidth: ").append(toIndentedString(cameraMaxWidth)).append("\n");
        sb.append("    cameraMaxHeigth: ").append(toIndentedString(cameraMaxHeigth)).append("\n");
        sb.append("    cameraCompressionMethod: ").append(toIndentedString(cameraCompressionMethod)).append("\n");
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
