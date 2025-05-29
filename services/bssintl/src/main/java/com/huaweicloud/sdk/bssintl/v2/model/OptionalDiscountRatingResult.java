package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
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

    private String discountId;

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
    @JsonProperty(value = "discount_type")

    private Integer discountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_name")

    private String discountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "best_offer")

    private Integer bestOffer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_rating_results")

    private List<PeriodProductRatingResult> productRatingResults = null;

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

    public OptionalDiscountRatingResult withAmount(BigDecimal amount) {
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

    public OptionalDiscountRatingResult withOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
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

    public OptionalDiscountRatingResult withDiscountAmount(BigDecimal discountAmount) {
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
     * 折扣优惠类型。商务授权折扣：605(华为云BE场景下的合同商务折扣)、伙伴授予折扣：606(分销商BE场景下的合同商务折扣)、伙伴设置折扣：607(合作伙伴设置折扣-折扣率)
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OptionalDiscountRatingResult that = (OptionalDiscountRatingResult) obj;
        return Objects.equals(this.discountId, that.discountId) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.officialWebsiteAmount, that.officialWebsiteAmount)
            && Objects.equals(this.discountAmount, that.discountAmount)
            && Objects.equals(this.measureId, that.measureId) && Objects.equals(this.discountType, that.discountType)
            && Objects.equals(this.discountName, that.discountName) && Objects.equals(this.bestOffer, that.bestOffer)
            && Objects.equals(this.productRatingResults, that.productRatingResults);
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
            productRatingResults);
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
