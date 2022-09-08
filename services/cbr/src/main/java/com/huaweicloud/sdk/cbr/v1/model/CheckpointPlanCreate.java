package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CheckpointPlanCreate
 */
public class CheckpointPlanCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<CheckpointResourceResp> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skipped_resources")

    private List<CheckpointCreateSkippedResource> skippedResources = null;

    public CheckpointPlanCreate withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 存储库id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CheckpointPlanCreate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 存储库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckpointPlanCreate withResources(List<CheckpointResourceResp> resources) {
        this.resources = resources;
        return this;
    }

    public CheckpointPlanCreate addResourcesItem(CheckpointResourceResp resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public CheckpointPlanCreate withResources(Consumer<List<CheckpointResourceResp>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /**
     * 备份对象
     * @return resources
     */
    public List<CheckpointResourceResp> getResources() {
        return resources;
    }

    public void setResources(List<CheckpointResourceResp> resources) {
        this.resources = resources;
    }

    public CheckpointPlanCreate withSkippedResources(List<CheckpointCreateSkippedResource> skippedResources) {
        this.skippedResources = skippedResources;
        return this;
    }

    public CheckpointPlanCreate addSkippedResourcesItem(CheckpointCreateSkippedResource skippedResourcesItem) {
        if (this.skippedResources == null) {
            this.skippedResources = new ArrayList<>();
        }
        this.skippedResources.add(skippedResourcesItem);
        return this;
    }

    public CheckpointPlanCreate withSkippedResources(
        Consumer<List<CheckpointCreateSkippedResource>> skippedResourcesSetter) {
        if (this.skippedResources == null) {
            this.skippedResources = new ArrayList<>();
        }
        skippedResourcesSetter.accept(this.skippedResources);
        return this;
    }

    /**
     * 备份时跳过的资源列表
     * @return skippedResources
     */
    public List<CheckpointCreateSkippedResource> getSkippedResources() {
        return skippedResources;
    }

    public void setSkippedResources(List<CheckpointCreateSkippedResource> skippedResources) {
        this.skippedResources = skippedResources;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckpointPlanCreate checkpointPlanCreate = (CheckpointPlanCreate) o;
        return Objects.equals(this.id, checkpointPlanCreate.id) && Objects.equals(this.name, checkpointPlanCreate.name)
            && Objects.equals(this.resources, checkpointPlanCreate.resources)
            && Objects.equals(this.skippedResources, checkpointPlanCreate.skippedResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, resources, skippedResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckpointPlanCreate {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    skippedResources: ").append(toIndentedString(skippedResources)).append("\n");
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
