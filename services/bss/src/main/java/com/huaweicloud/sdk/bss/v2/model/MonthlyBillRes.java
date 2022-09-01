package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * MonthlyBillRes
 */
public class MonthlyBillRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cycle")

    @JacksonXmlProperty(localName = "cycle")

    private String cycle;

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
    @JsonProperty(value = "resource_Type_code")

    @JacksonXmlProperty(localName = "resource_Type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_name")

    @JacksonXmlProperty(localName = "cloud_service_type_name")

    private String cloudServiceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    @JacksonXmlProperty(localName = "resource_type_name")

    private String resourceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "res_instance_id")

    @JacksonXmlProperty(localName = "res_instance_id")

    private String resInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    @JacksonXmlProperty(localName = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_tag")

    @JacksonXmlProperty(localName = "resource_tag")

    private String resourceTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku_code")

    @JacksonXmlProperty(localName = "sku_code")

    private String skuCode;

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

    private Integer chargeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_amount")

    @JacksonXmlProperty(localName = "consume_amount")

    private Double consumeAmount;

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
    @JsonProperty(value = "official_amount")

    @JacksonXmlProperty(localName = "official_amount")

    private Double officialAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    @JacksonXmlProperty(localName = "discount_amount")

    private Double discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    @JacksonXmlProperty(localName = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_type")

    @JacksonXmlProperty(localName = "period_type")

    private Integer periodType;

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
     * 账单类型。 1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿14：消费-服务支持计划月末扣费16：调账-扣费18：消费-按月付费20：退款-变更
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
     * 企业项目标识（企业项目ID）。 default项目对应ID：0未归集（表示该云服务不支持企业项目管理能力）项目对应ID：-1其余项目对应ID获取方法请参见[如何获取企业项目ID](https://support.huaweicloud.com/usermanual-em/zh-cn_topic_0126101490.html)。
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
     * 计费模式。 1 : 包年/包月3：按需10：预留实例
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MonthlyBillRes monthlyBillRes = (MonthlyBillRes) o;
        return Objects.equals(this.cycle, monthlyBillRes.cycle)
            && Objects.equals(this.billDate, monthlyBillRes.billDate)
            && Objects.equals(this.billType, monthlyBillRes.billType)
            && Objects.equals(this.customerId, monthlyBillRes.customerId)
            && Objects.equals(this.region, monthlyBillRes.region)
            && Objects.equals(this.regionName, monthlyBillRes.regionName)
            && Objects.equals(this.cloudServiceType, monthlyBillRes.cloudServiceType)
            && Objects.equals(this.resourceTypeCode, monthlyBillRes.resourceTypeCode)
            && Objects.equals(this.cloudServiceTypeName, monthlyBillRes.cloudServiceTypeName)
            && Objects.equals(this.resourceTypeName, monthlyBillRes.resourceTypeName)
            && Objects.equals(this.resInstanceId, monthlyBillRes.resInstanceId)
            && Objects.equals(this.resourceName, monthlyBillRes.resourceName)
            && Objects.equals(this.resourceTag, monthlyBillRes.resourceTag)
            && Objects.equals(this.skuCode, monthlyBillRes.skuCode)
            && Objects.equals(this.enterpriseProjectId, monthlyBillRes.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, monthlyBillRes.enterpriseProjectName)
            && Objects.equals(this.chargeMode, monthlyBillRes.chargeMode)
            && Objects.equals(this.consumeAmount, monthlyBillRes.consumeAmount)
            && Objects.equals(this.cashAmount, monthlyBillRes.cashAmount)
            && Objects.equals(this.creditAmount, monthlyBillRes.creditAmount)
            && Objects.equals(this.couponAmount, monthlyBillRes.couponAmount)
            && Objects.equals(this.flexipurchaseCouponAmount, monthlyBillRes.flexipurchaseCouponAmount)
            && Objects.equals(this.storedCardAmount, monthlyBillRes.storedCardAmount)
            && Objects.equals(this.bonusAmount, monthlyBillRes.bonusAmount)
            && Objects.equals(this.debtAmount, monthlyBillRes.debtAmount)
            && Objects.equals(this.adjustmentAmount, monthlyBillRes.adjustmentAmount)
            && Objects.equals(this.officialAmount, monthlyBillRes.officialAmount)
            && Objects.equals(this.discountAmount, monthlyBillRes.discountAmount)
            && Objects.equals(this.measureId, monthlyBillRes.measureId)
            && Objects.equals(this.periodType, monthlyBillRes.periodType);
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
            periodType);
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
