package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class FirewallRemoveRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_rules")

    private List<FirewallRemoveRuleItemOption> ingressRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_rules")

    private List<FirewallRemoveRuleItemOption> egressRules = null;

    public FirewallRemoveRuleOption withIngressRules(List<FirewallRemoveRuleItemOption> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }

    public FirewallRemoveRuleOption addIngressRulesItem(FirewallRemoveRuleItemOption ingressRulesItem) {
        if (this.ingressRules == null) {
            this.ingressRules = new ArrayList<>();
        }
        this.ingressRules.add(ingressRulesItem);
        return this;
    }

    public FirewallRemoveRuleOption withIngressRules(Consumer<List<FirewallRemoveRuleItemOption>> ingressRulesSetter) {
        if (this.ingressRules == null) {
            this.ingressRules = new ArrayList<>();
        }
        ingressRulesSetter.accept(this.ingressRules);
        return this;
    }

    /**
     * 功能说明：ACL删除入方向规则列表 约束：ingress_rules和egress_rules仅能同时设置一个
     * @return ingressRules
     */
    public List<FirewallRemoveRuleItemOption> getIngressRules() {
        return ingressRules;
    }

    public void setIngressRules(List<FirewallRemoveRuleItemOption> ingressRules) {
        this.ingressRules = ingressRules;
    }

    public FirewallRemoveRuleOption withEgressRules(List<FirewallRemoveRuleItemOption> egressRules) {
        this.egressRules = egressRules;
        return this;
    }

    public FirewallRemoveRuleOption addEgressRulesItem(FirewallRemoveRuleItemOption egressRulesItem) {
        if (this.egressRules == null) {
            this.egressRules = new ArrayList<>();
        }
        this.egressRules.add(egressRulesItem);
        return this;
    }

    public FirewallRemoveRuleOption withEgressRules(Consumer<List<FirewallRemoveRuleItemOption>> egressRulesSetter) {
        if (this.egressRules == null) {
            this.egressRules = new ArrayList<>();
        }
        egressRulesSetter.accept(this.egressRules);
        return this;
    }

    /**
     * 功能说明：ACL删除出方向规则列表 约束：ingress_rules和egress_rules仅能同时设置一个
     * @return egressRules
     */
    public List<FirewallRemoveRuleItemOption> getEgressRules() {
        return egressRules;
    }

    public void setEgressRules(List<FirewallRemoveRuleItemOption> egressRules) {
        this.egressRules = egressRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirewallRemoveRuleOption that = (FirewallRemoveRuleOption) obj;
        return Objects.equals(this.ingressRules, that.ingressRules)
            && Objects.equals(this.egressRules, that.egressRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingressRules, egressRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirewallRemoveRuleOption {\n");
        sb.append("    ingressRules: ").append(toIndentedString(ingressRules)).append("\n");
        sb.append("    egressRules: ").append(toIndentedString(egressRules)).append("\n");
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
