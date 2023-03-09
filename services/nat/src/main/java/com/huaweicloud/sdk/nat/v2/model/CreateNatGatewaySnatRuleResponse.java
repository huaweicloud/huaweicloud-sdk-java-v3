package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateNatGatewaySnatRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule")

    private CreateNatGatewaySnatRuleResponseBody snatRule;

    public CreateNatGatewaySnatRuleResponse withSnatRule(CreateNatGatewaySnatRuleResponseBody snatRule) {
        this.snatRule = snatRule;
        return this;
    }

    public CreateNatGatewaySnatRuleResponse withSnatRule(
        Consumer<CreateNatGatewaySnatRuleResponseBody> snatRuleSetter) {
        if (this.snatRule == null) {
            this.snatRule = new CreateNatGatewaySnatRuleResponseBody();
            snatRuleSetter.accept(this.snatRule);
        }

        return this;
    }

    /**
     * Get snatRule
     * @return snatRule
     */
    public CreateNatGatewaySnatRuleResponseBody getSnatRule() {
        return snatRule;
    }

    public void setSnatRule(CreateNatGatewaySnatRuleResponseBody snatRule) {
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
        CreateNatGatewaySnatRuleResponse createNatGatewaySnatRuleResponse = (CreateNatGatewaySnatRuleResponse) o;
        return Objects.equals(this.snatRule, createNatGatewaySnatRuleResponse.snatRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snatRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNatGatewaySnatRuleResponse {\n");
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
