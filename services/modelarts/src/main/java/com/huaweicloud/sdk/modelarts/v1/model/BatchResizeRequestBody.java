package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchResizeRequestBody
 */
public class BatchResizeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<ResizeNodeInfo> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private NodeResizeParams source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private NodeResizeParams target;

    public BatchResizeRequestBody withNodes(List<ResizeNodeInfo> nodes) {
        this.nodes = nodes;
        return this;
    }

    public BatchResizeRequestBody addNodesItem(ResizeNodeInfo nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public BatchResizeRequestBody withNodes(Consumer<List<ResizeNodeInfo>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**：扩缩容的超节点批次信息。 **约束限制**：单次最多50个超节点。
     * @return nodes
     */
    public List<ResizeNodeInfo> getNodes() {
        return nodes;
    }

    public void setNodes(List<ResizeNodeInfo> nodes) {
        this.nodes = nodes;
    }

    public BatchResizeRequestBody withSource(NodeResizeParams source) {
        this.source = source;
        return this;
    }

    public BatchResizeRequestBody withSource(Consumer<NodeResizeParams> sourceSetter) {
        if (this.source == null) {
            this.source = new NodeResizeParams();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public NodeResizeParams getSource() {
        return source;
    }

    public void setSource(NodeResizeParams source) {
        this.source = source;
    }

    public BatchResizeRequestBody withTarget(NodeResizeParams target) {
        this.target = target;
        return this;
    }

    public BatchResizeRequestBody withTarget(Consumer<NodeResizeParams> targetSetter) {
        if (this.target == null) {
            this.target = new NodeResizeParams();
            targetSetter.accept(this.target);
        }

        return this;
    }

    /**
     * Get target
     * @return target
     */
    public NodeResizeParams getTarget() {
        return target;
    }

    public void setTarget(NodeResizeParams target) {
        this.target = target;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchResizeRequestBody that = (BatchResizeRequestBody) obj;
        return Objects.equals(this.nodes, that.nodes) && Objects.equals(this.source, that.source)
            && Objects.equals(this.target, that.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, source, target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchResizeRequestBody {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
