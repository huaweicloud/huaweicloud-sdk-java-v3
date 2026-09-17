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
 * **参数解释：** 集群升级动作定义，包含目标版本、升级策略、插件配置等。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isOnlyUpgrade")

    private Boolean isOnlyUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agencyName")

    private String agencyName;

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
     * **参数解释：** 插件配置列表，CCE会在集群升级过程中按照配置对插件进行升级 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
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
     * **参数解释：** 节点池内节点升级顺序配置。key表示节点池ID，默认节点池取值为\"DefaultPool\" **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
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
     * **参数解释：** 节点池升级顺序配置，key/value对格式。key表示节点池ID，默认节点池取值为\"DefaultPool\"，value表示对应节点池的优先级，默认值为0，优先级最低，数值越大优先级越高 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
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
     * **参数解释：** 升级的目标集群版本，例如\"v1.23\" **约束限制：** 只能升级到高版本，不允许填写等于或低于当前集群版本的值 **取值范围：** CCE支持的集群版本 **默认取值：** 不涉及
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public ClusterUpgradeAction withIsOnlyUpgrade(Boolean isOnlyUpgrade) {
        this.isOnlyUpgrade = isOnlyUpgrade;
        return this;
    }

    /**
     * **参数解释：** 是否在集群升级流程中跳过升级前检查。 **约束限制：** 不涉及 **取值范围：** - false：表示在集群升级流程中会执行升级前检查。 - true：表示在集群升级流程中跳过升级前检查。  **默认取值：** false
     * @return isOnlyUpgrade
     */
    public Boolean getIsOnlyUpgrade() {
        return isOnlyUpgrade;
    }

    public void setIsOnlyUpgrade(Boolean isOnlyUpgrade) {
        this.isOnlyUpgrade = isOnlyUpgrade;
    }

    public ClusterUpgradeAction withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释：** 指定集群使用的委托。该委托用于生成集群中组件使用的临时访问凭证，在集群中自动创建其他相关云服务的资源时会使用该委托权限。 当不传时，集群将优先继承原有配置，若原先未配置，则自动选择使用CCE的默认委托CCEAutoClusterAgency；当传空时，自动选择使用CCE的默认委托CCEAutoClusterAgency。  [ > 关于CCE系统委托的说明详情参见[系统委托说明](https://support.huaweicloud.com/usermanual-cce/cce_10_0556.html)](tag:hws) [ > 关于CCE系统委托的说明详情参见[系统委托说明](https://support.huaweicloud.com/intl/zh-cn/usermanual-cce/cce_10_0556.html)](tag:hws_hk)  **约束限制：** 仅v1.28.15-r90、v1.29.15-r50、v1.30.14-r50、v1.31.14-r10、v1.32.9-r10、v1.33.7-r10、v1.34.3-r0及以上版本集群支持该参数 **取值范围：** 不涉及 **默认取值：** 空
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
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
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.isOnlyUpgrade, that.isOnlyUpgrade)
            && Objects.equals(this.agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addons, nodeOrder, nodePoolOrder, strategy, targetVersion, isOnlyUpgrade, agencyName);
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
        sb.append("    isOnlyUpgrade: ").append(toIndentedString(isOnlyUpgrade)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
