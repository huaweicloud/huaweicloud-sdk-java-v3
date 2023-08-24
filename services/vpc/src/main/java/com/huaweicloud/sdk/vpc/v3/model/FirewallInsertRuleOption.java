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
public class FirewallInsertRuleOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_rules")

    private List<FirewallInsertRuleItemOption> ingressRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "egress_rules")

    private List<FirewallInsertRuleItemOption> egressRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_after_rule")

    private String insertAfterRule;

    public FirewallInsertRuleOption withIngressRules(List<FirewallInsertRuleItemOption> ingressRules) {
        this.ingressRules = ingressRules;
        return this;
    }

    public FirewallInsertRuleOption addIngressRulesItem(FirewallInsertRuleItemOption ingressRulesItem) {
        if (this.ingressRules == null) {
            this.ingressRules = new ArrayList<>();
        }
        this.ingressRules.add(ingressRulesItem);
        return this;
    }

    public FirewallInsertRuleOption withIngressRules(Consumer<List<FirewallInsertRuleItemOption>> ingressRulesSetter) {
        if (this.ingressRules == null) {
            this.ingressRules = new ArrayList<>();
        }
        ingressRulesSetter.accept(this.ingressRules);
        return this;
    }

    /**
     * 功能说明：ACL添加入方向规则列表
     * @return ingressRules
     */
    public List<FirewallInsertRuleItemOption> getIngressRules() {
        return ingressRules;
    }

    public void setIngressRules(List<FirewallInsertRuleItemOption> ingressRules) {
        this.ingressRules = ingressRules;
    }

    public FirewallInsertRuleOption withEgressRules(List<FirewallInsertRuleItemOption> egressRules) {
        this.egressRules = egressRules;
        return this;
    }

    public FirewallInsertRuleOption addEgressRulesItem(FirewallInsertRuleItemOption egressRulesItem) {
        if (this.egressRules == null) {
            this.egressRules = new ArrayList<>();
        }
        this.egressRules.add(egressRulesItem);
        return this;
    }

    public FirewallInsertRuleOption withEgressRules(Consumer<List<FirewallInsertRuleItemOption>> egressRulesSetter) {
        if (this.egressRules == null) {
            this.egressRules = new ArrayList<>();
        }
        egressRulesSetter.accept(this.egressRules);
        return this;
    }

    /**
     * 功能说明：ACL添加出方向规则列表
     * @return egressRules
     */
    public List<FirewallInsertRuleItemOption> getEgressRules() {
        return egressRules;
    }

    public void setEgressRules(List<FirewallInsertRuleItemOption> egressRules) {
        this.egressRules = egressRules;
    }

    public FirewallInsertRuleOption withInsertAfterRule(String insertAfterRule) {
        this.insertAfterRule = insertAfterRule;
        return this;
    }

    /**
     * 功能说明：插入ACL的规则在入方向或者出方向某条规则位置后，不指定则在入方向或者出方向规则列表最前面插入规则 约束：指定了insert_after_rule，ingress_rules和egress_rules只能同时设置一个，且该规则在入方向或者出方向规则中存在
     * @return insertAfterRule
     */
    public String getInsertAfterRule() {
        return insertAfterRule;
    }

    public void setInsertAfterRule(String insertAfterRule) {
        this.insertAfterRule = insertAfterRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirewallInsertRuleOption that = (FirewallInsertRuleOption) obj;
        return Objects.equals(this.ingressRules, that.ingressRules)
            && Objects.equals(this.egressRules, that.egressRules)
            && Objects.equals(this.insertAfterRule, that.insertAfterRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingressRules, egressRules, insertAfterRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirewallInsertRuleOption {\n");
        sb.append("    ingressRules: ").append(toIndentedString(ingressRules)).append("\n");
        sb.append("    egressRules: ").append(toIndentedString(egressRules)).append("\n");
        sb.append("    insertAfterRule: ").append(toIndentedString(insertAfterRule)).append("\n");
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
