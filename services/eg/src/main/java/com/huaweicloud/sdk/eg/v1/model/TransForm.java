package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 订阅的事件目标转换规则
 */
public class TransForm {

    /**
     * 转换规则类型
     */
    public static final class TypeEnum {

        /**
         * Enum ORIGINAL for value: "ORIGINAL"
         */
        public static final TypeEnum ORIGINAL = new TypeEnum("ORIGINAL");

        /**
         * Enum CONSTANT for value: "CONSTANT"
         */
        public static final TypeEnum CONSTANT = new TypeEnum("CONSTANT");

        /**
         * Enum VARIABLE for value: "VARIABLE"
         */
        public static final TypeEnum VARIABLE = new TypeEnum("VARIABLE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("ORIGINAL", ORIGINAL);
            map.put("CONSTANT", CONSTANT);
            map.put("VARIABLE", VARIABLE);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private String template;

    public TransForm withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 转换规则类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public TransForm withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 常量类型规则时，字段为常量内容定义； 变量类型规则时，为变量定义，内容必须为JsonObject字符串。 变量最多支持100个，且不支持嵌套结构定义； 变量名由字母、数字、点、下划线和中划线组成，必须字母或数字开头不能以HC.开头，长度不超过64个字符； 变量值表达式支持常量或JsonPath表达式，字符串长度不超过1024个字符。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TransForm withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * 变量类型规则时，规则内容的模板定义，支持对已定义变量的引用。
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransForm transForm = (TransForm) o;
        return Objects.equals(this.type, transForm.type) && Objects.equals(this.value, transForm.value)
            && Objects.equals(this.template, transForm.template);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, template);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransForm {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
