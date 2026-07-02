package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：  设置动态Serverless算力策略请求体。  **约束限制**：  不涉及。
 */
public class UpdateDynamicServerlessPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_vcpus")

    private String minVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_vcpus")

    private String maxVcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_update_nodes_compute_ability")

    private Boolean needUpdateNodesComputeAbility;

    public UpdateDynamicServerlessPolicyRequestBody withMinVcpus(String minVcpus) {
        this.minVcpus = minVcpus;
        return this;
    }

    /**
     * **参数解释**：   最小动态Serverless算力。  **取值范围**：  取值范围可根据[查询动态Serverless算力策略](https://support.huaweicloud.com/api-taurusdb/ShowDynamicServerlessPolicy.html)接口获取，并且小于等于max_vcpus。
     * @return minVcpus
     */
    public String getMinVcpus() {
        return minVcpus;
    }

    public void setMinVcpus(String minVcpus) {
        this.minVcpus = minVcpus;
    }

    public UpdateDynamicServerlessPolicyRequestBody withMaxVcpus(String maxVcpus) {
        this.maxVcpus = maxVcpus;
        return this;
    }

    /**
     * **参数解释**：   最大动态Serverless算力。  **取值范围**：  取值范围可根据[查询动态Serverless算力策略](https://support.huaweicloud.com/api-taurusdb/ShowDynamicServerlessPolicy.html)接口获取，并且大于等于min_vcpus。
     * @return maxVcpus
     */
    public String getMaxVcpus() {
        return maxVcpus;
    }

    public void setMaxVcpus(String maxVcpus) {
        this.maxVcpus = maxVcpus;
    }

    public UpdateDynamicServerlessPolicyRequestBody withNeedUpdateNodesComputeAbility(
        Boolean needUpdateNodesComputeAbility) {
        this.needUpdateNodesComputeAbility = needUpdateNodesComputeAbility;
        return this;
    }

    /**
     * **参数解释**：  节点算力同步，修改算力范围的同时，是否将小于最小算力的节点的当前算力同步至最小算力。  **约束限制**：  不涉及。  **取值范围**： - true: 节点算力同步。 - false: 节点算力不同步。  **默认取值**：  false。
     * @return needUpdateNodesComputeAbility
     */
    public Boolean getNeedUpdateNodesComputeAbility() {
        return needUpdateNodesComputeAbility;
    }

    public void setNeedUpdateNodesComputeAbility(Boolean needUpdateNodesComputeAbility) {
        this.needUpdateNodesComputeAbility = needUpdateNodesComputeAbility;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDynamicServerlessPolicyRequestBody that = (UpdateDynamicServerlessPolicyRequestBody) obj;
        return Objects.equals(this.minVcpus, that.minVcpus) && Objects.equals(this.maxVcpus, that.maxVcpus)
            && Objects.equals(this.needUpdateNodesComputeAbility, that.needUpdateNodesComputeAbility);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minVcpus, maxVcpus, needUpdateNodesComputeAbility);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDynamicServerlessPolicyRequestBody {\n");
        sb.append("    minVcpus: ").append(toIndentedString(minVcpus)).append("\n");
        sb.append("    maxVcpus: ").append(toIndentedString(maxVcpus)).append("\n");
        sb.append("    needUpdateNodesComputeAbility: ")
            .append(toIndentedString(needUpdateNodesComputeAbility))
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
