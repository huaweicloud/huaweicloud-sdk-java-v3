package com.huaweicloud.sdk.nat.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewaySnatRuleOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 更新SNAT规则的请求体。
 */
public class UpdateNatGatewaySnatRuleRequestOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snat_rule")
    
    private UpdateNatGatewaySnatRuleOption snatRule = null;

    public UpdateNatGatewaySnatRuleRequestOption withSnatRule(UpdateNatGatewaySnatRuleOption snatRule) {
        this.snatRule = snatRule;
        return this;
    }

    public UpdateNatGatewaySnatRuleRequestOption withSnatRule(Consumer<UpdateNatGatewaySnatRuleOption> snatRuleSetter) {
        if(this.snatRule == null ){
            this.snatRule = new UpdateNatGatewaySnatRuleOption();
            snatRuleSetter.accept(this.snatRule);
        }
        
        return this;
    }


    /**
     * Get snatRule
     * @return snatRule
     */
    public UpdateNatGatewaySnatRuleOption getSnatRule() {
        return snatRule;
    }

    public void setSnatRule(UpdateNatGatewaySnatRuleOption snatRule) {
        this.snatRule = snatRule;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateNatGatewaySnatRuleRequestOption updateNatGatewaySnatRuleRequestOption = (UpdateNatGatewaySnatRuleRequestOption) o;
        return Objects.equals(this.snatRule, updateNatGatewaySnatRuleRequestOption.snatRule);
    }
    @Override
    public int hashCode() {
        return Objects.hash(snatRule);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewaySnatRuleRequestOption {\n");
        sb.append("    snatRule: ").append(toIndentedString(snatRule)).append("\n");
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

