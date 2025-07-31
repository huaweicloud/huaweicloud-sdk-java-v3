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
 * 保存租户级tts自定义读法配置请求
 */
public class SaveTtscVocabularyConfigsRequestBody {

    /**
     * 支持配置的自定义读法类型。当前读法类型会映射为SSML标签，详见[文本驱动SSML定义](metastudio_02_0038.xml)。  包含如下选项： * CHINESE_G2P：拼音 * PHONETIC_SYMBOL：音标 * CONTINUUM：连读 * ALIAS：别名 * SAY_AS：数字/英文的读法。不同value值有不同的读法，详情如下所示。   数字的读法包括：   - date：读日期   - number：读数字   - figure：读数值   - telephone：读电话    英文的读法包括：   - spell：读字母   - english：读单词
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public SaveTtscVocabularyConfigsRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 支持配置的自定义读法类型。当前读法类型会映射为SSML标签，详见[文本驱动SSML定义](metastudio_02_0038.xml)。  包含如下选项： * CHINESE_G2P：拼音 * PHONETIC_SYMBOL：音标 * CONTINUUM：连读 * ALIAS：别名 * SAY_AS：数字/英文的读法。不同value值有不同的读法，详情如下所示。   数字的读法包括：   - date：读日期   - number：读数字   - figure：读数值   - telephone：读电话    英文的读法包括：   - spell：读字母   - english：读单词
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
     * 原始词。
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
     * 自定义读法。其中，音标的读法请参考[词典](https://www.youdao.com/)。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public SaveTtscVocabularyConfigsRequestBody withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
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
            && Objects.equals(this.value, that.value) && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, key, value, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveTtscVocabularyConfigsRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
