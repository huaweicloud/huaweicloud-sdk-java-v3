package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CheckPoint
 */
public class CheckPoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comparison")

    private String comparison;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_arg")

    private String functionArg;

    /**
     * 响应提取时要使用什么方法处理参数
     */
    public static final class FunctionTypeEnum {

        /**
         * Enum REGEX for value: "REGEX"
         */
        public static final FunctionTypeEnum REGEX = new FunctionTypeEnum("REGEX");

        /**
         * Enum SUBSTRING for value: "SUBSTRING"
         */
        public static final FunctionTypeEnum SUBSTRING = new FunctionTypeEnum("SUBSTRING");

        private static final Map<String, FunctionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FunctionTypeEnum> createStaticFields() {
            Map<String, FunctionTypeEnum> map = new HashMap<>();
            map.put("REGEX", REGEX);
            map.put("SUBSTRING", SUBSTRING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FunctionTypeEnum(String value) {
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
        public static FunctionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FunctionTypeEnum(value));
        }

        public static FunctionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FunctionTypeEnum) {
                return this.value.equals(((FunctionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_type")

    private FunctionTypeEnum functionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private String value;

    public CheckPoint withComparison(String comparison) {
        this.comparison = comparison;
        return this;
    }

    /**
     * 运算符
     * @return comparison
     */
    public String getComparison() {
        return comparison;
    }

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    public CheckPoint withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CheckPoint withFunctionArg(String functionArg) {
        this.functionArg = functionArg;
        return this;
    }

    /**
     * 响应提取时要使用什么方法处理参数
     * @return functionArg
     */
    public String getFunctionArg() {
        return functionArg;
    }

    public void setFunctionArg(String functionArg) {
        this.functionArg = functionArg;
    }

    public CheckPoint withFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
        return this;
    }

    /**
     * 响应提取时要使用什么方法处理参数
     * @return functionType
     */
    public FunctionTypeEnum getFunctionType() {
        return functionType;
    }

    public void setFunctionType(FunctionTypeEnum functionType) {
        this.functionType = functionType;
    }

    public CheckPoint withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * 属性名称
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public CheckPoint withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * 值
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
        CheckPoint that = (CheckPoint) obj;
        return Objects.equals(this.comparison, that.comparison) && Objects.equals(this.description, that.description)
            && Objects.equals(this.functionArg, that.functionArg)
            && Objects.equals(this.functionType, that.functionType) && Objects.equals(this.property, that.property)
            && Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comparison, description, functionArg, functionType, property, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckPoint {\n");
        sb.append("    comparison: ").append(toIndentedString(comparison)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    functionArg: ").append(toIndentedString(functionArg)).append("\n");
        sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
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
