package com.huaweicloud.sdk.waf.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.waf.v1.model.RouteServerParm;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改路由body
 */
public class RoutePutBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="servers")
    
    private List<RouteServerParm> servers = null;
    
    public RoutePutBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public RoutePutBody withServers(List<RouteServerParm> servers) {
        this.servers = servers;
        return this;
    }

    
    public RoutePutBody addServersItem(RouteServerParm serversItem) {
        if(this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public RoutePutBody withServers(Consumer<List<RouteServerParm>> serversSetter) {
        if(this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 路由信息
     * @return servers
     */
    public List<RouteServerParm> getServers() {
        return servers;
    }

    public void setServers(List<RouteServerParm> servers) {
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
        RoutePutBody routePutBody = (RoutePutBody) o;
        return Objects.equals(this.name, routePutBody.name) &&
            Objects.equals(this.servers, routePutBody.servers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, servers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoutePutBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

