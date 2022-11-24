package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateVirtualGatewayRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_gateway_id")

    private String virtualGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateVirtualGatewayRequestBody body;

    public UpdateVirtualGatewayRequest withVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
        return this;
    }

    /**
     * 虚拟网关ID
     * @return virtualGatewayId
     */
    public String getVirtualGatewayId() {
        return virtualGatewayId;
    }

    public void setVirtualGatewayId(String virtualGatewayId) {
        this.virtualGatewayId = virtualGatewayId;
    }

    public UpdateVirtualGatewayRequest withBody(UpdateVirtualGatewayRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateVirtualGatewayRequest withBody(Consumer<UpdateVirtualGatewayRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateVirtualGatewayRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateVirtualGatewayRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateVirtualGatewayRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVirtualGatewayRequest updateVirtualGatewayRequest = (UpdateVirtualGatewayRequest) o;
        return Objects.equals(this.virtualGatewayId, updateVirtualGatewayRequest.virtualGatewayId)
            && Objects.equals(this.body, updateVirtualGatewayRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualGatewayId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVirtualGatewayRequest {\n");
        sb.append("    virtualGatewayId: ").append(toIndentedString(virtualGatewayId)).append("\n");
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
