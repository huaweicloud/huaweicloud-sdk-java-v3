package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AdvancedIpsRuleListVo
 */
public class AdvancedIpsRuleListVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "advanced_ips_rules")

    private List<AdvancedIpsRuleVo> advancedIpsRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public AdvancedIpsRuleListVo withAdvancedIpsRules(List<AdvancedIpsRuleVo> advancedIpsRules) {
        this.advancedIpsRules = advancedIpsRules;
        return this;
    }

    public AdvancedIpsRuleListVo addAdvancedIpsRulesItem(AdvancedIpsRuleVo advancedIpsRulesItem) {
        if (this.advancedIpsRules == null) {
            this.advancedIpsRules = new ArrayList<>();
        }
        this.advancedIpsRules.add(advancedIpsRulesItem);
        return this;
    }

    public AdvancedIpsRuleListVo withAdvancedIpsRules(Consumer<List<AdvancedIpsRuleVo>> advancedIpsRulesSetter) {
        if (this.advancedIpsRules == null) {
            this.advancedIpsRules = new ArrayList<>();
        }
        advancedIpsRulesSetter.accept(this.advancedIpsRules);
        return this;
    }

    /**
     * 频率ips规则列表
     * @return advancedIpsRules
     */
    public List<AdvancedIpsRuleVo> getAdvancedIpsRules() {
        return advancedIpsRules;
    }

    public void setAdvancedIpsRules(List<AdvancedIpsRuleVo> advancedIpsRules) {
        this.advancedIpsRules = advancedIpsRules;
    }

    public AdvancedIpsRuleListVo withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 频率ips规则总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdvancedIpsRuleListVo that = (AdvancedIpsRuleListVo) obj;
        return Objects.equals(this.advancedIpsRules, that.advancedIpsRules) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(advancedIpsRules, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedIpsRuleListVo {\n");
        sb.append("    advancedIpsRules: ").append(toIndentedString(advancedIpsRules)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
