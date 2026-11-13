package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListResourceAssociationsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private List<String> resourceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private List<String> resourceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_project_id")

    private String resourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private List<String> instanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private List<String> instanceType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_project_id")

    private String instanceProjectId;

    public ListResourceAssociationsRequest withResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    public ListResourceAssociationsRequest addResourceIdItem(String resourceIdItem) {
        if (this.resourceId == null) {
            this.resourceId = new ArrayList<>();
        }
        this.resourceId.add(resourceIdItem);
        return this;
    }

    public ListResourceAssociationsRequest withResourceId(Consumer<List<String>> resourceIdSetter) {
        if (this.resourceId == null) {
            this.resourceId = new ArrayList<>();
        }
        resourceIdSetter.accept(this.resourceId);
        return this;
    }

    /**
     * **参数解释**： 资源ID，填写后按照ID进行过滤，支持传入多个ID过滤。 **取值范围**： 弹性网卡/辅助弹性网卡的资源ID。
     * @return resourceId
     */
    public List<String> getResourceId() {
        return resourceId;
    }

    public void setResourceId(List<String> resourceId) {
        this.resourceId = resourceId;
    }

    public ListResourceAssociationsRequest withResourceType(List<String> resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    public ListResourceAssociationsRequest addResourceTypeItem(String resourceTypeItem) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        this.resourceType.add(resourceTypeItem);
        return this;
    }

    public ListResourceAssociationsRequest withResourceType(Consumer<List<String>> resourceTypeSetter) {
        if (this.resourceType == null) {
            this.resourceType = new ArrayList<>();
        }
        resourceTypeSetter.accept(this.resourceType);
        return this;
    }

    /**
     * **参数解释**： 资源的类型，填写后按照资源类型进行过滤，支持传入多个资源类型过滤。 **取值范围**： - port：弹性网卡。 - subeni：辅助弹性网卡。
     * @return resourceType
     */
    public List<String> getResourceType() {
        return resourceType;
    }

    public void setResourceType(List<String> resourceType) {
        this.resourceType = resourceType;
    }

    public ListResourceAssociationsRequest withResourceProjectId(String resourceProjectId) {
        this.resourceProjectId = resourceProjectId;
        return this;
    }

    /**
     * **参数解释**： 资源所属的项目ID，填写后按照项目ID进行过滤。 **取值范围**： 不涉及。
     * @return resourceProjectId
     */
    public String getResourceProjectId() {
        return resourceProjectId;
    }

    public void setResourceProjectId(String resourceProjectId) {
        this.resourceProjectId = resourceProjectId;
    }

    public ListResourceAssociationsRequest withInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public ListResourceAssociationsRequest addInstanceIdItem(String instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public ListResourceAssociationsRequest withInstanceId(Consumer<List<String>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    /**
     * **参数解释**： 实例ID，填写后按照ID进行过滤，支持传入多个ID过滤。 **取值范围**： ELB实例的ID。
     * @return instanceId
     */
    public List<String> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
    }

    public ListResourceAssociationsRequest withInstanceType(List<String> instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public ListResourceAssociationsRequest addInstanceTypeItem(String instanceTypeItem) {
        if (this.instanceType == null) {
            this.instanceType = new ArrayList<>();
        }
        this.instanceType.add(instanceTypeItem);
        return this;
    }

    public ListResourceAssociationsRequest withInstanceType(Consumer<List<String>> instanceTypeSetter) {
        if (this.instanceType == null) {
            this.instanceType = new ArrayList<>();
        }
        instanceTypeSetter.accept(this.instanceType);
        return this;
    }

    /**
     * **参数解释**： 实例的类型，填写后按照实例类型进行过滤，支持传入多个实例类型过滤。 **取值范围**： - ELB：ELB实例。
     * @return instanceType
     */
    public List<String> getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(List<String> instanceType) {
        this.instanceType = instanceType;
    }

    public ListResourceAssociationsRequest withInstanceProjectId(String instanceProjectId) {
        this.instanceProjectId = instanceProjectId;
        return this;
    }

    /**
     * **参数解释**： 实例所属的项目ID，填写后按照项目ID进行过滤。 **取值范围**： 不涉及。
     * @return instanceProjectId
     */
    public String getInstanceProjectId() {
        return instanceProjectId;
    }

    public void setInstanceProjectId(String instanceProjectId) {
        this.instanceProjectId = instanceProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourceAssociationsRequest that = (ListResourceAssociationsRequest) obj;
        return Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceProjectId, that.resourceProjectId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.instanceProjectId, that.instanceProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourceType, resourceProjectId, instanceId, instanceType, instanceProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceAssociationsRequest {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceProjectId: ").append(toIndentedString(resourceProjectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    instanceProjectId: ").append(toIndentedString(instanceProjectId)).append("\n");
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
