package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ApiResponsePara
 */
public class ApiResponsePara {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field")

    private String field;

    /**
     * 参数类型
     */
    public static final class TypeEnum {

        /**
         * Enum REQUEST_PARAMETER_TYPE_NUMBER for value: "REQUEST_PARAMETER_TYPE_NUMBER"
         */
        public static final TypeEnum REQUEST_PARAMETER_TYPE_NUMBER = new TypeEnum("REQUEST_PARAMETER_TYPE_NUMBER");

        /**
         * Enum REQUEST_PARAMETER_TYPE_STRING for value: "REQUEST_PARAMETER_TYPE_STRING"
         */
        public static final TypeEnum REQUEST_PARAMETER_TYPE_STRING = new TypeEnum("REQUEST_PARAMETER_TYPE_STRING");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("REQUEST_PARAMETER_TYPE_NUMBER", REQUEST_PARAMETER_TYPE_NUMBER);
            map.put("REQUEST_PARAMETER_TYPE_STRING", REQUEST_PARAMETER_TYPE_STRING);
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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "example_value")

    private String exampleValue;

    public ApiResponsePara withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApiResponsePara withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * 绑定的表字段
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public ApiResponsePara withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 参数类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ApiResponsePara withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApiResponsePara withExampleValue(String exampleValue) {
        this.exampleValue = exampleValue;
        return this;
    }

    /**
     * 参数示例值
     * @return exampleValue
     */
    public String getExampleValue() {
        return exampleValue;
    }

    public void setExampleValue(String exampleValue) {
        this.exampleValue = exampleValue;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiResponsePara apiResponsePara = (ApiResponsePara) o;
        return Objects.equals(this.name, apiResponsePara.name) && Objects.equals(this.field, apiResponsePara.field)
            && Objects.equals(this.type, apiResponsePara.type)
            && Objects.equals(this.description, apiResponsePara.description)
            && Objects.equals(this.exampleValue, apiResponsePara.exampleValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, field, type, description, exampleValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiResponsePara {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    exampleValue: ").append(toIndentedString(exampleValue)).append("\n");
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
