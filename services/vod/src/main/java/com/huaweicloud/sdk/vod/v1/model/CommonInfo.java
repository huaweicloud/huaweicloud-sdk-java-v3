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
 * CommonInfo
 */
public class CommonInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pvc")

    private Boolean pvc;

    /**
     * 视频编码格式<br/> 
     */
    public static final class VideoCodecEnum {

        /**
         * Enum H264 for value: "H264"
         */
        public static final VideoCodecEnum H264 = new VideoCodecEnum("H264");

        /**
         * Enum H265 for value: "H265"
         */
        public static final VideoCodecEnum H265 = new VideoCodecEnum("H265");

        private static final Map<String, VideoCodecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoCodecEnum> createStaticFields() {
            Map<String, VideoCodecEnum> map = new HashMap<>();
            map.put("H264", H264);
            map.put("H265", H265);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VideoCodecEnum(String value) {
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
        public static VideoCodecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VideoCodecEnum(value));
        }

        public static VideoCodecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VideoCodecEnum) {
                return this.value.equals(((VideoCodecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_codec")

    private VideoCodecEnum videoCodec;

    /**
     * 音频编码格式<br/> AAC：AAC格式 (default)<br/> HEAAC1：HEAAC1格式<br/> HEAAC2：HEAAC2格式<br/> MP3：MP3格式<br/> 
     */
    public static final class AudioCodecEnum {

        /**
         * Enum AAC for value: "AAC"
         */
        public static final AudioCodecEnum AAC = new AudioCodecEnum("AAC");

        /**
         * Enum HEAAC1 for value: "HEAAC1"
         */
        public static final AudioCodecEnum HEAAC1 = new AudioCodecEnum("HEAAC1");

        /**
         * Enum HEAAC2 for value: "HEAAC2"
         */
        public static final AudioCodecEnum HEAAC2 = new AudioCodecEnum("HEAAC2");

        /**
         * Enum MP3 for value: "MP3"
         */
        public static final AudioCodecEnum MP3 = new AudioCodecEnum("MP3");

        private static final Map<String, AudioCodecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioCodecEnum> createStaticFields() {
            Map<String, AudioCodecEnum> map = new HashMap<>();
            map.put("AAC", AAC);
            map.put("HEAAC1", HEAAC1);
            map.put("HEAAC2", HEAAC2);
            map.put("MP3", MP3);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AudioCodecEnum(String value) {
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
        public static AudioCodecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AudioCodecEnum(value));
        }

        public static AudioCodecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AudioCodecEnum) {
                return this.value.equals(((AudioCodecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_codec")

    private AudioCodecEnum audioCodec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_black_cut")

    private Boolean isBlackCut;

    /**
     * 格式<br/> 
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
         * Enum DASH for value: "DASH"
         */
        public static final FormatEnum DASH = new FormatEnum("DASH");

        /**
         * Enum DASH_HLS for value: "DASH_HLS"
         */
        public static final FormatEnum DASH_HLS = new FormatEnum("DASH_HLS");

        /**
         * Enum MP3 for value: "MP3"
         */
        public static final FormatEnum MP3 = new FormatEnum("MP3");

        /**
         * Enum ADTS for value: "ADTS"
         */
        public static final FormatEnum ADTS = new FormatEnum("ADTS");

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final FormatEnum UNKNOW = new FormatEnum("UNKNOW");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("MP4", MP4);
            map.put("HLS", HLS);
            map.put("DASH", DASH);
            map.put("DASH_HLS", DASH_HLS);
            map.put("MP3", MP3);
            map.put("ADTS", ADTS);
            map.put("UNKNOW", UNKNOW);
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
    @JsonProperty(value = "hls_interval")

    private Integer hlsInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upsample")

    private Boolean upsample;

    /**
     * SHORT：短边自适应<br/> LONG：长边自适应<br/> NONE：宽高自适应<br/> 
     */
    public static final class AdaptationEnum {

        /**
         * Enum SHORT for value: "SHORT"
         */
        public static final AdaptationEnum SHORT = new AdaptationEnum("SHORT");

        /**
         * Enum LONG for value: "LONG"
         */
        public static final AdaptationEnum LONG = new AdaptationEnum("LONG");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AdaptationEnum NONE = new AdaptationEnum("NONE");

        private static final Map<String, AdaptationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AdaptationEnum> createStaticFields() {
            Map<String, AdaptationEnum> map = new HashMap<>();
            map.put("SHORT", SHORT);
            map.put("LONG", LONG);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AdaptationEnum(String value) {
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
        public static AdaptationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AdaptationEnum(value));
        }

        public static AdaptationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AdaptationEnum) {
                return this.value.equals(((AdaptationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adaptation")

    private AdaptationEnum adaptation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preset")

    private Integer preset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_iframes_interval")

    private Integer maxIframesInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_audio_separate")

    private Boolean hlsAudioSeparate;

    /**
     * 分片的封装格式，目前支持TS和FMP4，默认TS格式。 
     */
    public static final class HlsSegmentTypeEnum {

        /**
         * Enum TS for value: "TS"
         */
        public static final HlsSegmentTypeEnum TS = new HlsSegmentTypeEnum("TS");

        /**
         * Enum FMP4 for value: "FMP4"
         */
        public static final HlsSegmentTypeEnum FMP4 = new HlsSegmentTypeEnum("FMP4");

        private static final Map<String, HlsSegmentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HlsSegmentTypeEnum> createStaticFields() {
            Map<String, HlsSegmentTypeEnum> map = new HashMap<>();
            map.put("TS", TS);
            map.put("FMP4", FMP4);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HlsSegmentTypeEnum(String value) {
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
        public static HlsSegmentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HlsSegmentTypeEnum(value));
        }

        public static HlsSegmentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HlsSegmentTypeEnum) {
                return this.value.equals(((HlsSegmentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_segment_type")

    private HlsSegmentTypeEnum hlsSegmentType;

    public CommonInfo withPvc(Boolean pvc) {
        this.pvc = pvc;
        return this;
    }

    /**
     * 高清低码开关<br/> 
     * @return pvc
     */
    public Boolean getPvc() {
        return pvc;
    }

    public void setPvc(Boolean pvc) {
        this.pvc = pvc;
    }

    public CommonInfo withVideoCodec(VideoCodecEnum videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * 视频编码格式<br/> 
     * @return videoCodec
     */
    public VideoCodecEnum getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(VideoCodecEnum videoCodec) {
        this.videoCodec = videoCodec;
    }

    public CommonInfo withAudioCodec(AudioCodecEnum audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * 音频编码格式<br/> AAC：AAC格式 (default)<br/> HEAAC1：HEAAC1格式<br/> HEAAC2：HEAAC2格式<br/> MP3：MP3格式<br/> 
     * @return audioCodec
     */
    public AudioCodecEnum getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(AudioCodecEnum audioCodec) {
        this.audioCodec = audioCodec;
    }

    public CommonInfo withIsBlackCut(Boolean isBlackCut) {
        this.isBlackCut = isBlackCut;
        return this;
    }

    /**
     * 黑边剪裁类型<br/> 
     * @return isBlackCut
     */
    public Boolean getIsBlackCut() {
        return isBlackCut;
    }

    public void setIsBlackCut(Boolean isBlackCut) {
        this.isBlackCut = isBlackCut;
    }

    public CommonInfo withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * 格式<br/> 
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public CommonInfo withHlsInterval(Integer hlsInterval) {
        this.hlsInterval = hlsInterval;
        return this;
    }

    /**
     * 分片时长(默认为5秒)<br/> 
     * minimum: 2
     * maximum: 10
     * @return hlsInterval
     */
    public Integer getHlsInterval() {
        return hlsInterval;
    }

    public void setHlsInterval(Integer hlsInterval) {
        this.hlsInterval = hlsInterval;
    }

    public CommonInfo withUpsample(Boolean upsample) {
        this.upsample = upsample;
        return this;
    }

    /**
     * 上采样<br/> 
     * @return upsample
     */
    public Boolean getUpsample() {
        return upsample;
    }

    public void setUpsample(Boolean upsample) {
        this.upsample = upsample;
    }

    public CommonInfo withAdaptation(AdaptationEnum adaptation) {
        this.adaptation = adaptation;
        return this;
    }

    /**
     * SHORT：短边自适应<br/> LONG：长边自适应<br/> NONE：宽高自适应<br/> 
     * @return adaptation
     */
    public AdaptationEnum getAdaptation() {
        return adaptation;
    }

    public void setAdaptation(AdaptationEnum adaptation) {
        this.adaptation = adaptation;
    }

    public CommonInfo withPreset(Integer preset) {
        this.preset = preset;
        return this;
    }

    /**
     * 编码质量等级，取值[0,2] 0表示当前现网方式默认方式，1表示转码效率优先，2表示转码质量优先。<br/> 
     * @return preset
     */
    public Integer getPreset() {
        return preset;
    }

    public void setPreset(Integer preset) {
        this.preset = preset;
    }

    public CommonInfo withMaxIframesInterval(Integer maxIframesInterval) {
        this.maxIframesInterval = maxIframesInterval;
        return this;
    }

    /**
     * I帧最大间隔，取值范围：[2，10]。默认值：5，单位秒。<br/> 
     * @return maxIframesInterval
     */
    public Integer getMaxIframesInterval() {
        return maxIframesInterval;
    }

    public void setMaxIframesInterval(Integer maxIframesInterval) {
        this.maxIframesInterval = maxIframesInterval;
    }

    public CommonInfo withHlsAudioSeparate(Boolean hlsAudioSeparate) {
        this.hlsAudioSeparate = hlsAudioSeparate;
        return this;
    }

    /**
     * 转码后音频是否独立存储。<br/> 
     * @return hlsAudioSeparate
     */
    public Boolean getHlsAudioSeparate() {
        return hlsAudioSeparate;
    }

    public void setHlsAudioSeparate(Boolean hlsAudioSeparate) {
        this.hlsAudioSeparate = hlsAudioSeparate;
    }

    public CommonInfo withHlsSegmentType(HlsSegmentTypeEnum hlsSegmentType) {
        this.hlsSegmentType = hlsSegmentType;
        return this;
    }

    /**
     * 分片的封装格式，目前支持TS和FMP4，默认TS格式。 
     * @return hlsSegmentType
     */
    public HlsSegmentTypeEnum getHlsSegmentType() {
        return hlsSegmentType;
    }

    public void setHlsSegmentType(HlsSegmentTypeEnum hlsSegmentType) {
        this.hlsSegmentType = hlsSegmentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommonInfo that = (CommonInfo) obj;
        return Objects.equals(this.pvc, that.pvc) && Objects.equals(this.videoCodec, that.videoCodec)
            && Objects.equals(this.audioCodec, that.audioCodec) && Objects.equals(this.isBlackCut, that.isBlackCut)
            && Objects.equals(this.format, that.format) && Objects.equals(this.hlsInterval, that.hlsInterval)
            && Objects.equals(this.upsample, that.upsample) && Objects.equals(this.adaptation, that.adaptation)
            && Objects.equals(this.preset, that.preset)
            && Objects.equals(this.maxIframesInterval, that.maxIframesInterval)
            && Objects.equals(this.hlsAudioSeparate, that.hlsAudioSeparate)
            && Objects.equals(this.hlsSegmentType, that.hlsSegmentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pvc,
            videoCodec,
            audioCodec,
            isBlackCut,
            format,
            hlsInterval,
            upsample,
            adaptation,
            preset,
            maxIframesInterval,
            hlsAudioSeparate,
            hlsSegmentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommonInfo {\n");
        sb.append("    pvc: ").append(toIndentedString(pvc)).append("\n");
        sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
        sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
        sb.append("    isBlackCut: ").append(toIndentedString(isBlackCut)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    hlsInterval: ").append(toIndentedString(hlsInterval)).append("\n");
        sb.append("    upsample: ").append(toIndentedString(upsample)).append("\n");
        sb.append("    adaptation: ").append(toIndentedString(adaptation)).append("\n");
        sb.append("    preset: ").append(toIndentedString(preset)).append("\n");
        sb.append("    maxIframesInterval: ").append(toIndentedString(maxIframesInterval)).append("\n");
        sb.append("    hlsAudioSeparate: ").append(toIndentedString(hlsAudioSeparate)).append("\n");
        sb.append("    hlsSegmentType: ").append(toIndentedString(hlsSegmentType)).append("\n");
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
