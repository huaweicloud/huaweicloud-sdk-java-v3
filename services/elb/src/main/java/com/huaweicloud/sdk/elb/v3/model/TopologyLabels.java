package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TopologyLabels
 */
public class TopologyLabels {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policies")

    private List<PolicyLabel> l7policies = null;

    public TopologyLabels withL7policies(List<PolicyLabel> l7policies) {
        this.l7policies = l7policies;
        return this;
    }

    public TopologyLabels addL7policiesItem(PolicyLabel l7policiesItem) {
        if (this.l7policies == null) {
            this.l7policies = new ArrayList<>();
        }
        this.l7policies.add(l7policiesItem);
        return this;
    }

    public TopologyLabels withL7policies(Consumer<List<PolicyLabel>> l7policiesSetter) {
        if (this.l7policies == null) {
            this.l7policies = new ArrayList<>();
        }
        l7policiesSetter.accept(this.l7policies);
        return this;
    }

    /**
     * **参数解释**：转发策略信息。
     * @return l7policies
     */
    public List<PolicyLabel> getL7policies() {
        return l7policies;
    }

    public void setL7policies(List<PolicyLabel> l7policies) {
        this.l7policies = l7policies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopologyLabels that = (TopologyLabels) obj;
        return Objects.equals(this.l7policies, that.l7policies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopologyLabels {\n");
        sb.append("    l7policies: ").append(toIndentedString(l7policies)).append("\n");
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
