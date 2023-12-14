package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMrsVersionMetadataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other")

    private Map<String, Object> other = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private String templateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "features")

    private List<String> features = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_types")

    private List<String> clusterTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_type")

    private String versionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "components")

    private List<VersionComponent> components = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_requirement")

    private List<String> resourceRequirement = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "constraints")

    private VersionConstraint constraints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private FlavorLists flavors;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_deploy_meta")

    private List<RoleDeployMeta> roleDeployMeta = null;

    public ShowMrsVersionMetadataResponse withOther(Map<String, Object> other) {
        this.other = other;
        return this;
    }

    public ShowMrsVersionMetadataResponse putOtherItem(String key, Object otherItem) {
        if (this.other == null) {
            this.other = new HashMap<>();
        }
        this.other.put(key, otherItem);
        return this;
    }

    public ShowMrsVersionMetadataResponse withOther(Consumer<Map<String, Object>> otherSetter) {
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

    public ShowMrsVersionMetadataResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像版本名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowMrsVersionMetadataResponse withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * 模板类型
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public ShowMrsVersionMetadataResponse withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public ShowMrsVersionMetadataResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 版本状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowMrsVersionMetadataResponse withFeatures(List<String> features) {
        this.features = features;
        return this;
    }

    public ShowMrsVersionMetadataResponse addFeaturesItem(String featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    public ShowMrsVersionMetadataResponse withFeatures(Consumer<List<String>> featuresSetter) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        featuresSetter.accept(this.features);
        return this;
    }

    /**
     * 特性列表
     * @return features
     */
    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public ShowMrsVersionMetadataResponse withClusterTypes(List<String> clusterTypes) {
        this.clusterTypes = clusterTypes;
        return this;
    }

    public ShowMrsVersionMetadataResponse addClusterTypesItem(String clusterTypesItem) {
        if (this.clusterTypes == null) {
            this.clusterTypes = new ArrayList<>();
        }
        this.clusterTypes.add(clusterTypesItem);
        return this;
    }

    public ShowMrsVersionMetadataResponse withClusterTypes(Consumer<List<String>> clusterTypesSetter) {
        if (this.clusterTypes == null) {
            this.clusterTypes = new ArrayList<>();
        }
        clusterTypesSetter.accept(this.clusterTypes);
        return this;
    }

    /**
     * 集群类型列表
     * @return clusterTypes
     */
    public List<String> getClusterTypes() {
        return clusterTypes;
    }

    public void setClusterTypes(List<String> clusterTypes) {
        this.clusterTypes = clusterTypes;
    }

    public ShowMrsVersionMetadataResponse withVersionType(String versionType) {
        this.versionType = versionType;
        return this;
    }

    /**
     * 版本类型
     * @return versionType
     */
    public String getVersionType() {
        return versionType;
    }

    public void setVersionType(String versionType) {
        this.versionType = versionType;
    }

    public ShowMrsVersionMetadataResponse withComponents(List<VersionComponent> components) {
        this.components = components;
        return this;
    }

    public ShowMrsVersionMetadataResponse addComponentsItem(VersionComponent componentsItem) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        this.components.add(componentsItem);
        return this;
    }

    public ShowMrsVersionMetadataResponse withComponents(Consumer<List<VersionComponent>> componentsSetter) {
        if (this.components == null) {
            this.components = new ArrayList<>();
        }
        componentsSetter.accept(this.components);
        return this;
    }

    /**
     * 组件列表
     * @return components
     */
    public List<VersionComponent> getComponents() {
        return components;
    }

    public void setComponents(List<VersionComponent> components) {
        this.components = components;
    }

    public ShowMrsVersionMetadataResponse withResourceRequirement(List<String> resourceRequirement) {
        this.resourceRequirement = resourceRequirement;
        return this;
    }

    public ShowMrsVersionMetadataResponse addResourceRequirementItem(String resourceRequirementItem) {
        if (this.resourceRequirement == null) {
            this.resourceRequirement = new ArrayList<>();
        }
        this.resourceRequirement.add(resourceRequirementItem);
        return this;
    }

    public ShowMrsVersionMetadataResponse withResourceRequirement(Consumer<List<String>> resourceRequirementSetter) {
        if (this.resourceRequirement == null) {
            this.resourceRequirement = new ArrayList<>();
        }
        resourceRequirementSetter.accept(this.resourceRequirement);
        return this;
    }

    /**
     * 版本所需的ip等资源说明
     * @return resourceRequirement
     */
    public List<String> getResourceRequirement() {
        return resourceRequirement;
    }

    public void setResourceRequirement(List<String> resourceRequirement) {
        this.resourceRequirement = resourceRequirement;
    }

    public ShowMrsVersionMetadataResponse withConstraints(VersionConstraint constraints) {
        this.constraints = constraints;
        return this;
    }

    public ShowMrsVersionMetadataResponse withConstraints(Consumer<VersionConstraint> constraintsSetter) {
        if (this.constraints == null) {
            this.constraints = new VersionConstraint();
            constraintsSetter.accept(this.constraints);
        }

        return this;
    }

    /**
     * Get constraints
     * @return constraints
     */
    public VersionConstraint getConstraints() {
        return constraints;
    }

    public void setConstraints(VersionConstraint constraints) {
        this.constraints = constraints;
    }

    public ShowMrsVersionMetadataResponse withFlavors(FlavorLists flavors) {
        this.flavors = flavors;
        return this;
    }

    public ShowMrsVersionMetadataResponse withFlavors(Consumer<FlavorLists> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new FlavorLists();
            flavorsSetter.accept(this.flavors);
        }

        return this;
    }

    /**
     * Get flavors
     * @return flavors
     */
    public FlavorLists getFlavors() {
        return flavors;
    }

    public void setFlavors(FlavorLists flavors) {
        this.flavors = flavors;
    }

    public ShowMrsVersionMetadataResponse withRoleDeployMeta(List<RoleDeployMeta> roleDeployMeta) {
        this.roleDeployMeta = roleDeployMeta;
        return this;
    }

    public ShowMrsVersionMetadataResponse addRoleDeployMetaItem(RoleDeployMeta roleDeployMetaItem) {
        if (this.roleDeployMeta == null) {
            this.roleDeployMeta = new ArrayList<>();
        }
        this.roleDeployMeta.add(roleDeployMetaItem);
        return this;
    }

    public ShowMrsVersionMetadataResponse withRoleDeployMeta(Consumer<List<RoleDeployMeta>> roleDeployMetaSetter) {
        if (this.roleDeployMeta == null) {
            this.roleDeployMeta = new ArrayList<>();
        }
        roleDeployMetaSetter.accept(this.roleDeployMeta);
        return this;
    }

    /**
     * 版本组件实例角色部署策略
     * @return roleDeployMeta
     */
    public List<RoleDeployMeta> getRoleDeployMeta() {
        return roleDeployMeta;
    }

    public void setRoleDeployMeta(List<RoleDeployMeta> roleDeployMeta) {
        this.roleDeployMeta = roleDeployMeta;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMrsVersionMetadataResponse that = (ShowMrsVersionMetadataResponse) obj;
        return Objects.equals(this.other, that.other) && Objects.equals(this.name, that.name)
            && Objects.equals(this.templateType, that.templateType) && Objects.equals(this.imageId, that.imageId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.features, that.features)
            && Objects.equals(this.clusterTypes, that.clusterTypes)
            && Objects.equals(this.versionType, that.versionType) && Objects.equals(this.components, that.components)
            && Objects.equals(this.resourceRequirement, that.resourceRequirement)
            && Objects.equals(this.constraints, that.constraints) && Objects.equals(this.flavors, that.flavors)
            && Objects.equals(this.roleDeployMeta, that.roleDeployMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(other,
            name,
            templateType,
            imageId,
            status,
            features,
            clusterTypes,
            versionType,
            components,
            resourceRequirement,
            constraints,
            flavors,
            roleDeployMeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMrsVersionMetadataResponse {\n");
        sb.append("    other: ").append(toIndentedString(other)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    clusterTypes: ").append(toIndentedString(clusterTypes)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
        sb.append("    components: ").append(toIndentedString(components)).append("\n");
        sb.append("    resourceRequirement: ").append(toIndentedString(resourceRequirement)).append("\n");
        sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("    roleDeployMeta: ").append(toIndentedString(roleDeployMeta)).append("\n");
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
