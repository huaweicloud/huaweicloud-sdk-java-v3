package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 保存租户级tts扩展词表配置请求
 */
public class SaveTtscVocabularyConfigsRequestBody {

    /**
     * TTSS支持配置的词表类型 * CHINESE_G2P:拼音 * PHONETIC_SYMBOL:音标 * CONTINUUM:连读 * ALIAS:别名 * SAY_AS:数字英文读法
     */
    public static final class TypeEnum {

        /**
         * Enum CHINESE_G2P for value: "CHINESE_G2P"
         */
        public static final TypeEnum CHINESE_G2P = new TypeEnum("CHINESE_G2P");

        /**
         * Enum PHONETIC_SYMBOL for value: "PHONETIC_SYMBOL"
         */
        public static final TypeEnum PHONETIC_SYMBOL = new TypeEnum("PHONETIC_SYMBOL");

        /**
         * Enum CONTINUUM for value: "CONTINUUM"
         */
        public static final TypeEnum CONTINUUM = new TypeEnum("CONTINUUM");

        /**
         * Enum ALIAS for value: "ALIAS"
         */
        public static final TypeEnum ALIAS = new TypeEnum("ALIAS");

        /**
         * Enum SAY_AS for value: "SAY_AS"
         */
        public static final TypeEnum SAY_AS = new TypeEnum("SAY_AS");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CHINESE_G2P", CHINESE_G2P);
            map.put("PHONETIC_SYMBOL", PHONETIC_SYMBOL);
            map.put("CONTINUUM", CONTINUUM);
            map.put("ALIAS", ALIAS);
            map.put("SAY_AS", SAY_AS);
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
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public SaveTtscVocabularyConfigsRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * TTSS支持配置的词表类型 * CHINESE_G2P:拼音 * PHONETIC_SYMBOL:音标 * CONTINUUM:连读 * ALIAS:别名 * SAY_AS:数字英文读法
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public SaveTtscVocabularyConfigsRequestBody withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 映射键
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SaveTtscVocabularyConfigsRequestBody withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 映射值
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SaveTtscVocabularyConfigsRequestBody that = (SaveTtscVocabularyConfigsRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.key, that.key)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, key, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveTtscVocabularyConfigsRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
