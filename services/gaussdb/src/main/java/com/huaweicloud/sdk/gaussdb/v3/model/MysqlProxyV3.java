package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MysqlProxyV3
 */
public class MysqlProxyV3 {

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
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_status")

    private String poolStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_threshold_in_seconds")

    private Integer delayThresholdInSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_vip")

    private String elbVip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private String eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vcpus")

    private String vcpus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ram")

    private String ram;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<MysqlProxyNodes> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_ref")

    private String flavorRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_split")

    private String transactionSplit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_pool_type")

    private String connectionPoolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_connection_pool_type_enabled")

    private Boolean switchConnectionPoolTypeEnabled;

    public MysqlProxyV3 withPoolId(String poolId) {
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

    public MysqlProxyV3 withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Proxy实例开启状态。  取值: - “ACTIVE”，表示数据库代理正常； - “FAILED”，表示数据库代理创建失败； - “DELETED”，表示数据库代理已删除； - “ABNORMAL”，表示数据库代理异常； - “ENABLING PROXY”，表示数据库代理正在开启； - “DISABLING PROXY”，表示数据库代理正在关闭； - “ADDING PROXY NODE”，表示数据库代理正在扩容； - “DELETING READ REPLICAS FROM PROXY”，表示数据库代理正在移除只读节点； - “ADDING READ REPLICAS TO PROXY”，表示数据库代理正在添加只读节点； - “CHANGING WEIGHTS”，表示数据库代理正在修改只读节点权重。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public MysqlProxyV3 withAddress(String address) {
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

    public MysqlProxyV3 withPort(Integer port) {
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

    public MysqlProxyV3 withPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
        return this;
    }

    /**
     * Proxy实例状态。  取值范围： - ACTIVE，表示数据库代理正常 - ABNORMAL，表示数据库代理异常 - FAILED，表示数据库代理创建失败 - DELETED，表示数据库代理已删除
     * @return poolStatus
     */
    public String getPoolStatus() {
        return poolStatus;
    }

    public void setPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
    }

    public MysqlProxyV3 withDelayThresholdInSeconds(Integer delayThresholdInSeconds) {
        this.delayThresholdInSeconds = delayThresholdInSeconds;
        return this;
    }

    /**
     * 延时阈值，单位：秒。
     * @return delayThresholdInSeconds
     */
    public Integer getDelayThresholdInSeconds() {
        return delayThresholdInSeconds;
    }

    public void setDelayThresholdInSeconds(Integer delayThresholdInSeconds) {
        this.delayThresholdInSeconds = delayThresholdInSeconds;
    }

    public MysqlProxyV3 withElbVip(String elbVip) {
        this.elbVip = elbVip;
        return this;
    }

    /**
     * Elb模式的虚拟ip信息。
     * @return elbVip
     */
    public String getElbVip() {
        return elbVip;
    }

    public void setElbVip(String elbVip) {
        this.elbVip = elbVip;
    }

    public MysqlProxyV3 withEip(String eip) {
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

    public MysqlProxyV3 withVcpus(String vcpus) {
        this.vcpus = vcpus;
        return this;
    }

    /**
     * Proxy实例规格的CPU数量。
     * @return vcpus
     */
    public String getVcpus() {
        return vcpus;
    }

    public void setVcpus(String vcpus) {
        this.vcpus = vcpus;
    }

    public MysqlProxyV3 withRam(String ram) {
        this.ram = ram;
        return this;
    }

    /**
     * Proxy实例规格的内存数量。
     * @return ram
     */
    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public MysqlProxyV3 withNodeNum(Integer nodeNum) {
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

    public MysqlProxyV3 withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Proxy主备模式，取值范围：Cluster。
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public MysqlProxyV3 withNodes(List<MysqlProxyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }

    public MysqlProxyV3 addNodesItem(MysqlProxyNodes nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public MysqlProxyV3 withNodes(Consumer<List<MysqlProxyNodes>> nodesSetter) {
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
    public List<MysqlProxyNodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<MysqlProxyNodes> nodes) {
        this.nodes = nodes;
    }

    public MysqlProxyV3 withFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
        return this;
    }

    /**
     * Proxy规格信息。
     * @return flavorRef
     */
    public String getFlavorRef() {
        return flavorRef;
    }

    public void setFlavorRef(String flavorRef) {
        this.flavorRef = flavorRef;
    }

    public MysqlProxyV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Proxy实例名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MysqlProxyV3 withTransactionSplit(String transactionSplit) {
        this.transactionSplit = transactionSplit;
        return this;
    }

    /**
     * Proxy事务拆分开关状态【ON/OFF】。
     * @return transactionSplit
     */
    public String getTransactionSplit() {
        return transactionSplit;
    }

    public void setTransactionSplit(String transactionSplit) {
        this.transactionSplit = transactionSplit;
    }

    public MysqlProxyV3 withConnectionPoolType(String connectionPoolType) {
        this.connectionPoolType = connectionPoolType;
        return this;
    }

    /**
     * 连接池类型。  取值范围: - CLOSED: 关闭连接池。 - SESSION: 开启会话级连接池。
     * @return connectionPoolType
     */
    public String getConnectionPoolType() {
        return connectionPoolType;
    }

    public void setConnectionPoolType(String connectionPoolType) {
        this.connectionPoolType = connectionPoolType;
    }

    public MysqlProxyV3 withSwitchConnectionPoolTypeEnabled(Boolean switchConnectionPoolTypeEnabled) {
        this.switchConnectionPoolTypeEnabled = switchConnectionPoolTypeEnabled;
        return this;
    }

    /**
     * 数据库代理版本是否支持会话级连接池。  取值范围: - true: 支持。 - false: 不支持。
     * @return switchConnectionPoolTypeEnabled
     */
    public Boolean getSwitchConnectionPoolTypeEnabled() {
        return switchConnectionPoolTypeEnabled;
    }

    public void setSwitchConnectionPoolTypeEnabled(Boolean switchConnectionPoolTypeEnabled) {
        this.switchConnectionPoolTypeEnabled = switchConnectionPoolTypeEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MysqlProxyV3 that = (MysqlProxyV3) obj;
        return Objects.equals(this.poolId, that.poolId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.address, that.address) && Objects.equals(this.port, that.port)
            && Objects.equals(this.poolStatus, that.poolStatus)
            && Objects.equals(this.delayThresholdInSeconds, that.delayThresholdInSeconds)
            && Objects.equals(this.elbVip, that.elbVip) && Objects.equals(this.eip, that.eip)
            && Objects.equals(this.vcpus, that.vcpus) && Objects.equals(this.ram, that.ram)
            && Objects.equals(this.nodeNum, that.nodeNum) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.nodes, that.nodes) && Objects.equals(this.flavorRef, that.flavorRef)
            && Objects.equals(this.name, that.name) && Objects.equals(this.transactionSplit, that.transactionSplit)
            && Objects.equals(this.connectionPoolType, that.connectionPoolType)
            && Objects.equals(this.switchConnectionPoolTypeEnabled, that.switchConnectionPoolTypeEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolId,
            status,
            address,
            port,
            poolStatus,
            delayThresholdInSeconds,
            elbVip,
            eip,
            vcpus,
            ram,
            nodeNum,
            mode,
            nodes,
            flavorRef,
            name,
            transactionSplit,
            connectionPoolType,
            switchConnectionPoolTypeEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlProxyV3 {\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    poolStatus: ").append(toIndentedString(poolStatus)).append("\n");
        sb.append("    delayThresholdInSeconds: ").append(toIndentedString(delayThresholdInSeconds)).append("\n");
        sb.append("    elbVip: ").append(toIndentedString(elbVip)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    vcpus: ").append(toIndentedString(vcpus)).append("\n");
        sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    flavorRef: ").append(toIndentedString(flavorRef)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    transactionSplit: ").append(toIndentedString(transactionSplit)).append("\n");
        sb.append("    connectionPoolType: ").append(toIndentedString(connectionPoolType)).append("\n");
        sb.append("    switchConnectionPoolTypeEnabled: ")
            .append(toIndentedString(switchConnectionPoolTypeEnabled))
            .append("\n");
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
