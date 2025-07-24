package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowServerStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_status")

    private ServerStatus serverStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_power_status")

    private ServerPowerStatus serverPowerStatus;

    public ShowServerStatusResponse withServerStatus(ServerStatus serverStatus) {
        this.serverStatus = serverStatus;
        return this;
    }

    public ShowServerStatusResponse withServerStatus(Consumer<ServerStatus> serverStatusSetter) {
        if (this.serverStatus == null) {
            this.serverStatus = new ServerStatus();
            serverStatusSetter.accept(this.serverStatus);
        }

        return this;
    }

    /**
     * Get serverStatus
     * @return serverStatus
     */
    public ServerStatus getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(ServerStatus serverStatus) {
        this.serverStatus = serverStatus;
    }

    public ShowServerStatusResponse withServerPowerStatus(ServerPowerStatus serverPowerStatus) {
        this.serverPowerStatus = serverPowerStatus;
        return this;
    }

    public ShowServerStatusResponse withServerPowerStatus(Consumer<ServerPowerStatus> serverPowerStatusSetter) {
        if (this.serverPowerStatus == null) {
            this.serverPowerStatus = new ServerPowerStatus();
            serverPowerStatusSetter.accept(this.serverPowerStatus);
        }

        return this;
    }

    /**
     * Get serverPowerStatus
     * @return serverPowerStatus
     */
    public ServerPowerStatus getServerPowerStatus() {
        return serverPowerStatus;
    }

    public void setServerPowerStatus(ServerPowerStatus serverPowerStatus) {
        this.serverPowerStatus = serverPowerStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerStatusResponse that = (ShowServerStatusResponse) obj;
        return Objects.equals(this.serverStatus, that.serverStatus)
            && Objects.equals(this.serverPowerStatus, that.serverPowerStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverStatus, serverPowerStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerStatusResponse {\n");
        sb.append("    serverStatus: ").append(toIndentedString(serverStatus)).append("\n");
        sb.append("    serverPowerStatus: ").append(toIndentedString(serverPowerStatus)).append("\n");
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
