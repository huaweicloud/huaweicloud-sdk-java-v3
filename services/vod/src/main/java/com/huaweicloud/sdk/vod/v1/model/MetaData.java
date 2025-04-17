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
 * 视频的元数据信息。  经过视频解析后产生，包括封装格式、大小、分辨率、码率、帧率。
 */
public class MetaData {

    /**
     * 视频封装格式。  取值如下： - MP4 - TS - MOV - MXF - MPG - FLV - WMV - MP3 - WMA - APE - FLAC - AAC - AC3 - MMF - AMR - M4A - M4R - OGG - WAV - WV - MP2 - AVI - F4V - M4V - MPEG - HLS - DASH
     */
    public static final class PackTypeEnum {

        /**
         * Enum MP4 for value: "MP4"
         */
        public static final PackTypeEnum MP4 = new PackTypeEnum("MP4");

        /**
         * Enum TS for value: "TS"
         */
        public static final PackTypeEnum TS = new PackTypeEnum("TS");

        /**
         * Enum MOV for value: "MOV"
         */
        public static final PackTypeEnum MOV = new PackTypeEnum("MOV");

        /**
         * Enum MXF for value: "MXF"
         */
        public static final PackTypeEnum MXF = new PackTypeEnum("MXF");

        /**
         * Enum MPG for value: "MPG"
         */
        public static final PackTypeEnum MPG = new PackTypeEnum("MPG");

        /**
         * Enum FLV for value: "FLV"
         */
        public static final PackTypeEnum FLV = new PackTypeEnum("FLV");

        /**
         * Enum WMV for value: "WMV"
         */
        public static final PackTypeEnum WMV = new PackTypeEnum("WMV");

        /**
         * Enum MP3 for value: "MP3"
         */
        public static final PackTypeEnum MP3 = new PackTypeEnum("MP3");

        /**
         * Enum WMA for value: "WMA"
         */
        public static final PackTypeEnum WMA = new PackTypeEnum("WMA");

        /**
         * Enum APE for value: "APE"
         */
        public static final PackTypeEnum APE = new PackTypeEnum("APE");

        /**
         * Enum FLAC for value: "FLAC"
         */
        public static final PackTypeEnum FLAC = new PackTypeEnum("FLAC");

        /**
         * Enum AAC for value: "AAC"
         */
        public static final PackTypeEnum AAC = new PackTypeEnum("AAC");

        /**
         * Enum AC3 for value: "AC3"
         */
        public static final PackTypeEnum AC3 = new PackTypeEnum("AC3");

        /**
         * Enum MMF for value: "MMF"
         */
        public static final PackTypeEnum MMF = new PackTypeEnum("MMF");

        /**
         * Enum AMR for value: "AMR"
         */
        public static final PackTypeEnum AMR = new PackTypeEnum("AMR");

        /**
         * Enum M4A for value: "M4A"
         */
        public static final PackTypeEnum M4A = new PackTypeEnum("M4A");

        /**
         * Enum M4R for value: "M4R"
         */
        public static final PackTypeEnum M4R = new PackTypeEnum("M4R");

        /**
         * Enum OGG for value: "OGG"
         */
        public static final PackTypeEnum OGG = new PackTypeEnum("OGG");

        /**
         * Enum WAV for value: "WAV"
         */
        public static final PackTypeEnum WAV = new PackTypeEnum("WAV");

        /**
         * Enum WV for value: "WV"
         */
        public static final PackTypeEnum WV = new PackTypeEnum("WV");

        /**
         * Enum MP2 for value: "MP2"
         */
        public static final PackTypeEnum MP2 = new PackTypeEnum("MP2");

        /**
         * Enum AVI for value: "AVI"
         */
        public static final PackTypeEnum AVI = new PackTypeEnum("AVI");

        /**
         * Enum F4V for value: "F4V"
         */
        public static final PackTypeEnum F4V = new PackTypeEnum("F4V");

        /**
         * Enum M4V for value: "M4V"
         */
        public static final PackTypeEnum M4V = new PackTypeEnum("M4V");

        /**
         * Enum MPEG for value: "MPEG"
         */
        public static final PackTypeEnum MPEG = new PackTypeEnum("MPEG");

        /**
         * Enum HLS for value: "HLS"
         */
        public static final PackTypeEnum HLS = new PackTypeEnum("HLS");

        /**
         * Enum DASH for value: "DASH"
         */
        public static final PackTypeEnum DASH = new PackTypeEnum("DASH");

        private static final Map<String, PackTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PackTypeEnum> createStaticFields() {
            Map<String, PackTypeEnum> map = new HashMap<>();
            map.put("MP4", MP4);
            map.put("TS", TS);
            map.put("MOV", MOV);
            map.put("MXF", MXF);
            map.put("MPG", MPG);
            map.put("FLV", FLV);
            map.put("WMV", WMV);
            map.put("MP3", MP3);
            map.put("WMA", WMA);
            map.put("APE", APE);
            map.put("FLAC", FLAC);
            map.put("AAC", AAC);
            map.put("AC3", AC3);
            map.put("MMF", MMF);
            map.put("AMR", AMR);
            map.put("M4A", M4A);
            map.put("M4R", M4R);
            map.put("OGG", OGG);
            map.put("WAV", WAV);
            map.put("WV", WV);
            map.put("MP2", MP2);
            map.put("AVI", AVI);
            map.put("F4V", F4V);
            map.put("M4V", M4V);
            map.put("MPEG", MPEG);
            map.put("HLS", HLS);
            map.put("DASH", DASH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PackTypeEnum(String value) {
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
        public static PackTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PackTypeEnum(value));
        }

        public static PackTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PackTypeEnum) {
                return this.value.equals(((PackTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pack_type")

    private PackTypeEnum packType;

    /**
     * 视频编码格式。  取值如下： - MPEG-2 - MPEG-4 - H.264 - H.265 - WMV - Vorbis - AAC - AC-3 - AMR - APE - FLAC - MP3 - MP2 - WMA - PCM - ADPCM - WavPack
     */
    public static final class CodecEnum {

        /**
         * Enum MPEG_2 for value: "MPEG-2"
         */
        public static final CodecEnum MPEG_2 = new CodecEnum("MPEG-2");

        /**
         * Enum MPEG_4 for value: "MPEG-4"
         */
        public static final CodecEnum MPEG_4 = new CodecEnum("MPEG-4");

        /**
         * Enum H_264 for value: "H.264"
         */
        public static final CodecEnum H_264 = new CodecEnum("H.264");

        /**
         * Enum H_265 for value: "H.265"
         */
        public static final CodecEnum H_265 = new CodecEnum("H.265");

        /**
         * Enum WMV for value: "WMV"
         */
        public static final CodecEnum WMV = new CodecEnum("WMV");

        /**
         * Enum VORBIS for value: "Vorbis"
         */
        public static final CodecEnum VORBIS = new CodecEnum("Vorbis");

        /**
         * Enum AAC for value: "AAC"
         */
        public static final CodecEnum AAC = new CodecEnum("AAC");

        /**
         * Enum EAC_3 for value: "EAC-3"
         */
        public static final CodecEnum EAC_3 = new CodecEnum("EAC-3");

        /**
         * Enum AC_3 for value: "AC-3"
         */
        public static final CodecEnum AC_3 = new CodecEnum("AC-3");

        /**
         * Enum AMR for value: "AMR"
         */
        public static final CodecEnum AMR = new CodecEnum("AMR");

        /**
         * Enum APE for value: "APE"
         */
        public static final CodecEnum APE = new CodecEnum("APE");

        /**
         * Enum FLAC for value: "FLAC"
         */
        public static final CodecEnum FLAC = new CodecEnum("FLAC");

        /**
         * Enum MP3 for value: "MP3"
         */
        public static final CodecEnum MP3 = new CodecEnum("MP3");

        /**
         * Enum MP2 for value: "MP2"
         */
        public static final CodecEnum MP2 = new CodecEnum("MP2");

        /**
         * Enum WMA for value: "WMA"
         */
        public static final CodecEnum WMA = new CodecEnum("WMA");

        /**
         * Enum PCM for value: "PCM"
         */
        public static final CodecEnum PCM = new CodecEnum("PCM");

        /**
         * Enum ADPCM for value: "ADPCM"
         */
        public static final CodecEnum ADPCM = new CodecEnum("ADPCM");

        /**
         * Enum WAVPACK for value: "WavPack"
         */
        public static final CodecEnum WAVPACK = new CodecEnum("WavPack");

        /**
         * Enum HEAAC for value: "HEAAC"
         */
        public static final CodecEnum HEAAC = new CodecEnum("HEAAC");

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final CodecEnum UNKNOWN = new CodecEnum("UNKNOWN");

        private static final Map<String, CodecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CodecEnum> createStaticFields() {
            Map<String, CodecEnum> map = new HashMap<>();
            map.put("MPEG-2", MPEG_2);
            map.put("MPEG-4", MPEG_4);
            map.put("H.264", H_264);
            map.put("H.265", H_265);
            map.put("WMV", WMV);
            map.put("Vorbis", VORBIS);
            map.put("AAC", AAC);
            map.put("EAC-3", EAC_3);
            map.put("AC-3", AC_3);
            map.put("AMR", AMR);
            map.put("APE", APE);
            map.put("FLAC", FLAC);
            map.put("MP3", MP3);
            map.put("MP2", MP2);
            map.put("WMA", WMA);
            map.put("PCM", PCM);
            map.put("ADPCM", ADPCM);
            map.put("WavPack", WAVPACK);
            map.put("HEAAC", HEAAC);
            map.put("UNKNOWN", UNKNOWN);
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
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_ms")

    private Long durationMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_size")

    private Long videoSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Long width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hight")

    private Long hight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Long height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bit_rate")

    private Long bitRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private Long frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quality")

    private String quality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_channels")

    private Integer audioChannels;

    public MetaData withPackType(PackTypeEnum packType) {
        this.packType = packType;
        return this;
    }

    /**
     * 视频封装格式。  取值如下： - MP4 - TS - MOV - MXF - MPG - FLV - WMV - MP3 - WMA - APE - FLAC - AAC - AC3 - MMF - AMR - M4A - M4R - OGG - WAV - WV - MP2 - AVI - F4V - M4V - MPEG - HLS - DASH
     * @return packType
     */
    public PackTypeEnum getPackType() {
        return packType;
    }

    public void setPackType(PackTypeEnum packType) {
        this.packType = packType;
    }

    public MetaData withCodec(CodecEnum codec) {
        this.codec = codec;
        return this;
    }

    /**
     * 视频编码格式。  取值如下： - MPEG-2 - MPEG-4 - H.264 - H.265 - WMV - Vorbis - AAC - AC-3 - AMR - APE - FLAC - MP3 - MP2 - WMA - PCM - ADPCM - WavPack
     * @return codec
     */
    public CodecEnum getCodec() {
        return codec;
    }

    public void setCodec(CodecEnum codec) {
        this.codec = codec;
    }

    public MetaData withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 视频时长，单位：秒。  若视频的原时长为非整数，则该字段值为原时长的向下取整。 若视频的原时长小于1，则该字段值为1。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public MetaData withDurationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    /**
     * 视频时长，单位毫秒。
     * @return durationMs
     */
    public Long getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
    }

    public MetaData withVideoSize(Long videoSize) {
        this.videoSize = videoSize;
        return this;
    }

    /**
     * 视频文件大小。  单位：字节。
     * @return videoSize
     */
    public Long getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(Long videoSize) {
        this.videoSize = videoSize;
    }

    public MetaData withWidth(Long width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度（单位：像素）。 - 编码为H.264的取值范围：[32,3840]之间2的倍数。 - 编码为H.265的取值范围：[320,3840]之间4的倍数。
     * @return width
     */
    public Long getWidth() {
        return width;
    }

    public void setWidth(Long width) {
        this.width = width;
    }

    public MetaData withHight(Long hight) {
        this.hight = hight;
        return this;
    }

    /**
     * 视频高度（单位：像素）。该字段会逐渐废弃，请使用height字段。 - 编码为H.264的取值范围：[32,2160]之间2的倍数 。 - 编码为H.265的取值范围：[240,2160]之间4的倍数。
     * @return hight
     */
    public Long getHight() {
        return hight;
    }

    public void setHight(Long hight) {
        this.hight = hight;
    }

    public MetaData withHeight(Long height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度（单位：像素）。 - 编码为H.264的取值范围：[32,2160]之间2的倍数 。 - 编码为H.265的取值范围：[240,2160]之间4的倍数。
     * @return height
     */
    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public MetaData withBitRate(Long bitRate) {
        this.bitRate = bitRate;
        return this;
    }

    /**
     * 视频平均码率。
     * @return bitRate
     */
    public Long getBitRate() {
        return bitRate;
    }

    public void setBitRate(Long bitRate) {
        this.bitRate = bitRate;
    }

    public MetaData withFrameRate(Long frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 帧率（单位：帧每秒）。  取值如下： - FRAMERATE_AUTO = 1, - FRAMERATE_10 = 2, - FRAMERATE_15 = 3, - FRAMERATE_2397 = 4, // 23.97 fps - FRAMERATE_24 = 5, - FRAMERATE_25 = 6, - FRAMERATE_2997 = 7, // 29.97 fps - FRAMERATE_30 = 8, - FRAMERATE_50 = 9, - FRAMERATE_60 = 10  默认值：1。  单位：帧每秒。
     * @return frameRate
     */
    public Long getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(Long frameRate) {
        this.frameRate = frameRate;
    }

    public MetaData withQuality(String quality) {
        this.quality = quality;
        return this;
    }

    /**
     * 清晰度。  取值如下： - FULL_HD：超高清 - HD：高清 - SD：标清 - FLUENT：流畅 - AD：自适应 - 2K - 4K
     * @return quality
     */
    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public MetaData withAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
        return this;
    }

    /**
     * 音频的声道数。
     * @return audioChannels
     */
    public Integer getAudioChannels() {
        return audioChannels;
    }

    public void setAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetaData that = (MetaData) obj;
        return Objects.equals(this.packType, that.packType) && Objects.equals(this.codec, that.codec)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.durationMs, that.durationMs)
            && Objects.equals(this.videoSize, that.videoSize) && Objects.equals(this.width, that.width)
            && Objects.equals(this.hight, that.hight) && Objects.equals(this.height, that.height)
            && Objects.equals(this.bitRate, that.bitRate) && Objects.equals(this.frameRate, that.frameRate)
            && Objects.equals(this.quality, that.quality) && Objects.equals(this.audioChannels, that.audioChannels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packType,
            codec,
            duration,
            durationMs,
            videoSize,
            width,
            hight,
            height,
            bitRate,
            frameRate,
            quality,
            audioChannels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaData {\n");
        sb.append("    packType: ").append(toIndentedString(packType)).append("\n");
        sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
        sb.append("    videoSize: ").append(toIndentedString(videoSize)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    hight: ").append(toIndentedString(hight)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    bitRate: ").append(toIndentedString(bitRate)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    audioChannels: ").append(toIndentedString(audioChannels)).append("\n");
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
