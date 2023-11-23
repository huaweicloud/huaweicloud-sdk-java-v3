package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListInstancesSessionStatisticsRespondBodyTopSourceIps
 */
public class ListInstancesSessionStatisticsRespondBodyTopSourceIps {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_count")

    private Integer connectionCount;

    public ListInstancesSessionStatisticsRespondBodyTopSourceIps withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * 客户端ip地址。
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public ListInstancesSessionStatisticsRespondBodyTopSourceIps withConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
        return this;
    }

    /**
     * 客户端连接数。
     * @return connectionCount
     */
    public Integer getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(Integer connectionCount) {
        this.connectionCount = connectionCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesSessionStatisticsRespondBodyTopSourceIps that =
            (ListInstancesSessionStatisticsRespondBodyTopSourceIps) obj;
        return Objects.equals(this.clientIp, that.clientIp)
            && Objects.equals(this.connectionCount, that.connectionCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientIp, connectionCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesSessionStatisticsRespondBodyTopSourceIps {\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    connectionCount: ").append(toIndentedString(connectionCount)).append("\n");
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
