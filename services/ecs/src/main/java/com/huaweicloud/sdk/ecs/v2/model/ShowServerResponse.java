package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowServerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    @JacksonXmlProperty(localName = "server")

    private ServerDetail server;

    public ShowServerResponse withServer(ServerDetail server) {
        this.server = server;
        return this;
    }

    public ShowServerResponse withServer(Consumer<ServerDetail> serverSetter) {
        if (this.server == null) {
            this.server = new ServerDetail();
            serverSetter.accept(this.server);
        }

        return this;
    }

    /**
     * Get server
     * @return server
     */
    public ServerDetail getServer() {
        return server;
    }

    public void setServer(ServerDetail server) {
        this.server = server;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowServerResponse showServerResponse = (ShowServerResponse) o;
        return Objects.equals(this.server, showServerResponse.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerResponse {\n");
        sb.append("    server: ").append(toIndentedString(server)).append("\n");
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
