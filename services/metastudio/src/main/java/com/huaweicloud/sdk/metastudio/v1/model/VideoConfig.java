package com.huaweicloud.sdk.metastudio.v1.model;

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
 * 视频输出配置。
 */
public class VideoConfig {

    /**
     * **参数解释**： 输出视频的剪辑方式。 **约束限制**： 不涉及。 **取值范围**： * RESIZE：视频缩放。 * CROP：视频裁剪。
     */
    public static final class ClipModeEnum {

        /**
         * Enum RESIZE for value: "RESIZE"
         */
        public static final ClipModeEnum RESIZE = new ClipModeEnum("RESIZE");

        /**
         * Enum CROP for value: "CROP"
         */
        public static final ClipModeEnum CROP = new ClipModeEnum("CROP");

        private static final Map<String, ClipModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClipModeEnum> createStaticFields() {
            Map<String, ClipModeEnum> map = new HashMap<>();
            map.put("RESIZE", RESIZE);
            map.put("CROP", CROP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClipModeEnum(String value) {
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
        public static ClipModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClipModeEnum(value));
        }

        public static ClipModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClipModeEnum) {
                return this.value.equals(((ClipModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clip_mode")

    private ClipModeEnum clipMode;

    /**
     * **参数解释**： 视频编码格式及视频文件格式。 **约束限制**： 仅分身数字人视频制作支持VP8和QTRLE编码。QTRLE编码时文本驱动字符数限制小于1500字，音频驱动音频长度小于5分钟。 QTRLE编码需要先申请开通白名单后才能使用  **取值范围**： * H264：h264编码，输出mp4文件。 * VP8：vp8编码，输出webm文件。 * QTRLE：qtrle ，输出mov文件。  **默认取值**： 不涉及
     */
    public static final class CodecEnum {

        /**
         * Enum H264 for value: "H264"
         */
        public static final CodecEnum H264 = new CodecEnum("H264");

        /**
         * Enum VP8 for value: "VP8"
         */
        public static final CodecEnum VP8 = new CodecEnum("VP8");

        /**
         * Enum VP9 for value: "VP9"
         */
        public static final CodecEnum VP9 = new CodecEnum("VP9");

        /**
         * Enum QTRLE for value: "QTRLE"
         */
        public static final CodecEnum QTRLE = new CodecEnum("QTRLE");

        private static final Map<String, CodecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodecEnum> createStaticFields() {
            Map<String, CodecEnum> map = new HashMap<>();
            map.put("H264", H264);
            map.put("VP8", VP8);
            map.put("VP9", VP9);
            map.put("QTRLE", QTRLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CodecEnum(String value) {
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
        public static CodecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CodecEnum(value));
        }

        public static CodecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CodecEnum) {
                return this.value.equals(((CodecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "codec")

    private CodecEnum codec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Integer bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    /**
     * **参数解释**： 帧率。单位：FPS。 **约束限制**： 分身数字人视频固定25FPS。
     */
    public static final class FrameRateEnum {

        /**
         * Enum _24 for value: "24"
         */
        public static final FrameRateEnum _24 = new FrameRateEnum("24");

        /**
         * Enum _25 for value: "25"
         */
        public static final FrameRateEnum _25 = new FrameRateEnum("25");

        /**
         * Enum _30 for value: "30"
         */
        public static final FrameRateEnum _30 = new FrameRateEnum("30");

        private static final Map<String, FrameRateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FrameRateEnum> createStaticFields() {
            Map<String, FrameRateEnum> map = new HashMap<>();
            map.put("24", _24);
            map.put("25", _25);
            map.put("30", _30);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FrameRateEnum(String value) {
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
        public static FrameRateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FrameRateEnum(value));
        }

        public static FrameRateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FrameRateEnum) {
                return this.value.equals(((FrameRateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private FrameRateEnum frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_subtitle_enable")

    private Boolean isSubtitleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtitle_config")

    private SubtitleConfig subtitleConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dx")

    private Integer dx;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dy")

    private Integer dy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enable_super_resolution")

    private Boolean isEnableSuperResolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_end_at_first_frame")

    private Boolean isEndAtFirstFrame;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_external_url")

    private String outputExternalUrl;

    public VideoConfig withClipMode(ClipModeEnum clipMode) {
        this.clipMode = clipMode;
        return this;
    }

    /**
     * **参数解释**： 输出视频的剪辑方式。 **约束限制**： 不涉及。 **取值范围**： * RESIZE：视频缩放。 * CROP：视频裁剪。
     * @return clipMode
     */
    public ClipModeEnum getClipMode() {
        return clipMode;
    }

    public void setClipMode(ClipModeEnum clipMode) {
        this.clipMode = clipMode;
    }

    public VideoConfig withCodec(CodecEnum codec) {
        this.codec = codec;
        return this;
    }

    /**
     * **参数解释**： 视频编码格式及视频文件格式。 **约束限制**： 仅分身数字人视频制作支持VP8和QTRLE编码。QTRLE编码时文本驱动字符数限制小于1500字，音频驱动音频长度小于5分钟。 QTRLE编码需要先申请开通白名单后才能使用  **取值范围**： * H264：h264编码，输出mp4文件。 * VP8：vp8编码，输出webm文件。 * QTRLE：qtrle ，输出mov文件。  **默认取值**： 不涉及
     * @return codec
     */
    public CodecEnum getCodec() {
        return codec;
    }

    public void setCodec(CodecEnum codec) {
        this.codec = codec;
    }

    public VideoConfig withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * **参数解释**： 输出平均码率。单位：kbps。 **约束限制**： * 分身数字人视频制作采用质量优先，可能会超过设置的码率。 * 分身数字人直播码率范围[1000, 8000]。  **默认取值**： 不涉及
     * minimum: 40
     * maximum: 30000
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public VideoConfig withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * **参数解释**： 视频宽度。单位：像素。 **约束限制**： * clip_mode=RESIZE时，当前支持1920x1080、1080x1920、1280x720、720x1280、3840x2160、2160x3840六种分辨率。4K分辨率视频需要分身数字人模型支持4K的情况下才能使用。 * clip_mode=CROP，裁剪后视频，（dx,dy）为原点，保留视频像宽度为width。 * 分身数字人直播目前只支持1080x1920、1920x1080。  **默认取值**： 不涉及
     * minimum: 0
     * maximum: 3840
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public VideoConfig withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * **参数解释**： 视频高度。  单位：像素。 **约束限制**： * clip_mode=RESIZE时，当前支持1920x1080、1080x1920、1280x720、720x1280、3840x2160、2160x3840六种分辨率分辨率。 * clip_mode=CROP，裁剪后视频，（dx,dy）为原点，保留视频像高度为height。 * 分身数字人直播目前只支持1080x1920、1920x1080。  **默认取值**： 不涉及
     * minimum: 0
     * maximum: 3840
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public VideoConfig withFrameRate(FrameRateEnum frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * **参数解释**： 帧率。单位：FPS。 **约束限制**： 分身数字人视频固定25FPS。
     * @return frameRate
     */
    public FrameRateEnum getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(FrameRateEnum frameRate) {
        this.frameRate = frameRate;
    }

    public VideoConfig withIsSubtitleEnable(Boolean isSubtitleEnable) {
        this.isSubtitleEnable = isSubtitleEnable;
        return this;
    }

    /**
     * **参数解释**： 输出的视频是否带字幕。 **约束限制**： 分身数字人直播暂时不支持字幕。  **取值范围**： * true: 打开字幕 * false: 关闭字幕
     * @return isSubtitleEnable
     */
    public Boolean getIsSubtitleEnable() {
        return isSubtitleEnable;
    }

    public void setIsSubtitleEnable(Boolean isSubtitleEnable) {
        this.isSubtitleEnable = isSubtitleEnable;
    }

    public VideoConfig withSubtitleConfig(SubtitleConfig subtitleConfig) {
        this.subtitleConfig = subtitleConfig;
        return this;
    }

    public VideoConfig withSubtitleConfig(Consumer<SubtitleConfig> subtitleConfigSetter) {
        if (this.subtitleConfig == null) {
            this.subtitleConfig = new SubtitleConfig();
            subtitleConfigSetter.accept(this.subtitleConfig);
        }

        return this;
    }

    /**
     * Get subtitleConfig
     * @return subtitleConfig
     */
    public SubtitleConfig getSubtitleConfig() {
        return subtitleConfig;
    }

    public void setSubtitleConfig(SubtitleConfig subtitleConfig) {
        this.subtitleConfig = subtitleConfig;
    }

    public VideoConfig withDx(Integer dx) {
        this.dx = dx;
        return this;
    }

    /**
     * **参数解释**： 裁剪视频左上角像素点横坐标。 > 以模特分辨率为画布大小，比如1920*1080分辨率的模特，dx最小值是0，最大值是1920。  **约束限制**： clip_mode= CROP时生效。 **默认取值**： 不涉及
     * minimum: -1920
     * maximum: 3840
     * @return dx
     */
    public Integer getDx() {
        return dx;
    }

    public void setDx(Integer dx) {
        this.dx = dx;
    }

    public VideoConfig withDy(Integer dy) {
        this.dy = dy;
        return this;
    }

    /**
     * **参数解释**： 裁剪视频左上角像素点纵坐标。 > 以模特分辨率为画布大小，比如1920*1080分辨率的模特，dy最小值是0，最大值是1080  **约束限制**： clip_mode= CROP时生效。 **默认取值**： 不涉及
     * minimum: -1920
     * maximum: 3840
     * @return dy
     */
    public Integer getDy() {
        return dy;
    }

    public void setDy(Integer dy) {
        this.dy = dy;
    }

    public VideoConfig withIsEnableSuperResolution(Boolean isEnableSuperResolution) {
        this.isEnableSuperResolution = isEnableSuperResolution;
        return this;
    }

    /**
     * **参数解释**： 视频是否开启超分。 **约束限制**： 仅分身数字人视频制作支持。 **取值范围** * true: 开启 * false: 不开启
     * @return isEnableSuperResolution
     */
    public Boolean getIsEnableSuperResolution() {
        return isEnableSuperResolution;
    }

    public void setIsEnableSuperResolution(Boolean isEnableSuperResolution) {
        this.isEnableSuperResolution = isEnableSuperResolution;
    }

    public VideoConfig withIsEndAtFirstFrame(Boolean isEndAtFirstFrame) {
        this.isEndAtFirstFrame = isEndAtFirstFrame;
        return this;
    }

    /**
     * **参数解释**： 视频结束帧是否跟起始帧相同。需要多个数字人视频无缝拼接时设置成true。 **约束限制**： 仅分身数字人视频制作支持，当视频制作时插入动作标签后此设置将失效。 **取值范围** * true: 开启 * false: 不开启
     * @return isEndAtFirstFrame
     */
    public Boolean getIsEndAtFirstFrame() {
        return isEndAtFirstFrame;
    }

    public void setIsEndAtFirstFrame(Boolean isEndAtFirstFrame) {
        this.isEndAtFirstFrame = isEndAtFirstFrame;
    }

    public VideoConfig withOutputExternalUrl(String outputExternalUrl) {
        this.outputExternalUrl = outputExternalUrl;
        return this;
    }

    /**
     * 视频文件上传的外部URL。  > * 需要先申请开通白名单后，才允许将视频上传到外部URL。
     * @return outputExternalUrl
     */
    public String getOutputExternalUrl() {
        return outputExternalUrl;
    }

    public void setOutputExternalUrl(String outputExternalUrl) {
        this.outputExternalUrl = outputExternalUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoConfig that = (VideoConfig) obj;
        return Objects.equals(this.clipMode, that.clipMode) && Objects.equals(this.codec, that.codec)
            && Objects.equals(this.bitrate, that.bitrate) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height) && Objects.equals(this.frameRate, that.frameRate)
            && Objects.equals(this.isSubtitleEnable, that.isSubtitleEnable)
            && Objects.equals(this.subtitleConfig, that.subtitleConfig) && Objects.equals(this.dx, that.dx)
            && Objects.equals(this.dy, that.dy)
            && Objects.equals(this.isEnableSuperResolution, that.isEnableSuperResolution)
            && Objects.equals(this.isEndAtFirstFrame, that.isEndAtFirstFrame)
            && Objects.equals(this.outputExternalUrl, that.outputExternalUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clipMode,
            codec,
            bitrate,
            width,
            height,
            frameRate,
            isSubtitleEnable,
            subtitleConfig,
            dx,
            dy,
            isEnableSuperResolution,
            isEndAtFirstFrame,
            outputExternalUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoConfig {\n");
        sb.append("    clipMode: ").append(toIndentedString(clipMode)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    isSubtitleEnable: ").append(toIndentedString(isSubtitleEnable)).append("\n");
        sb.append("    subtitleConfig: ").append(toIndentedString(subtitleConfig)).append("\n");
        sb.append("    dx: ").append(toIndentedString(dx)).append("\n");
        sb.append("    dy: ").append(toIndentedString(dy)).append("\n");
        sb.append("    isEnableSuperResolution: ").append(toIndentedString(isEnableSuperResolution)).append("\n");
        sb.append("    isEndAtFirstFrame: ").append(toIndentedString(isEndAtFirstFrame)).append("\n");
        sb.append("    outputExternalUrl: ").append(toIndentedString(outputExternalUrl)).append("\n");
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
