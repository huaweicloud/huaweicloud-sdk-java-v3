package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.ServerDetail;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class ListServersDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="servers")
    
    private List<ServerDetail> servers = null;
    
    public ListServersDetailsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 弹性云服务器的列表总数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListServersDetailsResponse withServers(List<ServerDetail> servers) {
        this.servers = servers;
        return this;
    }

    
    public ListServersDetailsResponse addServersItem(ServerDetail serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public ListServersDetailsResponse withServers(Consumer<List<ServerDetail>> serversSetter) {
        if(this.servers == null ){
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 弹性云服务器详情列表，具体参照-查询云服务器详情接口。查询级别不同，返回的详情不同。
     * @return servers
     */
    public List<ServerDetail> getServers() {
        return servers;
    }

    public void setServers(List<ServerDetail> servers) {
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
        ListServersDetailsResponse listServersDetailsResponse = (ListServersDetailsResponse) o;
        return Objects.equals(this.count, listServersDetailsResponse.count) &&
            Objects.equals(this.servers, listServersDetailsResponse.servers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(count, servers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServersDetailsResponse {\n");
            sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

