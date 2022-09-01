package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListBareMetalServersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    @JacksonXmlProperty(localName = "servers")

    private List<ServerDetails> servers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Integer count;

    public ListBareMetalServersResponse withServers(List<ServerDetails> servers) {
        this.servers = servers;
        return this;
    }

    public ListBareMetalServersResponse addServersItem(ServerDetails serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public ListBareMetalServersResponse withServers(Consumer<List<ServerDetails>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 裸金属服务器详情列表
     * @return servers
     */
    public List<ServerDetails> getServers() {
        return servers;
    }

    public void setServers(List<ServerDetails> servers) {
        this.servers = servers;
    }

    public ListBareMetalServersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 裸金属服务器的列表总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListBareMetalServersResponse listBareMetalServersResponse = (ListBareMetalServersResponse) o;
        return Objects.equals(this.servers, listBareMetalServersResponse.servers)
            && Objects.equals(this.count, listBareMetalServersResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servers, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBareMetalServersResponse {\n");
        sb.append("    servers: ").append(toIndentedString(servers)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
