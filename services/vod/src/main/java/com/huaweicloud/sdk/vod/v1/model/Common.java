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
 * 模板信息。
 */
public class Common {

    /**
     * pvc开关。
     */
    public static final class PvcEnum {

        /**
         * Enum _0 for value: "0"
         */
        public static final PvcEnum _0 = new PvcEnum("0");

        /**
         * Enum _1 for value: "1"
         */
        public static final PvcEnum _1 = new PvcEnum("1");

        /**
         * Enum _2 for value: "2"
         */
        public static final PvcEnum _2 = new PvcEnum("2");

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final PvcEnum UNKNOW = new PvcEnum("UNKNOW");

        private static final Map<String, PvcEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PvcEnum> createStaticFields() {
            Map<String, PvcEnum> map = new HashMap<>();
            map.put("0", _0);
            map.put("1", _1);
            map.put("2", _2);
            map.put("UNKNOW", UNKNOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PvcEnum(String value) {
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
        public static PvcEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PvcEnum(value));
        }

        public static PvcEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PvcEnum) {
                return this.value.equals(((PvcEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pvc")

    private PvcEnum pvc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pvc_version")

    private String pvcVersion;

    /**
     * 视频编码格式。
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

        /**
         * Enum UNKNOW for value: "UNKNOW"
         */
        public static final VideoCodecEnum UNKNOW = new VideoCodecEnum("UNKNOW");

        private static final Map<String, VideoCodecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoCodecEnum> createStaticFields() {
            Map<String, VideoCodecEnum> map = new HashMap<>();
            map.put("H264", H264);
            map.put("H265", H265);
            map.put("UNKNOW", UNKNOW);
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
     * 音频编码格式(有效值范围) - 1：AUDIO_CODECTYPE_AAC - 2：AUDIO_CODECTYPE_HEAAC1 - 3：AUDIO_CODECTYPE_HEAAC2 - 4：AUDIO_CODECTYPE_MP3  默认值为1。
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
    @JsonProperty(value = "hls_interval")

    private Integer hlsInterval;

    public Common withPvc(PvcEnum pvc) {
        this.pvc = pvc;
        return this;
    }

    /**
     * pvc开关。
     * @return pvc
     */
    public PvcEnum getPvc() {
        return pvc;
    }

    public void setPvc(PvcEnum pvc) {
        this.pvc = pvc;
    }

    public Common withPvcVersion(String pvcVersion) {
        this.pvcVersion = pvcVersion;
        return this;
    }

    /**
     * pvc版本。
     * @return pvcVersion
     */
    public String getPvcVersion() {
        return pvcVersion;
    }

    public void setPvcVersion(String pvcVersion) {
        this.pvcVersion = pvcVersion;
    }

    public Common withVideoCodec(VideoCodecEnum videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * 视频编码格式。
     * @return videoCodec
     */
    public VideoCodecEnum getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(VideoCodecEnum videoCodec) {
        this.videoCodec = videoCodec;
    }

    public Common withAudioCodec(AudioCodecEnum audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * 音频编码格式(有效值范围) - 1：AUDIO_CODECTYPE_AAC - 2：AUDIO_CODECTYPE_HEAAC1 - 3：AUDIO_CODECTYPE_HEAAC2 - 4：AUDIO_CODECTYPE_MP3  默认值为1。
     * @return audioCodec
     */
    public AudioCodecEnum getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(AudioCodecEnum audioCodec) {
        this.audioCodec = audioCodec;
    }

    public Common withHlsInterval(Integer hlsInterval) {
        this.hlsInterval = hlsInterval;
        return this;
    }

    /**
     * 分片时长(默认为5秒)。
     * @return hlsInterval
     */
    public Integer getHlsInterval() {
        return hlsInterval;
    }

    public void setHlsInterval(Integer hlsInterval) {
        this.hlsInterval = hlsInterval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Common that = (Common) obj;
        return Objects.equals(this.pvc, that.pvc) && Objects.equals(this.pvcVersion, that.pvcVersion)
            && Objects.equals(this.videoCodec, that.videoCodec) && Objects.equals(this.audioCodec, that.audioCodec)
            && Objects.equals(this.hlsInterval, that.hlsInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pvc, pvcVersion, videoCodec, audioCodec, hlsInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Common {\n");
        sb.append("    pvc: ").append(toIndentedString(pvc)).append("\n");
        sb.append("    pvcVersion: ").append(toIndentedString(pvcVersion)).append("\n");
        sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
        sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
        sb.append("    hlsInterval: ").append(toIndentedString(hlsInterval)).append("\n");
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
