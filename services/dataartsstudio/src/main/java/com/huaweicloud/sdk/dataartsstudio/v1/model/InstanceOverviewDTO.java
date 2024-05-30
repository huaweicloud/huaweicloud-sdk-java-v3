package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 集群概览信息
 */
public class InstanceOverviewDTO {

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

    public InstanceOverviewDTO withId(String id) {
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

    public InstanceOverviewDTO withName(String name) {
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

    public InstanceOverviewDTO withDescription(String description) {
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

    public InstanceOverviewDTO withExternalAddress(String externalAddress) {
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

    public InstanceOverviewDTO withIntranetAddress(String intranetAddress) {
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

    public InstanceOverviewDTO withIntranetAddressIpv6(String intranetAddressIpv6) {
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

    public InstanceOverviewDTO withPublicZoneId(String publicZoneId) {
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

    public InstanceOverviewDTO withPublicZoneName(String publicZoneName) {
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

    public InstanceOverviewDTO withPrivateZoneId(String privateZoneId) {
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

    public InstanceOverviewDTO withPrivateZoneName(String privateZoneName) {
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

    public InstanceOverviewDTO withEnterpriseProjectId(String enterpriseProjectId) {
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

    public InstanceOverviewDTO withCreateTime(Long createTime) {
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

    public InstanceOverviewDTO withCreateUser(String createUser) {
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

    public InstanceOverviewDTO withCurrentNamespacePublishApiNum(Integer currentNamespacePublishApiNum) {
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

    public InstanceOverviewDTO withAllNamespacePublishApiNum(Integer allNamespacePublishApiNum) {
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

    public InstanceOverviewDTO withApiPublishableNum(Integer apiPublishableNum) {
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

    public InstanceOverviewDTO withDeletable(Boolean deletable) {
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

    public InstanceOverviewDTO withChargeStatus(String chargeStatus) {
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

    public InstanceOverviewDTO withOrderId(String orderId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceOverviewDTO that = (InstanceOverviewDTO) obj;
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
            && Objects.equals(this.orderId, that.orderId);
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
            orderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceOverviewDTO {\n");
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
