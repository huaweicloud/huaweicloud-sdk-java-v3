package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NvlCostAnalysedBillDetail
 */
public class NvlCostAnalysedBillDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_month")

    private String sharedMonth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_cycle")

    private String billCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_type")

    private Integer billType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

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
    @JsonProperty(value = "product_spec_desc")

    private String productSpecDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private Integer chargingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

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
    @JsonProperty(value = "consume_amount")

    private BigDecimal consumeAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "past_months_amortized_amount")

    private BigDecimal pastMonthsAmortizedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_month_amortized_amount")

    private BigDecimal currentMonthAmortizedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "future_months_amortized_amount")

    private BigDecimal futureMonthsAmortizedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amortized_cash_amount")

    private BigDecimal amortizedCashAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amortized_credit_amount")

    private BigDecimal amortizedCreditAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amortized_coupon_amount")

    private BigDecimal amortizedCouponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amortized_flexipurchase_coupon_amount")

    private BigDecimal amortizedFlexipurchaseCouponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amortized_stored_value_card_amount")

    private BigDecimal amortizedStoredValueCardAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amortized_bonus_amount")

    private BigDecimal amortizedBonusAmount;

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
    @JsonProperty(value = "effective_tag_pairs")

    private List<TagPair> effectiveTagPairs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cost_unit_pairs")

    private List<CostUnitPair> costUnitPairs = null;

    public NvlCostAnalysedBillDetail withSharedMonth(String sharedMonth) {
        this.sharedMonth = sharedMonth;
        return this;
    }

    /**
     * 查询分摊成本的月份。 格式为YYYY-MM，按照东八区时间截取。
     * @return sharedMonth
     */
    public String getSharedMonth() {
        return sharedMonth;
    }

    public void setSharedMonth(String sharedMonth) {
        this.sharedMonth = sharedMonth;
    }

    public NvlCostAnalysedBillDetail withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    /**
     * 账期。 格式：YYYY-MM。按照东八区时间截取。
     * @return billCycle
     */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public NvlCostAnalysedBillDetail withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    /**
     * 账单类型。 1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿14：消费-服务支持计划月末扣费16：调账-扣费18：消费-按月付费20：退款-变更23：消费-节省计划抵扣24：退款-包年/包月转按需
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public NvlCostAnalysedBillDetail withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 消费的客户账号ID。 如果是普通客户或者企业子查询消费记录，只能查询到自身的消费记录，则这个地方显示的是自身的客户ID。如果是企业主查询消费记录，可以查询到自身以及企业子的消费记录，这个地方是消费的实际客户ID，如果是企业主自身消费，为企业主ID，如果这条消费记录是某个企业子客户的消费，这个地方的ID是企业子账号ID。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public NvlCostAnalysedBillDetail withRegionCode(String regionCode) {
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

    public NvlCostAnalysedBillDetail withRegionName(String regionName) {
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

    public NvlCostAnalysedBillDetail withServiceTypeCode(String serviceTypeCode) {
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

    public NvlCostAnalysedBillDetail withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    /**
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。您可以调用查询资源类型列表接口获取。
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public NvlCostAnalysedBillDetail withServiceTypeName(String serviceTypeName) {
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

    public NvlCostAnalysedBillDetail withResourceTypeName(String resourceTypeName) {
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

    public NvlCostAnalysedBillDetail withEffectiveTime(String effectiveTime) {
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

    public NvlCostAnalysedBillDetail withExpireTime(String expireTime) {
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

    public NvlCostAnalysedBillDetail withResourceId(String resourceId) {
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

    public NvlCostAnalysedBillDetail withResourceName(String resourceName) {
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

    public NvlCostAnalysedBillDetail withResourceTag(String resourceTag) {
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

    public NvlCostAnalysedBillDetail withProductSpecDesc(String productSpecDesc) {
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

    public NvlCostAnalysedBillDetail withEnterpriseProjectId(String enterpriseProjectId) {
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

    public NvlCostAnalysedBillDetail withEnterpriseProjectName(String enterpriseProjectName) {
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

    public NvlCostAnalysedBillDetail withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 计费模式。 1：包年/包月3：按需10：预留实例11：节省计划
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public NvlCostAnalysedBillDetail withOrderId(String orderId) {
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

    public NvlCostAnalysedBillDetail withPeriodType(Integer periodType) {
        this.periodType = periodType;
        return this;
    }

    /**
     * 周期类型。 19：年20：月24：天25：小时5：一次性
     * @return periodType
     */
    public Integer getPeriodType() {
        return periodType;
    }

    public void setPeriodType(Integer periodType) {
        this.periodType = periodType;
    }

    public NvlCostAnalysedBillDetail withUsageType(String usageType) {
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

    public NvlCostAnalysedBillDetail withUsage(BigDecimal usage) {
        this.usage = usage;
        return this;
    }

    /**
     * 资源的使用量。
     * @return usage
     */
    public BigDecimal getUsage() {
        return usage;
    }

    public void setUsage(BigDecimal usage) {
        this.usage = usage;
    }

    public NvlCostAnalysedBillDetail withUsageMeasureId(Integer usageMeasureId) {
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

    public NvlCostAnalysedBillDetail withFreeResourceUsage(BigDecimal freeResourceUsage) {
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

    public NvlCostAnalysedBillDetail withFreeResourceMeasureId(Integer freeResourceMeasureId) {
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

    public NvlCostAnalysedBillDetail withRiUsage(BigDecimal riUsage) {
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

    public NvlCostAnalysedBillDetail withRiUsageMeasureId(Integer riUsageMeasureId) {
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

    public NvlCostAnalysedBillDetail withConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }

    /**
     * 消费金额（应付金额）。 消费金额=期初已分摊金额+当月分摊金额+期末未分摊金额
     * @return consumeAmount
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public NvlCostAnalysedBillDetail withPastMonthsAmortizedAmount(BigDecimal pastMonthsAmortizedAmount) {
        this.pastMonthsAmortizedAmount = pastMonthsAmortizedAmount;
        return this;
    }

    /**
     * 期初已分摊金额。  说明： 包周期和预留实例预付时有效；计费类型为按需，预留实例为按时计费时该值为0。
     * @return pastMonthsAmortizedAmount
     */
    public BigDecimal getPastMonthsAmortizedAmount() {
        return pastMonthsAmortizedAmount;
    }

    public void setPastMonthsAmortizedAmount(BigDecimal pastMonthsAmortizedAmount) {
        this.pastMonthsAmortizedAmount = pastMonthsAmortizedAmount;
    }

    public NvlCostAnalysedBillDetail withCurrentMonthAmortizedAmount(BigDecimal currentMonthAmortizedAmount) {
        this.currentMonthAmortizedAmount = currentMonthAmortizedAmount;
        return this;
    }

    /**
     * 当月分摊金额。 当月分摊金额=现金分摊金额+信用额度分摊金额+代金券分摊金额+现金券分摊金额+储值卡分摊金额+奖励金分摊金额
     * @return currentMonthAmortizedAmount
     */
    public BigDecimal getCurrentMonthAmortizedAmount() {
        return currentMonthAmortizedAmount;
    }

    public void setCurrentMonthAmortizedAmount(BigDecimal currentMonthAmortizedAmount) {
        this.currentMonthAmortizedAmount = currentMonthAmortizedAmount;
    }

    public NvlCostAnalysedBillDetail withFutureMonthsAmortizedAmount(BigDecimal futureMonthsAmortizedAmount) {
        this.futureMonthsAmortizedAmount = futureMonthsAmortizedAmount;
        return this;
    }

    /**
     * 期末未分摊金额。月度成本分摊时，当月以后还未分摊的金额。  说明： 包周期和预留实例预付时有效；计费类型为按需，预留实例为按时计费时该值为0。
     * @return futureMonthsAmortizedAmount
     */
    public BigDecimal getFutureMonthsAmortizedAmount() {
        return futureMonthsAmortizedAmount;
    }

    public void setFutureMonthsAmortizedAmount(BigDecimal futureMonthsAmortizedAmount) {
        this.futureMonthsAmortizedAmount = futureMonthsAmortizedAmount;
    }

    public NvlCostAnalysedBillDetail withAmortizedCashAmount(BigDecimal amortizedCashAmount) {
        this.amortizedCashAmount = amortizedCashAmount;
        return this;
    }

    /**
     * 月度成本分摊时，当月已分摊金额中包含的现金金额。
     * @return amortizedCashAmount
     */
    public BigDecimal getAmortizedCashAmount() {
        return amortizedCashAmount;
    }

    public void setAmortizedCashAmount(BigDecimal amortizedCashAmount) {
        this.amortizedCashAmount = amortizedCashAmount;
    }

    public NvlCostAnalysedBillDetail withAmortizedCreditAmount(BigDecimal amortizedCreditAmount) {
        this.amortizedCreditAmount = amortizedCreditAmount;
        return this;
    }

    /**
     * 月度成本分摊时，当月已分摊金额中包含的信用额度分摊金额。
     * @return amortizedCreditAmount
     */
    public BigDecimal getAmortizedCreditAmount() {
        return amortizedCreditAmount;
    }

    public void setAmortizedCreditAmount(BigDecimal amortizedCreditAmount) {
        this.amortizedCreditAmount = amortizedCreditAmount;
    }

    public NvlCostAnalysedBillDetail withAmortizedCouponAmount(BigDecimal amortizedCouponAmount) {
        this.amortizedCouponAmount = amortizedCouponAmount;
        return this;
    }

    /**
     * 月度成本分摊时，当月已分摊金额中包含的代金券分摊金额。
     * @return amortizedCouponAmount
     */
    public BigDecimal getAmortizedCouponAmount() {
        return amortizedCouponAmount;
    }

    public void setAmortizedCouponAmount(BigDecimal amortizedCouponAmount) {
        this.amortizedCouponAmount = amortizedCouponAmount;
    }

    public NvlCostAnalysedBillDetail withAmortizedFlexipurchaseCouponAmount(
        BigDecimal amortizedFlexipurchaseCouponAmount) {
        this.amortizedFlexipurchaseCouponAmount = amortizedFlexipurchaseCouponAmount;
        return this;
    }

    /**
     * 月度成本分摊时，当月已分摊金额中包含的现金券分摊金额。
     * @return amortizedFlexipurchaseCouponAmount
     */
    public BigDecimal getAmortizedFlexipurchaseCouponAmount() {
        return amortizedFlexipurchaseCouponAmount;
    }

    public void setAmortizedFlexipurchaseCouponAmount(BigDecimal amortizedFlexipurchaseCouponAmount) {
        this.amortizedFlexipurchaseCouponAmount = amortizedFlexipurchaseCouponAmount;
    }

    public NvlCostAnalysedBillDetail withAmortizedStoredValueCardAmount(BigDecimal amortizedStoredValueCardAmount) {
        this.amortizedStoredValueCardAmount = amortizedStoredValueCardAmount;
        return this;
    }

    /**
     * 月度成本分摊时，当月已分摊金额中包含的储值卡分摊金额。
     * @return amortizedStoredValueCardAmount
     */
    public BigDecimal getAmortizedStoredValueCardAmount() {
        return amortizedStoredValueCardAmount;
    }

    public void setAmortizedStoredValueCardAmount(BigDecimal amortizedStoredValueCardAmount) {
        this.amortizedStoredValueCardAmount = amortizedStoredValueCardAmount;
    }

    public NvlCostAnalysedBillDetail withAmortizedBonusAmount(BigDecimal amortizedBonusAmount) {
        this.amortizedBonusAmount = amortizedBonusAmount;
        return this;
    }

    /**
     * 月度成本分摊时，当月已分摊金额中包含的奖励金分摊金额（用于现网未清干净的奖励金）。
     * @return amortizedBonusAmount
     */
    public BigDecimal getAmortizedBonusAmount() {
        return amortizedBonusAmount;
    }

    public void setAmortizedBonusAmount(BigDecimal amortizedBonusAmount) {
        this.amortizedBonusAmount = amortizedBonusAmount;
    }

    public NvlCostAnalysedBillDetail withSubServiceTypeCode(String subServiceTypeCode) {
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

    public NvlCostAnalysedBillDetail withSubServiceTypeName(String subServiceTypeName) {
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

    public NvlCostAnalysedBillDetail withSubResourceTypeCode(String subResourceTypeCode) {
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

    public NvlCostAnalysedBillDetail withSubResourceTypeName(String subResourceTypeName) {
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

    public NvlCostAnalysedBillDetail withSubResourceId(String subResourceId) {
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

    public NvlCostAnalysedBillDetail withSubResourceName(String subResourceName) {
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

    public NvlCostAnalysedBillDetail withEffectiveTagPairs(List<TagPair> effectiveTagPairs) {
        this.effectiveTagPairs = effectiveTagPairs;
        return this;
    }

    public NvlCostAnalysedBillDetail addEffectiveTagPairsItem(TagPair effectiveTagPairsItem) {
        if (this.effectiveTagPairs == null) {
            this.effectiveTagPairs = new ArrayList<>();
        }
        this.effectiveTagPairs.add(effectiveTagPairsItem);
        return this;
    }

    public NvlCostAnalysedBillDetail withEffectiveTagPairs(Consumer<List<TagPair>> effectiveTagPairsSetter) {
        if (this.effectiveTagPairs == null) {
            this.effectiveTagPairs = new ArrayList<>();
        }
        effectiveTagPairsSetter.accept(this.effectiveTagPairs);
        return this;
    }

    /**
     * 成本标签。
     * @return effectiveTagPairs
     */
    public List<TagPair> getEffectiveTagPairs() {
        return effectiveTagPairs;
    }

    public void setEffectiveTagPairs(List<TagPair> effectiveTagPairs) {
        this.effectiveTagPairs = effectiveTagPairs;
    }

    public NvlCostAnalysedBillDetail withCostUnitPairs(List<CostUnitPair> costUnitPairs) {
        this.costUnitPairs = costUnitPairs;
        return this;
    }

    public NvlCostAnalysedBillDetail addCostUnitPairsItem(CostUnitPair costUnitPairsItem) {
        if (this.costUnitPairs == null) {
            this.costUnitPairs = new ArrayList<>();
        }
        this.costUnitPairs.add(costUnitPairsItem);
        return this;
    }

    public NvlCostAnalysedBillDetail withCostUnitPairs(Consumer<List<CostUnitPair>> costUnitPairsSetter) {
        if (this.costUnitPairs == null) {
            this.costUnitPairs = new ArrayList<>();
        }
        costUnitPairsSetter.accept(this.costUnitPairs);
        return this;
    }

    /**
     * 成本单元。
     * @return costUnitPairs
     */
    public List<CostUnitPair> getCostUnitPairs() {
        return costUnitPairs;
    }

    public void setCostUnitPairs(List<CostUnitPair> costUnitPairs) {
        this.costUnitPairs = costUnitPairs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NvlCostAnalysedBillDetail that = (NvlCostAnalysedBillDetail) obj;
        return Objects.equals(this.sharedMonth, that.sharedMonth) && Objects.equals(this.billCycle, that.billCycle)
            && Objects.equals(this.billType, that.billType) && Objects.equals(this.customerId, that.customerId)
            && Objects.equals(this.regionCode, that.regionCode) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.serviceTypeCode, that.serviceTypeCode)
            && Objects.equals(this.resourceTypeCode, that.resourceTypeCode)
            && Objects.equals(this.serviceTypeName, that.serviceTypeName)
            && Objects.equals(this.resourceTypeName, that.resourceTypeName)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceTag, that.resourceTag)
            && Objects.equals(this.productSpecDesc, that.productSpecDesc)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.chargingMode, that.chargingMode) && Objects.equals(this.orderId, that.orderId)
            && Objects.equals(this.periodType, that.periodType) && Objects.equals(this.usageType, that.usageType)
            && Objects.equals(this.usage, that.usage) && Objects.equals(this.usageMeasureId, that.usageMeasureId)
            && Objects.equals(this.freeResourceUsage, that.freeResourceUsage)
            && Objects.equals(this.freeResourceMeasureId, that.freeResourceMeasureId)
            && Objects.equals(this.riUsage, that.riUsage)
            && Objects.equals(this.riUsageMeasureId, that.riUsageMeasureId)
            && Objects.equals(this.consumeAmount, that.consumeAmount)
            && Objects.equals(this.pastMonthsAmortizedAmount, that.pastMonthsAmortizedAmount)
            && Objects.equals(this.currentMonthAmortizedAmount, that.currentMonthAmortizedAmount)
            && Objects.equals(this.futureMonthsAmortizedAmount, that.futureMonthsAmortizedAmount)
            && Objects.equals(this.amortizedCashAmount, that.amortizedCashAmount)
            && Objects.equals(this.amortizedCreditAmount, that.amortizedCreditAmount)
            && Objects.equals(this.amortizedCouponAmount, that.amortizedCouponAmount)
            && Objects.equals(this.amortizedFlexipurchaseCouponAmount, that.amortizedFlexipurchaseCouponAmount)
            && Objects.equals(this.amortizedStoredValueCardAmount, that.amortizedStoredValueCardAmount)
            && Objects.equals(this.amortizedBonusAmount, that.amortizedBonusAmount)
            && Objects.equals(this.subServiceTypeCode, that.subServiceTypeCode)
            && Objects.equals(this.subServiceTypeName, that.subServiceTypeName)
            && Objects.equals(this.subResourceTypeCode, that.subResourceTypeCode)
            && Objects.equals(this.subResourceTypeName, that.subResourceTypeName)
            && Objects.equals(this.subResourceId, that.subResourceId)
            && Objects.equals(this.subResourceName, that.subResourceName)
            && Objects.equals(this.effectiveTagPairs, that.effectiveTagPairs)
            && Objects.equals(this.costUnitPairs, that.costUnitPairs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sharedMonth,
            billCycle,
            billType,
            customerId,
            regionCode,
            regionName,
            serviceTypeCode,
            resourceTypeCode,
            serviceTypeName,
            resourceTypeName,
            effectiveTime,
            expireTime,
            resourceId,
            resourceName,
            resourceTag,
            productSpecDesc,
            enterpriseProjectId,
            enterpriseProjectName,
            chargingMode,
            orderId,
            periodType,
            usageType,
            usage,
            usageMeasureId,
            freeResourceUsage,
            freeResourceMeasureId,
            riUsage,
            riUsageMeasureId,
            consumeAmount,
            pastMonthsAmortizedAmount,
            currentMonthAmortizedAmount,
            futureMonthsAmortizedAmount,
            amortizedCashAmount,
            amortizedCreditAmount,
            amortizedCouponAmount,
            amortizedFlexipurchaseCouponAmount,
            amortizedStoredValueCardAmount,
            amortizedBonusAmount,
            subServiceTypeCode,
            subServiceTypeName,
            subResourceTypeCode,
            subResourceTypeName,
            subResourceId,
            subResourceName,
            effectiveTagPairs,
            costUnitPairs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NvlCostAnalysedBillDetail {\n");
        sb.append("    sharedMonth: ").append(toIndentedString(sharedMonth)).append("\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceTag: ").append(toIndentedString(resourceTag)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    usageMeasureId: ").append(toIndentedString(usageMeasureId)).append("\n");
        sb.append("    freeResourceUsage: ").append(toIndentedString(freeResourceUsage)).append("\n");
        sb.append("    freeResourceMeasureId: ").append(toIndentedString(freeResourceMeasureId)).append("\n");
        sb.append("    riUsage: ").append(toIndentedString(riUsage)).append("\n");
        sb.append("    riUsageMeasureId: ").append(toIndentedString(riUsageMeasureId)).append("\n");
        sb.append("    consumeAmount: ").append(toIndentedString(consumeAmount)).append("\n");
        sb.append("    pastMonthsAmortizedAmount: ").append(toIndentedString(pastMonthsAmortizedAmount)).append("\n");
        sb.append("    currentMonthAmortizedAmount: ")
            .append(toIndentedString(currentMonthAmortizedAmount))
            .append("\n");
        sb.append("    futureMonthsAmortizedAmount: ")
            .append(toIndentedString(futureMonthsAmortizedAmount))
            .append("\n");
        sb.append("    amortizedCashAmount: ").append(toIndentedString(amortizedCashAmount)).append("\n");
        sb.append("    amortizedCreditAmount: ").append(toIndentedString(amortizedCreditAmount)).append("\n");
        sb.append("    amortizedCouponAmount: ").append(toIndentedString(amortizedCouponAmount)).append("\n");
        sb.append("    amortizedFlexipurchaseCouponAmount: ")
            .append(toIndentedString(amortizedFlexipurchaseCouponAmount))
            .append("\n");
        sb.append("    amortizedStoredValueCardAmount: ")
            .append(toIndentedString(amortizedStoredValueCardAmount))
            .append("\n");
        sb.append("    amortizedBonusAmount: ").append(toIndentedString(amortizedBonusAmount)).append("\n");
        sb.append("    subServiceTypeCode: ").append(toIndentedString(subServiceTypeCode)).append("\n");
        sb.append("    subServiceTypeName: ").append(toIndentedString(subServiceTypeName)).append("\n");
        sb.append("    subResourceTypeCode: ").append(toIndentedString(subResourceTypeCode)).append("\n");
        sb.append("    subResourceTypeName: ").append(toIndentedString(subResourceTypeName)).append("\n");
        sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
        sb.append("    subResourceName: ").append(toIndentedString(subResourceName)).append("\n");
        sb.append("    effectiveTagPairs: ").append(toIndentedString(effectiveTagPairs)).append("\n");
        sb.append("    costUnitPairs: ").append(toIndentedString(costUnitPairs)).append("\n");
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
