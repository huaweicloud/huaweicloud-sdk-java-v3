package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 语音文件配置信息 */
public class RunModerationAudioRequestBodyConfig {

    /** 支持的语音格式 */
    public static final class FormatEnum {

        /** Enum PCM16K16BIT for value: "pcm16k16bit" */
        public static final FormatEnum PCM16K16BIT = new FormatEnum("pcm16k16bit");

        /** Enum PCM8K16BIT for value: "pcm8k16bit" */
        public static final FormatEnum PCM8K16BIT = new FormatEnum("pcm8k16bit");

        /** Enum ULAW16K8BIT for value: "ulaw16k8bit" */
        public static final FormatEnum ULAW16K8BIT = new FormatEnum("ulaw16k8bit");

        /** Enum ULAW8K8BIT for value: "ulaw8k8bit" */
        public static final FormatEnum ULAW8K8BIT = new FormatEnum("ulaw8k8bit");

        /** Enum ALAW16K8BIT for value: "alaw16k8bit" */
        public static final FormatEnum ALAW16K8BIT = new FormatEnum("alaw16k8bit");

        /** Enum ALAW8K8BIT for value: "alaw8k8bit" */
        public static final FormatEnum ALAW8K8BIT = new FormatEnum("alaw8k8bit");

        /** Enum MP3 for value: "mp3" */
        public static final FormatEnum MP3 = new FormatEnum("mp3");

        /** Enum AAC for value: "aac" */
        public static final FormatEnum AAC = new FormatEnum("aac");

        /** Enum WAV for value: "wav" */
        public static final FormatEnum WAV = new FormatEnum("wav");

        /** Enum AMR for value: "amr" */
        public static final FormatEnum AMR = new FormatEnum("amr");

        /** Enum AMRWB for value: "amrwb" */
        public static final FormatEnum AMRWB = new FormatEnum("amrwb");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
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

    /** 所使用的模型特征串。通常是 “语种_采样率_领域”的形式。 采样率需要与音频采样率保持一致。 当前支持如下模型特征串： chinese_8k_common chinese_16k_common */
    public static final class PropertyEnum {

        /** Enum CHINESE_8K_COMMON for value: "chinese_8k_common" */
        public static final PropertyEnum CHINESE_8K_COMMON = new PropertyEnum("chinese_8k_common");

        /** Enum CHINESE_16K_COMMON for value: "chinese_16k_common" */
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

    public RunModerationAudioRequestBodyConfig withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /** 支持的语音格式
     * 
     * @return format */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public RunModerationAudioRequestBodyConfig withProperty(PropertyEnum property) {
        this.property = property;
        return this;
    }

    /** 所使用的模型特征串。通常是 “语种_采样率_领域”的形式。 采样率需要与音频采样率保持一致。 当前支持如下模型特征串： chinese_8k_common chinese_16k_common
     * 
     * @return property */
    public PropertyEnum getProperty() {
        return property;
    }

    public void setProperty(PropertyEnum property) {
        this.property = property;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunModerationAudioRequestBodyConfig runModerationAudioRequestBodyConfig =
            (RunModerationAudioRequestBodyConfig) o;
        return Objects.equals(this.format, runModerationAudioRequestBodyConfig.format)
            && Objects.equals(this.property, runModerationAudioRequestBodyConfig.property);
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, property);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunModerationAudioRequestBodyConfig {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
