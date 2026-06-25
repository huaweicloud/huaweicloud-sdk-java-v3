package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池资源规格资源量数据模型。
 */
public class PoolResourceFlavorCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private String flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxCount")

    private Integer maxCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "azs")

    private List<PoolNodeAz> azs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodePool")

    private String nodePool;

    public PoolResourceFlavorCount withFlavor(String flavor) {
        this.flavor = flavor;
        return this;
    }

    /**
     * **参数解释**：资源规格ID。 **取值范围**：不涉及。
     * @return flavor
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public PoolResourceFlavorCount withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**：资源池中资源规格实例数量。 **取值范围**：不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public PoolResourceFlavorCount withMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
        return this;
    }

    /**
     * **参数解释**：资源池中资源规格实例弹性数量。物理池中该值和count相同。 **取值范围**：不涉及。
     * @return maxCount
     */
    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public PoolResourceFlavorCount withAzs(List<PoolNodeAz> azs) {
        this.azs = azs;
        return this;
    }

    public PoolResourceFlavorCount addAzsItem(PoolNodeAz azsItem) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        this.azs.add(azsItem);
        return this;
    }

    public PoolResourceFlavorCount withAzs(Consumer<List<PoolNodeAz>> azsSetter) {
        if (this.azs == null) {
            this.azs = new ArrayList<>();
        }
        azsSetter.accept(this.azs);
        return this;
    }

    /**
     * **参数解释**：资源池中期望创建的资源规格实例的az分布。
     * @return azs
     */
    public List<PoolNodeAz> getAzs() {
        return azs;
    }

    public void setAzs(List<PoolNodeAz> azs) {
        this.azs = azs;
    }

    public PoolResourceFlavorCount withNodePool(String nodePool) {
        this.nodePool = nodePool;
        return this;
    }

    /**
     * **参数解释**：节点池ID。 **取值范围**：不涉及。
     * @return nodePool
     */
    public String getNodePool() {
        return nodePool;
    }

    public void setNodePool(String nodePool) {
        this.nodePool = nodePool;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoolResourceFlavorCount that = (PoolResourceFlavorCount) obj;
        return Objects.equals(this.flavor, that.flavor) && Objects.equals(this.count, that.count)
            && Objects.equals(this.maxCount, that.maxCount) && Objects.equals(this.azs, that.azs)
            && Objects.equals(this.nodePool, that.nodePool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, count, maxCount, azs, nodePool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoolResourceFlavorCount {\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    maxCount: ").append(toIndentedString(maxCount)).append("\n");
        sb.append("    azs: ").append(toIndentedString(azs)).append("\n");
        sb.append("    nodePool: ").append(toIndentedString(nodePool)).append("\n");
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
