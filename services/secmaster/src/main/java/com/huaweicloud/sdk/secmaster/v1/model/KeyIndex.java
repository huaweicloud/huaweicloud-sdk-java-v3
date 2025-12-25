package com.huaweicloud.sdk.secmaster.v1.model;

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
 * KeyIndex
 */
public class KeyIndex {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_chinese_exist")

    private Boolean isChineseExist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private Map<String, KeyIndex> properties = null;

    /**
     * **参数解释**: 字段类型 - text 全文索引字段 - keyword 关键字类型，适用于精确匹配 - long 长整型 - integer 整型 - double 双精度浮点数 - float 单精度浮点数 - date 日期类型  **约束限制** 不涉及 **取值范围**: - text - keyword - long - integer - double - float - date  **默认值** 不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum TEXT for value: "text"
         */
        public static final TypeEnum TEXT = new TypeEnum("text");

        /**
         * Enum KEYWORD for value: "keyword"
         */
        public static final TypeEnum KEYWORD = new TypeEnum("keyword");

        /**
         * Enum LONG for value: "long"
         */
        public static final TypeEnum LONG = new TypeEnum("long");

        /**
         * Enum INTEGER for value: "integer"
         */
        public static final TypeEnum INTEGER = new TypeEnum("integer");

        /**
         * Enum DOUBLE for value: "double"
         */
        public static final TypeEnum DOUBLE = new TypeEnum("double");

        /**
         * Enum FLOAT for value: "float"
         */
        public static final TypeEnum FLOAT = new TypeEnum("float");

        /**
         * Enum DATE for value: "date"
         */
        public static final TypeEnum DATE = new TypeEnum("date");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("text", TEXT);
            map.put("keyword", KEYWORD);
            map.put("long", LONG);
            map.put("integer", INTEGER);
            map.put("double", DOUBLE);
            map.put("float", FLOAT);
            map.put("date", DATE);
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

    public KeyIndex withIsChineseExist(Boolean isChineseExist) {
        this.isChineseExist = isChineseExist;
        return this;
    }

    /**
     * 是否包含中文
     * @return isChineseExist
     */
    public Boolean getIsChineseExist() {
        return isChineseExist;
    }

    public void setIsChineseExist(Boolean isChineseExist) {
        this.isChineseExist = isChineseExist;
    }

    public KeyIndex withProperties(Map<String, KeyIndex> properties) {
        this.properties = properties;
        return this;
    }

    public KeyIndex putPropertiesItem(String key, KeyIndex propertiesItem) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        this.properties.put(key, propertiesItem);
        return this;
    }

    public KeyIndex withProperties(Consumer<Map<String, KeyIndex>> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new HashMap<>();
        }
        propertiesSetter.accept(this.properties);
        return this;
    }

    /**
     * 嵌套结构
     * @return properties
     */
    public Map<String, KeyIndex> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, KeyIndex> properties) {
        this.properties = properties;
    }

    public KeyIndex withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 字段类型 - text 全文索引字段 - keyword 关键字类型，适用于精确匹配 - long 长整型 - integer 整型 - double 双精度浮点数 - float 单精度浮点数 - date 日期类型  **约束限制** 不涉及 **取值范围**: - text - keyword - long - integer - double - float - date  **默认值** 不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyIndex that = (KeyIndex) obj;
        return Objects.equals(this.isChineseExist, that.isChineseExist)
            && Objects.equals(this.properties, that.properties) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isChineseExist, properties, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyIndex {\n");
        sb.append("    isChineseExist: ").append(toIndentedString(isChineseExist)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
