package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MsdtcHostOption
 */
public class MsdtcHostOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    public MsdtcHostOption withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称 hostname
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public MsdtcHostOption withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 主机ip
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MsdtcHostOption that = (MsdtcHostOption) obj;
        return Objects.equals(this.hostName, that.hostName) && Objects.equals(this.ip, that.ip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName, ip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MsdtcHostOption {\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
