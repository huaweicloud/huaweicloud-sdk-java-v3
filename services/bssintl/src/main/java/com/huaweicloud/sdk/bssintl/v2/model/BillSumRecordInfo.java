package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BillSumRecordInfo
 */
public class BillSumRecordInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    @JacksonXmlProperty(localName = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_code")

    @JacksonXmlProperty(localName = "resource_type_code")

    private String resourceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_code")

    @JacksonXmlProperty(localName = "region_code")

    private String regionCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_code")

    @JacksonXmlProperty(localName = "cloud_service_type_code")

    private String cloudServiceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_time")

    @JacksonXmlProperty(localName = "consume_time")

    private String consumeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pay_method")

    @JacksonXmlProperty(localName = "pay_method")

    private String payMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_amount")

    @JacksonXmlProperty(localName = "consume_amount")

    private Double consumeAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debt")

    @JacksonXmlProperty(localName = "debt")

    private Double debt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount")

    @JacksonXmlProperty(localName = "discount")

    private Double discount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    @JacksonXmlProperty(localName = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_type")

    @JacksonXmlProperty(localName = "bill_type")

    private Integer billType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_details")

    @JacksonXmlProperty(localName = "account_details")

    private List<BalanceTypePay> accountDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_detail_infos")

    @JacksonXmlProperty(localName = "discount_detail_infos")

    private List<DiscountDetailInfo> discountDetailInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterpriseProjectId")

    @JacksonXmlProperty(localName = "enterpriseProjectId")

    private String enterpriseProjectId;

    public BillSumRecordInfo withCustomerId(String customerId) {
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

    public BillSumRecordInfo withResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
        return this;
    }

    /**
     * 资源类型编码，例如ECS的VM为“hws.resource.type.vm”。  说明： 当请求消息中不传递“cloud_service_type_code”参数时，此值返回“null”。
     * @return resourceTypeCode
     */
    public String getResourceTypeCode() {
        return resourceTypeCode;
    }

    public void setResourceTypeCode(String resourceTypeCode) {
        this.resourceTypeCode = resourceTypeCode;
    }

    public BillSumRecordInfo withRegionCode(String regionCode) {
        this.regionCode = regionCode;
        return this;
    }

    /**
     * 云服务区，该字段预留，先不使用。
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public BillSumRecordInfo withCloudServiceTypeCode(String cloudServiceTypeCode) {
        this.cloudServiceTypeCode = cloudServiceTypeCode;
        return this;
    }

    /**
     * 云服务类型编码，例如OBS的云服务类型编码为“hws.service.type.obs”。
     * @return cloudServiceTypeCode
     */
    public String getCloudServiceTypeCode() {
        return cloudServiceTypeCode;
    }

    public void setCloudServiceTypeCode(String cloudServiceTypeCode) {
        this.cloudServiceTypeCode = cloudServiceTypeCode;
    }

    public BillSumRecordInfo withConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
        return this;
    }

    /**
     * 消费统计的时期。 格式为YYYY-MM。 示例：2018-05
     * @return consumeTime
     */
    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    public BillSumRecordInfo withPayMethod(String payMethod) {
        this.payMethod = payMethod;
        return this;
    }

    /**
     * 消费类型。 当请求消息中不传递“cloud_service_type_code”参数时，如果此值返回“0”表示此服务类型下所有的资源类型都是包年/包月计费模式，如果此值返回空字符串表示此服务类型下有资源类型为按需计费模式。当请求消息中传递“cloud_service_type_code”参数时，如果此值返回“0”表示此资源类型是包年/包月计费模式，如果此值返回“1”表示此资源类型为按需计费模式。
     * @return payMethod
     */
    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public BillSumRecordInfo withConsumeAmount(Double consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }

    /**
     * 消费的金额，即从客户账户实际扣除的金额。包含代金券支付的金额。
     * @return consumeAmount
     */
    public Double getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(Double consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public BillSumRecordInfo withDebt(Double debt) {
        this.debt = debt;
        return this;
    }

    /**
     * 欠费金额，即从客户账户扣费的时候，客户账户金额不足，欠费的金额。
     * @return debt
     */
    public Double getDebt() {
        return debt;
    }

    public void setDebt(Double debt) {
        this.debt = debt;
    }

    public BillSumRecordInfo withDiscount(Double discount) {
        this.discount = discount;
        return this;
    }

    /**
     * 折扣金额。
     * @return discount
     */
    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public BillSumRecordInfo withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 金额单位。 1：元3：分 默认值为3。
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public BillSumRecordInfo withBillType(Integer billType) {
        this.billType = billType;
        return this;
    }

    /**
     * 账单类型。 0：消费1：退订
     * @return billType
     */
    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public BillSumRecordInfo withAccountDetails(List<BalanceTypePay> accountDetails) {
        this.accountDetails = accountDetails;
        return this;
    }

    public BillSumRecordInfo addAccountDetailsItem(BalanceTypePay accountDetailsItem) {
        if (this.accountDetails == null) {
            this.accountDetails = new ArrayList<>();
        }
        this.accountDetails.add(accountDetailsItem);
        return this;
    }

    public BillSumRecordInfo withAccountDetails(Consumer<List<BalanceTypePay>> accountDetailsSetter) {
        if (this.accountDetails == null) {
            this.accountDetails = new ArrayList<>();
        }
        accountDetailsSetter.accept(this.accountDetails);
        return this;
    }

    /**
     * 按不同账户消费类型和付费方式区分的支付总金额。 具体请参见表4。
     * @return accountDetails
     */
    public List<BalanceTypePay> getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(List<BalanceTypePay> accountDetails) {
        this.accountDetails = accountDetails;
    }

    public BillSumRecordInfo withDiscountDetailInfos(List<DiscountDetailInfo> discountDetailInfos) {
        this.discountDetailInfos = discountDetailInfos;
        return this;
    }

    public BillSumRecordInfo addDiscountDetailInfosItem(DiscountDetailInfo discountDetailInfosItem) {
        if (this.discountDetailInfos == null) {
            this.discountDetailInfos = new ArrayList<>();
        }
        this.discountDetailInfos.add(discountDetailInfosItem);
        return this;
    }

    public BillSumRecordInfo withDiscountDetailInfos(Consumer<List<DiscountDetailInfo>> discountDetailInfosSetter) {
        if (this.discountDetailInfos == null) {
            this.discountDetailInfos = new ArrayList<>();
        }
        discountDetailInfosSetter.accept(this.discountDetailInfos);
        return this;
    }

    /**
     * 折扣金额详情。 具体请参见表5。 当bill_type为1时，不返回此参数。
     * @return discountDetailInfos
     */
    public List<DiscountDetailInfo> getDiscountDetailInfos() {
        return discountDetailInfos;
    }

    public void setDiscountDetailInfos(List<DiscountDetailInfo> discountDetailInfos) {
        this.discountDetailInfos = discountDetailInfos;
    }

    public BillSumRecordInfo withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。 当请求参数中传递了“enterpriseProjectId”，响应参数“bill_sums”返回以企业项目ID为维度的账单记录。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillSumRecordInfo billSumRecordInfo = (BillSumRecordInfo) o;
        return Objects.equals(this.customerId, billSumRecordInfo.customerId)
            && Objects.equals(this.resourceTypeCode, billSumRecordInfo.resourceTypeCode)
            && Objects.equals(this.regionCode, billSumRecordInfo.regionCode)
            && Objects.equals(this.cloudServiceTypeCode, billSumRecordInfo.cloudServiceTypeCode)
            && Objects.equals(this.consumeTime, billSumRecordInfo.consumeTime)
            && Objects.equals(this.payMethod, billSumRecordInfo.payMethod)
            && Objects.equals(this.consumeAmount, billSumRecordInfo.consumeAmount)
            && Objects.equals(this.debt, billSumRecordInfo.debt)
            && Objects.equals(this.discount, billSumRecordInfo.discount)
            && Objects.equals(this.measureId, billSumRecordInfo.measureId)
            && Objects.equals(this.billType, billSumRecordInfo.billType)
            && Objects.equals(this.accountDetails, billSumRecordInfo.accountDetails)
            && Objects.equals(this.discountDetailInfos, billSumRecordInfo.discountDetailInfos)
            && Objects.equals(this.enterpriseProjectId, billSumRecordInfo.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId,
            resourceTypeCode,
            regionCode,
            cloudServiceTypeCode,
            consumeTime,
            payMethod,
            consumeAmount,
            debt,
            discount,
            measureId,
            billType,
            accountDetails,
            discountDetailInfos,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillSumRecordInfo {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    resourceTypeCode: ").append(toIndentedString(resourceTypeCode)).append("\n");
        sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
        sb.append("    cloudServiceTypeCode: ").append(toIndentedString(cloudServiceTypeCode)).append("\n");
        sb.append("    consumeTime: ").append(toIndentedString(consumeTime)).append("\n");
        sb.append("    payMethod: ").append(toIndentedString(payMethod)).append("\n");
        sb.append("    consumeAmount: ").append(toIndentedString(consumeAmount)).append("\n");
        sb.append("    debt: ").append(toIndentedString(debt)).append("\n");
        sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
        sb.append("    accountDetails: ").append(toIndentedString(accountDetails)).append("\n");
        sb.append("    discountDetailInfos: ").append(toIndentedString(discountDetailInfos)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
