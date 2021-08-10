package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListNatGatewayDnatRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_rules")

    private List<NatGatewayDnatRuleResponseBody> dnatRules = null;

    public ListNatGatewayDnatRulesResponse withDnatRules(List<NatGatewayDnatRuleResponseBody> dnatRules) {
        this.dnatRules = dnatRules;
        return this;
    }

    public ListNatGatewayDnatRulesResponse addDnatRulesItem(NatGatewayDnatRuleResponseBody dnatRulesItem) {
        if (this.dnatRules == null) {
            this.dnatRules = new ArrayList<>();
        }
        this.dnatRules.add(dnatRulesItem);
        return this;
    }

    public ListNatGatewayDnatRulesResponse withDnatRules(
        Consumer<List<NatGatewayDnatRuleResponseBody>> dnatRulesSetter) {
        if (this.dnatRules == null) {
            this.dnatRules = new ArrayList<>();
        }
        dnatRulesSetter.accept(this.dnatRules);
        return this;
    }

    /** 查询DNAT规则列表的响应体。
     * 
     * @return dnatRules */
    public List<NatGatewayDnatRuleResponseBody> getDnatRules() {
        return dnatRules;
    }

    public void setDnatRules(List<NatGatewayDnatRuleResponseBody> dnatRules) {
        this.dnatRules = dnatRules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNatGatewayDnatRulesResponse listNatGatewayDnatRulesResponse = (ListNatGatewayDnatRulesResponse) o;
        return Objects.equals(this.dnatRules, listNatGatewayDnatRulesResponse.dnatRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnatRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNatGatewayDnatRulesResponse {\n");
        sb.append("    dnatRules: ").append(toIndentedString(dnatRules)).append("\n");
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
