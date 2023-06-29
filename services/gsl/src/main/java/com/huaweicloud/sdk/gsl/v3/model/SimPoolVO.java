package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * SimPoolVO
 */
public class SimPoolVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_name")

    private String pricePlanName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "price_plan_id")

    private String pricePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private OffsetDateTime effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_time")

    private OffsetDateTime expiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_cycle")

    private String billingCycle;

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
    @JsonProperty(value = "quantity")

    private Integer quantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_time")

    private OffsetDateTime modifyTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private Long orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "activated_sim_quantity")

    private Integer activatedSimQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inactive_sim_quantity")

    private Integer inactiveSimQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disassembled_sim_quantity")

    private Integer disassembledSimQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_ids")

    private String orderIds;

    public SimPoolVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 流量池标识
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimPoolVO withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * 流量池名称
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public SimPoolVO withPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
        return this;
    }

    /**
     * 套餐名称
     * @return pricePlanName
     */
    public String getPricePlanName() {
        return pricePlanName;
    }

    public void setPricePlanName(String pricePlanName) {
        this.pricePlanName = pricePlanName;
    }

    public SimPoolVO withPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
        return this;
    }

    /**
     * 套餐标识
     * @return pricePlanId
     */
    public String getPricePlanId() {
        return pricePlanId;
    }

    public void setPricePlanId(String pricePlanId) {
        this.pricePlanId = pricePlanId;
    }

    public SimPoolVO withEffectiveTime(OffsetDateTime effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 生效时间
     * @return effectiveTime
     */
    public OffsetDateTime getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(OffsetDateTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public SimPoolVO withExpiredTime(OffsetDateTime expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * 失效时间
     * @return expiredTime
     */
    public OffsetDateTime getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(OffsetDateTime expiredTime) {
        this.expiredTime = expiredTime;
    }

    public SimPoolVO withBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }

    /**
     * 账期
     * @return billingCycle
     */
    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public SimPoolVO withFlowTotal(Double flowTotal) {
        this.flowTotal = flowTotal;
        return this;
    }

    /**
     * 可用流量(查询账期所在月份)，单位MB
     * minimum: 0
     * @return flowTotal
     */
    public Double getFlowTotal() {
        return flowTotal;
    }

    public void setFlowTotal(Double flowTotal) {
        this.flowTotal = flowTotal;
    }

    public SimPoolVO withFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
        return this;
    }

    /**
     * 已用流量(查询账期所在月份), 单位MB
     * minimum: 0
     * @return flowUsed
     */
    public Double getFlowUsed() {
        return flowUsed;
    }

    public void setFlowUsed(Double flowUsed) {
        this.flowUsed = flowUsed;
    }

    public SimPoolVO withFlowLeft(Double flowLeft) {
        this.flowLeft = flowLeft;
        return this;
    }

    /**
     * 剩余流量(查询账期所在月份), 单位MB
     * minimum: 0
     * @return flowLeft
     */
    public Double getFlowLeft() {
        return flowLeft;
    }

    public void setFlowLeft(Double flowLeft) {
        this.flowLeft = flowLeft;
    }

    public SimPoolVO withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * 流量池成员数量
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public SimPoolVO withModifyTime(OffsetDateTime modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }

    /**
     * 更新时间
     * @return modifyTime
     */
    public OffsetDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(OffsetDateTime modifyTime) {
        this.modifyTime = modifyTime;
    }

    public SimPoolVO withOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 批次号
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public SimPoolVO withActivatedSimQuantity(Integer activatedSimQuantity) {
        this.activatedSimQuantity = activatedSimQuantity;
        return this;
    }

    /**
     * 已激活成员数量
     * @return activatedSimQuantity
     */
    public Integer getActivatedSimQuantity() {
        return activatedSimQuantity;
    }

    public void setActivatedSimQuantity(Integer activatedSimQuantity) {
        this.activatedSimQuantity = activatedSimQuantity;
    }

    public SimPoolVO withInactiveSimQuantity(Integer inactiveSimQuantity) {
        this.inactiveSimQuantity = inactiveSimQuantity;
        return this;
    }

    /**
     * 未激活成员数量
     * @return inactiveSimQuantity
     */
    public Integer getInactiveSimQuantity() {
        return inactiveSimQuantity;
    }

    public void setInactiveSimQuantity(Integer inactiveSimQuantity) {
        this.inactiveSimQuantity = inactiveSimQuantity;
    }

    public SimPoolVO withDisassembledSimQuantity(Integer disassembledSimQuantity) {
        this.disassembledSimQuantity = disassembledSimQuantity;
        return this;
    }

    /**
     * 已拆机成员数量
     * @return disassembledSimQuantity
     */
    public Integer getDisassembledSimQuantity() {
        return disassembledSimQuantity;
    }

    public void setDisassembledSimQuantity(Integer disassembledSimQuantity) {
        this.disassembledSimQuantity = disassembledSimQuantity;
    }

    public SimPoolVO withOrderIds(String orderIds) {
        this.orderIds = orderIds;
        return this;
    }

    /**
     * 组成流量池的批次号列表
     * @return orderIds
     */
    public String getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(String orderIds) {
        this.orderIds = orderIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimPoolVO that = (SimPoolVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.poolName, that.poolName)
            && Objects.equals(this.pricePlanName, that.pricePlanName)
            && Objects.equals(this.pricePlanId, that.pricePlanId)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expiredTime, that.expiredTime)
            && Objects.equals(this.billingCycle, that.billingCycle) && Objects.equals(this.flowTotal, that.flowTotal)
            && Objects.equals(this.flowUsed, that.flowUsed) && Objects.equals(this.flowLeft, that.flowLeft)
            && Objects.equals(this.quantity, that.quantity) && Objects.equals(this.modifyTime, that.modifyTime)
            && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.activatedSimQuantity, that.activatedSimQuantity)
            && Objects.equals(this.inactiveSimQuantity, that.inactiveSimQuantity)
            && Objects.equals(this.disassembledSimQuantity, that.disassembledSimQuantity)
            && Objects.equals(this.orderIds, that.orderIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            poolName,
            pricePlanName,
            pricePlanId,
            effectiveTime,
            expiredTime,
            billingCycle,
            flowTotal,
            flowUsed,
            flowLeft,
            quantity,
            modifyTime,
            orderId,
            activatedSimQuantity,
            inactiveSimQuantity,
            disassembledSimQuantity,
            orderIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimPoolVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    pricePlanName: ").append(toIndentedString(pricePlanName)).append("\n");
        sb.append("    pricePlanId: ").append(toIndentedString(pricePlanId)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
        sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
        sb.append("    flowTotal: ").append(toIndentedString(flowTotal)).append("\n");
        sb.append("    flowUsed: ").append(toIndentedString(flowUsed)).append("\n");
        sb.append("    flowLeft: ").append(toIndentedString(flowLeft)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    activatedSimQuantity: ").append(toIndentedString(activatedSimQuantity)).append("\n");
        sb.append("    inactiveSimQuantity: ").append(toIndentedString(inactiveSimQuantity)).append("\n");
        sb.append("    disassembledSimQuantity: ").append(toIndentedString(disassembledSimQuantity)).append("\n");
        sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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
