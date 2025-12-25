package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 云弹性公网IP
 */
public class HwcEip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private String alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_status")

    private String protectedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip_address")

    private String publicIpAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ipv6_address")

    private String publicIpv6Address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pool_name")

    private String publicipPoolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip_pool_id")

    private String publicipPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vnic")

    private HwcEipVnic vnic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private HwcEipBandwidth bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_status")

    private String lockStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_type")

    private String associateInstanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associate_instance_id")

    private String associateInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allow_share_bandwidth_types")

    private List<String> allowShareBandwidthTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_border_group")

    private String publicBorderGroup;

    public HwcEip withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 弹性公网IP唯一标识
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HwcEip withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    /**
     * 弹性公网IP名称
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public HwcEip withProtectedStatus(String protectedStatus) {
        this.protectedStatus = protectedStatus;
        return this;
    }

    /**
     * DDoss或CFW开启状态：OPEN | CLOSE
     * @return protectedStatus
     */
    public String getProtectedStatus() {
        return protectedStatus;
    }

    public void setProtectedStatus(String protectedStatus) {
        this.protectedStatus = protectedStatus;
    }

    public HwcEip withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public HwcEip withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public HwcEip withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * IP版本信息 取值范围： 4：公网IP地址为public_ip_address地址 6：公网IP地址为public_ipv6_address地址
     * minimum: 4
     * maximum: 6
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public HwcEip withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * 弹性公网IP或者IPv6端口的地址
     * @return publicIpAddress
     */
    public String getPublicIpAddress() {
        return publicIpAddress;
    }

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    public HwcEip withPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
        return this;
    }

    /**
     * IPv4时无此字段，IPv6时为申请到的弹性公网IP
     * @return publicIpv6Address
     */
    public String getPublicIpv6Address() {
        return publicIpv6Address;
    }

    public void setPublicIpv6Address(String publicIpv6Address) {
        this.publicIpv6Address = publicIpv6Address;
    }

    public HwcEip withPublicipPoolName(String publicipPoolName) {
        this.publicipPoolName = publicipPoolName;
        return this;
    }

    /**
     * 弹性公网IP的网络类型, 包括公共池类型，如5_bgp/5_sbgp...，和用户购买的专属池。
     * @return publicipPoolName
     */
    public String getPublicipPoolName() {
        return publicipPoolName;
    }

    public void setPublicipPoolName(String publicipPoolName) {
        this.publicipPoolName = publicipPoolName;
    }

    public HwcEip withPublicipPoolId(String publicipPoolId) {
        this.publicipPoolId = publicipPoolId;
        return this;
    }

    /**
     * 公网IP所属网络的ID，publicip_pool_name对应的网络ID
     * @return publicipPoolId
     */
    public String getPublicipPoolId() {
        return publicipPoolId;
    }

    public void setPublicipPoolId(String publicipPoolId) {
        this.publicipPoolId = publicipPoolId;
    }

    public HwcEip withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 弹性公网IP的状态 取值范围： FREEZED：冻结 BIND_ERROR：绑定失败 BINDING：绑定中 PENDING_DELETE：释放中 PENDING_CREATE：创建中 NOTIFYING：创建中 NOTIFY_DELETE：释放中 PENDING_UPDATE：更新中 DOWN：未绑定 ACTIVE：绑定 ELB：绑定ELB VPN：绑定VPN ERROR：失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HwcEip withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 弹性公网IP描述信息
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HwcEip withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public HwcEip addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public HwcEip withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 功能说明：用户标签。（默认不显示）
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public HwcEip withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 弹性公网IP类型 枚举值： EIP DUALSTACK DUALSTACK_SUBNET
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HwcEip withVnic(HwcEipVnic vnic) {
        this.vnic = vnic;
        return this;
    }

    public HwcEip withVnic(Consumer<HwcEipVnic> vnicSetter) {
        if (this.vnic == null) {
            this.vnic = new HwcEipVnic();
            vnicSetter.accept(this.vnic);
        }

        return this;
    }

    /**
     * Get vnic
     * @return vnic
     */
    public HwcEipVnic getVnic() {
        return vnic;
    }

    public void setVnic(HwcEipVnic vnic) {
        this.vnic = vnic;
    }

    public HwcEip withBandwidth(HwcEipBandwidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public HwcEip withBandwidth(Consumer<HwcEipBandwidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new HwcEipBandwidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public HwcEipBandwidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(HwcEipBandwidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    public HwcEip withLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * 记录公网IP当前的冻结状态 约束：metadata类型，标识欠费冻结、公安冻结 取值范围： police locked
     * @return lockStatus
     */
    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public HwcEip withAssociateInstanceType(String associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
        return this;
    }

    /**
     * 公网IP绑定的实例类型 取值范围： PORT NATGW ELB ELBV1 VPN null
     * @return associateInstanceType
     */
    public String getAssociateInstanceType() {
        return associateInstanceType;
    }

    public void setAssociateInstanceType(String associateInstanceType) {
        this.associateInstanceType = associateInstanceType;
    }

    public HwcEip withAssociateInstanceId(String associateInstanceId) {
        this.associateInstanceId = associateInstanceId;
        return this;
    }

    /**
     * 公网IP绑定的实例ID
     * @return associateInstanceId
     */
    public String getAssociateInstanceId() {
        return associateInstanceId;
    }

    public void setAssociateInstanceId(String associateInstanceId) {
        this.associateInstanceId = associateInstanceId;
    }

    public HwcEip withAllowShareBandwidthTypes(List<String> allowShareBandwidthTypes) {
        this.allowShareBandwidthTypes = allowShareBandwidthTypes;
        return this;
    }

    public HwcEip addAllowShareBandwidthTypesItem(String allowShareBandwidthTypesItem) {
        if (this.allowShareBandwidthTypes == null) {
            this.allowShareBandwidthTypes = new ArrayList<>();
        }
        this.allowShareBandwidthTypes.add(allowShareBandwidthTypesItem);
        return this;
    }

    public HwcEip withAllowShareBandwidthTypes(Consumer<List<String>> allowShareBandwidthTypesSetter) {
        if (this.allowShareBandwidthTypes == null) {
            this.allowShareBandwidthTypes = new ArrayList<>();
        }
        allowShareBandwidthTypesSetter.accept(this.allowShareBandwidthTypes);
        return this;
    }

    /**
     * 表示此publicip可以加入的共享带宽类型列表，如果为空列表，则表示该 publicip不能加入任何共享带宽 约束：publicip只能加入到有该带宽类型的共享带宽中
     * @return allowShareBandwidthTypes
     */
    public List<String> getAllowShareBandwidthTypes() {
        return allowShareBandwidthTypes;
    }

    public void setAllowShareBandwidthTypes(List<String> allowShareBandwidthTypes) {
        this.allowShareBandwidthTypes = allowShareBandwidthTypes;
    }

    public HwcEip withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 资产创建UTC时间 格式：yyyy-MM-ddTHH:mm:ssZ
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public HwcEip withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 资产更新UTC时间 格式：yyyy-MM-ddTHH:mm:ssZ
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public HwcEip withPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
        return this;
    }

    /**
     * 表示中心站点资产或者边缘站点资产 取值范围： center、边缘站点名称 约束：publicip只能绑定该字段相同的资产
     * @return publicBorderGroup
     */
    public String getPublicBorderGroup() {
        return publicBorderGroup;
    }

    public void setPublicBorderGroup(String publicBorderGroup) {
        this.publicBorderGroup = publicBorderGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HwcEip that = (HwcEip) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.protectedStatus, that.protectedStatus)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.publicIpAddress, that.publicIpAddress)
            && Objects.equals(this.publicIpv6Address, that.publicIpv6Address)
            && Objects.equals(this.publicipPoolName, that.publicipPoolName)
            && Objects.equals(this.publicipPoolId, that.publicipPoolId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.description, that.description) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.type, that.type) && Objects.equals(this.vnic, that.vnic)
            && Objects.equals(this.bandwidth, that.bandwidth) && Objects.equals(this.lockStatus, that.lockStatus)
            && Objects.equals(this.associateInstanceType, that.associateInstanceType)
            && Objects.equals(this.associateInstanceId, that.associateInstanceId)
            && Objects.equals(this.allowShareBandwidthTypes, that.allowShareBandwidthTypes)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.publicBorderGroup, that.publicBorderGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            alias,
            protectedStatus,
            projectId,
            enterpriseProjectId,
            ipVersion,
            publicIpAddress,
            publicIpv6Address,
            publicipPoolName,
            publicipPoolId,
            status,
            description,
            tags,
            type,
            vnic,
            bandwidth,
            lockStatus,
            associateInstanceType,
            associateInstanceId,
            allowShareBandwidthTypes,
            createdAt,
            updatedAt,
            publicBorderGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HwcEip {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    protectedStatus: ").append(toIndentedString(protectedStatus)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    publicIpAddress: ").append(toIndentedString(publicIpAddress)).append("\n");
        sb.append("    publicIpv6Address: ").append(toIndentedString(publicIpv6Address)).append("\n");
        sb.append("    publicipPoolName: ").append(toIndentedString(publicipPoolName)).append("\n");
        sb.append("    publicipPoolId: ").append(toIndentedString(publicipPoolId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    vnic: ").append(toIndentedString(vnic)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    associateInstanceType: ").append(toIndentedString(associateInstanceType)).append("\n");
        sb.append("    associateInstanceId: ").append(toIndentedString(associateInstanceId)).append("\n");
        sb.append("    allowShareBandwidthTypes: ").append(toIndentedString(allowShareBandwidthTypes)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    publicBorderGroup: ").append(toIndentedString(publicBorderGroup)).append("\n");
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
