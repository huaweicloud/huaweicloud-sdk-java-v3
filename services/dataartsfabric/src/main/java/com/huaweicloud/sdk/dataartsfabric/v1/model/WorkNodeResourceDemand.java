package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ray集群工作节点资源需求量
 */
public class WorkNodeResourceDemand {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource")

    private ResourceDemand resource;

    public WorkNodeResourceDemand withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源配置名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkNodeResourceDemand withResource(ResourceDemand resource) {
        this.resource = resource;
        return this;
    }

    public WorkNodeResourceDemand withResource(Consumer<ResourceDemand> resourceSetter) {
        if (this.resource == null) {
            this.resource = new ResourceDemand();
            resourceSetter.accept(this.resource);
        }

        return this;
    }

    /**
     * Get resource
     * @return resource
     */
    public ResourceDemand getResource() {
        return resource;
    }

    public void setResource(ResourceDemand resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkNodeResourceDemand that = (WorkNodeResourceDemand) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.resource, that.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, resource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkNodeResourceDemand {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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
