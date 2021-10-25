package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/** SimPricePlanInfoVO */
public class SimPricePlanInfoVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_id")

    private String pricePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner")

    private Integer partner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cid")

    private String cid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_pid")

    private String partnerPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private LocalDate createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_time")

    private LocalDate activeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_time")

    private LocalDate stopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_total")

    private Double flowTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_used")

    private Double flowUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_left")

    private Double flowLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "using")

    private String using;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_name")

    private String pricePlanName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private Integer packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_type")

    private Integer effectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silent_period_day")

    private Integer silentPeriodDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silent_period_unit")

    private Integer silentPeriodUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_renew")

    private Integer autoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_desc")

    private String locationDesc;

    public SimPricePlanInfoVO withId(Long id) {
        this.id = id;
        return this;
    }

    /** 套餐实例id minimum: 0
     * 
     * @return id */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimPricePlanInfoVO withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /** 账户id
     * 
     * @return accountId */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public SimPricePlanInfoVO withSimCardId(Long simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /** sim卡id minimum: 0
     * 
     * @return simCardId */
    public Long getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(Long simCardId) {
        this.simCardId = simCardId;
    }

    public SimPricePlanInfoVO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /** 套餐状态:0 已删除 1 可激活 2 在用 3. 使用完 4. 可激活 5 已停用 6. 启用失败 minimum: 0 maximum: 2147483647
     * 
     * @return status */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SimPricePlanInfoVO withPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
        return this;
    }

    /** 套餐id
     * 
     * @return pricePlanId */
    public String getPricePlanId() {
        return pricePlanId;
    }

    public void setPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
    }

    public SimPricePlanInfoVO withPartner(Integer partner) {
        this.partner = partner;
        return this;
    }

    /** 伙伴 minimum: 0 maximum: 2147483647
     * 
     * @return partner */
    public Integer getPartner() {
        return partner;
    }

    public void setPartner(Integer partner) {
        this.partner = partner;
    }

    public SimPricePlanInfoVO withCid(String cid) {
        this.cid = cid;
        return this;
    }

    /** 容器ID:不同类型卡含义如下 iccid(实体卡)，eid（eSIM）cid（vSIM)
     * 
     * @return cid */
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public SimPricePlanInfoVO withPartnerPid(String partnerPid) {
        this.partnerPid = partnerPid;
        return this;
    }

    /** 伙伴套餐pid
     * 
     * @return partnerPid */
    public String getPartnerPid() {
        return partnerPid;
    }

    public void setPartnerPid(String partnerPid) {
        this.partnerPid = partnerPid;
    }

    public SimPricePlanInfoVO withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /** 订单id
     * 
     * @return orderId */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SimPricePlanInfoVO withCreateTime(LocalDate createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建时间 例如2020-08-24T07:57:56.000Z
     * 
     * @return createTime */
    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public SimPricePlanInfoVO withActiveTime(LocalDate activeTime) {
        this.activeTime = activeTime;
        return this;
    }

    /** 激活时间 例如2020-10-31T16:00:00.000Z
     * 
     * @return activeTime */
    public LocalDate getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(LocalDate activeTime) {
        this.activeTime = activeTime;
    }

    public SimPricePlanInfoVO withStopTime(LocalDate stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /** 停用时间 2021-10-31T16:00:00.000Z
     * 
     * @return stopTime */
    public LocalDate getStopTime() {
        return stopTime;
    }

    public void setStopTime(LocalDate stopTime) {
        this.stopTime = stopTime;
    }

    public SimPricePlanInfoVO withFlowTotal(Double flowTotal) {
        this.flowTotal = flowTotal;
        return this;
    }

    /** 总流量(MB) minimum: 0
     * 
     * @return flowTotal */
    public Double getFlowTotal() {
        return flowTotal;
    }

    public void setFlowTotal(Double flowTotal) {
        this.flowTotal = flowTotal;
    }

    public SimPricePlanInfoVO withFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
        return this;
    }

    /** 已使用流量(MB) minimum: 0
     * 
     * @return flowUsed */
    public Double getFlowUsed() {
        return flowUsed;
    }

    public void setFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
    }

    public SimPricePlanInfoVO withFlowLeft(Double flowLeft) {
        this.flowLeft = flowLeft;
        return this;
    }

    /** 剩余流量(MB)
     * 
     * @return flowLeft */
    public Double getFlowLeft() {
        return flowLeft;
    }

    public void setFlowLeft(Double flowLeft) {
        this.flowLeft = flowLeft;
    }

    public SimPricePlanInfoVO withUsing(String using) {
        this.using = using;
        return this;
    }

    /** 是否使用中(0：否 1：是)
     * 
     * @return using */
    public String getUsing() {
        return using;
    }

    public void setUsing(String using) {
        this.using = using;
    }

    public SimPricePlanInfoVO withPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
        return this;
    }

    /** 套餐名
     * 
     * @return pricePlanName */
    public String getPricePlanName() {
        return pricePlanName;
    }

    public void setPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
    }

    public SimPricePlanInfoVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 描述
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SimPricePlanInfoVO withPackageType(Integer packageType) {
        this.packageType = packageType;
        return this;
    }

    /** 套餐类型: 0.非自动续费 1.自动续费 minimum: 0 maximum: 2147483647
     * 
     * @return packageType */
    public Integer getPackageType() {
        return packageType;
    }

    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }

    public SimPricePlanInfoVO withEffectType(Integer effectType) {
        this.effectType = effectType;
        return this;
    }

    /** 生效类型: 1.订购后激活使用时生效 2.订购即时生效 3.订购下个月开始生效 minimum: 0 maximum: 2147483647
     * 
     * @return effectType */
    public Integer getEffectType() {
        return effectType;
    }

    public void setEffectType(Integer effectType) {
        this.effectType = effectType;
    }

    public SimPricePlanInfoVO withSilentPeriodDay(Integer silentPeriodDay) {
        this.silentPeriodDay = silentPeriodDay;
        return this;
    }

    /** 沉默期 minimum: 0 maximum: 2147483647
     * 
     * @return silentPeriodDay */
    public Integer getSilentPeriodDay() {
        return silentPeriodDay;
    }

    public void setSilentPeriodDay(Integer silentPeriodDay) {
        this.silentPeriodDay = silentPeriodDay;
    }

    public SimPricePlanInfoVO withSilentPeriodUnit(Integer silentPeriodUnit) {
        this.silentPeriodUnit = silentPeriodUnit;
        return this;
    }

    /** 沉默期单位: 1.年 2.月 3.日 minimum: 1 maximum: 3
     * 
     * @return silentPeriodUnit */
    public Integer getSilentPeriodUnit() {
        return silentPeriodUnit;
    }

    public void setSilentPeriodUnit(Integer silentPeriodUnit) {
        this.silentPeriodUnit = silentPeriodUnit;
    }

    public SimPricePlanInfoVO withAutoRenew(Integer autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /** 自动续订: 0.不自动续订 1.继续续订 minimum: 0 maximum: 2147483647
     * 
     * @return autoRenew */
    public Integer getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(Integer autoRenew) {
        this.autoRenew = autoRenew;
    }

    public SimPricePlanInfoVO withLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
        return this;
    }

    /** 位置信息:1. 中国 2. 欧洲 3. 大洋洲 4. 非洲5. 亚太
     * 
     * @return locationDesc */
    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimPricePlanInfoVO simPricePlanInfoVO = (SimPricePlanInfoVO) o;
        return Objects.equals(this.id, simPricePlanInfoVO.id)
            && Objects.equals(this.accountId, simPricePlanInfoVO.accountId)
            && Objects.equals(this.simCardId, simPricePlanInfoVO.simCardId)
            && Objects.equals(this.status, simPricePlanInfoVO.status)
            && Objects.equals(this.pricePlanId, simPricePlanInfoVO.pricePlanId)
            && Objects.equals(this.partner, simPricePlanInfoVO.partner)
            && Objects.equals(this.cid, simPricePlanInfoVO.cid)
            && Objects.equals(this.partnerPid, simPricePlanInfoVO.partnerPid)
            && Objects.equals(this.orderId, simPricePlanInfoVO.orderId)
            && Objects.equals(this.createTime, simPricePlanInfoVO.createTime)
            && Objects.equals(this.activeTime, simPricePlanInfoVO.activeTime)
            && Objects.equals(this.stopTime, simPricePlanInfoVO.stopTime)
            && Objects.equals(this.flowTotal, simPricePlanInfoVO.flowTotal)
            && Objects.equals(this.flowUsed, simPricePlanInfoVO.flowUsed)
            && Objects.equals(this.flowLeft, simPricePlanInfoVO.flowLeft)
            && Objects.equals(this.using, simPricePlanInfoVO.using)
            && Objects.equals(this.pricePlanName, simPricePlanInfoVO.pricePlanName)
            && Objects.equals(this.description, simPricePlanInfoVO.description)
            && Objects.equals(this.packageType, simPricePlanInfoVO.packageType)
            && Objects.equals(this.effectType, simPricePlanInfoVO.effectType)
            && Objects.equals(this.silentPeriodDay, simPricePlanInfoVO.silentPeriodDay)
            && Objects.equals(this.silentPeriodUnit, simPricePlanInfoVO.silentPeriodUnit)
            && Objects.equals(this.autoRenew, simPricePlanInfoVO.autoRenew)
            && Objects.equals(this.locationDesc, simPricePlanInfoVO.locationDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            accountId,
            simCardId,
            status,
            pricePlanId,
            partner,
            cid,
            partnerPid,
            orderId,
            createTime,
            activeTime,
            stopTime,
            flowTotal,
            flowUsed,
            flowLeft,
            using,
            pricePlanName,
            description,
            packageType,
            effectType,
            silentPeriodDay,
            silentPeriodUnit,
            autoRenew,
            locationDesc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimPricePlanInfoVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    pricePlanId: ").append(toIndentedString(pricePlanId)).append("\n");
        sb.append("    partner: ").append(toIndentedString(partner)).append("\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
        sb.append("    partnerPid: ").append(toIndentedString(partnerPid)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    activeTime: ").append(toIndentedString(activeTime)).append("\n");
        sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
        sb.append("    flowTotal: ").append(toIndentedString(flowTotal)).append("\n");
        sb.append("    flowUsed: ").append(toIndentedString(flowUsed)).append("\n");
        sb.append("    flowLeft: ").append(toIndentedString(flowLeft)).append("\n");
        sb.append("    using: ").append(toIndentedString(using)).append("\n");
        sb.append("    pricePlanName: ").append(toIndentedString(pricePlanName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    effectType: ").append(toIndentedString(effectType)).append("\n");
        sb.append("    silentPeriodDay: ").append(toIndentedString(silentPeriodDay)).append("\n");
        sb.append("    silentPeriodUnit: ").append(toIndentedString(silentPeriodUnit)).append("\n");
        sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
        sb.append("    locationDesc: ").append(toIndentedString(locationDesc)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
