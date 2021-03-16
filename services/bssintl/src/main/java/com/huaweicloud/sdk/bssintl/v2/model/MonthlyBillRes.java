package com.huaweicloud.sdk.bssintl.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MonthlyBillRes
 */
public class MonthlyBillRes  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cycle")
    
    private String cycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_type")
    
    private Integer billType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region_name")
    
    private String regionName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cloud_service_type")
    
    private String cloudServiceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_Type_code")
    
    private String resourceTypeCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="res_instance_id")
    
    private String resInstanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_name")
    
    private String resourceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_tag")
    
    private String resourceTag;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sku_code")
    
    private String skuCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_name")
    
    private String enterpriseProjectName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private Integer chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="consume_amount")
    
    private Double consumeAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cash_amount")
    
    private Double cashAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="credit_amount")
    
    private Double creditAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="coupon_amount")
    
    private Double couponAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flexipurchase_coupon_amount")
    
    private Double flexipurchaseCouponAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stored_card_amount")
    
    private Double storedCardAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bonus_amount")
    
    private Double bonusAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="debt_amount")
    
    private Double debtAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="adjustment_amount")
    
    private Double adjustmentAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="official_amount")
    
    private Double officialAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="discount_amount")
    
    private Double discountAmount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="measure_id")
    
    private Integer measureId;

    public MonthlyBillRes withCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }

    


    /**
     * |参数名称：消费月份| |参数的约束及描述：格式为YYYY-MM|
     * @return cycle
     */
    public String getCycle() {
        return cycle;
    }

    public void setCycle(String cycle) {
        this.cycle = cycle;
    }

    

    public MonthlyBillRes withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    


    /**
     * |参数名称：账单类型| |参数的约束及描述：该参数非必填，1：消费-新购；2：消费-续订；3：消费-变更；4：退款-退订；5：消费-使用；8：消费-自动续订；9：调账-补偿；12：消费-按时计费；13：消费-退订手续费； 15消费-税金；14：消费-服务支持计划月末扣费；16：调账-扣费 100：退款-退订税金 101：调账-补偿税金 102：调账-扣费税金|
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
     * |参数名称：消费的客户账号ID。| |参数约束及描述：如果是普通客户或者企业子客户查询消费记录，只能查询到客户自己的消费记录，且此处显示的是客户自己的客户ID; 如果是企业主查询消费记录，可以查询到企业主以及企业子客户的消费记录，此处为消费的实际客户ID。如果是企业主自己的消费记录，则为企业主ID；如果是某个企业子客户的消费记录，则此处为企业子账号ID。|
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
     * |参数名称：云服务区编码| |参数的约束及描述：该参数非必填，例如：“cn-north-1”。|
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
     * |参数名称：云服务区名称| |参数的约束及描述：云服务区名称|
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
     * |参数名称：云服务类型编码| |参数的约束及描述：该参数非必填,，例如ECS的云服务类型编码为“hws.service.type.ec2”|
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
     * |参数名称：资源类型编码| |参数的约束及描述：该参数非必填，例如ECS的VM为“hws.resource.type.vm”。|
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
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

    

    public MonthlyBillRes withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    


    /**
     * |参数名称：资源名称| |参数的约束及描述：客户在创建资源的时候，可以输入资源名称，有些资源也可以在管理资源时，修改资源名称|
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
     * |参数名称：资源标签| |参数的约束及描述：客户在创建资源的时候，可以输入资源名称，有些资源也可以在管理资源时，修改资源名称|
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
     * |参数名称：SKU编码| |参数的约束及描述：SKU（Stock Keeping Unit，库存量单元）编码，产品下的SKU分类属性|
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

    

    public MonthlyBillRes withChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * |参数名称：计费模式| |参数的约束及描述：1 : 包年/包月；3: 按需。10: 预留实例|
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
     * |参数名称：客户购买云服务类型的消费金额| |参数的约束及描述：该参数非必填，包含代金券，大陆站还包含现金券，大陆站精确到小数点后8位，国际站精确到小数点后2位。|
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
     * |参数名称：现金支付金额| |参数的约束及描述：该参数非必填|
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
     * |参数名称：信用额度支付金额| |参数的约束及描述：该参数非必填|
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
     * |参数名称：代金券支付金额| |参数的约束及描述：该参数非必填。|
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
     * |参数名称：现金券支付金额| |参数的约束及描述：该参数非必填。|
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
     * |参数名称：储值卡支付金额| |参数的约束及描述：该参数非必填。|
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
     * |参数名称：奖励金支付金额（用于现网未清干净的奖励金）| |参数的约束及描述：该参数非必填。|
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
     * |参数名称：欠费金额| |参数的约束及描述：该参数非必填。|
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
     * |参数名称：欠费核销金额| |参数的约束及描述：该参数非必填。|
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
     * |参数名称：官网价| |参数的约束及描述：该参数非必填。|
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
     * |参数名称：对应官网价折扣金额| |参数的约束及描述：该参数非必填。|
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
     * |参数名称：金额单位。1: 元| |参数的约束及描述：该参数非必填|
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
        MonthlyBillRes monthlyBillRes = (MonthlyBillRes) o;
        return Objects.equals(this.cycle, monthlyBillRes.cycle) &&
            Objects.equals(this.billType, monthlyBillRes.billType) &&
            Objects.equals(this.customerId, monthlyBillRes.customerId) &&
            Objects.equals(this.region, monthlyBillRes.region) &&
            Objects.equals(this.regionName, monthlyBillRes.regionName) &&
            Objects.equals(this.cloudServiceType, monthlyBillRes.cloudServiceType) &&
            Objects.equals(this.resourceTypeCode, monthlyBillRes.resourceTypeCode) &&
            Objects.equals(this.resInstanceId, monthlyBillRes.resInstanceId) &&
            Objects.equals(this.resourceName, monthlyBillRes.resourceName) &&
            Objects.equals(this.resourceTag, monthlyBillRes.resourceTag) &&
            Objects.equals(this.skuCode, monthlyBillRes.skuCode) &&
            Objects.equals(this.enterpriseProjectId, monthlyBillRes.enterpriseProjectId) &&
            Objects.equals(this.enterpriseProjectName, monthlyBillRes.enterpriseProjectName) &&
            Objects.equals(this.chargeMode, monthlyBillRes.chargeMode) &&
            Objects.equals(this.consumeAmount, monthlyBillRes.consumeAmount) &&
            Objects.equals(this.cashAmount, monthlyBillRes.cashAmount) &&
            Objects.equals(this.creditAmount, monthlyBillRes.creditAmount) &&
            Objects.equals(this.couponAmount, monthlyBillRes.couponAmount) &&
            Objects.equals(this.flexipurchaseCouponAmount, monthlyBillRes.flexipurchaseCouponAmount) &&
            Objects.equals(this.storedCardAmount, monthlyBillRes.storedCardAmount) &&
            Objects.equals(this.bonusAmount, monthlyBillRes.bonusAmount) &&
            Objects.equals(this.debtAmount, monthlyBillRes.debtAmount) &&
            Objects.equals(this.adjustmentAmount, monthlyBillRes.adjustmentAmount) &&
            Objects.equals(this.officialAmount, monthlyBillRes.officialAmount) &&
            Objects.equals(this.discountAmount, monthlyBillRes.discountAmount) &&
            Objects.equals(this.measureId, monthlyBillRes.measureId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cycle, billType, customerId, region, regionName, cloudServiceType, resourceTypeCode, resInstanceId, resourceName, resourceTag, skuCode, enterpriseProjectId, enterpriseProjectName, chargeMode, consumeAmount, cashAmount, creditAmount, couponAmount, flexipurchaseCouponAmount, storedCardAmount, bonusAmount, debtAmount, adjustmentAmount, officialAmount, discountAmount, measureId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonthlyBillRes {\n");
        sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    cloudServiceType: ").append(toIndentedString(cloudServiceType)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
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

