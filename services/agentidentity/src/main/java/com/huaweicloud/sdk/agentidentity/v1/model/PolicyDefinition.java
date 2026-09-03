package com.huaweicloud.sdk.agentidentity.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Represents the definition structure for policies. This structure encapsulates different policy formats and languages that can be used to define access control rules. This is a UNION, so only one of the following members can be specified when used or returned.
 */
public class PolicyDefinition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cedar")

    private CedarPolicy cedar;

    public PolicyDefinition withCedar(CedarPolicy cedar) {
        this.cedar = cedar;
        return this;
    }

    public PolicyDefinition withCedar(Consumer<CedarPolicy> cedarSetter) {
        if (this.cedar == null) {
            this.cedar = new CedarPolicy();
            cedarSetter.accept(this.cedar);
        }

        return this;
    }

    /**
     * Get cedar
     * @return cedar
     */
    public CedarPolicy getCedar() {
        return cedar;
    }

    public void setCedar(CedarPolicy cedar) {
        this.cedar = cedar;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PolicyDefinition that = (PolicyDefinition) obj;
        return Objects.equals(this.cedar, that.cedar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cedar);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyDefinition {\n");
        sb.append("    cedar: ").append(toIndentedString(cedar)).append("\n");
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
