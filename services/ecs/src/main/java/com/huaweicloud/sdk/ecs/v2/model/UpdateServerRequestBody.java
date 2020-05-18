package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.UpdateServerOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * This is a auto create Body Object
 */
public class UpdateServerRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server")
    
    private UpdateServerOption server = null;

    public UpdateServerRequestBody withServer(UpdateServerOption server) {
        this.server = server;
        return this;
    }

    public UpdateServerRequestBody withServer(Consumer<UpdateServerOption> serverSetter) {
        if(this.server == null ){
            this.server = new UpdateServerOption();
        }
        serverSetter.accept(this.server);
        return this;
    }


    /**
     * Get server
     * @return server
     */
    public UpdateServerOption getServer() {
        return server;
    }

    public void setServer(UpdateServerOption server) {
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
        UpdateServerRequestBody updateServerRequestBody = (UpdateServerRequestBody) o;
        return Objects.equals(this.server, updateServerRequestBody.server);
    }
    @Override
    public int hashCode() {
        return Objects.hash(server);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateServerRequestBody {\n");
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

