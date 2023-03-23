package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePrivateNatResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway")

    private PrivateNat gateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreatePrivateNatResponse withGateway(PrivateNat gateway) {
        this.gateway = gateway;
        return this;
    }

    public CreatePrivateNatResponse withGateway(Consumer<PrivateNat> gatewaySetter) {
        if (this.gateway == null) {
            this.gateway = new PrivateNat();
            gatewaySetter.accept(this.gateway);
        }

        return this;
    }

    /**
     * Get gateway
     * @return gateway
     */
    public PrivateNat getGateway() {
        return gateway;
    }

    public void setGateway(PrivateNat gateway) {
        this.gateway = gateway;
    }

    public CreatePrivateNatResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePrivateNatResponse createPrivateNatResponse = (CreatePrivateNatResponse) o;
        return Objects.equals(this.gateway, createPrivateNatResponse.gateway)
            && Objects.equals(this.requestId, createPrivateNatResponse.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gateway, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePrivateNatResponse {\n");
        sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
