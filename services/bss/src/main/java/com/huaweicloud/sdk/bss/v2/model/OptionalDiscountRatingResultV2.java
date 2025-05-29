package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OptionalDiscountRatingResultV2
 */
public class OptionalDiscountRatingResultV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_id")

    private String discountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private String amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_amount")

    private String officialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    private String discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_type")

    private Integer discountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_name")

    private String discountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "best_offer")

    private Integer bestOffer;

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

    public OptionalDiscountRatingResultV2 withDiscountId(String discountId) {
        this.discountId = discountId;
        return this;
    }

    /**
     * |参数名称：折扣优惠ID| |参数约束及描述：折扣优惠ID|
     * @return discountId
     */
    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public OptionalDiscountRatingResultV2 withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * |参数名称：总额，即最终优惠后的金额。单位为元。amount= official_website_amount - discount_amount| |参数约束及描述：总额，即最终优惠后的金额。单位为元。amount= official_website_amount - discount_amount|
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public OptionalDiscountRatingResultV2 withOfficialWebsiteAmount(String officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    /**
     * |参数名称：官网价。单位为元| |参数约束及描述：官网价。单位为元|
     * @return officialWebsiteAmount
     */
    public String getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(String officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public OptionalDiscountRatingResultV2 withDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * |参数名称：可选折扣优惠额，如商务折扣、伙伴折扣、促销折扣和折扣券选用时的优惠额。单位为| |参数约束及描述：可选折扣优惠额，如商务折扣、伙伴折扣、促销折扣和折扣券选用时的优惠额。单位为|
     * @return discountAmount
     */
    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount;
    }

    public OptionalDiscountRatingResultV2 withDiscountType(Integer discountType) {
        this.discountType = discountType;
        return this;
    }

    /**
     * |参数名称：折扣优惠类型| |参数约束及描述：折扣优惠类型。商务授权折扣：605(华为云BE场景下的合同商务折扣)、伙伴授予折扣：606(分销商BE场景下的合同商务折扣)、伙伴设置折扣：607(合作伙伴设置折扣-折扣率)|
     * @return discountType
     */
    public Integer getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    public OptionalDiscountRatingResultV2 withDiscountName(String discountName) {
        this.discountName = discountName;
        return this;
    }

    /**
     * |参数名称：折扣名称| |参数约束及描述：折扣名称|
     * @return discountName
     */
    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public OptionalDiscountRatingResultV2 withBestOffer(Integer bestOffer) {
        this.bestOffer = bestOffer;
        return this;
    }

    /**
     * |参数名称：是否为最优折扣。0：不是最优折扣，为缺省值。1：是最优折扣最优折扣：在商务折扣、伙伴折扣中选择（优惠金额最大的折扣为最优，优惠金额相等则按此顺序排优先级），促销折扣，折扣券不参与最优折扣的计算| |参数的约束及描述：是否为最优折扣。0：不是最优折扣，为缺省值。1：是最优折扣最优折扣：在商务折扣、伙伴折扣中选择（优惠金额最大的折扣为最优，优惠金额相等则按此顺序排优先级），促销折扣，折扣券不参与最优折扣的计算|
     * @return bestOffer
     */
    public Integer getBestOffer() {
        return bestOffer;
    }

    public void setBestOffer(Integer bestOffer) {
        this.bestOffer = bestOffer;
    }

    public OptionalDiscountRatingResultV2 withInstallmentOfficialWebsiteAmount(
        String installmentOfficialWebsiteAmount) {
        this.installmentOfficialWebsiteAmount = installmentOfficialWebsiteAmount;
        return this;
    }

    /**
     * |参数名称：分期金额的官网价。单位为元| |参数约束及描述：分期金额的官网价。单位为元|
     * @return installmentOfficialWebsiteAmount
     */
    public String getInstallmentOfficialWebsiteAmount() {
        return installmentOfficialWebsiteAmount;
    }

    public void setInstallmentOfficialWebsiteAmount(String installmentOfficialWebsiteAmount) {
        this.installmentOfficialWebsiteAmount = installmentOfficialWebsiteAmount;
    }

    public OptionalDiscountRatingResultV2 withInstallmentOfficialDiscountAmount(
        String installmentOfficialDiscountAmount) {
        this.installmentOfficialDiscountAmount = installmentOfficialDiscountAmount;
        return this;
    }

    /**
     * |参数名称：分期金额的折扣价。单位为元| |参数约束及描述：分期金额的折扣价。单位为元|
     * @return installmentOfficialDiscountAmount
     */
    public String getInstallmentOfficialDiscountAmount() {
        return installmentOfficialDiscountAmount;
    }

    public void setInstallmentOfficialDiscountAmount(String installmentOfficialDiscountAmount) {
        this.installmentOfficialDiscountAmount = installmentOfficialDiscountAmount;
    }

    public OptionalDiscountRatingResultV2 withInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
        return this;
    }

    /**
     * |参数名称：分期金额的成交价。单位为元| |参数约束及描述：分期金额的成交价。单位为元|
     * @return installmentAmount
     */
    public String getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public OptionalDiscountRatingResultV2 withInstallmentPeriodType(Integer installmentPeriodType) {
        this.installmentPeriodType = installmentPeriodType;
        return this;
    }

    /**
     * |参数名称：分期付款的周期类型。2：月| |参数的约束及描述：分期付款的周期类型。2：月|
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
        OptionalDiscountRatingResultV2 that = (OptionalDiscountRatingResultV2) obj;
        return Objects.equals(this.discountId, that.discountId) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.officialWebsiteAmount, that.officialWebsiteAmount)
            && Objects.equals(this.discountAmount, that.discountAmount)
            && Objects.equals(this.discountType, that.discountType)
            && Objects.equals(this.discountName, that.discountName) && Objects.equals(this.bestOffer, that.bestOffer)
            && Objects.equals(this.installmentOfficialWebsiteAmount, that.installmentOfficialWebsiteAmount)
            && Objects.equals(this.installmentOfficialDiscountAmount, that.installmentOfficialDiscountAmount)
            && Objects.equals(this.installmentAmount, that.installmentAmount)
            && Objects.equals(this.installmentPeriodType, that.installmentPeriodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountId,
            amount,
            officialWebsiteAmount,
            discountAmount,
            discountType,
            discountName,
            bestOffer,
            installmentOfficialWebsiteAmount,
            installmentOfficialDiscountAmount,
            installmentAmount,
            installmentPeriodType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptionalDiscountRatingResultV2 {\n");
        sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
        sb.append("    discountName: ").append(toIndentedString(discountName)).append("\n");
        sb.append("    bestOffer: ").append(toIndentedString(bestOffer)).append("\n");
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
