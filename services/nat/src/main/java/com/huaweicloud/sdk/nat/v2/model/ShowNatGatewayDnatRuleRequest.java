package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowNatGatewayDnatRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dnat_rule_id")

    @JacksonXmlProperty(localName = "dnat_rule_id")

    private String dnatRuleId;

    public ShowNatGatewayDnatRuleRequest withDnatRuleId(String dnatRuleId) {
        this.dnatRuleId = dnatRuleId;
        return this;
    }

    /**
     * DNAT规则的ID。
     * @return dnatRuleId
     */
    public String getDnatRuleId() {
        return dnatRuleId;
    }

    public void setDnatRuleId(String dnatRuleId) {
        this.dnatRuleId = dnatRuleId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNatGatewayDnatRuleRequest showNatGatewayDnatRuleRequest = (ShowNatGatewayDnatRuleRequest) o;
        return Objects.equals(this.dnatRuleId, showNatGatewayDnatRuleRequest.dnatRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dnatRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNatGatewayDnatRuleRequest {\n");
        sb.append("    dnatRuleId: ").append(toIndentedString(dnatRuleId)).append("\n");
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
