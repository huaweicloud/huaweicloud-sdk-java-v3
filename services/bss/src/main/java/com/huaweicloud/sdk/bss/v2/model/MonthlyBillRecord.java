package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * MonthlyBillRecord
 */
public class MonthlyBillRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_cycle")

    private String billCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

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
    @JsonProperty(value = "region_code")

    private String regionCode;

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
    @JsonProperty(value = "consume_time")

    private String consumeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_time")

    private String tradeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_type")

    private Integer providerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_type")

    private Integer billType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_amount")

    private BigDecimal officialAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_discount_amount")

    private BigDecimal officialDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "erase_amount")

    private BigDecimal eraseAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_amount")

    private BigDecimal consumeAmount;

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
    @JsonProperty(value = "bonus_amount")

    private BigDecimal bonusAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debt_amount")

    private BigDecimal debtAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "writeoff_amount")

    private BigDecimal writeoffAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    public MonthlyBillRecord withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    /**
     * 流水账单所在账期，东八区时间，格式为YYYY-MM。
     * @return billCycle
     */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public MonthlyBillRecord withCustomerId(String customerId) {
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

    public MonthlyBillRecord withServiceTypeCode(String serviceTypeCode) {
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

    public MonthlyBillRecord withResourceTypeCode(String resourceTypeCode) {
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

    public MonthlyBillRecord withServiceTypeName(String serviceTypeName) {
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

    public MonthlyBillRecord withResourceTypeName(String resourceTypeName) {
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

    public MonthlyBillRecord withRegionCode(String regionCode) {
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

    public MonthlyBillRecord withEnterpriseProjectId(String enterpriseProjectId) {
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

    public MonthlyBillRecord withEnterpriseProjectName(String enterpriseProjectName) {
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

    public MonthlyBillRecord withChargingMode(Integer chargingMode) {
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

    public MonthlyBillRecord withConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
        return this;
    }

    /**
     * 消费时间。 计费模式为包年/包月和预留实例场景时为订单的支付时间。计费模式为按需场景时为话单的生/失效时间。
     * @return consumeTime
     */
    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    public MonthlyBillRecord withTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    /**
     * 交易时间，某条消费记录对应的扣费时间。
     * @return tradeTime
     */
    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public MonthlyBillRecord withProviderType(Integer providerType) {
        this.providerType = providerType;
        return this;
    }

    /**
     * 服务商。 1：华为云2：云商店
     * @return providerType
     */
    public Integer getProviderType() {
        return providerType;
    }

    public void setProviderType(Integer providerType) {
        this.providerType = providerType;
    }

    public MonthlyBillRecord withTradeId(String tradeId) {
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

    public MonthlyBillRecord withId(String id) {
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

    public MonthlyBillRecord withBillType(Integer billType) {
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

    public MonthlyBillRecord withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 支付状态。 1：已支付2：未结清3：未结算
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public MonthlyBillRecord withOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    /**
     * 官网价。单位：元。  说明： official_amount = official_discount_amount + erase_amount + consume_amount
     * @return officialAmount
     */
    public BigDecimal getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
    }

    public MonthlyBillRecord withOfficialDiscountAmount(BigDecimal officialDiscountAmount) {
        this.officialDiscountAmount = officialDiscountAmount;
        return this;
    }

    /**
     * 折扣金额。单位：元。
     * @return officialDiscountAmount
     */
    public BigDecimal getOfficialDiscountAmount() {
        return officialDiscountAmount;
    }

    public void setOfficialDiscountAmount(BigDecimal officialDiscountAmount) {
        this.officialDiscountAmount = officialDiscountAmount;
    }

    public MonthlyBillRecord withEraseAmount(BigDecimal eraseAmount) {
        this.eraseAmount = eraseAmount;
        return this;
    }

    /**
     * 抹零金额。单位：元。
     * @return eraseAmount
     */
    public BigDecimal getEraseAmount() {
        return eraseAmount;
    }

    public void setEraseAmount(BigDecimal eraseAmount) {
        this.eraseAmount = eraseAmount;
    }

    public MonthlyBillRecord withConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }

    /**
     * 应付金额，包括现金券和储值卡和代金券金额。单位：元。  说明： consume_amount的值等于cash_amount，credit_amount，coupon_amount，flexipurchase_coupon_amount，stored_value_card_amount，bonus_amount，debt_amount，writeoff_amount的总和。
     * @return consumeAmount
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public MonthlyBillRecord withCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }

    /**
     * 现金支付金额。单位：元.
     * @return cashAmount
     */
    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public MonthlyBillRecord withCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    /**
     * 信用额度支付金额。单位：元。
     * @return creditAmount
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public MonthlyBillRecord withCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    /**
     * 代金券支付金额。单位：元。
     * @return couponAmount
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public MonthlyBillRecord withFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
        return this;
    }

    /**
     * 现金券支付金额。单位：元。
     * @return flexipurchaseCouponAmount
     */
    public BigDecimal getFlexipurchaseCouponAmount() {
        return flexipurchaseCouponAmount;
    }

    public void setFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
    }

    public MonthlyBillRecord withStoredValueCardAmount(BigDecimal storedValueCardAmount) {
        this.storedValueCardAmount = storedValueCardAmount;
        return this;
    }

    /**
     * 储值卡支付金额。单位：元。
     * @return storedValueCardAmount
     */
    public BigDecimal getStoredValueCardAmount() {
        return storedValueCardAmount;
    }

    public void setStoredValueCardAmount(BigDecimal storedValueCardAmount) {
        this.storedValueCardAmount = storedValueCardAmount;
    }

    public MonthlyBillRecord withBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
        return this;
    }

    /**
     * 奖励金支付金额（奖励金已经下线，目前用于现网客户未使用完的奖励金）。单位：元。
     * @return bonusAmount
     */
    public BigDecimal getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public MonthlyBillRecord withDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    /**
     * 欠费金额。单位：元。  说明： 对于月结客户，欠费金额即页面上的月度结算金额。
     * @return debtAmount
     */
    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public MonthlyBillRecord withWriteoffAmount(BigDecimal writeoffAmount) {
        this.writeoffAmount = writeoffAmount;
        return this;
    }

    /**
     * 欠费核销金额。单位：元。
     * @return writeoffAmount
     */
    public BigDecimal getWriteoffAmount() {
        return writeoffAmount;
    }

    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        this.writeoffAmount = writeoffAmount;
    }

    public MonthlyBillRecord withRegionName(String regionName) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MonthlyBillRecord that = (MonthlyBillRecord) obj;
        return Objects.equals(this.billCycle, that.billCycle) && Objects.equals(this.customerId, that.customerId)
            && Objects.equals(this.serviceTypeCode, that.serviceTypeCode)
            && Objects.equals(this.resourceTypeCode, that.resourceTypeCode)
            && Objects.equals(this.serviceTypeName, that.serviceTypeName)
            && Objects.equals(this.resourceTypeName, that.resourceTypeName)
            && Objects.equals(this.regionCode, that.regionCode)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.enterpriseProjectName, that.enterpriseProjectName)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.consumeTime, that.consumeTime) && Objects.equals(this.tradeTime, that.tradeTime)
            && Objects.equals(this.providerType, that.providerType) && Objects.equals(this.tradeId, that.tradeId)
            && Objects.equals(this.id, that.id) && Objects.equals(this.billType, that.billType)
            && Objects.equals(this.status, that.status) && Objects.equals(this.officialAmount, that.officialAmount)
            && Objects.equals(this.officialDiscountAmount, that.officialDiscountAmount)
            && Objects.equals(this.eraseAmount, that.eraseAmount)
            && Objects.equals(this.consumeAmount, that.consumeAmount)
            && Objects.equals(this.cashAmount, that.cashAmount) && Objects.equals(this.creditAmount, that.creditAmount)
            && Objects.equals(this.couponAmount, that.couponAmount)
            && Objects.equals(this.flexipurchaseCouponAmount, that.flexipurchaseCouponAmount)
            && Objects.equals(this.storedValueCardAmount, that.storedValueCardAmount)
            && Objects.equals(this.bonusAmount, that.bonusAmount) && Objects.equals(this.debtAmount, that.debtAmount)
            && Objects.equals(this.writeoffAmount, that.writeoffAmount)
            && Objects.equals(this.regionName, that.regionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billCycle,
            customerId,
            serviceTypeCode,
            resourceTypeCode,
            serviceTypeName,
            resourceTypeName,
            regionCode,
            enterpriseProjectId,
            enterpriseProjectName,
            chargingMode,
            consumeTime,
            tradeTime,
            providerType,
            tradeId,
            id,
            billType,
            status,
            officialAmount,
            officialDiscountAmount,
            eraseAmount,
            consumeAmount,
            cashAmount,
            creditAmount,
            couponAmount,
            flexipurchaseCouponAmount,
            storedValueCardAmount,
            bonusAmount,
            debtAmount,
            writeoffAmount,
            regionName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonthlyBillRecord {\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    consumeTime: ").append(toIndentedString(consumeTime)).append("\n");
        sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    officialDiscountAmount: ").append(toIndentedString(officialDiscountAmount)).append("\n");
        sb.append("    eraseAmount: ").append(toIndentedString(eraseAmount)).append("\n");
        sb.append("    consumeAmount: ").append(toIndentedString(consumeAmount)).append("\n");
        sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    storedValueCardAmount: ").append(toIndentedString(storedValueCardAmount)).append("\n");
        sb.append("    bonusAmount: ").append(toIndentedString(bonusAmount)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    writeoffAmount: ").append(toIndentedString(writeoffAmount)).append("\n");
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
