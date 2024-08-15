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
 * 执行脚本时需要传的机器信息
 */
public class ExecuteResourceInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private String provider;

    /**
     * 资源提供者下资源类型，不传默认为CLOUDSERVER CLOUDSERVER:CLOUDSERVER类型 约束：  -不允许跨type支持
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
    @JsonProperty(value = "project_id")

    private String projectId;

    public ExecuteResourceInstance withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * ecs云服务器ID
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ExecuteResourceInstance withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 服务器所属region
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ExecuteResourceInstance withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 资源提供者：ECS，不传默认为：ECS。请保证一次执行， 每个实例的provider是一致的。后续扩展CCE等
     * @return provider
     */
    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public ExecuteResourceInstance withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 资源提供者下资源类型，不传默认为CLOUDSERVER CLOUDSERVER:CLOUDSERVER类型 约束：  -不允许跨type支持
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ExecuteResourceInstance withCustomAttributes(List<Customttribute> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    public ExecuteResourceInstance addCustomAttributesItem(Customttribute customAttributesItem) {
        if (this.customAttributes == null) {
            this.customAttributes = new ArrayList<>();
        }
        this.customAttributes.add(customAttributesItem);
        return this;
    }

    public ExecuteResourceInstance withCustomAttributes(Consumer<List<Customttribute>> customAttributesSetter) {
        if (this.customAttributes == null) {
            this.customAttributes = new ArrayList<>();
        }
        customAttributesSetter.accept(this.customAttributes);
        return this;
    }

    /**
     * 支持用户自定义5个key_value形式的属性。  约束条件： - key值长度为10  - value长度为20  - map长度最大为5 - 禁止填写敏感数据
     * @return customAttributes
     */
    public List<Customttribute> getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(List<Customttribute> customAttributes) {
        this.customAttributes = customAttributes;
    }

    public ExecuteResourceInstance withAgentSn(String agentSn) {
        this.agentSn = agentSn;
        return this;
    }

    /**
     * 该参数已废弃，传入该参数不会生效。
     * @return agentSn
     */
    public String getAgentSn() {
        return agentSn;
    }

    public void setAgentSn(String agentSn) {
        this.agentSn = agentSn;
    }

    public ExecuteResourceInstance withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 该参数已废弃，传入该参数不会生效。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteResourceInstance that = (ExecuteResourceInstance) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.provider, that.provider) && Objects.equals(this.type, that.type)
            && Objects.equals(this.customAttributes, that.customAttributes)
            && Objects.equals(this.agentSn, that.agentSn) && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, regionId, provider, type, customAttributes, agentSn, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteResourceInstance {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
        sb.append("    agentSn: ").append(toIndentedString(agentSn)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
