package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Redis 3.0 proxy集群中proxy节点监控对象结构
 */
public class ProxyNodeMonitoredObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_instance_id")

    @JacksonXmlProperty(localName = "dcs_instance_id")

    private String dcsInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dcs_cluster_proxy_node")

    @JacksonXmlProperty(localName = "dcs_cluster_proxy_node")

    private String dcsClusterProxyNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    public ProxyNodeMonitoredObject withDcsInstanceId(String dcsInstanceId) {
        this.dcsInstanceId = dcsInstanceId;
        return this;
    }

    /**
     * 测量对象ID，即节点的ID。
     * @return dcsInstanceId
     */
    public String getDcsInstanceId() {
        return dcsInstanceId;
    }

    public void setDcsInstanceId(String dcsInstanceId) {
        this.dcsInstanceId = dcsInstanceId;
    }

    public ProxyNodeMonitoredObject withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 测量对象名称，即节点IP。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProxyNodeMonitoredObject withDcsClusterProxyNode(String dcsClusterProxyNode) {
        this.dcsClusterProxyNode = dcsClusterProxyNode;
        return this;
    }

    /**
     * 维度dcs_cluster_proxy_node 的测量对象的ID。
     * @return dcsClusterProxyNode
     */
    public String getDcsClusterProxyNode() {
        return dcsClusterProxyNode;
    }

    public void setDcsClusterProxyNode(String dcsClusterProxyNode) {
        this.dcsClusterProxyNode = dcsClusterProxyNode;
    }

    public ProxyNodeMonitoredObject withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 测量对象状态，即节点状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProxyNodeMonitoredObject proxyNodeMonitoredObject = (ProxyNodeMonitoredObject) o;
        return Objects.equals(this.dcsInstanceId, proxyNodeMonitoredObject.dcsInstanceId)
            && Objects.equals(this.name, proxyNodeMonitoredObject.name)
            && Objects.equals(this.dcsClusterProxyNode, proxyNodeMonitoredObject.dcsClusterProxyNode)
            && Objects.equals(this.status, proxyNodeMonitoredObject.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dcsInstanceId, name, dcsClusterProxyNode, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyNodeMonitoredObject {\n");
        sb.append("    dcsInstanceId: ").append(toIndentedString(dcsInstanceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    dcsClusterProxyNode: ").append(toIndentedString(dcsClusterProxyNode)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
