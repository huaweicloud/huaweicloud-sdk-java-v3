package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.ServersList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * os-start字段数据结构说明
 */
public class StartServersInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="servers")
    
    private List<ServersList> servers = null;
    
    public StartServersInfo withServers(List<ServersList> servers) {
        this.servers = servers;
        return this;
    }

    
    public StartServersInfo addServersItem(ServersList serversItem) {
        if(this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public StartServersInfo withServers(Consumer<List<ServersList>> serversSetter) {
        if(this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 裸金属服务器ID列表，详情请参见表3 servers字段数据结构说明
     * @return servers
     */
    public List<ServersList> getServers() {
        return servers;
    }

    public void setServers(List<ServersList> servers) {
        this.servers = servers;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartServersInfo startServersInfo = (StartServersInfo) o;
        return Objects.equals(this.servers, startServersInfo.servers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(servers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartServersInfo {\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
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

