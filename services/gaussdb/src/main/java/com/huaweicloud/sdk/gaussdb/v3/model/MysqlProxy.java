package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.MysqlProxyNodes;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MysqlProxy
 */
public class MysqlProxy  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool_id")
    
    @JacksonXmlProperty(localName = "pool_id")
    
    private String poolId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    @JacksonXmlProperty(localName = "status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    @JacksonXmlProperty(localName = "address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port")
    
    @JacksonXmlProperty(localName = "port")
    
    private Integer port;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pool_status")
    
    @JacksonXmlProperty(localName = "pool_status")
    
    private String poolStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delay_threshold_in_seconds")
    
    @JacksonXmlProperty(localName = "delay_threshold_in_seconds")
    
    private Integer delayThresholdInSeconds;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="elb_vip")
    
    @JacksonXmlProperty(localName = "elb_vip")
    
    private String elbVip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eip")
    
    @JacksonXmlProperty(localName = "eip")
    
    private String eip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vcpus")
    
    @JacksonXmlProperty(localName = "vcpus")
    
    private String vcpus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ram")
    
    @JacksonXmlProperty(localName = "ram")
    
    private String ram;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_num")
    
    @JacksonXmlProperty(localName = "node_num")
    
    private Integer nodeNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    @JacksonXmlProperty(localName = "mode")
    
    private String mode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    @JacksonXmlProperty(localName = "nodes")
    
    private List<MysqlProxyNodes> nodes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor_ref")
    
    @JacksonXmlProperty(localName = "flavor_ref")
    
    private String flavorRef;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;

    public MysqlProxy withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    


    /**
     * Proxy实例id。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    

    public MysqlProxy withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * Proxy实例开启状态。  取值范围：closed、open、frozen、opening、closing、enlarging、freezing和unfreezing。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public MysqlProxy withAddress(String address) {
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

    

    public MysqlProxy withPort(Integer port) {
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

    

    public MysqlProxy withPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
        return this;
    }

    


    /**
     * Proxy实例状态。 取值范围：ACTIVE、BUILD、FAILED和DELETED。
     * @return poolStatus
     */
    public String getPoolStatus() {
        return poolStatus;
    }

    public void setPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
    }

    

    public MysqlProxy withDelayThresholdInSeconds(Integer delayThresholdInSeconds) {
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

    

    public MysqlProxy withElbVip(String elbVip) {
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

    

    public MysqlProxy withEip(String eip) {
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

    

    public MysqlProxy withVcpus(String vcpus) {
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

    

    public MysqlProxy withRam(String ram) {
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

    

    public MysqlProxy withNodeNum(Integer nodeNum) {
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

    

    public MysqlProxy withMode(String mode) {
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

    

    public MysqlProxy withNodes(List<MysqlProxyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public MysqlProxy addNodesItem(MysqlProxyNodes nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public MysqlProxy withNodes(Consumer<List<MysqlProxyNodes>> nodesSetter) {
        if(this.nodes == null) {
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

    

    public MysqlProxy withFlavorRef(String flavorRef) {
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

    

    public MysqlProxy withName(String name) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MysqlProxy mysqlProxy = (MysqlProxy) o;
        return Objects.equals(this.poolId, mysqlProxy.poolId) &&
            Objects.equals(this.status, mysqlProxy.status) &&
            Objects.equals(this.address, mysqlProxy.address) &&
            Objects.equals(this.port, mysqlProxy.port) &&
            Objects.equals(this.poolStatus, mysqlProxy.poolStatus) &&
            Objects.equals(this.delayThresholdInSeconds, mysqlProxy.delayThresholdInSeconds) &&
            Objects.equals(this.elbVip, mysqlProxy.elbVip) &&
            Objects.equals(this.eip, mysqlProxy.eip) &&
            Objects.equals(this.vcpus, mysqlProxy.vcpus) &&
            Objects.equals(this.ram, mysqlProxy.ram) &&
            Objects.equals(this.nodeNum, mysqlProxy.nodeNum) &&
            Objects.equals(this.mode, mysqlProxy.mode) &&
            Objects.equals(this.nodes, mysqlProxy.nodes) &&
            Objects.equals(this.flavorRef, mysqlProxy.flavorRef) &&
            Objects.equals(this.name, mysqlProxy.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(poolId, status, address, port, poolStatus, delayThresholdInSeconds, elbVip, eip, vcpus, ram, nodeNum, mode, nodes, flavorRef, name);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlProxy {\n");
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

