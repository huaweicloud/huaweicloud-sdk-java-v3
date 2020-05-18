package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaCreateServersResult;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class NovaCreateServersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server")
    
    private NovaCreateServersResult server = null;

    public NovaCreateServersResponse withServer(NovaCreateServersResult server) {
        this.server = server;
        return this;
    }

    public NovaCreateServersResponse withServer(Consumer<NovaCreateServersResult> serverSetter) {
        if(this.server == null ){
            this.server = new NovaCreateServersResult();
        }
        serverSetter.accept(this.server);
        return this;
    }


    /**
     * Get server
     * @return server
     */
    public NovaCreateServersResult getServer() {
        return server;
    }

    public void setServer(NovaCreateServersResult server) {
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
        NovaCreateServersResponse novaCreateServersResponse = (NovaCreateServersResponse) o;
        return Objects.equals(this.server, novaCreateServersResponse.server);
    }
    @Override
    public int hashCode() {
        return Objects.hash(server);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaCreateServersResponse {\n");
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

