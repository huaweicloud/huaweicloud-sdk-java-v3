package com.huaweicloud.sdk.vod.v1.model;

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
 * 
 */
public class QualityInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    private VideoTemplateInfo video;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private AudioTemplateInfo audio;

    /**
     * 格式。
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
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FormatEnum(value);
            }
            return result;
        }

        public static FormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public QualityInfo withVideo(VideoTemplateInfo video) {
        this.video = video;
        return this;
    }

    public QualityInfo withVideo(Consumer<VideoTemplateInfo> videoSetter) {
        if (this.video == null) {
            this.video = new VideoTemplateInfo();
            videoSetter.accept(this.video);
        }

        return this;
    }

    /**
     * Get video
     * @return video
     */
    public VideoTemplateInfo getVideo() {
        return video;
    }

    public void setVideo(VideoTemplateInfo video) {
        this.video = video;
    }

    public QualityInfo withAudio(AudioTemplateInfo audio) {
        this.audio = audio;
        return this;
    }

    public QualityInfo withAudio(Consumer<AudioTemplateInfo> audioSetter) {
        if (this.audio == null) {
            this.audio = new AudioTemplateInfo();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    /**
     * Get audio
     * @return audio
     */
    public AudioTemplateInfo getAudio() {
        return audio;
    }

    public void setAudio(AudioTemplateInfo audio) {
        this.audio = audio;
    }

    public QualityInfo withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * 格式。
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualityInfo qualityInfo = (QualityInfo) o;
        return Objects.equals(this.video, qualityInfo.video) && Objects.equals(this.audio, qualityInfo.audio)
            && Objects.equals(this.format, qualityInfo.format);
    }

    @Override
    public int hashCode() {
        return Objects.hash(video, audio, format);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityInfo {\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
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
