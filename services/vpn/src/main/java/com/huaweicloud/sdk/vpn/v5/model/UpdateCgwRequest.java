package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateCgwRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_gateway_id")

    private String customerGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateCgwRequestBody body;

    public UpdateCgwRequest withCustomerGatewayId(String customerGatewayId) {
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

    public UpdateCgwRequest withBody(UpdateCgwRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateCgwRequest withBody(Consumer<UpdateCgwRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateCgwRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateCgwRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateCgwRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCgwRequest that = (UpdateCgwRequest) obj;
        return Objects.equals(this.customerGatewayId, that.customerGatewayId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerGatewayId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCgwRequest {\n");
        sb.append("    customerGatewayId: ").append(toIndentedString(customerGatewayId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
