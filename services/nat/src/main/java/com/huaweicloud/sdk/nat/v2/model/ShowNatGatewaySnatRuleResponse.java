package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowNatGatewaySnatRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule")

    private NatGatewaySnatRuleResponseBody snatRule;

    public ShowNatGatewaySnatRuleResponse withSnatRule(NatGatewaySnatRuleResponseBody snatRule) {
        this.snatRule = snatRule;
        return this;
    }

    public ShowNatGatewaySnatRuleResponse withSnatRule(Consumer<NatGatewaySnatRuleResponseBody> snatRuleSetter) {
        if (this.snatRule == null) {
            this.snatRule = new NatGatewaySnatRuleResponseBody();
            snatRuleSetter.accept(this.snatRule);
        }

        return this;
    }

    /** Get snatRule
     * 
     * @return snatRule */
    public NatGatewaySnatRuleResponseBody getSnatRule() {
        return snatRule;
    }

    public void setSnatRule(NatGatewaySnatRuleResponseBody snatRule) {
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
        ShowNatGatewaySnatRuleResponse showNatGatewaySnatRuleResponse = (ShowNatGatewaySnatRuleResponse) o;
        return Objects.equals(this.snatRule, showNatGatewaySnatRuleResponse.snatRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snatRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNatGatewaySnatRuleResponse {\n");
        sb.append("    snatRule: ").append(toIndentedString(snatRule)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
