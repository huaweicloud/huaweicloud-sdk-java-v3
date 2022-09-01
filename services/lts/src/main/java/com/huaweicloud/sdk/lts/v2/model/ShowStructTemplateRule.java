package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 结构化类型。
 */
public class ShowStructTemplateRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "param")

    @JacksonXmlProperty(localName = "param")

    private String param;

    /**
     * 结构化类型
     */
    public static final class TypeEnum {

        /**
         * Enum JSON for value: "json"
         */
        public static final TypeEnum JSON = new TypeEnum("json");

        /**
         * Enum SPLIT for value: "split"
         */
        public static final TypeEnum SPLIT = new TypeEnum("split");

        /**
         * Enum NGINX for value: "nginx"
         */
        public static final TypeEnum NGINX = new TypeEnum("nginx");

        /**
         * Enum BUILT_IN for value: "built_in"
         */
        public static final TypeEnum BUILT_IN = new TypeEnum("built_in");

        /**
         * Enum CUSTOM_REGEX for value: "custom_regex"
         */
        public static final TypeEnum CUSTOM_REGEX = new TypeEnum("custom_regex");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("json", JSON);
            map.put("split", SPLIT);
            map.put("nginx", NGINX);
            map.put("built_in", BUILT_IN);
            map.put("custom_regex", CUSTOM_REGEX);
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

    @JacksonXmlProperty(localName = "type")

    private TypeEnum type;

    public ShowStructTemplateRule withParam(String param) {
        this.param = param;
        return this;
    }

    /**
     * 测试
     * @return param
     */
    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public ShowStructTemplateRule withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 结构化类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowStructTemplateRule showStructTemplateRule = (ShowStructTemplateRule) o;
        return Objects.equals(this.param, showStructTemplateRule.param)
            && Objects.equals(this.type, showStructTemplateRule.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(param, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStructTemplateRule {\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
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
