package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SubCustomerResFeeRecordV2
 */
public class SubCustomerResFeeRecordV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adjustment_amount")
    
    private BigDecimal adjustmentAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private BigDecimal amount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private Integer billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bonus_amount")
    
    private BigDecimal bonusAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cash_amount")
    
    private BigDecimal cashAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private String chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_amount")
    
    private BigDecimal couponAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credit_amount")
    
    private BigDecimal creditAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="debt_amount")
    
    private BigDecimal debtAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_amount")
    
    private BigDecimal discountAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time")
    
    private String effectiveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flexipurchase_coupon_amount")
    
    private BigDecimal flexipurchaseCouponAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="free_resource_measure_id")
    
    private Integer freeResourceMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="free_resource_usage")
    
    private BigDecimal freeResourceUsage = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_amount")
    
    private BigDecimal officialAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_type")
    
    private String periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_tag")
    
    private String resourceTag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ri_usage")
    
    private BigDecimal riUsage = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ri_usage_measure_id")
    
    private Integer riUsageMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_size")
    
    private BigDecimal specSize = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_size_measure_id")
    
    private Integer specSizeMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stored_card_amount")
    
    private BigDecimal storedCardAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage")
    
    private BigDecimal usage = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage_measure_id")
    
    private Integer usageMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage_type")
    
    private String usageType;

    public SubCustomerResFeeRecordV2 withAdjustmentAmount(BigDecimal adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
        return this;
    }

    


    /**
     * |参数名称：欠费核销金额。| |参数约束及描述： 欠费核销金额。|
     * @return adjustmentAmount
     */
    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(BigDecimal adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    public SubCustomerResFeeRecordV2 withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：消费金额，包括现金券和代金券金额，精确到小数点后2位。| |参数约束及描述： 消费金额，包括现金券和代金券金额，精确到小数点后2位。|
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public SubCustomerResFeeRecordV2 withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * |参数名称：账单类型。1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿12：消费-按时计费13：消费-退订手续费14：消费-服务支持计划月末扣费16：调账-扣费| |参数的约束及描述：账单类型。1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿12：消费-按时计费13：消费-退订手续费14：消费-服务支持计划月末扣费16：调账-扣费|
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public SubCustomerResFeeRecordV2 withBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
        return this;
    }

    


    /**
     * |参数名称：奖励金支付金额（用于现网未清干净的奖励金）。| |参数约束及描述： 奖励金支付金额（用于现网未清干净的奖励金）。|
     * @return bonusAmount
     */
    public BigDecimal getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public SubCustomerResFeeRecordV2 withCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }

    


    /**
     * |参数名称：现金支付金额| |参数约束及描述： 现金支付金额|
     * @return cashAmount
     */
    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public SubCustomerResFeeRecordV2 withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * |参数名称：1 : 包周期；3: 按需。10: 预留实例。| |参数约束及描述：1 : 包周期；3: 按需。10: 预留实例。|
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public SubCustomerResFeeRecordV2 withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * |参数名称：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。| |参数约束及描述：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。|
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public SubCustomerResFeeRecordV2 withCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    


    /**
     * |参数名称：代金券支付金额。| |参数约束及描述： 代金券支付金额。|
     * @return couponAmount
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public SubCustomerResFeeRecordV2 withCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    


    /**
     * |参数名称：信用额度支付金额。| |参数约束及描述： 信用额度支付金额。|
     * @return creditAmount
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public SubCustomerResFeeRecordV2 withDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    


    /**
     * |参数名称：欠费金额。| |参数约束及描述： 欠费金额。|
     * @return debtAmount
     */
    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public SubCustomerResFeeRecordV2 withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    


    /**
     * |参数名称：折扣金额| |参数约束及描述： 折扣金额|
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public SubCustomerResFeeRecordV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    


    /**
     * |参数名称：费用对应的资源使用的开始时间，按需有效，包周期该字段保留。| |参数约束及描述：费用对应的资源使用的开始时间，按需有效，包周期该字段保留。|
     * @return effectiveTime
     */
    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public SubCustomerResFeeRecordV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * |参数名称：费用对应的资源使用的结束时间，按需有效，包周期该字段保留。| |参数约束及描述：费用对应的资源使用的结束时间，按需有效，包周期该字段保留。|
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public SubCustomerResFeeRecordV2 withFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
        return this;
    }

    


    /**
     * |参数名称：现金券支付金额。| |参数约束及描述： 现金券支付金额。|
     * @return flexipurchaseCouponAmount
     */
    public BigDecimal getFlexipurchaseCouponAmount() {
        return flexipurchaseCouponAmount;
    }

    public void setFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
    }

    public SubCustomerResFeeRecordV2 withFreeResourceMeasureId(Integer freeResourceMeasureId) {
        this.freeResourceMeasureId = freeResourceMeasureId;
        return this;
    }

    


    /**
     * |参数名称：套餐内使用量单位，具体枚举参考：usage_measure_id| |参数的约束及描述：套餐内使用量单位，具体枚举参考：usage_measure_id|
     * @return freeResourceMeasureId
     */
    public Integer getFreeResourceMeasureId() {
        return freeResourceMeasureId;
    }

    public void setFreeResourceMeasureId(Integer freeResourceMeasureId) {
        this.freeResourceMeasureId = freeResourceMeasureId;
    }

    public SubCustomerResFeeRecordV2 withFreeResourceUsage(BigDecimal freeResourceUsage) {
        this.freeResourceUsage = freeResourceUsage;
        return this;
    }

    


    /**
     * |参数名称：套餐内使用量。| |参数约束及描述： 套餐内使用量。|
     * @return freeResourceUsage
     */
    public BigDecimal getFreeResourceUsage() {
        return freeResourceUsage;
    }

    public void setFreeResourceUsage(BigDecimal freeResourceUsage) {
        this.freeResourceUsage = freeResourceUsage;
    }

    public SubCustomerResFeeRecordV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：金额单位：1：元；2：角；3：分。| |参数的约束及描述：金额单位：1：元；2：角；3：分。|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public SubCustomerResFeeRecordV2 withOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    


    /**
     * |参数名称：官网价。| |参数约束及描述： 官网价。|
     * @return officialAmount
     */
    public BigDecimal getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
    }

    public SubCustomerResFeeRecordV2 withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * |参数名称：订单ID，包周期资源使用记录才有该字段，按需资源为空。| |参数约束及描述：订单ID，包周期资源使用记录才有该字段，按需资源为空。|
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SubCustomerResFeeRecordV2 withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * |参数名称：周期类型：19：年；20：月；24：天；25：小时；5：分钟；6：秒。| |参数约束及描述：周期类型：19：年；20：月；24：天；25：小时；5：分钟；6：秒。|
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public SubCustomerResFeeRecordV2 withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * |参数名称：产品ID。| |参数约束及描述：产品ID。|
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public SubCustomerResFeeRecordV2 withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    


    /**
     * |参数名称：产品名称。| |参数约束及描述：产品名称。|
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public SubCustomerResFeeRecordV2 withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * |参数名称：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。| |参数约束及描述：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。|
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SubCustomerResFeeRecordV2 withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * |参数名称：资源ID。| |参数约束及描述：资源ID。|
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public SubCustomerResFeeRecordV2 withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * |参数名称：资源名称。| |参数约束及描述：资源名称。|
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public SubCustomerResFeeRecordV2 withResourceTag(String resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }

    


    /**
     * |参数名称：资源标签。| |参数约束及描述：资源标签。|
     * @return resourceTag
     */
    public String getResourceTag() {
        return resourceTag;
    }

    public void setResourceTag(String resourceTag) {
        this.resourceTag = resourceTag;
    }

    public SubCustomerResFeeRecordV2 withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * |参数名称：资源类型编码，例如ECS的VM为“hws.resource.type.vm”。具体请参见资源类型资源类型资源类型资源类型。| |参数约束及描述：资源类型编码，例如ECS的VM为“hws.resource.type.vm”。具体请参见资源类型资源类型资源类型资源类型。|
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public SubCustomerResFeeRecordV2 withRiUsage(BigDecimal riUsage) {
        this.riUsage = riUsage;
        return this;
    }

    


    /**
     * |参数名称：预留实例使用量。| |参数约束及描述： 预留实例使用量。|
     * @return riUsage
     */
    public BigDecimal getRiUsage() {
        return riUsage;
    }

    public void setRiUsage(BigDecimal riUsage) {
        this.riUsage = riUsage;
    }

    public SubCustomerResFeeRecordV2 withRiUsageMeasureId(Integer riUsageMeasureId) {
        this.riUsageMeasureId = riUsageMeasureId;
        return this;
    }

    


    /**
     * |参数名称：预留实例使用量单位。| |参数的约束及描述：预留实例使用量单位。|
     * @return riUsageMeasureId
     */
    public Integer getRiUsageMeasureId() {
        return riUsageMeasureId;
    }

    public void setRiUsageMeasureId(Integer riUsageMeasureId) {
        this.riUsageMeasureId = riUsageMeasureId;
    }

    public SubCustomerResFeeRecordV2 withSpecSize(BigDecimal specSize) {
        this.specSize = specSize;
        return this;
    }

    


    /**
     * |参数名称：线性大小| |参数约束及描述： 线性大小|
     * @return specSize
     */
    public BigDecimal getSpecSize() {
        return specSize;
    }

    public void setSpecSize(BigDecimal specSize) {
        this.specSize = specSize;
    }

    public SubCustomerResFeeRecordV2 withSpecSizeMeasureId(Integer specSizeMeasureId) {
        this.specSizeMeasureId = specSizeMeasureId;
        return this;
    }

    


    /**
     * |参数名称：线性大小单位| |参数的约束及描述：线性大小单位|
     * @return specSizeMeasureId
     */
    public Integer getSpecSizeMeasureId() {
        return specSizeMeasureId;
    }

    public void setSpecSizeMeasureId(Integer specSizeMeasureId) {
        this.specSizeMeasureId = specSizeMeasureId;
    }

    public SubCustomerResFeeRecordV2 withStoredCardAmount(BigDecimal storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
        return this;
    }

    


    /**
     * |参数名称：储值卡支付金额。| |参数约束及描述： 储值卡支付金额。|
     * @return storedCardAmount
     */
    public BigDecimal getStoredCardAmount() {
        return storedCardAmount;
    }

    public void setStoredCardAmount(BigDecimal storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
    }

    public SubCustomerResFeeRecordV2 withUsage(BigDecimal usage) {
        this.usage = usage;
        return this;
    }

    


    /**
     * |参数名称：使用量。| |参数约束及描述： 使用量。|
     * @return usage
     */
    public BigDecimal getUsage() {
        return usage;
    }

    public void setUsage(BigDecimal usage) {
        this.usage = usage;
    }

    public SubCustomerResFeeRecordV2 withUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
        return this;
    }

    


    /**
     * |参数名称：使用量度量单位| |参数的约束及描述：使用量度量单位|
     * @return usageMeasureId
     */
    public Integer getUsageMeasureId() {
        return usageMeasureId;
    }

    public void setUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
    }

    public SubCustomerResFeeRecordV2 withUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    


    /**
     * |参数名称：使用量类型| |参数约束及描述：使用量类型|
     * @return usageType
     */
    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubCustomerResFeeRecordV2 subCustomerResFeeRecordV2 = (SubCustomerResFeeRecordV2) o;
        return Objects.equals(this.adjustmentAmount, subCustomerResFeeRecordV2.adjustmentAmount) &&
            Objects.equals(this.amount, subCustomerResFeeRecordV2.amount) &&
            Objects.equals(this.billType, subCustomerResFeeRecordV2.billType) &&
            Objects.equals(this.bonusAmount, subCustomerResFeeRecordV2.bonusAmount) &&
            Objects.equals(this.cashAmount, subCustomerResFeeRecordV2.cashAmount) &&
            Objects.equals(this.chargeMode, subCustomerResFeeRecordV2.chargeMode) &&
            Objects.equals(this.cloudServiceType, subCustomerResFeeRecordV2.cloudServiceType) &&
            Objects.equals(this.couponAmount, subCustomerResFeeRecordV2.couponAmount) &&
            Objects.equals(this.creditAmount, subCustomerResFeeRecordV2.creditAmount) &&
            Objects.equals(this.debtAmount, subCustomerResFeeRecordV2.debtAmount) &&
            Objects.equals(this.discountAmount, subCustomerResFeeRecordV2.discountAmount) &&
            Objects.equals(this.effectiveTime, subCustomerResFeeRecordV2.effectiveTime) &&
            Objects.equals(this.expireTime, subCustomerResFeeRecordV2.expireTime) &&
            Objects.equals(this.flexipurchaseCouponAmount, subCustomerResFeeRecordV2.flexipurchaseCouponAmount) &&
            Objects.equals(this.freeResourceMeasureId, subCustomerResFeeRecordV2.freeResourceMeasureId) &&
            Objects.equals(this.freeResourceUsage, subCustomerResFeeRecordV2.freeResourceUsage) &&
            Objects.equals(this.measureId, subCustomerResFeeRecordV2.measureId) &&
            Objects.equals(this.officialAmount, subCustomerResFeeRecordV2.officialAmount) &&
            Objects.equals(this.orderId, subCustomerResFeeRecordV2.orderId) &&
            Objects.equals(this.periodType, subCustomerResFeeRecordV2.periodType) &&
            Objects.equals(this.productId, subCustomerResFeeRecordV2.productId) &&
            Objects.equals(this.productName, subCustomerResFeeRecordV2.productName) &&
            Objects.equals(this.region, subCustomerResFeeRecordV2.region) &&
            Objects.equals(this.resourceId, subCustomerResFeeRecordV2.resourceId) &&
            Objects.equals(this.resourceName, subCustomerResFeeRecordV2.resourceName) &&
            Objects.equals(this.resourceTag, subCustomerResFeeRecordV2.resourceTag) &&
            Objects.equals(this.resourceType, subCustomerResFeeRecordV2.resourceType) &&
            Objects.equals(this.riUsage, subCustomerResFeeRecordV2.riUsage) &&
            Objects.equals(this.riUsageMeasureId, subCustomerResFeeRecordV2.riUsageMeasureId) &&
            Objects.equals(this.specSize, subCustomerResFeeRecordV2.specSize) &&
            Objects.equals(this.specSizeMeasureId, subCustomerResFeeRecordV2.specSizeMeasureId) &&
            Objects.equals(this.storedCardAmount, subCustomerResFeeRecordV2.storedCardAmount) &&
            Objects.equals(this.usage, subCustomerResFeeRecordV2.usage) &&
            Objects.equals(this.usageMeasureId, subCustomerResFeeRecordV2.usageMeasureId) &&
            Objects.equals(this.usageType, subCustomerResFeeRecordV2.usageType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adjustmentAmount, amount, billType, bonusAmount, cashAmount, chargeMode, cloudServiceType, couponAmount, creditAmount, debtAmount, discountAmount, effectiveTime, expireTime, flexipurchaseCouponAmount, freeResourceMeasureId, freeResourceUsage, measureId, officialAmount, orderId, periodType, productId, productName, region, resourceId, resourceName, resourceTag, resourceType, riUsage, riUsageMeasureId, specSize, specSizeMeasureId, storedCardAmount, usage, usageMeasureId, usageType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubCustomerResFeeRecordV2 {\n");
        sb.append("    adjustmentAmount: ").append(toIndentedString(adjustmentAmount)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    bonusAmount: ").append(toIndentedString(bonusAmount)).append("\n");
        sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    freeResourceMeasureId: ").append(toIndentedString(freeResourceMeasureId)).append("\n");
        sb.append("    freeResourceUsage: ").append(toIndentedString(freeResourceUsage)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceTag: ").append(toIndentedString(resourceTag)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    riUsage: ").append(toIndentedString(riUsage)).append("\n");
        sb.append("    riUsageMeasureId: ").append(toIndentedString(riUsageMeasureId)).append("\n");
        sb.append("    specSize: ").append(toIndentedString(specSize)).append("\n");
        sb.append("    specSizeMeasureId: ").append(toIndentedString(specSizeMeasureId)).append("\n");
        sb.append("    storedCardAmount: ").append(toIndentedString(storedCardAmount)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    usageMeasureId: ").append(toIndentedString(usageMeasureId)).append("\n");
        sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
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

