package com.huaweicloud.sdk.dgc.v1.model;

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
 * JobParam
 */
public class JobParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private String value;

    /**
     * Gets or Sets paramType
     */
    public static final class ParamTypeEnum {

        /**
         * Enum VARIABLE for value: "variable"
         */
        public static final ParamTypeEnum VARIABLE = new ParamTypeEnum("variable");

        /**
         * Enum CONSTANTS for value: "constants"
         */
        public static final ParamTypeEnum CONSTANTS = new ParamTypeEnum("constants");

        private static final Map<String, ParamTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ParamTypeEnum> createStaticFields() {
            Map<String, ParamTypeEnum> map = new HashMap<>();
            map.put("variable", VARIABLE);
            map.put("constants", CONSTANTS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ParamTypeEnum(String value) {
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
        public static ParamTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ParamTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ParamTypeEnum(value);
            }
            return result;
        }

        public static ParamTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ParamTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ParamTypeEnum) {
                return this.value.equals(((ParamTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paramType")

    @JacksonXmlProperty(localName = "paramType")

    private ParamTypeEnum paramType;

    public JobParam withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobParam withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public JobParam withParamType(ParamTypeEnum paramType) {
        this.paramType = paramType;
        return this;
    }

    /**
     * Get paramType
     * @return paramType
     */
    public ParamTypeEnum getParamType() {
        return paramType;
    }

    public void setParamType(ParamTypeEnum paramType) {
        this.paramType = paramType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobParam jobParam = (JobParam) o;
        return Objects.equals(this.name, jobParam.name) && Objects.equals(this.value, jobParam.value)
            && Objects.equals(this.paramType, jobParam.paramType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, paramType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobParam {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    paramType: ").append(toIndentedString(paramType)).append("\n");
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
