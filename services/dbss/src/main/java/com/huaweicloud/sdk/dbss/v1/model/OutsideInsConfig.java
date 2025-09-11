package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 云实例配置
 */
public class OutsideInsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_node_ip")

    private String masterNodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_node_ip")

    private String slaveNodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtual_ip")

    private String virtualIp;

    public OutsideInsConfig withMasterNodeIp(String masterNodeIp) {
        this.masterNodeIp = masterNodeIp;
        return this;
    }

    /**
     * 主节点IP
     * @return masterNodeIp
     */
    public String getMasterNodeIp() {
        return masterNodeIp;
    }

    public void setMasterNodeIp(String masterNodeIp) {
        this.masterNodeIp = masterNodeIp;
    }

    public OutsideInsConfig withSlaveNodeIp(String slaveNodeIp) {
        this.slaveNodeIp = slaveNodeIp;
        return this;
    }

    /**
     * 从节点IP
     * @return slaveNodeIp
     */
    public String getSlaveNodeIp() {
        return slaveNodeIp;
    }

    public void setSlaveNodeIp(String slaveNodeIp) {
        this.slaveNodeIp = slaveNodeIp;
    }

    public OutsideInsConfig withVirtualIp(String virtualIp) {
        this.virtualIp = virtualIp;
        return this;
    }

    /**
     * 虚拟IP
     * @return virtualIp
     */
    public String getVirtualIp() {
        return virtualIp;
    }

    public void setVirtualIp(String virtualIp) {
        this.virtualIp = virtualIp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OutsideInsConfig that = (OutsideInsConfig) obj;
        return Objects.equals(this.masterNodeIp, that.masterNodeIp)
            && Objects.equals(this.slaveNodeIp, that.slaveNodeIp) && Objects.equals(this.virtualIp, that.virtualIp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterNodeIp, slaveNodeIp, virtualIp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OutsideInsConfig {\n");
        sb.append("    masterNodeIp: ").append(toIndentedString(masterNodeIp)).append("\n");
        sb.append("    slaveNodeIp: ").append(toIndentedString(slaveNodeIp)).append("\n");
        sb.append("    virtualIp: ").append(toIndentedString(virtualIp)).append("\n");
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
