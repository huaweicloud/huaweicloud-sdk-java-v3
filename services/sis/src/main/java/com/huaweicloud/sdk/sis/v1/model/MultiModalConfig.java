package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 多模态评测的配置
 */
public class MultiModalConfig {

    /**
     * 视频的封装格式。不填写此字段，则默认为auto。注意不论何种格式，均要求帧率在25fps以上，清晰度在240*240以上。   auto  自动判断，系统会自动判断视频封装格式。  avi  avi封装格式。  mp4  mp4封装格式。  webm  webm封装格式。  mkv  mkv封装格式。  flv  flv封装格式。 
     */
    public static final class VideoFormatEnum {

        /**
         * Enum AUTO for value: "auto"
         */
        public static final VideoFormatEnum AUTO = new VideoFormatEnum("auto");

        /**
         * Enum AVI for value: "avi"
         */
        public static final VideoFormatEnum AVI = new VideoFormatEnum("avi");

        /**
         * Enum MP4 for value: "mp4"
         */
        public static final VideoFormatEnum MP4 = new VideoFormatEnum("mp4");

        /**
         * Enum WEBM for value: "webm"
         */
        public static final VideoFormatEnum WEBM = new VideoFormatEnum("webm");

        /**
         * Enum MKV for value: "mkv"
         */
        public static final VideoFormatEnum MKV = new VideoFormatEnum("mkv");

        /**
         * Enum FLV for value: "flv"
         */
        public static final VideoFormatEnum FLV = new VideoFormatEnum("flv");

        private static final Map<String, VideoFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoFormatEnum> createStaticFields() {
            Map<String, VideoFormatEnum> map = new HashMap<>();
            map.put("auto", AUTO);
            map.put("avi", AVI);
            map.put("mp4", MP4);
            map.put("webm", WEBM);
            map.put("mkv", MKV);
            map.put("flv", FLV);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VideoFormatEnum(String value) {
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
        public static VideoFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            VideoFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new VideoFormatEnum(value);
            }
            return result;
        }

        public static VideoFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            VideoFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VideoFormatEnum) {
                return this.value.equals(((VideoFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_format")

    @JacksonXmlProperty(localName = "video_format")

    private VideoFormatEnum videoFormat;

    /**
     * 评测语言和口音。  en_gb 英语-英式口音。
     */
    public static final class LanguageEnum {

        /**
         * Enum EN_GB for value: "en_gb"
         */
        public static final LanguageEnum EN_GB = new LanguageEnum("en_gb");

        private static final Map<String, LanguageEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageEnum> createStaticFields() {
            Map<String, LanguageEnum> map = new HashMap<>();
            map.put("en_gb", EN_GB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageEnum(String value) {
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
        public static LanguageEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LanguageEnum(value);
            }
            return result;
        }

        public static LanguageEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LanguageEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageEnum) {
                return this.value.equals(((LanguageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    @JacksonXmlProperty(localName = "language")

    private LanguageEnum language;

    /**
     * 评测模式。  word 单词模式。  sentence 句子模式。
     */
    public static final class ModeEnum {

        /**
         * Enum WORD for value: "word"
         */
        public static final ModeEnum WORD = new ModeEnum("word");

        /**
         * Enum SENTENCE for value: "sentence"
         */
        public static final ModeEnum SENTENCE = new ModeEnum("sentence");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("word", WORD);
            map.put("sentence", SENTENCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ModeEnum(value);
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    @JacksonXmlProperty(localName = "mode")

    private ModeEnum mode;

    public MultiModalConfig withVideoFormat(VideoFormatEnum videoFormat) {
        this.videoFormat = videoFormat;
        return this;
    }

    /**
     * 视频的封装格式。不填写此字段，则默认为auto。注意不论何种格式，均要求帧率在25fps以上，清晰度在240*240以上。   auto  自动判断，系统会自动判断视频封装格式。  avi  avi封装格式。  mp4  mp4封装格式。  webm  webm封装格式。  mkv  mkv封装格式。  flv  flv封装格式。 
     * @return videoFormat
     */
    public VideoFormatEnum getVideoFormat() {
        return videoFormat;
    }

    public void setVideoFormat(VideoFormatEnum videoFormat) {
        this.videoFormat = videoFormat;
    }

    public MultiModalConfig withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 评测语言和口音。  en_gb 英语-英式口音。
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public MultiModalConfig withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 评测模式。  word 单词模式。  sentence 句子模式。
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiModalConfig multiModalConfig = (MultiModalConfig) o;
        return Objects.equals(this.videoFormat, multiModalConfig.videoFormat)
            && Objects.equals(this.language, multiModalConfig.language)
            && Objects.equals(this.mode, multiModalConfig.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoFormat, language, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiModalConfig {\n");
        sb.append("    videoFormat: ").append(toIndentedString(videoFormat)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
