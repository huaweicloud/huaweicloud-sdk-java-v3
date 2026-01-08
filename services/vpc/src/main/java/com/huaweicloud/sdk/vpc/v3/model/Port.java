package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 功能说明：端口对象。
 */
public class Port {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding:host_id")

    private String bindingHostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding:profile")

    private Object bindingProfile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding:vif_details")

    private BindingVifDetails bindingVifDetails;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding:vif_type")

    private String bindingVifType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding:vnic_type")

    private String bindingVnicType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_id")

    private String deviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_owner")

    private String deviceOwner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_flavor")

    private String ecsFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_address")

    private String macAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_security_enabled")

    private Boolean portSecurityEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ips")

    private List<PrivateIpInfo> privateIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_tenant_id")

    private String vpcTenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vtep_ip")

    private String vtepIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_efi")

    private Boolean enableEfi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone_id")

    private String zoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding:migration_info")

    private Object bindingMigrationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_dhcp_opts")

    private List<PortExtraDhcpOpt> extraDhcpOpts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position_type")

    private String positionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_info")

    private Object instanceInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResponseTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_address_pairs")

    private List<AllowedAddressPair> allowedAddressPairs = null;

    public Port withAdminStateUp(Boolean adminStateUp) {
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

    public Port withBindingHostId(String bindingHostId) {
        this.bindingHostId = bindingHostId;
        return this;
    }

    /**
     * **参数解释**： 端口所在的主机ID。 **取值范围**： 不涉及。
     * @return bindingHostId
     */
    public String getBindingHostId() {
        return bindingHostId;
    }

    public void setBindingHostId(String bindingHostId) {
        this.bindingHostId = bindingHostId;
    }

    public Port withBindingProfile(Object bindingProfile) {
        this.bindingProfile = bindingProfile;
        return this;
    }

    /**
     * **参数解释**： 端口的用户自定义信息。 **取值范围**： 不涉及。
     * @return bindingProfile
     */
    public Object getBindingProfile() {
        return bindingProfile;
    }

    public void setBindingProfile(Object bindingProfile) {
        this.bindingProfile = bindingProfile;
    }

    public Port withBindingVifDetails(BindingVifDetails bindingVifDetails) {
        this.bindingVifDetails = bindingVifDetails;
        return this;
    }

    public Port withBindingVifDetails(Consumer<BindingVifDetails> bindingVifDetailsSetter) {
        if (this.bindingVifDetails == null) {
            this.bindingVifDetails = new BindingVifDetails();
            bindingVifDetailsSetter.accept(this.bindingVifDetails);
        }

        return this;
    }

    /**
     * Get bindingVifDetails
     * @return bindingVifDetails
     */
    public BindingVifDetails getBindingVifDetails() {
        return bindingVifDetails;
    }

    public void setBindingVifDetails(BindingVifDetails bindingVifDetails) {
        this.bindingVifDetails = bindingVifDetails;
    }

    public Port withBindingVifType(String bindingVifType) {
        this.bindingVifType = bindingVifType;
        return this;
    }

    /**
     * **参数解释**： 端口绑定的虚拟接口类型 (ovs/hw_veb等)，扩展属性。 **取值范围**： - ovs：表示使用 Open vSwitch（OVS）作为虚拟交换机 - bridge：表示使用 Linux 内核桥接（bridge）实现虚拟网络 - hw_veb：表示硬件虚拟以太网桥（Hardware Virtual Ethernet Bridge），通常用于支持 SR-IOV 的硬件网卡 - vhostuser：表示使用 vhost-user 协议（基于 Unix 域套接字）与外部虚拟交换机通信 - distributed：表示用于分布式虚拟交换机 - binding_failed：表示端口绑定失败 - unbound：表示该端口未绑定到任何网络后端
     * @return bindingVifType
     */
    public String getBindingVifType() {
        return bindingVifType;
    }

    public void setBindingVifType(String bindingVifType) {
        this.bindingVifType = bindingVifType;
    }

    public Port withBindingVnicType(String bindingVnicType) {
        this.bindingVnicType = bindingVnicType;
        return this;
    }

    /**
     * **参数解释**： 绑定的vNIC类型。 **取值范围**： - normal: 软交换。 - direct: SRIOV硬直通（不支持）。 - baremetal：用于裸金属服务器。
     * @return bindingVnicType
     */
    public String getBindingVnicType() {
        return bindingVnicType;
    }

    public void setBindingVnicType(String bindingVnicType) {
        this.bindingVnicType = bindingVnicType;
    }

    public Port withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**： 端口的创建时间。 **取值范围**： UTC时间，格式: yyyy-MM-ddTHH:mm:ss。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Port withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**： 端口的最近一次更新的时间。 **取值范围**： UTC时间，格式: yyyy-MM-ddTHH:mm:ss。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Port withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 端口的描述信息。 **取值范围**： 0-255个字符，不能包含“<”和“>”。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Port withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * **参数解释**： 端口所属的设备ID。 **取值范围**： 带“-”的标准UUID格式。
     * @return deviceId
     */
    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Port withDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
        return this;
    }

    /**
     * **参数解释**： 端口所属的设备名称。 **取值范围**： - network:dhcp, 表示DHCP服务 - network:router_interface_distributed, 表示子网网关地址 - compute:xxx, 表示云服务器网卡私有IP地址，其中XXX对应具体的可用区名称，例如compute:aa-bb-cc表示私有IP地址被可用区aa-bb-cc内的云服务器使用 - neutron:VIP_PORT, 表示虚拟IP地址 - neutron:LOADBALANCERV2, 表示共享型ELB - neutron:LOADBALANCERV3, 表示独享型ELB - network:endpoint_interface, 表示VPC终端节点 - network:nat_gateway, 表示NAT网关 - network:ucmp, 表示UCMP端口，为企业路由器服务所用
     * @return deviceOwner
     */
    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public Port withEcsFlavor(String ecsFlavor) {
        this.ecsFlavor = ecsFlavor;
        return this;
    }

    /**
     * **参数解释**： 标识此端口所属云服务器的flavor。 **取值范围**： 不涉及。
     * @return ecsFlavor
     */
    public String getEcsFlavor() {
        return ecsFlavor;
    }

    public void setEcsFlavor(String ecsFlavor) {
        this.ecsFlavor = ecsFlavor;
    }

    public Port withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 端口的资源ID。 **取值范围**： 带“-”的标准UUID格式。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Port withInstanceId(String instanceId) {
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

    public Port withInstanceType(String instanceType) {
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

    public Port withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * **参数解释**： 端口的MAC地址。 **取值范围**： 不涉及
     * @return macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public Port withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 端口的名称。 **取值范围**： 默认为空，最大长度不超过255。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Port withPortSecurityEnabled(Boolean portSecurityEnabled) {
        this.portSecurityEnabled = portSecurityEnabled;
        return this;
    }

    /**
     * **参数解释**： 端口的安全使能标记，如果不使能，则安全组和DHCP防欺骗不生效。 **取值范围**： - true：使能端口安全。 - false：未使能端口安全。
     * @return portSecurityEnabled
     */
    public Boolean getPortSecurityEnabled() {
        return portSecurityEnabled;
    }

    public void setPortSecurityEnabled(Boolean portSecurityEnabled) {
        this.portSecurityEnabled = portSecurityEnabled;
    }

    public Port withPrivateIps(List<PrivateIpInfo> privateIps) {
        this.privateIps = privateIps;
        return this;
    }

    public Port addPrivateIpsItem(PrivateIpInfo privateIpsItem) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        this.privateIps.add(privateIpsItem);
        return this;
    }

    public Port withPrivateIps(Consumer<List<PrivateIpInfo>> privateIpsSetter) {
        if (this.privateIps == null) {
            this.privateIps = new ArrayList<>();
        }
        privateIpsSetter.accept(this.privateIps);
        return this;
    }

    /**
     * **参数解释**： 端口的私有IP地址。 **取值范围**： 不涉及。
     * @return privateIps
     */
    public List<PrivateIpInfo> getPrivateIps() {
        return privateIps;
    }

    public void setPrivateIps(List<PrivateIpInfo> privateIps) {
        this.privateIps = privateIps;
    }

    public Port withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 端口所属的项目ID。 **取值范围**： 不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Port withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public Port addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public Port withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
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

    public Port withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 端口的状态。 **取值范围**： - ACTIVE：端口处于活动状态，可以正常进行网络通信。 - BUILD：端口正在创建或配置中。 - DOWN：端口处于非活动状态，不能进行网络通信。Hana 硬直通虚拟机端口状态总为DOWN。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Port withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释**： 端口所属的租户ID。 **取值范围**： 不涉及。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public Port withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * **参数解释**： 端口所在的虚拟子网ID。 **取值范围**： 带“-”的标准UUID格式。
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public Port withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释**： 端口所在的VPC的ID。 **取值范围**： 带“-”的标准UUID格式。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public Port withVpcTenantId(String vpcTenantId) {
        this.vpcTenantId = vpcTenantId;
        return this;
    }

    /**
     * **参数解释**： 端口所在的VPC的租户ID。 **取值范围**： 不涉及。
     * @return vpcTenantId
     */
    public String getVpcTenantId() {
        return vpcTenantId;
    }

    public void setVpcTenantId(String vpcTenantId) {
        this.vpcTenantId = vpcTenantId;
    }

    public Port withVtepIp(String vtepIp) {
        this.vtepIp = vtepIp;
        return this;
    }

    /**
     * **参数解释**： 端口的VTEP IP地址，即虚拟隧道端点的 IP 地址。 **取值范围**： 不涉及。
     * @return vtepIp
     */
    public String getVtepIp() {
        return vtepIp;
    }

    public void setVtepIp(String vtepIp) {
        this.vtepIp = vtepIp;
    }

    public Port withEnableEfi(Boolean enableEfi) {
        this.enableEfi = enableEfi;
        return this;
    }

    /**
     * **参数解释**： 是否使能efi，使能则表示端口支持vRoCE能力。 **取值范围**： - true：使能efi。 - false：未使能efi。
     * @return enableEfi
     */
    public Boolean getEnableEfi() {
        return enableEfi;
    }

    public void setEnableEfi(Boolean enableEfi) {
        this.enableEfi = enableEfi;
    }

    public Port withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数解释**： 端口所在子网的作用域（边缘云场景）。 **取值范围**： - center：表示作用域为中心。 - {publicBorderGroup}：表示作用域为具体的公网边界组。公网边界组限制子网的可用区范围，可关联多个边缘可用区。
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Port withZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }

    /**
     * **参数解释**： 端口所属的可用分区的ID。 **取值范围**： 不涉及。
     * @return zoneId
     */
    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Port withBindingMigrationInfo(Object bindingMigrationInfo) {
        this.bindingMigrationInfo = bindingMigrationInfo;
        return this;
    }

    /**
     * **参数解释**： 端口迁移的目的节点信息，包括目的节点的binding:vif_details和binding:vif_type。 **取值范围**： 不涉及。
     * @return bindingMigrationInfo
     */
    public Object getBindingMigrationInfo() {
        return bindingMigrationInfo;
    }

    public void setBindingMigrationInfo(Object bindingMigrationInfo) {
        this.bindingMigrationInfo = bindingMigrationInfo;
    }

    public Port withExtraDhcpOpts(List<PortExtraDhcpOpt> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
        return this;
    }

    public Port addExtraDhcpOptsItem(PortExtraDhcpOpt extraDhcpOptsItem) {
        if (this.extraDhcpOpts == null) {
            this.extraDhcpOpts = new ArrayList<>();
        }
        this.extraDhcpOpts.add(extraDhcpOptsItem);
        return this;
    }

    public Port withExtraDhcpOpts(Consumer<List<PortExtraDhcpOpt>> extraDhcpOptsSetter) {
        if (this.extraDhcpOpts == null) {
            this.extraDhcpOpts = new ArrayList<>();
        }
        extraDhcpOptsSetter.accept(this.extraDhcpOpts);
        return this;
    }

    /**
     * **参数解释**： DHCP的扩展属性。 **取值范围**： 不涉及。
     * @return extraDhcpOpts
     */
    public List<PortExtraDhcpOpt> getExtraDhcpOpts() {
        return extraDhcpOpts;
    }

    public void setExtraDhcpOpts(List<PortExtraDhcpOpt> extraDhcpOpts) {
        this.extraDhcpOpts = extraDhcpOpts;
    }

    public Port withPositionType(String positionType) {
        this.positionType = positionType;
        return this;
    }

    /**
     * **参数解释**： 边缘场景端口的位置类型。 **取值范围**： 默认值center。
     * @return positionType
     */
    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public Port withInstanceInfo(Object instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }

    /**
     * **参数解释**： 端口绑定的实例信息。 **取值范围**： 不涉及。
     * @return instanceInfo
     */
    public Object getInstanceInfo() {
        return instanceInfo;
    }

    public void setInstanceInfo(Object instanceInfo) {
        this.instanceInfo = instanceInfo;
    }

    public Port withTags(List<ResponseTag> tags) {
        this.tags = tags;
        return this;
    }

    public Port addTagsItem(ResponseTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Port withTags(Consumer<List<ResponseTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**： 端口的标签信息，包括标签键和标签值，可用来分类和标识资源。详情请参见Tag对象。 **取值范围**： 不涉及。
     * @return tags
     */
    public List<ResponseTag> getTags() {
        return tags;
    }

    public void setTags(List<ResponseTag> tags) {
        this.tags = tags;
    }

    public Port withAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
        return this;
    }

    public Port addAllowedAddressPairsItem(AllowedAddressPair allowedAddressPairsItem) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        this.allowedAddressPairs.add(allowedAddressPairsItem);
        return this;
    }

    public Port withAllowedAddressPairs(Consumer<List<AllowedAddressPair>> allowedAddressPairsSetter) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        allowedAddressPairsSetter.accept(this.allowedAddressPairs);
        return this;
    }

    /**
     * **参数解释**： 端口的IP/Mac对列表。 **取值范围**： - IP地址不允许为 “0.0.0.0/0”。 - 如果allowed_address_pairs配置地址池较大的IP网段（掩码小于24位），建议为该端口配置一个单独的安全组。 - 如果allowed_address_pairs的IP地址为“1.1.1.1/0”，表示关闭源目地址检查开关。 - 被绑定的云服务器网卡allowed_address_pairs的IP地址填“1.1.1.1/0”。
     * @return allowedAddressPairs
     */
    public List<AllowedAddressPair> getAllowedAddressPairs() {
        return allowedAddressPairs;
    }

    public void setAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Port that = (Port) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.bindingHostId, that.bindingHostId)
            && Objects.equals(this.bindingProfile, that.bindingProfile)
            && Objects.equals(this.bindingVifDetails, that.bindingVifDetails)
            && Objects.equals(this.bindingVifType, that.bindingVifType)
            && Objects.equals(this.bindingVnicType, that.bindingVnicType)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.description, that.description) && Objects.equals(this.deviceId, that.deviceId)
            && Objects.equals(this.deviceOwner, that.deviceOwner) && Objects.equals(this.ecsFlavor, that.ecsFlavor)
            && Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceType, that.instanceType) && Objects.equals(this.macAddress, that.macAddress)
            && Objects.equals(this.name, that.name)
            && Objects.equals(this.portSecurityEnabled, that.portSecurityEnabled)
            && Objects.equals(this.privateIps, that.privateIps) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.securityGroups, that.securityGroups) && Objects.equals(this.status, that.status)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.virsubnetId, that.virsubnetId)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.vpcTenantId, that.vpcTenantId)
            && Objects.equals(this.vtepIp, that.vtepIp) && Objects.equals(this.enableEfi, that.enableEfi)
            && Objects.equals(this.scope, that.scope) && Objects.equals(this.zoneId, that.zoneId)
            && Objects.equals(this.bindingMigrationInfo, that.bindingMigrationInfo)
            && Objects.equals(this.extraDhcpOpts, that.extraDhcpOpts)
            && Objects.equals(this.positionType, that.positionType)
            && Objects.equals(this.instanceInfo, that.instanceInfo) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.allowedAddressPairs, that.allowedAddressPairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            bindingHostId,
            bindingProfile,
            bindingVifDetails,
            bindingVifType,
            bindingVnicType,
            createdAt,
            updatedAt,
            description,
            deviceId,
            deviceOwner,
            ecsFlavor,
            id,
            instanceId,
            instanceType,
            macAddress,
            name,
            portSecurityEnabled,
            privateIps,
            projectId,
            securityGroups,
            status,
            tenantId,
            virsubnetId,
            vpcId,
            vpcTenantId,
            vtepIp,
            enableEfi,
            scope,
            zoneId,
            bindingMigrationInfo,
            extraDhcpOpts,
            positionType,
            instanceInfo,
            tags,
            allowedAddressPairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Port {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    bindingHostId: ").append(toIndentedString(bindingHostId)).append("\n");
        sb.append("    bindingProfile: ").append(toIndentedString(bindingProfile)).append("\n");
        sb.append("    bindingVifDetails: ").append(toIndentedString(bindingVifDetails)).append("\n");
        sb.append("    bindingVifType: ").append(toIndentedString(bindingVifType)).append("\n");
        sb.append("    bindingVnicType: ").append(toIndentedString(bindingVnicType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    deviceOwner: ").append(toIndentedString(deviceOwner)).append("\n");
        sb.append("    ecsFlavor: ").append(toIndentedString(ecsFlavor)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    portSecurityEnabled: ").append(toIndentedString(portSecurityEnabled)).append("\n");
        sb.append("    privateIps: ").append(toIndentedString(privateIps)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vpcTenantId: ").append(toIndentedString(vpcTenantId)).append("\n");
        sb.append("    vtepIp: ").append(toIndentedString(vtepIp)).append("\n");
        sb.append("    enableEfi: ").append(toIndentedString(enableEfi)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    zoneId: ").append(toIndentedString(zoneId)).append("\n");
        sb.append("    bindingMigrationInfo: ").append(toIndentedString(bindingMigrationInfo)).append("\n");
        sb.append("    extraDhcpOpts: ").append(toIndentedString(extraDhcpOpts)).append("\n");
        sb.append("    positionType: ").append(toIndentedString(positionType)).append("\n");
        sb.append("    instanceInfo: ").append(toIndentedString(instanceInfo)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    allowedAddressPairs: ").append(toIndentedString(allowedAddressPairs)).append("\n");
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
