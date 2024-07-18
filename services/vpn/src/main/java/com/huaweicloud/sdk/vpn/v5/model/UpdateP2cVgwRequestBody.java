package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateP2cVgwRequestBody
 */
public class UpdateP2cVgwRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "p2c_vpn_gateway")

    private UpdateP2cVgwRequestBodyContent p2cVpnGateway;

    public UpdateP2cVgwRequestBody withP2cVpnGateway(UpdateP2cVgwRequestBodyContent p2cVpnGateway) {
        this.p2cVpnGateway = p2cVpnGateway;
        return this;
    }

    public UpdateP2cVgwRequestBody withP2cVpnGateway(Consumer<UpdateP2cVgwRequestBodyContent> p2cVpnGatewaySetter) {
        if (this.p2cVpnGateway == null) {
            this.p2cVpnGateway = new UpdateP2cVgwRequestBodyContent();
            p2cVpnGatewaySetter.accept(this.p2cVpnGateway);
        }

        return this;
    }

    /**
     * Get p2cVpnGateway
     * @return p2cVpnGateway
     */
    public UpdateP2cVgwRequestBodyContent getP2cVpnGateway() {
        return p2cVpnGateway;
    }

    public void setP2cVpnGateway(UpdateP2cVgwRequestBodyContent p2cVpnGateway) {
        this.p2cVpnGateway = p2cVpnGateway;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateP2cVgwRequestBody that = (UpdateP2cVgwRequestBody) obj;
        return Objects.equals(this.p2cVpnGateway, that.p2cVpnGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p2cVpnGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateP2cVgwRequestBody {\n");
        sb.append("    p2cVpnGateway: ").append(toIndentedString(p2cVpnGateway)).append("\n");
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
