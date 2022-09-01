package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchCreateNatGatewayDnatRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_rules")

    @JacksonXmlProperty(localName = "dnat_rules")

    private List<NatGatewayDnatRuleResponseBody> dnatRules = null;

    public BatchCreateNatGatewayDnatRulesResponse withDnatRules(List<NatGatewayDnatRuleResponseBody> dnatRules) {
        this.dnatRules = dnatRules;
        return this;
    }

    public BatchCreateNatGatewayDnatRulesResponse addDnatRulesItem(NatGatewayDnatRuleResponseBody dnatRulesItem) {
        if (this.dnatRules == null) {
            this.dnatRules = new ArrayList<>();
        }
        this.dnatRules.add(dnatRulesItem);
        return this;
    }

    public BatchCreateNatGatewayDnatRulesResponse withDnatRules(
        Consumer<List<NatGatewayDnatRuleResponseBody>> dnatRulesSetter) {
        if (this.dnatRules == null) {
            this.dnatRules = new ArrayList<>();
        }
        dnatRulesSetter.accept(this.dnatRules);
        return this;
    }

    /**
     * DNAT规则批量创建对象的响应体。
     * @return dnatRules
     */
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
        BatchCreateNatGatewayDnatRulesResponse batchCreateNatGatewayDnatRulesResponse =
            (BatchCreateNatGatewayDnatRulesResponse) o;
        return Objects.equals(this.dnatRules, batchCreateNatGatewayDnatRulesResponse.dnatRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnatRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateNatGatewayDnatRulesResponse {\n");
        sb.append("    dnatRules: ").append(toIndentedString(dnatRules)).append("\n");
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
