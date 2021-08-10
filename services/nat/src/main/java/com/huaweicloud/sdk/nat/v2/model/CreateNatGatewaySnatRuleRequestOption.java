package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 创建SNAT规则的请求体。 */
public class CreateNatGatewaySnatRuleRequestOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule")

    private CreateNatGatewaySnatRuleOption snatRule;

    public CreateNatGatewaySnatRuleRequestOption withSnatRule(CreateNatGatewaySnatRuleOption snatRule) {
        this.snatRule = snatRule;
        return this;
    }

    public CreateNatGatewaySnatRuleRequestOption withSnatRule(Consumer<CreateNatGatewaySnatRuleOption> snatRuleSetter) {
        if (this.snatRule == null) {
            this.snatRule = new CreateNatGatewaySnatRuleOption();
            snatRuleSetter.accept(this.snatRule);
        }

        return this;
    }

    /** Get snatRule
     * 
     * @return snatRule */
    public CreateNatGatewaySnatRuleOption getSnatRule() {
        return snatRule;
    }

    public void setSnatRule(CreateNatGatewaySnatRuleOption snatRule) {
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
        CreateNatGatewaySnatRuleRequestOption createNatGatewaySnatRuleRequestOption =
            (CreateNatGatewaySnatRuleRequestOption) o;
        return Objects.equals(this.snatRule, createNatGatewaySnatRuleRequestOption.snatRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snatRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNatGatewaySnatRuleRequestOption {\n");
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
