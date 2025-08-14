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
 * 联邦Schema配置Subject属性详细信息
 */
public class ResponseSchemaSubjectDetailsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_id_format")

    private String nameIdFormat;

    /**
     * 是否包含NameID
     */
    public static final class IncludeEnum {

        /**
         * Enum REQUIRED for value: "REQUIRED"
         */
        public static final IncludeEnum REQUIRED = new IncludeEnum("REQUIRED");

        private static final Map<String, IncludeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IncludeEnum> createStaticFields() {
            Map<String, IncludeEnum> map = new HashMap<>();
            map.put("REQUIRED", REQUIRED);
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

    public ResponseSchemaSubjectDetailsDto withNameIdFormat(String nameIdFormat) {
        this.nameIdFormat = nameIdFormat;
        return this;
    }

    /**
     * NameID的格式
     * @return nameIdFormat
     */
    public String getNameIdFormat() {
        return nameIdFormat;
    }

    public void setNameIdFormat(String nameIdFormat) {
        this.nameIdFormat = nameIdFormat;
    }

    public ResponseSchemaSubjectDetailsDto withInclude(IncludeEnum include) {
        this.include = include;
        return this;
    }

    /**
     * 是否包含NameID
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
        ResponseSchemaSubjectDetailsDto that = (ResponseSchemaSubjectDetailsDto) obj;
        return Objects.equals(this.nameIdFormat, that.nameIdFormat) && Objects.equals(this.include, that.include);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameIdFormat, include);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResponseSchemaSubjectDetailsDto {\n");
        sb.append("    nameIdFormat: ").append(toIndentedString(nameIdFormat)).append("\n");
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
