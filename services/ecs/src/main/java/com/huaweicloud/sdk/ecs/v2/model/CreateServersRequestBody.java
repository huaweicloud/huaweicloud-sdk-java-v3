package com.huaweicloud.sdk.ecs.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.PrePaidServer;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateServersRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server")
    
    private PrePaidServer server = null;

    public CreateServersRequestBody withServer(PrePaidServer server) {
        this.server = server;
        return this;
    }

    public CreateServersRequestBody withServer(Consumer<PrePaidServer> serverSetter) {
        if(this.server == null ){
            this.server = new PrePaidServer();
            serverSetter.accept(this.server);
        }
        
        return this;
    }


    /**
     * Get server
     * @return server
     */
    public PrePaidServer getServer() {
        return server;
    }

    public void setServer(PrePaidServer server) {
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
        CreateServersRequestBody createServersRequestBody = (CreateServersRequestBody) o;
        return Objects.equals(this.server, createServersRequestBody.server);
    }
    @Override
    public int hashCode() {
        return Objects.hash(server);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateServersRequestBody {\n");
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

