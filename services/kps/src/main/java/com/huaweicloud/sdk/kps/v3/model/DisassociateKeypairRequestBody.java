package com.huaweicloud.sdk.kps.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kps.v3.model.DisassociateEcsServerInfo;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 解绑密钥对描述消息体
 */
public class DisassociateKeypairRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server")
    
    private DisassociateEcsServerInfo server;

    public DisassociateKeypairRequestBody withServer(DisassociateEcsServerInfo server) {
        this.server = server;
        return this;
    }

    public DisassociateKeypairRequestBody withServer(Consumer<DisassociateEcsServerInfo> serverSetter) {
        if(this.server == null ){
            this.server = new DisassociateEcsServerInfo();
            serverSetter.accept(this.server);
        }
        
        return this;
    }


    /**
     * Get server
     * @return server
     */
    public DisassociateEcsServerInfo getServer() {
        return server;
    }

    public void setServer(DisassociateEcsServerInfo server) {
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
        DisassociateKeypairRequestBody disassociateKeypairRequestBody = (DisassociateKeypairRequestBody) o;
        return Objects.equals(this.server, disassociateKeypairRequestBody.server);
    }
    @Override
    public int hashCode() {
        return Objects.hash(server);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateKeypairRequestBody {\n");
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

