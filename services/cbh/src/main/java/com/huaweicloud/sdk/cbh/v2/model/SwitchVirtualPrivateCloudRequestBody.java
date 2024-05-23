package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SwitchVirtualPrivateCloudRequestBody
 */
public class SwitchVirtualPrivateCloudRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private NetworkInfoCreate network;

    public SwitchVirtualPrivateCloudRequestBody withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 需要切换vpc的实例id
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public SwitchVirtualPrivateCloudRequestBody withNetwork(NetworkInfoCreate network) {
        this.network = network;
        return this;
    }

    public SwitchVirtualPrivateCloudRequestBody withNetwork(Consumer<NetworkInfoCreate> networkSetter) {
        if (this.network == null) {
            this.network = new NetworkInfoCreate();
            networkSetter.accept(this.network);
        }

        return this;
    }

    /**
     * Get network
     * @return network
     */
    public NetworkInfoCreate getNetwork() {
        return network;
    }

    public void setNetwork(NetworkInfoCreate network) {
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
        SwitchVirtualPrivateCloudRequestBody that = (SwitchVirtualPrivateCloudRequestBody) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.network, that.network);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, network);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SwitchVirtualPrivateCloudRequestBody {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
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
