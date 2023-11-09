package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCgwRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_gateway_id")

    private String customerGatewayId;

    public DeleteCgwRequest withCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
        return this;
    }

    /**
     * 对端网关ID
     * @return customerGatewayId
     */
    public String getCustomerGatewayId() {
        return customerGatewayId;
    }

    public void setCustomerGatewayId(String customerGatewayId) {
        this.customerGatewayId = customerGatewayId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCgwRequest that = (DeleteCgwRequest) obj;
        return Objects.equals(this.customerGatewayId, that.customerGatewayId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerGatewayId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCgwRequest {\n");
        sb.append("    customerGatewayId: ").append(toIndentedString(customerGatewayId)).append("\n");
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
