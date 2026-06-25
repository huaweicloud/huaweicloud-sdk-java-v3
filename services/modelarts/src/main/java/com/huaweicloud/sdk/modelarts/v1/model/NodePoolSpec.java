package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点池创建请求体。
 */
public class NodePoolSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private PoolResource resources;

    public NodePoolSpec withResources(PoolResource resources) {
        this.resources = resources;
        return this;
    }

    public NodePoolSpec withResources(Consumer<PoolResource> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new PoolResource();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public PoolResource getResources() {
        return resources;
    }

    public void setResources(PoolResource resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePoolSpec that = (NodePoolSpec) obj;
        return Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolSpec {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
