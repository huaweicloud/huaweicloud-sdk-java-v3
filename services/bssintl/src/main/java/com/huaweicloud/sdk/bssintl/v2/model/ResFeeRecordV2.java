package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResFeeRecordV2
 */
public class ResFeeRecordV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_date")
    
    private String billDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private Integer billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_name")
    
    private String regionName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private String resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="effective_time")
    
    private String effectiveTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;


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
    @JsonProperty(value="product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_spec_desc")
    
    private String productSpecDesc;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sku_code")
    
    private String skuCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_size")
    
    private Double specSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_size_measure_id")
    
    private Integer specSizeMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trade_id")
    
    private String tradeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_name")
    
    private String enterpriseProjectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private String chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="period_type")
    
    private String periodType;


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
    @JsonProperty(value="ri_usage")
    
    private Double riUsage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ri_usage_measure_id")
    
    private Integer riUsageMeasureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit_price")
    
    private Double unitPrice;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="unit")
    
    private String unit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_amount")
    
    private Double officialAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_amount")
    
    private Double discountAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private Double amount;


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
    @JsonProperty(value="measure_id")
    
    private Integer measureId;

    public ResFeeRecordV2 withBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }

    


    /**
     * |参数名称：消费记录日期：格式：YYYY-MM-DD。按照东八区截取| |参数约束及描述：消费记录日期：格式：YYYY-MM-DD。按照东八区截取|
     * @return billDate
     */
    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public ResFeeRecordV2 withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * |参数名称：账单类型。1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿12：消费-按时计费13：消费-退订手续费14：消费-服务支持计划月末扣费16：调账-扣费| |参数的约束及描述：账单类型。1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿12：消费-按时计费13：消费-退订手续费14：消费-服务支持计划月末扣费 15消费-税金16：调账-扣费17：消费-保底差额 100：退款-退订税金 101：调账-补偿税金 102：调账-扣费税金|
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public ResFeeRecordV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：消费的客户账号ID。| |参数约束及描述：如果是查询自己，这个地方是自身的ID; 如果是查询某个企业子客户，这个地方是企业子客户ID如果是查询以及下面的所有子客户，这个地方是消费的实际客户ID; 如果是企业主自身消费，为企业主ID，如果这条消费记录是某个企业子客户的消费，这个地方的ID是企业子账号ID。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ResFeeRecordV2 withRegion(String region) {
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

    public ResFeeRecordV2 withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    


    /**
     * |参数名称：云服务区名称| |参数约束及描述：云服务区名称|
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public ResFeeRecordV2 withCloudServiceType(String cloudServiceType) {
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

    public ResFeeRecordV2 withResourceType(String resourceType) {
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

    public ResFeeRecordV2 withEffectiveTime(String effectiveTime) {
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

    public ResFeeRecordV2 withExpireTime(String expireTime) {
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

    public ResFeeRecordV2 withResourceId(String resourceId) {
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

    public ResFeeRecordV2 withResourceName(String resourceName) {
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

    public ResFeeRecordV2 withResourceTag(String resourceTag) {
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

    public ResFeeRecordV2 withProductId(String productId) {
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

    public ResFeeRecordV2 withProductName(String productName) {
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

    public ResFeeRecordV2 withProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
        return this;
    }

    


    /**
     * |参数名称：产品规格描述。| |参数约束及描述：产品规格描述，举例为：普通IO|100.0GB。|
     * @return productSpecDesc
     */
    public String getProductSpecDesc() {
        return productSpecDesc;
    }

    public void setProductSpecDesc(String productSpecDesc) {
        this.productSpecDesc = productSpecDesc;
    }

    public ResFeeRecordV2 withSkuCode(String skuCode) {
        this.skuCode = skuCode;
        return this;
    }

    


    /**
     * |参数名称：sku编码| |参数约束及描述：sku编码|
     * @return skuCode
     */
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public ResFeeRecordV2 withSpecSize(Double specSize) {
        this.specSize = specSize;
        return this;
    }

    


    /**
     * |参数名称：线性大小| |参数约束及描述： 线性大小|
     * @return specSize
     */
    public Double getSpecSize() {
        return specSize;
    }

    public void setSpecSize(Double specSize) {
        this.specSize = specSize;
    }

    public ResFeeRecordV2 withSpecSizeMeasureId(Integer specSizeMeasureId) {
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

    public ResFeeRecordV2 withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    


    /**
     * |参数名称：订单ID 或 交易ID，扣费维度的唯一标识| |参数约束及描述：订单ID 或 交易ID，扣费维度的唯一标识|
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public ResFeeRecordV2 withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * |参数名称：企业项目ID。| |参数约束及描述：企业项目ID。|
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ResFeeRecordV2 withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    


    /**
     * |参数名称：企业项目名称。| |参数约束及描述：企业项目名称。|
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public ResFeeRecordV2 withChargeMode(String chargeMode) {
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

    public ResFeeRecordV2 withOrderId(String orderId) {
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

    public ResFeeRecordV2 withPeriodType(String periodType) {
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

    public ResFeeRecordV2 withUsageType(String usageType) {
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

    public ResFeeRecordV2 withUsage(Double usage) {
        this.usage = usage;
        return this;
    }

    


    /**
     * |参数名称：使用量。| |参数约束及描述： 使用量。|
     * @return usage
     */
    public Double getUsage() {
        return usage;
    }

    public void setUsage(Double usage) {
        this.usage = usage;
    }

    public ResFeeRecordV2 withUsageMeasureId(Integer usageMeasureId) {
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

    public ResFeeRecordV2 withFreeResourceUsage(Double freeResourceUsage) {
        this.freeResourceUsage = freeResourceUsage;
        return this;
    }

    


    /**
     * |参数名称：套餐内使用量。| |参数约束及描述： 套餐内使用量。|
     * @return freeResourceUsage
     */
    public Double getFreeResourceUsage() {
        return freeResourceUsage;
    }

    public void setFreeResourceUsage(Double freeResourceUsage) {
        this.freeResourceUsage = freeResourceUsage;
    }

    public ResFeeRecordV2 withFreeResourceMeasureId(Integer freeResourceMeasureId) {
        this.freeResourceMeasureId = freeResourceMeasureId;
        return this;
    }

    


    /**
     * |参数名称：套餐内使用量单位，具体枚举参考：usageMeasureId| |参数的约束及描述：套餐内使用量单位，具体枚举参考：usageMeasureId|
     * @return freeResourceMeasureId
     */
    public Integer getFreeResourceMeasureId() {
        return freeResourceMeasureId;
    }

    public void setFreeResourceMeasureId(Integer freeResourceMeasureId) {
        this.freeResourceMeasureId = freeResourceMeasureId;
    }

    public ResFeeRecordV2 withRiUsage(Double riUsage) {
        this.riUsage = riUsage;
        return this;
    }

    


    /**
     * |参数名称：预留实例使用量。| |参数约束及描述： 预留实例使用量。|
     * @return riUsage
     */
    public Double getRiUsage() {
        return riUsage;
    }

    public void setRiUsage(Double riUsage) {
        this.riUsage = riUsage;
    }

    public ResFeeRecordV2 withRiUsageMeasureId(Integer riUsageMeasureId) {
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

    public ResFeeRecordV2 withUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    


    /**
     * |参数名称：单价| |参数约束及描述：单价|
     * @return unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ResFeeRecordV2 withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    


    /**
     * |参数名称：单价单位| |参数约束及描述：单价单位|
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ResFeeRecordV2 withOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    


    /**
     * |参数名称：官网价。| |参数约束及描述： 官网价。|
     * @return officialAmount
     */
    public Double getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(Double officialAmount) {
        this.officialAmount = officialAmount;
    }

    public ResFeeRecordV2 withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    


    /**
     * |参数名称：折扣金额| |参数约束及描述： 折扣金额|
     * @return discountAmount
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public ResFeeRecordV2 withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：消费金额，包括现金券和代金券金额，精确到小数点后2位。| |参数约束及描述： 消费金额，包括现金券和代金券金额，精确到小数点后2位。|
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public ResFeeRecordV2 withCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }

    


    /**
     * |参数名称：现金支付金额| |参数约束及描述： 现金支付金额|
     * @return cashAmount
     */
    public Double getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
    }

    public ResFeeRecordV2 withCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    


    /**
     * |参数名称：信用额度支付金额。| |参数约束及描述： 信用额度支付金额。|
     * @return creditAmount
     */
    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public ResFeeRecordV2 withCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    


    /**
     * |参数名称：代金券支付金额。| |参数约束及描述： 代金券支付金额。|
     * @return couponAmount
     */
    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public ResFeeRecordV2 withFlexipurchaseCouponAmount(Double flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
        return this;
    }

    


    /**
     * |参数名称：现金券支付金额。| |参数约束及描述： 现金券支付金额。|
     * @return flexipurchaseCouponAmount
     */
    public Double getFlexipurchaseCouponAmount() {
        return flexipurchaseCouponAmount;
    }

    public void setFlexipurchaseCouponAmount(Double flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
    }

    public ResFeeRecordV2 withStoredCardAmount(Double storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
        return this;
    }

    


    /**
     * |参数名称：储值卡支付金额。| |参数约束及描述： 储值卡支付金额。|
     * @return storedCardAmount
     */
    public Double getStoredCardAmount() {
        return storedCardAmount;
    }

    public void setStoredCardAmount(Double storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
    }

    public ResFeeRecordV2 withBonusAmount(Double bonusAmount) {
        this.bonusAmount = bonusAmount;
        return this;
    }

    


    /**
     * |参数名称：奖励金支付金额（用于现网未清干净的奖励金）。| |参数约束及描述： 奖励金支付金额（用于现网未清干净的奖励金）。|
     * @return bonusAmount
     */
    public Double getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(Double bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public ResFeeRecordV2 withDebtAmount(Double debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    


    /**
     * |参数名称：欠费金额。| |参数约束及描述： 欠费金额。|
     * @return debtAmount
     */
    public Double getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(Double debtAmount) {
        this.debtAmount = debtAmount;
    }

    public ResFeeRecordV2 withAdjustmentAmount(Double adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
        return this;
    }

    


    /**
     * |参数名称：欠费核销金额。| |参数约束及描述： 欠费核销金额。|
     * @return adjustmentAmount
     */
    public Double getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(Double adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    public ResFeeRecordV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：金额单位：1：元| |参数的约束及描述：金额单位：1：元|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResFeeRecordV2 resFeeRecordV2 = (ResFeeRecordV2) o;
        return Objects.equals(this.billDate, resFeeRecordV2.billDate) &&
            Objects.equals(this.billType, resFeeRecordV2.billType) &&
            Objects.equals(this.customerId, resFeeRecordV2.customerId) &&
            Objects.equals(this.region, resFeeRecordV2.region) &&
            Objects.equals(this.regionName, resFeeRecordV2.regionName) &&
            Objects.equals(this.cloudServiceType, resFeeRecordV2.cloudServiceType) &&
            Objects.equals(this.resourceType, resFeeRecordV2.resourceType) &&
            Objects.equals(this.effectiveTime, resFeeRecordV2.effectiveTime) &&
            Objects.equals(this.expireTime, resFeeRecordV2.expireTime) &&
            Objects.equals(this.resourceId, resFeeRecordV2.resourceId) &&
            Objects.equals(this.resourceName, resFeeRecordV2.resourceName) &&
            Objects.equals(this.resourceTag, resFeeRecordV2.resourceTag) &&
            Objects.equals(this.productId, resFeeRecordV2.productId) &&
            Objects.equals(this.productName, resFeeRecordV2.productName) &&
            Objects.equals(this.productSpecDesc, resFeeRecordV2.productSpecDesc) &&
            Objects.equals(this.skuCode, resFeeRecordV2.skuCode) &&
            Objects.equals(this.specSize, resFeeRecordV2.specSize) &&
            Objects.equals(this.specSizeMeasureId, resFeeRecordV2.specSizeMeasureId) &&
            Objects.equals(this.tradeId, resFeeRecordV2.tradeId) &&
            Objects.equals(this.enterpriseProjectId, resFeeRecordV2.enterpriseProjectId) &&
            Objects.equals(this.enterpriseProjectName, resFeeRecordV2.enterpriseProjectName) &&
            Objects.equals(this.chargeMode, resFeeRecordV2.chargeMode) &&
            Objects.equals(this.orderId, resFeeRecordV2.orderId) &&
            Objects.equals(this.periodType, resFeeRecordV2.periodType) &&
            Objects.equals(this.usageType, resFeeRecordV2.usageType) &&
            Objects.equals(this.usage, resFeeRecordV2.usage) &&
            Objects.equals(this.usageMeasureId, resFeeRecordV2.usageMeasureId) &&
            Objects.equals(this.freeResourceUsage, resFeeRecordV2.freeResourceUsage) &&
            Objects.equals(this.freeResourceMeasureId, resFeeRecordV2.freeResourceMeasureId) &&
            Objects.equals(this.riUsage, resFeeRecordV2.riUsage) &&
            Objects.equals(this.riUsageMeasureId, resFeeRecordV2.riUsageMeasureId) &&
            Objects.equals(this.unitPrice, resFeeRecordV2.unitPrice) &&
            Objects.equals(this.unit, resFeeRecordV2.unit) &&
            Objects.equals(this.officialAmount, resFeeRecordV2.officialAmount) &&
            Objects.equals(this.discountAmount, resFeeRecordV2.discountAmount) &&
            Objects.equals(this.amount, resFeeRecordV2.amount) &&
            Objects.equals(this.cashAmount, resFeeRecordV2.cashAmount) &&
            Objects.equals(this.creditAmount, resFeeRecordV2.creditAmount) &&
            Objects.equals(this.couponAmount, resFeeRecordV2.couponAmount) &&
            Objects.equals(this.flexipurchaseCouponAmount, resFeeRecordV2.flexipurchaseCouponAmount) &&
            Objects.equals(this.storedCardAmount, resFeeRecordV2.storedCardAmount) &&
            Objects.equals(this.bonusAmount, resFeeRecordV2.bonusAmount) &&
            Objects.equals(this.debtAmount, resFeeRecordV2.debtAmount) &&
            Objects.equals(this.adjustmentAmount, resFeeRecordV2.adjustmentAmount) &&
            Objects.equals(this.measureId, resFeeRecordV2.measureId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(billDate, billType, customerId, region, regionName, cloudServiceType, resourceType, effectiveTime, expireTime, resourceId, resourceName, resourceTag, productId, productName, productSpecDesc, skuCode, specSize, specSizeMeasureId, tradeId, enterpriseProjectId, enterpriseProjectName, chargeMode, orderId, periodType, usageType, usage, usageMeasureId, freeResourceUsage, freeResourceMeasureId, riUsage, riUsageMeasureId, unitPrice, unit, officialAmount, discountAmount, amount, cashAmount, creditAmount, couponAmount, flexipurchaseCouponAmount, storedCardAmount, bonusAmount, debtAmount, adjustmentAmount, measureId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResFeeRecordV2 {\n");
        sb.append("    billDate: ").append(toIndentedString(billDate)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceTag: ").append(toIndentedString(resourceTag)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
        sb.append("    skuCode: ").append(toIndentedString(skuCode)).append("\n");
        sb.append("    specSize: ").append(toIndentedString(specSize)).append("\n");
        sb.append("    specSizeMeasureId: ").append(toIndentedString(specSizeMeasureId)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    usageMeasureId: ").append(toIndentedString(usageMeasureId)).append("\n");
        sb.append("    freeResourceUsage: ").append(toIndentedString(freeResourceUsage)).append("\n");
        sb.append("    freeResourceMeasureId: ").append(toIndentedString(freeResourceMeasureId)).append("\n");
        sb.append("    riUsage: ").append(toIndentedString(riUsage)).append("\n");
        sb.append("    riUsageMeasureId: ").append(toIndentedString(riUsageMeasureId)).append("\n");
        sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    storedCardAmount: ").append(toIndentedString(storedCardAmount)).append("\n");
        sb.append("    bonusAmount: ").append(toIndentedString(bonusAmount)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    adjustmentAmount: ").append(toIndentedString(adjustmentAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
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

