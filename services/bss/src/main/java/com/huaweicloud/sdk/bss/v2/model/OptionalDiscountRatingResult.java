package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OptionalDiscountRatingResult
 */
public class OptionalDiscountRatingResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_id")

    @JacksonXmlProperty(localName = "discount_id")

    private String discountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    @JacksonXmlProperty(localName = "amount")

    private Double amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_amount")

    @JacksonXmlProperty(localName = "official_website_amount")

    private Double officialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    @JacksonXmlProperty(localName = "discount_amount")

    private Double discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    @JacksonXmlProperty(localName = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_type")

    @JacksonXmlProperty(localName = "discount_type")

    private Integer discountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_name")

    @JacksonXmlProperty(localName = "discount_name")

    private String discountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "best_offer")

    @JacksonXmlProperty(localName = "best_offer")

    private Integer bestOffer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_rating_results")

    @JacksonXmlProperty(localName = "product_rating_results")

    private List<PeriodProductRatingResult> productRatingResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_official_website_amount")

    @JacksonXmlProperty(localName = "installment_official_website_amount")

    private String installmentOfficialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_official_discount_amount")

    @JacksonXmlProperty(localName = "installment_official_discount_amount")

    private String installmentOfficialDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_amount")

    @JacksonXmlProperty(localName = "installment_amount")

    private String installmentAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "installment_period_type")

    @JacksonXmlProperty(localName = "installment_period_type")

    private Integer installmentPeriodType;

    public OptionalDiscountRatingResult withDiscountId(String discountId) {
        this.discountId = discountId;
        return this;
    }

    /**
     * 折扣优惠ID。
     * @return discountId
     */
    public String getDiscountId() {
        return discountId;
    }

    public void setDiscountId(String discountId) {
        this.discountId = discountId;
    }

    public OptionalDiscountRatingResult withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 总额，即最终优惠后的金额。 amount= official_website_amount - discountAmount。
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public OptionalDiscountRatingResult withOfficialWebsiteAmount(Double officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    /**
     * 包年/包月产品的官网价。
     * @return officialWebsiteAmount
     */
    public Double getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(Double officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public OptionalDiscountRatingResult withDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 可选折扣优惠额，如商务折扣、伙伴折扣、促销折扣和折扣券选用时的优惠额。
     * @return discountAmount
     */
    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public OptionalDiscountRatingResult withMeasureId(Integer measureId) {
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

    public OptionalDiscountRatingResult withDiscountType(Integer discountType) {
        this.discountType = discountType;
        return this;
    }

    /**
     * 折扣优惠类型。 合同商务折扣：605：华为云BE场景下的合同商务折扣606：分销商BE场景下的合同商务折扣 伙伴授予折扣：607：合作伙伴授予折扣-折扣率
     * @return discountType
     */
    public Integer getDiscountType() {
        return discountType;
    }

    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    public OptionalDiscountRatingResult withDiscountName(String discountName) {
        this.discountName = discountName;
        return this;
    }

    /**
     * 折扣名称。
     * @return discountName
     */
    public String getDiscountName() {
        return discountName;
    }

    public void setDiscountName(String discountName) {
        this.discountName = discountName;
    }

    public OptionalDiscountRatingResult withBestOffer(Integer bestOffer) {
        this.bestOffer = bestOffer;
        return this;
    }

    /**
     * 是否为最优折扣。 0：不是最优折扣，为缺省值。1：是最优折扣最优折扣：在商务折扣、伙伴折扣中选择（优惠金额最大的折扣为最优，优惠金额相等则按此顺序排优先级），促销折扣，折扣券不参与最优折扣的计算。
     * @return bestOffer
     */
    public Integer getBestOffer() {
        return bestOffer;
    }

    public void setBestOffer(Integer bestOffer) {
        this.bestOffer = bestOffer;
    }

    public OptionalDiscountRatingResult withProductRatingResults(List<PeriodProductRatingResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
        return this;
    }

    public OptionalDiscountRatingResult addProductRatingResultsItem(
        PeriodProductRatingResult productRatingResultsItem) {
        if (this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        this.productRatingResults.add(productRatingResultsItem);
        return this;
    }

    public OptionalDiscountRatingResult withProductRatingResults(
        Consumer<List<PeriodProductRatingResult>> productRatingResultsSetter) {
        if (this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        productRatingResultsSetter.accept(this.productRatingResults);
        return this;
    }

    /**
     * 产品询价结果，具体参见表5。
     * @return productRatingResults
     */
    public List<PeriodProductRatingResult> getProductRatingResults() {
        return productRatingResults;
    }

    public void setProductRatingResults(List<PeriodProductRatingResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
    }

    public OptionalDiscountRatingResult withInstallmentOfficialWebsiteAmount(String installmentOfficialWebsiteAmount) {
        this.installmentOfficialWebsiteAmount = installmentOfficialWebsiteAmount;
        return this;
    }

    /**
     * 分期金额的官网价。  说明： 暂只支持IES产品。
     * @return installmentOfficialWebsiteAmount
     */
    public String getInstallmentOfficialWebsiteAmount() {
        return installmentOfficialWebsiteAmount;
    }

    public void setInstallmentOfficialWebsiteAmount(String installmentOfficialWebsiteAmount) {
        this.installmentOfficialWebsiteAmount = installmentOfficialWebsiteAmount;
    }

    public OptionalDiscountRatingResult withInstallmentOfficialDiscountAmount(
        String installmentOfficialDiscountAmount) {
        this.installmentOfficialDiscountAmount = installmentOfficialDiscountAmount;
        return this;
    }

    /**
     * 分期金额的折扣价。  说明： 暂只支持IES产品。
     * @return installmentOfficialDiscountAmount
     */
    public String getInstallmentOfficialDiscountAmount() {
        return installmentOfficialDiscountAmount;
    }

    public void setInstallmentOfficialDiscountAmount(String installmentOfficialDiscountAmount) {
        this.installmentOfficialDiscountAmount = installmentOfficialDiscountAmount;
    }

    public OptionalDiscountRatingResult withInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
        return this;
    }

    /**
     * 分期金额的成交价。  说明： 分期金额的成交价=分期金额的官网价-分期金额的折扣价。暂只支持IES产品。
     * @return installmentAmount
     */
    public String getInstallmentAmount() {
        return installmentAmount;
    }

    public void setInstallmentAmount(String installmentAmount) {
        this.installmentAmount = installmentAmount;
    }

    public OptionalDiscountRatingResult withInstallmentPeriodType(Integer installmentPeriodType) {
        this.installmentPeriodType = installmentPeriodType;
        return this;
    }

    /**
     * 分期付款的周期类型。 2：月  说明： 暂只支持IES产品。
     * @return installmentPeriodType
     */
    public Integer getInstallmentPeriodType() {
        return installmentPeriodType;
    }

    public void setInstallmentPeriodType(Integer installmentPeriodType) {
        this.installmentPeriodType = installmentPeriodType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OptionalDiscountRatingResult optionalDiscountRatingResult = (OptionalDiscountRatingResult) o;
        return Objects.equals(this.discountId, optionalDiscountRatingResult.discountId)
            && Objects.equals(this.amount, optionalDiscountRatingResult.amount)
            && Objects.equals(this.officialWebsiteAmount, optionalDiscountRatingResult.officialWebsiteAmount)
            && Objects.equals(this.discountAmount, optionalDiscountRatingResult.discountAmount)
            && Objects.equals(this.measureId, optionalDiscountRatingResult.measureId)
            && Objects.equals(this.discountType, optionalDiscountRatingResult.discountType)
            && Objects.equals(this.discountName, optionalDiscountRatingResult.discountName)
            && Objects.equals(this.bestOffer, optionalDiscountRatingResult.bestOffer)
            && Objects.equals(this.productRatingResults, optionalDiscountRatingResult.productRatingResults)
            && Objects.equals(this.installmentOfficialWebsiteAmount,
                optionalDiscountRatingResult.installmentOfficialWebsiteAmount)
            && Objects.equals(this.installmentOfficialDiscountAmount,
                optionalDiscountRatingResult.installmentOfficialDiscountAmount)
            && Objects.equals(this.installmentAmount, optionalDiscountRatingResult.installmentAmount)
            && Objects.equals(this.installmentPeriodType, optionalDiscountRatingResult.installmentPeriodType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountId,
            amount,
            officialWebsiteAmount,
            discountAmount,
            measureId,
            discountType,
            discountName,
            bestOffer,
            productRatingResults,
            installmentOfficialWebsiteAmount,
            installmentOfficialDiscountAmount,
            installmentAmount,
            installmentPeriodType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptionalDiscountRatingResult {\n");
        sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
        sb.append("    discountName: ").append(toIndentedString(discountName)).append("\n");
        sb.append("    bestOffer: ").append(toIndentedString(bestOffer)).append("\n");
        sb.append("    productRatingResults: ").append(toIndentedString(productRatingResults)).append("\n");
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
