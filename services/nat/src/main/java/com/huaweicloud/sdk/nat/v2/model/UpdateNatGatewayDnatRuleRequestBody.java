package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新DNAT规则的请求体。
 */
public class UpdateNatGatewayDnatRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_rule")

    private UpdateNatGatewayDnatRuleOption dnatRule;

    public UpdateNatGatewayDnatRuleRequestBody withDnatRule(UpdateNatGatewayDnatRuleOption dnatRule) {
        this.dnatRule = dnatRule;
        return this;
    }

    public UpdateNatGatewayDnatRuleRequestBody withDnatRule(Consumer<UpdateNatGatewayDnatRuleOption> dnatRuleSetter) {
        if (this.dnatRule == null) {
            this.dnatRule = new UpdateNatGatewayDnatRuleOption();
            dnatRuleSetter.accept(this.dnatRule);
        }

        return this;
    }

    /**
     * Get dnatRule
     * @return dnatRule
     */
    public UpdateNatGatewayDnatRuleOption getDnatRule() {
        return dnatRule;
    }

    public void setDnatRule(UpdateNatGatewayDnatRuleOption dnatRule) {
        this.dnatRule = dnatRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNatGatewayDnatRuleRequestBody that = (UpdateNatGatewayDnatRuleRequestBody) obj;
        return Objects.equals(this.dnatRule, that.dnatRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnatRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewayDnatRuleRequestBody {\n");
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
