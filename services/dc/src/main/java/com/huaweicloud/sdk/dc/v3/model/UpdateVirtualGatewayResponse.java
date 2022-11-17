package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateVirtualGatewayResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_gateway")

    private VirtualGateway virtualGateway;

    public UpdateVirtualGatewayResponse withVirtualGateway(VirtualGateway virtualGateway) {
        this.virtualGateway = virtualGateway;
        return this;
    }

    public UpdateVirtualGatewayResponse withVirtualGateway(Consumer<VirtualGateway> virtualGatewaySetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateVirtualGatewayResponse updateVirtualGatewayResponse = (UpdateVirtualGatewayResponse) o;
        return Objects.equals(this.virtualGateway, updateVirtualGatewayResponse.virtualGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVirtualGatewayResponse {\n");
        sb.append("    virtualGateway: ").append(toIndentedString(virtualGateway)).append("\n");
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
