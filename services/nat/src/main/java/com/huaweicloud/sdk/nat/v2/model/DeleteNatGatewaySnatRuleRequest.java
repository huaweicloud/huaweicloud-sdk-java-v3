package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteNatGatewaySnatRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateway_id")

    private String natGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "snat_rule_id")

    private String snatRuleId;

    public DeleteNatGatewaySnatRuleRequest withNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }

    /**
     * 公网NAT网关实例的ID。
     * @return natGatewayId
     */
    public String getNatGatewayId() {
        return natGatewayId;
    }

    public void setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
    }

    public DeleteNatGatewaySnatRuleRequest withSnatRuleId(String snatRuleId) {
        this.snatRuleId = snatRuleId;
        return this;
    }

    /**
     * SNAT规则的ID。
     * @return snatRuleId
     */
    public String getSnatRuleId() {
        return snatRuleId;
    }

    public void setSnatRuleId(String snatRuleId) {
        this.snatRuleId = snatRuleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNatGatewaySnatRuleRequest that = (DeleteNatGatewaySnatRuleRequest) obj;
        return Objects.equals(this.natGatewayId, that.natGatewayId) && Objects.equals(this.snatRuleId, that.snatRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natGatewayId, snatRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNatGatewaySnatRuleRequest {\n");
        sb.append("    natGatewayId: ").append(toIndentedString(natGatewayId)).append("\n");
        sb.append("    snatRuleId: ").append(toIndentedString(snatRuleId)).append("\n");
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
