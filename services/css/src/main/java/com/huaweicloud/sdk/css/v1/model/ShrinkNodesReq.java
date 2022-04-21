package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShrinkNodesReq
 */
public class ShrinkNodesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shrinkNodes")

    private List<String> shrinkNodes = null;

    public ShrinkNodesReq withShrinkNodes(List<String> shrinkNodes) {
        this.shrinkNodes = shrinkNodes;
        return this;
    }

    public ShrinkNodesReq addShrinkNodesItem(String shrinkNodesItem) {
        if (this.shrinkNodes == null) {
            this.shrinkNodes = new ArrayList<>();
        }
        this.shrinkNodes.add(shrinkNodesItem);
        return this;
    }

    public ShrinkNodesReq withShrinkNodes(Consumer<List<String>> shrinkNodesSetter) {
        if (this.shrinkNodes == null) {
            this.shrinkNodes = new ArrayList<>();
        }
        shrinkNodesSetter.accept(this.shrinkNodes);
        return this;
    }

    /**
     * 需要下线的节点ID。
     * @return shrinkNodes
     */
    public List<String> getShrinkNodes() {
        return shrinkNodes;
    }

    public void setShrinkNodes(List<String> shrinkNodes) {
        this.shrinkNodes = shrinkNodes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShrinkNodesReq shrinkNodesReq = (ShrinkNodesReq) o;
        return Objects.equals(this.shrinkNodes, shrinkNodesReq.shrinkNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shrinkNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShrinkNodesReq {\n");
        sb.append("    shrinkNodes: ").append(toIndentedString(shrinkNodes)).append("\n");
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
