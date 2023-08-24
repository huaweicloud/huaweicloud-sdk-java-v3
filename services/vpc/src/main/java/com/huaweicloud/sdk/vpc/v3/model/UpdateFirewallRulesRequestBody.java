package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class UpdateFirewallRulesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall")

    private FirewallUpdateRuleOption firewall;

    public UpdateFirewallRulesRequestBody withFirewall(FirewallUpdateRuleOption firewall) {
        this.firewall = firewall;
        return this;
    }

    public UpdateFirewallRulesRequestBody withFirewall(Consumer<FirewallUpdateRuleOption> firewallSetter) {
        if (this.firewall == null) {
            this.firewall = new FirewallUpdateRuleOption();
            firewallSetter.accept(this.firewall);
        }

        return this;
    }

    /**
     * Get firewall
     * @return firewall
     */
    public FirewallUpdateRuleOption getFirewall() {
        return firewall;
    }

    public void setFirewall(FirewallUpdateRuleOption firewall) {
        this.firewall = firewall;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateFirewallRulesRequestBody that = (UpdateFirewallRulesRequestBody) obj;
        return Objects.equals(this.firewall, that.firewall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFirewallRulesRequestBody {\n");
        sb.append("    firewall: ").append(toIndentedString(firewall)).append("\n");
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
