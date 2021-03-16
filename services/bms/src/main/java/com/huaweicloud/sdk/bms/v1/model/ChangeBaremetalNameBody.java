package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.ChangeBaremetalNameServer;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改裸金属服务器名称接口请求结构体
 */
public class ChangeBaremetalNameBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server")
    
    private ChangeBaremetalNameServer server;

    public ChangeBaremetalNameBody withServer(ChangeBaremetalNameServer server) {
        this.server = server;
        return this;
    }

    public ChangeBaremetalNameBody withServer(Consumer<ChangeBaremetalNameServer> serverSetter) {
        if(this.server == null ){
            this.server = new ChangeBaremetalNameServer();
            serverSetter.accept(this.server);
        }
        
        return this;
    }


    /**
     * Get server
     * @return server
     */
    public ChangeBaremetalNameServer getServer() {
        return server;
    }

    public void setServer(ChangeBaremetalNameServer server) {
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
        ChangeBaremetalNameBody changeBaremetalNameBody = (ChangeBaremetalNameBody) o;
        return Objects.equals(this.server, changeBaremetalNameBody.server);
    }
    @Override
    public int hashCode() {
        return Objects.hash(server);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeBaremetalNameBody {\n");
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

