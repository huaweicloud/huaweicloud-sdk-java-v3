package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.NeutronInsertFirewallRuleRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NeutronAddFirewallRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firewall_policy_id")
    
    private String firewallPolicyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private NeutronInsertFirewallRuleRequestBody body = null;

    public NeutronAddFirewallRuleRequest withFirewallPolicyId(String firewallPolicyId) {
        this.firewallPolicyId = firewallPolicyId;
        return this;
    }

    


    /**
     * Get firewallPolicyId
     * @return firewallPolicyId
     */
    public String getFirewallPolicyId() {
        return firewallPolicyId;
    }

    public void setFirewallPolicyId(String firewallPolicyId) {
        this.firewallPolicyId = firewallPolicyId;
    }

    public NeutronAddFirewallRuleRequest withBody(NeutronInsertFirewallRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public NeutronAddFirewallRuleRequest withBody(Consumer<NeutronInsertFirewallRuleRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new NeutronInsertFirewallRuleRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public NeutronInsertFirewallRuleRequestBody getBody() {
        return body;
    }

    public void setBody(NeutronInsertFirewallRuleRequestBody body) {
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
        NeutronAddFirewallRuleRequest neutronAddFirewallRuleRequest = (NeutronAddFirewallRuleRequest) o;
        return Objects.equals(this.firewallPolicyId, neutronAddFirewallRuleRequest.firewallPolicyId) &&
            Objects.equals(this.body, neutronAddFirewallRuleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firewallPolicyId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronAddFirewallRuleRequest {\n");
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

