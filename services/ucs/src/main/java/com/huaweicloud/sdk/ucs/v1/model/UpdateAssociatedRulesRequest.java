package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateAssociatedRulesRequest
 */
public class UpdateAssociatedRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleIDNamespaces")

    private List<RuleIDNamespaces> ruleIDNamespaces = null;

    public UpdateAssociatedRulesRequest withRuleIDNamespaces(List<RuleIDNamespaces> ruleIDNamespaces) {
        this.ruleIDNamespaces = ruleIDNamespaces;
        return this;
    }

    public UpdateAssociatedRulesRequest addRuleIDNamespacesItem(RuleIDNamespaces ruleIDNamespacesItem) {
        if (this.ruleIDNamespaces == null) {
            this.ruleIDNamespaces = new ArrayList<>();
        }
        this.ruleIDNamespaces.add(ruleIDNamespacesItem);
        return this;
    }

    public UpdateAssociatedRulesRequest withRuleIDNamespaces(Consumer<List<RuleIDNamespaces>> ruleIDNamespacesSetter) {
        if (this.ruleIDNamespaces == null) {
            this.ruleIDNamespaces = new ArrayList<>();
        }
        ruleIDNamespacesSetter.accept(this.ruleIDNamespaces);
        return this;
    }

    /**
     * 权限策略id以及涉及到的命名空间
     * @return ruleIDNamespaces
     */
    public List<RuleIDNamespaces> getRuleIDNamespaces() {
        return ruleIDNamespaces;
    }

    public void setRuleIDNamespaces(List<RuleIDNamespaces> ruleIDNamespaces) {
        this.ruleIDNamespaces = ruleIDNamespaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAssociatedRulesRequest that = (UpdateAssociatedRulesRequest) obj;
        return Objects.equals(this.ruleIDNamespaces, that.ruleIDNamespaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleIDNamespaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAssociatedRulesRequest {\n");
        sb.append("    ruleIDNamespaces: ").append(toIndentedString(ruleIDNamespaces)).append("\n");
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
