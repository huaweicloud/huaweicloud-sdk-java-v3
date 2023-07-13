package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ClusterUpgradeAction
 */
public class ClusterUpgradeAction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addons")

    private List<UpgradeAddonConfig> addons = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeOrder")

    private Map<String, List<NodePriority>> nodeOrder = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodePoolOrder")

    private Map<String, Integer> nodePoolOrder = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private UpgradeStrategy strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersion")

    private String targetVersion;

    public ClusterUpgradeAction withAddons(List<UpgradeAddonConfig> addons) {
        this.addons = addons;
        return this;
    }

    public ClusterUpgradeAction addAddonsItem(UpgradeAddonConfig addonsItem) {
        if (this.addons == null) {
            this.addons = new ArrayList<>();
        }
        this.addons.add(addonsItem);
        return this;
    }

    public ClusterUpgradeAction withAddons(Consumer<List<UpgradeAddonConfig>> addonsSetter) {
        if (this.addons == null) {
            this.addons = new ArrayList<>();
        }
        addonsSetter.accept(this.addons);
        return this;
    }

    /**
     * 插件配置列表
     * @return addons
     */
    public List<UpgradeAddonConfig> getAddons() {
        return addons;
    }

    public void setAddons(List<UpgradeAddonConfig> addons) {
        this.addons = addons;
    }

    public ClusterUpgradeAction withNodeOrder(Map<String, List<NodePriority>> nodeOrder) {
        this.nodeOrder = nodeOrder;
        return this;
    }

    public ClusterUpgradeAction putNodeOrderItem(String key, List<NodePriority> nodeOrderItem) {
        if (this.nodeOrder == null) {
            this.nodeOrder = new HashMap<>();
        }
        this.nodeOrder.put(key, nodeOrderItem);
        return this;
    }

    public ClusterUpgradeAction withNodeOrder(Consumer<Map<String, List<NodePriority>>> nodeOrderSetter) {
        if (this.nodeOrder == null) {
            this.nodeOrder = new HashMap<>();
        }
        nodeOrderSetter.accept(this.nodeOrder);
        return this;
    }

    /**
     * 节点池内节点升级顺序配置。 > key表示节点池ID，默认节点池取值为\"DefaultPool\" 
     * @return nodeOrder
     */
    public Map<String, List<NodePriority>> getNodeOrder() {
        return nodeOrder;
    }

    public void setNodeOrder(Map<String, List<NodePriority>> nodeOrder) {
        this.nodeOrder = nodeOrder;
    }

    public ClusterUpgradeAction withNodePoolOrder(Map<String, Integer> nodePoolOrder) {
        this.nodePoolOrder = nodePoolOrder;
        return this;
    }

    public ClusterUpgradeAction putNodePoolOrderItem(String key, Integer nodePoolOrderItem) {
        if (this.nodePoolOrder == null) {
            this.nodePoolOrder = new HashMap<>();
        }
        this.nodePoolOrder.put(key, nodePoolOrderItem);
        return this;
    }

    public ClusterUpgradeAction withNodePoolOrder(Consumer<Map<String, Integer>> nodePoolOrderSetter) {
        if (this.nodePoolOrder == null) {
            this.nodePoolOrder = new HashMap<>();
        }
        nodePoolOrderSetter.accept(this.nodePoolOrder);
        return this;
    }

    /**
     * 节点池升级顺序配置，key/value对格式。 > key表示节点池ID，默认节点池取值为\"DefaultPool\" > value表示对应节点池的优先级，默认值为0，优先级最低，数值越大优先级越高 
     * @return nodePoolOrder
     */
    public Map<String, Integer> getNodePoolOrder() {
        return nodePoolOrder;
    }

    public void setNodePoolOrder(Map<String, Integer> nodePoolOrder) {
        this.nodePoolOrder = nodePoolOrder;
    }

    public ClusterUpgradeAction withStrategy(UpgradeStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public ClusterUpgradeAction withStrategy(Consumer<UpgradeStrategy> strategySetter) {
        if (this.strategy == null) {
            this.strategy = new UpgradeStrategy();
            strategySetter.accept(this.strategy);
        }

        return this;
    }

    /**
     * Get strategy
     * @return strategy
     */
    public UpgradeStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(UpgradeStrategy strategy) {
        this.strategy = strategy;
    }

    public ClusterUpgradeAction withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 目标集群版本，例如\"v1.23\"
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterUpgradeAction that = (ClusterUpgradeAction) obj;
        return Objects.equals(this.addons, that.addons) && Objects.equals(this.nodeOrder, that.nodeOrder)
            && Objects.equals(this.nodePoolOrder, that.nodePoolOrder) && Objects.equals(this.strategy, that.strategy)
            && Objects.equals(this.targetVersion, that.targetVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addons, nodeOrder, nodePoolOrder, strategy, targetVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterUpgradeAction {\n");
        sb.append("    addons: ").append(toIndentedString(addons)).append("\n");
        sb.append("    nodeOrder: ").append(toIndentedString(nodeOrder)).append("\n");
        sb.append("    nodePoolOrder: ").append(toIndentedString(nodePoolOrder)).append("\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
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
