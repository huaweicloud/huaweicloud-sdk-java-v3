package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** QueryConnectionsResponse */
public class QueryConnectionsResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public QueryConnectionsResponse withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /** 连接到该实例或节点的客户端IP地址。
     * 
     * @return clientIp */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public QueryConnectionsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 该IP对应的连接数。
     * 
     * @return count */
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
        QueryConnectionsResponse queryConnectionsResponse = (QueryConnectionsResponse) o;
        return Objects.equals(this.clientIp, queryConnectionsResponse.clientIp)
            && Objects.equals(this.count, queryConnectionsResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientIp, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryConnectionsResponse {\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
