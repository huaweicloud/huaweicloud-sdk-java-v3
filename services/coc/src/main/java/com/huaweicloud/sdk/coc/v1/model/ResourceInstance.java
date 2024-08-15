package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceInstance
 */
public class ResourceInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    /**
     * 资源提供者下资源类型，不传默认为CLOUDSERVER CLOUDSERVER:CLOUDSERVER类型
     */
    public static final class TypeEnum {

        /**
         * Enum CLOUDSERVER for value: "CLOUDSERVER"
         */
        public static final TypeEnum CLOUDSERVER = new TypeEnum("CLOUDSERVER");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("CLOUDSERVER", CLOUDSERVER);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_attributes")

    private List<Customttribute> customAttributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_sn")

    private String agentSn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private ResourceInstanceProp properties;

    public ResourceInstance withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 实例唯一id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ResourceInstance withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 资源提供者：ECS。单个脚本工单， 每个实例的provider是一致的
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ResourceInstance withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 机器所属region的ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ResourceInstance withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 资源提供者下资源类型，不传默认为CLOUDSERVER CLOUDSERVER:CLOUDSERVER类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ResourceInstance withCustomAttributes(List<Customttribute> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    public ResourceInstance addCustomAttributesItem(Customttribute customAttributesItem) {
        if (this.customAttributes == null) {
            this.customAttributes = new ArrayList<>();
        }
        this.customAttributes.add(customAttributesItem);
        return this;
    }

    public ResourceInstance withCustomAttributes(Consumer<List<Customttribute>> customAttributesSetter) {
        if (this.customAttributes == null) {
            this.customAttributes = new ArrayList<>();
        }
        customAttributesSetter.accept(this.customAttributes);
        return this;
    }

    /**
     * 支持用户自定义5个key_value形式的属性。 约束条件：  - key值长度为20     - value长度为50     - map长度最大为5
     * @return customAttributes
     */
    public List<Customttribute> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(List<Customttribute> customAttributes) {
        this.customAttributes = customAttributes;
    }

    public ResourceInstance withAgentSn(String agentSn) {
        this.agentSn = agentSn;
        return this;
    }

    /**
     * agent纳管id。该参数即将废弃，请勿使用。
     * @return agentSn
     */
    public String getAgentSn() {
        return agentSn;
    }

    public void setAgentSn(String agentSn) {
        this.agentSn = agentSn;
    }

    public ResourceInstance withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * agent纳管状态。该参数即将废弃，请勿使用。
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ResourceInstance withProperties(ResourceInstanceProp properties) {
        this.properties = properties;
        return this;
    }

    public ResourceInstance withProperties(Consumer<ResourceInstanceProp> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new ResourceInstanceProp();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public ResourceInstanceProp getProperties() {
        return properties;
    }

    public void setProperties(ResourceInstanceProp properties) {
        this.properties = properties;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceInstance that = (ResourceInstance) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.customAttributes, that.customAttributes)
            && Objects.equals(this.agentSn, that.agentSn) && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.properties, that.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, provider, regionId, type, customAttributes, agentSn, agentStatus, properties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInstance {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
        sb.append("    agentSn: ").append(toIndentedString(agentSn)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
