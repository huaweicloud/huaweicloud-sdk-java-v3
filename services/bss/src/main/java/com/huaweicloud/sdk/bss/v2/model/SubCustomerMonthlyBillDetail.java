package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * SubCustomerMonthlyBillDetail
 */
public class SubCustomerMonthlyBillDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_cycle")

    private String billCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_type")

    private String associationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_name")

    private String serviceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_time")

    private String tradeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_detail_type")

    private Integer billDetailType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_spec_desc")

    private String productSpecDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_tag")

    private String resourceTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_time")

    private String consumeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_type")

    private String usageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_amount")

    private BigDecimal usageAmount;

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
    @JsonProperty(value = "official_amount")

    private BigDecimal officialAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_discount_amount")

    private BigDecimal officialDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_amount")

    private BigDecimal paymentAmount;

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
    @JsonProperty(value = "stored_value_card_amount")

    private BigDecimal storedValueCardAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debt_amount")

    private BigDecimal debtAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "writeoff_amount")

    private BigDecimal writeoffAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_manager_id")

    private String accountManagerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_id")

    private String partnerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

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

    public SubCustomerMonthlyBillDetail withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    /**
     * 账期。 格式：YYYY-MM
     * @return billCycle
     */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public SubCustomerMonthlyBillDetail withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public SubCustomerMonthlyBillDetail withAssociationType(String associationType) {
        this.associationType = associationType;
        return this;
    }

    /**
     * 子客户的关联类型： 1：顾问销售2：代售
     * @return associationType
     */
    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public SubCustomerMonthlyBillDetail withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /**
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。您可以调用查询云服务类型列表接口获取。
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public SubCustomerMonthlyBillDetail withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    /**
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。 ResourceType是CloudServiceType中的一种资源，CloudServiceType由多种ResourceType组合提供。
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public SubCustomerMonthlyBillDetail withServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * 云服务类型名称。例如ECS的云服务类型名称为“弹性云服务器”。
     * @return serviceTypeName
     */
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public SubCustomerMonthlyBillDetail withResourceTypeName(String resourceTypeName) {
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

    public SubCustomerMonthlyBillDetail withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。 1：包周期3：按需10：预留实例11：节省计划
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public SubCustomerMonthlyBillDetail withTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    /**
     * 交易时间，即某条消费记录对应的扣费时间。 示例：2020-11-17T06:43:38Z
     * @return tradeTime
     */
    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public SubCustomerMonthlyBillDetail withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /**
     * 订单ID或交易ID，扣费维度的唯一标识。 账单类型为1，2，3，4，8时为订单ID。其它场景下为交易ID。非月末扣费：应收ID月末扣费：账单ID
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public SubCustomerMonthlyBillDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SubCustomerMonthlyBillDetail withBillDetailType(Integer billDetailType) {
        this.billDetailType = billDetailType;
        return this;
    }

    /**
     * 账单类型。 1：消费-新购2：消费-续订3：消费-变更8：消费-自动续订5：消费-使用12：消费-按时计费4：退款-退订9：调账-补偿13：消费-退订手续费增收14：消费-服务支持计划月末补扣16：调账-扣费18：消费-按月付费20：退款-变更23：消费-节省计划抵扣24：退款-包年/包月转按需100：退款-退订税金101：调账-补偿税金102：调账-扣费税金
     * @return billDetailType
     */
    public Integer getBillDetailType() {
        return billDetailType;
    }

    public void setBillDetailType(Integer billDetailType) {
        this.billDetailType = billDetailType;
    }

    public SubCustomerMonthlyBillDetail withResourceId(String resourceId) {
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

    public SubCustomerMonthlyBillDetail withResourceName(String resourceName) {
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

    public SubCustomerMonthlyBillDetail withProductSpecDesc(String productSpecDesc) {
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

    public SubCustomerMonthlyBillDetail withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点对应云服务的“区域”列的值。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public SubCustomerMonthlyBillDetail withProductId(String productId) {
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

    public SubCustomerMonthlyBillDetail withProductName(String productName) {
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

    public SubCustomerMonthlyBillDetail withResourceTag(String resourceTag) {
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

    public SubCustomerMonthlyBillDetail withConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
        return this;
    }

    /**
     * 消费时间。 包周期和预留实例订购场景下为订单支付时间；按需场景下为话单生失效时间。 格式：YYYY-MM-DDThh:mm:ssZ
     * @return consumeTime
     */
    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    public SubCustomerMonthlyBillDetail withUsageType(String usageType) {
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

    public SubCustomerMonthlyBillDetail withUsageAmount(BigDecimal usageAmount) {
        this.usageAmount = usageAmount;
        return this;
    }

    /**
     * 资源的使用量。
     * @return usageAmount
     */
    public BigDecimal getUsageAmount() {
        return usageAmount;
    }

    public void setUsageAmount(BigDecimal usageAmount) {
        this.usageAmount = usageAmount;
    }

    public SubCustomerMonthlyBillDetail withUsageMeasureId(Integer usageMeasureId) {
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

    public SubCustomerMonthlyBillDetail withFreeResourceUsage(BigDecimal freeResourceUsage) {
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

    public SubCustomerMonthlyBillDetail withFreeResourceMeasureId(Integer freeResourceMeasureId) {
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

    public SubCustomerMonthlyBillDetail withRiUsage(BigDecimal riUsage) {
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

    public SubCustomerMonthlyBillDetail withRiUsageMeasureId(Integer riUsageMeasureId) {
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

    public SubCustomerMonthlyBillDetail withOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    /**
     * 官网价。
     * @return officialAmount
     */
    public BigDecimal getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
    }

    public SubCustomerMonthlyBillDetail withOfficialDiscountAmount(BigDecimal officialDiscountAmount) {
        this.officialDiscountAmount = officialDiscountAmount;
        return this;
    }

    /**
     * 对应官网价折扣金额。
     * @return officialDiscountAmount
     */
    public BigDecimal getOfficialDiscountAmount() {
        return officialDiscountAmount;
    }

    public void setOfficialDiscountAmount(BigDecimal officialDiscountAmount) {
        this.officialDiscountAmount = officialDiscountAmount;
    }

    public SubCustomerMonthlyBillDetail withPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    /**
     * 应付金额。
     * @return paymentAmount
     */
    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public SubCustomerMonthlyBillDetail withCashAmount(BigDecimal cashAmount) {
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

    public SubCustomerMonthlyBillDetail withCreditAmount(BigDecimal creditAmount) {
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

    public SubCustomerMonthlyBillDetail withCouponAmount(BigDecimal couponAmount) {
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

    public SubCustomerMonthlyBillDetail withFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
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

    public SubCustomerMonthlyBillDetail withStoredValueCardAmount(BigDecimal storedValueCardAmount) {
        this.storedValueCardAmount = storedValueCardAmount;
        return this;
    }

    /**
     * 储值卡支付金额。
     * @return storedValueCardAmount
     */
    public BigDecimal getStoredValueCardAmount() {
        return storedValueCardAmount;
    }

    public void setStoredValueCardAmount(BigDecimal storedValueCardAmount) {
        this.storedValueCardAmount = storedValueCardAmount;
    }

    public SubCustomerMonthlyBillDetail withDebtAmount(BigDecimal debtAmount) {
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

    public SubCustomerMonthlyBillDetail withWriteoffAmount(BigDecimal writeoffAmount) {
        this.writeoffAmount = writeoffAmount;
        return this;
    }

    /**
     * 欠费核销金额。
     * @return writeoffAmount
     */
    public BigDecimal getWriteoffAmount() {
        return writeoffAmount;
    }

    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        this.writeoffAmount = writeoffAmount;
    }

    public SubCustomerMonthlyBillDetail withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 周期类型： 19：年20：月24：天25：小时5：一次性
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public SubCustomerMonthlyBillDetail withAccountManagerId(String accountManagerId) {
        this.accountManagerId = accountManagerId;
        return this;
    }

    /**
     * 客户经理标识。
     * @return accountManagerId
     */
    public String getAccountManagerId() {
        return accountManagerId;
    }

    public void setAccountManagerId(String accountManagerId) {
        this.accountManagerId = accountManagerId;
    }

    public SubCustomerMonthlyBillDetail withPartnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }

    /**
     * 关联的经销商ID。
     * @return partnerId
     */
    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public SubCustomerMonthlyBillDetail withRegionName(String regionName) {
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

    public SubCustomerMonthlyBillDetail withSubServiceTypeCode(String subServiceTypeCode) {
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

    public SubCustomerMonthlyBillDetail withSubServiceTypeName(String subServiceTypeName) {
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

    public SubCustomerMonthlyBillDetail withSubResourceTypeCode(String subResourceTypeCode) {
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

    public SubCustomerMonthlyBillDetail withSubResourceTypeName(String subResourceTypeName) {
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

    public SubCustomerMonthlyBillDetail withSubResourceId(String subResourceId) {
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

    public SubCustomerMonthlyBillDetail withSubResourceName(String subResourceName) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubCustomerMonthlyBillDetail that = (SubCustomerMonthlyBillDetail) obj;
        return Objects.equals(this.billCycle, that.billCycle) && Objects.equals(this.customerId, that.customerId)
            && Objects.equals(this.associationType, that.associationType)
            && Objects.equals(this.serviceTypeCode, that.serviceTypeCode)
            && Objects.equals(this.resourceTypeCode, that.resourceTypeCode)
            && Objects.equals(this.serviceTypeName, that.serviceTypeName)
            && Objects.equals(this.resourceTypeName, that.resourceTypeName)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.tradeTime, that.tradeTime)
            && Objects.equals(this.tradeId, that.tradeId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.billDetailType, that.billDetailType)
            && Objects.equals(this.resourceId, that.resourceId) && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.productSpecDesc, that.productSpecDesc)
            && Objects.equals(this.regionCode, that.regionCode) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.productName, that.productName) && Objects.equals(this.resourceTag, that.resourceTag)
            && Objects.equals(this.consumeTime, that.consumeTime) && Objects.equals(this.usageType, that.usageType)
            && Objects.equals(this.usageAmount, that.usageAmount)
            && Objects.equals(this.usageMeasureId, that.usageMeasureId)
            && Objects.equals(this.freeResourceUsage, that.freeResourceUsage)
            && Objects.equals(this.freeResourceMeasureId, that.freeResourceMeasureId)
            && Objects.equals(this.riUsage, that.riUsage)
            && Objects.equals(this.riUsageMeasureId, that.riUsageMeasureId)
            && Objects.equals(this.officialAmount, that.officialAmount)
            && Objects.equals(this.officialDiscountAmount, that.officialDiscountAmount)
            && Objects.equals(this.paymentAmount, that.paymentAmount)
            && Objects.equals(this.cashAmount, that.cashAmount) && Objects.equals(this.creditAmount, that.creditAmount)
            && Objects.equals(this.couponAmount, that.couponAmount)
            && Objects.equals(this.flexipurchaseCouponAmount, that.flexipurchaseCouponAmount)
            && Objects.equals(this.storedValueCardAmount, that.storedValueCardAmount)
            && Objects.equals(this.debtAmount, that.debtAmount)
            && Objects.equals(this.writeoffAmount, that.writeoffAmount)
            && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.accountManagerId, that.accountManagerId)
            && Objects.equals(this.partnerId, that.partnerId) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.subServiceTypeCode, that.subServiceTypeCode)
            && Objects.equals(this.subServiceTypeName, that.subServiceTypeName)
            && Objects.equals(this.subResourceTypeCode, that.subResourceTypeCode)
            && Objects.equals(this.subResourceTypeName, that.subResourceTypeName)
            && Objects.equals(this.subResourceId, that.subResourceId)
            && Objects.equals(this.subResourceName, that.subResourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billCycle,
            customerId,
            associationType,
            serviceTypeCode,
            resourceTypeCode,
            serviceTypeName,
            resourceTypeName,
            chargingMode,
            tradeTime,
            tradeId,
            id,
            billDetailType,
            resourceId,
            resourceName,
            productSpecDesc,
            regionCode,
            productId,
            productName,
            resourceTag,
            consumeTime,
            usageType,
            usageAmount,
            usageMeasureId,
            freeResourceUsage,
            freeResourceMeasureId,
            riUsage,
            riUsageMeasureId,
            officialAmount,
            officialDiscountAmount,
            paymentAmount,
            cashAmount,
            creditAmount,
            couponAmount,
            flexipurchaseCouponAmount,
            storedValueCardAmount,
            debtAmount,
            writeoffAmount,
            periodType,
            accountManagerId,
            partnerId,
            regionName,
            subServiceTypeCode,
            subServiceTypeName,
            subResourceTypeCode,
            subResourceTypeName,
            subResourceId,
            subResourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubCustomerMonthlyBillDetail {\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    billDetailType: ").append(toIndentedString(billDetailType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    resourceTag: ").append(toIndentedString(resourceTag)).append("\n");
        sb.append("    consumeTime: ").append(toIndentedString(consumeTime)).append("\n");
        sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
        sb.append("    usageAmount: ").append(toIndentedString(usageAmount)).append("\n");
        sb.append("    usageMeasureId: ").append(toIndentedString(usageMeasureId)).append("\n");
        sb.append("    freeResourceUsage: ").append(toIndentedString(freeResourceUsage)).append("\n");
        sb.append("    freeResourceMeasureId: ").append(toIndentedString(freeResourceMeasureId)).append("\n");
        sb.append("    riUsage: ").append(toIndentedString(riUsage)).append("\n");
        sb.append("    riUsageMeasureId: ").append(toIndentedString(riUsageMeasureId)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    officialDiscountAmount: ").append(toIndentedString(officialDiscountAmount)).append("\n");
        sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
        sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    storedValueCardAmount: ").append(toIndentedString(storedValueCardAmount)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    writeoffAmount: ").append(toIndentedString(writeoffAmount)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    accountManagerId: ").append(toIndentedString(accountManagerId)).append("\n");
        sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    subServiceTypeCode: ").append(toIndentedString(subServiceTypeCode)).append("\n");
        sb.append("    subServiceTypeName: ").append(toIndentedString(subServiceTypeName)).append("\n");
        sb.append("    subResourceTypeCode: ").append(toIndentedString(subResourceTypeCode)).append("\n");
        sb.append("    subResourceTypeName: ").append(toIndentedString(subResourceTypeName)).append("\n");
        sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
        sb.append("    subResourceName: ").append(toIndentedString(subResourceName)).append("\n");
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
