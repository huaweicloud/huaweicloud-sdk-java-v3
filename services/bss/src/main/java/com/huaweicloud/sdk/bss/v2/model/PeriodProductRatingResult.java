package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * PeriodProductRatingResult
 */
public class PeriodProductRatingResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private BigDecimal amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_amount")

    private BigDecimal officialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    private BigDecimal discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_official_website_amount")

    private String installmentOfficialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_official_discount_amount")

    private String installmentOfficialDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_amount")

    private String installmentAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_period_type")

    private Integer installmentPeriodType;

    public PeriodProductRatingResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID标识，来源于请求中的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PeriodProductRatingResult withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 包年/包月产品的ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public PeriodProductRatingResult withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 总额，即最终优惠后的金额。 amount= official_website_amount - discountAmount。
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public PeriodProductRatingResult withOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    /**
     * 包年/包月产品的官网价。
     * @return officialWebsiteAmount
     */
    public BigDecimal getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public PeriodProductRatingResult withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 可选折扣优惠额，如商务折扣、伙伴折扣、促销折扣和折扣券选用时的优惠额。
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public PeriodProductRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 价格度量单位标识。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public PeriodProductRatingResult withInstallmentOfficialWebsiteAmount(String installmentOfficialWebsiteAmount) {
        this.installmentOfficialWebsiteAmount = installmentOfficialWebsiteAmount;
        return this;
    }

    /**
     * 分期金额的官网价。  说明： 暂只支持CloudPond产品。
     * @return installmentOfficialWebsiteAmount
     */
    public String getInstallmentOfficialWebsiteAmount() {
        return installmentOfficialWebsiteAmount;
    }

    public void setInstallmentOfficialWebsiteAmount(String installmentOfficialWebsiteAmount) {
        this.installmentOfficialWebsiteAmount = installmentOfficialWebsiteAmount;
    }

    public PeriodProductRatingResult withInstallmentOfficialDiscountAmount(String installmentOfficialDiscountAmount) {
        this.installmentOfficialDiscountAmount = installmentOfficialDiscountAmount;
        return this;
    }

    /**
     * 分期金额的折扣价。  说明： 暂只支持CloudPond产品。
     * @return installmentOfficialDiscountAmount
     */
    public String getInstallmentOfficialDiscountAmount() {
        return installmentOfficialDiscountAmount;
    }

    public void setInstallmentOfficialDiscountAmount(String installmentOfficialDiscountAmount) {
        this.installmentOfficialDiscountAmount = installmentOfficialDiscountAmount;
    }

    public PeriodProductRatingResult withInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
        return this;
    }

    /**
     * 分期金额的成交价。  说明： 分期金额的成交价=分期金额的官网价-分期金额的折扣价。暂只支持CloudPond产品。
     * @return installmentAmount
     */
    public String getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public PeriodProductRatingResult withInstallmentPeriodType(Integer installmentPeriodType) {
        this.installmentPeriodType = installmentPeriodType;
        return this;
    }

    /**
     * 分期付款的周期类型。 2：月 3：年 说明： 暂只支持CloudPond产品。
     * @return installmentPeriodType
     */
    public Integer getInstallmentPeriodType() {
        return installmentPeriodType;
    }

    public void setInstallmentPeriodType(Integer installmentPeriodType) {
        this.installmentPeriodType = installmentPeriodType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeriodProductRatingResult that = (PeriodProductRatingResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.officialWebsiteAmount, that.officialWebsiteAmount)
            && Objects.equals(this.discountAmount, that.discountAmount)
            && Objects.equals(this.measureId, that.measureId)
            && Objects.equals(this.installmentOfficialWebsiteAmount, that.installmentOfficialWebsiteAmount)
            && Objects.equals(this.installmentOfficialDiscountAmount, that.installmentOfficialDiscountAmount)
            && Objects.equals(this.installmentAmount, that.installmentAmount)
            && Objects.equals(this.installmentPeriodType, that.installmentPeriodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            productId,
            amount,
            officialWebsiteAmount,
            discountAmount,
            measureId,
            installmentOfficialWebsiteAmount,
            installmentOfficialDiscountAmount,
            installmentAmount,
            installmentPeriodType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeriodProductRatingResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    installmentOfficialWebsiteAmount: ")
            .append(toIndentedString(installmentOfficialWebsiteAmount))
            .append("\n");
        sb.append("    installmentOfficialDiscountAmount: ")
            .append(toIndentedString(installmentOfficialDiscountAmount))
            .append("\n");
        sb.append("    installmentAmount: ").append(toIndentedString(installmentAmount)).append("\n");
        sb.append("    installmentPeriodType: ").append(toIndentedString(installmentPeriodType)).append("\n");
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
