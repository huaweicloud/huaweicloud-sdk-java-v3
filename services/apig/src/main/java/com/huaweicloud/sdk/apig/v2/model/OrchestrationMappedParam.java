package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 编排后的参数配置。
 */
public class OrchestrationMappedParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapped_param_name")

    private String mappedParamName;

    /**
     * 编排后的参数类型，支持string和number。
     */
    public static final class MappedParamTypeEnum {

        /**
         * Enum STRING for value: "string"
         */
        public static final MappedParamTypeEnum STRING = new MappedParamTypeEnum("string");

        /**
         * Enum NUMBER for value: "number"
         */
        public static final MappedParamTypeEnum NUMBER = new MappedParamTypeEnum("number");

        private static final Map<String, MappedParamTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MappedParamTypeEnum> createStaticFields() {
            Map<String, MappedParamTypeEnum> map = new HashMap<>();
            map.put("string", STRING);
            map.put("number", NUMBER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MappedParamTypeEnum(String value) {
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
        public static MappedParamTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MappedParamTypeEnum(value));
        }

        public static MappedParamTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MappedParamTypeEnum) {
                return this.value.equals(((MappedParamTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapped_param_type")

    private MappedParamTypeEnum mappedParamType;

    /**
     * 编排后的参数位置，支持query和header。
     */
    public static final class MappedParamLocationEnum {

        /**
         * Enum QUERY for value: "query"
         */
        public static final MappedParamLocationEnum QUERY = new MappedParamLocationEnum("query");

        /**
         * Enum HEADER for value: "header"
         */
        public static final MappedParamLocationEnum HEADER = new MappedParamLocationEnum("header");

        private static final Map<String, MappedParamLocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MappedParamLocationEnum> createStaticFields() {
            Map<String, MappedParamLocationEnum> map = new HashMap<>();
            map.put("query", QUERY);
            map.put("header", HEADER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MappedParamLocationEnum(String value) {
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
        public static MappedParamLocationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MappedParamLocationEnum(value));
        }

        public static MappedParamLocationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MappedParamLocationEnum) {
                return this.value.equals(((MappedParamLocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mapped_param_location")

    private MappedParamLocationEnum mappedParamLocation;

    public OrchestrationMappedParam withMappedParamName(String mappedParamName) {
        this.mappedParamName = mappedParamName;
        return this;
    }

    /**
     * 编排后的请求参数名，只支持英文，数字，中划线，必须以英文开头，1-128个字符，不能与已有的参数重名，默认会透传到后端。
     * @return mappedParamName
     */
    public String getMappedParamName() {
        return mappedParamName;
    }

    public void setMappedParamName(String mappedParamName) {
        this.mappedParamName = mappedParamName;
    }

    public OrchestrationMappedParam withMappedParamType(MappedParamTypeEnum mappedParamType) {
        this.mappedParamType = mappedParamType;
        return this;
    }

    /**
     * 编排后的参数类型，支持string和number。
     * @return mappedParamType
     */
    public MappedParamTypeEnum getMappedParamType() {
        return mappedParamType;
    }

    public void setMappedParamType(MappedParamTypeEnum mappedParamType) {
        this.mappedParamType = mappedParamType;
    }

    public OrchestrationMappedParam withMappedParamLocation(MappedParamLocationEnum mappedParamLocation) {
        this.mappedParamLocation = mappedParamLocation;
        return this;
    }

    /**
     * 编排后的参数位置，支持query和header。
     * @return mappedParamLocation
     */
    public MappedParamLocationEnum getMappedParamLocation() {
        return mappedParamLocation;
    }

    public void setMappedParamLocation(MappedParamLocationEnum mappedParamLocation) {
        this.mappedParamLocation = mappedParamLocation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrchestrationMappedParam that = (OrchestrationMappedParam) obj;
        return Objects.equals(this.mappedParamName, that.mappedParamName)
            && Objects.equals(this.mappedParamType, that.mappedParamType)
            && Objects.equals(this.mappedParamLocation, that.mappedParamLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mappedParamName, mappedParamType, mappedParamLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrchestrationMappedParam {\n");
        sb.append("    mappedParamName: ").append(toIndentedString(mappedParamName)).append("\n");
        sb.append("    mappedParamType: ").append(toIndentedString(mappedParamType)).append("\n");
        sb.append("    mappedParamLocation: ").append(toIndentedString(mappedParamLocation)).append("\n");
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
