package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EncoderSettingsExpandAudioDescriptions
 */
public class EncoderSettingsExpandAudioDescriptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_selector_name")

    private String audioSelectorName;

    /**
     * 语言代码控制。这里的设置不会修改音频实际的语言，只会修改音频对外展示的语言。  包含如下选项： - FOLLOW_INPUT：如果所选音频选择器对应的输出音频有语言，则与其保持一致，否则会以这里配置的语言代码和流名称进行兜底。推荐当前选项，为默认值。 - USE_CONFIGURED：用户根据实际情况自定义输出音频的语言和流名称。
     */
    public static final class LanguageCodeControlEnum {

        /**
         * Enum FOLLOW_INPUT for value: "FOLLOW_INPUT"
         */
        public static final LanguageCodeControlEnum FOLLOW_INPUT = new LanguageCodeControlEnum("FOLLOW_INPUT");

        /**
         * Enum USE_CONFIGURED for value: "USE_CONFIGURED"
         */
        public static final LanguageCodeControlEnum USE_CONFIGURED = new LanguageCodeControlEnum("USE_CONFIGURED");

        private static final Map<String, LanguageCodeControlEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageCodeControlEnum> createStaticFields() {
            Map<String, LanguageCodeControlEnum> map = new HashMap<>();
            map.put("FOLLOW_INPUT", FOLLOW_INPUT);
            map.put("USE_CONFIGURED", USE_CONFIGURED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageCodeControlEnum(String value) {
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
        public static LanguageCodeControlEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LanguageCodeControlEnum(value));
        }

        public static LanguageCodeControlEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageCodeControlEnum) {
                return this.value.equals(((LanguageCodeControlEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language_code_control")

    private LanguageCodeControlEnum languageCodeControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language_code")

    private String languageCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_name")

    private String streamName;

    public EncoderSettingsExpandAudioDescriptions withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 音频输出配置的名称。仅支持大小写字母，数字，中划线（-），下划线（_）。  同一个频道不同的音频输出配置名称，不允许重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EncoderSettingsExpandAudioDescriptions withAudioSelectorName(String audioSelectorName) {
        this.audioSelectorName = audioSelectorName;
        return this;
    }

    /**
     * 音频选择器名称
     * @return audioSelectorName
     */
    public String getAudioSelectorName() {
        return audioSelectorName;
    }

    public void setAudioSelectorName(String audioSelectorName) {
        this.audioSelectorName = audioSelectorName;
    }

    public EncoderSettingsExpandAudioDescriptions withLanguageCodeControl(LanguageCodeControlEnum languageCodeControl) {
        this.languageCodeControl = languageCodeControl;
        return this;
    }

    /**
     * 语言代码控制。这里的设置不会修改音频实际的语言，只会修改音频对外展示的语言。  包含如下选项： - FOLLOW_INPUT：如果所选音频选择器对应的输出音频有语言，则与其保持一致，否则会以这里配置的语言代码和流名称进行兜底。推荐当前选项，为默认值。 - USE_CONFIGURED：用户根据实际情况自定义输出音频的语言和流名称。
     * @return languageCodeControl
     */
    public LanguageCodeControlEnum getLanguageCodeControl() {
        return languageCodeControl;
    }

    public void setLanguageCodeControl(LanguageCodeControlEnum languageCodeControl) {
        this.languageCodeControl = languageCodeControl;
    }

    public EncoderSettingsExpandAudioDescriptions withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * 语言代码，输入2或3个小写字母。
     * @return languageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public EncoderSettingsExpandAudioDescriptions withStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }

    /**
     * 流名称
     * @return streamName
     */
    public String getStreamName() {
        return streamName;
    }

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EncoderSettingsExpandAudioDescriptions that = (EncoderSettingsExpandAudioDescriptions) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.audioSelectorName, that.audioSelectorName)
            && Objects.equals(this.languageCodeControl, that.languageCodeControl)
            && Objects.equals(this.languageCode, that.languageCode) && Objects.equals(this.streamName, that.streamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, audioSelectorName, languageCodeControl, languageCode, streamName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EncoderSettingsExpandAudioDescriptions {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    audioSelectorName: ").append(toIndentedString(audioSelectorName)).append("\n");
        sb.append("    languageCodeControl: ").append(toIndentedString(languageCodeControl)).append("\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    streamName: ").append(toIndentedString(streamName)).append("\n");
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
