package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Config
 */
public class Config {

    /**
     * 支持语音的格式。  audio_format取值范围：  pcm16k16bit  16k16bit单通道录音数据。  pcm8k16bit   8k16bit单通道录音数据。  ulaw16k8bit  16k8bit ulaw 单通道录音数据。  ulaw8k8bit   8k8bit ulaw 单通道录音数据。  alaw16k8bit  16k8bit alaw 单通道录音数据。  alaw8k8bit   8k8bit alaw 单通道录音数据。  mp3  mp3格式音频。目前仅支持单通道的音频。  aac  aac格式音频。目前仅支持单通道的音频。  wav  带wav封装头的格式，从封装头中自动确定格式，目前仅支持8k/16k采样率、单通道、pcm, alaw, ulaw三种编码格式  amr  AMR窄带(8k) 压缩录音数据。  amrwb  AMR 宽带(16k) 压缩录音数据。  auto 由引擎自动判断音频数据的格式并解码，支持自动判断wav，mp3，amr/amrwb，aac，m4a，wma格式
     */
    public static final class AudioFormatEnum {

        /**
         * Enum PCM16K16BIT for value: "pcm16k16bit"
         */
        public static final AudioFormatEnum PCM16K16BIT = new AudioFormatEnum("pcm16k16bit");

        /**
         * Enum PCM8K16BIT for value: "pcm8k16bit"
         */
        public static final AudioFormatEnum PCM8K16BIT = new AudioFormatEnum("pcm8k16bit");

        /**
         * Enum ULAW16K8BIT for value: "ulaw16k8bit"
         */
        public static final AudioFormatEnum ULAW16K8BIT = new AudioFormatEnum("ulaw16k8bit");

        /**
         * Enum ULAW8K8BIT for value: "ulaw8k8bit"
         */
        public static final AudioFormatEnum ULAW8K8BIT = new AudioFormatEnum("ulaw8k8bit");

        /**
         * Enum ALAW16K8BIT for value: "alaw16k8bit"
         */
        public static final AudioFormatEnum ALAW16K8BIT = new AudioFormatEnum("alaw16k8bit");

        /**
         * Enum ALAW8K8BIT for value: "alaw8k8bit"
         */
        public static final AudioFormatEnum ALAW8K8BIT = new AudioFormatEnum("alaw8k8bit");

        /**
         * Enum MP3 for value: "mp3"
         */
        public static final AudioFormatEnum MP3 = new AudioFormatEnum("mp3");

        /**
         * Enum AAC for value: "aac"
         */
        public static final AudioFormatEnum AAC = new AudioFormatEnum("aac");

        /**
         * Enum WAV for value: "wav"
         */
        public static final AudioFormatEnum WAV = new AudioFormatEnum("wav");

        /**
         * Enum AMR for value: "amr"
         */
        public static final AudioFormatEnum AMR = new AudioFormatEnum("amr");

        /**
         * Enum AMRWB for value: "amrwb"
         */
        public static final AudioFormatEnum AMRWB = new AudioFormatEnum("amrwb");

        /**
         * Enum AUTO for value: "auto"
         */
        public static final AudioFormatEnum AUTO = new AudioFormatEnum("auto");

        private static final Map<String, AudioFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioFormatEnum> createStaticFields() {
            Map<String, AudioFormatEnum> map = new HashMap<>();
            map.put("pcm16k16bit", PCM16K16BIT);
            map.put("pcm8k16bit", PCM8K16BIT);
            map.put("ulaw16k8bit", ULAW16K8BIT);
            map.put("ulaw8k8bit", ULAW8K8BIT);
            map.put("alaw16k8bit", ALAW16K8BIT);
            map.put("alaw8k8bit", ALAW8K8BIT);
            map.put("mp3", MP3);
            map.put("aac", AAC);
            map.put("wav", WAV);
            map.put("amr", AMR);
            map.put("amrwb", AMRWB);
            map.put("auto", AUTO);
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

    private AudioFormatEnum audioFormat;

    /**
     * 所使用的模型特征串。通常是 “语种_采样率_领域”的形式。  采样率需要与音频采样率保持一致。  当前支持如下模型特征串：  chinese_8k_common  支持采样率为8k的中文普通话语音识别。  chinese_16k_common  支持采样率为16k的中文普通话语音识别。  chinese_16k_general  支持采样率为16k的中文普通话语音识别，同时可识别一些简单的方言。格式仅支持pcm16k16bit、mp3、wav，区域仅支持cn-north-4。  sichuan_16k_common  支持采样率为16k的中文普通话与四川话方言识别。区域仅支持cn-north-4。  cantonese_16k_common  支持采样率为16k的粤语方言识别。区域仅支持cn-north-4。  shanghai_16k_common  支持采样率为16k的上海话方言识别，区域仅支持cn-north-4。
     */
    public static final class PropertyEnum {

        /**
         * Enum CHINESE_8K_COMMON for value: "chinese_8k_common"
         */
        public static final PropertyEnum CHINESE_8K_COMMON = new PropertyEnum("chinese_8k_common");

        /**
         * Enum CHINESE_16K_COMMON for value: "chinese_16k_common"
         */
        public static final PropertyEnum CHINESE_16K_COMMON = new PropertyEnum("chinese_16k_common");

        /**
         * Enum CHINESE_16K_GENERAL for value: "chinese_16k_general"
         */
        public static final PropertyEnum CHINESE_16K_GENERAL = new PropertyEnum("chinese_16k_general");

        /**
         * Enum CHINESE_16K_TRAVEL for value: "chinese_16k_travel"
         */
        public static final PropertyEnum CHINESE_16K_TRAVEL = new PropertyEnum("chinese_16k_travel");

        /**
         * Enum SICHUAN_16K_COMMON for value: "sichuan_16k_common"
         */
        public static final PropertyEnum SICHUAN_16K_COMMON = new PropertyEnum("sichuan_16k_common");

        /**
         * Enum CANTONESE_16K_COMMON for value: "cantonese_16k_common"
         */
        public static final PropertyEnum CANTONESE_16K_COMMON = new PropertyEnum("cantonese_16k_common");

        /**
         * Enum SHANGHAI_16K_COMMON for value: "shanghai_16k_common"
         */
        public static final PropertyEnum SHANGHAI_16K_COMMON = new PropertyEnum("shanghai_16k_common");

        private static final Map<String, PropertyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PropertyEnum> createStaticFields() {
            Map<String, PropertyEnum> map = new HashMap<>();
            map.put("chinese_8k_common", CHINESE_8K_COMMON);
            map.put("chinese_16k_common", CHINESE_16K_COMMON);
            map.put("chinese_16k_general", CHINESE_16K_GENERAL);
            map.put("chinese_16k_travel", CHINESE_16K_TRAVEL);
            map.put("sichuan_16k_common", SICHUAN_16K_COMMON);
            map.put("cantonese_16k_common", CANTONESE_16K_COMMON);
            map.put("shanghai_16k_common", SHANGHAI_16K_COMMON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PropertyEnum(String value) {
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
        public static PropertyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            PropertyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PropertyEnum(value);
            }
            return result;
        }

        public static PropertyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            PropertyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PropertyEnum) {
                return this.value.equals(((PropertyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    private PropertyEnum property;

    /**
     * 表示是否在识别结果中添加标点，取值为“yes”和“no”，缺省为“no”。
     */
    public static final class AddPuncEnum {

        /**
         * Enum YES for value: "yes"
         */
        public static final AddPuncEnum YES = new AddPuncEnum("yes");

        /**
         * Enum NO for value: "no"
         */
        public static final AddPuncEnum NO = new AddPuncEnum("no");

        private static final Map<String, AddPuncEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AddPuncEnum> createStaticFields() {
            Map<String, AddPuncEnum> map = new HashMap<>();
            map.put("yes", YES);
            map.put("no", NO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AddPuncEnum(String value) {
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
        public static AddPuncEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            AddPuncEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new AddPuncEnum(value);
            }
            return result;
        }

        public static AddPuncEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            AddPuncEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AddPuncEnum) {
                return this.value.equals(((AddPuncEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_punc")

    private AddPuncEnum addPunc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vocabulary_id")

    private String vocabularyId;

    /**
     * 表示是否将语音中的数字识别为阿拉伯数字，取值为“yes” 和 “no”，缺省为“yes”。
     */
    public static final class DigitNormEnum {

        /**
         * Enum YES for value: "yes"
         */
        public static final DigitNormEnum YES = new DigitNormEnum("yes");

        /**
         * Enum NO for value: "no"
         */
        public static final DigitNormEnum NO = new DigitNormEnum("no");

        private static final Map<String, DigitNormEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DigitNormEnum> createStaticFields() {
            Map<String, DigitNormEnum> map = new HashMap<>();
            map.put("yes", YES);
            map.put("no", NO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DigitNormEnum(String value) {
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
        public static DigitNormEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            DigitNormEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DigitNormEnum(value);
            }
            return result;
        }

        public static DigitNormEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DigitNormEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DigitNormEnum) {
                return this.value.equals(((DigitNormEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "digit_norm")

    private DigitNormEnum digitNorm;

    /**
     * 表示是否在识别结果中输出分词结果信息，取值为“yes”和“no”，默认为“no”。
     */
    public static final class NeedWordInfoEnum {

        /**
         * Enum YES for value: "yes"
         */
        public static final NeedWordInfoEnum YES = new NeedWordInfoEnum("yes");

        /**
         * Enum NO for value: "no"
         */
        public static final NeedWordInfoEnum NO = new NeedWordInfoEnum("no");

        private static final Map<String, NeedWordInfoEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NeedWordInfoEnum> createStaticFields() {
            Map<String, NeedWordInfoEnum> map = new HashMap<>();
            map.put("yes", YES);
            map.put("no", NO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NeedWordInfoEnum(String value) {
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
        public static NeedWordInfoEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NeedWordInfoEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NeedWordInfoEnum(value);
            }
            return result;
        }

        public static NeedWordInfoEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NeedWordInfoEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NeedWordInfoEnum) {
                return this.value.equals(((NeedWordInfoEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_word_info")

    private NeedWordInfoEnum needWordInfo;

    public Config withAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    /**
     * 支持语音的格式。  audio_format取值范围：  pcm16k16bit  16k16bit单通道录音数据。  pcm8k16bit   8k16bit单通道录音数据。  ulaw16k8bit  16k8bit ulaw 单通道录音数据。  ulaw8k8bit   8k8bit ulaw 单通道录音数据。  alaw16k8bit  16k8bit alaw 单通道录音数据。  alaw8k8bit   8k8bit alaw 单通道录音数据。  mp3  mp3格式音频。目前仅支持单通道的音频。  aac  aac格式音频。目前仅支持单通道的音频。  wav  带wav封装头的格式，从封装头中自动确定格式，目前仅支持8k/16k采样率、单通道、pcm, alaw, ulaw三种编码格式  amr  AMR窄带(8k) 压缩录音数据。  amrwb  AMR 宽带(16k) 压缩录音数据。  auto 由引擎自动判断音频数据的格式并解码，支持自动判断wav，mp3，amr/amrwb，aac，m4a，wma格式
     * @return audioFormat
     */
    public AudioFormatEnum getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
    }

    public Config withProperty(PropertyEnum property) {
        this.property = property;
        return this;
    }

    /**
     * 所使用的模型特征串。通常是 “语种_采样率_领域”的形式。  采样率需要与音频采样率保持一致。  当前支持如下模型特征串：  chinese_8k_common  支持采样率为8k的中文普通话语音识别。  chinese_16k_common  支持采样率为16k的中文普通话语音识别。  chinese_16k_general  支持采样率为16k的中文普通话语音识别，同时可识别一些简单的方言。格式仅支持pcm16k16bit、mp3、wav，区域仅支持cn-north-4。  sichuan_16k_common  支持采样率为16k的中文普通话与四川话方言识别。区域仅支持cn-north-4。  cantonese_16k_common  支持采样率为16k的粤语方言识别。区域仅支持cn-north-4。  shanghai_16k_common  支持采样率为16k的上海话方言识别，区域仅支持cn-north-4。
     * @return property
     */
    public PropertyEnum getProperty() {
        return property;
    }

    public void setProperty(PropertyEnum property) {
        this.property = property;
    }

    public Config withAddPunc(AddPuncEnum addPunc) {
        this.addPunc = addPunc;
        return this;
    }

    /**
     * 表示是否在识别结果中添加标点，取值为“yes”和“no”，缺省为“no”。
     * @return addPunc
     */
    public AddPuncEnum getAddPunc() {
        return addPunc;
    }

    public void setAddPunc(AddPuncEnum addPunc) {
        this.addPunc = addPunc;
    }

    public Config withVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }

    /**
     * 热词表id，不使用则不填写。
     * @return vocabularyId
     */
    public String getVocabularyId() {
        return vocabularyId;
    }

    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    public Config withDigitNorm(DigitNormEnum digitNorm) {
        this.digitNorm = digitNorm;
        return this;
    }

    /**
     * 表示是否将语音中的数字识别为阿拉伯数字，取值为“yes” 和 “no”，缺省为“yes”。
     * @return digitNorm
     */
    public DigitNormEnum getDigitNorm() {
        return digitNorm;
    }

    public void setDigitNorm(DigitNormEnum digitNorm) {
        this.digitNorm = digitNorm;
    }

    public Config withNeedWordInfo(NeedWordInfoEnum needWordInfo) {
        this.needWordInfo = needWordInfo;
        return this;
    }

    /**
     * 表示是否在识别结果中输出分词结果信息，取值为“yes”和“no”，默认为“no”。
     * @return needWordInfo
     */
    public NeedWordInfoEnum getNeedWordInfo() {
        return needWordInfo;
    }

    public void setNeedWordInfo(NeedWordInfoEnum needWordInfo) {
        this.needWordInfo = needWordInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Config config = (Config) o;
        return Objects.equals(this.audioFormat, config.audioFormat) && Objects.equals(this.property, config.property)
            && Objects.equals(this.addPunc, config.addPunc) && Objects.equals(this.vocabularyId, config.vocabularyId)
            && Objects.equals(this.digitNorm, config.digitNorm)
            && Objects.equals(this.needWordInfo, config.needWordInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(audioFormat, property, addPunc, vocabularyId, digitNorm, needWordInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Config {\n");
        sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    addPunc: ").append(toIndentedString(addPunc)).append("\n");
        sb.append("    vocabularyId: ").append(toIndentedString(vocabularyId)).append("\n");
        sb.append("    digitNorm: ").append(toIndentedString(digitNorm)).append("\n");
        sb.append("    needWordInfo: ").append(toIndentedString(needWordInfo)).append("\n");
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
