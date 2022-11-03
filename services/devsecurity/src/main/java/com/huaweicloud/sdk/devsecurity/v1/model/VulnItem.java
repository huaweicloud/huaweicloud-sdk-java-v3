package com.huaweicloud.sdk.devsecurity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VulnItem
 */
public class VulnItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk_level")

    private String riskLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vuln_rules")

    private List<VulnRule> vulnRules = null;

    public VulnItem withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 漏洞项描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public VulnItem withRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
        return this;
    }

    /**
     * 风险等级
     * @return riskLevel
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public VulnItem withVulnRules(List<VulnRule> vulnRules) {
        this.vulnRules = vulnRules;
        return this;
    }

    public VulnItem addVulnRulesItem(VulnRule vulnRulesItem) {
        if (this.vulnRules == null) {
            this.vulnRules = new ArrayList<>();
        }
        this.vulnRules.add(vulnRulesItem);
        return this;
    }

    public VulnItem withVulnRules(Consumer<List<VulnRule>> vulnRulesSetter) {
        if (this.vulnRules == null) {
            this.vulnRules = new ArrayList<>();
        }
        vulnRulesSetter.accept(this.vulnRules);
        return this;
    }

    /**
     * 漏洞问题列表
     * @return vulnRules
     */
    public List<VulnRule> getVulnRules() {
        return vulnRules;
    }

    public void setVulnRules(List<VulnRule> vulnRules) {
        this.vulnRules = vulnRules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VulnItem vulnItem = (VulnItem) o;
        return Objects.equals(this.desc, vulnItem.desc) && Objects.equals(this.riskLevel, vulnItem.riskLevel)
            && Objects.equals(this.vulnRules, vulnItem.vulnRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desc, riskLevel, vulnRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulnItem {\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
        sb.append("    vulnRules: ").append(toIndentedString(vulnRules)).append("\n");
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
