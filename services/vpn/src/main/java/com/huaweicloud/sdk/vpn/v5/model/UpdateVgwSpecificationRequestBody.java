package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVgwSpecificationRequestBody
 */
public class UpdateVgwSpecificationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpn_gateway")

    private UpdateVgwSpecificationRequestBodyContent vpnGateway;

    public UpdateVgwSpecificationRequestBody withVpnGateway(UpdateVgwSpecificationRequestBodyContent vpnGateway) {
        this.vpnGateway = vpnGateway;
        return this;
    }

    public UpdateVgwSpecificationRequestBody withVpnGateway(
        Consumer<UpdateVgwSpecificationRequestBodyContent> vpnGatewaySetter) {
        if (this.vpnGateway == null) {
            this.vpnGateway = new UpdateVgwSpecificationRequestBodyContent();
            vpnGatewaySetter.accept(this.vpnGateway);
        }

        return this;
    }

    /**
     * Get vpnGateway
     * @return vpnGateway
     */
    public UpdateVgwSpecificationRequestBodyContent getVpnGateway() {
        return vpnGateway;
    }

    public void setVpnGateway(UpdateVgwSpecificationRequestBodyContent vpnGateway) {
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
        UpdateVgwSpecificationRequestBody that = (UpdateVgwSpecificationRequestBody) obj;
        return Objects.equals(this.vpnGateway, that.vpnGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpnGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVgwSpecificationRequestBody {\n");
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
