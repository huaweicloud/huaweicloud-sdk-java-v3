package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建ray集群的资源配置
 */
public class RayResourceInput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "head_node_resource")

    private HeadNodeResourceDemand headNodeResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_node_resources")

    private List<WorkNodeResourceDemand> workNodeResources = null;

    public RayResourceInput withHeadNodeResource(HeadNodeResourceDemand headNodeResource) {
        this.headNodeResource = headNodeResource;
        return this;
    }

    public RayResourceInput withHeadNodeResource(Consumer<HeadNodeResourceDemand> headNodeResourceSetter) {
        if (this.headNodeResource == null) {
            this.headNodeResource = new HeadNodeResourceDemand();
            headNodeResourceSetter.accept(this.headNodeResource);
        }

        return this;
    }

    /**
     * Get headNodeResource
     * @return headNodeResource
     */
    public HeadNodeResourceDemand getHeadNodeResource() {
        return headNodeResource;
    }

    public void setHeadNodeResource(HeadNodeResourceDemand headNodeResource) {
        this.headNodeResource = headNodeResource;
    }

    public RayResourceInput withWorkNodeResources(List<WorkNodeResourceDemand> workNodeResources) {
        this.workNodeResources = workNodeResources;
        return this;
    }

    public RayResourceInput addWorkNodeResourcesItem(WorkNodeResourceDemand workNodeResourcesItem) {
        if (this.workNodeResources == null) {
            this.workNodeResources = new ArrayList<>();
        }
        this.workNodeResources.add(workNodeResourcesItem);
        return this;
    }

    public RayResourceInput withWorkNodeResources(Consumer<List<WorkNodeResourceDemand>> workNodeResourcesSetter) {
        if (this.workNodeResources == null) {
            this.workNodeResources = new ArrayList<>();
        }
        workNodeResourcesSetter.accept(this.workNodeResources);
        return this;
    }

    /**
     * 工作节点资源配置
     * @return workNodeResources
     */
    public List<WorkNodeResourceDemand> getWorkNodeResources() {
        return workNodeResources;
    }

    public void setWorkNodeResources(List<WorkNodeResourceDemand> workNodeResources) {
        this.workNodeResources = workNodeResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RayResourceInput that = (RayResourceInput) obj;
        return Objects.equals(this.headNodeResource, that.headNodeResource)
            && Objects.equals(this.workNodeResources, that.workNodeResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(headNodeResource, workNodeResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RayResourceInput {\n");
        sb.append("    headNodeResource: ").append(toIndentedString(headNodeResource)).append("\n");
        sb.append("    workNodeResources: ").append(toIndentedString(workNodeResources)).append("\n");
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
