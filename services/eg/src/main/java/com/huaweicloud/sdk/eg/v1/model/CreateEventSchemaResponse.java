package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateEventSchemaResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
     * 提供方类型，OFFICIAL：官方事件源；CUSTOM：自定义事件源
     */
    public static final class ProviderTypeEnum {

        /**
         * Enum OFFICIAL for value: "OFFICIAL"
         */
        public static final ProviderTypeEnum OFFICIAL = new ProviderTypeEnum("OFFICIAL");

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final ProviderTypeEnum CUSTOM = new ProviderTypeEnum("CUSTOM");

        private static final Map<String, ProviderTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderTypeEnum> createStaticFields() {
            Map<String, ProviderTypeEnum> map = new HashMap<>();
            map.put("OFFICIAL", OFFICIAL);
            map.put("CUSTOM", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderTypeEnum(String value) {
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
        public static ProviderTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProviderTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProviderTypeEnum(value);
            }
            return result;
        }

        public static ProviderTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProviderTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderTypeEnum) {
                return this.value.equals(((ProviderTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private ProviderTypeEnum providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number_of_versions")

    private Integer numberOfVersions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sample")

    private String dataSample;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private String definition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateEventSchemaResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件模型ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateEventSchemaResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 事件模型名称，租户下唯一
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateEventSchemaResponse withDescription(String description) {
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

    public CreateEventSchemaResponse withCompatibility(CompatibilityEnum compatibility) {
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

    public CreateEventSchemaResponse withProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 提供方类型，OFFICIAL：官方事件源；CUSTOM：自定义事件源
     * @return providerType
     */
    public ProviderTypeEnum getProviderType() {
        return providerType;
    }

    public void setProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
    }

    public CreateEventSchemaResponse withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 事件模型格式
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public CreateEventSchemaResponse withNumberOfVersions(Integer numberOfVersions) {
        this.numberOfVersions = numberOfVersions;
        return this;
    }

    /**
     * 事件模型版本数
     * @return numberOfVersions
     */
    public Integer getNumberOfVersions() {
        return numberOfVersions;
    }

    public void setNumberOfVersions(Integer numberOfVersions) {
        this.numberOfVersions = numberOfVersions;
    }

    public CreateEventSchemaResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public CreateEventSchemaResponse withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public CreateEventSchemaResponse withDataSample(String dataSample) {
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

    public CreateEventSchemaResponse withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 事件模型当前版本号
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public CreateEventSchemaResponse withDefinition(String definition) {
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

    public CreateEventSchemaResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEventSchemaResponse createEventSchemaResponse = (CreateEventSchemaResponse) o;
        return Objects.equals(this.id, createEventSchemaResponse.id)
            && Objects.equals(this.name, createEventSchemaResponse.name)
            && Objects.equals(this.description, createEventSchemaResponse.description)
            && Objects.equals(this.compatibility, createEventSchemaResponse.compatibility)
            && Objects.equals(this.providerType, createEventSchemaResponse.providerType)
            && Objects.equals(this.format, createEventSchemaResponse.format)
            && Objects.equals(this.numberOfVersions, createEventSchemaResponse.numberOfVersions)
            && Objects.equals(this.createdTime, createEventSchemaResponse.createdTime)
            && Objects.equals(this.updatedTime, createEventSchemaResponse.updatedTime)
            && Objects.equals(this.dataSample, createEventSchemaResponse.dataSample)
            && Objects.equals(this.version, createEventSchemaResponse.version)
            && Objects.equals(this.definition, createEventSchemaResponse.definition)
            && Objects.equals(this.xRequestId, createEventSchemaResponse.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            compatibility,
            providerType,
            format,
            numberOfVersions,
            createdTime,
            updatedTime,
            dataSample,
            version,
            definition,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEventSchemaResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    numberOfVersions: ").append(toIndentedString(numberOfVersions)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    dataSample: ").append(toIndentedString(dataSample)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
