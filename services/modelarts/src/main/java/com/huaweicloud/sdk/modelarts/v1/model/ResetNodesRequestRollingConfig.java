package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：节点重置是滚动配置。 **约束限制**：不涉及。
 */
public class ResetNodesRequestRollingConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy")

    private String strategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maxUnavailable")

    private Integer maxUnavailable;

    public ResetNodesRequestRollingConfig withStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }

    /**
     * **参数解释**：滚动策略。 **约束限制**：不涉及。 **取值范围**：可选值如下： - RollingByNumber：表示按节点数量设置最大同时重置节点数量，例如10，表示单次最多重置10个节点 - RollingByPercent：表示按百分比设置最大同时重置节点数量。例如10，表示单次最多重置10%的节点 **默认取值**：不涉及。
     * @return strategy
     */
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public ResetNodesRequestRollingConfig withMaxUnavailable(Integer maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
        return this;
    }

    /**
     * **参数解释**：滚动重置的节点数量或者节点比例, 当strategy为RollingByNumber时,表示允许同时重置的节点数量, 当strategy为RollingByPercent时,表示允许同时重置的最大节点比例。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return maxUnavailable
     */
    public Integer getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(Integer maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResetNodesRequestRollingConfig that = (ResetNodesRequestRollingConfig) obj;
        return Objects.equals(this.strategy, that.strategy) && Objects.equals(this.maxUnavailable, that.maxUnavailable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategy, maxUnavailable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetNodesRequestRollingConfig {\n");
        sb.append("    strategy: ").append(toIndentedString(strategy)).append("\n");
        sb.append("    maxUnavailable: ").append(toIndentedString(maxUnavailable)).append("\n");
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
