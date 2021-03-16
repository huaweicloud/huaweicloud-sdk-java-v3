package com.huaweicloud.sdk.nat.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayDnatOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建DNAT规则的请求体。
 */
public class CreateNatGatewayDnatRuleOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dnat_rule")
    
    private CreateNatGatewayDnatOption dnatRule;

    public CreateNatGatewayDnatRuleOption withDnatRule(CreateNatGatewayDnatOption dnatRule) {
        this.dnatRule = dnatRule;
        return this;
    }

    public CreateNatGatewayDnatRuleOption withDnatRule(Consumer<CreateNatGatewayDnatOption> dnatRuleSetter) {
        if(this.dnatRule == null ){
            this.dnatRule = new CreateNatGatewayDnatOption();
            dnatRuleSetter.accept(this.dnatRule);
        }
        
        return this;
    }


    /**
     * Get dnatRule
     * @return dnatRule
     */
    public CreateNatGatewayDnatOption getDnatRule() {
        return dnatRule;
    }

    public void setDnatRule(CreateNatGatewayDnatOption dnatRule) {
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
        CreateNatGatewayDnatRuleOption createNatGatewayDnatRuleOption = (CreateNatGatewayDnatRuleOption) o;
        return Objects.equals(this.dnatRule, createNatGatewayDnatRuleOption.dnatRule);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dnatRule);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNatGatewayDnatRuleOption {\n");
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

