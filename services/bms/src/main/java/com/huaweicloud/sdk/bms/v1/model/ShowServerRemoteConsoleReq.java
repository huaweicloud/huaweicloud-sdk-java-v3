package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ShowServerRemoteConsoleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_console")

    private RemoteConsole remoteConsole;

    public ShowServerRemoteConsoleReq withRemoteConsole(RemoteConsole remoteConsole) {
        this.remoteConsole = remoteConsole;
        return this;
    }

    public ShowServerRemoteConsoleReq withRemoteConsole(Consumer<RemoteConsole> remoteConsoleSetter) {
        if (this.remoteConsole == null) {
            this.remoteConsole = new RemoteConsole();
            remoteConsoleSetter.accept(this.remoteConsole);
        }

        return this;
    }

    /**
     * Get remoteConsole
     * @return remoteConsole
     */
    public RemoteConsole getRemoteConsole() {
        return remoteConsole;
    }

    public void setRemoteConsole(RemoteConsole remoteConsole) {
        this.remoteConsole = remoteConsole;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowServerRemoteConsoleReq showServerRemoteConsoleReq = (ShowServerRemoteConsoleReq) o;
        return Objects.equals(this.remoteConsole, showServerRemoteConsoleReq.remoteConsole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remoteConsole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerRemoteConsoleReq {\n");
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
