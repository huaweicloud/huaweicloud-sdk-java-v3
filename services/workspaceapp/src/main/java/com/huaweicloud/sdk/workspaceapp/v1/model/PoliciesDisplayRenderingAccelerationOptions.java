package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 渲染加速控制选项。
 */
public class PoliciesDisplayRenderingAccelerationOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_acceleration_enhancement_enable")

    private Boolean videoAccelerationEnhancementEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_optimization_enable")

    private Boolean videoOptimizationEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_color_optimization_enable")

    private Boolean gpuColorOptimizationEnable;

    public PoliciesDisplayRenderingAccelerationOptions withVideoAccelerationEnhancementEnable(
        Boolean videoAccelerationEnhancementEnable) {
        this.videoAccelerationEnhancementEnable = videoAccelerationEnhancementEnable;
        return this;
    }

    /**
     * 视频加速增强配置。取值为： false：表示关闭。 true：表示开启。
     * @return videoAccelerationEnhancementEnable
     */
    public Boolean getVideoAccelerationEnhancementEnable() {
        return videoAccelerationEnhancementEnable;
    }

    public void setVideoAccelerationEnhancementEnable(Boolean videoAccelerationEnhancementEnable) {
        this.videoAccelerationEnhancementEnable = videoAccelerationEnhancementEnable;
    }

    public PoliciesDisplayRenderingAccelerationOptions withVideoOptimizationEnable(Boolean videoOptimizationEnable) {
        this.videoOptimizationEnable = videoOptimizationEnable;
        return this;
    }

    /**
     * 是否开启视频场景优化。取值为： false：表示关闭。 true：表示开启。
     * @return videoOptimizationEnable
     */
    public Boolean getVideoOptimizationEnable() {
        return videoOptimizationEnable;
    }

    public void setVideoOptimizationEnable(Boolean videoOptimizationEnable) {
        this.videoOptimizationEnable = videoOptimizationEnable;
    }

    public PoliciesDisplayRenderingAccelerationOptions withGpuColorOptimizationEnable(
        Boolean gpuColorOptimizationEnable) {
        this.gpuColorOptimizationEnable = gpuColorOptimizationEnable;
        return this;
    }

    /**
     * 是否开启GPU色彩优化。取值为： false：表示关闭。 true：表示开启。
     * @return gpuColorOptimizationEnable
     */
    public Boolean getGpuColorOptimizationEnable() {
        return gpuColorOptimizationEnable;
    }

    public void setGpuColorOptimizationEnable(Boolean gpuColorOptimizationEnable) {
        this.gpuColorOptimizationEnable = gpuColorOptimizationEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesDisplayRenderingAccelerationOptions that = (PoliciesDisplayRenderingAccelerationOptions) obj;
        return Objects.equals(this.videoAccelerationEnhancementEnable, that.videoAccelerationEnhancementEnable)
            && Objects.equals(this.videoOptimizationEnable, that.videoOptimizationEnable)
            && Objects.equals(this.gpuColorOptimizationEnable, that.gpuColorOptimizationEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoAccelerationEnhancementEnable, videoOptimizationEnable, gpuColorOptimizationEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesDisplayRenderingAccelerationOptions {\n");
        sb.append("    videoAccelerationEnhancementEnable: ")
            .append(toIndentedString(videoAccelerationEnhancementEnable))
            .append("\n");
        sb.append("    videoOptimizationEnable: ").append(toIndentedString(videoOptimizationEnable)).append("\n");
        sb.append("    gpuColorOptimizationEnable: ").append(toIndentedString(gpuColorOptimizationEnable)).append("\n");
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
