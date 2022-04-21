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
 * Request Object
 */
public class RecognizeFlashAsrRequest {

    /**
     * 所使用的模型特征串。通常是 “语种_采样率_领域”的形式。 采样率需要与音频采样率保持一致。 当前支持如下模型特征串： chinese_8k_common chinese_16k_common
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

        private static final Map<String, PropertyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PropertyEnum> createStaticFields() {
            Map<String, PropertyEnum> map = new HashMap<>();
            map.put("chinese_8k_common", CHINESE_8K_COMMON);
            map.put("chinese_16k_common", CHINESE_16K_COMMON);
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
     * 音频格式，audio_format取值范围： wav,mp3,m4a,aac,opus
     */
    public static final class AudioFormatEnum {

        /**
         * Enum WAV for value: "wav"
         */
        public static final AudioFormatEnum WAV = new AudioFormatEnum("wav");

        /**
         * Enum MP3 for value: "mp3"
         */
        public static final AudioFormatEnum MP3 = new AudioFormatEnum("mp3");

        /**
         * Enum M4A for value: "m4a"
         */
        public static final AudioFormatEnum M4A = new AudioFormatEnum("m4a");

        /**
         * Enum AAC for value: "aac"
         */
        public static final AudioFormatEnum AAC = new AudioFormatEnum("aac");

        /**
         * Enum OPUS for value: "opus"
         */
        public static final AudioFormatEnum OPUS = new AudioFormatEnum("opus");

        private static final Map<String, AudioFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioFormatEnum> createStaticFields() {
            Map<String, AudioFormatEnum> map = new HashMap<>();
            map.put("wav", WAV);
            map.put("mp3", MP3);
            map.put("m4a", M4A);
            map.put("aac", AAC);
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

    private AudioFormatEnum audioFormat;

    /**
     * 是否加标点， 可以为 yes, 默认no
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

    /**
     * 是否将音频中的数字使用阿拉伯数字的形式呈现，取值为yes，no，默认为yes
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
     * 表示是否在识别结果中输出分词结果信息，取值为yes，no，默认no
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vocabulary_id")

    private String vocabularyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket_name")

    private String obsBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_object_key")

    private String obsObjectKey;

    /**
     * 表示是否在识别中只识别首个声道的音频数据，取值为“yes”和“no”，默认为“no”。
     */
    public static final class FirstChannelOnlyEnum {

        /**
         * Enum YES for value: "yes"
         */
        public static final FirstChannelOnlyEnum YES = new FirstChannelOnlyEnum("yes");

        /**
         * Enum NO for value: "no"
         */
        public static final FirstChannelOnlyEnum NO = new FirstChannelOnlyEnum("no");

        private static final Map<String, FirstChannelOnlyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FirstChannelOnlyEnum> createStaticFields() {
            Map<String, FirstChannelOnlyEnum> map = new HashMap<>();
            map.put("yes", YES);
            map.put("no", NO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FirstChannelOnlyEnum(String value) {
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
        public static FirstChannelOnlyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FirstChannelOnlyEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FirstChannelOnlyEnum(value);
            }
            return result;
        }

        public static FirstChannelOnlyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FirstChannelOnlyEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FirstChannelOnlyEnum) {
                return this.value.equals(((FirstChannelOnlyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_channel_only")

    private FirstChannelOnlyEnum firstChannelOnly;

    public RecognizeFlashAsrRequest withProperty(PropertyEnum property) {
        this.property = property;
        return this;
    }

    /**
     * 所使用的模型特征串。通常是 “语种_采样率_领域”的形式。 采样率需要与音频采样率保持一致。 当前支持如下模型特征串： chinese_8k_common chinese_16k_common
     * @return property
     */
    public PropertyEnum getProperty() {
        return property;
    }

    public void setProperty(PropertyEnum property) {
        this.property = property;
    }

    public RecognizeFlashAsrRequest withAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
        return this;
    }

    /**
     * 音频格式，audio_format取值范围： wav,mp3,m4a,aac,opus
     * @return audioFormat
     */
    public AudioFormatEnum getAudioFormat() {
        return audioFormat;
    }

    public void setAudioFormat(AudioFormatEnum audioFormat) {
        this.audioFormat = audioFormat;
    }

    public RecognizeFlashAsrRequest withAddPunc(AddPuncEnum addPunc) {
        this.addPunc = addPunc;
        return this;
    }

    /**
     * 是否加标点， 可以为 yes, 默认no
     * @return addPunc
     */
    public AddPuncEnum getAddPunc() {
        return addPunc;
    }

    public void setAddPunc(AddPuncEnum addPunc) {
        this.addPunc = addPunc;
    }

    public RecognizeFlashAsrRequest withDigitNorm(DigitNormEnum digitNorm) {
        this.digitNorm = digitNorm;
        return this;
    }

    /**
     * 是否将音频中的数字使用阿拉伯数字的形式呈现，取值为yes，no，默认为yes
     * @return digitNorm
     */
    public DigitNormEnum getDigitNorm() {
        return digitNorm;
    }

    public void setDigitNorm(DigitNormEnum digitNorm) {
        this.digitNorm = digitNorm;
    }

    public RecognizeFlashAsrRequest withNeedWordInfo(NeedWordInfoEnum needWordInfo) {
        this.needWordInfo = needWordInfo;
        return this;
    }

    /**
     * 表示是否在识别结果中输出分词结果信息，取值为yes，no，默认no
     * @return needWordInfo
     */
    public NeedWordInfoEnum getNeedWordInfo() {
        return needWordInfo;
    }

    public void setNeedWordInfo(NeedWordInfoEnum needWordInfo) {
        this.needWordInfo = needWordInfo;
    }

    public RecognizeFlashAsrRequest withVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
        return this;
    }

    /**
     * 热词表id
     * @return vocabularyId
     */
    public String getVocabularyId() {
        return vocabularyId;
    }

    public void setVocabularyId(String vocabularyId) {
        this.vocabularyId = vocabularyId;
    }

    public RecognizeFlashAsrRequest withObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
        return this;
    }

    /**
     * obs桶名
     * @return obsBucketName
     */
    public String getObsBucketName() {
        return obsBucketName;
    }

    public void setObsBucketName(String obsBucketName) {
        this.obsBucketName = obsBucketName;
    }

    public RecognizeFlashAsrRequest withObsObjectKey(String obsObjectKey) {
        this.obsObjectKey = obsObjectKey;
        return this;
    }

    /**
     * obs对象key，经过urlencode编码，长度不超过1024个字符
     * @return obsObjectKey
     */
    public String getObsObjectKey() {
        return obsObjectKey;
    }

    public void setObsObjectKey(String obsObjectKey) {
        this.obsObjectKey = obsObjectKey;
    }

    public RecognizeFlashAsrRequest withFirstChannelOnly(FirstChannelOnlyEnum firstChannelOnly) {
        this.firstChannelOnly = firstChannelOnly;
        return this;
    }

    /**
     * 表示是否在识别中只识别首个声道的音频数据，取值为“yes”和“no”，默认为“no”。
     * @return firstChannelOnly
     */
    public FirstChannelOnlyEnum getFirstChannelOnly() {
        return firstChannelOnly;
    }

    public void setFirstChannelOnly(FirstChannelOnlyEnum firstChannelOnly) {
        this.firstChannelOnly = firstChannelOnly;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecognizeFlashAsrRequest recognizeFlashAsrRequest = (RecognizeFlashAsrRequest) o;
        return Objects.equals(this.property, recognizeFlashAsrRequest.property)
            && Objects.equals(this.audioFormat, recognizeFlashAsrRequest.audioFormat)
            && Objects.equals(this.addPunc, recognizeFlashAsrRequest.addPunc)
            && Objects.equals(this.digitNorm, recognizeFlashAsrRequest.digitNorm)
            && Objects.equals(this.needWordInfo, recognizeFlashAsrRequest.needWordInfo)
            && Objects.equals(this.vocabularyId, recognizeFlashAsrRequest.vocabularyId)
            && Objects.equals(this.obsBucketName, recognizeFlashAsrRequest.obsBucketName)
            && Objects.equals(this.obsObjectKey, recognizeFlashAsrRequest.obsObjectKey)
            && Objects.equals(this.firstChannelOnly, recognizeFlashAsrRequest.firstChannelOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(property,
            audioFormat,
            addPunc,
            digitNorm,
            needWordInfo,
            vocabularyId,
            obsBucketName,
            obsObjectKey,
            firstChannelOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeFlashAsrRequest {\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    audioFormat: ").append(toIndentedString(audioFormat)).append("\n");
        sb.append("    addPunc: ").append(toIndentedString(addPunc)).append("\n");
        sb.append("    digitNorm: ").append(toIndentedString(digitNorm)).append("\n");
        sb.append("    needWordInfo: ").append(toIndentedString(needWordInfo)).append("\n");
        sb.append("    vocabularyId: ").append(toIndentedString(vocabularyId)).append("\n");
        sb.append("    obsBucketName: ").append(toIndentedString(obsBucketName)).append("\n");
        sb.append("    obsObjectKey: ").append(toIndentedString(obsObjectKey)).append("\n");
        sb.append("    firstChannelOnly: ").append(toIndentedString(firstChannelOnly)).append("\n");
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
