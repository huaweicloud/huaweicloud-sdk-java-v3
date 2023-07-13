package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronUpdateNetworkRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private NeutronUpdateNetworkOption network;

    public NeutronUpdateNetworkRequestBody withNetwork(NeutronUpdateNetworkOption network) {
        this.network = network;
        return this;
    }

    public NeutronUpdateNetworkRequestBody withNetwork(Consumer<NeutronUpdateNetworkOption> networkSetter) {
        if (this.network == null) {
            this.network = new NeutronUpdateNetworkOption();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public NeutronUpdateNetworkOption getNetwork() {
        return network;
    }

    public void setNetwork(NeutronUpdateNetworkOption network) {
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
        NeutronUpdateNetworkRequestBody that = (NeutronUpdateNetworkRequestBody) obj;
        return Objects.equals(this.network, that.network);
    }

    @Override
    public int hashCode() {
        return Objects.hash(network);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronUpdateNetworkRequestBody {\n");
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
