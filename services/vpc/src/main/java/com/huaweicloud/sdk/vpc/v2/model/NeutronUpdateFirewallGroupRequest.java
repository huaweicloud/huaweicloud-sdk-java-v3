package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class NeutronUpdateFirewallGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firewall_group_id")

    private String firewallGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private NeutronUpdateFirewallGroupRequestBody body;

    public NeutronUpdateFirewallGroupRequest withFirewallGroupId(String firewallGroupId) {
        this.firewallGroupId = firewallGroupId;
        return this;
    }

    /** 网络ACL防火墙组ID
     * 
     * @return firewallGroupId */
    public String getFirewallGroupId() {
        return firewallGroupId;
    }

    public void setFirewallGroupId(String firewallGroupId) {
        this.firewallGroupId = firewallGroupId;
    }

    public NeutronUpdateFirewallGroupRequest withBody(NeutronUpdateFirewallGroupRequestBody body) {
        this.body = body;
        return this;
    }

    public NeutronUpdateFirewallGroupRequest withBody(Consumer<NeutronUpdateFirewallGroupRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new NeutronUpdateFirewallGroupRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public NeutronUpdateFirewallGroupRequestBody getBody() {
        return body;
    }

    public void setBody(NeutronUpdateFirewallGroupRequestBody body) {
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
        NeutronUpdateFirewallGroupRequest neutronUpdateFirewallGroupRequest = (NeutronUpdateFirewallGroupRequest) o;
        return Objects.equals(this.firewallGroupId, neutronUpdateFirewallGroupRequest.firewallGroupId)
            && Objects.equals(this.body, neutronUpdateFirewallGroupRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firewallGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateFirewallGroupRequest {\n");
        sb.append("    firewallGroupId: ").append(toIndentedString(firewallGroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
