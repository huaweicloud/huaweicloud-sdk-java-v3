package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowDataServiceInstanceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_address")

    private String externalAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_address")

    private String intranetAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intranet_address_ipv6")

    private String intranetAddressIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_zone_id")

    private String publicZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_zone_name")

    private String publicZoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_zone_id")

    private String privateZoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_zone_name")

    private String privateZoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_namespace_publish_api_num")

    private Integer currentNamespacePublishApiNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_namespace_publish_api_num")

    private Integer allNamespacePublishApiNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_publishable_num")

    private Integer apiPublishableNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletable")

    private Boolean deletable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_status")

    private String chargeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_type")

    private String orderType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_num")

    private Integer nodeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorDTO flavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_version")

    private String gatewayVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_name")

    private String availabilityZoneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<InstanceNodeDTO> nodes = null;

    public ShowDataServiceInstanceResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 集群ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowDataServiceInstanceResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 集群名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowDataServiceInstanceResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 集群描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowDataServiceInstanceResponse withExternalAddress(String externalAddress) {
        this.externalAddress = externalAddress;
        return this;
    }

    /**
     * 公网IP地址。
     * @return externalAddress
     */
    public String getExternalAddress() {
        return externalAddress;
    }

    public void setExternalAddress(String externalAddress) {
        this.externalAddress = externalAddress;
    }

    public ShowDataServiceInstanceResponse withIntranetAddress(String intranetAddress) {
        this.intranetAddress = intranetAddress;
        return this;
    }

    /**
     * 内网IPv4地址。
     * @return intranetAddress
     */
    public String getIntranetAddress() {
        return intranetAddress;
    }

    public void setIntranetAddress(String intranetAddress) {
        this.intranetAddress = intranetAddress;
    }

    public ShowDataServiceInstanceResponse withIntranetAddressIpv6(String intranetAddressIpv6) {
        this.intranetAddressIpv6 = intranetAddressIpv6;
        return this;
    }

    /**
     * 内网IPv6地址。
     * @return intranetAddressIpv6
     */
    public String getIntranetAddressIpv6() {
        return intranetAddressIpv6;
    }

    public void setIntranetAddressIpv6(String intranetAddressIpv6) {
        this.intranetAddressIpv6 = intranetAddressIpv6;
    }

    public ShowDataServiceInstanceResponse withPublicZoneId(String publicZoneId) {
        this.publicZoneId = publicZoneId;
        return this;
    }

    /**
     * 公网域名ID。
     * @return publicZoneId
     */
    public String getPublicZoneId() {
        return publicZoneId;
    }

    public void setPublicZoneId(String publicZoneId) {
        this.publicZoneId = publicZoneId;
    }

    public ShowDataServiceInstanceResponse withPublicZoneName(String publicZoneName) {
        this.publicZoneName = publicZoneName;
        return this;
    }

    /**
     * 公网域名名称。
     * @return publicZoneName
     */
    public String getPublicZoneName() {
        return publicZoneName;
    }

    public void setPublicZoneName(String publicZoneName) {
        this.publicZoneName = publicZoneName;
    }

    public ShowDataServiceInstanceResponse withPrivateZoneId(String privateZoneId) {
        this.privateZoneId = privateZoneId;
        return this;
    }

    /**
     * 内网域名ID。
     * @return privateZoneId
     */
    public String getPrivateZoneId() {
        return privateZoneId;
    }

    public void setPrivateZoneId(String privateZoneId) {
        this.privateZoneId = privateZoneId;
    }

    public ShowDataServiceInstanceResponse withPrivateZoneName(String privateZoneName) {
        this.privateZoneName = privateZoneName;
        return this;
    }

    /**
     * 内网域名名称。
     * @return privateZoneName
     */
    public String getPrivateZoneName() {
        return privateZoneName;
    }

    public void setPrivateZoneName(String privateZoneName) {
        this.privateZoneName = privateZoneName;
    }

    public ShowDataServiceInstanceResponse withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowDataServiceInstanceResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowDataServiceInstanceResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowDataServiceInstanceResponse withCurrentNamespacePublishApiNum(Integer currentNamespacePublishApiNum) {
        this.currentNamespacePublishApiNum = currentNamespacePublishApiNum;
        return this;
    }

    /**
     * 当前工作空间已发布的API数量。
     * @return currentNamespacePublishApiNum
     */
    public Integer getCurrentNamespacePublishApiNum() {
        return currentNamespacePublishApiNum;
    }

    public void setCurrentNamespacePublishApiNum(Integer currentNamespacePublishApiNum) {
        this.currentNamespacePublishApiNum = currentNamespacePublishApiNum;
    }

    public ShowDataServiceInstanceResponse withAllNamespacePublishApiNum(Integer allNamespacePublishApiNum) {
        this.allNamespacePublishApiNum = allNamespacePublishApiNum;
        return this;
    }

    /**
     * 所有工作空间已发布的API数量。
     * @return allNamespacePublishApiNum
     */
    public Integer getAllNamespacePublishApiNum() {
        return allNamespacePublishApiNum;
    }

    public void setAllNamespacePublishApiNum(Integer allNamespacePublishApiNum) {
        this.allNamespacePublishApiNum = allNamespacePublishApiNum;
    }

    public ShowDataServiceInstanceResponse withApiPublishableNum(Integer apiPublishableNum) {
        this.apiPublishableNum = apiPublishableNum;
        return this;
    }

    /**
     * 集群API总配额。
     * @return apiPublishableNum
     */
    public Integer getApiPublishableNum() {
        return apiPublishableNum;
    }

    public void setApiPublishableNum(Integer apiPublishableNum) {
        this.apiPublishableNum = apiPublishableNum;
    }

    public ShowDataServiceInstanceResponse withDeletable(Boolean deletable) {
        this.deletable = deletable;
        return this;
    }

    /**
     * 集群是否可以删除。
     * @return deletable
     */
    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public ShowDataServiceInstanceResponse withChargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus;
        return this;
    }

    /**
     * 集群计费状态，NO_CHARGE：未计费、CHARGED：已计费，GRACE：宽限期、RETENTION：保留期。
     * @return chargeStatus
     */
    public String getChargeStatus() {
        return chargeStatus;
    }

    public void setChargeStatus(String chargeStatus) {
        this.chargeStatus = chargeStatus;
    }

    public ShowDataServiceInstanceResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单ID。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShowDataServiceInstanceResponse withOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * 订单类型，PERIOD：包周期、ON_DEMAND：按需。
     * @return orderType
     */
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public ShowDataServiceInstanceResponse withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 集群订购周期类型。
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public ShowDataServiceInstanceResponse withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 集群状态。
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public ShowDataServiceInstanceResponse withNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
        return this;
    }

    /**
     * 节点数量。
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return nodeNum;
    }

    public void setNodeNum(Integer nodeNum) {
        this.nodeNum = nodeNum;
    }

    public ShowDataServiceInstanceResponse withFlavor(FlavorDTO flavor) {
        this.flavor = flavor;
        return this;
    }

    public ShowDataServiceInstanceResponse withFlavor(Consumer<FlavorDTO> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new FlavorDTO();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public FlavorDTO getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorDTO flavor) {
        this.flavor = flavor;
    }

    public ShowDataServiceInstanceResponse withGatewayVersion(String gatewayVersion) {
        this.gatewayVersion = gatewayVersion;
        return this;
    }

    /**
     * 集群版本号。
     * @return gatewayVersion
     */
    public String getGatewayVersion() {
        return gatewayVersion;
    }

    public void setGatewayVersion(String gatewayVersion) {
        this.gatewayVersion = gatewayVersion;
    }

    public ShowDataServiceInstanceResponse withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 集群所在可用区编码。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ShowDataServiceInstanceResponse withAvailabilityZoneName(String availabilityZoneName) {
        this.availabilityZoneName = availabilityZoneName;
        return this;
    }

    /**
     * 集群所在可用区名称。
     * @return availabilityZoneName
     */
    public String getAvailabilityZoneName() {
        return availabilityZoneName;
    }

    public void setAvailabilityZoneName(String availabilityZoneName) {
        this.availabilityZoneName = availabilityZoneName;
    }

    public ShowDataServiceInstanceResponse withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 集群所在虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ShowDataServiceInstanceResponse withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 集群所在子网ID。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ShowDataServiceInstanceResponse withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 集群所在安全组ID。
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ShowDataServiceInstanceResponse withNodes(List<InstanceNodeDTO> nodes) {
        this.nodes = nodes;
        return this;
    }

    public ShowDataServiceInstanceResponse addNodesItem(InstanceNodeDTO nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ShowDataServiceInstanceResponse withNodes(Consumer<List<InstanceNodeDTO>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 集群节点列表。
     * @return nodes
     */
    public List<InstanceNodeDTO> getNodes() {
        return nodes;
    }

    public void setNodes(List<InstanceNodeDTO> nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDataServiceInstanceResponse that = (ShowDataServiceInstanceResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.externalAddress, that.externalAddress)
            && Objects.equals(this.intranetAddress, that.intranetAddress)
            && Objects.equals(this.intranetAddressIpv6, that.intranetAddressIpv6)
            && Objects.equals(this.publicZoneId, that.publicZoneId)
            && Objects.equals(this.publicZoneName, that.publicZoneName)
            && Objects.equals(this.privateZoneId, that.privateZoneId)
            && Objects.equals(this.privateZoneName, that.privateZoneName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.currentNamespacePublishApiNum, that.currentNamespacePublishApiNum)
            && Objects.equals(this.allNamespacePublishApiNum, that.allNamespacePublishApiNum)
            && Objects.equals(this.apiPublishableNum, that.apiPublishableNum)
            && Objects.equals(this.deletable, that.deletable) && Objects.equals(this.chargeStatus, that.chargeStatus)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.orderType, that.orderType)
            && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.instanceStatus, that.instanceStatus) && Objects.equals(this.nodeNum, that.nodeNum)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.gatewayVersion, that.gatewayVersion)
            && Objects.equals(this.availabilityZone, that.availabilityZone)
            && Objects.equals(this.availabilityZoneName, that.availabilityZoneName)
            && Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetId, that.subnetId)
            && Objects.equals(this.securityGroupId, that.securityGroupId) && Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            externalAddress,
            intranetAddress,
            intranetAddressIpv6,
            publicZoneId,
            publicZoneName,
            privateZoneId,
            privateZoneName,
            enterpriseProjectId,
            createTime,
            createUser,
            currentNamespacePublishApiNum,
            allNamespacePublishApiNum,
            apiPublishableNum,
            deletable,
            chargeStatus,
            orderId,
            orderType,
            periodType,
            instanceStatus,
            nodeNum,
            flavor,
            gatewayVersion,
            availabilityZone,
            availabilityZoneName,
            vpcId,
            subnetId,
            securityGroupId,
            nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDataServiceInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    externalAddress: ").append(toIndentedString(externalAddress)).append("\n");
        sb.append("    intranetAddress: ").append(toIndentedString(intranetAddress)).append("\n");
        sb.append("    intranetAddressIpv6: ").append(toIndentedString(intranetAddressIpv6)).append("\n");
        sb.append("    publicZoneId: ").append(toIndentedString(publicZoneId)).append("\n");
        sb.append("    publicZoneName: ").append(toIndentedString(publicZoneName)).append("\n");
        sb.append("    privateZoneId: ").append(toIndentedString(privateZoneId)).append("\n");
        sb.append("    privateZoneName: ").append(toIndentedString(privateZoneName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    currentNamespacePublishApiNum: ")
            .append(toIndentedString(currentNamespacePublishApiNum))
            .append("\n");
        sb.append("    allNamespacePublishApiNum: ").append(toIndentedString(allNamespacePublishApiNum)).append("\n");
        sb.append("    apiPublishableNum: ").append(toIndentedString(apiPublishableNum)).append("\n");
        sb.append("    deletable: ").append(toIndentedString(deletable)).append("\n");
        sb.append("    chargeStatus: ").append(toIndentedString(chargeStatus)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    nodeNum: ").append(toIndentedString(nodeNum)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    gatewayVersion: ").append(toIndentedString(gatewayVersion)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    availabilityZoneName: ").append(toIndentedString(availabilityZoneName)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
