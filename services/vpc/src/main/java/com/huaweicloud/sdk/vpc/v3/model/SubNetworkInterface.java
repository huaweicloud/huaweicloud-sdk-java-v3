package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class SubNetworkInterface {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip_address")

    private String privateIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_ip_address")

    private String ipv6IpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mac_address")

    private String macAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_device_id")

    private String parentDeviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vlan_id")

    private Integer vlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowed_address_pairs")

    private List<AllowedAddressPair> allowedAddressPairs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_type")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_enabled")

    private Boolean securityEnabled;

    public SubNetworkInterface withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的唯一标识 取值范围：带(-)的标准UUID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubNetworkInterface withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * 功能说明：虚拟子网ID 取值范围：标准UUID
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public SubNetworkInterface withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的私有IPv4地址 取值范围：必须在虚拟子网的网段内，不填则随机在虚拟子网网段内随机分配
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public SubNetworkInterface withIpv6IpAddress(String ipv6IpAddress) {
        this.ipv6IpAddress = ipv6IpAddress;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的IPv6地址
     * @return ipv6IpAddress
     */
    public String getIpv6IpAddress() {
        return ipv6IpAddress;
    }

    public void setIpv6IpAddress(String ipv6IpAddress) {
        this.ipv6IpAddress = ipv6IpAddress;
    }

    public SubNetworkInterface withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的mac地址 取值范围：合法的mac地址，系统随机分配
     * @return macAddress
     */
    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public SubNetworkInterface withParentDeviceId(String parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
        return this;
    }

    /**
     * 功能说明：设备ID 取值范围：标准UUID 
     * @return parentDeviceId
     */
    public String getParentDeviceId() {
        return parentDeviceId;
    }

    public void setParentDeviceId(String parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
    }

    public SubNetworkInterface withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 功能说明：宿主网络接口的ID 取值范围：标准UUID
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public SubNetworkInterface withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的描述信息 取值范围：0-255个字符，不能包含“<”和“>”
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SubNetworkInterface withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡所属的VPC_ID 取值范围：标准UUID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public SubNetworkInterface withVlanId(Integer vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的VLAN ID 取值范围：1-4094 约束：同一个宿主网络接口下唯一
     * @return vlanId
     */
    public Integer getVlanId() {
        return vlanId;
    }

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    public SubNetworkInterface withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public SubNetworkInterface addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public SubNetworkInterface withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 功能说明：安全组的ID列表；例如：\"security_groups\": [\"a0608cbf-d047-4f54-8b28-cd7b59853fff\"] 取值范围：默认值为系统默认安全组
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public SubNetworkInterface withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public SubNetworkInterface addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public SubNetworkInterface withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的标签列表
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public SubNetworkInterface withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡所属项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public SubNetworkInterface withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡的创建时间 取值范围：UTC时间格式：yyyy-MM-ddTHH:mm:ss
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public SubNetworkInterface withAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
        return this;
    }

    public SubNetworkInterface addAllowedAddressPairsItem(AllowedAddressPair allowedAddressPairsItem) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        this.allowedAddressPairs.add(allowedAddressPairsItem);
        return this;
    }

    public SubNetworkInterface withAllowedAddressPairs(Consumer<List<AllowedAddressPair>> allowedAddressPairsSetter) {
        if (this.allowedAddressPairs == null) {
            this.allowedAddressPairs = new ArrayList<>();
        }
        allowedAddressPairsSetter.accept(this.allowedAddressPairs);
        return this;
    }

    /**
     * 1. 扩展属性：IP/Mac对列表，allowed_address_pair参见“allowed_address_pair对象” 2. 使用说明: IP地址不允许为 “0.0.0.0”如果allowed_address_pairs配置地址池较大的CIDR（掩码小于24位），建议为该port配置一个单独的安全组硬件SDN环境不支持ip_address属性配置为CIDR
     * @return allowedAddressPairs
     */
    public List<AllowedAddressPair> getAllowedAddressPairs() {
        return allowedAddressPairs;
    }

    public void setAllowedAddressPairs(List<AllowedAddressPair> allowedAddressPairs) {
        this.allowedAddressPairs = allowedAddressPairs;
    }

    public SubNetworkInterface withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡当前状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SubNetworkInterface withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡所属实例ID，例如RDS实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SubNetworkInterface withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡所属实例类型，例如“RDS”
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public SubNetworkInterface withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡所在站点的公网出口信息
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public SubNetworkInterface withSecurityEnabled(Boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
        return this;
    }

    /**
     * 功能说明：辅助弹性网卡安全使能标记，如果不使能则安全组不生效。 取值范围：true（使能），false（不使能）
     * @return securityEnabled
     */
    public Boolean getSecurityEnabled() {
        return securityEnabled;
    }

    public void setSecurityEnabled(Boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubNetworkInterface that = (SubNetworkInterface) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.virsubnetId, that.virsubnetId)
            && Objects.equals(this.privateIpAddress, that.privateIpAddress)
            && Objects.equals(this.ipv6IpAddress, that.ipv6IpAddress)
            && Objects.equals(this.macAddress, that.macAddress)
            && Objects.equals(this.parentDeviceId, that.parentDeviceId) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.description, that.description) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.vlanId, that.vlanId) && Objects.equals(this.securityGroups, that.securityGroups)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.allowedAddressPairs, that.allowedAddressPairs)
            && Objects.equals(this.state, that.state) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceType, that.instanceType) && Objects.equals(this.scope, that.scope)
            && Objects.equals(this.securityEnabled, that.securityEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            virsubnetId,
            privateIpAddress,
            ipv6IpAddress,
            macAddress,
            parentDeviceId,
            parentId,
            description,
            vpcId,
            vlanId,
            securityGroups,
            tags,
            projectId,
            createdAt,
            allowedAddressPairs,
            state,
            instanceId,
            instanceType,
            scope,
            securityEnabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubNetworkInterface {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    privateIpAddress: ").append(toIndentedString(privateIpAddress)).append("\n");
        sb.append("    ipv6IpAddress: ").append(toIndentedString(ipv6IpAddress)).append("\n");
        sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
        sb.append("    parentDeviceId: ").append(toIndentedString(parentDeviceId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    allowedAddressPairs: ").append(toIndentedString(allowedAddressPairs)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    securityEnabled: ").append(toIndentedString(securityEnabled)).append("\n");
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
