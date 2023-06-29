package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网络ACL策略。
 */
public class FirewallPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rules")

    private List<FirewallRule> firewallRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_after")

    private String insertAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_before")

    private String insertBefore;

    public FirewallPolicy withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 网络ACL策略ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FirewallPolicy withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网络ACL策略名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirewallPolicy withFirewallRules(List<FirewallRule> firewallRules) {
        this.firewallRules = firewallRules;
        return this;
    }

    public FirewallPolicy addFirewallRulesItem(FirewallRule firewallRulesItem) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        this.firewallRules.add(firewallRulesItem);
        return this;
    }

    public FirewallPolicy withFirewallRules(Consumer<List<FirewallRule>> firewallRulesSetter) {
        if (this.firewallRules == null) {
            this.firewallRules = new ArrayList<>();
        }
        firewallRulesSetter.accept(this.firewallRules);
        return this;
    }

    /**
     * 网络ACL规则列表对象。
     * @return firewallRules
     */
    public List<FirewallRule> getFirewallRules() {
        return firewallRules;
    }

    public void setFirewallRules(List<FirewallRule> firewallRules) {
        this.firewallRules = firewallRules;
    }

    public FirewallPolicy withInsertAfter(String insertAfter) {
        this.insertAfter = insertAfter;
        return this;
    }

    /**
     * ACL规则ID，表示在此ACL规则之后添加ACL规则
     * @return insertAfter
     */
    public String getInsertAfter() {
        return insertAfter;
    }

    public void setInsertAfter(String insertAfter) {
        this.insertAfter = insertAfter;
    }

    public FirewallPolicy withInsertBefore(String insertBefore) {
        this.insertBefore = insertBefore;
        return this;
    }

    /**
     * ACL规则ID，表示在此ACL规则之前添加ACL规则
     * @return insertBefore
     */
    public String getInsertBefore() {
        return insertBefore;
    }

    public void setInsertBefore(String insertBefore) {
        this.insertBefore = insertBefore;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FirewallPolicy that = (FirewallPolicy) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.firewallRules, that.firewallRules)
            && Objects.equals(this.insertAfter, that.insertAfter)
            && Objects.equals(this.insertBefore, that.insertBefore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, firewallRules, insertAfter, insertBefore);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FirewallPolicy {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    firewallRules: ").append(toIndentedString(firewallRules)).append("\n");
        sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
        sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
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
