package com.huaweicloud.sdk.iotedge.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群节点配置
 */
public class ClusterNodeConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_node_vip")

    private String masterNodeVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dmz_vip")

    private String dmzVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interface_name")

    private String interfaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_nodes")

    private List<NodeConfig> masterNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dmz_nodes")

    private List<NodeConfig> dmzNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_nodes")

    private List<NodeConfig> workNodes = null;

    public ClusterNodeConfig withMasterNodeVip(String masterNodeVip) {
        this.masterNodeVip = masterNodeVip;
        return this;
    }

    /**
     * master虚拟ip
     * @return masterNodeVip
     */
    public String getMasterNodeVip() {
        return masterNodeVip;
    }

    public void setMasterNodeVip(String masterNodeVip) {
        this.masterNodeVip = masterNodeVip;
    }

    public ClusterNodeConfig withDmzVip(String dmzVip) {
        this.dmzVip = dmzVip;
        return this;
    }

    /**
     * dmz区worker节点虚拟ip
     * @return dmzVip
     */
    public String getDmzVip() {
        return dmzVip;
    }

    public void setDmzVip(String dmzVip) {
        this.dmzVip = dmzVip;
    }

    public ClusterNodeConfig withInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    /**
     * 网卡名称
     * @return interfaceName
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public ClusterNodeConfig withMasterNodes(List<NodeConfig> masterNodes) {
        this.masterNodes = masterNodes;
        return this;
    }

    public ClusterNodeConfig addMasterNodesItem(NodeConfig masterNodesItem) {
        if (this.masterNodes == null) {
            this.masterNodes = new ArrayList<>();
        }
        this.masterNodes.add(masterNodesItem);
        return this;
    }

    public ClusterNodeConfig withMasterNodes(Consumer<List<NodeConfig>> masterNodesSetter) {
        if (this.masterNodes == null) {
            this.masterNodes = new ArrayList<>();
        }
        masterNodesSetter.accept(this.masterNodes);
        return this;
    }

    /**
     * master节点数
     * @return masterNodes
     */
    public List<NodeConfig> getMasterNodes() {
        return masterNodes;
    }

    public void setMasterNodes(List<NodeConfig> masterNodes) {
        this.masterNodes = masterNodes;
    }

    public ClusterNodeConfig withDmzNodes(List<NodeConfig> dmzNodes) {
        this.dmzNodes = dmzNodes;
        return this;
    }

    public ClusterNodeConfig addDmzNodesItem(NodeConfig dmzNodesItem) {
        if (this.dmzNodes == null) {
            this.dmzNodes = new ArrayList<>();
        }
        this.dmzNodes.add(dmzNodesItem);
        return this;
    }

    public ClusterNodeConfig withDmzNodes(Consumer<List<NodeConfig>> dmzNodesSetter) {
        if (this.dmzNodes == null) {
            this.dmzNodes = new ArrayList<>();
        }
        dmzNodesSetter.accept(this.dmzNodes);
        return this;
    }

    /**
     * dmz区worker节点数
     * @return dmzNodes
     */
    public List<NodeConfig> getDmzNodes() {
        return dmzNodes;
    }

    public void setDmzNodes(List<NodeConfig> dmzNodes) {
        this.dmzNodes = dmzNodes;
    }

    public ClusterNodeConfig withWorkNodes(List<NodeConfig> workNodes) {
        this.workNodes = workNodes;
        return this;
    }

    public ClusterNodeConfig addWorkNodesItem(NodeConfig workNodesItem) {
        if (this.workNodes == null) {
            this.workNodes = new ArrayList<>();
        }
        this.workNodes.add(workNodesItem);
        return this;
    }

    public ClusterNodeConfig withWorkNodes(Consumer<List<NodeConfig>> workNodesSetter) {
        if (this.workNodes == null) {
            this.workNodes = new ArrayList<>();
        }
        workNodesSetter.accept(this.workNodes);
        return this;
    }

    /**
     * trust区worker节点数
     * @return workNodes
     */
    public List<NodeConfig> getWorkNodes() {
        return workNodes;
    }

    public void setWorkNodes(List<NodeConfig> workNodes) {
        this.workNodes = workNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterNodeConfig that = (ClusterNodeConfig) obj;
        return Objects.equals(this.masterNodeVip, that.masterNodeVip) && Objects.equals(this.dmzVip, that.dmzVip)
            && Objects.equals(this.interfaceName, that.interfaceName)
            && Objects.equals(this.masterNodes, that.masterNodes) && Objects.equals(this.dmzNodes, that.dmzNodes)
            && Objects.equals(this.workNodes, that.workNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(masterNodeVip, dmzVip, interfaceName, masterNodes, dmzNodes, workNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterNodeConfig {\n");
        sb.append("    masterNodeVip: ").append(toIndentedString(masterNodeVip)).append("\n");
        sb.append("    dmzVip: ").append(toIndentedString(dmzVip)).append("\n");
        sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
        sb.append("    masterNodes: ").append(toIndentedString(masterNodes)).append("\n");
        sb.append("    dmzNodes: ").append(toIndentedString(dmzNodes)).append("\n");
        sb.append("    workNodes: ").append(toIndentedString(workNodes)).append("\n");
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
