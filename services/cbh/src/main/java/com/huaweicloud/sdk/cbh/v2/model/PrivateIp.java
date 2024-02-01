package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云堡垒机实例指定公网IP信息。
 */
public class PrivateIp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_ip")

    private String slaveIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "floating_ip")

    private String floatingIp;

    public PrivateIp withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 私网IP地址。
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public PrivateIp withSlaveIp(String slaveIp) {
        this.slaveIp = slaveIp;
        return this;
    }

    /**
     * 备机私网IP地址。
     * @return slaveIp
     */
    public String getSlaveIp() {
        return slaveIp;
    }

    public void setSlaveIp(String slaveIp) {
        this.slaveIp = slaveIp;
    }

    public PrivateIp withFloatingIp(String floatingIp) {
        this.floatingIp = floatingIp;
        return this;
    }

    /**
     * 浮动IP地址。
     * @return floatingIp
     */
    public String getFloatingIp() {
        return floatingIp;
    }

    public void setFloatingIp(String floatingIp) {
        this.floatingIp = floatingIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivateIp that = (PrivateIp) obj;
        return Objects.equals(this.ip, that.ip) && Objects.equals(this.slaveIp, that.slaveIp)
            && Objects.equals(this.floatingIp, that.floatingIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, slaveIp, floatingIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateIp {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    slaveIp: ").append(toIndentedString(slaveIp)).append("\n");
        sb.append("    floatingIp: ").append(toIndentedString(floatingIp)).append("\n");
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
