package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业资源规格信息。flavor_id和pool_id+[flavor_id]方式二选一。 - 选择公共资源池时，仅上送flavor_id，选择训练作业需要的卡数、内存等资源规格，当公共资源池空闲资源满足选择的规格需求时，作业可被调度； - 选择专属资源池时，需上送pool_id与flavor_id，选择专属资源池下可选的实际规格，即满足训练作业条件的最小卡数，以便节省专属资源，提高利用率。
 */
public class SpecResource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_count")

    private Integer nodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_group_id")

    private String poolGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_container_customized_flavor")

    private MainContainerCustomizedFlavor mainContainerCustomizedFlavor;

    public SpecResource withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * **参数解释**：训练作业资源规格id。 **约束限制**：不涉及。 **取值范围**：CPU规格专属资源池不支持指定flavor_id。GPU/Ascend规格专属资源池可选取值如下： - modelarts.pool.visual.xlarge（1卡） - modelarts.pool.visual.2xlarge（2卡） - modelarts.pool.visual.4xlarge（4卡） - modelarts.pool.visual.8xlarge（8卡） - modelarts.pool.visual.16xlarge（16卡，当前仅限Snt9b23超节点资源池）  **默认取值**：不涉及。
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public SpecResource withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * **参数解释**：资源池创建训练作业使用节点数。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：默认单节点。
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public SpecResource withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释**：专属资源池id。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public SpecResource withPoolGroupId(String poolGroupId) {
        this.poolGroupId = poolGroupId;
        return this;
    }

    /**
     * **参数解释**：资源池联邦id。 **约束限制**：当kind为federated_pool_job时，该字段必填。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return poolGroupId
     */
    public String getPoolGroupId() {
        return poolGroupId;
    }

    public void setPoolGroupId(String poolGroupId) {
        this.poolGroupId = poolGroupId;
    }

    public SpecResource withMainContainerCustomizedFlavor(MainContainerCustomizedFlavor mainContainerCustomizedFlavor) {
        this.mainContainerCustomizedFlavor = mainContainerCustomizedFlavor;
        return this;
    }

    public SpecResource withMainContainerCustomizedFlavor(
        Consumer<MainContainerCustomizedFlavor> mainContainerCustomizedFlavorSetter) {
        if (this.mainContainerCustomizedFlavor == null) {
            this.mainContainerCustomizedFlavor = new MainContainerCustomizedFlavor();
            mainContainerCustomizedFlavorSetter.accept(this.mainContainerCustomizedFlavor);
        }

        return this;
    }

    /**
     * Get mainContainerCustomizedFlavor
     * @return mainContainerCustomizedFlavor
     */
    public MainContainerCustomizedFlavor getMainContainerCustomizedFlavor() {
        return mainContainerCustomizedFlavor;
    }

    public void setMainContainerCustomizedFlavor(MainContainerCustomizedFlavor mainContainerCustomizedFlavor) {
        this.mainContainerCustomizedFlavor = mainContainerCustomizedFlavor;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpecResource that = (SpecResource) obj;
        return Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.nodeCount, that.nodeCount)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.poolGroupId, that.poolGroupId)
            && Objects.equals(this.mainContainerCustomizedFlavor, that.mainContainerCustomizedFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavorId, nodeCount, poolId, poolGroupId, mainContainerCustomizedFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecResource {\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    poolGroupId: ").append(toIndentedString(poolGroupId)).append("\n");
        sb.append("    mainContainerCustomizedFlavor: ")
            .append(toIndentedString(mainContainerCustomizedFlavor))
            .append("\n");
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
