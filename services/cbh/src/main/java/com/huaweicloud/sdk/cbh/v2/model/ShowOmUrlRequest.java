package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowOmUrlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_account_name")

    private String hostAccountName;

    public ShowOmUrlRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云堡垒机服务器ID
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ShowOmUrlRequest withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 被纳管主机IP
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ShowOmUrlRequest withHostAccountName(String hostAccountName) {
        this.hostAccountName = hostAccountName;
        return this;
    }

    /**
     * 被纳管主机的账户
     * @return hostAccountName
     */
    public String getHostAccountName() {
        return hostAccountName;
    }

    public void setHostAccountName(String hostAccountName) {
        this.hostAccountName = hostAccountName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOmUrlRequest that = (ShowOmUrlRequest) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.hostAccountName, that.hostAccountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, ipAddress, hostAccountName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOmUrlRequest {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    hostAccountName: ").append(toIndentedString(hostAccountName)).append("\n");
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
