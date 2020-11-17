package com.huaweicloud.sdk.vpc.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.NeutronFirewallGroup;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class NeutronCreateFirewallGroupResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firewall_group")
    
    private NeutronFirewallGroup firewallGroup = null;

    public NeutronCreateFirewallGroupResponse withFirewallGroup(NeutronFirewallGroup firewallGroup) {
        this.firewallGroup = firewallGroup;
        return this;
    }

    public NeutronCreateFirewallGroupResponse withFirewallGroup(Consumer<NeutronFirewallGroup> firewallGroupSetter) {
        if(this.firewallGroup == null ){
            this.firewallGroup = new NeutronFirewallGroup();
            firewallGroupSetter.accept(this.firewallGroup);
        }
        
        return this;
    }


    /**
     * Get firewallGroup
     * @return firewallGroup
     */
    public NeutronFirewallGroup getFirewallGroup() {
        return firewallGroup;
    }

    public void setFirewallGroup(NeutronFirewallGroup firewallGroup) {
        this.firewallGroup = firewallGroup;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronCreateFirewallGroupResponse neutronCreateFirewallGroupResponse = (NeutronCreateFirewallGroupResponse) o;
        return Objects.equals(this.firewallGroup, neutronCreateFirewallGroupResponse.firewallGroup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firewallGroup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateFirewallGroupResponse {\n");
        sb.append("    firewallGroup: ").append(toIndentedString(firewallGroup)).append("\n");
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

