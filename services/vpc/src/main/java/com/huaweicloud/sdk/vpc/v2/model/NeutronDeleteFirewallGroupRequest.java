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
public class NeutronDeleteFirewallGroupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firewall_group_id")
    
    private String firewallGroupId;

    public NeutronDeleteFirewallGroupRequest withFirewallGroupId(String firewallGroupId) {
        this.firewallGroupId = firewallGroupId;
        return this;
    }

    


    /**
     * Get firewallGroupId
     * @return firewallGroupId
     */
    public String getFirewallGroupId() {
        return firewallGroupId;
    }

    public void setFirewallGroupId(String firewallGroupId) {
        this.firewallGroupId = firewallGroupId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NeutronDeleteFirewallGroupRequest neutronDeleteFirewallGroupRequest = (NeutronDeleteFirewallGroupRequest) o;
        return Objects.equals(this.firewallGroupId, neutronDeleteFirewallGroupRequest.firewallGroupId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firewallGroupId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronDeleteFirewallGroupRequest {\n");
        sb.append("    firewallGroupId: ").append(toIndentedString(firewallGroupId)).append("\n");
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

