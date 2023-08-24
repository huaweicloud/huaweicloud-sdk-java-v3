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
public class FirewallUpdateRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_rules")

    private List<FirewallUpdateRuleItemOption> ingressRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_rules")

    private List<FirewallUpdateRuleItemOption> egressRules = null;

    public FirewallUpdateRuleOption withIngressRules(List<FirewallUpdateRuleItemOption> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }

    public FirewallUpdateRuleOption addIngressRulesItem(FirewallUpdateRuleItemOption ingressRulesItem) {
        if (this.ingressRules == null) {
            this.ingressRules = new ArrayList<>();
        }
        this.ingressRules.add(ingressRulesItem);
        return this;
    }

    public FirewallUpdateRuleOption withIngressRules(Consumer<List<FirewallUpdateRuleItemOption>> ingressRulesSetter) {
        if (this.ingressRules == null) {
            this.ingressRules = new ArrayList<>();
        }
        ingressRulesSetter.accept(this.ingressRules);
        return this;
    }

    /**
     * 功能说明：ACL更新入方向规则列表 约束：ingress_rules和egress_rules仅能同时设置一个，且当前只支持同时更新一条规则
     * @return ingressRules
     */
    public List<FirewallUpdateRuleItemOption> getIngressRules() {
        return ingressRules;
    }

    public void setIngressRules(List<FirewallUpdateRuleItemOption> ingressRules) {
        this.ingressRules = ingressRules;
    }

    public FirewallUpdateRuleOption withEgressRules(List<FirewallUpdateRuleItemOption> egressRules) {
        this.egressRules = egressRules;
        return this;
    }

    public FirewallUpdateRuleOption addEgressRulesItem(FirewallUpdateRuleItemOption egressRulesItem) {
        if (this.egressRules == null) {
            this.egressRules = new ArrayList<>();
        }
        this.egressRules.add(egressRulesItem);
        return this;
    }

    public FirewallUpdateRuleOption withEgressRules(Consumer<List<FirewallUpdateRuleItemOption>> egressRulesSetter) {
        if (this.egressRules == null) {
            this.egressRules = new ArrayList<>();
        }
        egressRulesSetter.accept(this.egressRules);
        return this;
    }

    /**
     * 功能说明：ACL更新出方向规则列表 约束：ingress_rules和egress_rules仅能同时设置一个，且当前只支持同时更新一条规则
     * @return egressRules
     */
    public List<FirewallUpdateRuleItemOption> getEgressRules() {
        return egressRules;
    }

    public void setEgressRules(List<FirewallUpdateRuleItemOption> egressRules) {
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
        FirewallUpdateRuleOption that = (FirewallUpdateRuleOption) obj;
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
        sb.append("class FirewallUpdateRuleOption {\n");
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
