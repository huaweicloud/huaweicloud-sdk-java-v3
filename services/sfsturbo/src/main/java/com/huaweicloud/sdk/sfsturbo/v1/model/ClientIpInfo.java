package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 获取已挂载的客户端ip信息
 */
public class ClientIpInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private String ips;

    public ClientIpInfo withIps(String ips) {
        this.ips = ips;
        return this;
    }

    /**
     * 获取已挂载的客户端ip信息
     * @return ips
     */
    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClientIpInfo that = (ClientIpInfo) obj;
        return Objects.equals(this.ips, that.ips);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ips);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClientIpInfo {\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
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
