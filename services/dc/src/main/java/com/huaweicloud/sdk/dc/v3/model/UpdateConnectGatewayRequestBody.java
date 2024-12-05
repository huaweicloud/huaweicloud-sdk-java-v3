package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateConnectGatewayRequestBody
 */
public class UpdateConnectGatewayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_gateway")

    private UpdateConnectGateway connectGateway;

    public UpdateConnectGatewayRequestBody withConnectGateway(UpdateConnectGateway connectGateway) {
        this.connectGateway = connectGateway;
        return this;
    }

    public UpdateConnectGatewayRequestBody withConnectGateway(Consumer<UpdateConnectGateway> connectGatewaySetter) {
        if (this.connectGateway == null) {
            this.connectGateway = new UpdateConnectGateway();
            connectGatewaySetter.accept(this.connectGateway);
        }

        return this;
    }

    /**
     * Get connectGateway
     * @return connectGateway
     */
    public UpdateConnectGateway getConnectGateway() {
        return connectGateway;
    }

    public void setConnectGateway(UpdateConnectGateway connectGateway) {
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
        UpdateConnectGatewayRequestBody that = (UpdateConnectGatewayRequestBody) obj;
        return Objects.equals(this.connectGateway, that.connectGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateConnectGatewayRequestBody {\n");
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
