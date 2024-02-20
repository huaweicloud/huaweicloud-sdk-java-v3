package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListClientsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clients")

    private List<ClientInfo> clients = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListClientsResponse withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 数据更新时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public ListClientsResponse withClients(List<ClientInfo> clients) {
        this.clients = clients;
        return this;
    }

    public ListClientsResponse addClientsItem(ClientInfo clientsItem) {
        if (this.clients == null) {
            this.clients = new ArrayList<>();
        }
        this.clients.add(clientsItem);
        return this;
    }

    public ListClientsResponse withClients(Consumer<List<ClientInfo>> clientsSetter) {
        if (this.clients == null) {
            this.clients = new ArrayList<>();
        }
        clientsSetter.accept(this.clients);
        return this;
    }

    /**
     * 会话列表
     * @return clients
     */
    public List<ClientInfo> getClients() {
        return clients;
    }

    public void setClients(List<ClientInfo> clients) {
        this.clients = clients;
    }

    public ListClientsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 会话总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListClientsResponse that = (ListClientsResponse) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.clients, that.clients)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, clients, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClientsResponse {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
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
