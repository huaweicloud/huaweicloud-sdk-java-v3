package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateConnectGatewayResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_gateway")

    private ConnectGatewayResponse connectGateway;

    public UpdateConnectGatewayResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateConnectGatewayResponse withConnectGateway(ConnectGatewayResponse connectGateway) {
        this.connectGateway = connectGateway;
        return this;
    }

    public UpdateConnectGatewayResponse withConnectGateway(Consumer<ConnectGatewayResponse> connectGatewaySetter) {
        if (this.connectGateway == null) {
            this.connectGateway = new ConnectGatewayResponse();
            connectGatewaySetter.accept(this.connectGateway);
        }

        return this;
    }

    /**
     * Get connectGateway
     * @return connectGateway
     */
    public ConnectGatewayResponse getConnectGateway() {
        return connectGateway;
    }

    public void setConnectGateway(ConnectGatewayResponse connectGateway) {
        this.connectGateway = connectGateway;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateConnectGatewayResponse that = (UpdateConnectGatewayResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.connectGateway, that.connectGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, connectGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConnectGatewayResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    connectGateway: ").append(toIndentedString(connectGateway)).append("\n");
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
