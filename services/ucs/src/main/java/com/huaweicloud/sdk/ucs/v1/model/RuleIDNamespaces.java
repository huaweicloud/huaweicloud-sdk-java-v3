package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RuleIDNamespaces
 */
public class RuleIDNamespaces {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleIDs")

    private List<String> ruleIDs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespaces")

    private List<String> namespaces = null;

    public RuleIDNamespaces withRuleIDs(List<String> ruleIDs) {
        this.ruleIDs = ruleIDs;
        return this;
    }

    public RuleIDNamespaces addRuleIDsItem(String ruleIDsItem) {
        if (this.ruleIDs == null) {
            this.ruleIDs = new ArrayList<>();
        }
        this.ruleIDs.add(ruleIDsItem);
        return this;
    }

    public RuleIDNamespaces withRuleIDs(Consumer<List<String>> ruleIDsSetter) {
        if (this.ruleIDs == null) {
            this.ruleIDs = new ArrayList<>();
        }
        ruleIDsSetter.accept(this.ruleIDs);
        return this;
    }

    /**
     * 权限策略id
     * @return ruleIDs
     */
    public List<String> getRuleIDs() {
        return ruleIDs;
    }

    public void setRuleIDs(List<String> ruleIDs) {
        this.ruleIDs = ruleIDs;
    }

    public RuleIDNamespaces withNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    public RuleIDNamespaces addNamespacesItem(String namespacesItem) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        this.namespaces.add(namespacesItem);
        return this;
    }

    public RuleIDNamespaces withNamespaces(Consumer<List<String>> namespacesSetter) {
        if (this.namespaces == null) {
            this.namespaces = new ArrayList<>();
        }
        namespacesSetter.accept(this.namespaces);
        return this;
    }

    /**
     * 权限策略涉及到的命名空间
     * @return namespaces
     */
    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RuleIDNamespaces that = (RuleIDNamespaces) obj;
        return Objects.equals(this.ruleIDs, that.ruleIDs) && Objects.equals(this.namespaces, that.namespaces);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleIDs, namespaces);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleIDNamespaces {\n");
        sb.append("    ruleIDs: ").append(toIndentedString(ruleIDs)).append("\n");
        sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
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
