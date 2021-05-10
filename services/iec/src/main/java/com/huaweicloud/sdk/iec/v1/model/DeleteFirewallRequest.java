package com.huaweicloud.sdk.iec.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteFirewallRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firewall_id")
    
    private String firewallId;

    public DeleteFirewallRequest withFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }

    


    /**
     * Get firewallId
     * @return firewallId
     */
    public String getFirewallId() {
        return firewallId;
    }

    public void setFirewallId(String firewallId) {
        this.firewallId = firewallId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteFirewallRequest deleteFirewallRequest = (DeleteFirewallRequest) o;
        return Objects.equals(this.firewallId, deleteFirewallRequest.firewallId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firewallId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteFirewallRequest {\n");
        sb.append("    firewallId: ").append(toIndentedString(firewallId)).append("\n");
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

