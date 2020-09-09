package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MonthlyBillRes
 */
public class MonthlyBillRes  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adjustment_amount")
    
    private BigDecimal adjustmentAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private Integer billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bonus_amount")
    
    private BigDecimal bonusAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cash_amount")
    
    private BigDecimal cashAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private Integer chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    private String cloudServiceType;


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
    @JsonProperty(value="cycle")
    
    private String cycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="debt_amount")
    
    private BigDecimal debtAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_amount")
    
    private BigDecimal discountAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_name")
    
    private String enterpriseProjectName;


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
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="res_instance_id")
    
    private String resInstanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_Type_code")
    
    private String resourceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_tag")
    
    private String resourceTag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stored_card_amount")
    
    private BigDecimal storedCardAmount = null;

    public MonthlyBillRes withAdjustmentAmount(BigDecimal adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
        return this;
    }

    


    /**
     * |参数名称：欠费核销金额| |参数的约束及描述：该参数非必填。|
     * @return adjustmentAmount
     */
    public BigDecimal getAdjustmentAmount() {
        return adjustmentAmount;
    }

    public void setAdjustmentAmount(BigDecimal adjustmentAmount) {
        this.adjustmentAmount = adjustmentAmount;
    }

    public MonthlyBillRes withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * |参数名称：账单类型| |参数的约束及描述：该参数非必填，1：消费-新购；2：消费-续订；3：消费-变更；4：退款-退订；5：消费-使用；8：消费-自动续订；9：调账-补偿；12：消费-按时计费；13：消费-退订手续费；14：消费-服务支持计划月末扣费；16：调账-扣费|
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public MonthlyBillRes withBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
        return this;
    }

    


    /**
     * |参数名称：奖励金支付金额（用于现网未清干净的奖励金）| |参数的约束及描述：该参数非必填。|
     * @return bonusAmount
     */
    public BigDecimal getBonusAmount() {
        return bonusAmount;
    }

    public void setBonusAmount(BigDecimal bonusAmount) {
        this.bonusAmount = bonusAmount;
    }

    public MonthlyBillRes withCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }

    


    /**
     * |参数名称：现金支付金额| |参数的约束及描述：该参数非必填|
     * @return cashAmount
     */
    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public MonthlyBillRes withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * |参数名称：支付方式：1 : 包周期；3: 按需。10: 预留实例| |参数的约束及描述：该参数非必填|
     * @return chargeMode
     */
    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public MonthlyBillRes withCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
        return this;
    }

    


    /**
     * |参数名称：云服务类型编码| |参数的约束及描述：该参数非必填,，例如ECS的云服务类型编码为“hws.service.type.ec2”|
     * @return cloudServiceType
     */
    public String getCloudServiceType() {
        return cloudServiceType;
    }

    public void setCloudServiceType(String cloudServiceType) {
        this.cloudServiceType = cloudServiceType;
    }

    public MonthlyBillRes withConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }

    


    /**
     * |参数名称：客户购买云服务类型的消费金额| |参数的约束及描述：该参数非必填，包含代金券，大陆站还包含现金券，大陆站精确到小数点后8位，国际站精确到小数点后2位。|
     * @return consumeAmount
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public MonthlyBillRes withCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    


    /**
     * |参数名称：代金券支付金额| |参数的约束及描述：该参数非必填。|
     * @return couponAmount
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public MonthlyBillRes withCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    


    /**
     * |参数名称：信用额度支付金额| |参数的约束及描述：该参数非必填|
     * @return creditAmount
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public MonthlyBillRes withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    


    /**
     * |参数名称：消费月份| |参数的约束及描述：该参数非必填|
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    public MonthlyBillRes withDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    


    /**
     * |参数名称：欠费金额| |参数的约束及描述：该参数非必填。|
     * @return debtAmount
     */
    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public MonthlyBillRes withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    


    /**
     * |参数名称：对应官网价折扣金额| |参数的约束及描述：该参数非必填。|
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public MonthlyBillRes withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * |参数名称：企业项目ID| |参数的约束及描述：该参数非必填|
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
     * |参数名称：企业项目名称| |参数的约束及描述：该参数非必填|
     * @return enterpriseProjectName
     */
    public String getEnterpriseProjectName() {
        return enterpriseProjectName;
    }

    public void setEnterpriseProjectName(String enterpriseProjectName) {
        this.enterpriseProjectName = enterpriseProjectName;
    }

    public MonthlyBillRes withFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
        return this;
    }

    


    /**
     * |参数名称：现金券支付金额| |参数的约束及描述：该参数非必填。|
     * @return flexipurchaseCouponAmount
     */
    public BigDecimal getFlexipurchaseCouponAmount() {
        return flexipurchaseCouponAmount;
    }

    public void setFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
    }

    public MonthlyBillRes withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    


    /**
     * |参数名称：金额单位。枚举型1、元;2、角;3、分| |参数的约束及描述：该参数非必填|
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public MonthlyBillRes withOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
        return this;
    }

    


    /**
     * |参数名称：官网价| |参数的约束及描述：该参数非必填。|
     * @return officialAmount
     */
    public BigDecimal getOfficialAmount() {
        return officialAmount;
    }

    public void setOfficialAmount(BigDecimal officialAmount) {
        this.officialAmount = officialAmount;
    }

    public MonthlyBillRes withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * |参数名称：云服务区编码| |参数的约束及描述：该参数非必填，例如：“cn-north-1”。|
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public MonthlyBillRes withResInstanceId(String resInstanceId) {
        this.resInstanceId = resInstanceId;
        return this;
    }

    


    /**
     * |参数名称：资源实例ID| |参数的约束及描述：该参数非必填|
     * @return resInstanceId
     */
    public String getResInstanceId() {
        return resInstanceId;
    }

    public void setResInstanceId(String resInstanceId) {
        this.resInstanceId = resInstanceId;
    }

    public MonthlyBillRes withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    


    /**
     * |参数名称：资源类型编码| |参数的约束及描述：该参数非必填，例如ECS的VM为“hws.resource.type.vm”。|
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public MonthlyBillRes withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * |参数名称：资源名称| |参数的约束及描述：该参数非必填|
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
     * |参数名称：资源标签| |参数的约束及描述：该参数非必填|
     * @return resourceTag
     */
    public String getResourceTag() {
        return resourceTag;
    }

    public void setResourceTag(String resourceTag) {
        this.resourceTag = resourceTag;
    }

    public MonthlyBillRes withStoredCardAmount(BigDecimal storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
        return this;
    }

    


    /**
     * |参数名称：储值卡支付金额| |参数的约束及描述：该参数非必填。|
     * @return storedCardAmount
     */
    public BigDecimal getStoredCardAmount() {
        return storedCardAmount;
    }

    public void setStoredCardAmount(BigDecimal storedCardAmount) {
        this.storedCardAmount = storedCardAmount;
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
        return Objects.equals(this.adjustmentAmount, monthlyBillRes.adjustmentAmount) &&
            Objects.equals(this.billType, monthlyBillRes.billType) &&
            Objects.equals(this.bonusAmount, monthlyBillRes.bonusAmount) &&
            Objects.equals(this.cashAmount, monthlyBillRes.cashAmount) &&
            Objects.equals(this.chargeMode, monthlyBillRes.chargeMode) &&
            Objects.equals(this.cloudServiceType, monthlyBillRes.cloudServiceType) &&
            Objects.equals(this.consumeAmount, monthlyBillRes.consumeAmount) &&
            Objects.equals(this.couponAmount, monthlyBillRes.couponAmount) &&
            Objects.equals(this.creditAmount, monthlyBillRes.creditAmount) &&
            Objects.equals(this.cycle, monthlyBillRes.cycle) &&
            Objects.equals(this.debtAmount, monthlyBillRes.debtAmount) &&
            Objects.equals(this.discountAmount, monthlyBillRes.discountAmount) &&
            Objects.equals(this.enterpriseProjectId, monthlyBillRes.enterpriseProjectId) &&
            Objects.equals(this.enterpriseProjectName, monthlyBillRes.enterpriseProjectName) &&
            Objects.equals(this.flexipurchaseCouponAmount, monthlyBillRes.flexipurchaseCouponAmount) &&
            Objects.equals(this.measureId, monthlyBillRes.measureId) &&
            Objects.equals(this.officialAmount, monthlyBillRes.officialAmount) &&
            Objects.equals(this.region, monthlyBillRes.region) &&
            Objects.equals(this.resInstanceId, monthlyBillRes.resInstanceId) &&
            Objects.equals(this.resourceTypeCode, monthlyBillRes.resourceTypeCode) &&
            Objects.equals(this.resourceName, monthlyBillRes.resourceName) &&
            Objects.equals(this.resourceTag, monthlyBillRes.resourceTag) &&
            Objects.equals(this.storedCardAmount, monthlyBillRes.storedCardAmount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(adjustmentAmount, billType, bonusAmount, cashAmount, chargeMode, cloudServiceType, consumeAmount, couponAmount, creditAmount, cycle, debtAmount, discountAmount, enterpriseProjectId, enterpriseProjectName, flexipurchaseCouponAmount, measureId, officialAmount, region, resInstanceId, resourceTypeCode, resourceName, resourceTag, storedCardAmount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonthlyBillRes {\n");
        sb.append("    adjustmentAmount: ").append(toIndentedString(adjustmentAmount)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    bonusAmount: ").append(toIndentedString(bonusAmount)).append("\n");
        sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    consumeAmount: ").append(toIndentedString(consumeAmount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    enterpriseProjectName: ").append(toIndentedString(enterpriseProjectName)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    officialAmount: ").append(toIndentedString(officialAmount)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    resInstanceId: ").append(toIndentedString(resInstanceId)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    resourceTag: ").append(toIndentedString(resourceTag)).append("\n");
        sb.append("    storedCardAmount: ").append(toIndentedString(storedCardAmount)).append("\n");
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

