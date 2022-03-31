package com.huaweicloud.sdk.cc.v3.model;

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

/** 创建网络实例的详细信息。 */
public class CreateNetworkInstance {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /** 添加到云连接网络实例的类型。|- VPC：虚拟私有云。 VGW：虚拟网关。 ER：虚拟路由器。 */
    public static final class TypeEnum {

        /** Enum VPC for value: "vpc" */
        public static final TypeEnum VPC = new TypeEnum("vpc");

        /** Enum VGW for value: "vgw" */
        public static final TypeEnum VGW = new TypeEnum("vgw");

        /** Enum ER for value: "er" */
        public static final TypeEnum ER = new TypeEnum("er");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("vpc", VPC);
            map.put("vgw", VGW);
            map.put("er", ER);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_domain_id")

    private String instanceDomainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_connection_id")

    private String cloudConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidrs")

    private List<String> cidrs = null;

    public CreateNetworkInstance withName(String name) {
        this.name = name;
        return this;
    }

    /** 网络实例的名字。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateNetworkInstance withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 网络实例的描述。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateNetworkInstance withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 添加到云连接网络实例的类型。|- VPC：虚拟私有云。 VGW：虚拟网关。 ER：虚拟路由器。
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateNetworkInstance withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 添加到云连接网络实例的ID，VPC或者VGW的ID。
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateNetworkInstance withInstanceDomainId(String instanceDomainId) {
        this.instanceDomainId = instanceDomainId;
        return this;
    }

    /** VPC或者VGW的账户ID。
     * 
     * @return instanceDomainId */
    public String getInstanceDomainId() {
        return instanceDomainId;
    }

    public void setInstanceDomainId(String instanceDomainId) {
        this.instanceDomainId = instanceDomainId;
    }

    public CreateNetworkInstance withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** VPC或者VGW的项目ID。
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateNetworkInstance withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /** VPC或者VGW的RegionID。
     * 
     * @return regionId */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public CreateNetworkInstance withCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
        return this;
    }

    /** 云连接实例ID。
     * 
     * @return cloudConnectionId */
    public String getCloudConnectionId() {
        return cloudConnectionId;
    }

    public void setCloudConnectionId(String cloudConnectionId) {
        this.cloudConnectionId = cloudConnectionId;
    }

    public CreateNetworkInstance withCidrs(List<String> cidrs) {
        this.cidrs = cidrs;
        return this;
    }

    public CreateNetworkInstance addCidrsItem(String cidrsItem) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        this.cidrs.add(cidrsItem);
        return this;
    }

    public CreateNetworkInstance withCidrs(Consumer<List<String>> cidrsSetter) {
        if (this.cidrs == null) {
            this.cidrs = new ArrayList<>();
        }
        cidrsSetter.accept(this.cidrs);
        return this;
    }

    /** VPC或者VGW发布的网段路由列表，ER场景不需要此字段。
     * 
     * @return cidrs */
    public List<String> getCidrs() {
        return cidrs;
    }

    public void setCidrs(List<String> cidrs) {
        this.cidrs = cidrs;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateNetworkInstance createNetworkInstance = (CreateNetworkInstance) o;
        return Objects.equals(this.name, createNetworkInstance.name)
            && Objects.equals(this.description, createNetworkInstance.description)
            && Objects.equals(this.type, createNetworkInstance.type)
            && Objects.equals(this.instanceId, createNetworkInstance.instanceId)
            && Objects.equals(this.instanceDomainId, createNetworkInstance.instanceDomainId)
            && Objects.equals(this.projectId, createNetworkInstance.projectId)
            && Objects.equals(this.regionId, createNetworkInstance.regionId)
            && Objects.equals(this.cloudConnectionId, createNetworkInstance.cloudConnectionId)
            && Objects.equals(this.cidrs, createNetworkInstance.cidrs);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, type, instanceId, instanceDomainId, projectId, regionId, cloudConnectionId, cidrs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNetworkInstance {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceDomainId: ").append(toIndentedString(instanceDomainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    cloudConnectionId: ").append(toIndentedString(cloudConnectionId)).append("\n");
        sb.append("    cidrs: ").append(toIndentedString(cidrs)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
