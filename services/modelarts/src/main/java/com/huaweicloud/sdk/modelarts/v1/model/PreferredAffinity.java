package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PreferredAffinity
 */
public class PreferredAffinity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_affinity")

    private List<PreferredSchedulingTerm> nodeAffinity = null;

    public PreferredAffinity withNodeAffinity(List<PreferredSchedulingTerm> nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
        return this;
    }

    public PreferredAffinity addNodeAffinityItem(PreferredSchedulingTerm nodeAffinityItem) {
        if (this.nodeAffinity == null) {
            this.nodeAffinity = new ArrayList<>();
        }
        this.nodeAffinity.add(nodeAffinityItem);
        return this;
    }

    public PreferredAffinity withNodeAffinity(Consumer<List<PreferredSchedulingTerm>> nodeAffinitySetter) {
        if (this.nodeAffinity == null) {
            this.nodeAffinity = new ArrayList<>();
        }
        nodeAffinitySetter.accept(this.nodeAffinity);
        return this;
    }

    /**
     * **参数解释**：调度器会优先将Pod调度到满足该字段指定的亲和性表达式的节点上，但它也可能选择违反一个或多个表达式的节点。最优先选择的节点是权重总和最大的节点，即对于每个满足所有调度要求（资源请求、调度期间必需的亲和性表达式等）的节点，通过遍历该字段的元素并计算总和，如果节点匹配相应的匹配表达式，则将“权重”加到总和中；权重总和最高的节点即为最优先选择的节点。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return nodeAffinity
     */
    public List<PreferredSchedulingTerm> getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(List<PreferredSchedulingTerm> nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreferredAffinity that = (PreferredAffinity) obj;
        return Objects.equals(this.nodeAffinity, that.nodeAffinity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeAffinity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreferredAffinity {\n");
        sb.append("    nodeAffinity: ").append(toIndentedString(nodeAffinity)).append("\n");
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
