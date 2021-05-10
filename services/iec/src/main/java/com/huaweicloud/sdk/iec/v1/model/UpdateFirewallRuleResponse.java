package com.huaweicloud.sdk.iec.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iec.v1.model.UpdateFirewallRuleResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateFirewallRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firewall")
    
    private UpdateFirewallRuleResp firewall;

    public UpdateFirewallRuleResponse withFirewall(UpdateFirewallRuleResp firewall) {
        this.firewall = firewall;
        return this;
    }

    public UpdateFirewallRuleResponse withFirewall(Consumer<UpdateFirewallRuleResp> firewallSetter) {
        if(this.firewall == null ){
            this.firewall = new UpdateFirewallRuleResp();
            firewallSetter.accept(this.firewall);
        }
        
        return this;
    }


    /**
     * Get firewall
     * @return firewall
     */
    public UpdateFirewallRuleResp getFirewall() {
        return firewall;
    }

    public void setFirewall(UpdateFirewallRuleResp firewall) {
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
        UpdateFirewallRuleResponse updateFirewallRuleResponse = (UpdateFirewallRuleResponse) o;
        return Objects.equals(this.firewall, updateFirewallRuleResponse.firewall);
    }
    @Override
    public int hashCode() {
        return Objects.hash(firewall);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFirewallRuleResponse {\n");
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

