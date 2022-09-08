package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新防火墙规则请求体
 */
public class UpdateFirewallRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall")

    private UpdateFirewallRuleOption firewall;

    public UpdateFirewallRuleRequestBody withFirewall(UpdateFirewallRuleOption firewall) {
        this.firewall = firewall;
        return this;
    }

    public UpdateFirewallRuleRequestBody withFirewall(Consumer<UpdateFirewallRuleOption> firewallSetter) {
        if (this.firewall == null) {
            this.firewall = new UpdateFirewallRuleOption();
            firewallSetter.accept(this.firewall);
        }

        return this;
    }

    /**
     * Get firewall
     * @return firewall
     */
    public UpdateFirewallRuleOption getFirewall() {
        return firewall;
    }

    public void setFirewall(UpdateFirewallRuleOption firewall) {
        this.firewall = firewall;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFirewallRuleRequestBody updateFirewallRuleRequestBody = (UpdateFirewallRuleRequestBody) o;
        return Objects.equals(this.firewall, updateFirewallRuleRequestBody.firewall);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewall);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFirewallRuleRequestBody {\n");
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
