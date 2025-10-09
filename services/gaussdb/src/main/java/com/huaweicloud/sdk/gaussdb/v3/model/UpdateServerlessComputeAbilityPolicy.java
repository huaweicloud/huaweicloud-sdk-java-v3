package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：  设置serverless算力配置策略请求体。  **约束限制**：  不涉及。
 */
public class UpdateServerlessComputeAbilityPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_vcpus")

    private Integer minVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_vcpus")

    private Integer maxVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_update_nodes_compute_ability")

    private Boolean needUpdateNodesComputeAbility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scale_out_switch")

    private Boolean scaleOutSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_readonly_node_count")

    private Integer maxReadonlyNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_readonly_node_count")

    private Integer minReadonlyNodeCount;

    public UpdateServerlessComputeAbilityPolicy withMinVcpus(Integer minVcpus) {
        this.minVcpus = minVcpus;
        return this;
    }

    /**
     * **参数解释**：  单节点VCPUs伸缩下限。  **约束限制**：  不涉及。  **取值范围**：  取值范围可根据[查询数据库规格](https://support.huaweicloud.com/api-taurusdb/ShowGaussMySqlFlavors.html)接口获取。  **默认取值**：  不涉及。
     * @return minVcpus
     */
    public Integer getMinVcpus() {
        return minVcpus;
    }

    public void setMinVcpus(Integer minVcpus) {
        this.minVcpus = minVcpus;
    }

    public UpdateServerlessComputeAbilityPolicy withMaxVcpus(Integer maxVcpus) {
        this.maxVcpus = maxVcpus;
        return this;
    }

    /**
     * **参数解释**：  单节点VCPUs伸缩上限。  **约束限制**：  不涉及。  **取值范围**：  ≥4。取值范围可根据[查询数据库规格](https://support.huaweicloud.com/api-taurusdb/ShowGaussMySqlFlavors.html)接口获取。  **默认取值**：  不涉及。
     * @return maxVcpus
     */
    public Integer getMaxVcpus() {
        return maxVcpus;
    }

    public void setMaxVcpus(Integer maxVcpus) {
        this.maxVcpus = maxVcpus;
    }

    public UpdateServerlessComputeAbilityPolicy withNeedUpdateNodesComputeAbility(
        Boolean needUpdateNodesComputeAbility) {
        this.needUpdateNodesComputeAbility = needUpdateNodesComputeAbility;
        return this;
    }

    /**
     * **参数解释**：  节点算力同步，修改算力范围的同时，是否将小于最小算力的节点的当前算力同步至最小算力。  **约束限制**：  不涉及。  **取值范围**： - true: 节点算力同步。 - false: 节点算力不同步。  **默认取值**： false。
     * @return needUpdateNodesComputeAbility
     */
    public Boolean getNeedUpdateNodesComputeAbility() {
        return needUpdateNodesComputeAbility;
    }

    public void setNeedUpdateNodesComputeAbility(Boolean needUpdateNodesComputeAbility) {
        this.needUpdateNodesComputeAbility = needUpdateNodesComputeAbility;
    }

    public UpdateServerlessComputeAbilityPolicy withScaleOutSwitch(Boolean scaleOutSwitch) {
        this.scaleOutSwitch = scaleOutSwitch;
        return this;
    }

    /**
     * **参数解释**：  是否增删只读节点。  **约束限制**：  - 存在数据库代理时，才可以使用增删只读节点功能。  - 使用增删节点功能时，避免使用读内网地址连接应用。  - 打开增删只读节点后，数据库代理的路由模式会变为负载均衡模式。  **取值范围**： - true: 开启增删只读节点。 - false: 不开启增删只读节点。  **默认取值**：  false。
     * @return scaleOutSwitch
     */
    public Boolean getScaleOutSwitch() {
        return scaleOutSwitch;
    }

    public void setScaleOutSwitch(Boolean scaleOutSwitch) {
        this.scaleOutSwitch = scaleOutSwitch;
    }

    public UpdateServerlessComputeAbilityPolicy withMaxReadonlyNodeCount(Integer maxReadonlyNodeCount) {
        this.maxReadonlyNodeCount = maxReadonlyNodeCount;
        return this;
    }

    /**
     * **参数解释**：  只读节点数量上限。  **约束限制**：  开启增删只读节点时才会生效, 且开启增删只读节点时该参数必选。  **取值范围**：  2-7。  **默认取值**：  不涉及。
     * @return maxReadonlyNodeCount
     */
    public Integer getMaxReadonlyNodeCount() {
        return maxReadonlyNodeCount;
    }

    public void setMaxReadonlyNodeCount(Integer maxReadonlyNodeCount) {
        this.maxReadonlyNodeCount = maxReadonlyNodeCount;
    }

    public UpdateServerlessComputeAbilityPolicy withMinReadonlyNodeCount(Integer minReadonlyNodeCount) {
        this.minReadonlyNodeCount = minReadonlyNodeCount;
        return this;
    }

    /**
     * **参数解释**：  只读节点数量上限。  **约束限制**：  开启增删只读节点时才会生效, 且开启增删只读节点时该参数必选。  **取值范围**：  1-6。  **默认取值**：  不涉及。
     * @return minReadonlyNodeCount
     */
    public Integer getMinReadonlyNodeCount() {
        return minReadonlyNodeCount;
    }

    public void setMinReadonlyNodeCount(Integer minReadonlyNodeCount) {
        this.minReadonlyNodeCount = minReadonlyNodeCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateServerlessComputeAbilityPolicy that = (UpdateServerlessComputeAbilityPolicy) obj;
        return Objects.equals(this.minVcpus, that.minVcpus) && Objects.equals(this.maxVcpus, that.maxVcpus)
            && Objects.equals(this.needUpdateNodesComputeAbility, that.needUpdateNodesComputeAbility)
            && Objects.equals(this.scaleOutSwitch, that.scaleOutSwitch)
            && Objects.equals(this.maxReadonlyNodeCount, that.maxReadonlyNodeCount)
            && Objects.equals(this.minReadonlyNodeCount, that.minReadonlyNodeCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minVcpus,
            maxVcpus,
            needUpdateNodesComputeAbility,
            scaleOutSwitch,
            maxReadonlyNodeCount,
            minReadonlyNodeCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerlessComputeAbilityPolicy {\n");
        sb.append("    minVcpus: ").append(toIndentedString(minVcpus)).append("\n");
        sb.append("    maxVcpus: ").append(toIndentedString(maxVcpus)).append("\n");
        sb.append("    needUpdateNodesComputeAbility: ")
            .append(toIndentedString(needUpdateNodesComputeAbility))
            .append("\n");
        sb.append("    scaleOutSwitch: ").append(toIndentedString(scaleOutSwitch)).append("\n");
        sb.append("    maxReadonlyNodeCount: ").append(toIndentedString(maxReadonlyNodeCount)).append("\n");
        sb.append("    minReadonlyNodeCount: ").append(toIndentedString(minReadonlyNodeCount)).append("\n");
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
