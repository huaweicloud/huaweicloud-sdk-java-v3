package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MonthlyBillRes
 */
public class MonthlyBillRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    private String cycle;

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
    @JsonProperty(value = "resource_Type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_name")

    private String cloudServiceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "res_instance_id")

    private String resInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_tag")

    private String resourceTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku_code")

    private String skuCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_name")

    private String enterpriseProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charge_mode")

    private Integer chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_amount")

    private Double consumeAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cash_amount")

    private Double cashAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credit_amount")

    private Double creditAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_amount")

    private Double couponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flexipurchase_coupon_amount")

    private Double flexipurchaseCouponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stored_card_amount")

    private Double storedCardAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bonus_amount")

    private Double bonusAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debt_amount")

    private Double debtAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjustment_amount")

    private Double adjustmentAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_amount")

    private Double officialAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    private Double discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    private Integer periodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_resource_id")

    private String rootResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_resource_id")

    private String parentResourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_spec_desc")

    private String productSpecDesc;

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
    @JsonProperty(value = "pre_order_id")

    private String preOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code_infos")

    private List<AzCodeInfo> azCodeInfos = null;

    public MonthlyBillRes withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    /**
     * 资源详单数据所在账期，东八区时间，格式为YYYY-MM。 例如2020-01。
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public MonthlyBillRes withBillDate(String billDate) {
        this.billDate = billDate;
        return this;
    }

    /**
     * 消费日期，东八区时间，格式为YYYY-MM-DD。  说明： 当statistic_type=2时该字段才有值，否则返回null。
     * @return billDate
     */
    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public MonthlyBillRes withBillType(Integer billType) {
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

    public MonthlyBillRes withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 消费的客户账号ID。 如果是普通客户或者企业子客户查询消费记录，只能查询到客户自己的消费记录，且此处显示的是客户自己的客户ID。如果是企业主查询消费记录，可以查询到企业主以及企业子客户的消费记录，此处为消费的实际客户ID。如果是企业主自己的消费记录，则为企业主ID；如果是某个企业子客户的消费记录，则此处为企业子账号ID。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public MonthlyBillRes withRegion(String region) {
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

    public MonthlyBillRes withRegionName(String regionName) {
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

    public MonthlyBillRes withCloudServiceType(String cloudServiceType) {
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

    public MonthlyBillRes withResourceTypeCode(String resourceTypeCode) {
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

    public MonthlyBillRes withCloudServiceTypeName(String cloudServiceTypeName) {
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

    public MonthlyBillRes withResourceTypeName(String resourceTypeName) {
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

    public MonthlyBillRes withResInstanceId(String resInstanceId) {
        this.resInstanceId = resInstanceId;
        return this;
    }

    /**
     * 资源实例ID。
     * @return resInstanceId
     */
    public String getResInstanceId() {
        return resInstanceId;
    }

    public void setResInstanceId(String resInstanceId) {
        this.resInstanceId = resInstanceId;
    }

    public MonthlyBillRes withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称。客户在创建资源的时候，可以输入资源名称，有些资源也可以在管理资源时，修改资源名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public MonthlyBillRes withResourceTag(String resourceTag) {
        this.resourceTag = resourceTag;
        return this;
    }

    /**
     * 资源标签。客户在管理资源的时候，可以设置资源标签。
     * @return resourceTag
     */
    public String getResourceTag() {
        return resourceTag;
    }

    public void setResourceTag(String resourceTag) {
        this.resourceTag = resourceTag;
    }

    public MonthlyBillRes withSkuCode(String skuCode) {
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

    public MonthlyBillRes withEnterpriseProjectId(String enterpriseProjectId) {
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

    public MonthlyBillRes withEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
        return this;
    }

    /**
     * 企业项目名称。
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public MonthlyBillRes withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    /**
     * 计费模式。 1 : 包年/包月3：按需10：预留实例11：节省计划
     * @return chargeMode
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public MonthlyBillRes withConsumeAmount(Double consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }

    /**
     * 客户购买云服务类型的消费金额，包含代金券、现金券，精确到小数点后2位。  说明： consume_amount的值等于cash_amount，credit_amount，coupon_amount，flexipurchase_coupon_amount，stored_card_amount，bonus_amount，debt_amount，adjustment_amount的总和。
     * @return consumeAmount
     */
    public Double getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(Double consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public MonthlyBillRes withCashAmount(Double cashAmount) {
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

    public MonthlyBillRes withCreditAmount(Double creditAmount) {
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

    public MonthlyBillRes withCouponAmount(Double couponAmount) {
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

    public MonthlyBillRes withFlexipurchaseCouponAmount(Double flexipurchaseCouponAmount) {
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

    public MonthlyBillRes withStoredCardAmount(Double storedCardAmount) {
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

    public MonthlyBillRes withBonusAmount(Double bonusAmount) {
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

    public MonthlyBillRes withDebtAmount(Double debtAmount) {
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

    public MonthlyBillRes withAdjustmentAmount(Double adjustmentAmount) {
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

    public MonthlyBillRes withOfficialAmount(Double officialAmount) {
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

    public MonthlyBillRes withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 对应官网价折扣金额。
     * @return discountAmount
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public MonthlyBillRes withMeasureId(Integer measureId) {
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

    public MonthlyBillRes withPeriodType(Integer periodType) {
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

    public MonthlyBillRes withRootResourceId(String rootResourceId) {
        this.rootResourceId = rootResourceId;
        return this;
    }

    /**
     * 根资源标识。
     * @return rootResourceId
     */
    public String getRootResourceId() {
        return rootResourceId;
    }

    public void setRootResourceId(String rootResourceId) {
        this.rootResourceId = rootResourceId;
    }

    public MonthlyBillRes withParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
        return this;
    }

    /**
     * 父资源标识。
     * @return parentResourceId
     */
    public String getParentResourceId() {
        return parentResourceId;
    }

    public void setParentResourceId(String parentResourceId) {
        this.parentResourceId = parentResourceId;
    }

    public MonthlyBillRes withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /**
     * 订单ID 或 交易ID。 账单类型为1，2，3，4，8时为订单ID；其它场景下为： 交易ID(非月末扣费：应收ID；月末扣费：账单ID)。
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public MonthlyBillRes withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一标识。 该字段为预留字段。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MonthlyBillRes withProductSpecDesc(String productSpecDesc) {
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

    public MonthlyBillRes withSubServiceTypeCode(String subServiceTypeCode) {
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

    public MonthlyBillRes withSubServiceTypeName(String subServiceTypeName) {
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

    public MonthlyBillRes withSubResourceTypeCode(String subResourceTypeCode) {
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

    public MonthlyBillRes withSubResourceTypeName(String subResourceTypeName) {
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

    public MonthlyBillRes withSubResourceId(String subResourceId) {
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

    public MonthlyBillRes withSubResourceName(String subResourceName) {
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

    public MonthlyBillRes withPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
        return this;
    }

    /**
     * 原订单ID 。
     * @return preOrderId
     */
    public String getPreOrderId() {
        return preOrderId;
    }

    public void setPreOrderId(String preOrderId) {
        this.preOrderId = preOrderId;
    }

    public MonthlyBillRes withAzCodeInfos(List<AzCodeInfo> azCodeInfos) {
        this.azCodeInfos = azCodeInfos;
        return this;
    }

    public MonthlyBillRes addAzCodeInfosItem(AzCodeInfo azCodeInfosItem) {
        if (this.azCodeInfos == null) {
            this.azCodeInfos = new ArrayList<>();
        }
        this.azCodeInfos.add(azCodeInfosItem);
        return this;
    }

    public MonthlyBillRes withAzCodeInfos(Consumer<List<AzCodeInfo>> azCodeInfosSetter) {
        if (this.azCodeInfos == null) {
            this.azCodeInfos = new ArrayList<>();
        }
        azCodeInfosSetter.accept(this.azCodeInfos);
        return this;
    }

    /**
     * 可用区信息列表。具体请参见表 AzCodeInfo。
     * @return azCodeInfos
     */
    public List<AzCodeInfo> getAzCodeInfos() {
        return azCodeInfos;
    }

    public void setAzCodeInfos(List<AzCodeInfo> azCodeInfos) {
        this.azCodeInfos = azCodeInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MonthlyBillRes that = (MonthlyBillRes) obj;
        return Objects.equals(this.cycle, that.cycle) && Objects.equals(this.billDate, that.billDate)
            && Objects.equals(this.billType, that.billType) && Objects.equals(this.customerId, that.customerId)
            && Objects.equals(this.region, that.region) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.cloudServiceType, that.cloudServiceType)
            && Objects.equals(this.resourceTypeCode, that.resourceTypeCode)
            && Objects.equals(this.cloudServiceTypeName, that.cloudServiceTypeName)
            && Objects.equals(this.resourceTypeName, that.resourceTypeName)
            && Objects.equals(this.resInstanceId, that.resInstanceId)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.resourceTag, that.resourceTag) && Objects.equals(this.skuCode, that.skuCode)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.chargeMode, that.chargeMode)
            && Objects.equals(this.consumeAmount, that.consumeAmount)
            && Objects.equals(this.cashAmount, that.cashAmount) && Objects.equals(this.creditAmount, that.creditAmount)
            && Objects.equals(this.couponAmount, that.couponAmount)
            && Objects.equals(this.flexipurchaseCouponAmount, that.flexipurchaseCouponAmount)
            && Objects.equals(this.storedCardAmount, that.storedCardAmount)
            && Objects.equals(this.bonusAmount, that.bonusAmount) && Objects.equals(this.debtAmount, that.debtAmount)
            && Objects.equals(this.adjustmentAmount, that.adjustmentAmount)
            && Objects.equals(this.officialAmount, that.officialAmount)
            && Objects.equals(this.discountAmount, that.discountAmount)
            && Objects.equals(this.measureId, that.measureId) && Objects.equals(this.periodType, that.periodType)
            && Objects.equals(this.rootResourceId, that.rootResourceId)
            && Objects.equals(this.parentResourceId, that.parentResourceId)
            && Objects.equals(this.tradeId, that.tradeId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.productSpecDesc, that.productSpecDesc)
            && Objects.equals(this.subServiceTypeCode, that.subServiceTypeCode)
            && Objects.equals(this.subServiceTypeName, that.subServiceTypeName)
            && Objects.equals(this.subResourceTypeCode, that.subResourceTypeCode)
            && Objects.equals(this.subResourceTypeName, that.subResourceTypeName)
            && Objects.equals(this.subResourceId, that.subResourceId)
            && Objects.equals(this.subResourceName, that.subResourceName)
            && Objects.equals(this.preOrderId, that.preOrderId) && Objects.equals(this.azCodeInfos, that.azCodeInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cycle,
            billDate,
            billType,
            customerId,
            region,
            regionName,
            cloudServiceType,
            resourceTypeCode,
            cloudServiceTypeName,
            resourceTypeName,
            resInstanceId,
            resourceName,
            resourceTag,
            skuCode,
            enterpriseProjectId,
            enterpriseProjectName,
            chargeMode,
            consumeAmount,
            cashAmount,
            creditAmount,
            couponAmount,
            flexipurchaseCouponAmount,
            storedCardAmount,
            bonusAmount,
            debtAmount,
            adjustmentAmount,
            officialAmount,
            discountAmount,
            measureId,
            periodType,
            rootResourceId,
            parentResourceId,
            tradeId,
            id,
            productSpecDesc,
            subServiceTypeCode,
            subServiceTypeName,
            subResourceTypeCode,
            subResourceTypeName,
            subResourceId,
            subResourceName,
            preOrderId,
            azCodeInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonthlyBillRes {\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    billDate: ").append(toIndentedString(billDate)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    cloudServiceTypeName: ").append(toIndentedString(cloudServiceTypeName)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    resInstanceId: ").append(toIndentedString(resInstanceId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceTag: ").append(toIndentedString(resourceTag)).append("\n");
        sb.append("    skuCode: ").append(toIndentedString(skuCode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    consumeAmount: ").append(toIndentedString(consumeAmount)).append("\n");
        sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    storedCardAmount: ").append(toIndentedString(storedCardAmount)).append("\n");
        sb.append("    bonusAmount: ").append(toIndentedString(bonusAmount)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    adjustmentAmount: ").append(toIndentedString(adjustmentAmount)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    periodType: ").append(toIndentedString(periodType)).append("\n");
        sb.append("    rootResourceId: ").append(toIndentedString(rootResourceId)).append("\n");
        sb.append("    parentResourceId: ").append(toIndentedString(parentResourceId)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productSpecDesc: ").append(toIndentedString(productSpecDesc)).append("\n");
        sb.append("    subServiceTypeCode: ").append(toIndentedString(subServiceTypeCode)).append("\n");
        sb.append("    subServiceTypeName: ").append(toIndentedString(subServiceTypeName)).append("\n");
        sb.append("    subResourceTypeCode: ").append(toIndentedString(subResourceTypeCode)).append("\n");
        sb.append("    subResourceTypeName: ").append(toIndentedString(subResourceTypeName)).append("\n");
        sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
        sb.append("    subResourceName: ").append(toIndentedString(subResourceName)).append("\n");
        sb.append("    preOrderId: ").append(toIndentedString(preOrderId)).append("\n");
        sb.append("    azCodeInfos: ").append(toIndentedString(azCodeInfos)).append("\n");
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
