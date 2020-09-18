package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.BalanceTypeDeductSumV2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BillSumInfoV2
 */
public class BillSumInfoV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private String billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private String chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private BigDecimal amount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="debt_amount")
    
    private BigDecimal debtAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adjustment_amount")
    
    private BigDecimal adjustmentAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_amount")
    
    private BigDecimal discountAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account_details")
    
    private List<BalanceTypeDeductSumV2> accountDetails = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type_code")
    
    private String resourceTypeCode;

    public BillSumInfoV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：客户ID。| |参数约束及描述：客户ID。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public BillSumInfoV2 withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * |参数名称：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型。| |参数约束及描述：云服务类型编码，例如ECS的云服务类型编码为“hws.service.type.ec2”。具体请参见云服务类型。|
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public BillSumInfoV2 withBillType(String billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * |参数名称：费用类型。0：消费；1：退订；2：华为核销。| |参数约束及描述：费用类型。0：消费；1：退订；2：华为核销。|
     * @return billType
     */
    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public BillSumInfoV2 withChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * |参数名称：消费类型。1：包周期；3: 按需。| |参数约束及描述：消费类型。1：包周期；3: 按需。|
     * @return chargeMode
     */
    public String getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(String chargeMode) {
        this.chargeMode = chargeMode;
    }

    public BillSumInfoV2 withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：消费的金额，即从客户账户实际扣除的金额。对于billType=1或者2的账单，该金额为负值。| |参数的约束及描述：消费的金额，即从客户账户实际扣除的金额。对于billType=1或者2的账单，该金额为负值。|
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BillSumInfoV2 withDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    


    /**
     * |参数名称：欠费金额，指从客户账户扣费的时候，客户账户金额不足，欠费的金额，华为核销或者退订的时候没有该字段。| |参数的约束及描述：欠费金额，指从客户账户扣费的时候，客户账户金额不足，欠费的金额，华为核销或者退订的时候没有该字段。|
     * @return debtAmount
     */
    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public BillSumInfoV2 withAdjustmentAmount(BigDecimal adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
        return this;
    }

    


    /**
     * |参数名称：核销欠款，华为核销或者退订的时候没有该字段。| |参数的约束及描述：核销欠款，华为核销或者退订的时候没有该字段。|
     * @return adjustmentAmount
     */
    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(BigDecimal adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    public BillSumInfoV2 withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    


    /**
     * |参数名称：折扣金额，华为核销或者退订的时候没有该字段。| |参数的约束及描述：折扣金额，华为核销或者退订的时候没有该字段。|
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BillSumInfoV2 withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：金额单位。1：元；2：角；3：分| |参数的约束及描述：金额单位。1：元；2：角；3：分|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public BillSumInfoV2 withAccountDetails(List<BalanceTypeDeductSumV2> accountDetails) {
        this.accountDetails = accountDetails;
        return this;
    }

    
    public BillSumInfoV2 addAccountDetailsItem(BalanceTypeDeductSumV2 accountDetailsItem) {
        if (this.accountDetails == null) {
            this.accountDetails = new ArrayList<>();
        }
        this.accountDetails.add(accountDetailsItem);
        return this;
    }

    public BillSumInfoV2 withAccountDetails(Consumer<List<BalanceTypeDeductSumV2>> accountDetailsSetter) {
        if(this.accountDetails == null ){
            this.accountDetails = new ArrayList<>();
        }
        accountDetailsSetter.accept(this.accountDetails);
        return this;
    }

    /**
     * |参数名称：按不同账户消费类型和付费方式区分的支付总金额。具体请参见表 BalanceTypeDeductSum。| |参数约束以及描述：按不同账户消费类型和付费方式区分的支付总金额。具体请参见表 BalanceTypeDeductSum。|
     * @return accountDetails
     */
    public List<BalanceTypeDeductSumV2> getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(List<BalanceTypeDeductSumV2> accountDetails) {
        this.accountDetails = accountDetails;
    }

    public BillSumInfoV2 withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    


    /**
     * |参数名称：资源类型编码| |参数约束及描述：资源类型编码|
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillSumInfoV2 billSumInfoV2 = (BillSumInfoV2) o;
        return Objects.equals(this.customerId, billSumInfoV2.customerId) &&
            Objects.equals(this.cloudServiceType, billSumInfoV2.cloudServiceType) &&
            Objects.equals(this.billType, billSumInfoV2.billType) &&
            Objects.equals(this.chargeMode, billSumInfoV2.chargeMode) &&
            Objects.equals(this.amount, billSumInfoV2.amount) &&
            Objects.equals(this.debtAmount, billSumInfoV2.debtAmount) &&
            Objects.equals(this.adjustmentAmount, billSumInfoV2.adjustmentAmount) &&
            Objects.equals(this.discountAmount, billSumInfoV2.discountAmount) &&
            Objects.equals(this.measureId, billSumInfoV2.measureId) &&
            Objects.equals(this.accountDetails, billSumInfoV2.accountDetails) &&
            Objects.equals(this.resourceTypeCode, billSumInfoV2.resourceTypeCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, cloudServiceType, billType, chargeMode, amount, debtAmount, adjustmentAmount, discountAmount, measureId, accountDetails, resourceTypeCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillSumInfoV2 {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    adjustmentAmount: ").append(toIndentedString(adjustmentAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
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

