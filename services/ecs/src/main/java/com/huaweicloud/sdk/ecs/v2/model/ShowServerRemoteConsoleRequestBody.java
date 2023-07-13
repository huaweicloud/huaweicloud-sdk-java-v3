package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class ShowServerRemoteConsoleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remote_console")

    private GetServerRemoteConsoleOption remoteConsole;

    public ShowServerRemoteConsoleRequestBody withRemoteConsole(GetServerRemoteConsoleOption remoteConsole) {
        this.remoteConsole = remoteConsole;
        return this;
    }

    public ShowServerRemoteConsoleRequestBody withRemoteConsole(
        Consumer<GetServerRemoteConsoleOption> remoteConsoleSetter) {
        if (this.remoteConsole == null) {
            this.remoteConsole = new GetServerRemoteConsoleOption();
            remoteConsoleSetter.accept(this.remoteConsole);
        }

        return this;
    }

    /**
     * Get remoteConsole
     * @return remoteConsole
     */
    public GetServerRemoteConsoleOption getRemoteConsole() {
        return remoteConsole;
    }

    public void setRemoteConsole(GetServerRemoteConsoleOption remoteConsole) {
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
        ShowServerRemoteConsoleRequestBody that = (ShowServerRemoteConsoleRequestBody) obj;
        return Objects.equals(this.remoteConsole, that.remoteConsole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(remoteConsole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerRemoteConsoleRequestBody {\n");
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
