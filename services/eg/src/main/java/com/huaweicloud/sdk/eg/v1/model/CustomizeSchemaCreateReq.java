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
 * CustomizeSchemaCreateReq
 */
public class CustomizeSchemaCreateReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 事件模型兼容性
     */
    public static final class CompatibilityEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final CompatibilityEnum NONE = new CompatibilityEnum("NONE");

        /**
         * Enum FORWARD for value: "FORWARD"
         */
        public static final CompatibilityEnum FORWARD = new CompatibilityEnum("FORWARD");

        /**
         * Enum BACKWARD for value: "BACKWARD"
         */
        public static final CompatibilityEnum BACKWARD = new CompatibilityEnum("BACKWARD");

        /**
         * Enum FULL for value: "FULL"
         */
        public static final CompatibilityEnum FULL = new CompatibilityEnum("FULL");

        private static final Map<String, CompatibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompatibilityEnum> createStaticFields() {
            Map<String, CompatibilityEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("FORWARD", FORWARD);
            map.put("BACKWARD", BACKWARD);
            map.put("FULL", FULL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CompatibilityEnum(String value) {
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
        public static CompatibilityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CompatibilityEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CompatibilityEnum(value);
            }
            return result;
        }

        public static CompatibilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CompatibilityEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CompatibilityEnum) {
                return this.value.equals(((CompatibilityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compatibility")

    private CompatibilityEnum compatibility;

    /**
     * schema内容格式
     */
    public static final class FormatEnum {

        /**
         * Enum JSON_SCHEMA_DRAFT_6 for value: "JSON_SCHEMA_DRAFT_6"
         */
        public static final FormatEnum JSON_SCHEMA_DRAFT_6 = new FormatEnum("JSON_SCHEMA_DRAFT_6");

        private static final Map<String, FormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FormatEnum> createStaticFields() {
            Map<String, FormatEnum> map = new HashMap<>();
            map.put("JSON_SCHEMA_DRAFT_6", JSON_SCHEMA_DRAFT_6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FormatEnum(String value) {
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
        public static FormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FormatEnum(value);
            }
            return result;
        }

        public static FormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            FormatEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FormatEnum) {
                return this.value.equals(((FormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private FormatEnum format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sample")

    private String dataSample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private String definition;

    public CustomizeSchemaCreateReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件模型名称，租户下唯一，由字母、数字、点、下划线和中划线组成，必须字母或数字开头
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomizeSchemaCreateReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件模型描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CustomizeSchemaCreateReq withCompatibility(CompatibilityEnum compatibility) {
        this.compatibility = compatibility;
        return this;
    }

    /**
     * 事件模型兼容性
     * @return compatibility
     */
    public CompatibilityEnum getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(CompatibilityEnum compatibility) {
        this.compatibility = compatibility;
    }

    public CustomizeSchemaCreateReq withFormat(FormatEnum format) {
        this.format = format;
        return this;
    }

    /**
     * schema内容格式
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    public CustomizeSchemaCreateReq withDataSample(String dataSample) {
        this.dataSample = dataSample;
        return this;
    }

    /**
     * 事件示例
     * @return dataSample
     */
    public String getDataSample() {
        return dataSample;
    }

    public void setDataSample(String dataSample) {
        this.dataSample = dataSample;
    }

    public CustomizeSchemaCreateReq withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * 事件模型内容定义
     * @return definition
     */
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomizeSchemaCreateReq customizeSchemaCreateReq = (CustomizeSchemaCreateReq) o;
        return Objects.equals(this.name, customizeSchemaCreateReq.name)
            && Objects.equals(this.description, customizeSchemaCreateReq.description)
            && Objects.equals(this.compatibility, customizeSchemaCreateReq.compatibility)
            && Objects.equals(this.format, customizeSchemaCreateReq.format)
            && Objects.equals(this.dataSample, customizeSchemaCreateReq.dataSample)
            && Objects.equals(this.definition, customizeSchemaCreateReq.definition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, compatibility, format, dataSample, definition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizeSchemaCreateReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    dataSample: ").append(toIndentedString(dataSample)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
