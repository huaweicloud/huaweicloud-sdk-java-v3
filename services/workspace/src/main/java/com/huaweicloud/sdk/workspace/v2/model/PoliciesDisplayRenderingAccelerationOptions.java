package com.huaweicloud.sdk.workspace.v2.model;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_recognition_threshold")

    private Integer videoRecognitionThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate_statistical_length")

    private Integer frameRateStatisticalLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_quality_threshold")

    private Integer imageQualityThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_frequency_threshold")

    private Integer refreshFrequencyThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exiting_video_area_threshold")

    private Integer exitingVideoAreaThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_video_width")

    private Integer minVideoWidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_video_length")

    private Integer minVideoLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_frame_natural_percentage")

    private String singleFrameNaturalPercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cyclical_natural_images_number")

    private Integer cyclicalNaturalImagesNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_natural_image_percentage")

    private String nonNaturalImagePercentage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_natural_images_number")

    private Integer nonNaturalImagesNumber;

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

    public PoliciesDisplayRenderingAccelerationOptions withVideoRecognitionThreshold(
        Integer videoRecognitionThreshold) {
        this.videoRecognitionThreshold = videoRecognitionThreshold;
        return this;
    }

    /**
     * 视频识别阈值。取值范围为[0-500]。默认：10。
     * minimum: 0
     * maximum: 500
     * @return videoRecognitionThreshold
     */
    public Integer getVideoRecognitionThreshold() {
        return videoRecognitionThreshold;
    }

    public void setVideoRecognitionThreshold(Integer videoRecognitionThreshold) {
        this.videoRecognitionThreshold = videoRecognitionThreshold;
    }

    public PoliciesDisplayRenderingAccelerationOptions withFrameRateStatisticalLength(
        Integer frameRateStatisticalLength) {
        this.frameRateStatisticalLength = frameRateStatisticalLength;
        return this;
    }

    /**
     * 帧率统计长度。取值范围为[2-100]。默认：4。
     * minimum: 2
     * maximum: 100
     * @return frameRateStatisticalLength
     */
    public Integer getFrameRateStatisticalLength() {
        return frameRateStatisticalLength;
    }

    public void setFrameRateStatisticalLength(Integer frameRateStatisticalLength) {
        this.frameRateStatisticalLength = frameRateStatisticalLength;
    }

    public PoliciesDisplayRenderingAccelerationOptions withImageQualityThreshold(Integer imageQualityThreshold) {
        this.imageQualityThreshold = imageQualityThreshold;
        return this;
    }

    /**
     * 图像质量阈值。取值范围为[0-100]。默认：0。
     * minimum: 0
     * maximum: 100
     * @return imageQualityThreshold
     */
    public Integer getImageQualityThreshold() {
        return imageQualityThreshold;
    }

    public void setImageQualityThreshold(Integer imageQualityThreshold) {
        this.imageQualityThreshold = imageQualityThreshold;
    }

    public PoliciesDisplayRenderingAccelerationOptions withRefreshFrequencyThreshold(
        Integer refreshFrequencyThreshold) {
        this.refreshFrequencyThreshold = refreshFrequencyThreshold;
        return this;
    }

    /**
     * 刷新率阈值。取值范围为[1-100]。默认：3。
     * minimum: 1
     * maximum: 100
     * @return refreshFrequencyThreshold
     */
    public Integer getRefreshFrequencyThreshold() {
        return refreshFrequencyThreshold;
    }

    public void setRefreshFrequencyThreshold(Integer refreshFrequencyThreshold) {
        this.refreshFrequencyThreshold = refreshFrequencyThreshold;
    }

    public PoliciesDisplayRenderingAccelerationOptions withExitingVideoAreaThreshold(
        Integer exitingVideoAreaThreshold) {
        this.exitingVideoAreaThreshold = exitingVideoAreaThreshold;
        return this;
    }

    /**
     * 退出视频区域阈值。取值范围为[0-100]。默认：8。
     * minimum: 0
     * maximum: 100
     * @return exitingVideoAreaThreshold
     */
    public Integer getExitingVideoAreaThreshold() {
        return exitingVideoAreaThreshold;
    }

    public void setExitingVideoAreaThreshold(Integer exitingVideoAreaThreshold) {
        this.exitingVideoAreaThreshold = exitingVideoAreaThreshold;
    }

    public PoliciesDisplayRenderingAccelerationOptions withMinVideoWidth(Integer minVideoWidth) {
        this.minVideoWidth = minVideoWidth;
        return this;
    }

    /**
     * 识别为视频的最小宽。取值范围为[0-1280]。默认：191。
     * minimum: 0
     * maximum: 1280
     * @return minVideoWidth
     */
    public Integer getMinVideoWidth() {
        return minVideoWidth;
    }

    public void setMinVideoWidth(Integer minVideoWidth) {
        this.minVideoWidth = minVideoWidth;
    }

    public PoliciesDisplayRenderingAccelerationOptions withMinVideoLength(Integer minVideoLength) {
        this.minVideoLength = minVideoLength;
        return this;
    }

    /**
     * 识别为视频的最小高。取值范围为[0-1280]。默认：191。
     * minimum: 0
     * maximum: 1280
     * @return minVideoLength
     */
    public Integer getMinVideoLength() {
        return minVideoLength;
    }

    public void setMinVideoLength(Integer minVideoLength) {
        this.minVideoLength = minVideoLength;
    }

    public PoliciesDisplayRenderingAccelerationOptions withSingleFrameNaturalPercentage(
        String singleFrameNaturalPercentage) {
        this.singleFrameNaturalPercentage = singleFrameNaturalPercentage;
        return this;
    }

    /**
     * 单帧自然图像块占比阈值。取值范围为[0.000001-1]。默认：0.3。
     * @return singleFrameNaturalPercentage
     */
    public String getSingleFrameNaturalPercentage() {
        return singleFrameNaturalPercentage;
    }

    public void setSingleFrameNaturalPercentage(String singleFrameNaturalPercentage) {
        this.singleFrameNaturalPercentage = singleFrameNaturalPercentage;
    }

    public PoliciesDisplayRenderingAccelerationOptions withCyclicalNaturalImagesNumber(
        Integer cyclicalNaturalImagesNumber) {
        this.cyclicalNaturalImagesNumber = cyclicalNaturalImagesNumber;
        return this;
    }

    /**
     * 周期自然图像数目占比阈值。取值范围为[0-100]。默认：2。
     * minimum: 0
     * maximum: 100
     * @return cyclicalNaturalImagesNumber
     */
    public Integer getCyclicalNaturalImagesNumber() {
        return cyclicalNaturalImagesNumber;
    }

    public void setCyclicalNaturalImagesNumber(Integer cyclicalNaturalImagesNumber) {
        this.cyclicalNaturalImagesNumber = cyclicalNaturalImagesNumber;
    }

    public PoliciesDisplayRenderingAccelerationOptions withNonNaturalImagePercentage(String nonNaturalImagePercentage) {
        this.nonNaturalImagePercentage = nonNaturalImagePercentage;
        return this;
    }

    /**
     * 非自然图面积占比阈值。取值范围为[0.000001-1]。默认：0.85。
     * @return nonNaturalImagePercentage
     */
    public String getNonNaturalImagePercentage() {
        return nonNaturalImagePercentage;
    }

    public void setNonNaturalImagePercentage(String nonNaturalImagePercentage) {
        this.nonNaturalImagePercentage = nonNaturalImagePercentage;
    }

    public PoliciesDisplayRenderingAccelerationOptions withNonNaturalImagesNumber(Integer nonNaturalImagesNumber) {
        this.nonNaturalImagesNumber = nonNaturalImagesNumber;
        return this;
    }

    /**
     * 非自然图数目占比阈值。取值范围为[0-100]。默认：25。
     * minimum: 0
     * maximum: 100
     * @return nonNaturalImagesNumber
     */
    public Integer getNonNaturalImagesNumber() {
        return nonNaturalImagesNumber;
    }

    public void setNonNaturalImagesNumber(Integer nonNaturalImagesNumber) {
        this.nonNaturalImagesNumber = nonNaturalImagesNumber;
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
            && Objects.equals(this.gpuColorOptimizationEnable, that.gpuColorOptimizationEnable)
            && Objects.equals(this.videoRecognitionThreshold, that.videoRecognitionThreshold)
            && Objects.equals(this.frameRateStatisticalLength, that.frameRateStatisticalLength)
            && Objects.equals(this.imageQualityThreshold, that.imageQualityThreshold)
            && Objects.equals(this.refreshFrequencyThreshold, that.refreshFrequencyThreshold)
            && Objects.equals(this.exitingVideoAreaThreshold, that.exitingVideoAreaThreshold)
            && Objects.equals(this.minVideoWidth, that.minVideoWidth)
            && Objects.equals(this.minVideoLength, that.minVideoLength)
            && Objects.equals(this.singleFrameNaturalPercentage, that.singleFrameNaturalPercentage)
            && Objects.equals(this.cyclicalNaturalImagesNumber, that.cyclicalNaturalImagesNumber)
            && Objects.equals(this.nonNaturalImagePercentage, that.nonNaturalImagePercentage)
            && Objects.equals(this.nonNaturalImagesNumber, that.nonNaturalImagesNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoAccelerationEnhancementEnable,
            videoOptimizationEnable,
            gpuColorOptimizationEnable,
            videoRecognitionThreshold,
            frameRateStatisticalLength,
            imageQualityThreshold,
            refreshFrequencyThreshold,
            exitingVideoAreaThreshold,
            minVideoWidth,
            minVideoLength,
            singleFrameNaturalPercentage,
            cyclicalNaturalImagesNumber,
            nonNaturalImagePercentage,
            nonNaturalImagesNumber);
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
        sb.append("    videoRecognitionThreshold: ").append(toIndentedString(videoRecognitionThreshold)).append("\n");
        sb.append("    frameRateStatisticalLength: ").append(toIndentedString(frameRateStatisticalLength)).append("\n");
        sb.append("    imageQualityThreshold: ").append(toIndentedString(imageQualityThreshold)).append("\n");
        sb.append("    refreshFrequencyThreshold: ").append(toIndentedString(refreshFrequencyThreshold)).append("\n");
        sb.append("    exitingVideoAreaThreshold: ").append(toIndentedString(exitingVideoAreaThreshold)).append("\n");
        sb.append("    minVideoWidth: ").append(toIndentedString(minVideoWidth)).append("\n");
        sb.append("    minVideoLength: ").append(toIndentedString(minVideoLength)).append("\n");
        sb.append("    singleFrameNaturalPercentage: ")
            .append(toIndentedString(singleFrameNaturalPercentage))
            .append("\n");
        sb.append("    cyclicalNaturalImagesNumber: ")
            .append(toIndentedString(cyclicalNaturalImagesNumber))
            .append("\n");
        sb.append("    nonNaturalImagePercentage: ").append(toIndentedString(nonNaturalImagePercentage)).append("\n");
        sb.append("    nonNaturalImagesNumber: ").append(toIndentedString(nonNaturalImagesNumber)).append("\n");
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
