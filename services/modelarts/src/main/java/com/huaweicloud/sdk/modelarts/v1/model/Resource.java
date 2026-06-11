package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业资源规格信息。flavor_id和pool_id+[flavor_id]方式二选一。
 */
public class Resource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private String policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_name")

    private String flavorName;

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
    @JsonProperty(value = "flavor_detail")

    private FlavorDetail flavorDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_container_allocated_resources")

    private MainContainerAllocatedResources mainContainerAllocatedResources;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_container_customized_flavor")

    private MainContainerCustomizedFlavor mainContainerCustomizedFlavor;

    public Resource withPolicy(String policy) {
        this.policy = policy;
        return this;
    }

    /**
     * **参数解释**：训练作业资源规格模式。 **取值范围**： - regular：标准模式
     * @return policy
     */
    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public Resource withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * **参数解释**：训练作业资源规格id。 **取值范围**：CPU规格专属资源池不支持指定flavor_id。GPU/Ascend规格专属资源池可选取值如下： - modelarts.pool.visual.xlarge（1卡） - modelarts.pool.visual.2xlarge（2卡） - modelarts.pool.visual.4xlarge（4卡） - modelarts.pool.visual.8xlarge（8卡）
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public Resource withFlavorName(String flavorName) {
        this.flavorName = flavorName;
        return this;
    }

    /**
     * **参数解释**：使用flavor_id时，由ModelArts返回的只读规格名称。 **取值范围**：不涉及。
     * @return flavorName
     */
    public String getFlavorName() {
        return flavorName;
    }

    public void setFlavorName(String flavorName) {
        this.flavorName = flavorName;
    }

    public Resource withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * **参数解释**：训练作业选择的资源副本数。 **取值范围**：不涉及。
     * minimum: 1
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public Resource withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释**：训练作业选择的资源池ID。 **取值范围**：不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public Resource withPoolGroupId(String poolGroupId) {
        this.poolGroupId = poolGroupId;
        return this;
    }

    /**
     * **参数解释**：训练作业选择的资源池联邦ID。 **取值范围**：不涉及。
     * @return poolGroupId
     */
    public String getPoolGroupId() {
        return poolGroupId;
    }

    public void setPoolGroupId(String poolGroupId) {
        this.poolGroupId = poolGroupId;
    }

    public Resource withFlavorDetail(FlavorDetail flavorDetail) {
        this.flavorDetail = flavorDetail;
        return this;
    }

    public Resource withFlavorDetail(Consumer<FlavorDetail> flavorDetailSetter) {
        if (this.flavorDetail == null) {
            this.flavorDetail = new FlavorDetail();
            flavorDetailSetter.accept(this.flavorDetail);
        }

        return this;
    }

    /**
     * Get flavorDetail
     * @return flavorDetail
     */
    public FlavorDetail getFlavorDetail() {
        return flavorDetail;
    }

    public void setFlavorDetail(FlavorDetail flavorDetail) {
        this.flavorDetail = flavorDetail;
    }

    public Resource withMainContainerAllocatedResources(
        MainContainerAllocatedResources mainContainerAllocatedResources) {
        this.mainContainerAllocatedResources = mainContainerAllocatedResources;
        return this;
    }

    public Resource withMainContainerAllocatedResources(
        Consumer<MainContainerAllocatedResources> mainContainerAllocatedResourcesSetter) {
        if (this.mainContainerAllocatedResources == null) {
            this.mainContainerAllocatedResources = new MainContainerAllocatedResources();
            mainContainerAllocatedResourcesSetter.accept(this.mainContainerAllocatedResources);
        }

        return this;
    }

    /**
     * Get mainContainerAllocatedResources
     * @return mainContainerAllocatedResources
     */
    public MainContainerAllocatedResources getMainContainerAllocatedResources() {
        return mainContainerAllocatedResources;
    }

    public void setMainContainerAllocatedResources(MainContainerAllocatedResources mainContainerAllocatedResources) {
        this.mainContainerAllocatedResources = mainContainerAllocatedResources;
    }

    public Resource withMainContainerCustomizedFlavor(MainContainerCustomizedFlavor mainContainerCustomizedFlavor) {
        this.mainContainerCustomizedFlavor = mainContainerCustomizedFlavor;
        return this;
    }

    public Resource withMainContainerCustomizedFlavor(
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
        Resource that = (Resource) obj;
        return Objects.equals(this.policy, that.policy) && Objects.equals(this.flavorId, that.flavorId)
            && Objects.equals(this.flavorName, that.flavorName) && Objects.equals(this.nodeCount, that.nodeCount)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.poolGroupId, that.poolGroupId)
            && Objects.equals(this.flavorDetail, that.flavorDetail)
            && Objects.equals(this.mainContainerAllocatedResources, that.mainContainerAllocatedResources)
            && Objects.equals(this.mainContainerCustomizedFlavor, that.mainContainerCustomizedFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy,
            flavorId,
            flavorName,
            nodeCount,
            poolId,
            poolGroupId,
            flavorDetail,
            mainContainerAllocatedResources,
            mainContainerCustomizedFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Resource {\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    flavorName: ").append(toIndentedString(flavorName)).append("\n");
        sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    poolGroupId: ").append(toIndentedString(poolGroupId)).append("\n");
        sb.append("    flavorDetail: ").append(toIndentedString(flavorDetail)).append("\n");
        sb.append("    mainContainerAllocatedResources: ")
            .append(toIndentedString(mainContainerAllocatedResources))
            .append("\n");
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
