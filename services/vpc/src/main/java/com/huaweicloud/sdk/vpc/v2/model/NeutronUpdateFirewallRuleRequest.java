package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class NeutronUpdateFirewallRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_rule_id")

    @JacksonXmlProperty(localName = "firewall_rule_id")

    private String firewallRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private NeutronUpdateFirewallRuleRequestBody body;

    public NeutronUpdateFirewallRuleRequest withFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
        return this;
    }

    /**
     * 网络ACL防火墙规则ID
     * @return firewallRuleId
     */
    public String getFirewallRuleId() {
        return firewallRuleId;
    }

    public void setFirewallRuleId(String firewallRuleId) {
        this.firewallRuleId = firewallRuleId;
    }

    public NeutronUpdateFirewallRuleRequest withBody(NeutronUpdateFirewallRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public NeutronUpdateFirewallRuleRequest withBody(Consumer<NeutronUpdateFirewallRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new NeutronUpdateFirewallRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public NeutronUpdateFirewallRuleRequestBody getBody() {
        return body;
    }

    public void setBody(NeutronUpdateFirewallRuleRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronUpdateFirewallRuleRequest neutronUpdateFirewallRuleRequest = (NeutronUpdateFirewallRuleRequest) o;
        return Objects.equals(this.firewallRuleId, neutronUpdateFirewallRuleRequest.firewallRuleId)
            && Objects.equals(this.body, neutronUpdateFirewallRuleRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallRuleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFirewallRuleRequest {\n");
        sb.append("    firewallRuleId: ").append(toIndentedString(firewallRuleId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
