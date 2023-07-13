package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronUpdateNetworkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private NeutronNetwork network;

    public NeutronUpdateNetworkResponse withNetwork(NeutronNetwork network) {
        this.network = network;
        return this;
    }

    public NeutronUpdateNetworkResponse withNetwork(Consumer<NeutronNetwork> networkSetter) {
        if (this.network == null) {
            this.network = new NeutronNetwork();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public NeutronNetwork getNetwork() {
        return network;
    }

    public void setNetwork(NeutronNetwork network) {
        this.network = network;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronUpdateNetworkResponse that = (NeutronUpdateNetworkResponse) obj;
        return Objects.equals(this.network, that.network);
    }

    @Override
    public int hashCode() {
        return Objects.hash(network);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateNetworkResponse {\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
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
