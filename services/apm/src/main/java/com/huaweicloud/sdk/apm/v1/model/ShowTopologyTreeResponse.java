package com.huaweicloud.sdk.apm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTopologyTreeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topology_tree")

    private TopologyTree topologyTree;

    public ShowTopologyTreeResponse withTopologyTree(TopologyTree topologyTree) {
        this.topologyTree = topologyTree;
        return this;
    }

    public ShowTopologyTreeResponse withTopologyTree(Consumer<TopologyTree> topologyTreeSetter) {
        if (this.topologyTree == null) {
            this.topologyTree = new TopologyTree();
            topologyTreeSetter.accept(this.topologyTree);
        }

        return this;
    }

    /**
     * Get topologyTree
     * @return topologyTree
     */
    public TopologyTree getTopologyTree() {
        return topologyTree;
    }

    public void setTopologyTree(TopologyTree topologyTree) {
        this.topologyTree = topologyTree;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTopologyTreeResponse showTopologyTreeResponse = (ShowTopologyTreeResponse) o;
        return Objects.equals(this.topologyTree, showTopologyTreeResponse.topologyTree);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topologyTree);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTopologyTreeResponse {\n");
        sb.append("    topologyTree: ").append(toIndentedString(topologyTree)).append("\n");
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
