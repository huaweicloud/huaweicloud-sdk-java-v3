package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVirtualGatewayRequestBody
 */
public class UpdateVirtualGatewayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_gateway")

    private UpdateVirtualGateway virtualGateway;

    public UpdateVirtualGatewayRequestBody withVirtualGateway(UpdateVirtualGateway virtualGateway) {
        this.virtualGateway = virtualGateway;
        return this;
    }

    public UpdateVirtualGatewayRequestBody withVirtualGateway(Consumer<UpdateVirtualGateway> virtualGatewaySetter) {
        if (this.virtualGateway == null) {
            this.virtualGateway = new UpdateVirtualGateway();
            virtualGatewaySetter.accept(this.virtualGateway);
        }

        return this;
    }

    /**
     * Get virtualGateway
     * @return virtualGateway
     */
    public UpdateVirtualGateway getVirtualGateway() {
        return virtualGateway;
    }

    public void setVirtualGateway(UpdateVirtualGateway virtualGateway) {
        this.virtualGateway = virtualGateway;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVirtualGatewayRequestBody that = (UpdateVirtualGatewayRequestBody) obj;
        return Objects.equals(this.virtualGateway, that.virtualGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVirtualGatewayRequestBody {\n");
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
