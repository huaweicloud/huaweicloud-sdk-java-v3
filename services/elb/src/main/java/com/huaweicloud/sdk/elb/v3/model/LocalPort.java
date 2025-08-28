package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：当前ELB占用的子网端口。  **取值范围**：不涉及
 */
public class LocalPort {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_address")

    private String ipv6Address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    public LocalPort withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器占用的端口ID。  **取值范围**：不涉及
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public LocalPort withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * **参数解释**：负载均衡器占用的私有IPv4地址。  **取值范围**：不涉及
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public LocalPort withIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
        return this;
    }

    /**
     * **参数解释**：负载均衡器占用的IPv6地址。  **取值范围**：不涉及
     * @return ipv6Address
     */
    public String getIpv6Address() {
        return ipv6Address;
    }

    public void setIpv6Address(String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    public LocalPort withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：子网端口类型。  **取值范围**： - l4_hc：四层dnat转发时健康检查使用的地址。 - l4 四层fullnat 转发时健康检查及业务转发使用的地址。 - l7 七层健康检查及业务转发使用的地址。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalPort withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * **参数解释**：子网端口所在下联面子网网络ID。  **取值范围**：不涉及
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
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
        LocalPort that = (LocalPort) obj;
        return Objects.equals(this.portId, that.portId) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.ipv6Address, that.ipv6Address) && Objects.equals(this.type, that.type)
            && Objects.equals(this.virsubnetId, that.virsubnetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portId, ipAddress, ipv6Address, type, virsubnetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalPort {\n");
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
