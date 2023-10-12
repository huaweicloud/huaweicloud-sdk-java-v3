package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 显示级别共同控制的选项。
 */
public class DisplayOptions {

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

    /**
     * 无损压缩模式。取值为： Basic Compression：表示初级压缩。 Deep Compression：表示深度压缩。
     */
    public static final class LosslessCompressionModeEnum {

        /**
         * Enum BASIC_COMPRESSION for value: "Basic Compression"
         */
        public static final LosslessCompressionModeEnum BASIC_COMPRESSION =
            new LosslessCompressionModeEnum("Basic Compression");

        /**
         * Enum DEEP_COMPRESSION for value: "Deep Compression"
         */
        public static final LosslessCompressionModeEnum DEEP_COMPRESSION =
            new LosslessCompressionModeEnum("Deep Compression");

        private static final Map<String, LosslessCompressionModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LosslessCompressionModeEnum> createStaticFields() {
            Map<String, LosslessCompressionModeEnum> map = new HashMap<>();
            map.put("Basic Compression", BASIC_COMPRESSION);
            map.put("Deep Compression", DEEP_COMPRESSION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LosslessCompressionModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LosslessCompressionModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new LosslessCompressionModeEnum(value));
        }

        public static LosslessCompressionModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LosslessCompressionModeEnum) {
                return this.value.equals(((LosslessCompressionModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lossless_compression_mode")

    private LosslessCompressionModeEnum losslessCompressionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deep_compression_options")

    private DisplayOptionsDeepCompressionOptions deepCompressionOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lossy_compression_quality")

    private Integer lossyCompressionQuality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "color_enhancement_enable")

    private Boolean colorEnhancementEnable;

    /**
     * 质量或带宽优先。取值为： Quality First：表示初级压缩。 Bandwidth First：表示深度压缩。
     */
    public static final class QualityBandwidthFirstEnum {

        /**
         * Enum QUALITY_FIRST for value: "Quality First"
         */
        public static final QualityBandwidthFirstEnum QUALITY_FIRST = new QualityBandwidthFirstEnum("Quality First");

        /**
         * Enum BANDWIDTH_FIRST for value: "Bandwidth First"
         */
        public static final QualityBandwidthFirstEnum BANDWIDTH_FIRST =
            new QualityBandwidthFirstEnum("Bandwidth First");

        private static final Map<String, QualityBandwidthFirstEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QualityBandwidthFirstEnum> createStaticFields() {
            Map<String, QualityBandwidthFirstEnum> map = new HashMap<>();
            map.put("Quality First", QUALITY_FIRST);
            map.put("Bandwidth First", BANDWIDTH_FIRST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QualityBandwidthFirstEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static QualityBandwidthFirstEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new QualityBandwidthFirstEnum(value));
        }

        public static QualityBandwidthFirstEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QualityBandwidthFirstEnum) {
                return this.value.equals(((QualityBandwidthFirstEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality_bandwidth_first")

    private QualityBandwidthFirstEnum qualityBandwidthFirst;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_bit_rate_options")

    private DisplayOptionsVideoBitRateOptions videoBitRateOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_video_bit_rate")

    private Integer peakVideoBitRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_quality_options")

    private DisplayOptionsVideoQualityOptions videoQualityOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gop_size")

    private Integer gopSize;

    /**
     * 编码预置。取值为： 预置1：Preset 1。 预置2：Preset 2。 预置3：Preset 3。 预置4：Preset 4。 预置5：Preset 5。 预置6：Preset 6。 预置7：Preset 7。
     */
    public static final class EncodingPresetEnum {

        /**
         * Enum PRESET_1 for value: "Preset 1"
         */
        public static final EncodingPresetEnum PRESET_1 = new EncodingPresetEnum("Preset 1");

        /**
         * Enum PRESET_2 for value: "Preset 2"
         */
        public static final EncodingPresetEnum PRESET_2 = new EncodingPresetEnum("Preset 2");

        /**
         * Enum PRESET_3 for value: "Preset 3"
         */
        public static final EncodingPresetEnum PRESET_3 = new EncodingPresetEnum("Preset 3");

        /**
         * Enum PRESET_4 for value: "Preset 4"
         */
        public static final EncodingPresetEnum PRESET_4 = new EncodingPresetEnum("Preset 4");

        /**
         * Enum PRESET_5 for value: "Preset 5"
         */
        public static final EncodingPresetEnum PRESET_5 = new EncodingPresetEnum("Preset 5");

        /**
         * Enum PRESET_6 for value: "Preset 6"
         */
        public static final EncodingPresetEnum PRESET_6 = new EncodingPresetEnum("Preset 6");

        /**
         * Enum PRESET_7 for value: "Preset 7"
         */
        public static final EncodingPresetEnum PRESET_7 = new EncodingPresetEnum("Preset 7");

        private static final Map<String, EncodingPresetEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncodingPresetEnum> createStaticFields() {
            Map<String, EncodingPresetEnum> map = new HashMap<>();
            map.put("Preset 1", PRESET_1);
            map.put("Preset 2", PRESET_2);
            map.put("Preset 3", PRESET_3);
            map.put("Preset 4", PRESET_4);
            map.put("Preset 5", PRESET_5);
            map.put("Preset 6", PRESET_6);
            map.put("Preset 7", PRESET_7);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncodingPresetEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EncodingPresetEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncodingPresetEnum(value));
        }

        public static EncodingPresetEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncodingPresetEnum) {
                return this.value.equals(((EncodingPresetEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoding_preset")

    private EncodingPresetEnum encodingPreset;

    public DisplayOptions withDisplayBandwidth(Integer displayBandwidth) {
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

    public DisplayOptions withFrameRate(Integer frameRate) {
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

    public DisplayOptions withVideoFrameRate(Integer videoFrameRate) {
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

    public DisplayOptions withMinImageCache(Integer minImageCache) {
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

    public DisplayOptions withSmoothingFactor(Integer smoothingFactor) {
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

    public DisplayOptions withLosslessCompressionMode(LosslessCompressionModeEnum losslessCompressionMode) {
        this.losslessCompressionMode = losslessCompressionMode;
        return this;
    }

    /**
     * 无损压缩模式。取值为： Basic Compression：表示初级压缩。 Deep Compression：表示深度压缩。
     * @return losslessCompressionMode
     */
    public LosslessCompressionModeEnum getLosslessCompressionMode() {
        return losslessCompressionMode;
    }

    public void setLosslessCompressionMode(LosslessCompressionModeEnum losslessCompressionMode) {
        this.losslessCompressionMode = losslessCompressionMode;
    }

    public DisplayOptions withDeepCompressionOptions(DisplayOptionsDeepCompressionOptions deepCompressionOptions) {
        this.deepCompressionOptions = deepCompressionOptions;
        return this;
    }

    public DisplayOptions withDeepCompressionOptions(
        Consumer<DisplayOptionsDeepCompressionOptions> deepCompressionOptionsSetter) {
        if (this.deepCompressionOptions == null) {
            this.deepCompressionOptions = new DisplayOptionsDeepCompressionOptions();
            deepCompressionOptionsSetter.accept(this.deepCompressionOptions);
        }

        return this;
    }

    /**
     * Get deepCompressionOptions
     * @return deepCompressionOptions
     */
    public DisplayOptionsDeepCompressionOptions getDeepCompressionOptions() {
        return deepCompressionOptions;
    }

    public void setDeepCompressionOptions(DisplayOptionsDeepCompressionOptions deepCompressionOptions) {
        this.deepCompressionOptions = deepCompressionOptions;
    }

    public DisplayOptions withLossyCompressionQuality(Integer lossyCompressionQuality) {
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

    public DisplayOptions withColorEnhancementEnable(Boolean colorEnhancementEnable) {
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

    public DisplayOptions withQualityBandwidthFirst(QualityBandwidthFirstEnum qualityBandwidthFirst) {
        this.qualityBandwidthFirst = qualityBandwidthFirst;
        return this;
    }

    /**
     * 质量或带宽优先。取值为： Quality First：表示初级压缩。 Bandwidth First：表示深度压缩。
     * @return qualityBandwidthFirst
     */
    public QualityBandwidthFirstEnum getQualityBandwidthFirst() {
        return qualityBandwidthFirst;
    }

    public void setQualityBandwidthFirst(QualityBandwidthFirstEnum qualityBandwidthFirst) {
        this.qualityBandwidthFirst = qualityBandwidthFirst;
    }

    public DisplayOptions withVideoBitRateOptions(DisplayOptionsVideoBitRateOptions videoBitRateOptions) {
        this.videoBitRateOptions = videoBitRateOptions;
        return this;
    }

    public DisplayOptions withVideoBitRateOptions(
        Consumer<DisplayOptionsVideoBitRateOptions> videoBitRateOptionsSetter) {
        if (this.videoBitRateOptions == null) {
            this.videoBitRateOptions = new DisplayOptionsVideoBitRateOptions();
            videoBitRateOptionsSetter.accept(this.videoBitRateOptions);
        }

        return this;
    }

    /**
     * Get videoBitRateOptions
     * @return videoBitRateOptions
     */
    public DisplayOptionsVideoBitRateOptions getVideoBitRateOptions() {
        return videoBitRateOptions;
    }

    public void setVideoBitRateOptions(DisplayOptionsVideoBitRateOptions videoBitRateOptions) {
        this.videoBitRateOptions = videoBitRateOptions;
    }

    public DisplayOptions withPeakVideoBitRate(Integer peakVideoBitRate) {
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

    public DisplayOptions withVideoQualityOptions(DisplayOptionsVideoQualityOptions videoQualityOptions) {
        this.videoQualityOptions = videoQualityOptions;
        return this;
    }

    public DisplayOptions withVideoQualityOptions(
        Consumer<DisplayOptionsVideoQualityOptions> videoQualityOptionsSetter) {
        if (this.videoQualityOptions == null) {
            this.videoQualityOptions = new DisplayOptionsVideoQualityOptions();
            videoQualityOptionsSetter.accept(this.videoQualityOptions);
        }

        return this;
    }

    /**
     * Get videoQualityOptions
     * @return videoQualityOptions
     */
    public DisplayOptionsVideoQualityOptions getVideoQualityOptions() {
        return videoQualityOptions;
    }

    public void setVideoQualityOptions(DisplayOptionsVideoQualityOptions videoQualityOptions) {
        this.videoQualityOptions = videoQualityOptions;
    }

    public DisplayOptions withGopSize(Integer gopSize) {
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

    public DisplayOptions withEncodingPreset(EncodingPresetEnum encodingPreset) {
        this.encodingPreset = encodingPreset;
        return this;
    }

    /**
     * 编码预置。取值为： 预置1：Preset 1。 预置2：Preset 2。 预置3：Preset 3。 预置4：Preset 4。 预置5：Preset 5。 预置6：Preset 6。 预置7：Preset 7。
     * @return encodingPreset
     */
    public EncodingPresetEnum getEncodingPreset() {
        return encodingPreset;
    }

    public void setEncodingPreset(EncodingPresetEnum encodingPreset) {
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
        DisplayOptions that = (DisplayOptions) obj;
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
        sb.append("class DisplayOptions {\n");
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
