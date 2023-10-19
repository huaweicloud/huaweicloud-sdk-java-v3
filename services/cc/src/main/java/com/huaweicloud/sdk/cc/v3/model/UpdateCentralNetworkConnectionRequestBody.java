package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新中心网络连接信息的请求体。
 */
public class UpdateCentralNetworkConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "central_network_connection")

    private UpdateCentralNetworkConnection centralNetworkConnection;

    public UpdateCentralNetworkConnectionRequestBody withCentralNetworkConnection(
        UpdateCentralNetworkConnection centralNetworkConnection) {
        this.centralNetworkConnection = centralNetworkConnection;
        return this;
    }

    public UpdateCentralNetworkConnectionRequestBody withCentralNetworkConnection(
        Consumer<UpdateCentralNetworkConnection> centralNetworkConnectionSetter) {
        if (this.centralNetworkConnection == null) {
            this.centralNetworkConnection = new UpdateCentralNetworkConnection();
            centralNetworkConnectionSetter.accept(this.centralNetworkConnection);
        }

        return this;
    }

    /**
     * Get centralNetworkConnection
     * @return centralNetworkConnection
     */
    public UpdateCentralNetworkConnection getCentralNetworkConnection() {
        return centralNetworkConnection;
    }

    public void setCentralNetworkConnection(UpdateCentralNetworkConnection centralNetworkConnection) {
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
        UpdateCentralNetworkConnectionRequestBody that = (UpdateCentralNetworkConnectionRequestBody) obj;
        return Objects.equals(this.centralNetworkConnection, that.centralNetworkConnection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(centralNetworkConnection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCentralNetworkConnectionRequestBody {\n");
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
