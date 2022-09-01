package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询云手机服务器猎豹
 */
public class ListCloudPhoneServersResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    @JacksonXmlProperty(localName = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "servers")

    @JacksonXmlProperty(localName = "servers")

    private List<Object> servers = null;

    public ListCloudPhoneServersResponseBody withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ListCloudPhoneServersResponseBody withServers(List<Object> servers) {
        this.servers = servers;
        return this;
    }

    public ListCloudPhoneServersResponseBody addServersItem(Object serversItem) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        this.servers.add(serversItem);
        return this;
    }

    public ListCloudPhoneServersResponseBody withServers(Consumer<List<Object>> serversSetter) {
        if (this.servers == null) {
            this.servers = new ArrayList<>();
        }
        serversSetter.accept(this.servers);
        return this;
    }

    /**
     * 云手机服务器信息
     * @return servers
     */
    public List<Object> getServers() {
        return servers;
    }

    public void setServers(List<Object> servers) {
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
        ListCloudPhoneServersResponseBody listCloudPhoneServersResponseBody = (ListCloudPhoneServersResponseBody) o;
        return Objects.equals(this.requestId, listCloudPhoneServersResponseBody.requestId)
            && Objects.equals(this.servers, listCloudPhoneServersResponseBody.servers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, servers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCloudPhoneServersResponseBody {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
