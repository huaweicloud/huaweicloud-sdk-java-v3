package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateReadonlyNodesRequestBody
 */
public class CreateReadonlyNodesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_distribution")

    private List<NodeDistributionOption> nodeDistribution = null;

    public CreateReadonlyNodesRequestBody withNodeDistribution(List<NodeDistributionOption> nodeDistribution) {
        this.nodeDistribution = nodeDistribution;
        return this;
    }

    public CreateReadonlyNodesRequestBody addNodeDistributionItem(NodeDistributionOption nodeDistributionItem) {
        if (this.nodeDistribution == null) {
            this.nodeDistribution = new ArrayList<>();
        }
        this.nodeDistribution.add(nodeDistributionItem);
        return this;
    }

    public CreateReadonlyNodesRequestBody withNodeDistribution(
        Consumer<List<NodeDistributionOption>> nodeDistributionSetter) {
        if (this.nodeDistribution == null) {
            this.nodeDistribution = new ArrayList<>();
        }
        nodeDistributionSetter.accept(this.nodeDistribution);
        return this;
    }

    /**
     * **参数解释**: 新创建只读节点在各可用区的分布情况。 **约束限制**: 不涉及。
     * @return nodeDistribution
     */
    public List<NodeDistributionOption> getNodeDistribution() {
        return nodeDistribution;
    }

    public void setNodeDistribution(List<NodeDistributionOption> nodeDistribution) {
        this.nodeDistribution = nodeDistribution;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateReadonlyNodesRequestBody that = (CreateReadonlyNodesRequestBody) obj;
        return Objects.equals(this.nodeDistribution, that.nodeDistribution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeDistribution);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReadonlyNodesRequestBody {\n");
        sb.append("    nodeDistribution: ").append(toIndentedString(nodeDistribution)).append("\n");
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
