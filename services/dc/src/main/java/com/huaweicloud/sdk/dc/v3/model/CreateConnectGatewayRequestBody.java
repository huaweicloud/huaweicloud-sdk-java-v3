package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateConnectGatewayRequestBody
 */
public class CreateConnectGatewayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_gateway")

    private CreateConnectGateway connectGateway;

    public CreateConnectGatewayRequestBody withConnectGateway(CreateConnectGateway connectGateway) {
        this.connectGateway = connectGateway;
        return this;
    }

    public CreateConnectGatewayRequestBody withConnectGateway(Consumer<CreateConnectGateway> connectGatewaySetter) {
        if (this.connectGateway == null) {
            this.connectGateway = new CreateConnectGateway();
            connectGatewaySetter.accept(this.connectGateway);
        }

        return this;
    }

    /**
     * Get connectGateway
     * @return connectGateway
     */
    public CreateConnectGateway getConnectGateway() {
        return connectGateway;
    }

    public void setConnectGateway(CreateConnectGateway connectGateway) {
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
        CreateConnectGatewayRequestBody that = (CreateConnectGatewayRequestBody) obj;
        return Objects.equals(this.connectGateway, that.connectGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConnectGatewayRequestBody {\n");
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
