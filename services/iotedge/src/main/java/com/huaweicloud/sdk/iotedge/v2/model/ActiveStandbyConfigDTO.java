package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 高可用主备配置请求结构体
 */
public class ActiveStandbyConfigDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="work_node")
    
    @JacksonXmlProperty(localName = "work_node")
    
    private String workNode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="master_interface_name")
    
    @JacksonXmlProperty(localName = "master_interface_name")
    
    private String masterInterfaceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="slave_interface_name")
    
    @JacksonXmlProperty(localName = "slave_interface_name")
    
    private String slaveInterfaceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virtual_ip_address")
    
    @JacksonXmlProperty(localName = "virtual_ip_address")
    
    private String virtualIpAddress;

    public ActiveStandbyConfigDTO withWorkNode(String workNode) {
        this.workNode = workNode;
        return this;
    }

    


    /**
     * 当前的工作节点，主节点还是备节点在工作，初始创建时工作节点为DEFAULT节点，(DEFAULT|MASTER|SLAVE)
     * @return workNode
     */
    public String getWorkNode() {
        return workNode;
    }

    public void setWorkNode(String workNode) {
        this.workNode = workNode;
    }

    

    public ActiveStandbyConfigDTO withMasterInterfaceName(String masterInterfaceName) {
        this.masterInterfaceName = masterInterfaceName;
        return this;
    }

    


    /**
     * 主节点网卡名称
     * @return masterInterfaceName
     */
    public String getMasterInterfaceName() {
        return masterInterfaceName;
    }

    public void setMasterInterfaceName(String masterInterfaceName) {
        this.masterInterfaceName = masterInterfaceName;
    }

    

    public ActiveStandbyConfigDTO withSlaveInterfaceName(String slaveInterfaceName) {
        this.slaveInterfaceName = slaveInterfaceName;
        return this;
    }

    


    /**
     * 备节点网卡名称
     * @return slaveInterfaceName
     */
    public String getSlaveInterfaceName() {
        return slaveInterfaceName;
    }

    public void setSlaveInterfaceName(String slaveInterfaceName) {
        this.slaveInterfaceName = slaveInterfaceName;
    }

    

    public ActiveStandbyConfigDTO withVirtualIpAddress(String virtualIpAddress) {
        this.virtualIpAddress = virtualIpAddress;
        return this;
    }

    


    /**
     * 网卡ip
     * @return virtualIpAddress
     */
    public String getVirtualIpAddress() {
        return virtualIpAddress;
    }

    public void setVirtualIpAddress(String virtualIpAddress) {
        this.virtualIpAddress = virtualIpAddress;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActiveStandbyConfigDTO activeStandbyConfigDTO = (ActiveStandbyConfigDTO) o;
        return Objects.equals(this.workNode, activeStandbyConfigDTO.workNode) &&
            Objects.equals(this.masterInterfaceName, activeStandbyConfigDTO.masterInterfaceName) &&
            Objects.equals(this.slaveInterfaceName, activeStandbyConfigDTO.slaveInterfaceName) &&
            Objects.equals(this.virtualIpAddress, activeStandbyConfigDTO.virtualIpAddress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(workNode, masterInterfaceName, slaveInterfaceName, virtualIpAddress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActiveStandbyConfigDTO {\n");
        sb.append("    workNode: ").append(toIndentedString(workNode)).append("\n");
        sb.append("    masterInterfaceName: ").append(toIndentedString(masterInterfaceName)).append("\n");
        sb.append("    slaveInterfaceName: ").append(toIndentedString(slaveInterfaceName)).append("\n");
        sb.append("    virtualIpAddress: ").append(toIndentedString(virtualIpAddress)).append("\n");
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

