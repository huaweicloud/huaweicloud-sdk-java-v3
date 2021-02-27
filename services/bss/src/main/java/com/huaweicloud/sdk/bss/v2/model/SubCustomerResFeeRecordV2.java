package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SubCustomerResFeeRecordV2
 */
public class SubCustomerResFeeRecordV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time")
    
    private String effectiveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private Double amount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage_type")
    
    private String usageType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage")
    
    private Double usage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage_measure_id")
    
    private Integer usageMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="free_resource_usage")
    
    private Double freeResourceUsage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="free_resource_measure_id")
    
    private Integer freeResourceMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private String chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_tag")
    
    private String resourceTag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private Integer billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_type")
    
    private String periodType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_spec_desc")
    
    private String productSpecDesc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ri_usage")
    
    private Double riUsage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ri_usage_measure_id")
    
    private Integer riUsageMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_amount")
    
    private Double officialAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_amount")
    
    private Double discountAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cash_amount")
    
    private Double cashAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credit_amount")
    
    private Double creditAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_amount")
    
    private Double couponAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flexipurchase_coupon_amount")
    
    private Double flexipurchaseCouponAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stored_card_amount")
    
    private Double storedCardAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bonus_amount")
    
    private Double bonusAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="debt_amount")
    
    private Double debtAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adjustment_amount")
    
    private Double adjustmentAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_size")
    
    private Double specSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_size_measure_id")
    
    private Integer specSizeMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_name")
    
    private String regionName;

    public SubCustomerResFeeRecordV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    


    /**
     * 消费记录对应的资源使用的开始时间。  说明： 按需有效，包年/包月该字段保留。
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
     * 消费记录对应的资源使用的结束时间。  说明： 按需有效，包年/包月该字段保留。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public SubCustomerResFeeRecordV2 withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    


    /**
     * 产品ID。
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
     * 产品名称。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public SubCustomerResFeeRecordV2 withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    


    /**
     * 订单ID。  说明： 包年/包月资源的使用记录才有该字段，按需资源为空。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public SubCustomerResFeeRecordV2 withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * 消费金额，包括现金券和代金券金额，精确到小数点后2位。
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public SubCustomerResFeeRecordV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * 金额单位： 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public SubCustomerResFeeRecordV2 withUsageType(String usageType) {
        this.usageType = usageType;
        return this;
    }

    


    /**
     * 资源的使用量类型，您可以调用查询使用量类型列表接口获取。
     * @return usageType
     */
    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public SubCustomerResFeeRecordV2 withUsage(Double usage) {
        this.usage = usage;
        return this;
    }

    


    /**
     * 资源的使用量。
     * @return usage
     */
    public Double getUsage() {
        return usage;
    }

    public void setUsage(Double usage) {
        this.usage = usage;
    }

    public SubCustomerResFeeRecordV2 withUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
        return this;
    }

    


    /**
     * 资源的使用量单位，您可以调用查询使用量单位列表接口获取。
     * @return usageMeasureId
     */
    public Integer getUsageMeasureId() {
        return usageMeasureId;
    }

    public void setUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
    }

    public SubCustomerResFeeRecordV2 withFreeResourceUsage(Double freeResourceUsage) {
        this.freeResourceUsage = freeResourceUsage;
        return this;
    }

    


    /**
     * 套餐内使用量。
     * @return freeResourceUsage
     */
    public Double getFreeResourceUsage() {
        return freeResourceUsage;
    }

    public void setFreeResourceUsage(Double freeResourceUsage) {
        this.freeResourceUsage = freeResourceUsage;
    }

    public SubCustomerResFeeRecordV2 withFreeResourceMeasureId(Integer freeResourceMeasureId) {
        this.freeResourceMeasureId = freeResourceMeasureId;
        return this;
    }

    


    /**
     * 套餐内使用量单位，您可以调用查询使用量单位列表接口获取。
     * @return freeResourceMeasureId
     */
    public Integer getFreeResourceMeasureId() {
        return freeResourceMeasureId;
    }

    public void setFreeResourceMeasureId(Integer freeResourceMeasureId) {
        this.freeResourceMeasureId = freeResourceMeasureId;
    }

    public SubCustomerResFeeRecordV2 withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * 云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。您可以调用查询云服务类型列表接口获取。
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public SubCustomerResFeeRecordV2 withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * 云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SubCustomerResFeeRecordV2 withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public SubCustomerResFeeRecordV2 withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 计费模式。 1 : 包年/包月3：按需10：预留实例
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public SubCustomerResFeeRecordV2 withResourceTag(String resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }

    


    /**
     * 资源标签。
     * @return resourceTag
     */
    public String getResourceTag() {
        return resourceTag;
    }

    public void setResourceTag(String resourceTag) {
        this.resourceTag = resourceTag;
    }

    public SubCustomerResFeeRecordV2 withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * 资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public SubCustomerResFeeRecordV2 withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public SubCustomerResFeeRecordV2 withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * 账单类型。 1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿14：消费-服务支持计划月末扣费16：调账-扣费
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public SubCustomerResFeeRecordV2 withPeriodType(String periodType) {
        this.periodType = periodType;
        return this;
    }

    


    /**
     * 周期类型： 19：年20：月24：天25：小时5：一次性  说明： charge_mode取值为“1：包年/包月资源”或“10：预留实例”时该参数才有值；charge_mode取值为“3：按需资源”时该参数为空。
     * @return periodType
     */
    public String getPeriodType() {
        return periodType;
    }

    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public SubCustomerResFeeRecordV2 withProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
        return this;
    }

    


    /**
     * 产品的规格描述。例如：“普通IO|100.0GB”。
     * @return productSpecDesc
     */
    public String getProductSpecDesc() {
        return productSpecDesc;
    }

    public void setProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
    }

    public SubCustomerResFeeRecordV2 withRiUsage(Double riUsage) {
        this.riUsage = riUsage;
        return this;
    }

    


    /**
     * 预留实例使用量。
     * @return riUsage
     */
    public Double getRiUsage() {
        return riUsage;
    }

    public void setRiUsage(Double riUsage) {
        this.riUsage = riUsage;
    }

    public SubCustomerResFeeRecordV2 withRiUsageMeasureId(Integer riUsageMeasureId) {
        this.riUsageMeasureId = riUsageMeasureId;
        return this;
    }

    


    /**
     * 预留实例使用量单位。
     * @return riUsageMeasureId
     */
    public Integer getRiUsageMeasureId() {
        return riUsageMeasureId;
    }

    public void setRiUsageMeasureId(Integer riUsageMeasureId) {
        this.riUsageMeasureId = riUsageMeasureId;
    }

    public SubCustomerResFeeRecordV2 withOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    


    /**
     * 官网价。
     * @return officialAmount
     */
    public Double getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
    }

    public SubCustomerResFeeRecordV2 withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    


    /**
     * 折扣金额
     * @return discountAmount
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public SubCustomerResFeeRecordV2 withCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }

    


    /**
     * 现金支付金额
     * @return cashAmount
     */
    public Double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public SubCustomerResFeeRecordV2 withCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    


    /**
     * 信用额度支付金额。
     * @return creditAmount
     */
    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public SubCustomerResFeeRecordV2 withCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    


    /**
     * 代金券支付金额。
     * @return couponAmount
     */
    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public SubCustomerResFeeRecordV2 withFlexipurchaseCouponAmount(Double flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
        return this;
    }

    


    /**
     * 现金券支付金额。
     * @return flexipurchaseCouponAmount
     */
    public Double getFlexipurchaseCouponAmount() {
        return flexipurchaseCouponAmount;
    }

    public void setFlexipurchaseCouponAmount(Double flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
    }

    public SubCustomerResFeeRecordV2 withStoredCardAmount(Double storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
        return this;
    }

    


    /**
     * 储值卡支付金额。
     * @return storedCardAmount
     */
    public Double getStoredCardAmount() {
        return storedCardAmount;
    }

    public void setStoredCardAmount(Double storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
    }

    public SubCustomerResFeeRecordV2 withBonusAmount(Double bonusAmount) {
        this.bonusAmount = bonusAmount;
        return this;
    }

    


    /**
     * 奖励金支付金额（用于现网客户未使用完的奖励金）。
     * @return bonusAmount
     */
    public Double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(Double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public SubCustomerResFeeRecordV2 withDebtAmount(Double debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    


    /**
     * 欠费金额。
     * @return debtAmount
     */
    public Double getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(Double debtAmount) {
        this.debtAmount = debtAmount;
    }

    public SubCustomerResFeeRecordV2 withAdjustmentAmount(Double adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
        return this;
    }

    


    /**
     * 欠费核销金额。
     * @return adjustmentAmount
     */
    public Double getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(Double adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    public SubCustomerResFeeRecordV2 withSpecSize(Double specSize) {
        this.specSize = specSize;
        return this;
    }

    


    /**
     * 产品的实例大小，仅线性产品有效。 线性产品为包括硬盘，带宽等在订购时需要指定大小的产品。例如硬盘在订购时需选择10G、20G等不同大小。
     * @return specSize
     */
    public Double getSpecSize() {
        return specSize;
    }

    public void setSpecSize(Double specSize) {
        this.specSize = specSize;
    }

    public SubCustomerResFeeRecordV2 withSpecSizeMeasureId(Integer specSizeMeasureId) {
        this.specSizeMeasureId = specSizeMeasureId;
        return this;
    }

    


    /**
     * 产品实例大小的单位，仅线性产品有该字段。您可以调用查询使用量单位列表接口获取。
     * @return specSizeMeasureId
     */
    public Integer getSpecSizeMeasureId() {
        return specSizeMeasureId;
    }

    public void setSpecSizeMeasureId(Integer specSizeMeasureId) {
        this.specSizeMeasureId = specSizeMeasureId;
    }

    public SubCustomerResFeeRecordV2 withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    


    /**
     * 云服务区名称，例如：“华北-北京一”。具体请参见地区和终端节点对应云服务的“区域名称”列的值。
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
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
        return Objects.equals(this.effectiveTime, subCustomerResFeeRecordV2.effectiveTime) &&
            Objects.equals(this.expireTime, subCustomerResFeeRecordV2.expireTime) &&
            Objects.equals(this.productId, subCustomerResFeeRecordV2.productId) &&
            Objects.equals(this.productName, subCustomerResFeeRecordV2.productName) &&
            Objects.equals(this.orderId, subCustomerResFeeRecordV2.orderId) &&
            Objects.equals(this.amount, subCustomerResFeeRecordV2.amount) &&
            Objects.equals(this.measureId, subCustomerResFeeRecordV2.measureId) &&
            Objects.equals(this.usageType, subCustomerResFeeRecordV2.usageType) &&
            Objects.equals(this.usage, subCustomerResFeeRecordV2.usage) &&
            Objects.equals(this.usageMeasureId, subCustomerResFeeRecordV2.usageMeasureId) &&
            Objects.equals(this.freeResourceUsage, subCustomerResFeeRecordV2.freeResourceUsage) &&
            Objects.equals(this.freeResourceMeasureId, subCustomerResFeeRecordV2.freeResourceMeasureId) &&
            Objects.equals(this.cloudServiceType, subCustomerResFeeRecordV2.cloudServiceType) &&
            Objects.equals(this.region, subCustomerResFeeRecordV2.region) &&
            Objects.equals(this.resourceType, subCustomerResFeeRecordV2.resourceType) &&
            Objects.equals(this.chargeMode, subCustomerResFeeRecordV2.chargeMode) &&
            Objects.equals(this.resourceTag, subCustomerResFeeRecordV2.resourceTag) &&
            Objects.equals(this.resourceName, subCustomerResFeeRecordV2.resourceName) &&
            Objects.equals(this.resourceId, subCustomerResFeeRecordV2.resourceId) &&
            Objects.equals(this.billType, subCustomerResFeeRecordV2.billType) &&
            Objects.equals(this.periodType, subCustomerResFeeRecordV2.periodType) &&
            Objects.equals(this.productSpecDesc, subCustomerResFeeRecordV2.productSpecDesc) &&
            Objects.equals(this.riUsage, subCustomerResFeeRecordV2.riUsage) &&
            Objects.equals(this.riUsageMeasureId, subCustomerResFeeRecordV2.riUsageMeasureId) &&
            Objects.equals(this.officialAmount, subCustomerResFeeRecordV2.officialAmount) &&
            Objects.equals(this.discountAmount, subCustomerResFeeRecordV2.discountAmount) &&
            Objects.equals(this.cashAmount, subCustomerResFeeRecordV2.cashAmount) &&
            Objects.equals(this.creditAmount, subCustomerResFeeRecordV2.creditAmount) &&
            Objects.equals(this.couponAmount, subCustomerResFeeRecordV2.couponAmount) &&
            Objects.equals(this.flexipurchaseCouponAmount, subCustomerResFeeRecordV2.flexipurchaseCouponAmount) &&
            Objects.equals(this.storedCardAmount, subCustomerResFeeRecordV2.storedCardAmount) &&
            Objects.equals(this.bonusAmount, subCustomerResFeeRecordV2.bonusAmount) &&
            Objects.equals(this.debtAmount, subCustomerResFeeRecordV2.debtAmount) &&
            Objects.equals(this.adjustmentAmount, subCustomerResFeeRecordV2.adjustmentAmount) &&
            Objects.equals(this.specSize, subCustomerResFeeRecordV2.specSize) &&
            Objects.equals(this.specSizeMeasureId, subCustomerResFeeRecordV2.specSizeMeasureId) &&
            Objects.equals(this.regionName, subCustomerResFeeRecordV2.regionName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(effectiveTime, expireTime, productId, productName, orderId, amount, measureId, usageType, usage, usageMeasureId, freeResourceUsage, freeResourceMeasureId, cloudServiceType, region, resourceType, chargeMode, resourceTag, resourceName, resourceId, billType, periodType, productSpecDesc, riUsage, riUsageMeasureId, officialAmount, discountAmount, cashAmount, creditAmount, couponAmount, flexipurchaseCouponAmount, storedCardAmount, bonusAmount, debtAmount, adjustmentAmount, specSize, specSizeMeasureId, regionName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubCustomerResFeeRecordV2 {\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    usageMeasureId: ").append(toIndentedString(usageMeasureId)).append("\n");
        sb.append("    freeResourceUsage: ").append(toIndentedString(freeResourceUsage)).append("\n");
        sb.append("    freeResourceMeasureId: ").append(toIndentedString(freeResourceMeasureId)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    resourceTag: ").append(toIndentedString(resourceTag)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
        sb.append("    riUsage: ").append(toIndentedString(riUsage)).append("\n");
        sb.append("    riUsageMeasureId: ").append(toIndentedString(riUsageMeasureId)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    storedCardAmount: ").append(toIndentedString(storedCardAmount)).append("\n");
        sb.append("    bonusAmount: ").append(toIndentedString(bonusAmount)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    adjustmentAmount: ").append(toIndentedString(adjustmentAmount)).append("\n");
        sb.append("    specSize: ").append(toIndentedString(specSize)).append("\n");
        sb.append("    specSizeMeasureId: ").append(toIndentedString(specSizeMeasureId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
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

