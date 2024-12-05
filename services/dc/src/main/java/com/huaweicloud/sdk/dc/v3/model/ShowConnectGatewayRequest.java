package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowConnectGatewayRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_gateway_id")

    private String connectGatewayId;

    public ShowConnectGatewayRequest withConnectGatewayId(String connectGatewayId) {
        this.connectGatewayId = connectGatewayId;
        return this;
    }

    /**
     * 互联网关ID
     * @return connectGatewayId
     */
    public String getConnectGatewayId() {
        return connectGatewayId;
    }

    public void setConnectGatewayId(String connectGatewayId) {
        this.connectGatewayId = connectGatewayId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowConnectGatewayRequest that = (ShowConnectGatewayRequest) obj;
        return Objects.equals(this.connectGatewayId, that.connectGatewayId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectGatewayId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConnectGatewayRequest {\n");
        sb.append("    connectGatewayId: ").append(toIndentedString(connectGatewayId)).append("\n");
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
