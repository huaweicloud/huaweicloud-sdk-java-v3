package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateCgwRequestBody
 */
public class UpdateCgwRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_gateway")

    private UpdateCgwRequestBodyContent customerGateway;

    public UpdateCgwRequestBody withCustomerGateway(UpdateCgwRequestBodyContent customerGateway) {
        this.customerGateway = customerGateway;
        return this;
    }

    public UpdateCgwRequestBody withCustomerGateway(Consumer<UpdateCgwRequestBodyContent> customerGatewaySetter) {
        if (this.customerGateway == null) {
            this.customerGateway = new UpdateCgwRequestBodyContent();
            customerGatewaySetter.accept(this.customerGateway);
        }

        return this;
    }

    /**
     * Get customerGateway
     * @return customerGateway
     */
    public UpdateCgwRequestBodyContent getCustomerGateway() {
        return customerGateway;
    }

    public void setCustomerGateway(UpdateCgwRequestBodyContent customerGateway) {
        this.customerGateway = customerGateway;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCgwRequestBody that = (UpdateCgwRequestBody) obj;
        return Objects.equals(this.customerGateway, that.customerGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCgwRequestBody {\n");
        sb.append("    customerGateway: ").append(toIndentedString(customerGateway)).append("\n");
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
