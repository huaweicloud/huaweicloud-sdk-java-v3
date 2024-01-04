package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 消息属性
 */
public class MessageAttribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 属性类型 STRING：字符串（String）类型 STRING_ARRAY：字符串数组（String.Array）类型 PROTOCOL：协议类型
     */
    public static final class TypeEnum {

        /**
         * Enum STRING for value: "STRING"
         */
        public static final TypeEnum STRING = new TypeEnum("STRING");

        /**
         * Enum STRING_ARRAY for value: "STRING_ARRAY"
         */
        public static final TypeEnum STRING_ARRAY = new TypeEnum("STRING_ARRAY");

        /**
         * Enum PROTOCOL for value: "PROTOCOL"
         */
        public static final TypeEnum PROTOCOL = new TypeEnum("PROTOCOL");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("STRING", STRING);
            map.put("STRING_ARRAY", STRING_ARRAY);
            map.put("PROTOCOL", PROTOCOL);
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
    @JsonProperty(value = "value")

    private Object value;

    public MessageAttribute withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 属性名称。属性名称只能包含小写英文字母([a-z])、数字([0-9])、下划线(_)，下划线不能出现在开始或结尾，下划线不能连续出现，长度为1到32个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MessageAttribute withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 属性类型 STRING：字符串（String）类型 STRING_ARRAY：字符串数组（String.Array）类型 PROTOCOL：协议类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public MessageAttribute withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * 属性值。 当属性类型为“STRING”时，属性值只能包含中英文、数字、下划线，长度为1到32个字符。 当属性类型为“STRING_ARRAY”时，属性值为字符串数组，数组长度为1到10，数组中的元素内容不能重复，数组中的每个字符串都只能包含中英文、数字、下划线，且长度为1到32个字符。 当属性类型为“PROTOCOL”时，属性值为支持协议类型的字符串数组。
     * @return value
     */
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
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
        MessageAttribute that = (MessageAttribute) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageAttribute {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
