package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ShowLoadBalancerPortsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private List<String> portId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private List<String> ipAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_address")

    private List<String> ipv6Address = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private List<String> virsubnetId = null;

    public ShowLoadBalancerPortsRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 负载均衡器ID。
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public ShowLoadBalancerPortsRequest withPortId(List<String> portId) {
        this.portId = portId;
        return this;
    }

    public ShowLoadBalancerPortsRequest addPortIdItem(String portIdItem) {
        if (this.portId == null) {
            this.portId = new ArrayList<>();
        }
        this.portId.add(portIdItem);
        return this;
    }

    public ShowLoadBalancerPortsRequest withPortId(Consumer<List<String>> portIdSetter) {
        if (this.portId == null) {
            this.portId = new ArrayList<>();
        }
        portIdSetter.accept(this.portId);
        return this;
    }

    /**
     * port id。  支持多值查询，查询条件格式：*port_id=xxx&port_id=xxx*。
     * @return portId
     */
    public List<String> getPortId() {
        return portId;
    }

    public void setPortId(List<String> portId) {
        this.portId = portId;
    }

    public ShowLoadBalancerPortsRequest withIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    public ShowLoadBalancerPortsRequest addIpAddressItem(String ipAddressItem) {
        if (this.ipAddress == null) {
            this.ipAddress = new ArrayList<>();
        }
        this.ipAddress.add(ipAddressItem);
        return this;
    }

    public ShowLoadBalancerPortsRequest withIpAddress(Consumer<List<String>> ipAddressSetter) {
        if (this.ipAddress == null) {
            this.ipAddress = new ArrayList<>();
        }
        ipAddressSetter.accept(this.ipAddress);
        return this;
    }

    /**
     * ipv4 地址。  支持多值查询，查询条件格式：*ip_address=xxx&ip_address=xxx*。
     * @return ipAddress
     */
    public List<String> getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(List<String> ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ShowLoadBalancerPortsRequest withIpv6Address(List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    public ShowLoadBalancerPortsRequest addIpv6AddressItem(String ipv6AddressItem) {
        if (this.ipv6Address == null) {
            this.ipv6Address = new ArrayList<>();
        }
        this.ipv6Address.add(ipv6AddressItem);
        return this;
    }

    public ShowLoadBalancerPortsRequest withIpv6Address(Consumer<List<String>> ipv6AddressSetter) {
        if (this.ipv6Address == null) {
            this.ipv6Address = new ArrayList<>();
        }
        ipv6AddressSetter.accept(this.ipv6Address);
        return this;
    }

    /**
     * ipv6 地址。  支持多值查询，查询条件格式：*ipv6_address=xxx&ipv6_address=xxx*。
     * @return ipv6Address
     */
    public List<String> getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(List<String> ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public ShowLoadBalancerPortsRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ShowLoadBalancerPortsRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ShowLoadBalancerPortsRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /**
     * port类型。  支持多值查询，查询条件格式：*type=xxx&type=xxx*。
     * @return type
     */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public ShowLoadBalancerPortsRequest withVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    public ShowLoadBalancerPortsRequest addVirsubnetIdItem(String virsubnetIdItem) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        this.virsubnetId.add(virsubnetIdItem);
        return this;
    }

    public ShowLoadBalancerPortsRequest withVirsubnetId(Consumer<List<String>> virsubnetIdSetter) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        virsubnetIdSetter.accept(this.virsubnetId);
        return this;
    }

    /**
     * 虚拟网络id。  支持多值查询，查询条件格式：*virsubnet_id=xxx&virsubnet_id=xxx*。
     * @return virsubnetId
     */
    public List<String> getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLoadBalancerPortsRequest that = (ShowLoadBalancerPortsRequest) obj;
        return Objects.equals(this.loadbalancerId, that.loadbalancerId) && Objects.equals(this.portId, that.portId)
            && Objects.equals(this.ipAddress, that.ipAddress) && Objects.equals(this.ipv6Address, that.ipv6Address)
            && Objects.equals(this.type, that.type) && Objects.equals(this.virsubnetId, that.virsubnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancerId, portId, ipAddress, ipv6Address, type, virsubnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLoadBalancerPortsRequest {\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
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
