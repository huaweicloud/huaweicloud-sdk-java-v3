package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Proxy
 */
public class Proxy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_vip")

    private String elbVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private String eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_status")

    private String poolStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_threshold_in_kilobytes")

    private Integer delayThresholdInKilobytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<ProxyNode> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    public Proxy withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * Proxy实例ID。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public Proxy withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Proxy实例开启状态，取值范围如下。 - open：打开。 - closed：关闭。 - frozen：已冻结。 - opening：打开中。 - closing：关闭中。 - freezing：冻结中。 - unfreezing：解冻中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Proxy withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Proxy读写分离地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Proxy withElbVip(String elbVip) {
        this.elbVip = elbVip;
        return this;
    }

    /**
     * elb模式的虚拟IP信息。
     * @return elbVip
     */
    public String getElbVip() {
        return elbVip;
    }

    public void setElbVip(String elbVip) {
        this.elbVip = elbVip;
    }

    public Proxy withEip(String eip) {
        this.eip = eip;
        return this;
    }

    /**
     * 弹性公网IP信息。
     * @return eip
     */
    public String getEip() {
        return eip;
    }

    public void setEip(String eip) {
        this.eip = eip;
    }

    public Proxy withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Proxy端口信息。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Proxy withPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
        return this;
    }

    /**
     * Proxy实例状态。 - abnormal：异常。 - normal：正常。 - creating：创建中。 - deleted：已删除。
     * @return poolStatus
     */
    public String getPoolStatus() {
        return poolStatus;
    }

    public void setPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
    }

    public Proxy withDelayThresholdInKilobytes(Integer delayThresholdInKilobytes) {
        this.delayThresholdInKilobytes = delayThresholdInKilobytes;
        return this;
    }

    /**
     * 延时阈值（单位：KB）。
     * @return delayThresholdInKilobytes
     */
    public Integer getDelayThresholdInKilobytes() {
        return delayThresholdInKilobytes;
    }

    public void setDelayThresholdInKilobytes(Integer delayThresholdInKilobytes) {
        this.delayThresholdInKilobytes = delayThresholdInKilobytes;
    }

    public Proxy withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * Proxy实例规格的CPU数量。
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Proxy withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * Proxy实例规格的内存数量。
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public Proxy withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * Proxy节点个数。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public Proxy withNodes(List<ProxyNode> nodes) {
        this.nodes = nodes;
        return this;
    }

    public Proxy addNodesItem(ProxyNode nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public Proxy withNodes(Consumer<List<ProxyNode>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * Proxy节点信息。
     * @return nodes
     */
    public List<ProxyNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<ProxyNode> nodes) {
        this.nodes = nodes;
    }

    public Proxy withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Proxy主备模式，取值范围：Ha。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Proxy proxy = (Proxy) o;
        return Objects.equals(this.poolId, proxy.poolId) && Objects.equals(this.status, proxy.status)
            && Objects.equals(this.address, proxy.address) && Objects.equals(this.elbVip, proxy.elbVip)
            && Objects.equals(this.eip, proxy.eip) && Objects.equals(this.port, proxy.port)
            && Objects.equals(this.poolStatus, proxy.poolStatus)
            && Objects.equals(this.delayThresholdInKilobytes, proxy.delayThresholdInKilobytes)
            && Objects.equals(this.cpu, proxy.cpu) && Objects.equals(this.mem, proxy.mem)
            && Objects.equals(this.nodeNum, proxy.nodeNum) && Objects.equals(this.nodes, proxy.nodes)
            && Objects.equals(this.mode, proxy.mode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId,
            status,
            address,
            elbVip,
            eip,
            port,
            poolStatus,
            delayThresholdInKilobytes,
            cpu,
            mem,
            nodeNum,
            nodes,
            mode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Proxy {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    elbVip: ").append(toIndentedString(elbVip)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    poolStatus: ").append(toIndentedString(poolStatus)).append("\n");
        sb.append("    delayThresholdInKilobytes: ").append(toIndentedString(delayThresholdInKilobytes)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
