package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateCentralNetworkConnectionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_connection")

    private CentralNetworkConnection centralNetworkConnection;

    public UpdateCentralNetworkConnectionResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 资源ID标识符。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateCentralNetworkConnectionResponse withCentralNetworkConnection(
        CentralNetworkConnection centralNetworkConnection) {
        this.centralNetworkConnection = centralNetworkConnection;
        return this;
    }

    public UpdateCentralNetworkConnectionResponse withCentralNetworkConnection(
        Consumer<CentralNetworkConnection> centralNetworkConnectionSetter) {
        if (this.centralNetworkConnection == null) {
            this.centralNetworkConnection = new CentralNetworkConnection();
            centralNetworkConnectionSetter.accept(this.centralNetworkConnection);
        }

        return this;
    }

    /**
     * Get centralNetworkConnection
     * @return centralNetworkConnection
     */
    public CentralNetworkConnection getCentralNetworkConnection() {
        return centralNetworkConnection;
    }

    public void setCentralNetworkConnection(CentralNetworkConnection centralNetworkConnection) {
        this.centralNetworkConnection = centralNetworkConnection;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCentralNetworkConnectionResponse that = (UpdateCentralNetworkConnectionResponse) obj;
        return Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.centralNetworkConnection, that.centralNetworkConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, centralNetworkConnection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCentralNetworkConnectionResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    centralNetworkConnection: ").append(toIndentedString(centralNetworkConnection)).append("\n");
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
