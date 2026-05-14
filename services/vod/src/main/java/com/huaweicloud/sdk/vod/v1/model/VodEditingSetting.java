package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * VodEditingSetting
 */
public class VodEditingSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution_adaptation")

    private Boolean resolutionAdaptation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution_upsample")

    private Boolean resolutionUpsample;

    /**
     * 输出封装格式，HLS、MP4（默认MP4）、MP3、MOV、FLV、AVI。 不支持将视频文件输出成音频封装格式。 
     */
    public static final class FormatEnum {

        /**
         * Enum MP4 for value: "MP4"
         */
        public static final FormatEnum MP4 = new FormatEnum("MP4");

        /**
         * Enum HLS for value: "HLS"
         */
        public static final FormatEnum HLS = new FormatEnum("HLS");

        /**
         * Enum MP3 for value: "MP3"
         */
        public static final FormatEnum MP3 = new FormatEnum("MP3");

        /**
         * Enum MOV for value: "MOV"
         */
        public static final FormatEnum MOV = new FormatEnum("MOV");

        /**
         * Enum AVI for value: "AVI"
         */
        public static final FormatEnum AVI = new FormatEnum("AVI");

        /**
         * Enum FLV for value: "FLV"
         */
        public static final FormatEnum FLV = new FormatEnum("FLV");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("MP4", MP4);
            map.put("HLS", HLS);
            map.put("MP3", MP3);
            map.put("MOV", MOV);
            map.put("AVI", AVI);
            map.put("FLV", FLV);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FormatEnum(value));
        }

        public static FormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FormatEnum) {
                return this.value.equals(((FormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private FormatEnum format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    /**
     * 输出参考基准，可选，默认为NONE  - NONE 输出分辨率按输入的第一个片源为主，码率按输出分辨率自适应 - MAX_BITRATE 按码率最大的输入片源参数为基准 - MAX_RESOLUTION 按分辨率最大的输入片源参数为基准 
     */
    public static final class ReferenceEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final ReferenceEnum NONE = new ReferenceEnum("NONE");

        /**
         * Enum MAX_BITRATE for value: "MAX_BITRATE"
         */
        public static final ReferenceEnum MAX_BITRATE = new ReferenceEnum("MAX_BITRATE");

        /**
         * Enum MAX_RESOLUTION for value: "MAX_RESOLUTION"
         */
        public static final ReferenceEnum MAX_RESOLUTION = new ReferenceEnum("MAX_RESOLUTION");

        private static final Map<String, ReferenceEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReferenceEnum> createStaticFields() {
            Map<String, ReferenceEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("MAX_BITRATE", MAX_BITRATE);
            map.put("MAX_RESOLUTION", MAX_RESOLUTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReferenceEnum(String value) {
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
        public static ReferenceEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReferenceEnum(value));
        }

        public static ReferenceEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReferenceEnum) {
                return this.value.equals(((ReferenceEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference")

    private ReferenceEnum reference;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_codec")

    private Integer videoCodec;

    public VodEditingSetting withResolutionAdaptation(Boolean resolutionAdaptation) {
        this.resolutionAdaptation = resolutionAdaptation;
        return this;
    }

    /**
     * 分辨率自适应策略, 选值：true, false（默认true） 输入为true时，width表示长边，height表示短边 输入为false时，width表示宽度，height表示长度 
     * @return resolutionAdaptation
     */
    public Boolean getResolutionAdaptation() {
        return resolutionAdaptation;
    }

    public void setResolutionAdaptation(Boolean resolutionAdaptation) {
        this.resolutionAdaptation = resolutionAdaptation;
    }

    public VodEditingSetting withResolutionUpsample(Boolean resolutionUpsample) {
        this.resolutionUpsample = resolutionUpsample;
        return this;
    }

    /**
     * 分辨率上采样开关, 选值：true, false（默认false），若为false则按照原片源输出，分辨率不会上浮。 
     * @return resolutionUpsample
     */
    public Boolean getResolutionUpsample() {
        return resolutionUpsample;
    }

    public void setResolutionUpsample(Boolean resolutionUpsample) {
        this.resolutionUpsample = resolutionUpsample;
    }

    public VodEditingSetting withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * 输出封装格式，HLS、MP4（默认MP4）、MP3、MOV、FLV、AVI。 不支持将视频文件输出成音频封装格式。 
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public VodEditingSetting withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 输出宽或长边，整型，输入小数向下取整，默认0，按源  - 当width、height均为0，则分辨率取片源分辨率； - 当width为0，height非0，则width按片源分辨率比例缩放； - 当width非0，height为0，则height按片源分辨率比例缩放； - 当width、height均非0，则分辨率按用户指定。 - 当视频编码为H.264时，则width最小值为32，最大值为4096。 - 当视频编码为H.265，则width最小值为160，最大值为4096。 
     * minimum: 0
     * maximum: 4096
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public VodEditingSetting withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 输出高或短边，整型，输入小数向下取整，默认0，按源  - 当Width、Height均为0，则分辨率取片源分辨率； - 当Width为0，Height非0，则Width按片源分辨率比例缩放； - 当Width非0，Height为0，则Height按片源分辨率比例缩放； - 当Width、Height 均非0，则分辨率按用户指定。 - 当视频编码为H.264时，则height最小值为32，最大值为2880。 - 当视频编码为H.265，则height最小值为160，最大值为2880。 
     * minimum: 0
     * maximum: 2880
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public VodEditingSetting withReference(ReferenceEnum reference) {
        this.reference = reference;
        return this;
    }

    /**
     * 输出参考基准，可选，默认为NONE  - NONE 输出分辨率按输入的第一个片源为主，码率按输出分辨率自适应 - MAX_BITRATE 按码率最大的输入片源参数为基准 - MAX_RESOLUTION 按分辨率最大的输入片源参数为基准 
     * @return reference
     */
    public ReferenceEnum getReference() {
        return reference;
    }

    public void setReference(ReferenceEnum reference) {
        this.reference = reference;
    }

    public VodEditingSetting withVideoCodec(Integer videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * 视频编码格式。 取值如下： - 1：VIDEO_CODEC_H264 - 2：VIDEO_CODEC_H265 
     * minimum: 1
     * maximum: 2
     * @return videoCodec
     */
    public Integer getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(Integer videoCodec) {
        this.videoCodec = videoCodec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VodEditingSetting that = (VodEditingSetting) obj;
        return Objects.equals(this.resolutionAdaptation, that.resolutionAdaptation)
            && Objects.equals(this.resolutionUpsample, that.resolutionUpsample)
            && Objects.equals(this.format, that.format) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height) && Objects.equals(this.reference, that.reference)
            && Objects.equals(this.videoCodec, that.videoCodec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionAdaptation, resolutionUpsample, format, width, height, reference, videoCodec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VodEditingSetting {\n");
        sb.append("    resolutionAdaptation: ").append(toIndentedString(resolutionAdaptation)).append("\n");
        sb.append("    resolutionUpsample: ").append(toIndentedString(resolutionUpsample)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
        sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
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
