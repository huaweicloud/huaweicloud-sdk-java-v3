package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateGlobalDcGatewayResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway")

    private CreateGlobalDcGatewayEntry globalDcGateway;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateGlobalDcGatewayResponse withGlobalDcGateway(CreateGlobalDcGatewayEntry globalDcGateway) {
        this.globalDcGateway = globalDcGateway;
        return this;
    }

    public CreateGlobalDcGatewayResponse withGlobalDcGateway(
        Consumer<CreateGlobalDcGatewayEntry> globalDcGatewaySetter) {
        if (this.globalDcGateway == null) {
            this.globalDcGateway = new CreateGlobalDcGatewayEntry();
            globalDcGatewaySetter.accept(this.globalDcGateway);
        }

        return this;
    }

    /**
     * Get globalDcGateway
     * @return globalDcGateway
     */
    public CreateGlobalDcGatewayEntry getGlobalDcGateway() {
        return globalDcGateway;
    }

    public void setGlobalDcGateway(CreateGlobalDcGatewayEntry globalDcGateway) {
        this.globalDcGateway = globalDcGateway;
    }

    public CreateGlobalDcGatewayResponse withRequestId(String requestId) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateGlobalDcGatewayResponse that = (CreateGlobalDcGatewayResponse) obj;
        return Objects.equals(this.globalDcGateway, that.globalDcGateway)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalDcGateway, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGlobalDcGatewayResponse {\n");
        sb.append("    globalDcGateway: ").append(toIndentedString(globalDcGateway)).append("\n");
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
