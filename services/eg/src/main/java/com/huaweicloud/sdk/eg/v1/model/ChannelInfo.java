package com.huaweicloud.sdk.eg.v1.model;

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
 * ChannelInfo
 */
public class ChannelInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    /**
     * 通道提供方类型，OFFICIAL：官方事件通道；CUSTOM：自定义事件通道
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

    @JacksonXmlProperty(localName = "provider_type")

    private ProviderTypeEnum providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    @JacksonXmlProperty(localName = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    @JacksonXmlProperty(localName = "updated_time")

    private String updatedTime;

    public ChannelInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 通道ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChannelInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 通道名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChannelInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 通道描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChannelInfo withProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 通道提供方类型，OFFICIAL：官方事件通道；CUSTOM：自定义事件通道
     * @return providerType
     */
    public ProviderTypeEnum getProviderType() {
        return providerType;
    }

    public void setProviderType(ProviderTypeEnum providerType) {
        this.providerType = providerType;
    }

    public ChannelInfo withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建UTC时间
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public ChannelInfo withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新UTC时间
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChannelInfo channelInfo = (ChannelInfo) o;
        return Objects.equals(this.id, channelInfo.id) && Objects.equals(this.name, channelInfo.name)
            && Objects.equals(this.description, channelInfo.description)
            && Objects.equals(this.providerType, channelInfo.providerType)
            && Objects.equals(this.createdTime, channelInfo.createdTime)
            && Objects.equals(this.updatedTime, channelInfo.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, providerType, createdTime, updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChannelInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
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
