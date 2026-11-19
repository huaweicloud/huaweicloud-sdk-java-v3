package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AI Defender智能体防护信息（type&#x3D;source时返回）
 */
public class AiOverviewSourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_agents")

    private Integer totalAgents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_agents")

    private Integer protectedAgents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unprotected_agents")

    private Integer unprotectedAgents;

    public AiOverviewSourceInfo withTotalAgents(Integer totalAgents) {
        this.totalAgents = totalAgents;
        return this;
    }

    /**
     * **参数解释**： 智能体总数 **取值范围**： 最小值0，最大值2000000 
     * minimum: 0
     * @return totalAgents
     */
    public Integer getTotalAgents() {
        return totalAgents;
    }

    public void setTotalAgents(Integer totalAgents) {
        this.totalAgents = totalAgents;
    }

    public AiOverviewSourceInfo withProtectedAgents(Integer protectedAgents) {
        this.protectedAgents = protectedAgents;
        return this;
    }

    /**
     * **参数解释**： 已防护智能体数量 **取值范围**： 最小值0，最大值2000000 
     * minimum: 0
     * @return protectedAgents
     */
    public Integer getProtectedAgents() {
        return protectedAgents;
    }

    public void setProtectedAgents(Integer protectedAgents) {
        this.protectedAgents = protectedAgents;
    }

    public AiOverviewSourceInfo withUnprotectedAgents(Integer unprotectedAgents) {
        this.unprotectedAgents = unprotectedAgents;
        return this;
    }

    /**
     * **参数解释**： 未防护智能体数量 **取值范围**： 最小值0，最大值2000000 
     * minimum: 0
     * @return unprotectedAgents
     */
    public Integer getUnprotectedAgents() {
        return unprotectedAgents;
    }

    public void setUnprotectedAgents(Integer unprotectedAgents) {
        this.unprotectedAgents = unprotectedAgents;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AiOverviewSourceInfo that = (AiOverviewSourceInfo) obj;
        return Objects.equals(this.totalAgents, that.totalAgents)
            && Objects.equals(this.protectedAgents, that.protectedAgents)
            && Objects.equals(this.unprotectedAgents, that.unprotectedAgents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalAgents, protectedAgents, unprotectedAgents);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AiOverviewSourceInfo {\n");
        sb.append("    totalAgents: ").append(toIndentedString(totalAgents)).append("\n");
        sb.append("    protectedAgents: ").append(toIndentedString(protectedAgents)).append("\n");
        sb.append("    unprotectedAgents: ").append(toIndentedString(unprotectedAgents)).append("\n");
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
