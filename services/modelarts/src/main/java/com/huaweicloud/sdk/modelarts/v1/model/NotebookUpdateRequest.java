package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NotebookUpdateRequest
 */
public class NotebookUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<EndpointsReq> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_spec")

    private NotebookCustomSpec customSpec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_new_size")

    private Integer storageNewSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hooks")

    private CustomHooks hooks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "affinity")

    private AffinityType affinity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dew_secret_name")

    private String dewSecretName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_volumes")

    private List<VolumeMountRequest> dataVolumes = null;

    public NotebookUpdateRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：支持更新实例描述信息。 **约束限制**：不涉及。 **取值范围**：长度限制为512字符，且不能包含字符&<>\"'/。 **默认取值**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NotebookUpdateRequest withEndpoints(List<EndpointsReq> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public NotebookUpdateRequest addEndpointsItem(EndpointsReq endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public NotebookUpdateRequest withEndpoints(Consumer<List<EndpointsReq>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * **参数解释**：仅在本地IDE（如PyCharm、VS Code）或SSH客户端接入Notebook。 **约束限制**：仅在本地IDE（如PyCharm、VS Code）或SSH客户端，通过SSH远程接入Notebook实例时需要的相关配置。
     * @return endpoints
     */
    public List<EndpointsReq> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndpointsReq> endpoints) {
        this.endpoints = endpoints;
    }

    public NotebookUpdateRequest withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：支持变更实例的机器规格。支持变更的规格可以通过本章节的[查询支持可切换规格列表](ShowSwitchableFlavors.xml)的API获取。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public NotebookUpdateRequest withCustomSpec(NotebookCustomSpec customSpec) {
        this.customSpec = customSpec;
        return this;
    }

    public NotebookUpdateRequest withCustomSpec(Consumer<NotebookCustomSpec> customSpecSetter) {
        if (this.customSpec == null) {
            this.customSpec = new NotebookCustomSpec();
            customSpecSetter.accept(this.customSpec);
        }

        return this;
    }

    /**
     * Get customSpec
     * @return customSpec
     */
    public NotebookCustomSpec getCustomSpec() {
        return customSpec;
    }

    public void setCustomSpec(NotebookCustomSpec customSpec) {
        this.customSpec = customSpec;
    }

    public NotebookUpdateRequest withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * **参数解释**：支持更新镜像ID，镜像ID参考[查询支持的镜像列表](ListImage.xml)获取。 **约束限制**：不涉及。 **取值范围**：调用[查询支持的镜像列表](ListImage.xml)接口获取的合法镜像ID列表。 **默认取值**：不涉及。
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public NotebookUpdateRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：支持更新实例名称。 **约束限制**：不涉及。 **取值范围**：长度限制为128个字符，支持大小写字母、数字、中划线和下划线，名称可重复。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NotebookUpdateRequest withStorageNewSize(Integer storageNewSize) {
        this.storageNewSize = storageNewSize;
        return this;
    }

    /**
     * **参数解释**：EVS实例支持动态扩充的容量，单位GB。只允许扩容，不允许缩容。 **约束限制**：不涉及。 **取值范围**：最大允许扩容至4096。 **默认取值**：不涉及。
     * @return storageNewSize
     */
    public Integer getStorageNewSize() {
        return storageNewSize;
    }

    public void setStorageNewSize(Integer storageNewSize) {
        this.storageNewSize = storageNewSize;
    }

    public NotebookUpdateRequest withHooks(CustomHooks hooks) {
        this.hooks = hooks;
        return this;
    }

    public NotebookUpdateRequest withHooks(Consumer<CustomHooks> hooksSetter) {
        if (this.hooks == null) {
            this.hooks = new CustomHooks();
            hooksSetter.accept(this.hooks);
        }

        return this;
    }

    /**
     * Get hooks
     * @return hooks
     */
    public CustomHooks getHooks() {
        return hooks;
    }

    public void setHooks(CustomHooks hooks) {
        this.hooks = hooks;
    }

    public NotebookUpdateRequest withAffinity(AffinityType affinity) {
        this.affinity = affinity;
        return this;
    }

    public NotebookUpdateRequest withAffinity(Consumer<AffinityType> affinitySetter) {
        if (this.affinity == null) {
            this.affinity = new AffinityType();
            affinitySetter.accept(this.affinity);
        }

        return this;
    }

    /**
     * Get affinity
     * @return affinity
     */
    public AffinityType getAffinity() {
        return affinity;
    }

    public void setAffinity(AffinityType affinity) {
        this.affinity = affinity;
    }

    public NotebookUpdateRequest withDewSecretName(String dewSecretName) {
        this.dewSecretName = dewSecretName;
        return this;
    }

    /**
     * **参数解释**：DEW存储的用户AKSK凭据名称。 **参数约束**：当category为OBS时必填，仅支持大小写字母、数字、中划线、下划线，长度 1-64 字符。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return dewSecretName
     */
    public String getDewSecretName() {
        return dewSecretName;
    }

    public void setDewSecretName(String dewSecretName) {
        this.dewSecretName = dewSecretName;
    }

    public NotebookUpdateRequest withDataVolumes(List<VolumeMountRequest> dataVolumes) {
        this.dataVolumes = dataVolumes;
        return this;
    }

    public NotebookUpdateRequest addDataVolumesItem(VolumeMountRequest dataVolumesItem) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        this.dataVolumes.add(dataVolumesItem);
        return this;
    }

    public NotebookUpdateRequest withDataVolumes(Consumer<List<VolumeMountRequest>> dataVolumesSetter) {
        if (this.dataVolumes == null) {
            this.dataVolumes = new ArrayList<>();
        }
        dataVolumesSetter.accept(this.dataVolumes);
        return this;
    }

    /**
     * **参数解释**：扩展存储信息。 **约束限制**：不涉及。
     * @return dataVolumes
     */
    public List<VolumeMountRequest> getDataVolumes() {
        return dataVolumes;
    }

    public void setDataVolumes(List<VolumeMountRequest> dataVolumes) {
        this.dataVolumes = dataVolumes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NotebookUpdateRequest that = (NotebookUpdateRequest) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.endpoints, that.endpoints)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.customSpec, that.customSpec)
            && Objects.equals(this.imageId, that.imageId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.storageNewSize, that.storageNewSize) && Objects.equals(this.hooks, that.hooks)
            && Objects.equals(this.affinity, that.affinity) && Objects.equals(this.dewSecretName, that.dewSecretName)
            && Objects.equals(this.dataVolumes, that.dataVolumes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            endpoints,
            flavor,
            customSpec,
            imageId,
            name,
            storageNewSize,
            hooks,
            affinity,
            dewSecretName,
            dataVolumes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotebookUpdateRequest {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    customSpec: ").append(toIndentedString(customSpec)).append("\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    storageNewSize: ").append(toIndentedString(storageNewSize)).append("\n");
        sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
        sb.append("    affinity: ").append(toIndentedString(affinity)).append("\n");
        sb.append("    dewSecretName: ").append(toIndentedString(dewSecretName)).append("\n");
        sb.append("    dataVolumes: ").append(toIndentedString(dataVolumes)).append("\n");
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
