package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池状态信息。
 */
public class NetworkStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private String phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connectionStatus")

    private NetworkConnectionStatus connectionStatus;

    public NetworkStatus withPhase(String phase) {
        this.phase = phase;
        return this;
    }

    /**
     * **参数解释**：网络资源的当前状态。 **取值范围**：可选值如下： - Creating：网络创建中。 - Active：网络正常。 - Abnormal：网络异常。
     * @return phase
     */
    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public NetworkStatus withConnectionStatus(NetworkConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
        return this;
    }

    public NetworkStatus withConnectionStatus(Consumer<NetworkConnectionStatus> connectionStatusSetter) {
        if (this.connectionStatus == null) {
            this.connectionStatus = new NetworkConnectionStatus();
            connectionStatusSetter.accept(this.connectionStatus);
        }

        return this;
    }

    /**
     * Get connectionStatus
     * @return connectionStatus
     */
    public NetworkConnectionStatus getConnectionStatus() {
        return connectionStatus;
    }

    public void setConnectionStatus(NetworkConnectionStatus connectionStatus) {
        this.connectionStatus = connectionStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkStatus that = (NetworkStatus) obj;
        return Objects.equals(this.phase, that.phase) && Objects.equals(this.connectionStatus, that.connectionStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phase, connectionStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkStatus {\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    connectionStatus: ").append(toIndentedString(connectionStatus)).append("\n");
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
