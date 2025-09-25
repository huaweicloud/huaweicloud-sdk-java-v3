package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateP2cVgwRequestBody
 */
public class CreateP2cVgwRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "p2c_vpn_gateway")

    private CreateP2cVgwRequestBodyContent p2cVpnGateway;

    public CreateP2cVgwRequestBody withP2cVpnGateway(CreateP2cVgwRequestBodyContent p2cVpnGateway) {
        this.p2cVpnGateway = p2cVpnGateway;
        return this;
    }

    public CreateP2cVgwRequestBody withP2cVpnGateway(Consumer<CreateP2cVgwRequestBodyContent> p2cVpnGatewaySetter) {
        if (this.p2cVpnGateway == null) {
            this.p2cVpnGateway = new CreateP2cVgwRequestBodyContent();
            p2cVpnGatewaySetter.accept(this.p2cVpnGateway);
        }

        return this;
    }

    /**
     * Get p2cVpnGateway
     * @return p2cVpnGateway
     */
    public CreateP2cVgwRequestBodyContent getP2cVpnGateway() {
        return p2cVpnGateway;
    }

    public void setP2cVpnGateway(CreateP2cVgwRequestBodyContent p2cVpnGateway) {
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
        CreateP2cVgwRequestBody that = (CreateP2cVgwRequestBody) obj;
        return Objects.equals(this.p2cVpnGateway, that.p2cVpnGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(p2cVpnGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateP2cVgwRequestBody {\n");
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
