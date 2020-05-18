package com.huaweicloud.sdk.vpc.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.CreatePortOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class CreatePortRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    private CreatePortOption port = null;

    public CreatePortRequestBody withPort(CreatePortOption port) {
        this.port = port;
        return this;
    }

    public CreatePortRequestBody withPort(Consumer<CreatePortOption> portSetter) {
        if(this.port == null ){
            this.port = new CreatePortOption();
        }
        portSetter.accept(this.port);
        return this;
    }


    /**
     * Get port
     * @return port
     */
    public CreatePortOption getPort() {
        return port;
    }

    public void setPort(CreatePortOption port) {
        this.port = port;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePortRequestBody createPortRequestBody = (CreatePortRequestBody) o;
        return Objects.equals(this.port, createPortRequestBody.port);
    }
    @Override
    public int hashCode() {
        return Objects.hash(port);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePortRequestBody {\n");
            sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

