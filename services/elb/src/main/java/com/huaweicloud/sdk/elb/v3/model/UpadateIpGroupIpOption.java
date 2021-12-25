package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** IP地址更新参数。 */
public class UpadateIpGroupIpOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public UpadateIpGroupIpOption withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /** IP地址。支持IPv4、IPv6。 [不支持IPv6，请勿设置为IPv6地址。](tag:dt,dt_test)
     * 
     * @return ip */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public UpadateIpGroupIpOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 备注信息。
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpadateIpGroupIpOption upadateIpGroupIpOption = (UpadateIpGroupIpOption) o;
        return Objects.equals(this.ip, upadateIpGroupIpOption.ip)
            && Objects.equals(this.description, upadateIpGroupIpOption.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpadateIpGroupIpOption {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
