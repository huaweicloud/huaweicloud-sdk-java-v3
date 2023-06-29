package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateVirtualGatewayResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_gateway")

    private VirtualGateway virtualGateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateVirtualGatewayResponse withVirtualGateway(VirtualGateway virtualGateway) {
        this.virtualGateway = virtualGateway;
        return this;
    }

    public CreateVirtualGatewayResponse withVirtualGateway(Consumer<VirtualGateway> virtualGatewaySetter) {
        if (this.virtualGateway == null) {
            this.virtualGateway = new VirtualGateway();
            virtualGatewaySetter.accept(this.virtualGateway);
        }

        return this;
    }

    /**
     * Get virtualGateway
     * @return virtualGateway
     */
    public VirtualGateway getVirtualGateway() {
        return virtualGateway;
    }

    public void setVirtualGateway(VirtualGateway virtualGateway) {
        this.virtualGateway = virtualGateway;
    }

    public CreateVirtualGatewayResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 操作请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVirtualGatewayResponse that = (CreateVirtualGatewayResponse) obj;
        return Objects.equals(this.virtualGateway, that.virtualGateway)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualGateway, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVirtualGatewayResponse {\n");
        sb.append("    virtualGateway: ").append(toIndentedString(virtualGateway)).append("\n");
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
