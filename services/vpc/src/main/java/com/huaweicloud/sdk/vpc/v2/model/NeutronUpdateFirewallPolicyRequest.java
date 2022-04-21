package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class NeutronUpdateFirewallPolicyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_policy_id")

    private String firewallPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NeutronUpdateFirewallPolicyRequestBody body;

    public NeutronUpdateFirewallPolicyRequest withFirewallPolicyId(String firewallPolicyId) {
        this.firewallPolicyId = firewallPolicyId;
        return this;
    }

    /**
     * 网络ACL防火墙策略ID
     * @return firewallPolicyId
     */
    public String getFirewallPolicyId() {
        return firewallPolicyId;
    }

    public void setFirewallPolicyId(String firewallPolicyId) {
        this.firewallPolicyId = firewallPolicyId;
    }

    public NeutronUpdateFirewallPolicyRequest withBody(NeutronUpdateFirewallPolicyRequestBody body) {
        this.body = body;
        return this;
    }

    public NeutronUpdateFirewallPolicyRequest withBody(Consumer<NeutronUpdateFirewallPolicyRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new NeutronUpdateFirewallPolicyRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public NeutronUpdateFirewallPolicyRequestBody getBody() {
        return body;
    }

    public void setBody(NeutronUpdateFirewallPolicyRequestBody body) {
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
        NeutronUpdateFirewallPolicyRequest neutronUpdateFirewallPolicyRequest = (NeutronUpdateFirewallPolicyRequest) o;
        return Objects.equals(this.firewallPolicyId, neutronUpdateFirewallPolicyRequest.firewallPolicyId)
            && Objects.equals(this.body, neutronUpdateFirewallPolicyRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallPolicyId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFirewallPolicyRequest {\n");
        sb.append("    firewallPolicyId: ").append(toIndentedString(firewallPolicyId)).append("\n");
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
