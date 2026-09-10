package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AttachDevServerPortsRequestBody
 */
public class AttachDevServerPortsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_efi")

    private Boolean enableEfi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "efi_protocol")

    private String efiProtocol;

    public AttachDevServerPortsRequestBody withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     * **参数解释**：网卡ID，填该参数时，表明挂载已有网卡，其他参数不用填。 **约束限制**：^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    public AttachDevServerPortsRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：网卡名称。 **约束限制**：不涉及。 **取值范围**：默认为空，最大长度不超过255。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttachDevServerPortsRequestBody withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * **参数解释**：端口子网ID。 **约束限制**：参数port_id未填时，需要新建网卡进行挂载，此时network_id为必填项。 **取值范围**：必须是UUID格式的字符串。 **默认取值**：不涉及。
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public AttachDevServerPortsRequestBody withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * **参数解释**：端口IP地址。 **约束限制**：不支持更新。 **取值范围**：所属网络网段。 **默认取值**：不涉及。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public AttachDevServerPortsRequestBody withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public AttachDevServerPortsRequestBody addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public AttachDevServerPortsRequestBody withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * **参数解释**：关联安全组ID列表。 **约束限制**：一个端口默认最多吃吃100个安全组。 **默认取值**：不涉及。
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public AttachDevServerPortsRequestBody withEnableEfi(Boolean enableEfi) {
        this.enableEfi = enableEfi;
        return this;
    }

    /**
     * **参数解释**：是否使能efi。 **约束限制**：不涉及。 **取值范围**： - true：启用efi - false：不启用efi  **默认取值**：不涉及。
     * @return enableEfi
     */
    public Boolean getEnableEfi() {
        return enableEfi;
    }

    public void setEnableEfi(Boolean enableEfi) {
        this.enableEfi = enableEfi;
    }

    public AttachDevServerPortsRequestBody withEfiProtocol(String efiProtocol) {
        this.efiProtocol = efiProtocol;
        return this;
    }

    /**
     * **参数解释**：efi 协议。 **约束限制**：不涉及。 **取值范围**：1 - 64字符。 **默认取值**：不涉及。
     * @return efiProtocol
     */
    public String getEfiProtocol() {
        return efiProtocol;
    }

    public void setEfiProtocol(String efiProtocol) {
        this.efiProtocol = efiProtocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachDevServerPortsRequestBody that = (AttachDevServerPortsRequestBody) obj;
        return Objects.equals(this.portId, that.portId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.networkId, that.networkId) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.enableEfi, that.enableEfi) && Objects.equals(this.efiProtocol, that.efiProtocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(portId, name, networkId, ipAddress, securityGroups, enableEfi, efiProtocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachDevServerPortsRequestBody {\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    enableEfi: ").append(toIndentedString(enableEfi)).append("\n");
        sb.append("    efiProtocol: ").append(toIndentedString(efiProtocol)).append("\n");
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
