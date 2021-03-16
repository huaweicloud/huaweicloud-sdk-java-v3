package com.huaweicloud.sdk.vpc.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class NeutronShowFirewallPolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firewall_policy_id")
    
    private String firewallPolicyId;

    public NeutronShowFirewallPolicyRequest withFirewallPolicyId(String firewallPolicyId) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronShowFirewallPolicyRequest neutronShowFirewallPolicyRequest = (NeutronShowFirewallPolicyRequest) o;
        return Objects.equals(this.firewallPolicyId, neutronShowFirewallPolicyRequest.firewallPolicyId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firewallPolicyId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronShowFirewallPolicyRequest {\n");
        sb.append("    firewallPolicyId: ").append(toIndentedString(firewallPolicyId)).append("\n");
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

