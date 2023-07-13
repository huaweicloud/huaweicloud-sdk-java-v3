package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 强制使用定义的规则调度，且不会影响已经在节点上运行的Pod。即强制选择调度到满足规则的节点，不会调度到不满足规则的节点。
 */
public class RequiredDuringScheduling {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeSelectorTerms")

    private List<MatchExpressions> nodeSelectorTerms = null;

    public RequiredDuringScheduling withNodeSelectorTerms(List<MatchExpressions> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
        return this;
    }

    public RequiredDuringScheduling addNodeSelectorTermsItem(MatchExpressions nodeSelectorTermsItem) {
        if (this.nodeSelectorTerms == null) {
            this.nodeSelectorTerms = new ArrayList<>();
        }
        this.nodeSelectorTerms.add(nodeSelectorTermsItem);
        return this;
    }

    public RequiredDuringScheduling withNodeSelectorTerms(Consumer<List<MatchExpressions>> nodeSelectorTermsSetter) {
        if (this.nodeSelectorTerms == null) {
            this.nodeSelectorTerms = new ArrayList<>();
        }
        nodeSelectorTermsSetter.accept(this.nodeSelectorTerms);
        return this;
    }

    /**
     * 节点选择规则
     * @return nodeSelectorTerms
     */
    public List<MatchExpressions> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(List<MatchExpressions> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RequiredDuringScheduling that = (RequiredDuringScheduling) obj;
        return Objects.equals(this.nodeSelectorTerms, that.nodeSelectorTerms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeSelectorTerms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RequiredDuringScheduling {\n");
        sb.append("    nodeSelectorTerms: ").append(toIndentedString(nodeSelectorTerms)).append("\n");
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
