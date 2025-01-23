package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ResFeeRecordV2
 */
public class ResFeeRecordV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_date")

    private String billDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_type")

    private Integer billType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_name")

    private String cloudServiceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_tag")

    private String resourceTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_spec_desc")

    private String productSpecDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku_code")

    private String skuCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_size")

    private BigDecimal specSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_size_measure_id")

    private Integer specSizeMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_time")

    private String tradeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_type")

    private String usageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private BigDecimal usage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_measure_id")

    private Integer usageMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_usage")

    private BigDecimal freeResourceUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_measure_id")

    private Integer freeResourceMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ri_usage")

    private BigDecimal riUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ri_usage_measure_id")

    private Integer riUsageMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_price")

    private BigDecimal unitPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_amount")

    private BigDecimal officialAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    private BigDecimal discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private BigDecimal amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cash_amount")

    private BigDecimal cashAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credit_amount")

    private BigDecimal creditAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_amount")

    private BigDecimal couponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flexipurchase_coupon_amount")

    private BigDecimal flexipurchaseCouponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stored_card_amount")

    private BigDecimal storedCardAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bonus_amount")

    private BigDecimal bonusAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debt_amount")

    private BigDecimal debtAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjustment_amount")

    private BigDecimal adjustmentAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "formula")

    private String formula;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_service_type_code")

    private String subServiceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_service_type_name")

    private String subServiceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_resource_type_code")

    private String subResourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_resource_type_name")

    private String subResourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_resource_id")

    private String subResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_resource_name")

    private String subResourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_time")

    private String consumeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_order_id")

    private String relativeOrderId;

    public ResFeeRecordV2 withBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }

    /**
     * 资源消费记录的日期。 格式：YYYY-MM-DD。按照东八区时间截取。
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
     * 账单类型。1：消费-新购 2：消费-续订 3：消费-变更 4：退款-退订 5：消费-使用 8：消费-自动续订 9：调账-补偿 14：消费-服务支持计划月末扣费 16：调账-扣费 18：消费-按月付费 20：退款-变更 23：消费-节省计划抵扣 24：退款-包年/包月转按需 103：消费-按年付费
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
     * 消费的客户账号ID。 如果是普通客户或者企业子查询消费记录，只能查询到自身的消费记录，则这个地方显示的是自身的客户ID如果是企业主查询消费记录，可以查询到自身以及企业子的消费记录，这个地方是消费的实际客户ID，如果是企业主自身消费，为企业主ID，如果这条消费记录是某个企业子客户的消费，这个地方的ID是企业子账号ID。
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
     * 云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
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
     * 云服务区名称，例如：“华北-北京一”。具体请参见地区和终端节点对应云服务的“区域名称”列的值。
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
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用查询云服务类型列表接口获取。
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
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ResFeeRecordV2 withCloudServiceTypeName(String cloudServiceTypeName) {
        this.cloudServiceTypeName = cloudServiceTypeName;
        return this;
    }

    /**
     * 云服务类型名称。例如ECS的云服务类型名称为“弹性云服务器”。
     * @return cloudServiceTypeName
     */
    public String getCloudServiceTypeName() {
        return cloudServiceTypeName;
    }

    public void setCloudServiceTypeName(String cloudServiceTypeName) {
        this.cloudServiceTypeName = cloudServiceTypeName;
    }

    public ResFeeRecordV2 withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    /**
     * 资源类型名称。例如ECS的资源类型名称为“云主机”。
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    public ResFeeRecordV2 withEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 费用对应的资源使用的开始时间，按需有效，包年/包月该字段保留。
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
     * 费用对应的资源使用的结束时间，按需有效，包年/包月该字段保留。
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
     * 资源ID。
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
     * 资源名称。
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
     * 资源标签。
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
     * 产品ID。
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
     * 产品名称。
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
     * 产品的规格描述。
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
     * SKU编码，在账单中唯一标识一个资源的规格。
     * @return skuCode
     */
    public String getSkuCode() {
        return skuCode;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public ResFeeRecordV2 withSpecSize(BigDecimal specSize) {
        this.specSize = specSize;
        return this;
    }

    /**
     * 产品的实例大小，仅线性产品有效。  说明： 线性产品是指订购时需要指定大小的产品。例如硬盘在订购时需选择10G、20G等不同大小规格。
     * @return specSize
     */
    public BigDecimal getSpecSize() {
        return specSize;
    }

    public void setSpecSize(BigDecimal specSize) {
        this.specSize = specSize;
    }

    public ResFeeRecordV2 withSpecSizeMeasureId(Integer specSizeMeasureId) {
        this.specSizeMeasureId = specSizeMeasureId;
        return this;
    }

    /**
     * 产品实例大小的单位，仅线性产品有该字段。 您可以调用查询度量单位列表接口获取。
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
     * 订单ID或交易ID，扣费维度的唯一标识。
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public ResFeeRecordV2 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。 按账期类型统计时不返回唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResFeeRecordV2 withTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    /**
     * 交易时间。
     * @return tradeTime
     */
    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public ResFeeRecordV2 withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目标识（企业项目ID）。 default项目对应ID：0未归集（表示该云服务不支持企业项目管理能力）项目对应ID：null其余项目对应ID获取方法请参见[如何获取企业项目ID](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)。
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
     * 企业项目的名称。
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
     * 计费模式。 1：包年/包月3：按需10：预留实例11：节省计划
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
     * 订单ID。  说明： 包年/包月资源的使用记录才有该字段，按需资源则为空。
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
     * 周期类型： 19：年20：月24：天25：小时5：一次性
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
     * 资源使用量的类型，您可以调用查询使用量类型列表接口获取。
     * @return usageType
     */
    public String getUsageType() {
        return usageType;
    }

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    public ResFeeRecordV2 withUsage(BigDecimal usage) {
        this.usage = usage;
        return this;
    }

    /**
     * 资源的使用量。  说明： 查询包周期资源，不返回资源的使用量。
     * @return usage
     */
    public BigDecimal getUsage() {
        return usage;
    }

    public void setUsage(BigDecimal usage) {
        this.usage = usage;
    }

    public ResFeeRecordV2 withUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
        return this;
    }

    /**
     * 资源使用量的度量单位，您可以调用查询度量单位列表接口获取。  说明： 查询包周期资源，不返回资源使用量的度量单位。
     * @return usageMeasureId
     */
    public Integer getUsageMeasureId() {
        return usageMeasureId;
    }

    public void setUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
    }

    public ResFeeRecordV2 withFreeResourceUsage(BigDecimal freeResourceUsage) {
        this.freeResourceUsage = freeResourceUsage;
        return this;
    }

    /**
     * 套餐内使用量。
     * @return freeResourceUsage
     */
    public BigDecimal getFreeResourceUsage() {
        return freeResourceUsage;
    }

    public void setFreeResourceUsage(BigDecimal freeResourceUsage) {
        this.freeResourceUsage = freeResourceUsage;
    }

    public ResFeeRecordV2 withFreeResourceMeasureId(Integer freeResourceMeasureId) {
        this.freeResourceMeasureId = freeResourceMeasureId;
        return this;
    }

    /**
     * 套餐内使用量的度量单位，您可以调用查询度量单位列表接口获取。
     * @return freeResourceMeasureId
     */
    public Integer getFreeResourceMeasureId() {
        return freeResourceMeasureId;
    }

    public void setFreeResourceMeasureId(Integer freeResourceMeasureId) {
        this.freeResourceMeasureId = freeResourceMeasureId;
    }

    public ResFeeRecordV2 withRiUsage(BigDecimal riUsage) {
        this.riUsage = riUsage;
        return this;
    }

    /**
     * 预留实例使用量。
     * @return riUsage
     */
    public BigDecimal getRiUsage() {
        return riUsage;
    }

    public void setRiUsage(BigDecimal riUsage) {
        this.riUsage = riUsage;
    }

    public ResFeeRecordV2 withRiUsageMeasureId(Integer riUsageMeasureId) {
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

    public ResFeeRecordV2 withUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * 产品的单价。 按需产品的单价，只有简单定价，不分档的场景会返回。 包周期产品的单价，只有包周期的如下场景会返回：包周期订购/续订/降配/升配/扩容简单定价，不分档 预留实例的单价，只有如下场景下会返回：订购/续订/降配/升配/扩容/按时计费简单定价，不分档  说明： 当statistic_type入参为1，按账期，查询包周期产品时，不返回单价。
     * @return unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public ResFeeRecordV2 withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 产品的单价单位。 线性产品的单价单位为“元/{线性单位}/月”或“元/{线性单位}/小时”等。非线性产品的单价单位为“元/月”或“元/小时”等。  说明： “线性单位”为线性产品（即订购时需要指定大小的产品）的大小的单位，比如硬盘的线性单位为GB，带宽的线性单位为Mbps。当statistic_type入参为1，按账期，查询包周期产品时，不返回单价单位。
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ResFeeRecordV2 withOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    /**
     * 官网价，华为云商品在官网上未叠加应用商务折扣、促销折扣等优惠的销售价格。
     * @return officialAmount
     */
    public BigDecimal getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
    }

    public ResFeeRecordV2 withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 优惠金额，用户使用云服务享受折扣优惠如商务折扣、伙伴授予折扣以及促销优惠等减免的金额。
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public ResFeeRecordV2 withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 应付金额，用户使用云服务享受折扣优惠后需要支付的费用金额，包括现金券和储值卡和代金券金额，精确到小数点后2位。  说明： amount的值等于cash_amount，credit_amount，coupon_amount，flexipurchase_coupon_amount，stored_card_amount，bonus_amount，debt_amount，adjustment_amount的总和。
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public ResFeeRecordV2 withCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }

    /**
     * 现金支付金额。
     * @return cashAmount
     */
    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public ResFeeRecordV2 withCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    /**
     * 信用额度支付金额。
     * @return creditAmount
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public ResFeeRecordV2 withCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    /**
     * 代金券支付金额。
     * @return couponAmount
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public ResFeeRecordV2 withFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
        return this;
    }

    /**
     * 现金券支付金额。
     * @return flexipurchaseCouponAmount
     */
    public BigDecimal getFlexipurchaseCouponAmount() {
        return flexipurchaseCouponAmount;
    }

    public void setFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
    }

    public ResFeeRecordV2 withStoredCardAmount(BigDecimal storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
        return this;
    }

    /**
     * 储值卡支付金额。
     * @return storedCardAmount
     */
    public BigDecimal getStoredCardAmount() {
        return storedCardAmount;
    }

    public void setStoredCardAmount(BigDecimal storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
    }

    public ResFeeRecordV2 withBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
        return this;
    }

    /**
     * 奖励金支付金额（用于现网客户未使用完的奖励金）。
     * @return bonusAmount
     */
    public BigDecimal getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public ResFeeRecordV2 withDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    /**
     * 欠费金额。
     * @return debtAmount
     */
    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public ResFeeRecordV2 withAdjustmentAmount(BigDecimal adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
        return this;
    }

    /**
     * 欠费核销金额。
     * @return adjustmentAmount
     */
    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(BigDecimal adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    public ResFeeRecordV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 金额单位。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ResFeeRecordV2 withFormula(String formula) {
        this.formula = formula;
        return this;
    }

    /**
     * 实付金额计算公式。当前只包含如下场景： 按需非线性定价{使用量}【使用量】/{单位转化率}【单位转换】*{单价}【单价】-{优惠金额}【优惠金额】-{抹零金额}【抹零金额】-{代金券抵扣}【代金券抵扣】 按需线性定价{使用量}【使用量】/{单位转化率}【单位转换】*{线性大小}【规格】*{单价}【单价】-{优惠金额}【优惠金额】-{抹零金额}【抹零金额】-{代金券抵扣}【代金券抵扣】 包年包月新购和续订非线性定价{周期数}【周期数】/{周期转化率}【周期转换】*{单价}【单价】-{优惠金额}【优惠金额】-{代金券抵扣}【代金券抵扣】 包年包月新购和续订线性定价{周期数}【周期数】/{周期转化率}【周期转换】*{线性大小}【规格】*{单价}【单价】-{优惠金额}【优惠金额】-{代金券抵扣}【代金券抵扣】 包年包月（一次性）新购和续订非线性定价{单价}【单价】-{优惠金额}【优惠金额】-{代金券抵扣}【代金券抵扣】 包年包月（一次性）新购和续订线性定价{线性大小}【规格】*{单价}【单价】-{优惠金额}【优惠金额】-{代金券抵扣}【代金券抵扣】  说明： 实付金额计算公式得到的金额值等于amount - coupon_amount的差值。按账期类型查询时不返回计算公式。
     * @return formula
     */
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public ResFeeRecordV2 withSubServiceTypeCode(String subServiceTypeCode) {
        this.subServiceTypeCode = subServiceTypeCode;
        return this;
    }

    /**
     * 整机的子云服务的自身的云服务类型编码。
     * @return subServiceTypeCode
     */
    public String getSubServiceTypeCode() {
        return subServiceTypeCode;
    }

    public void setSubServiceTypeCode(String subServiceTypeCode) {
        this.subServiceTypeCode = subServiceTypeCode;
    }

    public ResFeeRecordV2 withSubServiceTypeName(String subServiceTypeName) {
        this.subServiceTypeName = subServiceTypeName;
        return this;
    }

    /**
     * 整机的子云服务的自身的云服务类型名称。
     * @return subServiceTypeName
     */
    public String getSubServiceTypeName() {
        return subServiceTypeName;
    }

    public void setSubServiceTypeName(String subServiceTypeName) {
        this.subServiceTypeName = subServiceTypeName;
    }

    public ResFeeRecordV2 withSubResourceTypeCode(String subResourceTypeCode) {
        this.subResourceTypeCode = subResourceTypeCode;
        return this;
    }

    /**
     * 整机的子云服务的自身的资源类型编码。
     * @return subResourceTypeCode
     */
    public String getSubResourceTypeCode() {
        return subResourceTypeCode;
    }

    public void setSubResourceTypeCode(String subResourceTypeCode) {
        this.subResourceTypeCode = subResourceTypeCode;
    }

    public ResFeeRecordV2 withSubResourceTypeName(String subResourceTypeName) {
        this.subResourceTypeName = subResourceTypeName;
        return this;
    }

    /**
     * 整机的子云服务的自身的资源类型名称。
     * @return subResourceTypeName
     */
    public String getSubResourceTypeName() {
        return subResourceTypeName;
    }

    public void setSubResourceTypeName(String subResourceTypeName) {
        this.subResourceTypeName = subResourceTypeName;
    }

    public ResFeeRecordV2 withSubResourceId(String subResourceId) {
        this.subResourceId = subResourceId;
        return this;
    }

    /**
     * 整机的子云服务的自身的资源ID，资源标识。（如果为预留实例，则为预留实例标识）
     * @return subResourceId
     */
    public String getSubResourceId() {
        return subResourceId;
    }

    public void setSubResourceId(String subResourceId) {
        this.subResourceId = subResourceId;
    }

    public ResFeeRecordV2 withSubResourceName(String subResourceName) {
        this.subResourceName = subResourceName;
        return this;
    }

    /**
     * 整机的子云服务的自身的资源名称，资源标识。（如果为预留实例，则为预留实例标识）
     * @return subResourceName
     */
    public String getSubResourceName() {
        return subResourceName;
    }

    public void setSubResourceName(String subResourceName) {
        this.subResourceName = subResourceName;
    }

    public ResFeeRecordV2 withConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
        return this;
    }

    /**
     * |参数名称：消费时间| |参数约束及描述：消费时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ。包周期、预留实例预付为交易时间，按需、预留实例按时计费为话单生失效时间。 说明：当statistic_type=3时有效。|
     * @return consumeTime
     */
    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    public ResFeeRecordV2 withRelativeOrderId(String relativeOrderId) {
        this.relativeOrderId = relativeOrderId;
        return this;
    }

    /**
     * |参数名称：客户订单关联的订单ID| |参数约束及描述：客户订单关联的订单ID，包年/包月资源的使用记录该字段才有值，按需资源则为空。当order_id为组合交易订单时，该字段才有值，当查询为普通订单时，此字段返回为空。|
     * @return relativeOrderId
     */
    public String getRelativeOrderId() {
        return relativeOrderId;
    }

    public void setRelativeOrderId(String relativeOrderId) {
        this.relativeOrderId = relativeOrderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResFeeRecordV2 that = (ResFeeRecordV2) obj;
        return Objects.equals(this.billDate, that.billDate) && Objects.equals(this.billType, that.billType)
            && Objects.equals(this.customerId, that.customerId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceType, that.resourceType)
            && Objects.equals(this.cloudServiceTypeName, that.cloudServiceTypeName)
            && Objects.equals(this.resourceTypeName, that.resourceTypeName)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceTag, that.resourceTag) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.productSpecDesc, that.productSpecDesc) && Objects.equals(this.skuCode, that.skuCode)
            && Objects.equals(this.specSize, that.specSize)
            && Objects.equals(this.specSizeMeasureId, that.specSizeMeasureId)
            && Objects.equals(this.tradeId, that.tradeId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.tradeTime, that.tradeTime)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.chargeMode, that.chargeMode) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.usageType, that.usageType)
            && Objects.equals(this.usage, that.usage) && Objects.equals(this.usageMeasureId, that.usageMeasureId)
            && Objects.equals(this.freeResourceUsage, that.freeResourceUsage)
            && Objects.equals(this.freeResourceMeasureId, that.freeResourceMeasureId)
            && Objects.equals(this.riUsage, that.riUsage)
            && Objects.equals(this.riUsageMeasureId, that.riUsageMeasureId)
            && Objects.equals(this.unitPrice, that.unitPrice) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.officialAmount, that.officialAmount)
            && Objects.equals(this.discountAmount, that.discountAmount) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.cashAmount, that.cashAmount) && Objects.equals(this.creditAmount, that.creditAmount)
            && Objects.equals(this.couponAmount, that.couponAmount)
            && Objects.equals(this.flexipurchaseCouponAmount, that.flexipurchaseCouponAmount)
            && Objects.equals(this.storedCardAmount, that.storedCardAmount)
            && Objects.equals(this.bonusAmount, that.bonusAmount) && Objects.equals(this.debtAmount, that.debtAmount)
            && Objects.equals(this.adjustmentAmount, that.adjustmentAmount)
            && Objects.equals(this.measureId, that.measureId) && Objects.equals(this.formula, that.formula)
            && Objects.equals(this.subServiceTypeCode, that.subServiceTypeCode)
            && Objects.equals(this.subServiceTypeName, that.subServiceTypeName)
            && Objects.equals(this.subResourceTypeCode, that.subResourceTypeCode)
            && Objects.equals(this.subResourceTypeName, that.subResourceTypeName)
            && Objects.equals(this.subResourceId, that.subResourceId)
            && Objects.equals(this.subResourceName, that.subResourceName)
            && Objects.equals(this.consumeTime, that.consumeTime)
            && Objects.equals(this.relativeOrderId, that.relativeOrderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billDate,
            billType,
            customerId,
            region,
            regionName,
            cloudServiceType,
            resourceType,
            cloudServiceTypeName,
            resourceTypeName,
            effectiveTime,
            expireTime,
            resourceId,
            resourceName,
            resourceTag,
            productId,
            productName,
            productSpecDesc,
            skuCode,
            specSize,
            specSizeMeasureId,
            tradeId,
            id,
            tradeTime,
            enterpriseProjectId,
            enterpriseProjectName,
            chargeMode,
            orderId,
            periodType,
            usageType,
            usage,
            usageMeasureId,
            freeResourceUsage,
            freeResourceMeasureId,
            riUsage,
            riUsageMeasureId,
            unitPrice,
            unit,
            officialAmount,
            discountAmount,
            amount,
            cashAmount,
            creditAmount,
            couponAmount,
            flexipurchaseCouponAmount,
            storedCardAmount,
            bonusAmount,
            debtAmount,
            adjustmentAmount,
            measureId,
            formula,
            subServiceTypeCode,
            subServiceTypeName,
            subResourceTypeCode,
            subResourceTypeName,
            subResourceId,
            subResourceName,
            consumeTime,
            relativeOrderId);
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
        sb.append("    cloudServiceTypeName: ").append(toIndentedString(cloudServiceTypeName)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
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
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
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
        sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
        sb.append("    subServiceTypeCode: ").append(toIndentedString(subServiceTypeCode)).append("\n");
        sb.append("    subServiceTypeName: ").append(toIndentedString(subServiceTypeName)).append("\n");
        sb.append("    subResourceTypeCode: ").append(toIndentedString(subResourceTypeCode)).append("\n");
        sb.append("    subResourceTypeName: ").append(toIndentedString(subResourceTypeName)).append("\n");
        sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
        sb.append("    subResourceName: ").append(toIndentedString(subResourceName)).append("\n");
        sb.append("    consumeTime: ").append(toIndentedString(consumeTime)).append("\n");
        sb.append("    relativeOrderId: ").append(toIndentedString(relativeOrderId)).append("\n");
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
