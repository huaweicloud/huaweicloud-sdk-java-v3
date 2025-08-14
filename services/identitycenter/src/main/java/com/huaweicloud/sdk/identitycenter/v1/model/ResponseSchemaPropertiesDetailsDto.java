package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 联邦Schema配置额外属性详细信息
 */
public class ResponseSchemaPropertiesDetailsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr_name_format")

    private String attrNameFormat;

    /**
     * 是否包含额外属性
     */
    public static final class IncludeEnum {

        /**
         * Enum YES for value: "YES"
         */
        public static final IncludeEnum YES = new IncludeEnum("YES");

        private static final Map<String, IncludeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IncludeEnum> createStaticFields() {
            Map<String, IncludeEnum> map = new HashMap<>();
            map.put("YES", YES);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IncludeEnum(String value) {
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
        public static IncludeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IncludeEnum(value));
        }

        public static IncludeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IncludeEnum) {
                return this.value.equals(((IncludeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include")

    private IncludeEnum include;

    public ResponseSchemaPropertiesDetailsDto withAttrNameFormat(String attrNameFormat) {
        this.attrNameFormat = attrNameFormat;
        return this;
    }

    /**
     * 额外添加的属性的格式
     * @return attrNameFormat
     */
    public String getAttrNameFormat() {
        return attrNameFormat;
    }

    public void setAttrNameFormat(String attrNameFormat) {
        this.attrNameFormat = attrNameFormat;
    }

    public ResponseSchemaPropertiesDetailsDto withInclude(IncludeEnum include) {
        this.include = include;
        return this;
    }

    /**
     * 是否包含额外属性
     * @return include
     */
    public IncludeEnum getInclude() {
        return include;
    }

    public void setInclude(IncludeEnum include) {
        this.include = include;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResponseSchemaPropertiesDetailsDto that = (ResponseSchemaPropertiesDetailsDto) obj;
        return Objects.equals(this.attrNameFormat, that.attrNameFormat) && Objects.equals(this.include, that.include);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attrNameFormat, include);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseSchemaPropertiesDetailsDto {\n");
        sb.append("    attrNameFormat: ").append(toIndentedString(attrNameFormat)).append("\n");
        sb.append("    include: ").append(toIndentedString(include)).append("\n");
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
