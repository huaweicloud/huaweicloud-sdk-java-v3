package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListNatGatewaysResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat_gateways")

    private List<NatGateway> natGateways = null;

    public ListNatGatewaysResponse withNatGateways(List<NatGateway> natGateways) {
        this.natGateways = natGateways;
        return this;
    }

    public ListNatGatewaysResponse addNatGatewaysItem(NatGateway natGatewaysItem) {
        if (this.natGateways == null) {
            this.natGateways = new ArrayList<>();
        }
        this.natGateways.add(natGatewaysItem);
        return this;
    }

    public ListNatGatewaysResponse withNatGateways(Consumer<List<NatGateway>> natGatewaysSetter) {
        if (this.natGateways == null) {
            this.natGateways = new ArrayList<>();
        }
        natGatewaysSetter.accept(this.natGateways);
        return this;
    }

    /**
     * 网关实例信息列表。
     * @return natGateways
     */
    public List<NatGateway> getNatGateways() {
        return natGateways;
    }

    public void setNatGateways(List<NatGateway> natGateways) {
        this.natGateways = natGateways;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListNatGatewaysResponse that = (ListNatGatewaysResponse) obj;
        return Objects.equals(this.natGateways, that.natGateways);
    }

    @Override
    public int hashCode() {
        return Objects.hash(natGateways);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNatGatewaysResponse {\n");
        sb.append("    natGateways: ").append(toIndentedString(natGateways)).append("\n");
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
