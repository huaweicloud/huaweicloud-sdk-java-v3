package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.NeutronRemoveFirewallRuleRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NeutronRemoveFirewallRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firewall_policy_id")
    
    private String firewallPolicyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private NeutronRemoveFirewallRuleRequestBody body;

    public NeutronRemoveFirewallRuleRequest withFirewallPolicyId(String firewallPolicyId) {
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

    

    public NeutronRemoveFirewallRuleRequest withBody(NeutronRemoveFirewallRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public NeutronRemoveFirewallRuleRequest withBody(Consumer<NeutronRemoveFirewallRuleRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new NeutronRemoveFirewallRuleRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public NeutronRemoveFirewallRuleRequestBody getBody() {
        return body;
    }

    public void setBody(NeutronRemoveFirewallRuleRequestBody body) {
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
        NeutronRemoveFirewallRuleRequest neutronRemoveFirewallRuleRequest = (NeutronRemoveFirewallRuleRequest) o;
        return Objects.equals(this.firewallPolicyId, neutronRemoveFirewallRuleRequest.firewallPolicyId) &&
            Objects.equals(this.body, neutronRemoveFirewallRuleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firewallPolicyId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronRemoveFirewallRuleRequest {\n");
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

