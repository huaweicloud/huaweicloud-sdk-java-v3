package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowServerRemoteConsoleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_console")

    private ServerRemoteConsole remoteConsole;

    public ShowServerRemoteConsoleResponse withRemoteConsole(ServerRemoteConsole remoteConsole) {
        this.remoteConsole = remoteConsole;
        return this;
    }

    public ShowServerRemoteConsoleResponse withRemoteConsole(Consumer<ServerRemoteConsole> remoteConsoleSetter) {
        if (this.remoteConsole == null) {
            this.remoteConsole = new ServerRemoteConsole();
            remoteConsoleSetter.accept(this.remoteConsole);
        }

        return this;
    }

    /**
     * Get remoteConsole
     * @return remoteConsole
     */
    public ServerRemoteConsole getRemoteConsole() {
        return remoteConsole;
    }

    public void setRemoteConsole(ServerRemoteConsole remoteConsole) {
        this.remoteConsole = remoteConsole;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerRemoteConsoleResponse that = (ShowServerRemoteConsoleResponse) obj;
        return Objects.equals(this.remoteConsole, that.remoteConsole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remoteConsole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerRemoteConsoleResponse {\n");
        sb.append("    remoteConsole: ").append(toIndentedString(remoteConsole)).append("\n");
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
