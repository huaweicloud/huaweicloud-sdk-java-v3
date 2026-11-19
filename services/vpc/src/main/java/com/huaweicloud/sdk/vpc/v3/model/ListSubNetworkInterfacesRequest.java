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
public class ListSubNetworkInterfacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private List<String> virsubnetId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private List<String> privateIpAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_address")

    private List<String> macAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private List<String> vpcId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private List<String> description = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private List<String> parentId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_eip")

    private Boolean enableEip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_device_id")

    private List<String> parentDeviceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vlan_id")

    private List<Integer> vlanId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private List<String> state = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_ip_address")

    private List<String> ipv6IpAddress = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private List<String> instanceId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private List<String> instanceType = null;

    public ListSubNetworkInterfacesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 功能说明：每页返回的个数 取值范围：0-2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSubNetworkInterfacesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页查询起始的资源ID，为空时查询第一页
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListSubNetworkInterfacesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListSubNetworkInterfacesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡ID，支持多ID过滤 使用场景：查询需要的多个辅助弹性网卡信息
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListSubNetworkInterfacesRequest withVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    public ListSubNetworkInterfacesRequest addVirsubnetIdItem(String virsubnetIdItem) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        this.virsubnetId.add(virsubnetIdItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withVirsubnetId(Consumer<List<String>> virsubnetIdSetter) {
        if (this.virsubnetId == null) {
            this.virsubnetId = new ArrayList<>();
        }
        virsubnetIdSetter.accept(this.virsubnetId);
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡所属虚拟子网的ID，支持多个ID过滤 使用场景：过滤需要的单个或者多个虚拟子网下的辅助弹性网卡
     * @return virsubnetId
     */
    public List<String> getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(List<String> virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public ListSubNetworkInterfacesRequest withPrivateIpAddress(List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    public ListSubNetworkInterfacesRequest addPrivateIpAddressItem(String privateIpAddressItem) {
        if (this.privateIpAddress == null) {
            this.privateIpAddress = new ArrayList<>();
        }
        this.privateIpAddress.add(privateIpAddressItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withPrivateIpAddress(Consumer<List<String>> privateIpAddressSetter) {
        if (this.privateIpAddress == null) {
            this.privateIpAddress = new ArrayList<>();
        }
        privateIpAddressSetter.accept(this.privateIpAddress);
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的私有IPv4地址，支持多个地址同时过滤 使用场景：通过单个或者多个ip地址过滤查询辅助弹性网卡
     * @return privateIpAddress
     */
    public List<String> getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(List<String> privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public ListSubNetworkInterfacesRequest withMacAddress(List<String> macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    public ListSubNetworkInterfacesRequest addMacAddressItem(String macAddressItem) {
        if (this.macAddress == null) {
            this.macAddress = new ArrayList<>();
        }
        this.macAddress.add(macAddressItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withMacAddress(Consumer<List<String>> macAddressSetter) {
        if (this.macAddress == null) {
            this.macAddress = new ArrayList<>();
        }
        macAddressSetter.accept(this.macAddress);
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的mac地址，支持多个同时过滤 使用场景：使用mac地址精确过滤辅助弹性网卡
     * @return macAddress
     */
    public List<String> getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(List<String> macAddress) {
        this.macAddress = macAddress;
    }

    public ListSubNetworkInterfacesRequest withVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    public ListSubNetworkInterfacesRequest addVpcIdItem(String vpcIdItem) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        this.vpcId.add(vpcIdItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withVpcId(Consumer<List<String>> vpcIdSetter) {
        if (this.vpcId == null) {
            this.vpcId = new ArrayList<>();
        }
        vpcIdSetter.accept(this.vpcId);
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡所属的VPC_ID，支持多ID过滤 使用场景：过滤单个或多个VPC下的辅助弹性网卡信息
     * @return vpcId
     */
    public List<String> getVpcId() {
        return vpcId;
    }

    public void setVpcId(List<String> vpcId) {
        this.vpcId = vpcId;
    }

    public ListSubNetworkInterfacesRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    public ListSubNetworkInterfacesRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的描述信息，支持多个同时过滤 使用场景：通过描述信息过滤辅助弹性网卡
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListSubNetworkInterfacesRequest withParentId(List<String> parentId) {
        this.parentId = parentId;
        return this;
    }

    public ListSubNetworkInterfacesRequest addParentIdItem(String parentIdItem) {
        if (this.parentId == null) {
            this.parentId = new ArrayList<>();
        }
        this.parentId.add(parentIdItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withParentId(Consumer<List<String>> parentIdSetter) {
        if (this.parentId == null) {
            this.parentId = new ArrayList<>();
        }
        parentIdSetter.accept(this.parentId);
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的宿主网卡的ID，支持多ID过滤 使用场景：过滤单个或多个宿主网卡下存在的辅助弹性网卡
     * @return parentId
     */
    public List<String> getParentId() {
        return parentId;
    }

    public void setParentId(List<String> parentId) {
        this.parentId = parentId;
    }

    public ListSubNetworkInterfacesRequest withEnableEip(Boolean enableEip) {
        this.enableEip = enableEip;
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡是否关联EIP，可以通过此字段过滤辅助弹性网卡，不支持传入多个值进行过滤。 **取值范围**：   - true：辅助弹性网卡已关联EIP   - false：辅助弹性网卡未关联EIP **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * @return enableEip
     */
    public Boolean getEnableEip() {
        return enableEip;
    }

    public void setEnableEip(Boolean enableEip) {
        this.enableEip = enableEip;
    }

    public ListSubNetworkInterfacesRequest withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡所在站点的公网出口信息，可以通过此字段过滤辅助弹性网卡。 **取值范围**： 不涉及。 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public ListSubNetworkInterfacesRequest withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public ListSubNetworkInterfacesRequest addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡关联的安全组ID，可以通过此字段过滤辅助弹性网卡，支持传入多个安全组ID过滤。[获取方式请参见[查询安全组列表](vpc_apiv3_0011.xml)。](tag:hws,hws_hk,hws_test) **取值范围**： 不涉及。 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ListSubNetworkInterfacesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡所属企业项目的ID。可以使用该字段过滤某个企业项目下的辅助弹性网卡。 **取值范围**： - 最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。 - 若需要查询当前用户所有企业项目绑定的辅助弹性网卡，请传参all_granted_eps。 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListSubNetworkInterfacesRequest withParentDeviceId(List<String> parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
        return this;
    }

    public ListSubNetworkInterfacesRequest addParentDeviceIdItem(String parentDeviceIdItem) {
        if (this.parentDeviceId == null) {
            this.parentDeviceId = new ArrayList<>();
        }
        this.parentDeviceId.add(parentDeviceIdItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withParentDeviceId(Consumer<List<String>> parentDeviceIdSetter) {
        if (this.parentDeviceId == null) {
            this.parentDeviceId = new ArrayList<>();
        }
        parentDeviceIdSetter.accept(this.parentDeviceId);
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡的宿主网卡所属的设备ID，可以通过此字段过滤辅助弹性网卡，支持传入多个ID过滤。 **取值范围**： 不涉及。 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * @return parentDeviceId
     */
    public List<String> getParentDeviceId() {
        return parentDeviceId;
    }

    public void setParentDeviceId(List<String> parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
    }

    public ListSubNetworkInterfacesRequest withVlanId(List<Integer> vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    public ListSubNetworkInterfacesRequest addVlanIdItem(Integer vlanIdItem) {
        if (this.vlanId == null) {
            this.vlanId = new ArrayList<>();
        }
        this.vlanId.add(vlanIdItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withVlanId(Consumer<List<Integer>> vlanIdSetter) {
        if (this.vlanId == null) {
            this.vlanId = new ArrayList<>();
        }
        vlanIdSetter.accept(this.vlanId);
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡的VLAN ID，可以通过此字段过滤辅助弹性网卡，支持传入多个VLAN ID过滤。 **取值范围**： 1-4094。 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * @return vlanId
     */
    public List<Integer> getVlanId() {
        return vlanId;
    }

    public void setVlanId(List<Integer> vlanId) {
        this.vlanId = vlanId;
    }

    public ListSubNetworkInterfacesRequest withState(List<String> state) {
        this.state = state;
        return this;
    }

    public ListSubNetworkInterfacesRequest addStateItem(String stateItem) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        this.state.add(stateItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withState(Consumer<List<String>> stateSetter) {
        if (this.state == null) {
            this.state = new ArrayList<>();
        }
        stateSetter.accept(this.state);
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡的状态，可以通过此字段过滤辅助弹性网卡，支持传入多个状态过滤。 **取值范围**： NORMAL：过滤出已挂载在弹性网卡上的辅助弹性网卡 UNBOUND：过滤出未挂载在弹性网卡上的辅助弹性网卡 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * @return state
     */
    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

    public ListSubNetworkInterfacesRequest withIpv6IpAddress(List<String> ipv6IpAddress) {
        this.ipv6IpAddress = ipv6IpAddress;
        return this;
    }

    public ListSubNetworkInterfacesRequest addIpv6IpAddressItem(String ipv6IpAddressItem) {
        if (this.ipv6IpAddress == null) {
            this.ipv6IpAddress = new ArrayList<>();
        }
        this.ipv6IpAddress.add(ipv6IpAddressItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withIpv6IpAddress(Consumer<List<String>> ipv6IpAddressSetter) {
        if (this.ipv6IpAddress == null) {
            this.ipv6IpAddress = new ArrayList<>();
        }
        ipv6IpAddressSetter.accept(this.ipv6IpAddress);
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡的IPv6地址，可以通过此字段过滤辅助弹性网卡，支持传入多个IP地址过滤。 **取值范围**： 不涉及。 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * @return ipv6IpAddress
     */
    public List<String> getIpv6IpAddress() {
        return ipv6IpAddress;
    }

    public void setIpv6IpAddress(List<String> ipv6IpAddress) {
        this.ipv6IpAddress = ipv6IpAddress;
    }

    public ListSubNetworkInterfacesRequest withInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    public ListSubNetworkInterfacesRequest addInstanceIdItem(String instanceIdItem) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        this.instanceId.add(instanceIdItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withInstanceId(Consumer<List<String>> instanceIdSetter) {
        if (this.instanceId == null) {
            this.instanceId = new ArrayList<>();
        }
        instanceIdSetter.accept(this.instanceId);
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡所属云服务实例的ID，例如RDS实例的ID，可以通过此字段过滤辅助弹性网卡，支持传入多个ID过滤。 **取值范围**： 不涉及。 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceId
     */
    public List<String> getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(List<String> instanceId) {
        this.instanceId = instanceId;
    }

    public ListSubNetworkInterfacesRequest withInstanceType(List<String> instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    public ListSubNetworkInterfacesRequest addInstanceTypeItem(String instanceTypeItem) {
        if (this.instanceType == null) {
            this.instanceType = new ArrayList<>();
        }
        this.instanceType.add(instanceTypeItem);
        return this;
    }

    public ListSubNetworkInterfacesRequest withInstanceType(Consumer<List<String>> instanceTypeSetter) {
        if (this.instanceType == null) {
            this.instanceType = new ArrayList<>();
        }
        instanceTypeSetter.accept(this.instanceType);
        return this;
    }

    /**
     * **参数解释**： 辅助弹性网卡所属云服务实例的类型，例如“RDS”，可以通过此字段过滤辅助弹性网卡，支持传入多个实例类型过滤。 **取值范围**： 不涉及。 **约束限制**： 不涉及。 **默认取值**： 不涉及。
     * @return instanceType
     */
    public List<String> getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(List<String> instanceType) {
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
        ListSubNetworkInterfacesRequest that = (ListSubNetworkInterfacesRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.id, that.id) && Objects.equals(this.virsubnetId, that.virsubnetId)
            && Objects.equals(this.privateIpAddress, that.privateIpAddress)
            && Objects.equals(this.macAddress, that.macAddress) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.enableEip, that.enableEip) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.parentDeviceId, that.parentDeviceId) && Objects.equals(this.vlanId, that.vlanId)
            && Objects.equals(this.state, that.state) && Objects.equals(this.ipv6IpAddress, that.ipv6IpAddress)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceType, that.instanceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            marker,
            id,
            virsubnetId,
            privateIpAddress,
            macAddress,
            vpcId,
            description,
            parentId,
            enableEip,
            scope,
            securityGroups,
            enterpriseProjectId,
            parentDeviceId,
            vlanId,
            state,
            ipv6IpAddress,
            instanceId,
            instanceType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubNetworkInterfacesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    enableEip: ").append(toIndentedString(enableEip)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    parentDeviceId: ").append(toIndentedString(parentDeviceId)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    ipv6IpAddress: ").append(toIndentedString(ipv6IpAddress)).append("\n");
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
