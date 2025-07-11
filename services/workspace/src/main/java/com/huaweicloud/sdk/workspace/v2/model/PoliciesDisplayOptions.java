package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 显示级别共同控制的选项。
 */
public class PoliciesDisplayOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_bandwidth")

    private Integer displayBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private Integer frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_frame_rate")

    private Integer videoFrameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_image_cache")

    private Integer minImageCache;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smoothing_factor")

    private Integer smoothingFactor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lossless_compression_mode")

    private String losslessCompressionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deep_compression_options")

    private PoliciesDisplayOptionsDeepCompressionOptions deepCompressionOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lossy_compression_quality")

    private Integer lossyCompressionQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color_enhancement_enable")

    private Boolean colorEnhancementEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_bandwidth_first")

    private String qualityBandwidthFirst;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_bit_rate_options")

    private PoliciesDisplayOptionsVideoBitRateOptions videoBitRateOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_video_bit_rate")

    private Integer peakVideoBitRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_quality_options")

    private PoliciesDisplayOptionsVideoQualityOptions videoQualityOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gop_size")

    private Integer gopSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding_preset")

    private String encodingPreset;

    public PoliciesDisplayOptions withDisplayBandwidth(Integer displayBandwidth) {
        this.displayBandwidth = displayBandwidth;
        return this;
    }

    /**
     * 带宽（Kbps）。取值范围为[256-25000]。默认：20000。
     * minimum: 256
     * maximum: 25000
     * @return displayBandwidth
     */
    public Integer getDisplayBandwidth() {
        return displayBandwidth;
    }

    public void setDisplayBandwidth(Integer displayBandwidth) {
        this.displayBandwidth = displayBandwidth;
    }

    public PoliciesDisplayOptions withFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 帧率（fps）。取值范围为[1-60]。默认：25。
     * minimum: 1
     * maximum: 60
     * @return frameRate
     */
    public Integer getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Integer frameRate) {
        this.frameRate = frameRate;
    }

    public PoliciesDisplayOptions withVideoFrameRate(Integer videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
        return this;
    }

    /**
     * 视频帧率（fps）。取值范围为[1-60]。默认：30。
     * minimum: 1
     * maximum: 60
     * @return videoFrameRate
     */
    public Integer getVideoFrameRate() {
        return videoFrameRate;
    }

    public void setVideoFrameRate(Integer videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
    }

    public PoliciesDisplayOptions withMinImageCache(Integer minImageCache) {
        this.minImageCache = minImageCache;
        return this;
    }

    /**
     * 图像缓存最低容量（MB）。取值范围[0-300]，默认：200。
     * minimum: 0
     * maximum: 300
     * @return minImageCache
     */
    public Integer getMinImageCache() {
        return minImageCache;
    }

    public void setMinImageCache(Integer minImageCache) {
        this.minImageCache = minImageCache;
    }

    public PoliciesDisplayOptions withSmoothingFactor(Integer smoothingFactor) {
        this.smoothingFactor = smoothingFactor;
        return this;
    }

    /**
     * 有损压缩识别阈值。取值范围为[0-255]。默认：60。
     * minimum: 0
     * maximum: 255
     * @return smoothingFactor
     */
    public Integer getSmoothingFactor() {
        return smoothingFactor;
    }

    public void setSmoothingFactor(Integer smoothingFactor) {
        this.smoothingFactor = smoothingFactor;
    }

    public PoliciesDisplayOptions withLosslessCompressionMode(String losslessCompressionMode) {
        this.losslessCompressionMode = losslessCompressionMode;
        return this;
    }

    /**
     * 无损压缩模式。取值为： Basic Compression：表示初级压缩。 Deep Compression：表示深度压缩。
     * @return losslessCompressionMode
     */
    public String getLosslessCompressionMode() {
        return losslessCompressionMode;
    }

    public void setLosslessCompressionMode(String losslessCompressionMode) {
        this.losslessCompressionMode = losslessCompressionMode;
    }

    public PoliciesDisplayOptions withDeepCompressionOptions(
        PoliciesDisplayOptionsDeepCompressionOptions deepCompressionOptions) {
        this.deepCompressionOptions = deepCompressionOptions;
        return this;
    }

    public PoliciesDisplayOptions withDeepCompressionOptions(
        Consumer<PoliciesDisplayOptionsDeepCompressionOptions> deepCompressionOptionsSetter) {
        if (this.deepCompressionOptions == null) {
            this.deepCompressionOptions = new PoliciesDisplayOptionsDeepCompressionOptions();
            deepCompressionOptionsSetter.accept(this.deepCompressionOptions);
        }

        return this;
    }

    /**
     * Get deepCompressionOptions
     * @return deepCompressionOptions
     */
    public PoliciesDisplayOptionsDeepCompressionOptions getDeepCompressionOptions() {
        return deepCompressionOptions;
    }

    public void setDeepCompressionOptions(PoliciesDisplayOptionsDeepCompressionOptions deepCompressionOptions) {
        this.deepCompressionOptions = deepCompressionOptions;
    }

    public PoliciesDisplayOptions withLossyCompressionQuality(Integer lossyCompressionQuality) {
        this.lossyCompressionQuality = lossyCompressionQuality;
        return this;
    }

    /**
     * 有损压缩质量。取值范围为[20-100]。默认：85。
     * minimum: 20
     * maximum: 100
     * @return lossyCompressionQuality
     */
    public Integer getLossyCompressionQuality() {
        return lossyCompressionQuality;
    }

    public void setLossyCompressionQuality(Integer lossyCompressionQuality) {
        this.lossyCompressionQuality = lossyCompressionQuality;
    }

    public PoliciesDisplayOptions withColorEnhancementEnable(Boolean colorEnhancementEnable) {
        this.colorEnhancementEnable = colorEnhancementEnable;
        return this;
    }

    /**
     * 办公场景色彩增强：取值为： false：表示关闭。 true：表示开启。
     * @return colorEnhancementEnable
     */
    public Boolean getColorEnhancementEnable() {
        return colorEnhancementEnable;
    }

    public void setColorEnhancementEnable(Boolean colorEnhancementEnable) {
        this.colorEnhancementEnable = colorEnhancementEnable;
    }

    public PoliciesDisplayOptions withQualityBandwidthFirst(String qualityBandwidthFirst) {
        this.qualityBandwidthFirst = qualityBandwidthFirst;
        return this;
    }

    /**
     * 质量或带宽优先。取值为： Quality First：表示初级压缩。 Bandwidth First：表示深度压缩。
     * @return qualityBandwidthFirst
     */
    public String getQualityBandwidthFirst() {
        return qualityBandwidthFirst;
    }

    public void setQualityBandwidthFirst(String qualityBandwidthFirst) {
        this.qualityBandwidthFirst = qualityBandwidthFirst;
    }

    public PoliciesDisplayOptions withVideoBitRateOptions(
        PoliciesDisplayOptionsVideoBitRateOptions videoBitRateOptions) {
        this.videoBitRateOptions = videoBitRateOptions;
        return this;
    }

    public PoliciesDisplayOptions withVideoBitRateOptions(
        Consumer<PoliciesDisplayOptionsVideoBitRateOptions> videoBitRateOptionsSetter) {
        if (this.videoBitRateOptions == null) {
            this.videoBitRateOptions = new PoliciesDisplayOptionsVideoBitRateOptions();
            videoBitRateOptionsSetter.accept(this.videoBitRateOptions);
        }

        return this;
    }

    /**
     * Get videoBitRateOptions
     * @return videoBitRateOptions
     */
    public PoliciesDisplayOptionsVideoBitRateOptions getVideoBitRateOptions() {
        return videoBitRateOptions;
    }

    public void setVideoBitRateOptions(PoliciesDisplayOptionsVideoBitRateOptions videoBitRateOptions) {
        this.videoBitRateOptions = videoBitRateOptions;
    }

    public PoliciesDisplayOptions withPeakVideoBitRate(Integer peakVideoBitRate) {
        this.peakVideoBitRate = peakVideoBitRate;
        return this;
    }

    /**
     * 视频峰值码率（Kbps）。取值范围为[256-100000]。默认：18000。
     * minimum: 256
     * maximum: 100000
     * @return peakVideoBitRate
     */
    public Integer getPeakVideoBitRate() {
        return peakVideoBitRate;
    }

    public void setPeakVideoBitRate(Integer peakVideoBitRate) {
        this.peakVideoBitRate = peakVideoBitRate;
    }

    public PoliciesDisplayOptions withVideoQualityOptions(
        PoliciesDisplayOptionsVideoQualityOptions videoQualityOptions) {
        this.videoQualityOptions = videoQualityOptions;
        return this;
    }

    public PoliciesDisplayOptions withVideoQualityOptions(
        Consumer<PoliciesDisplayOptionsVideoQualityOptions> videoQualityOptionsSetter) {
        if (this.videoQualityOptions == null) {
            this.videoQualityOptions = new PoliciesDisplayOptionsVideoQualityOptions();
            videoQualityOptionsSetter.accept(this.videoQualityOptions);
        }

        return this;
    }

    /**
     * Get videoQualityOptions
     * @return videoQualityOptions
     */
    public PoliciesDisplayOptionsVideoQualityOptions getVideoQualityOptions() {
        return videoQualityOptions;
    }

    public void setVideoQualityOptions(PoliciesDisplayOptionsVideoQualityOptions videoQualityOptions) {
        this.videoQualityOptions = videoQualityOptions;
    }

    public PoliciesDisplayOptions withGopSize(Integer gopSize) {
        this.gopSize = gopSize;
        return this;
    }

    /**
     * GOP大小。取值范围为[0-65535]。默认：100。
     * minimum: 0
     * maximum: 65535
     * @return gopSize
     */
    public Integer getGopSize() {
        return gopSize;
    }

    public void setGopSize(Integer gopSize) {
        this.gopSize = gopSize;
    }

    public PoliciesDisplayOptions withEncodingPreset(String encodingPreset) {
        this.encodingPreset = encodingPreset;
        return this;
    }

    /**
     * 编码预置。取值为： 预置1：Preset 1。 预置2：Preset 2。 预置3：Preset 3。 预置4：Preset 4。 预置5：Preset 5。 预置6：Preset 6。 预置7：Preset 7。
     * @return encodingPreset
     */
    public String getEncodingPreset() {
        return encodingPreset;
    }

    public void setEncodingPreset(String encodingPreset) {
        this.encodingPreset = encodingPreset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesDisplayOptions that = (PoliciesDisplayOptions) obj;
        return Objects.equals(this.displayBandwidth, that.displayBandwidth)
            && Objects.equals(this.frameRate, that.frameRate)
            && Objects.equals(this.videoFrameRate, that.videoFrameRate)
            && Objects.equals(this.minImageCache, that.minImageCache)
            && Objects.equals(this.smoothingFactor, that.smoothingFactor)
            && Objects.equals(this.losslessCompressionMode, that.losslessCompressionMode)
            && Objects.equals(this.deepCompressionOptions, that.deepCompressionOptions)
            && Objects.equals(this.lossyCompressionQuality, that.lossyCompressionQuality)
            && Objects.equals(this.colorEnhancementEnable, that.colorEnhancementEnable)
            && Objects.equals(this.qualityBandwidthFirst, that.qualityBandwidthFirst)
            && Objects.equals(this.videoBitRateOptions, that.videoBitRateOptions)
            && Objects.equals(this.peakVideoBitRate, that.peakVideoBitRate)
            && Objects.equals(this.videoQualityOptions, that.videoQualityOptions)
            && Objects.equals(this.gopSize, that.gopSize) && Objects.equals(this.encodingPreset, that.encodingPreset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayBandwidth,
            frameRate,
            videoFrameRate,
            minImageCache,
            smoothingFactor,
            losslessCompressionMode,
            deepCompressionOptions,
            lossyCompressionQuality,
            colorEnhancementEnable,
            qualityBandwidthFirst,
            videoBitRateOptions,
            peakVideoBitRate,
            videoQualityOptions,
            gopSize,
            encodingPreset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesDisplayOptions {\n");
        sb.append("    displayBandwidth: ").append(toIndentedString(displayBandwidth)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    videoFrameRate: ").append(toIndentedString(videoFrameRate)).append("\n");
        sb.append("    minImageCache: ").append(toIndentedString(minImageCache)).append("\n");
        sb.append("    smoothingFactor: ").append(toIndentedString(smoothingFactor)).append("\n");
        sb.append("    losslessCompressionMode: ").append(toIndentedString(losslessCompressionMode)).append("\n");
        sb.append("    deepCompressionOptions: ").append(toIndentedString(deepCompressionOptions)).append("\n");
        sb.append("    lossyCompressionQuality: ").append(toIndentedString(lossyCompressionQuality)).append("\n");
        sb.append("    colorEnhancementEnable: ").append(toIndentedString(colorEnhancementEnable)).append("\n");
        sb.append("    qualityBandwidthFirst: ").append(toIndentedString(qualityBandwidthFirst)).append("\n");
        sb.append("    videoBitRateOptions: ").append(toIndentedString(videoBitRateOptions)).append("\n");
        sb.append("    peakVideoBitRate: ").append(toIndentedString(peakVideoBitRate)).append("\n");
        sb.append("    videoQualityOptions: ").append(toIndentedString(videoQualityOptions)).append("\n");
        sb.append("    gopSize: ").append(toIndentedString(gopSize)).append("\n");
        sb.append("    encodingPreset: ").append(toIndentedString(encodingPreset)).append("\n");
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
