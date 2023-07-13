package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 获取ApigCommodityOrder实例列表信息
 */
public class ApigCommodityOrder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_id")

    private String subscriptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_code")

    private String resourceSpecCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_type")

    private String orderType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_type")

    private String chargeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_renew")

    private Integer isAutoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_group_id")

    private String securityGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eps_id")

    private String epsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private BigDecimal effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_days")

    private String expireDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private BigDecimal expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_check_endpoint")

    private String lockCheckEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private BigDecimal createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_trial_order")

    private Integer isTrialOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_space_mode")

    private String workSpaceMode;

    public ApigCommodityOrder withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 实例所属项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ApigCommodityOrder withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * CBC订单id
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ApigCommodityOrder withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 当前所属region Id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ApigCommodityOrder withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 实例id
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public ApigCommodityOrder withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 实例名称
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ApigCommodityOrder withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * CBC订购id
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public ApigCommodityOrder withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型，hws.resource.type.dayu
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ApigCommodityOrder withResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
        return this;
    }

    /**
     * 产品规格编码，例如dayu.starter，dayu.basic，dayu.advanced等
     * @return resourceSpecCode
     */
    public String getResourceSpecCode() {
        return resourceSpecCode;
    }

    public void setResourceSpecCode(String resourceSpecCode) {
        this.resourceSpecCode = resourceSpecCode;
    }

    public ApigCommodityOrder withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * CBC产品id，未安装CBC的环境无需这个值
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ApigCommodityOrder withOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }

    /**
     * 订单类型标识符
     * @return orderType
     */
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public ApigCommodityOrder withChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }

    /**
     * 支付选项，留空
     * @return chargeType
     */
    public String getChargeType() {
        return chargeType;
    }

    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }

    public ApigCommodityOrder withIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
        return this;
    }

    /**
     * 自动续费标识，当前实例为按需支付时必填，0代表不续费，1代表自动续费
     * minimum: 0
     * maximum: 1
     * @return isAutoRenew
     */
    public Integer getIsAutoRenew() {
        return isAutoRenew;
    }

    public void setIsAutoRenew(Integer isAutoRenew) {
        this.isAutoRenew = isAutoRenew;
    }

    public ApigCommodityOrder withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 实例状态,1未生效2生效中3已删除=退订4保留期=冻结5宽限期6删除中
     * minimum: 1
     * maximum: 6
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ApigCommodityOrder withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云id
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ApigCommodityOrder withSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    /**
     * 安全组id
     * @return securityGroupId
     */
    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ApigCommodityOrder withEpsId(String epsId) {
        this.epsId = epsId;
        return this;
    }

    /**
     * 企业项目id，如果当前为公有云，且用户开启企业项目，则必选
     * @return epsId
     */
    public String getEpsId() {
        return epsId;
    }

    public void setEpsId(String epsId) {
        this.epsId = epsId;
    }

    public ApigCommodityOrder withEffectiveTime(BigDecimal effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 生效时间点，包周期实例有效
     * minimum: 0
     * maximum: 9223372036854775807
     * @return effectiveTime
     */
    public BigDecimal getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(BigDecimal effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public ApigCommodityOrder withExpireDays(String expireDays) {
        this.expireDays = expireDays;
        return this;
    }

    /**
     * 过期时间天数，包周期实例有效
     * @return expireDays
     */
    public String getExpireDays() {
        return expireDays;
    }

    public void setExpireDays(String expireDays) {
        this.expireDays = expireDays;
    }

    public ApigCommodityOrder withExpireTime(BigDecimal expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间点，包周期有效
     * minimum: 0
     * maximum: 9223372036854775807
     * @return expireTime
     */
    public BigDecimal getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(BigDecimal expireTime) {
        this.expireTime = expireTime;
    }

    public ApigCommodityOrder withLockCheckEndpoint(String lockCheckEndpoint) {
        this.lockCheckEndpoint = lockCheckEndpoint;
        return this;
    }

    /**
     * CBC锁定节点
     * @return lockCheckEndpoint
     */
    public String getLockCheckEndpoint() {
        return lockCheckEndpoint;
    }

    public void setLockCheckEndpoint(String lockCheckEndpoint) {
        this.lockCheckEndpoint = lockCheckEndpoint;
    }

    public ApigCommodityOrder withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建用户
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ApigCommodityOrder withCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间点
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createTime
     */
    public BigDecimal getCreateTime() {
        return createTime;
    }

    public void setCreateTime(BigDecimal createTime) {
        this.createTime = createTime;
    }

    public ApigCommodityOrder withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 用户domain id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ApigCommodityOrder withIsTrialOrder(Integer isTrialOrder) {
        this.isTrialOrder = isTrialOrder;
        return this;
    }

    /**
     * 是否试用订单
     * minimum: 0
     * maximum: 1
     * @return isTrialOrder
     */
    public Integer getIsTrialOrder() {
        return isTrialOrder;
    }

    public void setIsTrialOrder(Integer isTrialOrder) {
        this.isTrialOrder = isTrialOrder;
    }

    public ApigCommodityOrder withWorkSpaceMode(String workSpaceMode) {
        this.workSpaceMode = workSpaceMode;
        return this;
    }

    /**
     * 工作空间模式说明
     * @return workSpaceMode
     */
    public String getWorkSpaceMode() {
        return workSpaceMode;
    }

    public void setWorkSpaceMode(String workSpaceMode) {
        this.workSpaceMode = workSpaceMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApigCommodityOrder that = (ApigCommodityOrder) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.subscriptionId, that.subscriptionId)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.resourceSpecCode, that.resourceSpecCode)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.orderType, that.orderType)
            && Objects.equals(this.chargeType, that.chargeType) && Objects.equals(this.isAutoRenew, that.isAutoRenew)
            && Objects.equals(this.status, that.status) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.securityGroupId, that.securityGroupId) && Objects.equals(this.epsId, that.epsId)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expireDays, that.expireDays) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.lockCheckEndpoint, that.lockCheckEndpoint)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.isTrialOrder, that.isTrialOrder)
            && Objects.equals(this.workSpaceMode, that.workSpaceMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            orderId,
            regionId,
            resourceId,
            resourceName,
            subscriptionId,
            resourceType,
            resourceSpecCode,
            productId,
            orderType,
            chargeType,
            isAutoRenew,
            status,
            vpcId,
            securityGroupId,
            epsId,
            effectiveTime,
            expireDays,
            expireTime,
            lockCheckEndpoint,
            createUser,
            createTime,
            domainId,
            isTrialOrder,
            workSpaceMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApigCommodityOrder {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceSpecCode: ").append(toIndentedString(resourceSpecCode)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
        sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
        sb.append("    isAutoRenew: ").append(toIndentedString(isAutoRenew)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    epsId: ").append(toIndentedString(epsId)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireDays: ").append(toIndentedString(expireDays)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    lockCheckEndpoint: ").append(toIndentedString(lockCheckEndpoint)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    isTrialOrder: ").append(toIndentedString(isTrialOrder)).append("\n");
        sb.append("    workSpaceMode: ").append(toIndentedString(workSpaceMode)).append("\n");
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
