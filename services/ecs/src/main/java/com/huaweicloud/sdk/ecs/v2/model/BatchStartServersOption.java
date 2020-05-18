package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.ServerId;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class BatchStartServersOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="servers")
    
    private List<ServerId> servers = new ArrayList<>();
    
    public BatchStartServersOption withServers(List<ServerId> servers) {
        this.servers = servers;
        return this;
    }

    
    public BatchStartServersOption addServersItem(ServerId serversItem) {
        this.servers.add(serversItem);
        return this;
    }

    public BatchStartServersOption withServers(Consumer<List<ServerId>> serversSetter) {
        if(this.servers == null ){
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 云服务器ID列表
     * @return servers
     */
    public List<ServerId> getServers() {
        return servers;
    }

    public void setServers(List<ServerId> servers) {
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
        BatchStartServersOption batchStartServersOption = (BatchStartServersOption) o;
        return Objects.equals(this.servers, batchStartServersOption.servers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(servers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStartServersOption {\n");
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

