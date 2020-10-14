package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MonthlyBillRecord
 */
public class MonthlyBillRecord  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_cycle")
    
    private String billCycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type_code")
    
    private String serviceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_code")
    
    private String resourceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_code")
    
    private String regionCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_name")
    
    private String enterpriseProjectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charging_mode")
    
    private Integer chargingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consume_time")
    
    private String consumeTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trade_time")
    
    private String tradeTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provider_type")
    
    private Integer providerType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trade_id")
    
    private String tradeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private Integer billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_amount")
    
    private BigDecimal officialAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_discount_amount")
    
    private BigDecimal officialDiscountAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="erase_amount")
    
    private BigDecimal eraseAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consume_amount")
    
    private BigDecimal consumeAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cash_amount")
    
    private BigDecimal cashAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credit_amount")
    
    private BigDecimal creditAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_amount")
    
    private BigDecimal couponAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flexipurchase_coupon_amount")
    
    private BigDecimal flexipurchaseCouponAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stored_value_card_amount")
    
    private BigDecimal storedValueCardAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bonus_amount")
    
    private BigDecimal bonusAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="debt_amount")
    
    private BigDecimal debtAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="writeoff_amount")
    
    private BigDecimal writeoffAmount = null;

    public MonthlyBillRecord withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    


    /**
     * |参数名称：账期，格式固定为YYYY-MM。| |参数约束及描述：账期，格式固定为YYYY-MM。|
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
     * |参数名称：消费的客户账号ID。如果是普通客户或者企业子客户查询消费记录，只能查询到客户自己的消费记录，且此处显示的是客户自己的客户ID。如果是企业主查询消费记录，可以查询到企业主以及企业子客户的消费记录，此处为消费的实际客户ID。如果是企业主自己的消费记录，则为企业主ID；如果是某个企业子客户的消费记录，则此处为企业子账号ID。| |参数约束及描述：消费的客户账号ID。如果是普通客户或者企业子客户查询消费记录，只能查询到客户自己的消费记录，且此处显示的是客户自己的客户ID。如果是企业主查询消费记录，可以查询到企业主以及企业子客户的消费记录，此处为消费的实际客户ID。如果是企业主自己的消费记录，则为企业主ID；如果是某个企业子客户的消费记录，则此处为企业子账号ID。|
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
     * |参数名称：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。| |参数约束及描述：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型云服务类型云服务类型云服务类型。|
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
     * |参数名称：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。| |参数约束及描述：云服务区编码，例如：“cn-north-1”。具体请参见地区和终端节点地区和终端节点对应云服务的“区域”列的值。|
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public MonthlyBillRecord withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    


    /**
     * |参数名称：资源类型编码，例如ECS的VM为“hws.resource.type.vm”。具体请参见资源类型| |参数约束及描述：资源类型编码，例如ECS的VM为“hws.resource.type.vm”。具体请参见资源类型|
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
     * |参数名称：企业项目标识| |参数约束及描述：企业项目标识|
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
     * |参数名称：企业项目名称| |参数约束及描述：企业项目名称|
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
     * |参数名称：计费模式1、包周期；3、按需；10、预留实例| |参数的约束及描述：计费模式1、包周期；3、按需；10、预留实例|
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
     * |参数名称：| |参数名称：消费时间，包周期和预留实例订购场景下为订单支付时间，按需场景下为话单生失效时间||参数约束及描述：| |参数名称：消费时间，包周期和预留实例订购场景下为订单支付时间，按需场景下为话单生失效时间|
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
     * |参数名称：| |参数名称：交易时间| |参数约束及描述：交易时间，某条消费记录对应的扣费时间||参数约束及描述：| |参数名称：交易时间| |参数约束及描述：交易时间，某条消费记录对应的扣费时间|
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
     * |参数名称：服务商1：华为云2：云市场| |参数的约束及描述：服务商1：华为云2：云市场|
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
     * |参数名称：订单ID 或 交易ID，扣费维度的唯一标识| |参数约束及描述：订单ID 或 交易ID，扣费维度的唯一标识|
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public MonthlyBillRecord withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * |参数名称：账单类型1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿12：消费-按时计费13：消费-退订手续费14：消费-服务支持计划月末扣费16：调账-扣费| |参数的约束及描述：账单类型1：消费-新购2：消费-续订3：消费-变更4：退款-退订5：消费-使用8：消费-自动续订9：调账-补偿12：消费-按时计费13：消费-退订手续费14：消费-服务支持计划月末扣费16：调账-扣费|
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
     * |参数名称：支付状态1：已支付2：未结清3：未结算| |参数的约束及描述：支付状态1：已支付2：未结清3：未结算|
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
     * |参数名称：官网价。单位为元说明：official_amount等于official_discount_amount和erase_amount和consume_amount的和。| |参数的约束及描述：官网价。单位为元说明：official_amount等于official_discount_amount和erase_amount和consume_amount的和。|
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
     * |参数名称：折扣金额。单位为元| |参数的约束及描述：折扣金额。单位为元|
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
     * |参数名称：抹零金额。单位为元| |参数的约束及描述：抹零金额。单位为元|
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
     * |参数名称：应付金额，包括现金券和储值卡和代金券金额。单位为元说明：（1）consume_amount的值包含cash_amount，credit_amount，coupon_amount，flexipurchase_coupon_amount，stored_card_amount，bonus_amount，debt_amount，writeoff_amount的和| |参数的约束及描述：应付金额，包括现金券和储值卡和代金券金额。单位为元说明：（1）consume_amount的值包含cash_amount，credit_amount，coupon_amount，flexipurchase_coupon_amount，stored_card_amount，bonus_amount，debt_amount，writeoff_amount的和|
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
     * |参数名称：现金支付金额。单位为元| |参数的约束及描述：现金支付金额。单位为元|
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
     * |参数名称：信用额度支付金额。单位为元| |参数的约束及描述：信用额度支付金额。单位为元|
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
     * |参数名称：代金券支付金额。单位为元| |参数的约束及描述：代金券支付金额。单位为元|
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
     * |参数名称：现金券支付金额。单位为元| |参数的约束及描述：现金券支付金额。单位为元|
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
     * |参数名称：储值卡支付金额。单位为元| |参数的约束及描述：储值卡支付金额。单位为元|
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
     * |参数名称：奖励金支付金额（奖励金已经下市，用于现网客户未使用完的奖励金）。单位为元| |参数的约束及描述：奖励金支付金额（奖励金已经下市，用于现网客户未使用完的奖励金）。单位为元|
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
     * |参数名称：欠费金额。单位为元| |参数的约束及描述：欠费金额。单位为元|
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
     * |参数名称：欠费核销金额。单位为元| |参数的约束及描述：欠费核销金额。单位为元|
     * @return writeoffAmount
     */
    public BigDecimal getWriteoffAmount() {
        return writeoffAmount;
    }

    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        this.writeoffAmount = writeoffAmount;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MonthlyBillRecord monthlyBillRecord = (MonthlyBillRecord) o;
        return Objects.equals(this.billCycle, monthlyBillRecord.billCycle) &&
            Objects.equals(this.customerId, monthlyBillRecord.customerId) &&
            Objects.equals(this.serviceTypeCode, monthlyBillRecord.serviceTypeCode) &&
            Objects.equals(this.resourceTypeCode, monthlyBillRecord.resourceTypeCode) &&
            Objects.equals(this.regionCode, monthlyBillRecord.regionCode) &&
            Objects.equals(this.enterpriseProjectId, monthlyBillRecord.enterpriseProjectId) &&
            Objects.equals(this.enterpriseProjectName, monthlyBillRecord.enterpriseProjectName) &&
            Objects.equals(this.chargingMode, monthlyBillRecord.chargingMode) &&
            Objects.equals(this.consumeTime, monthlyBillRecord.consumeTime) &&
            Objects.equals(this.tradeTime, monthlyBillRecord.tradeTime) &&
            Objects.equals(this.providerType, monthlyBillRecord.providerType) &&
            Objects.equals(this.tradeId, monthlyBillRecord.tradeId) &&
            Objects.equals(this.billType, monthlyBillRecord.billType) &&
            Objects.equals(this.status, monthlyBillRecord.status) &&
            Objects.equals(this.officialAmount, monthlyBillRecord.officialAmount) &&
            Objects.equals(this.officialDiscountAmount, monthlyBillRecord.officialDiscountAmount) &&
            Objects.equals(this.eraseAmount, monthlyBillRecord.eraseAmount) &&
            Objects.equals(this.consumeAmount, monthlyBillRecord.consumeAmount) &&
            Objects.equals(this.cashAmount, monthlyBillRecord.cashAmount) &&
            Objects.equals(this.creditAmount, monthlyBillRecord.creditAmount) &&
            Objects.equals(this.couponAmount, monthlyBillRecord.couponAmount) &&
            Objects.equals(this.flexipurchaseCouponAmount, monthlyBillRecord.flexipurchaseCouponAmount) &&
            Objects.equals(this.storedValueCardAmount, monthlyBillRecord.storedValueCardAmount) &&
            Objects.equals(this.bonusAmount, monthlyBillRecord.bonusAmount) &&
            Objects.equals(this.debtAmount, monthlyBillRecord.debtAmount) &&
            Objects.equals(this.writeoffAmount, monthlyBillRecord.writeoffAmount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(billCycle, customerId, serviceTypeCode, resourceTypeCode, regionCode, enterpriseProjectId, enterpriseProjectName, chargingMode, consumeTime, tradeTime, providerType, tradeId, billType, status, officialAmount, officialDiscountAmount, eraseAmount, consumeAmount, cashAmount, creditAmount, couponAmount, flexipurchaseCouponAmount, storedValueCardAmount, bonusAmount, debtAmount, writeoffAmount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonthlyBillRecord {\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    consumeTime: ").append(toIndentedString(consumeTime)).append("\n");
        sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
        sb.append("    providerType: ").append(toIndentedString(providerType)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
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

