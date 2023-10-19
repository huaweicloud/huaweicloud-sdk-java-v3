package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新中心网络的请求体。
 */
public class UpdateCentralNetworkRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network")

    private UpdateCentralNetwork centralNetwork;

    public UpdateCentralNetworkRequestBody withCentralNetwork(UpdateCentralNetwork centralNetwork) {
        this.centralNetwork = centralNetwork;
        return this;
    }

    public UpdateCentralNetworkRequestBody withCentralNetwork(Consumer<UpdateCentralNetwork> centralNetworkSetter) {
        if (this.centralNetwork == null) {
            this.centralNetwork = new UpdateCentralNetwork();
            centralNetworkSetter.accept(this.centralNetwork);
        }

        return this;
    }

    /**
     * Get centralNetwork
     * @return centralNetwork
     */
    public UpdateCentralNetwork getCentralNetwork() {
        return centralNetwork;
    }

    public void setCentralNetwork(UpdateCentralNetwork centralNetwork) {
        this.centralNetwork = centralNetwork;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCentralNetworkRequestBody that = (UpdateCentralNetworkRequestBody) obj;
        return Objects.equals(this.centralNetwork, that.centralNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centralNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCentralNetworkRequestBody {\n");
        sb.append("    centralNetwork: ").append(toIndentedString(centralNetwork)).append("\n");
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
