package com.huaweicloud.sdk.sis.v1.model;

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
 * TranscriberConfig
 */
public class TranscriberConfig {

    /**
     * 支持语音的格式。  audioformat取值范围:  auto  自动判断，系统会自动判断并支持WAV（内部支持pcm/ulaw/alaw/adpcm编码格式）、MP3、M4A、ogg-speex、ogg-opus、AMR、wma等格式，相应的文件后缀名为.wav, .mp3, .m4a, .spx, .opus, .amr 和.wma, 不区分大小写。支持双声道的音频。  pcm16k16bit  16k16bit裸音频录音数据。  pcm8k16bit   8k16bit裸音频录音数据。  ulaw16k8bit  16k8bit ulaw 裸音频录音数据。  ulaw8k8bit   8k8bit ulaw 裸音频录音数据。  alaw16k8bit  16k8bit alaw 裸音频录音数据。  alaw8k8bit   8k8bit alaw 裸音频录音数据。  vox8k4bit    8k4bit vox 裸音频录音数据。  v3_8k4bit    8k4bit v3 裸音频录音数据。
     */
    public static final class AudioFormatEnum {

        /**
         * Enum AUTO for value: "auto"
         */
        public static final AudioFormatEnum AUTO = new AudioFormatEnum("auto");

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
         * Enum VOX8K4BIT for value: "vox8k4bit"
         */
        public static final AudioFormatEnum VOX8K4BIT = new AudioFormatEnum("vox8k4bit");

        /**
         * Enum V3_8K4BIT for value: "v3_8k4bit"
         */
        public static final AudioFormatEnum V3_8K4BIT = new AudioFormatEnum("v3_8k4bit");

        private static final Map<String, AudioFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioFormatEnum> createStaticFields() {
            Map<String, AudioFormatEnum> map = new HashMap<>();
            map.put("auto", AUTO);
            map.put("pcm16k16bit", PCM16K16BIT);
            map.put("pcm8k16bit", PCM8K16BIT);
            map.put("ulaw16k8bit", ULAW16K8BIT);
            map.put("ulaw8k8bit", ULAW8K8BIT);
            map.put("alaw16k8bit", ALAW16K8BIT);
            map.put("alaw8k8bit", ALAW8K8BIT);
            map.put("vox8k4bit", VOX8K4BIT);
            map.put("v3_8k4bit", V3_8K4BIT);
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
     * 所使用的模型特征串。通常是“语种_采样率_领域”的形式，例如chinese_8k_common。  采样率需要与音频采样率保持一致。  当前支持如下模型特征串：  chinese_8k_general （最新8k 通用版e2e模型，推荐使用）  chinese_16k_media (音视频领域，区域仅支持cn-north-4，cn-east-3)  chinese_8k_common  chinese_16k_conversation  chinese_8k_bank（银行领域，区域仅支持cn-north-4）  chinese_8k_insurance（保险领域，区域仅支持cn-north-4）  sichuan_8k_common （四川话识别，区域支持cn-north-4，cn-east-3） 
     */
    public static final class PropertyEnum {

        /**
         * Enum CHINESE_16K_MEDIA for value: "chinese_16k_media"
         */
        public static final PropertyEnum CHINESE_16K_MEDIA = new PropertyEnum("chinese_16k_media");

        /**
         * Enum CHINESE_8K_COMMON for value: "chinese_8k_common"
         */
        public static final PropertyEnum CHINESE_8K_COMMON = new PropertyEnum("chinese_8k_common");

        /**
         * Enum CHINESE_16K_CONVERSATION for value: "chinese_16k_conversation"
         */
        public static final PropertyEnum CHINESE_16K_CONVERSATION = new PropertyEnum("chinese_16k_conversation");

        /**
         * Enum CHINESE_8K_BANK for value: "chinese_8k_bank"
         */
        public static final PropertyEnum CHINESE_8K_BANK = new PropertyEnum("chinese_8k_bank");

        /**
         * Enum CHINESE_8K_INSURANCE for value: "chinese_8k_insurance"
         */
        public static final PropertyEnum CHINESE_8K_INSURANCE = new PropertyEnum("chinese_8k_insurance");

        /**
         * Enum SICHUAN_8K_COMMON for value: "sichuan_8k_common"
         */
        public static final PropertyEnum SICHUAN_8K_COMMON = new PropertyEnum("sichuan_8k_common");

        /**
         * Enum CHINESE_8K_GENERAL for value: "chinese_8k_general"
         */
        public static final PropertyEnum CHINESE_8K_GENERAL = new PropertyEnum("chinese_8k_general");

        private static final Map<String, PropertyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PropertyEnum> createStaticFields() {
            Map<String, PropertyEnum> map = new HashMap<>();
            map.put("chinese_16k_media", CHINESE_16K_MEDIA);
            map.put("chinese_8k_common", CHINESE_8K_COMMON);
            map.put("chinese_16k_conversation", CHINESE_16K_CONVERSATION);
            map.put("chinese_8k_bank", CHINESE_8K_BANK);
            map.put("chinese_8k_insurance", CHINESE_8K_INSURANCE);
            map.put("sichuan_8k_common", SICHUAN_8K_COMMON);
            map.put("chinese_8k_general", CHINESE_8K_GENERAL);
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
     * 是否加标点， 可以为 yes, no(缺省)。
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
    @JsonProperty(value = "need_analysis_info")

    private AnalysisInfo needAnalysisInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vocabulary_id")

    private String vocabularyId;

    /**
     * 表示是否将语音中的数字识别为阿拉伯数字，取值为yes 、 no，缺省为yes。
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_url")

    private String callbackUrl;

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

    public TranscriberConfig withAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    /**
     * 支持语音的格式。  audioformat取值范围:  auto  自动判断，系统会自动判断并支持WAV（内部支持pcm/ulaw/alaw/adpcm编码格式）、MP3、M4A、ogg-speex、ogg-opus、AMR、wma等格式，相应的文件后缀名为.wav, .mp3, .m4a, .spx, .opus, .amr 和.wma, 不区分大小写。支持双声道的音频。  pcm16k16bit  16k16bit裸音频录音数据。  pcm8k16bit   8k16bit裸音频录音数据。  ulaw16k8bit  16k8bit ulaw 裸音频录音数据。  ulaw8k8bit   8k8bit ulaw 裸音频录音数据。  alaw16k8bit  16k8bit alaw 裸音频录音数据。  alaw8k8bit   8k8bit alaw 裸音频录音数据。  vox8k4bit    8k4bit vox 裸音频录音数据。  v3_8k4bit    8k4bit v3 裸音频录音数据。
     * @return audioFormat
     */
    public AudioFormatEnum getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
    }

    public TranscriberConfig withProperty(PropertyEnum property) {
        this.property = property;
        return this;
    }

    /**
     * 所使用的模型特征串。通常是“语种_采样率_领域”的形式，例如chinese_8k_common。  采样率需要与音频采样率保持一致。  当前支持如下模型特征串：  chinese_8k_general （最新8k 通用版e2e模型，推荐使用）  chinese_16k_media (音视频领域，区域仅支持cn-north-4，cn-east-3)  chinese_8k_common  chinese_16k_conversation  chinese_8k_bank（银行领域，区域仅支持cn-north-4）  chinese_8k_insurance（保险领域，区域仅支持cn-north-4）  sichuan_8k_common （四川话识别，区域支持cn-north-4，cn-east-3） 
     * @return property
     */
    public PropertyEnum getProperty() {
        return property;
    }

    public void setProperty(PropertyEnum property) {
        this.property = property;
    }

    public TranscriberConfig withAddPunc(AddPuncEnum addPunc) {
        this.addPunc = addPunc;
        return this;
    }

    /**
     * 是否加标点， 可以为 yes, no(缺省)。
     * @return addPunc
     */
    public AddPuncEnum getAddPunc() {
        return addPunc;
    }

    public void setAddPunc(AddPuncEnum addPunc) {
        this.addPunc = addPunc;
    }

    public TranscriberConfig withNeedAnalysisInfo(AnalysisInfo needAnalysisInfo) {
        this.needAnalysisInfo = needAnalysisInfo;
        return this;
    }

    public TranscriberConfig withNeedAnalysisInfo(Consumer<AnalysisInfo> needAnalysisInfoSetter) {
        if (this.needAnalysisInfo == null) {
            this.needAnalysisInfo = new AnalysisInfo();
            needAnalysisInfoSetter.accept(this.needAnalysisInfo);
        }

        return this;
    }

    /**
     * Get needAnalysisInfo
     * @return needAnalysisInfo
     */
    public AnalysisInfo getNeedAnalysisInfo() {
        return needAnalysisInfo;
    }

    public void setNeedAnalysisInfo(AnalysisInfo needAnalysisInfo) {
        this.needAnalysisInfo = needAnalysisInfo;
    }

    public TranscriberConfig withVocabularyId(String vocabularyId) {
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

    public TranscriberConfig withDigitNorm(DigitNormEnum digitNorm) {
        this.digitNorm = digitNorm;
        return this;
    }

    /**
     * 表示是否将语音中的数字识别为阿拉伯数字，取值为yes 、 no，缺省为yes。
     * @return digitNorm
     */
    public DigitNormEnum getDigitNorm() {
        return digitNorm;
    }

    public void setDigitNorm(DigitNormEnum digitNorm) {
        this.digitNorm = digitNorm;
    }

    public TranscriberConfig withCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * 用于录音文件识表示回调 url，即用户用于接收识别结果的服务器地址，不支持IP地址方式调用，url长度小于2048字节。服务请求方法为POST。  如果用户使用回调方式获取识别结果，需填写该参数，处理成功后用户服务器需返回状态码“200”。  如果用户使用轮询方式获取识别结果，则无需填写该参数。别结果的回调url，不使用则不填写。
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public TranscriberConfig withNeedWordInfo(NeedWordInfoEnum needWordInfo) {
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
        TranscriberConfig transcriberConfig = (TranscriberConfig) o;
        return Objects.equals(this.audioFormat, transcriberConfig.audioFormat)
            && Objects.equals(this.property, transcriberConfig.property)
            && Objects.equals(this.addPunc, transcriberConfig.addPunc)
            && Objects.equals(this.needAnalysisInfo, transcriberConfig.needAnalysisInfo)
            && Objects.equals(this.vocabularyId, transcriberConfig.vocabularyId)
            && Objects.equals(this.digitNorm, transcriberConfig.digitNorm)
            && Objects.equals(this.callbackUrl, transcriberConfig.callbackUrl)
            && Objects.equals(this.needWordInfo, transcriberConfig.needWordInfo);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(audioFormat, property, addPunc, needAnalysisInfo, vocabularyId, digitNorm, callbackUrl, needWordInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscriberConfig {\n");
        sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    addPunc: ").append(toIndentedString(addPunc)).append("\n");
        sb.append("    needAnalysisInfo: ").append(toIndentedString(needAnalysisInfo)).append("\n");
        sb.append("    vocabularyId: ").append(toIndentedString(vocabularyId)).append("\n");
        sb.append("    digitNorm: ").append(toIndentedString(digitNorm)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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
