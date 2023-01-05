package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCloudPhoneServerDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_model_name")

    private String serverModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_model_name")

    private String phoneModelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keypair_name")

    private String keypairName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_cidr")

    private String vpcCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_cidr")

    private String subnetCidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_project_id")

    private String resourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ShowCloudPhoneServerDetailResponseBodyMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private List<Address> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "band_widths")

    private List<Bandwidth> bandWidths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volumes")

    private List<Volume> volumes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_version")

    private String networkVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<String> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ShowCloudPhoneServerDetailResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowCloudPhoneServerDetailResponse withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * 云手机服务器名称 不超过65字符，只支持英文字母、数字、汉字、下划线和中划线
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public ShowCloudPhoneServerDetailResponse withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 云手机服务器所在的可用区
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ShowCloudPhoneServerDetailResponse withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云手机服务器的唯一标识，不超过32个字节
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ShowCloudPhoneServerDetailResponse withServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
        return this;
    }

    /**
     * 云手机服务器规格名称，不超过64个字节
     * @return serverModelName
     */
    public String getServerModelName() {
        return serverModelName;
    }

    public void setServerModelName(String serverModelName) {
        this.serverModelName = serverModelName;
    }

    public ShowCloudPhoneServerDetailResponse withPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
        return this;
    }

    /**
     * 云手机规格名称，不超过64个字节
     * @return phoneModelName
     */
    public String getPhoneModelName() {
        return phoneModelName;
    }

    public void setPhoneModelName(String phoneModelName) {
        this.phoneModelName = phoneModelName;
    }

    public ShowCloudPhoneServerDetailResponse withKeypairName(String keypairName) {
        this.keypairName = keypairName;
        return this;
    }

    /**
     * 连接云手机所使用的密钥对的名称，不超过64个字节
     * @return keypairName
     */
    public String getKeypairName() {
        return keypairName;
    }

    public void setKeypairName(String keypairName) {
        this.keypairName = keypairName;
    }

    public ShowCloudPhoneServerDetailResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 服务器状态 - 0、1、3、4：创建中 - 2：异常 - 5：正常 - 8：冻结 - 10：关机 - 11：关机中 - 12：关机失败 - 13：开机中
     * minimum: -128
     * maximum: 128
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowCloudPhoneServerDetailResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 云手机服务器所属虚拟私有云（简称VPC）的ID 网络版本 network_version 取值为“v1”时，表示云手机服务器所属资源租户的VPC ID；取值为“v2”时，表示租户创建服务器时指定 VPC 的 VPC ID
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowCloudPhoneServerDetailResponse withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * 云手机服务器所属虚拟私有云（简称VPC）的网段 网络版本 network_version 取值为“v1”时，表示云手机服务器所属资源租户的VPC CIDR；取值为“v2”时，表示租户创建服务器时指定 VPC 的 VPC CIDR
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public ShowCloudPhoneServerDetailResponse withVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
        return this;
    }

    /**
     * 云手机服务器所属虚拟私有云（简称VPC）的网段 网络版本 network_version 取值为“v1”时，表示云手机服务器所属资源租户的VPC CIDR；取值为“v2”时，表示租户创建服务器时指定 VPC 的 VPC CIDR
     * @return vpcCidr
     */
    public String getVpcCidr() {
        return vpcCidr;
    }

    public void setVpcCidr(String vpcCidr) {
        this.vpcCidr = vpcCidr;
    }

    public ShowCloudPhoneServerDetailResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 云手机服务器所属子网的ID 仅在网络版本 network_version 取值为“v2”时，该取值表示租户创建服务器时指定子网的 ID，网络版本取值为“v1”时，该字段表示云手机服务器所属资源租户的子网ID
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowCloudPhoneServerDetailResponse withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * 云手机服务器所属子网的网段 网络版本 network_version 取值为“v2”时，表示租户创建服务器时指定子网的 CIDR; 取值为“v1”时，表示云手机服务器所属资源租户的子网CIDR
     * @return subnetCidr
     */
    public String getSubnetCidr() {
        return subnetCidr;
    }

    public void setSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
    }

    public ShowCloudPhoneServerDetailResponse withResourceProjectId(String resourceProjectId) {
        this.resourceProjectId = resourceProjectId;
        return this;
    }

    /**
     * 云手机服务器的项目ID
     * @return resourceProjectId
     */
    public String getResourceProjectId() {
        return resourceProjectId;
    }

    public void setResourceProjectId(String resourceProjectId) {
        this.resourceProjectId = resourceProjectId;
    }

    public ShowCloudPhoneServerDetailResponse withMetadata(ShowCloudPhoneServerDetailResponseBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowCloudPhoneServerDetailResponse withMetadata(
        Consumer<ShowCloudPhoneServerDetailResponseBodyMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ShowCloudPhoneServerDetailResponseBodyMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ShowCloudPhoneServerDetailResponseBodyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ShowCloudPhoneServerDetailResponseBodyMetadata metadata) {
        this.metadata = metadata;
    }

    public ShowCloudPhoneServerDetailResponse withAddresses(List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    public ShowCloudPhoneServerDetailResponse addAddressesItem(Address addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    public ShowCloudPhoneServerDetailResponse withAddresses(Consumer<List<Address>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 云手机服务器的IP相关信息
     * @return addresses
     */
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public ShowCloudPhoneServerDetailResponse withBandWidths(List<Bandwidth> bandWidths) {
        this.bandWidths = bandWidths;
        return this;
    }

    public ShowCloudPhoneServerDetailResponse addBandWidthsItem(Bandwidth bandWidthsItem) {
        if (this.bandWidths == null) {
            this.bandWidths = new ArrayList<>();
        }
        this.bandWidths.add(bandWidthsItem);
        return this;
    }

    public ShowCloudPhoneServerDetailResponse withBandWidths(Consumer<List<Bandwidth>> bandWidthsSetter) {
        if (this.bandWidths == null) {
            this.bandWidths = new ArrayList<>();
        }
        bandWidthsSetter.accept(this.bandWidths);
        return this;
    }

    /**
     * 云手机服务器带宽信息的结构体数组
     * @return bandWidths
     */
    public List<Bandwidth> getBandWidths() {
        return bandWidths;
    }

    public void setBandWidths(List<Bandwidth> bandWidths) {
        this.bandWidths = bandWidths;
    }

    public ShowCloudPhoneServerDetailResponse withVolumes(List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    public ShowCloudPhoneServerDetailResponse addVolumesItem(Volume volumesItem) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        this.volumes.add(volumesItem);
        return this;
    }

    public ShowCloudPhoneServerDetailResponse withVolumes(Consumer<List<Volume>> volumesSetter) {
        if (this.volumes == null) {
            this.volumes = new ArrayList<>();
        }
        volumesSetter.accept(this.volumes);
        return this;
    }

    /**
     * 云手机服务器卷信息的结构体数组
     * @return volumes
     */
    public List<Volume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    public ShowCloudPhoneServerDetailResponse withNetworkVersion(String networkVersion) {
        this.networkVersion = networkVersion;
        return this;
    }

    /**
     * 是否为自定义网络的云手机服务器标识。  \"v1\"，非自定义网络的云手机服务器。\\t\"v2\"，自定义网络的云手机服务器。 支持按照网络版本字段进行筛选
     * @return networkVersion
     */
    public String getNetworkVersion() {
        return networkVersion;
    }

    public void setNetworkVersion(String networkVersion) {
        this.networkVersion = networkVersion;
    }

    public ShowCloudPhoneServerDetailResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 云手机服务器所属企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowCloudPhoneServerDetailResponse withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public ShowCloudPhoneServerDetailResponse addSecurityGroupsItem(String securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ShowCloudPhoneServerDetailResponse withSecurityGroups(Consumer<List<String>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 服务器扩展网卡绑定的安全组信息 系统定义网络的服务器，该字段返回为空列表
     * @return securityGroups
     */
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ShowCloudPhoneServerDetailResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间 时间格式为UTC，YYYY-MM-DDTHH:MM:SSZ
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowCloudPhoneServerDetailResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间 时间格式为UTC，YYYY-MM-DDTHH:MM:SSZ
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCloudPhoneServerDetailResponse showCloudPhoneServerDetailResponse = (ShowCloudPhoneServerDetailResponse) o;
        return Objects.equals(this.requestId, showCloudPhoneServerDetailResponse.requestId)
            && Objects.equals(this.serverName, showCloudPhoneServerDetailResponse.serverName)
            && Objects.equals(this.availabilityZone, showCloudPhoneServerDetailResponse.availabilityZone)
            && Objects.equals(this.serverId, showCloudPhoneServerDetailResponse.serverId)
            && Objects.equals(this.serverModelName, showCloudPhoneServerDetailResponse.serverModelName)
            && Objects.equals(this.phoneModelName, showCloudPhoneServerDetailResponse.phoneModelName)
            && Objects.equals(this.keypairName, showCloudPhoneServerDetailResponse.keypairName)
            && Objects.equals(this.status, showCloudPhoneServerDetailResponse.status)
            && Objects.equals(this.vpcId, showCloudPhoneServerDetailResponse.vpcId)
            && Objects.equals(this.cidr, showCloudPhoneServerDetailResponse.cidr)
            && Objects.equals(this.vpcCidr, showCloudPhoneServerDetailResponse.vpcCidr)
            && Objects.equals(this.subnetId, showCloudPhoneServerDetailResponse.subnetId)
            && Objects.equals(this.subnetCidr, showCloudPhoneServerDetailResponse.subnetCidr)
            && Objects.equals(this.resourceProjectId, showCloudPhoneServerDetailResponse.resourceProjectId)
            && Objects.equals(this.metadata, showCloudPhoneServerDetailResponse.metadata)
            && Objects.equals(this.addresses, showCloudPhoneServerDetailResponse.addresses)
            && Objects.equals(this.bandWidths, showCloudPhoneServerDetailResponse.bandWidths)
            && Objects.equals(this.volumes, showCloudPhoneServerDetailResponse.volumes)
            && Objects.equals(this.networkVersion, showCloudPhoneServerDetailResponse.networkVersion)
            && Objects.equals(this.enterpriseProjectId, showCloudPhoneServerDetailResponse.enterpriseProjectId)
            && Objects.equals(this.securityGroups, showCloudPhoneServerDetailResponse.securityGroups)
            && Objects.equals(this.createTime, showCloudPhoneServerDetailResponse.createTime)
            && Objects.equals(this.updateTime, showCloudPhoneServerDetailResponse.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId,
            serverName,
            availabilityZone,
            serverId,
            serverModelName,
            phoneModelName,
            keypairName,
            status,
            vpcId,
            cidr,
            vpcCidr,
            subnetId,
            subnetCidr,
            resourceProjectId,
            metadata,
            addresses,
            bandWidths,
            volumes,
            networkVersion,
            enterpriseProjectId,
            securityGroups,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCloudPhoneServerDetailResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    serverModelName: ").append(toIndentedString(serverModelName)).append("\n");
        sb.append("    phoneModelName: ").append(toIndentedString(phoneModelName)).append("\n");
        sb.append("    keypairName: ").append(toIndentedString(keypairName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    vpcCidr: ").append(toIndentedString(vpcCidr)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetCidr: ").append(toIndentedString(subnetCidr)).append("\n");
        sb.append("    resourceProjectId: ").append(toIndentedString(resourceProjectId)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    bandWidths: ").append(toIndentedString(bandWidths)).append("\n");
        sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
        sb.append("    networkVersion: ").append(toIndentedString(networkVersion)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
