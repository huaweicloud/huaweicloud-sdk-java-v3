package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ResFeeRecordV2
 */
public class ResFeeRecordV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_date")

    @JacksonXmlProperty(localName = "bill_date")

    private String billDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_type")

    @JacksonXmlProperty(localName = "bill_type")

    private Integer billType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    @JacksonXmlProperty(localName = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    @JacksonXmlProperty(localName = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    @JacksonXmlProperty(localName = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type")

    @JacksonXmlProperty(localName = "cloud_service_type")

    private String cloudServiceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    @JacksonXmlProperty(localName = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_name")

    @JacksonXmlProperty(localName = "cloud_service_type_name")

    private String cloudServiceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    @JacksonXmlProperty(localName = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    @JacksonXmlProperty(localName = "effective_time")

    private String effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    @JacksonXmlProperty(localName = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    @JacksonXmlProperty(localName = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    @JacksonXmlProperty(localName = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_tag")

    @JacksonXmlProperty(localName = "resource_tag")

    private String resourceTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    @JacksonXmlProperty(localName = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    @JacksonXmlProperty(localName = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_spec_desc")

    @JacksonXmlProperty(localName = "product_spec_desc")

    private String productSpecDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku_code")

    @JacksonXmlProperty(localName = "sku_code")

    private String skuCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_size")

    @JacksonXmlProperty(localName = "spec_size")

    private Double specSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_size_measure_id")

    @JacksonXmlProperty(localName = "spec_size_measure_id")

    private Integer specSizeMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_id")

    @JacksonXmlProperty(localName = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_time")

    @JacksonXmlProperty(localName = "trade_time")

    private String tradeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    @JacksonXmlProperty(localName = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    @JacksonXmlProperty(localName = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    @JacksonXmlProperty(localName = "charge_mode")

    private String chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    @JacksonXmlProperty(localName = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    @JacksonXmlProperty(localName = "period_type")

    private String periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_type")

    @JacksonXmlProperty(localName = "usage_type")

    private String usageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    @JacksonXmlProperty(localName = "usage")

    private Double usage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_measure_id")

    @JacksonXmlProperty(localName = "usage_measure_id")

    private Integer usageMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_usage")

    @JacksonXmlProperty(localName = "free_resource_usage")

    private Double freeResourceUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "free_resource_measure_id")

    @JacksonXmlProperty(localName = "free_resource_measure_id")

    private Integer freeResourceMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ri_usage")

    @JacksonXmlProperty(localName = "ri_usage")

    private Double riUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ri_usage_measure_id")

    @JacksonXmlProperty(localName = "ri_usage_measure_id")

    private Integer riUsageMeasureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit_price")

    @JacksonXmlProperty(localName = "unit_price")

    private Double unitPrice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    @JacksonXmlProperty(localName = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_amount")

    @JacksonXmlProperty(localName = "official_amount")

    private Double officialAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    @JacksonXmlProperty(localName = "discount_amount")

    private Double discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    @JacksonXmlProperty(localName = "amount")

    private Double amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cash_amount")

    @JacksonXmlProperty(localName = "cash_amount")

    private Double cashAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credit_amount")

    @JacksonXmlProperty(localName = "credit_amount")

    private Double creditAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_amount")

    @JacksonXmlProperty(localName = "coupon_amount")

    private Double couponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flexipurchase_coupon_amount")

    @JacksonXmlProperty(localName = "flexipurchase_coupon_amount")

    private Double flexipurchaseCouponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stored_card_amount")

    @JacksonXmlProperty(localName = "stored_card_amount")

    private Double storedCardAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bonus_amount")

    @JacksonXmlProperty(localName = "bonus_amount")

    private Double bonusAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debt_amount")

    @JacksonXmlProperty(localName = "debt_amount")

    private Double debtAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjustment_amount")

    @JacksonXmlProperty(localName = "adjustment_amount")

    private Double adjustmentAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    @JacksonXmlProperty(localName = "measure_id")

    private Integer measureId;

    public ResFeeRecordV2 withBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }

    /**
     * 资源消费记录的日期。 格式：YYYY-MM-DD。按照东八区截取。
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
     * 账单类型。 1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿14：消费-服务支持计划月末扣费15：消费-税金16：调账-扣费17：消费-保底差额 说明： 保底差额=客户签约保底合同后，如果没有达到保底消费，客户需要补交的费用，仅限于直销或者伙伴顾问销售类子客户，且为后付费用户。 20：退款-变更100：退款-退订税金101：调账-补偿税金102：调账-扣费税金|
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
     * 云服务区编码，例如：“ap-southeast-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
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
     * 云服务区名称，例如：“中国-香港”。具体请参见地区和终端节点对应云服务的“区域名称”列的值。
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
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。
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

    public ResFeeRecordV2 withSpecSize(Double specSize) {
        this.specSize = specSize;
        return this;
    }

    /**
     * 产品的实例大小，仅线性产品有效。  说明： 线性产品是指订购时需要指定大小的产品。例如硬盘在订购时需选择10G、20G等不同大小规格。
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
     * 企业项目标识（企业项目ID）。 default项目对应ID：0未归集（表示该云服务不支持企业项目管理能力）项目对应ID：-1
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
     * 计费模式。 1：包年/包月3：按需10：预留实例
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

    public ResFeeRecordV2 withUsage(Double usage) {
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

    public ResFeeRecordV2 withUsageMeasureId(Integer usageMeasureId) {
        this.usageMeasureId = usageMeasureId;
        return this;
    }

    /**
     * 资源使用量的度量单位，您可以调用查询度量单位列表接口获取。
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
     * 套餐内使用量。
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
     * 套餐内使用量的度量单位，您可以调用查询度量单位列表接口获取。
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
     * 预留实例使用量。
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
     * 预留实例使用量单位。
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
     * 产品的单价。 按需产品的单价，只有简单定价，不分档的场景会返回。 包周期产品的单价，只有包周期的如下场景会返回：包周期订购/续订/降配/升配/扩容简单定价，不分档 预留实例的单价，只有如下场景下会返回：订购/续订/降配/升配/扩容/按时计费简单定价，不分档
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
     * 产品的单价单位。 线性产品的单价单位为“元/{线性单位}/月”或“元/{线性单位}/小时”等。非线性产品的单价单位为“元/月”或“元/小时”等。  说明： “线性单位”为线性产品（即订购时需要指定大小的产品）的大小的单位，比如硬盘的线性单位为GB，带宽的线性单位为Mbps。
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
     * 官网价，华为云商品在官网上未叠加应用商务折扣、促销折扣等优惠的销售价格。
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
     * 优惠金额，用户使用云服务享受折扣优惠如商务折扣、伙伴授予折扣以及促销优惠等减免的金额。
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
     * 应付金额，用户使用云服务享受折扣优惠后需要支付的费用金额，包括代金券金额，精确到小数点后8位。  说明： amount的值等于cash_amount，credit_amount，coupon_amount，flexipurchase_coupon_amount，stored_card_amount，bonus_amount，debt_amount，adjustment_amount的总和。
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
     * 现金支付金额。
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
     * 信用额度支付金额。
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
     * 代金券支付金额。
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
     * 现金券支付金额。
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
     * 储值卡支付金额。
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
     * 奖励金支付金额（用于现网客户未使用完的奖励金）。
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
     * 欠费金额。
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
     * 欠费核销金额。
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
     * 金额单位。 1：元
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
        return Objects.equals(this.billDate, resFeeRecordV2.billDate)
            && Objects.equals(this.billType, resFeeRecordV2.billType)
            && Objects.equals(this.customerId, resFeeRecordV2.customerId)
            && Objects.equals(this.region, resFeeRecordV2.region)
            && Objects.equals(this.regionName, resFeeRecordV2.regionName)
            && Objects.equals(this.cloudServiceType, resFeeRecordV2.cloudServiceType)
            && Objects.equals(this.resourceType, resFeeRecordV2.resourceType)
            && Objects.equals(this.cloudServiceTypeName, resFeeRecordV2.cloudServiceTypeName)
            && Objects.equals(this.resourceTypeName, resFeeRecordV2.resourceTypeName)
            && Objects.equals(this.effectiveTime, resFeeRecordV2.effectiveTime)
            && Objects.equals(this.expireTime, resFeeRecordV2.expireTime)
            && Objects.equals(this.resourceId, resFeeRecordV2.resourceId)
            && Objects.equals(this.resourceName, resFeeRecordV2.resourceName)
            && Objects.equals(this.resourceTag, resFeeRecordV2.resourceTag)
            && Objects.equals(this.productId, resFeeRecordV2.productId)
            && Objects.equals(this.productName, resFeeRecordV2.productName)
            && Objects.equals(this.productSpecDesc, resFeeRecordV2.productSpecDesc)
            && Objects.equals(this.skuCode, resFeeRecordV2.skuCode)
            && Objects.equals(this.specSize, resFeeRecordV2.specSize)
            && Objects.equals(this.specSizeMeasureId, resFeeRecordV2.specSizeMeasureId)
            && Objects.equals(this.tradeId, resFeeRecordV2.tradeId)
            && Objects.equals(this.tradeTime, resFeeRecordV2.tradeTime)
            && Objects.equals(this.enterpriseProjectId, resFeeRecordV2.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, resFeeRecordV2.enterpriseProjectName)
            && Objects.equals(this.chargeMode, resFeeRecordV2.chargeMode)
            && Objects.equals(this.orderId, resFeeRecordV2.orderId)
            && Objects.equals(this.periodType, resFeeRecordV2.periodType)
            && Objects.equals(this.usageType, resFeeRecordV2.usageType)
            && Objects.equals(this.usage, resFeeRecordV2.usage)
            && Objects.equals(this.usageMeasureId, resFeeRecordV2.usageMeasureId)
            && Objects.equals(this.freeResourceUsage, resFeeRecordV2.freeResourceUsage)
            && Objects.equals(this.freeResourceMeasureId, resFeeRecordV2.freeResourceMeasureId)
            && Objects.equals(this.riUsage, resFeeRecordV2.riUsage)
            && Objects.equals(this.riUsageMeasureId, resFeeRecordV2.riUsageMeasureId)
            && Objects.equals(this.unitPrice, resFeeRecordV2.unitPrice)
            && Objects.equals(this.unit, resFeeRecordV2.unit)
            && Objects.equals(this.officialAmount, resFeeRecordV2.officialAmount)
            && Objects.equals(this.discountAmount, resFeeRecordV2.discountAmount)
            && Objects.equals(this.amount, resFeeRecordV2.amount)
            && Objects.equals(this.cashAmount, resFeeRecordV2.cashAmount)
            && Objects.equals(this.creditAmount, resFeeRecordV2.creditAmount)
            && Objects.equals(this.couponAmount, resFeeRecordV2.couponAmount)
            && Objects.equals(this.flexipurchaseCouponAmount, resFeeRecordV2.flexipurchaseCouponAmount)
            && Objects.equals(this.storedCardAmount, resFeeRecordV2.storedCardAmount)
            && Objects.equals(this.bonusAmount, resFeeRecordV2.bonusAmount)
            && Objects.equals(this.debtAmount, resFeeRecordV2.debtAmount)
            && Objects.equals(this.adjustmentAmount, resFeeRecordV2.adjustmentAmount)
            && Objects.equals(this.measureId, resFeeRecordV2.measureId);
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
            measureId);
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
