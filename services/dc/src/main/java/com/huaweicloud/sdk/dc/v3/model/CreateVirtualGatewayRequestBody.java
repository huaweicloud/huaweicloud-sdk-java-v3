package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVirtualGatewayRequestBody
 */
public class CreateVirtualGatewayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_gateway")

    private CreateVirtualGateway virtualGateway;

    public CreateVirtualGatewayRequestBody withVirtualGateway(CreateVirtualGateway virtualGateway) {
        this.virtualGateway = virtualGateway;
        return this;
    }

    public CreateVirtualGatewayRequestBody withVirtualGateway(Consumer<CreateVirtualGateway> virtualGatewaySetter) {
        if (this.virtualGateway == null) {
            this.virtualGateway = new CreateVirtualGateway();
            virtualGatewaySetter.accept(this.virtualGateway);
        }

        return this;
    }

    /**
     * Get virtualGateway
     * @return virtualGateway
     */
    public CreateVirtualGateway getVirtualGateway() {
        return virtualGateway;
    }

    public void setVirtualGateway(CreateVirtualGateway virtualGateway) {
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
        CreateVirtualGatewayRequestBody createVirtualGatewayRequestBody = (CreateVirtualGatewayRequestBody) o;
        return Objects.equals(this.virtualGateway, createVirtualGatewayRequestBody.virtualGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virtualGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVirtualGatewayRequestBody {\n");
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
