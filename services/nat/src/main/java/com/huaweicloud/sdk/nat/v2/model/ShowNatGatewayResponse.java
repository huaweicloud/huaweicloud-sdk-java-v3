package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNatGatewayResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateway")

    @JacksonXmlProperty(localName = "nat_gateway")

    private NatGatewayResponseBody natGateway;

    public ShowNatGatewayResponse withNatGateway(NatGatewayResponseBody natGateway) {
        this.natGateway = natGateway;
        return this;
    }

    public ShowNatGatewayResponse withNatGateway(Consumer<NatGatewayResponseBody> natGatewaySetter) {
        if (this.natGateway == null) {
            this.natGateway = new NatGatewayResponseBody();
            natGatewaySetter.accept(this.natGateway);
        }

        return this;
    }

    /**
     * Get natGateway
     * @return natGateway
     */
    public NatGatewayResponseBody getNatGateway() {
        return natGateway;
    }

    public void setNatGateway(NatGatewayResponseBody natGateway) {
        this.natGateway = natGateway;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNatGatewayResponse showNatGatewayResponse = (ShowNatGatewayResponse) o;
        return Objects.equals(this.natGateway, showNatGatewayResponse.natGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNatGatewayResponse {\n");
        sb.append("    natGateway: ").append(toIndentedString(natGateway)).append("\n");
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
