package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 检测选项配置
 */
public class DetectOpt {

    /**
     * 检测类型，可选：lexicon(词库检测), compliance(合规检测), inject(注入检测), immunity_lexicon(豁免词库),supported_language(语言检测，默认开), pii(敏感词检测), abuse(算力滥用检测)
     */
    public static final class TypeEnum {

        /**
         * Enum LEXICON for value: "lexicon"
         */
        public static final TypeEnum LEXICON = new TypeEnum("lexicon");

        /**
         * Enum COMPLIANCE for value: "compliance"
         */
        public static final TypeEnum COMPLIANCE = new TypeEnum("compliance");

        /**
         * Enum INJECT for value: "inject"
         */
        public static final TypeEnum INJECT = new TypeEnum("inject");

        /**
         * Enum IMMUNITY_LEXICON for value: "immunity_lexicon"
         */
        public static final TypeEnum IMMUNITY_LEXICON = new TypeEnum("immunity_lexicon");

        /**
         * Enum SUPPORTED_LANGUAGE for value: "supported_language"
         */
        public static final TypeEnum SUPPORTED_LANGUAGE = new TypeEnum("supported_language");

        /**
         * Enum PII for value: "pii"
         */
        public static final TypeEnum PII = new TypeEnum("pii");

        /**
         * Enum ABUSE for value: "abuse"
         */
        public static final TypeEnum ABUSE = new TypeEnum("abuse");

        /**
         * Enum TOPIC_DETECT for value: "topic_detect"
         */
        public static final TypeEnum TOPIC_DETECT = new TypeEnum("topic_detect");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("lexicon", LEXICON);
            map.put("compliance", COMPLIANCE);
            map.put("inject", INJECT);
            map.put("immunity_lexicon", IMMUNITY_LEXICON);
            map.put("supported_language", SUPPORTED_LANGUAGE);
            map.put("pii", PII);
            map.put("abuse", ABUSE);
            map.put("topic_detect", TOPIC_DETECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    public DetectOpt withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 检测类型，可选：lexicon(词库检测), compliance(合规检测), inject(注入检测), immunity_lexicon(豁免词库),supported_language(语言检测，默认开), pii(敏感词检测), abuse(算力滥用检测)
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DetectOpt withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否启用该检测类型
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectOpt that = (DetectOpt) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.enable, that.enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectOpt {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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
