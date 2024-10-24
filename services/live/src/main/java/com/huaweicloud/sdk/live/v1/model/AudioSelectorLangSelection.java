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
 * 音频选择器语言设置
 */
public class AudioSelectorLangSelection {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language_code")

    private String languageCode;

    /**
     * 语言输出策略。  取值如下： - LOOSE：宽松匹配，示例“eng”会优先匹配源流中语言为English的音轨，如果匹配不到，则选择PID最小的音轨。 - STRICT：严格匹配，示例“eng”会严格匹配源流中语言为English的音轨，如果匹配不到，媒体直播服务会自动补齐一个静音分片，当终端使用此音频选择器播放视频时，会静音播放。
     */
    public static final class LanguageSelectionPolicyEnum {

        /**
         * Enum LOOSE for value: "LOOSE"
         */
        public static final LanguageSelectionPolicyEnum LOOSE = new LanguageSelectionPolicyEnum("LOOSE");

        /**
         * Enum STRICT for value: "STRICT"
         */
        public static final LanguageSelectionPolicyEnum STRICT = new LanguageSelectionPolicyEnum("STRICT");

        private static final Map<String, LanguageSelectionPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LanguageSelectionPolicyEnum> createStaticFields() {
            Map<String, LanguageSelectionPolicyEnum> map = new HashMap<>();
            map.put("LOOSE", LOOSE);
            map.put("STRICT", STRICT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LanguageSelectionPolicyEnum(String value) {
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
        public static LanguageSelectionPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new LanguageSelectionPolicyEnum(value));
        }

        public static LanguageSelectionPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LanguageSelectionPolicyEnum) {
                return this.value.equals(((LanguageSelectionPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language_selection_policy")

    private LanguageSelectionPolicyEnum languageSelectionPolicy;

    public AudioSelectorLangSelection withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * 语言简称，输入2或3个小写字母的语言代码。
     * @return languageCode
     */
    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public AudioSelectorLangSelection withLanguageSelectionPolicy(LanguageSelectionPolicyEnum languageSelectionPolicy) {
        this.languageSelectionPolicy = languageSelectionPolicy;
        return this;
    }

    /**
     * 语言输出策略。  取值如下： - LOOSE：宽松匹配，示例“eng”会优先匹配源流中语言为English的音轨，如果匹配不到，则选择PID最小的音轨。 - STRICT：严格匹配，示例“eng”会严格匹配源流中语言为English的音轨，如果匹配不到，媒体直播服务会自动补齐一个静音分片，当终端使用此音频选择器播放视频时，会静音播放。
     * @return languageSelectionPolicy
     */
    public LanguageSelectionPolicyEnum getLanguageSelectionPolicy() {
        return languageSelectionPolicy;
    }

    public void setLanguageSelectionPolicy(LanguageSelectionPolicyEnum languageSelectionPolicy) {
        this.languageSelectionPolicy = languageSelectionPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioSelectorLangSelection that = (AudioSelectorLangSelection) obj;
        return Objects.equals(this.languageCode, that.languageCode)
            && Objects.equals(this.languageSelectionPolicy, that.languageSelectionPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(languageCode, languageSelectionPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AudioSelectorLangSelection {\n");
        sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
        sb.append("    languageSelectionPolicy: ").append(toIndentedString(languageSelectionPolicy)).append("\n");
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
