package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例激活信息
 */
public class InstanceActivateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsc_proxy_domain_name")

    private String dscProxyDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsc_proxy_ip")

    private String dscProxyIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dsc_proxy_port")

    private Integer dscProxyPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_node_id")

    private String masterNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_node_id")

    private String slaveNodeId;

    public InstanceActivateInfo withDscProxyDomainName(String dscProxyDomainName) {
        this.dscProxyDomainName = dscProxyDomainName;
        return this;
    }

    /**
     * 代理DOMAIN名称
     * @return dscProxyDomainName
     */
    public String getDscProxyDomainName() {
        return dscProxyDomainName;
    }

    public void setDscProxyDomainName(String dscProxyDomainName) {
        this.dscProxyDomainName = dscProxyDomainName;
    }

    public InstanceActivateInfo withDscProxyIp(String dscProxyIp) {
        this.dscProxyIp = dscProxyIp;
        return this;
    }

    /**
     * 代理IP
     * @return dscProxyIp
     */
    public String getDscProxyIp() {
        return dscProxyIp;
    }

    public void setDscProxyIp(String dscProxyIp) {
        this.dscProxyIp = dscProxyIp;
    }

    public InstanceActivateInfo withDscProxyPort(Integer dscProxyPort) {
        this.dscProxyPort = dscProxyPort;
        return this;
    }

    /**
     * 代理端口
     * @return dscProxyPort
     */
    public Integer getDscProxyPort() {
        return dscProxyPort;
    }

    public void setDscProxyPort(Integer dscProxyPort) {
        this.dscProxyPort = dscProxyPort;
    }

    public InstanceActivateInfo withMasterNodeId(String masterNodeId) {
        this.masterNodeId = masterNodeId;
        return this;
    }

    /**
     * 主节点ID
     * @return masterNodeId
     */
    public String getMasterNodeId() {
        return masterNodeId;
    }

    public void setMasterNodeId(String masterNodeId) {
        this.masterNodeId = masterNodeId;
    }

    public InstanceActivateInfo withSlaveNodeId(String slaveNodeId) {
        this.slaveNodeId = slaveNodeId;
        return this;
    }

    /**
     * 备节点ID
     * @return slaveNodeId
     */
    public String getSlaveNodeId() {
        return slaveNodeId;
    }

    public void setSlaveNodeId(String slaveNodeId) {
        this.slaveNodeId = slaveNodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceActivateInfo that = (InstanceActivateInfo) obj;
        return Objects.equals(this.dscProxyDomainName, that.dscProxyDomainName)
            && Objects.equals(this.dscProxyIp, that.dscProxyIp) && Objects.equals(this.dscProxyPort, that.dscProxyPort)
            && Objects.equals(this.masterNodeId, that.masterNodeId)
            && Objects.equals(this.slaveNodeId, that.slaveNodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dscProxyDomainName, dscProxyIp, dscProxyPort, masterNodeId, slaveNodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceActivateInfo {\n");
        sb.append("    dscProxyDomainName: ").append(toIndentedString(dscProxyDomainName)).append("\n");
        sb.append("    dscProxyIp: ").append(toIndentedString(dscProxyIp)).append("\n");
        sb.append("    dscProxyPort: ").append(toIndentedString(dscProxyPort)).append("\n");
        sb.append("    masterNodeId: ").append(toIndentedString(masterNodeId)).append("\n");
        sb.append("    slaveNodeId: ").append(toIndentedString(slaveNodeId)).append("\n");
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
