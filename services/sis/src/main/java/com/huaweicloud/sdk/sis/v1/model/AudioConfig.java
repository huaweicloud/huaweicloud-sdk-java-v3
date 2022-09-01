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
 * 
 */
public class AudioConfig {

    /**
     * 语音的格式。不填写此字段，则默认为auto。注意音频不论何种格式，均要求采样率在16000Hz以上。  auto  自动判断，系统会自动判断并支持WAV（内部支持pcm/ulaw/alaw编码格式）、MP3、M4A、ogg-opus、AMR等格式。推荐使用此取值。  wav  wav格式。  aac  aac格式。  mp3  mp3格式。  amr  amr格式。  m4a  m4a格式。  opus  ogg-opus格式。 
     */
    public static final class AudioFormatEnum {

        /**
         * Enum AUTO for value: "auto"
         */
        public static final AudioFormatEnum AUTO = new AudioFormatEnum("auto");

        /**
         * Enum WAV for value: "wav"
         */
        public static final AudioFormatEnum WAV = new AudioFormatEnum("wav");

        /**
         * Enum AAC for value: "aac"
         */
        public static final AudioFormatEnum AAC = new AudioFormatEnum("aac");

        /**
         * Enum MP3 for value: "mp3"
         */
        public static final AudioFormatEnum MP3 = new AudioFormatEnum("mp3");

        /**
         * Enum AMR for value: "amr"
         */
        public static final AudioFormatEnum AMR = new AudioFormatEnum("amr");

        /**
         * Enum M4A for value: "m4a"
         */
        public static final AudioFormatEnum M4A = new AudioFormatEnum("m4a");

        /**
         * Enum OPUS for value: "opus"
         */
        public static final AudioFormatEnum OPUS = new AudioFormatEnum("opus");

        private static final Map<String, AudioFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioFormatEnum> createStaticFields() {
            Map<String, AudioFormatEnum> map = new HashMap<>();
            map.put("auto", AUTO);
            map.put("wav", WAV);
            map.put("aac", AAC);
            map.put("mp3", MP3);
            map.put("amr", AMR);
            map.put("m4a", M4A);
            map.put("opus", OPUS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AudioFormatEnum(String value) {
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
        public static AudioFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AudioFormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AudioFormatEnum(value);
            }
            return result;
        }

        public static AudioFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AudioFormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AudioFormatEnum) {
                return this.value.equals(((AudioFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_format")

    @JacksonXmlProperty(localName = "audio_format")

    private AudioFormatEnum audioFormat;

    /**
     * 评测语言  en_gb  英语-英式口音。
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
     * 评测模式  word 单词模式  sentence 句子模式
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

    public AudioConfig withAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    /**
     * 语音的格式。不填写此字段，则默认为auto。注意音频不论何种格式，均要求采样率在16000Hz以上。  auto  自动判断，系统会自动判断并支持WAV（内部支持pcm/ulaw/alaw编码格式）、MP3、M4A、ogg-opus、AMR等格式。推荐使用此取值。  wav  wav格式。  aac  aac格式。  mp3  mp3格式。  amr  amr格式。  m4a  m4a格式。  opus  ogg-opus格式。 
     * @return audioFormat
     */
    public AudioFormatEnum getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
    }

    public AudioConfig withLanguage(LanguageEnum language) {
        this.language = language;
        return this;
    }

    /**
     * 评测语言  en_gb  英语-英式口音。
     * @return language
     */
    public LanguageEnum getLanguage() {
        return language;
    }

    public void setLanguage(LanguageEnum language) {
        this.language = language;
    }

    public AudioConfig withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * 评测模式  word 单词模式  sentence 句子模式
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
        AudioConfig audioConfig = (AudioConfig) o;
        return Objects.equals(this.audioFormat, audioConfig.audioFormat)
            && Objects.equals(this.language, audioConfig.language) && Objects.equals(this.mode, audioConfig.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioFormat, language, mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioConfig {\n");
        sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
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
