package com.huaweicloud.sdk.iec.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量删除边缘实例请求体
 */
public class DeleteInstancesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    @JacksonXmlProperty(localName = "servers")

    private List<BaseId> servers = null;

    public DeleteInstancesRequestBody withServers(List<BaseId> servers) {
        this.servers = servers;
        return this;
    }

    public DeleteInstancesRequestBody addServersItem(BaseId serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public DeleteInstancesRequestBody withServers(Consumer<List<BaseId>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 边缘实例ID列表。 > IEC默认同步删除边缘实例的弹性公网IP和磁盘。
     * @return servers
     */
    public List<BaseId> getServers() {
        return servers;
    }

    public void setServers(List<BaseId> servers) {
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
        DeleteInstancesRequestBody deleteInstancesRequestBody = (DeleteInstancesRequestBody) o;
        return Objects.equals(this.servers, deleteInstancesRequestBody.servers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(servers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInstancesRequestBody {\n");
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
