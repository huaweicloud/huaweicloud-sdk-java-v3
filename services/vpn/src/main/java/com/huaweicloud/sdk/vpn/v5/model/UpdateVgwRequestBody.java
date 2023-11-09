package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVgwRequestBody
 */
public class UpdateVgwRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_gateway")

    private UpdateVgwRequestBodyContent vpnGateway;

    public UpdateVgwRequestBody withVpnGateway(UpdateVgwRequestBodyContent vpnGateway) {
        this.vpnGateway = vpnGateway;
        return this;
    }

    public UpdateVgwRequestBody withVpnGateway(Consumer<UpdateVgwRequestBodyContent> vpnGatewaySetter) {
        if (this.vpnGateway == null) {
            this.vpnGateway = new UpdateVgwRequestBodyContent();
            vpnGatewaySetter.accept(this.vpnGateway);
        }

        return this;
    }

    /**
     * Get vpnGateway
     * @return vpnGateway
     */
    public UpdateVgwRequestBodyContent getVpnGateway() {
        return vpnGateway;
    }

    public void setVpnGateway(UpdateVgwRequestBodyContent vpnGateway) {
        this.vpnGateway = vpnGateway;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVgwRequestBody that = (UpdateVgwRequestBody) obj;
        return Objects.equals(this.vpnGateway, that.vpnGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVgwRequestBody {\n");
        sb.append("    vpnGateway: ").append(toIndentedString(vpnGateway)).append("\n");
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
