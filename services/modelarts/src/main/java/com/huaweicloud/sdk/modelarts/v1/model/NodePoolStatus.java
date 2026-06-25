package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点池状态信息。
 */
public class NodePoolStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private NodePoolStatusResources resources;

    public NodePoolStatus withResources(NodePoolStatusResources resources) {
        this.resources = resources;
        return this;
    }

    public NodePoolStatus withResources(Consumer<NodePoolStatusResources> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new NodePoolStatusResources();
            resourcesSetter.accept(this.resources);
        }

        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    public NodePoolStatusResources getResources() {
        return resources;
    }

    public void setResources(NodePoolStatusResources resources) {
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
        NodePoolStatus that = (NodePoolStatus) obj;
        return Objects.equals(this.resources, that.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolStatus {\n");
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
