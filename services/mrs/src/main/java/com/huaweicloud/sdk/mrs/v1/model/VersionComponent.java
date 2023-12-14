package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组件详情
 */
public class VersionComponent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other")

    private Map<String, Object> other = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "depend_on")

    private List<String> dependOn = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_cluster_types")

    private List<String> availableClusterTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_datasources")

    private List<ComponentExternalDatasource> externalDatasources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_requirement")

    private List<String> resourceRequirement = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "valid_roles")

    private List<String> validRoles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Boolean visible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "children_components")

    private List<String> childrenComponents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_az_support_status")

    private String multiAzSupportStatus;

    public VersionComponent withOther(Map<String, Object> other) {
        this.other = other;
        return this;
    }

    public VersionComponent putOtherItem(String key, Object otherItem) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        this.other.put(key, otherItem);
        return this;
    }

    public VersionComponent withOther(Consumer<Map<String, Object>> otherSetter) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        otherSetter.accept(this.other);
        return this;
    }

    /**
     * 其他
     * @return other
     */
    public Map<String, Object> getOther() {
        return other;
    }

    public void setOther(Map<String, Object> other) {
        this.other = other;
    }

    public VersionComponent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 组件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VersionComponent withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 支持版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public VersionComponent withDependOn(List<String> dependOn) {
        this.dependOn = dependOn;
        return this;
    }

    public VersionComponent addDependOnItem(String dependOnItem) {
        if (this.dependOn == null) {
            this.dependOn = new ArrayList<>();
        }
        this.dependOn.add(dependOnItem);
        return this;
    }

    public VersionComponent withDependOn(Consumer<List<String>> dependOnSetter) {
        if (this.dependOn == null) {
            this.dependOn = new ArrayList<>();
        }
        dependOnSetter.accept(this.dependOn);
        return this;
    }

    /**
     * 组件依赖项
     * @return dependOn
     */
    public List<String> getDependOn() {
        return dependOn;
    }

    public void setDependOn(List<String> dependOn) {
        this.dependOn = dependOn;
    }

    public VersionComponent withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 组件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public VersionComponent withAvailableClusterTypes(List<String> availableClusterTypes) {
        this.availableClusterTypes = availableClusterTypes;
        return this;
    }

    public VersionComponent addAvailableClusterTypesItem(String availableClusterTypesItem) {
        if (this.availableClusterTypes == null) {
            this.availableClusterTypes = new ArrayList<>();
        }
        this.availableClusterTypes.add(availableClusterTypesItem);
        return this;
    }

    public VersionComponent withAvailableClusterTypes(Consumer<List<String>> availableClusterTypesSetter) {
        if (this.availableClusterTypes == null) {
            this.availableClusterTypes = new ArrayList<>();
        }
        availableClusterTypesSetter.accept(this.availableClusterTypes);
        return this;
    }

    /**
     * 支持该组件的集群类型
     * @return availableClusterTypes
     */
    public List<String> getAvailableClusterTypes() {
        return availableClusterTypes;
    }

    public void setAvailableClusterTypes(List<String> availableClusterTypes) {
        this.availableClusterTypes = availableClusterTypes;
    }

    public VersionComponent withExternalDatasources(List<ComponentExternalDatasource> externalDatasources) {
        this.externalDatasources = externalDatasources;
        return this;
    }

    public VersionComponent addExternalDatasourcesItem(ComponentExternalDatasource externalDatasourcesItem) {
        if (this.externalDatasources == null) {
            this.externalDatasources = new ArrayList<>();
        }
        this.externalDatasources.add(externalDatasourcesItem);
        return this;
    }

    public VersionComponent withExternalDatasources(
        Consumer<List<ComponentExternalDatasource>> externalDatasourcesSetter) {
        if (this.externalDatasources == null) {
            this.externalDatasources = new ArrayList<>();
        }
        externalDatasourcesSetter.accept(this.externalDatasources);
        return this;
    }

    /**
     * 外部数据源
     * @return externalDatasources
     */
    public List<ComponentExternalDatasource> getExternalDatasources() {
        return externalDatasources;
    }

    public void setExternalDatasources(List<ComponentExternalDatasource> externalDatasources) {
        this.externalDatasources = externalDatasources;
    }

    public VersionComponent withResourceRequirement(List<String> resourceRequirement) {
        this.resourceRequirement = resourceRequirement;
        return this;
    }

    public VersionComponent addResourceRequirementItem(String resourceRequirementItem) {
        if (this.resourceRequirement == null) {
            this.resourceRequirement = new ArrayList<>();
        }
        this.resourceRequirement.add(resourceRequirementItem);
        return this;
    }

    public VersionComponent withResourceRequirement(Consumer<List<String>> resourceRequirementSetter) {
        if (this.resourceRequirement == null) {
            this.resourceRequirement = new ArrayList<>();
        }
        resourceRequirementSetter.accept(this.resourceRequirement);
        return this;
    }

    /**
     * 所需的ip等资源说明
     * @return resourceRequirement
     */
    public List<String> getResourceRequirement() {
        return resourceRequirement;
    }

    public void setResourceRequirement(List<String> resourceRequirement) {
        this.resourceRequirement = resourceRequirement;
    }

    public VersionComponent withValidRoles(List<String> validRoles) {
        this.validRoles = validRoles;
        return this;
    }

    public VersionComponent addValidRolesItem(String validRolesItem) {
        if (this.validRoles == null) {
            this.validRoles = new ArrayList<>();
        }
        this.validRoles.add(validRolesItem);
        return this;
    }

    public VersionComponent withValidRoles(Consumer<List<String>> validRolesSetter) {
        if (this.validRoles == null) {
            this.validRoles = new ArrayList<>();
        }
        validRolesSetter.accept(this.validRoles);
        return this;
    }

    /**
     * 有效角色
     * @return validRoles
     */
    public List<String> getValidRoles() {
        return validRoles;
    }

    public void setValidRoles(List<String> validRoles) {
        this.validRoles = validRoles;
    }

    public VersionComponent withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 是否可见
     * @return visible
     */
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public VersionComponent withChildrenComponents(List<String> childrenComponents) {
        this.childrenComponents = childrenComponents;
        return this;
    }

    public VersionComponent addChildrenComponentsItem(String childrenComponentsItem) {
        if (this.childrenComponents == null) {
            this.childrenComponents = new ArrayList<>();
        }
        this.childrenComponents.add(childrenComponentsItem);
        return this;
    }

    public VersionComponent withChildrenComponents(Consumer<List<String>> childrenComponentsSetter) {
        if (this.childrenComponents == null) {
            this.childrenComponents = new ArrayList<>();
        }
        childrenComponentsSetter.accept(this.childrenComponents);
        return this;
    }

    /**
     * 子组件
     * @return childrenComponents
     */
    public List<String> getChildrenComponents() {
        return childrenComponents;
    }

    public void setChildrenComponents(List<String> childrenComponents) {
        this.childrenComponents = childrenComponents;
    }

    public VersionComponent withMultiAzSupportStatus(String multiAzSupportStatus) {
        this.multiAzSupportStatus = multiAzSupportStatus;
        return this;
    }

    /**
     * 多az支持状态
     * @return multiAzSupportStatus
     */
    public String getMultiAzSupportStatus() {
        return multiAzSupportStatus;
    }

    public void setMultiAzSupportStatus(String multiAzSupportStatus) {
        this.multiAzSupportStatus = multiAzSupportStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionComponent that = (VersionComponent) obj;
        return Objects.equals(this.other, that.other) && Objects.equals(this.name, that.name)
            && Objects.equals(this.version, that.version) && Objects.equals(this.dependOn, that.dependOn)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.availableClusterTypes, that.availableClusterTypes)
            && Objects.equals(this.externalDatasources, that.externalDatasources)
            && Objects.equals(this.resourceRequirement, that.resourceRequirement)
            && Objects.equals(this.validRoles, that.validRoles) && Objects.equals(this.visible, that.visible)
            && Objects.equals(this.childrenComponents, that.childrenComponents)
            && Objects.equals(this.multiAzSupportStatus, that.multiAzSupportStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(other,
            name,
            version,
            dependOn,
            description,
            availableClusterTypes,
            externalDatasources,
            resourceRequirement,
            validRoles,
            visible,
            childrenComponents,
            multiAzSupportStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionComponent {\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    dependOn: ").append(toIndentedString(dependOn)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    availableClusterTypes: ").append(toIndentedString(availableClusterTypes)).append("\n");
        sb.append("    externalDatasources: ").append(toIndentedString(externalDatasources)).append("\n");
        sb.append("    resourceRequirement: ").append(toIndentedString(resourceRequirement)).append("\n");
        sb.append("    validRoles: ").append(toIndentedString(validRoles)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    childrenComponents: ").append(toIndentedString(childrenComponents)).append("\n");
        sb.append("    multiAzSupportStatus: ").append(toIndentedString(multiAzSupportStatus)).append("\n");
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
