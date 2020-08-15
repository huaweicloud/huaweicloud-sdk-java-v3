package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BillSumRecordInfoV2
 */
public class BillSumRecordInfoV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_cycle")
    
    private String billCycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private Integer billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cash_amount")
    
    private BigDecimal cashAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charging_mode")
    
    private Integer chargingMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consume_amount")
    
    private BigDecimal consumeAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_amount")
    
    private BigDecimal couponAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credit_amount")
    
    private BigDecimal creditAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="debt_amount")
    
    private BigDecimal debtAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flexipurchase_coupon_amount")
    
    private BigDecimal flexipurchaseCouponAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_amount")
    
    private BigDecimal officialAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_discount_amount")
    
    private BigDecimal officialDiscountAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_code")
    
    private String resourceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_type_code")
    
    private String serviceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stored_value_card_amount")
    
    private BigDecimal storedValueCardAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="truncated_amount")
    
    private BigDecimal truncatedAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="writeoff_amount")
    
    private BigDecimal writeoffAmount = null;

    public BillSumRecordInfoV2 withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    


    /**
     * |参数名称：账期，格式为YYYY-MM| |参数约束及描述：账期，格式为YYYY-MM|
     * @return billCycle
     */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public BillSumRecordInfoV2 withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * |参数名称：消费类型：1：消费2：退款3：调账| |参数的约束及描述：消费类型：1：消费2：退款3：调账|
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public BillSumRecordInfoV2 withCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }

    


    /**
     * |参数名称：现金账户金额。| |参数的约束及描述：现金账户金额。|
     * @return cashAmount
     */
    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public BillSumRecordInfoV2 withChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    


    /**
     * |参数名称：计费模式1：包周期；3：按需；10：预留实例| |参数约束及描述：计费模式1：包周期；3：按需；10：预留实例|
     * @return chargingMode
     */
    public Integer getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(Integer chargingMode) {
        this.chargingMode = chargingMode;
    }

    public BillSumRecordInfoV2 withConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }

    


    /**
     * |参数名称：应付金额，应付金额 = 官网价-折扣金额-抹零金额| |参数的约束及描述：应付金额，应付金额 = 官网价-折扣金额-抹零金额|
     * @return consumeAmount
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public BillSumRecordInfoV2 withCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    


    /**
     * |参数名称：代金券金额。| |参数的约束及描述：代金券金额。|
     * @return couponAmount
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public BillSumRecordInfoV2 withCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    


    /**
     * |参数名称：信用账户金额。| |参数的约束及描述：信用账户金额。|
     * @return creditAmount
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public BillSumRecordInfoV2 withCustomerId(String customerId) {
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

    public BillSumRecordInfoV2 withDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    


    /**
     * |参数名称：欠费金额，即从客户账户扣费的时候，客户账户金额不足，欠费的金额。| |参数的约束及描述：欠费金额，即从客户账户扣费的时候，客户账户金额不足，欠费的金额。|
     * @return debtAmount
     */
    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public BillSumRecordInfoV2 withFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
        return this;
    }

    


    /**
     * |参数名称：现金券金额，预留。| |参数的约束及描述：现金券金额，预留。|
     * @return flexipurchaseCouponAmount
     */
    public BigDecimal getFlexipurchaseCouponAmount() {
        return flexipurchaseCouponAmount;
    }

    public void setFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
    }

    public BillSumRecordInfoV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：金额单位。1：元2：角3：分| |参数的约束及描述：金额单位。1：元2：角3：分|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public BillSumRecordInfoV2 withOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    


    /**
     * |参数名称：官网价| |参数的约束及描述：官网价|
     * @return officialAmount
     */
    public BigDecimal getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
    }

    public BillSumRecordInfoV2 withOfficialDiscountAmount(BigDecimal officialDiscountAmount) {
        this.officialDiscountAmount = officialDiscountAmount;
        return this;
    }

    


    /**
     * |参数名称：折扣金额| |参数的约束及描述：折扣金额|
     * @return officialDiscountAmount
     */
    public BigDecimal getOfficialDiscountAmount() {
        return officialDiscountAmount;
    }

    public void setOfficialDiscountAmount(BigDecimal officialDiscountAmount) {
        this.officialDiscountAmount = officialDiscountAmount;
    }

    public BillSumRecordInfoV2 withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    


    /**
     * |参数名称：资源类型编码，例如ECS的VM为“hws.resource.type.vm”。具体请参见资源类型资源类型资源类型资源类型。| |参数约束及描述：资源类型编码，例如ECS的VM为“hws.resource.type.vm”。具体请参见资源类型资源类型资源类型资源类型。|
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public BillSumRecordInfoV2 withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    


    /**
     * |参数名称：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型| |参数约束及描述：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型|
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public BillSumRecordInfoV2 withStoredValueCardAmount(BigDecimal storedValueCardAmount) {
        this.storedValueCardAmount = storedValueCardAmount;
        return this;
    }

    


    /**
     * |参数名称：储值卡金额，预留。| |参数的约束及描述：储值卡金额，预留。|
     * @return storedValueCardAmount
     */
    public BigDecimal getStoredValueCardAmount() {
        return storedValueCardAmount;
    }

    public void setStoredValueCardAmount(BigDecimal storedValueCardAmount) {
        this.storedValueCardAmount = storedValueCardAmount;
    }

    public BillSumRecordInfoV2 withTruncatedAmount(BigDecimal truncatedAmount) {
        this.truncatedAmount = truncatedAmount;
        return this;
    }

    


    /**
     * |参数名称：抹零金额| |参数的约束及描述：抹零金额|
     * @return truncatedAmount
     */
    public BigDecimal getTruncatedAmount() {
        return truncatedAmount;
    }

    public void setTruncatedAmount(BigDecimal truncatedAmount) {
        this.truncatedAmount = truncatedAmount;
    }

    public BillSumRecordInfoV2 withWriteoffAmount(BigDecimal writeoffAmount) {
        this.writeoffAmount = writeoffAmount;
        return this;
    }

    


    /**
     * |参数名称：欠费核销金额| |参数的约束及描述：欠费核销金额|
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
        BillSumRecordInfoV2 billSumRecordInfoV2 = (BillSumRecordInfoV2) o;
        return Objects.equals(this.billCycle, billSumRecordInfoV2.billCycle) &&
            Objects.equals(this.billType, billSumRecordInfoV2.billType) &&
            Objects.equals(this.cashAmount, billSumRecordInfoV2.cashAmount) &&
            Objects.equals(this.chargingMode, billSumRecordInfoV2.chargingMode) &&
            Objects.equals(this.consumeAmount, billSumRecordInfoV2.consumeAmount) &&
            Objects.equals(this.couponAmount, billSumRecordInfoV2.couponAmount) &&
            Objects.equals(this.creditAmount, billSumRecordInfoV2.creditAmount) &&
            Objects.equals(this.customerId, billSumRecordInfoV2.customerId) &&
            Objects.equals(this.debtAmount, billSumRecordInfoV2.debtAmount) &&
            Objects.equals(this.flexipurchaseCouponAmount, billSumRecordInfoV2.flexipurchaseCouponAmount) &&
            Objects.equals(this.measureId, billSumRecordInfoV2.measureId) &&
            Objects.equals(this.officialAmount, billSumRecordInfoV2.officialAmount) &&
            Objects.equals(this.officialDiscountAmount, billSumRecordInfoV2.officialDiscountAmount) &&
            Objects.equals(this.resourceTypeCode, billSumRecordInfoV2.resourceTypeCode) &&
            Objects.equals(this.serviceTypeCode, billSumRecordInfoV2.serviceTypeCode) &&
            Objects.equals(this.storedValueCardAmount, billSumRecordInfoV2.storedValueCardAmount) &&
            Objects.equals(this.truncatedAmount, billSumRecordInfoV2.truncatedAmount) &&
            Objects.equals(this.writeoffAmount, billSumRecordInfoV2.writeoffAmount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(billCycle, billType, cashAmount, chargingMode, consumeAmount, couponAmount, creditAmount, customerId, debtAmount, flexipurchaseCouponAmount, measureId, officialAmount, officialDiscountAmount, resourceTypeCode, serviceTypeCode, storedValueCardAmount, truncatedAmount, writeoffAmount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillSumRecordInfoV2 {\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    consumeAmount: ").append(toIndentedString(consumeAmount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    officialDiscountAmount: ").append(toIndentedString(officialDiscountAmount)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    storedValueCardAmount: ").append(toIndentedString(storedValueCardAmount)).append("\n");
        sb.append("    truncatedAmount: ").append(toIndentedString(truncatedAmount)).append("\n");
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

