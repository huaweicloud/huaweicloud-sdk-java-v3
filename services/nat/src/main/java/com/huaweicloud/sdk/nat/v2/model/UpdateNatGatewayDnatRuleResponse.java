package com.huaweicloud.sdk.nat.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nat.v2.model.NatGatewayDnatRuleResponseBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateNatGatewayDnatRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dnat_rule")
    
    private NatGatewayDnatRuleResponseBody dnatRule = null;

    public UpdateNatGatewayDnatRuleResponse withDnatRule(NatGatewayDnatRuleResponseBody dnatRule) {
        this.dnatRule = dnatRule;
        return this;
    }

    public UpdateNatGatewayDnatRuleResponse withDnatRule(Consumer<NatGatewayDnatRuleResponseBody> dnatRuleSetter) {
        if(this.dnatRule == null ){
            this.dnatRule = new NatGatewayDnatRuleResponseBody();
            dnatRuleSetter.accept(this.dnatRule);
        }
        
        return this;
    }


    /**
     * Get dnatRule
     * @return dnatRule
     */
    public NatGatewayDnatRuleResponseBody getDnatRule() {
        return dnatRule;
    }

    public void setDnatRule(NatGatewayDnatRuleResponseBody dnatRule) {
        this.dnatRule = dnatRule;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNatGatewayDnatRuleResponse updateNatGatewayDnatRuleResponse = (UpdateNatGatewayDnatRuleResponse) o;
        return Objects.equals(this.dnatRule, updateNatGatewayDnatRuleResponse.dnatRule);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dnatRule);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewayDnatRuleResponse {\n");
        sb.append("    dnatRule: ").append(toIndentedString(dnatRule)).append("\n");
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

