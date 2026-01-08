package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListPortsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private List<String> virsubnetId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private List<String> deviceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_address")

    private List<String> macAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_owner")

    private List<String> deviceOwner = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_owner_prefixlike")

    private String deviceOwnerPrefixlike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding:host_id")

    private List<String> bindingHostId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ips")

    private List<String> privateIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private List<String> vpcId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_address_pairs")

    private List<String> allowedAddressPairs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    public ListPortsRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListPortsRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListPortsRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * **参数解释**： 端口的资源ID。 **取值范围**： 带“-”的标准UUID格式。
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListPortsRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListPortsRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListPortsRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * **参数解释**： 端口的名称。 **取值范围**： 默认为空，最大长度不超过255。
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListPortsRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * **参数解释**： 端口的管理状态。 **取值范围**： true，false，默认值true。
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListPortsRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 端口的状态。 **取值范围**： - ACTIVE：端口处- 于活动状态，可以正常进行网络通信。 - BUILD：端口正在创建或配置中。 - DOWN：端口处于非活动状态，不能进行网络通信。Hana 硬直通虚拟机端口状态总为DOWN。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListPortsRequest withVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    public ListPortsRequest addVirsubnetIdItem(String virsubnetIdItem) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        this.virsubnetId.add(virsubnetIdItem);
        return this;
    }

    public ListPortsRequest withVirsubnetId(Consumer<List<String>> virsubnetIdSetter) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        virsubnetIdSetter.accept(this.virsubnetId);
        return this;
    }

    /**
     * **参数解释**： 端口所在的虚拟子网ID。 **取值范围**： 带“-”的标准UUID格式。
     * @return virsubnetId
     */
    public List<String> getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public ListPortsRequest withDeviceId(List<String> deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public ListPortsRequest addDeviceIdItem(String deviceIdItem) {
        if (this.deviceId == null) {
            this.deviceId = new ArrayList<>();
        }
        this.deviceId.add(deviceIdItem);
        return this;
    }

    public ListPortsRequest withDeviceId(Consumer<List<String>> deviceIdSetter) {
        if (this.deviceId == null) {
            this.deviceId = new ArrayList<>();
        }
        deviceIdSetter.accept(this.deviceId);
        return this;
    }

    /**
     * **参数解释**： 端口所属的设备ID。 **取值范围**： 带“-”的标准UUID格式。
     * @return deviceId
     */
    public List<String> getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(List<String> deviceId) {
        this.deviceId = deviceId;
    }

    public ListPortsRequest withMacAddress(List<String> macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public ListPortsRequest addMacAddressItem(String macAddressItem) {
        if (this.macAddress == null) {
            this.macAddress = new ArrayList<>();
        }
        this.macAddress.add(macAddressItem);
        return this;
    }

    public ListPortsRequest withMacAddress(Consumer<List<String>> macAddressSetter) {
        if (this.macAddress == null) {
            this.macAddress = new ArrayList<>();
        }
        macAddressSetter.accept(this.macAddress);
        return this;
    }

    /**
     * **参数解释**： 端口的MAC地址。 **取值范围**： 不涉及
     * @return macAddress
     */
    public List<String> getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(List<String> macAddress) {
        this.macAddress = macAddress;
    }

    public ListPortsRequest withDeviceOwner(List<String> deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    public ListPortsRequest addDeviceOwnerItem(String deviceOwnerItem) {
        if (this.deviceOwner == null) {
            this.deviceOwner = new ArrayList<>();
        }
        this.deviceOwner.add(deviceOwnerItem);
        return this;
    }

    public ListPortsRequest withDeviceOwner(Consumer<List<String>> deviceOwnerSetter) {
        if (this.deviceOwner == null) {
            this.deviceOwner = new ArrayList<>();
        }
        deviceOwnerSetter.accept(this.deviceOwner);
        return this;
    }

    /**
     * **参数解释**： 端口所属的设备名称。 **取值范围**： - network:dhcp, 表示DHCP服务 - network:router_interface_distributed, 表示子网网关地址 - compute:xxx, 表示云服务器网卡私有IP地址，其中XXX对应具体的可用区名称，例如compute:aa-bb-cc表示私有IP地址被可用区aa-bb-cc内的云服务器使用 - neutron:VIP_PORT, 表示虚拟IP地址 - neutron:LOADBALANCERV2, 表示共享型ELB - neutron:LOADBALANCERV3, 表示独享型ELB - network:endpoint_interface, 表示VPC终端节点 - network:nat_gateway, 表示NAT网关 - network:ucmp, 表示UCMP端口，为企业路由器服务所用
     * @return deviceOwner
     */
    public List<String> getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(List<String> deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public ListPortsRequest withDeviceOwnerPrefixlike(String deviceOwnerPrefixlike) {
        this.deviceOwnerPrefixlike = deviceOwnerPrefixlike;
        return this;
    }

    /**
     * **参数解释**： 端口所属的设备名称前缀。 **取值范围**： - network：过滤出device_owner前缀是network的端口，如DHCP端口。 - compute：过滤出device_owner前缀是compute的端口，如云服务器网卡。 - neutron：过滤出device_owner前缀是compute的端口，如虚拟IP地址。
     * @return deviceOwnerPrefixlike
     */
    public String getDeviceOwnerPrefixlike() {
        return deviceOwnerPrefixlike;
    }

    public void setDeviceOwnerPrefixlike(String deviceOwnerPrefixlike) {
        this.deviceOwnerPrefixlike = deviceOwnerPrefixlike;
    }

    public ListPortsRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListPortsRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListPortsRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * **参数解释**： 端口的描述信息。 **取值范围**： 0-255个字符，不能包含“<”和“>”。
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListPortsRequest withBindingHostId(List<String> bindingHostId) {
        this.bindingHostId = bindingHostId;
        return this;
    }

    public ListPortsRequest addBindingHostIdItem(String bindingHostIdItem) {
        if (this.bindingHostId == null) {
            this.bindingHostId = new ArrayList<>();
        }
        this.bindingHostId.add(bindingHostIdItem);
        return this;
    }

    public ListPortsRequest withBindingHostId(Consumer<List<String>> bindingHostIdSetter) {
        if (this.bindingHostId == null) {
            this.bindingHostId = new ArrayList<>();
        }
        bindingHostIdSetter.accept(this.bindingHostId);
        return this;
    }

    /**
     * **参数解释**： 端口所在的主机ID。 **取值范围**： 不涉及。
     * @return bindingHostId
     */
    public List<String> getBindingHostId() {
        return bindingHostId;
    }

    public void setBindingHostId(List<String> bindingHostId) {
        this.bindingHostId = bindingHostId;
    }

    public ListPortsRequest withPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
        return this;
    }

    public ListPortsRequest addPrivateIpsItem(String privateIpsItem) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        this.privateIps.add(privateIpsItem);
        return this;
    }

    public ListPortsRequest withPrivateIps(Consumer<List<String>> privateIpsSetter) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        privateIpsSetter.accept(this.privateIps);
        return this;
    }

    /**
     * **参数解释**： 端口的私有IP地址。 **取值范围**： - private_ips=ip_address={ip_address}，其中{ip_address}填IP地址，如192.168.21.22。 - private_ips=subnet_cidr_id={subnet_id}，其中{subnet_id}填IPv4子网或IPv6子网的ID，如011fc878-5521-4654-a1ad-f5b0b5820302。
     * @return privateIps
     */
    public List<String> getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(List<String> privateIps) {
        this.privateIps = privateIps;
    }

    public ListPortsRequest withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public ListPortsRequest addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ListPortsRequest withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * **参数解释**： 端口绑定的安全组列表。 **取值范围**： 不涉及。
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ListPortsRequest withVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public ListPortsRequest addVpcIdItem(String vpcIdItem) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public ListPortsRequest withVpcId(Consumer<List<String>> vpcIdSetter) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * **参数解释**： 端口所在的VPC的ID。 **取值范围**： 带“-”的标准UUID格式。
     * @return vpcId
     */
    public List<String> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
    }

    public ListPortsRequest withAllowedAddressPairs(List<String> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
        return this;
    }

    public ListPortsRequest addAllowedAddressPairsItem(String allowedAddressPairsItem) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        this.allowedAddressPairs.add(allowedAddressPairsItem);
        return this;
    }

    public ListPortsRequest withAllowedAddressPairs(Consumer<List<String>> allowedAddressPairsSetter) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        allowedAddressPairsSetter.accept(this.allowedAddressPairs);
        return this;
    }

    /**
     * **参数解释**： 端口的IP/Mac对列表。 **取值范围**： - allowed_address_pairs=ip_address={ip_address}，其中{ip_address}填IP地址，如192.168.21.22。 - allowed_address_pairs=mac_address={mac_address}，其中{mac_address}填MAC地址，如fa:16:3e:b1:da:62。
     * @return allowedAddressPairs
     */
    public List<String> getAllowedAddressPairs() {
        return allowedAddressPairs;
    }

    public void setAllowedAddressPairs(List<String> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
    }

    public ListPortsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**： 端口所属的云服务实例ID，例如RDS实例ID。 **取值范围**： 不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListPortsRequest withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * **参数解释**： 端口所属的云服务实例类型，例如“RDS”。 **取值范围**： 不涉及。
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPortsRequest that = (ListPortsRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.adminStateUp, that.adminStateUp) && Objects.equals(this.status, that.status)
            && Objects.equals(this.virsubnetId, that.virsubnetId) && Objects.equals(this.deviceId, that.deviceId)
            && Objects.equals(this.macAddress, that.macAddress) && Objects.equals(this.deviceOwner, that.deviceOwner)
            && Objects.equals(this.deviceOwnerPrefixlike, that.deviceOwnerPrefixlike)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.bindingHostId, that.bindingHostId)
            && Objects.equals(this.privateIps, that.privateIps)
            && Objects.equals(this.securityGroups, that.securityGroups) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.allowedAddressPairs, that.allowedAddressPairs)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceType, that.instanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            adminStateUp,
            status,
            virsubnetId,
            deviceId,
            macAddress,
            deviceOwner,
            deviceOwnerPrefixlike,
            description,
            bindingHostId,
            privateIps,
            securityGroups,
            vpcId,
            allowedAddressPairs,
            instanceId,
            instanceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPortsRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
        sb.append("    deviceOwnerPrefixlike: ").append(toIndentedString(deviceOwnerPrefixlike)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    bindingHostId: ").append(toIndentedString(bindingHostId)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    allowedAddressPairs: ").append(toIndentedString(allowedAddressPairs)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
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
