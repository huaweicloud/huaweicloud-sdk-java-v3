package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SimPricePlanVO
 */
public class SimPricePlanVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    @JacksonXmlProperty(localName = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    @JacksonXmlProperty(localName = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_id")

    @JacksonXmlProperty(localName = "price_plan_id")

    private String pricePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cid")

    @JacksonXmlProperty(localName = "cid")

    private String cid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    @JacksonXmlProperty(localName = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_time")

    @JacksonXmlProperty(localName = "active_time")

    private OffsetDateTime activeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop_time")

    @JacksonXmlProperty(localName = "stop_time")

    private OffsetDateTime stopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_total")

    @JacksonXmlProperty(localName = "flow_total")

    private Double flowTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_used")

    @JacksonXmlProperty(localName = "flow_used")

    private Double flowUsed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_left")

    @JacksonXmlProperty(localName = "flow_left")

    private Double flowLeft;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "using")

    @JacksonXmlProperty(localName = "using")

    private String using;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_name")

    @JacksonXmlProperty(localName = "price_plan_name")

    private String pricePlanName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    @JacksonXmlProperty(localName = "package_type")

    private Integer packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_type")

    @JacksonXmlProperty(localName = "effect_type")

    private Integer effectType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silent_period_day")

    @JacksonXmlProperty(localName = "silent_period_day")

    private Integer silentPeriodDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silent_period_unit")

    @JacksonXmlProperty(localName = "silent_period_unit")

    private Integer silentPeriodUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_renew")

    @JacksonXmlProperty(localName = "auto_renew")

    private Integer autoRenew;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_desc")

    @JacksonXmlProperty(localName = "location_desc")

    private String locationDesc;

    public SimPricePlanVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 套餐实例id
     * minimum: 0
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimPricePlanVO withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 账户id
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public SimPricePlanVO withSimCardId(Long simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /**
     * sim卡id
     * minimum: 0
     * @return simCardId
     */
    public Long getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(Long simCardId) {
        this.simCardId = simCardId;
    }

    public SimPricePlanVO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 套餐状态:0 已删除 1 可激活 2 在用 3. 使用完 4. 可激活 5 已停用 6. 启用失败
     * minimum: 0
     * maximum: 2147483647
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SimPricePlanVO withPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
        return this;
    }

    /**
     * 套餐id
     * @return pricePlanId
     */
    public String getPricePlanId() {
        return pricePlanId;
    }

    public void setPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
    }

    public SimPricePlanVO withCid(String cid) {
        this.cid = cid;
        return this;
    }

    /**
     * 容器ID:不同类型卡含义如下 iccid(实体卡)，eid（eSIM）cid（vSIM)
     * @return cid
     */
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public SimPricePlanVO withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单id
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SimPricePlanVO withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间 例如2020-08-24T07:57:56.000Z
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public SimPricePlanVO withActiveTime(OffsetDateTime activeTime) {
        this.activeTime = activeTime;
        return this;
    }

    /**
     * 激活时间 例如2020-10-31T16:00:00.000Z
     * @return activeTime
     */
    public OffsetDateTime getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(OffsetDateTime activeTime) {
        this.activeTime = activeTime;
    }

    public SimPricePlanVO withStopTime(OffsetDateTime stopTime) {
        this.stopTime = stopTime;
        return this;
    }

    /**
     * 停用时间 2021-10-31T16:00:00.000Z
     * @return stopTime
     */
    public OffsetDateTime getStopTime() {
        return stopTime;
    }

    public void setStopTime(OffsetDateTime stopTime) {
        this.stopTime = stopTime;
    }

    public SimPricePlanVO withFlowTotal(Double flowTotal) {
        this.flowTotal = flowTotal;
        return this;
    }

    /**
     * 总流量(MB)
     * minimum: 0
     * @return flowTotal
     */
    public Double getFlowTotal() {
        return flowTotal;
    }

    public void setFlowTotal(Double flowTotal) {
        this.flowTotal = flowTotal;
    }

    public SimPricePlanVO withFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
        return this;
    }

    /**
     * 已使用流量(MB)
     * minimum: 0
     * @return flowUsed
     */
    public Double getFlowUsed() {
        return flowUsed;
    }

    public void setFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
    }

    public SimPricePlanVO withFlowLeft(Double flowLeft) {
        this.flowLeft = flowLeft;
        return this;
    }

    /**
     * 剩余流量(MB)
     * @return flowLeft
     */
    public Double getFlowLeft() {
        return flowLeft;
    }

    public void setFlowLeft(Double flowLeft) {
        this.flowLeft = flowLeft;
    }

    public SimPricePlanVO withUsing(String using) {
        this.using = using;
        return this;
    }

    /**
     * 是否使用中(0：否 1：是)
     * @return using
     */
    public String getUsing() {
        return using;
    }

    public void setUsing(String using) {
        this.using = using;
    }

    public SimPricePlanVO withPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
        return this;
    }

    /**
     * 套餐名
     * @return pricePlanName
     */
    public String getPricePlanName() {
        return pricePlanName;
    }

    public void setPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
    }

    public SimPricePlanVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SimPricePlanVO withPackageType(Integer packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * 套餐类型: 0.非自动续费 1.自动续费
     * minimum: 0
     * maximum: 2147483647
     * @return packageType
     */
    public Integer getPackageType() {
        return packageType;
    }

    public void setPackageType(Integer packageType) {
        this.packageType = packageType;
    }

    public SimPricePlanVO withEffectType(Integer effectType) {
        this.effectType = effectType;
        return this;
    }

    /**
     * 生效类型: 1.订购后激活使用时生效 2.订购即时生效 3.订购下个月开始生效 
     * minimum: 0
     * maximum: 2147483647
     * @return effectType
     */
    public Integer getEffectType() {
        return effectType;
    }

    public void setEffectType(Integer effectType) {
        this.effectType = effectType;
    }

    public SimPricePlanVO withSilentPeriodDay(Integer silentPeriodDay) {
        this.silentPeriodDay = silentPeriodDay;
        return this;
    }

    /**
     * 沉默期
     * minimum: 0
     * maximum: 2147483647
     * @return silentPeriodDay
     */
    public Integer getSilentPeriodDay() {
        return silentPeriodDay;
    }

    public void setSilentPeriodDay(Integer silentPeriodDay) {
        this.silentPeriodDay = silentPeriodDay;
    }

    public SimPricePlanVO withSilentPeriodUnit(Integer silentPeriodUnit) {
        this.silentPeriodUnit = silentPeriodUnit;
        return this;
    }

    /**
     * 沉默期单位: 1.年 2.月 3.日 
     * minimum: 1
     * maximum: 3
     * @return silentPeriodUnit
     */
    public Integer getSilentPeriodUnit() {
        return silentPeriodUnit;
    }

    public void setSilentPeriodUnit(Integer silentPeriodUnit) {
        this.silentPeriodUnit = silentPeriodUnit;
    }

    public SimPricePlanVO withAutoRenew(Integer autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }

    /**
     * 自动续订: 0.不自动续订 1.继续续订
     * minimum: 0
     * maximum: 2147483647
     * @return autoRenew
     */
    public Integer getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(Integer autoRenew) {
        this.autoRenew = autoRenew;
    }

    public SimPricePlanVO withLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc;
        return this;
    }

    /**
     * 位置信息:1.  中国 2.  欧洲 3.  大洋洲 4.  非洲5.  亚太
     * @return locationDesc
     */
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
        SimPricePlanVO simPricePlanVO = (SimPricePlanVO) o;
        return Objects.equals(this.id, simPricePlanVO.id) && Objects.equals(this.accountId, simPricePlanVO.accountId)
            && Objects.equals(this.simCardId, simPricePlanVO.simCardId)
            && Objects.equals(this.status, simPricePlanVO.status)
            && Objects.equals(this.pricePlanId, simPricePlanVO.pricePlanId)
            && Objects.equals(this.cid, simPricePlanVO.cid) && Objects.equals(this.orderId, simPricePlanVO.orderId)
            && Objects.equals(this.createTime, simPricePlanVO.createTime)
            && Objects.equals(this.activeTime, simPricePlanVO.activeTime)
            && Objects.equals(this.stopTime, simPricePlanVO.stopTime)
            && Objects.equals(this.flowTotal, simPricePlanVO.flowTotal)
            && Objects.equals(this.flowUsed, simPricePlanVO.flowUsed)
            && Objects.equals(this.flowLeft, simPricePlanVO.flowLeft)
            && Objects.equals(this.using, simPricePlanVO.using)
            && Objects.equals(this.pricePlanName, simPricePlanVO.pricePlanName)
            && Objects.equals(this.description, simPricePlanVO.description)
            && Objects.equals(this.packageType, simPricePlanVO.packageType)
            && Objects.equals(this.effectType, simPricePlanVO.effectType)
            && Objects.equals(this.silentPeriodDay, simPricePlanVO.silentPeriodDay)
            && Objects.equals(this.silentPeriodUnit, simPricePlanVO.silentPeriodUnit)
            && Objects.equals(this.autoRenew, simPricePlanVO.autoRenew)
            && Objects.equals(this.locationDesc, simPricePlanVO.locationDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            accountId,
            simCardId,
            status,
            pricePlanId,
            cid,
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
        sb.append("class SimPricePlanVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    pricePlanId: ").append(toIndentedString(pricePlanId)).append("\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
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
