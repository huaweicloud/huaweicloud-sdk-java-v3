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
 * CustomizeSchemaItemInfo
 */
public class CustomizeSchemaItemInfo {

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

        private static final Map<String, CompatibilityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CompatibilityEnum> createStaticFields() {
            Map<String, CompatibilityEnum> map = new HashMap<>();
            map.put("NONE", NONE);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CompatibilityEnum(value));
        }

        public static CompatibilityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProviderTypeEnum(value));
        }

        public static ProviderTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "event_type_id")

    private String eventTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type_name")

    private String eventTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source_id")

    private String eventSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source_name")

    private String eventSourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_source_label")

    private String eventSourceLabel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    public CustomizeSchemaItemInfo withId(String id) {
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

    public CustomizeSchemaItemInfo withName(String name) {
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

    public CustomizeSchemaItemInfo withDescription(String description) {
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

    public CustomizeSchemaItemInfo withCompatibility(CompatibilityEnum compatibility) {
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

    public CustomizeSchemaItemInfo withProviderType(ProviderTypeEnum providerType) {
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

    public CustomizeSchemaItemInfo withFormat(String format) {
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

    public CustomizeSchemaItemInfo withNumberOfVersions(Integer numberOfVersions) {
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

    public CustomizeSchemaItemInfo withEventTypeId(String eventTypeId) {
        this.eventTypeId = eventTypeId;
        return this;
    }

    /**
     * 事件类型ID
     * @return eventTypeId
     */
    public String getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(String eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public CustomizeSchemaItemInfo withEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
        return this;
    }

    /**
     * 事件类型名称
     * @return eventTypeName
     */
    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public CustomizeSchemaItemInfo withEventSourceId(String eventSourceId) {
        this.eventSourceId = eventSourceId;
        return this;
    }

    /**
     * 事件源ID
     * @return eventSourceId
     */
    public String getEventSourceId() {
        return eventSourceId;
    }

    public void setEventSourceId(String eventSourceId) {
        this.eventSourceId = eventSourceId;
    }

    public CustomizeSchemaItemInfo withEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
        return this;
    }

    /**
     * 事件源名称
     * @return eventSourceName
     */
    public String getEventSourceName() {
        return eventSourceName;
    }

    public void setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
    }

    public CustomizeSchemaItemInfo withEventSourceLabel(String eventSourceLabel) {
        this.eventSourceLabel = eventSourceLabel;
        return this;
    }

    /**
     * 事件源标签
     * @return eventSourceLabel
     */
    public String getEventSourceLabel() {
        return eventSourceLabel;
    }

    public void setEventSourceLabel(String eventSourceLabel) {
        this.eventSourceLabel = eventSourceLabel;
    }

    public CustomizeSchemaItemInfo withCreatedTime(String createdTime) {
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

    public CustomizeSchemaItemInfo withUpdatedTime(String updatedTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomizeSchemaItemInfo that = (CustomizeSchemaItemInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.compatibility, that.compatibility)
            && Objects.equals(this.providerType, that.providerType) && Objects.equals(this.format, that.format)
            && Objects.equals(this.numberOfVersions, that.numberOfVersions)
            && Objects.equals(this.eventTypeId, that.eventTypeId)
            && Objects.equals(this.eventTypeName, that.eventTypeName)
            && Objects.equals(this.eventSourceId, that.eventSourceId)
            && Objects.equals(this.eventSourceName, that.eventSourceName)
            && Objects.equals(this.eventSourceLabel, that.eventSourceLabel)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updatedTime, that.updatedTime);
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
            eventTypeId,
            eventTypeName,
            eventSourceId,
            eventSourceName,
            eventSourceLabel,
            createdTime,
            updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomizeSchemaItemInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    numberOfVersions: ").append(toIndentedString(numberOfVersions)).append("\n");
        sb.append("    eventTypeId: ").append(toIndentedString(eventTypeId)).append("\n");
        sb.append("    eventTypeName: ").append(toIndentedString(eventTypeName)).append("\n");
        sb.append("    eventSourceId: ").append(toIndentedString(eventSourceId)).append("\n");
        sb.append("    eventSourceName: ").append(toIndentedString(eventSourceName)).append("\n");
        sb.append("    eventSourceLabel: ").append(toIndentedString(eventSourceLabel)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
