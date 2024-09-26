package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateCentralNetworkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network")

    private CentralNetwork centralNetwork;

    public CreateCentralNetworkResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public CreateCentralNetworkResponse withCentralNetwork(CentralNetwork centralNetwork) {
        this.centralNetwork = centralNetwork;
        return this;
    }

    public CreateCentralNetworkResponse withCentralNetwork(Consumer<CentralNetwork> centralNetworkSetter) {
        if (this.centralNetwork == null) {
            this.centralNetwork = new CentralNetwork();
            centralNetworkSetter.accept(this.centralNetwork);
        }

        return this;
    }

    /**
     * Get centralNetwork
     * @return centralNetwork
     */
    public CentralNetwork getCentralNetwork() {
        return centralNetwork;
    }

    public void setCentralNetwork(CentralNetwork centralNetwork) {
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
        CreateCentralNetworkResponse that = (CreateCentralNetworkResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.centralNetwork, that.centralNetwork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, centralNetwork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCentralNetworkResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
