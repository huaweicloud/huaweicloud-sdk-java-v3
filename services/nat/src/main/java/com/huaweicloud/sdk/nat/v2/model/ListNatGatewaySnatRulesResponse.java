package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNatGatewaySnatRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rules")

    private List<NatGatewaySnatRuleResponseBody> snatRules = null;

    public ListNatGatewaySnatRulesResponse withSnatRules(List<NatGatewaySnatRuleResponseBody> snatRules) {
        this.snatRules = snatRules;
        return this;
    }

    public ListNatGatewaySnatRulesResponse addSnatRulesItem(NatGatewaySnatRuleResponseBody snatRulesItem) {
        if (this.snatRules == null) {
            this.snatRules = new ArrayList<>();
        }
        this.snatRules.add(snatRulesItem);
        return this;
    }

    public ListNatGatewaySnatRulesResponse withSnatRules(
        Consumer<List<NatGatewaySnatRuleResponseBody>> snatRulesSetter) {
        if (this.snatRules == null) {
            this.snatRules = new ArrayList<>();
        }
        snatRulesSetter.accept(this.snatRules);
        return this;
    }

    /**
     * 查询SNAT规则列表的响应体。
     * @return snatRules
     */
    public List<NatGatewaySnatRuleResponseBody> getSnatRules() {
        return snatRules;
    }

    public void setSnatRules(List<NatGatewaySnatRuleResponseBody> snatRules) {
        this.snatRules = snatRules;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNatGatewaySnatRulesResponse listNatGatewaySnatRulesResponse = (ListNatGatewaySnatRulesResponse) o;
        return Objects.equals(this.snatRules, listNatGatewaySnatRulesResponse.snatRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(snatRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNatGatewaySnatRulesResponse {\n");
        sb.append("    snatRules: ").append(toIndentedString(snatRules)).append("\n");
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
