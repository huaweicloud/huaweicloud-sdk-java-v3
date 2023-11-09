package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCgwResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_gateway")

    private ResponseCustomerGateway customerGateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header-response-token")

    private String headerResponseToken;

    public CreateCgwResponse withCustomerGateway(ResponseCustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
        return this;
    }

    public CreateCgwResponse withCustomerGateway(Consumer<ResponseCustomerGateway> customerGatewaySetter) {
        if (this.customerGateway == null) {
            this.customerGateway = new ResponseCustomerGateway();
            customerGatewaySetter.accept(this.customerGateway);
        }

        return this;
    }

    /**
     * Get customerGateway
     * @return customerGateway
     */
    public ResponseCustomerGateway getCustomerGateway() {
        return customerGateway;
    }

    public void setCustomerGateway(ResponseCustomerGateway customerGateway) {
        this.customerGateway = customerGateway;
    }

    public CreateCgwResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateCgwResponse withHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
        return this;
    }

    /**
     * Get headerResponseToken
     * @return headerResponseToken
     */
    public String getHeaderResponseToken() {
        return headerResponseToken;
    }

    public void setHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCgwResponse that = (CreateCgwResponse) obj;
        return Objects.equals(this.customerGateway, that.customerGateway)
            && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.headerResponseToken, that.headerResponseToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerGateway, requestId, headerResponseToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCgwResponse {\n");
        sb.append("    customerGateway: ").append(toIndentedString(customerGateway)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    headerResponseToken: ").append(toIndentedString(headerResponseToken)).append("\n");
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
