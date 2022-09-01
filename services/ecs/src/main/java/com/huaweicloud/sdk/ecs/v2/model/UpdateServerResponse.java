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
public class UpdateServerResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server")

    @JacksonXmlProperty(localName = "server")

    private UpdateServerResult server;

    public UpdateServerResponse withServer(UpdateServerResult server) {
        this.server = server;
        return this;
    }

    public UpdateServerResponse withServer(Consumer<UpdateServerResult> serverSetter) {
        if (this.server == null) {
            this.server = new UpdateServerResult();
            serverSetter.accept(this.server);
        }

        return this;
    }

    /**
     * Get server
     * @return server
     */
    public UpdateServerResult getServer() {
        return server;
    }

    public void setServer(UpdateServerResult server) {
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
        UpdateServerResponse updateServerResponse = (UpdateServerResponse) o;
        return Objects.equals(this.server, updateServerResponse.server);
    }

    @Override
    public int hashCode() {
        return Objects.hash(server);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerResponse {\n");
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
