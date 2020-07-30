package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建floatingip对象
 */
public class CreateFloatingIpOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_ip_address")
    
    private String floatingIpAddress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="floating_network_id")
    
    private String floatingNetworkId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="port_id")
    
    private String portId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fixed_ip_address")
    
    private String fixedIpAddress;

    public CreateFloatingIpOption withFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
        return this;
    }

    


    /**
     * 浮动IP地址。
     * @return floatingIpAddress
     */
    public String getFloatingIpAddress() {
        return floatingIpAddress;
    }

    public void setFloatingIpAddress(String floatingIpAddress) {
        this.floatingIpAddress = floatingIpAddress;
    }

    public CreateFloatingIpOption withFloatingNetworkId(String floatingNetworkId) {
        this.floatingNetworkId = floatingNetworkId;
        return this;
    }

    


    /**
     * 外部网络的id。只能使用固定的外网，外部网络的信息请通过GET /v2.0/networks?router:external=True或GET /v2.0/networks?name={floating_network}或neutron net-external-list方式查询。
     * @return floatingNetworkId
     */
    public String getFloatingNetworkId() {
        return floatingNetworkId;
    }

    public void setFloatingNetworkId(String floatingNetworkId) {
        this.floatingNetworkId = floatingNetworkId;
    }

    public CreateFloatingIpOption withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    


    /**
     * 端口id
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public CreateFloatingIpOption withFixedIpAddress(String fixedIpAddress) {
        this.fixedIpAddress = fixedIpAddress;
        return this;
    }

    


    /**
     * 关联端口的私有IP地址。
     * @return fixedIpAddress
     */
    public String getFixedIpAddress() {
        return fixedIpAddress;
    }

    public void setFixedIpAddress(String fixedIpAddress) {
        this.fixedIpAddress = fixedIpAddress;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateFloatingIpOption createFloatingIpOption = (CreateFloatingIpOption) o;
        return Objects.equals(this.floatingIpAddress, createFloatingIpOption.floatingIpAddress) &&
            Objects.equals(this.floatingNetworkId, createFloatingIpOption.floatingNetworkId) &&
            Objects.equals(this.portId, createFloatingIpOption.portId) &&
            Objects.equals(this.fixedIpAddress, createFloatingIpOption.fixedIpAddress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(floatingIpAddress, floatingNetworkId, portId, fixedIpAddress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFloatingIpOption {\n");
        sb.append("    floatingIpAddress: ").append(toIndentedString(floatingIpAddress)).append("\n");
        sb.append("    floatingNetworkId: ").append(toIndentedString(floatingNetworkId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    fixedIpAddress: ").append(toIndentedString(fixedIpAddress)).append("\n");
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

