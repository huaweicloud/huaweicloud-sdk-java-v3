package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果。
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
    @JsonProperty(value = "original_amount")

    private BigDecimal originalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_discount_amount")

    private BigDecimal officialWebsiteDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_discount_amount")

    private BigDecimal optionalDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    private BigDecimal discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_amount")

    private BigDecimal perAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_discount_amount")

    private BigDecimal perDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_original_amount")

    private BigDecimal perOriginalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_official_website_amount")

    private BigDecimal perOfficialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_official_website_discount_amount")

    private BigDecimal perOfficialWebsiteDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_optional_discount_amount")

    private BigDecimal perOptionalDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "per_period_type")

    private Integer perPeriodType;

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
    @JsonProperty(value = "same_ratio_flag")

    private Integer sameRatioFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_ratio")

    private BigDecimal discountRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "promotion_info")

    private String promotionInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_rating_results")

    private List<ProductResult> productRatingResults = null;

    public OptionalDiscountRatingResult withDiscountId(String discountId) {
        this.discountId = discountId;
        return this;
    }

    /**
     * 折扣优惠Id。
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
     * 订单总额，即最终优惠后的订单金额(预留实例只包含预付部分)。
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
     * 官网价(预留实例只包含预付部分)。
     * @return officialWebsiteAmount
     */
    public BigDecimal getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public OptionalDiscountRatingResult withOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }

    /**
     * 订单原总额，即优惠前订单总额(预留实例只包含预付部分)。
     * @return originalAmount
     */
    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public OptionalDiscountRatingResult withOfficialWebsiteDiscountAmount(BigDecimal officialWebsiteDiscountAmount) {
        this.officialWebsiteDiscountAmount = officialWebsiteDiscountAmount;
        return this;
    }

    /**
     * 官网价优惠额(预留实例只包含预付部分)。
     * @return officialWebsiteDiscountAmount
     */
    public BigDecimal getOfficialWebsiteDiscountAmount() {
        return officialWebsiteDiscountAmount;
    }

    public void setOfficialWebsiteDiscountAmount(BigDecimal officialWebsiteDiscountAmount) {
        this.officialWebsiteDiscountAmount = officialWebsiteDiscountAmount;
    }

    public OptionalDiscountRatingResult withOptionalDiscountAmount(BigDecimal optionalDiscountAmount) {
        this.optionalDiscountAmount = optionalDiscountAmount;
        return this;
    }

    /**
     * 可选折扣优惠额(预留实例只包含预付部分)。
     * @return optionalDiscountAmount
     */
    public BigDecimal getOptionalDiscountAmount() {
        return optionalDiscountAmount;
    }

    public void setOptionalDiscountAmount(BigDecimal optionalDiscountAmount) {
        this.optionalDiscountAmount = optionalDiscountAmount;
    }

    public OptionalDiscountRatingResult withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 总优惠额(预留实例只包含预付部分)。
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public OptionalDiscountRatingResult withPerAmount(BigDecimal perAmount) {
        this.perAmount = perAmount;
        return this;
    }

    /**
     * 总分期金额(批量询价的商品分期周期类型一致，才会有总分期金额，分期周期类型不一致，该信息没有)。
     * @return perAmount
     */
    public BigDecimal getPerAmount() {
        return perAmount;
    }

    public void setPerAmount(BigDecimal perAmount) {
        this.perAmount = perAmount;
    }

    public OptionalDiscountRatingResult withPerDiscountAmount(BigDecimal perDiscountAmount) {
        this.perDiscountAmount = perDiscountAmount;
        return this;
    }

    /**
     * 总分期金额的优惠额(perDiscountAmount = perOriginalAmount - perAmount)。
     * @return perDiscountAmount
     */
    public BigDecimal getPerDiscountAmount() {
        return perDiscountAmount;
    }

    public void setPerDiscountAmount(BigDecimal perDiscountAmount) {
        this.perDiscountAmount = perDiscountAmount;
    }

    public OptionalDiscountRatingResult withPerOriginalAmount(BigDecimal perOriginalAmount) {
        this.perOriginalAmount = perOriginalAmount;
        return this;
    }

    /**
     * 总分期金额原价。
     * @return perOriginalAmount
     */
    public BigDecimal getPerOriginalAmount() {
        return perOriginalAmount;
    }

    public void setPerOriginalAmount(BigDecimal perOriginalAmount) {
        this.perOriginalAmount = perOriginalAmount;
    }

    public OptionalDiscountRatingResult withPerOfficialWebsiteAmount(BigDecimal perOfficialWebsiteAmount) {
        this.perOfficialWebsiteAmount = perOfficialWebsiteAmount;
        return this;
    }

    /**
     * 总分期金额的官网价(批量询价的商品分期周期类型一致，才会有总分期金额的官网价，分期周期类型不一致，该信息没有)。
     * @return perOfficialWebsiteAmount
     */
    public BigDecimal getPerOfficialWebsiteAmount() {
        return perOfficialWebsiteAmount;
    }

    public void setPerOfficialWebsiteAmount(BigDecimal perOfficialWebsiteAmount) {
        this.perOfficialWebsiteAmount = perOfficialWebsiteAmount;
    }

    public OptionalDiscountRatingResult withPerOfficialWebsiteDiscountAmount(
        BigDecimal perOfficialWebsiteDiscountAmount) {
        this.perOfficialWebsiteDiscountAmount = perOfficialWebsiteDiscountAmount;
        return this;
    }

    /**
     * 总分期金额的官网价官网价优惠额，即： perOfficialWebsiteDiscountAmount =perOriginalAmount-perOfficialWebsiteAmount (批量询价的商品分期周期类型一致，才会有总分期金额的官网价，分期周期类型不一致，该信息没有)。
     * @return perOfficialWebsiteDiscountAmount
     */
    public BigDecimal getPerOfficialWebsiteDiscountAmount() {
        return perOfficialWebsiteDiscountAmount;
    }

    public void setPerOfficialWebsiteDiscountAmount(BigDecimal perOfficialWebsiteDiscountAmount) {
        this.perOfficialWebsiteDiscountAmount = perOfficialWebsiteDiscountAmount;
    }

    public OptionalDiscountRatingResult withPerOptionalDiscountAmount(BigDecimal perOptionalDiscountAmount) {
        this.perOptionalDiscountAmount = perOptionalDiscountAmount;
        return this;
    }

    /**
     * 总分期金额的可选折扣优惠额，如商务折扣、伙伴折扣、促销折扣和折扣券选用时的优惠额 perOptionalDiscountAmount= perOfficialWebsiteAmount- perAmount (批量询价的商品分期周期类型一致，才会有总分期金额的官网价，分期周期类型不一致，该信息没有)。
     * @return perOptionalDiscountAmount
     */
    public BigDecimal getPerOptionalDiscountAmount() {
        return perOptionalDiscountAmount;
    }

    public void setPerOptionalDiscountAmount(BigDecimal perOptionalDiscountAmount) {
        this.perOptionalDiscountAmount = perOptionalDiscountAmount;
    }

    public OptionalDiscountRatingResult withPerPeriodType(Integer perPeriodType) {
        this.perPeriodType = perPeriodType;
        return this;
    }

    /**
     * 分期周期类型 2:月 4:小时。
     * @return perPeriodType
     */
    public Integer getPerPeriodType() {
        return perPeriodType;
    }

    public void setPerPeriodType(Integer perPeriodType) {
        this.perPeriodType = perPeriodType;
    }

    public OptionalDiscountRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位。
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
     * 折扣优惠类型。
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
     * 是否为最优折扣0：不是最优折扣；为缺省值。1：是最优折扣；最优折扣：在商务折扣、伙伴折扣和促销折扣中选择（优惠金额相等则按此顺序排优先级），折扣券不参与最优折扣的计算。
     * @return bestOffer
     */
    public Integer getBestOffer() {
        return bestOffer;
    }

    public void setBestOffer(Integer bestOffer) {
        this.bestOffer = bestOffer;
    }

    public OptionalDiscountRatingResult withSameRatioFlag(Integer sameRatioFlag) {
        this.sameRatioFlag = sameRatioFlag;
        return this;
    }

    /**
     * sameRatioFlag。
     * @return sameRatioFlag
     */
    public Integer getSameRatioFlag() {
        return sameRatioFlag;
    }

    public void setSameRatioFlag(Integer sameRatioFlag) {
        this.sameRatioFlag = sameRatioFlag;
    }

    public OptionalDiscountRatingResult withDiscountRatio(BigDecimal discountRatio) {
        this.discountRatio = discountRatio;
        return this;
    }

    /**
     * sameRatioFlag为1时有值，表示该折扣的折扣率。
     * @return discountRatio
     */
    public BigDecimal getDiscountRatio() {
        return discountRatio;
    }

    public void setDiscountRatio(BigDecimal discountRatio) {
        this.discountRatio = discountRatio;
    }

    public OptionalDiscountRatingResult withPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
        return this;
    }

    /**
     * 折扣优惠基本信息；调用者在确定好折扣优惠后、下单时，使用此字段值，填入到订购/变更接口中的promotionInfo字段。
     * @return promotionInfo
     */
    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo;
    }

    public OptionalDiscountRatingResult withProductRatingResults(List<ProductResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
        return this;
    }

    public OptionalDiscountRatingResult addProductRatingResultsItem(ProductResult productRatingResultsItem) {
        if (this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        this.productRatingResults.add(productRatingResultsItem);
        return this;
    }

    public OptionalDiscountRatingResult withProductRatingResults(
        Consumer<List<ProductResult>> productRatingResultsSetter) {
        if (this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        productRatingResultsSetter.accept(this.productRatingResults);
        return this;
    }

    /**
     * 产品询价结果。
     * @return productRatingResults
     */
    public List<ProductResult> getProductRatingResults() {
        return productRatingResults;
    }

    public void setProductRatingResults(List<ProductResult> productRatingResults) {
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
            && Objects.equals(this.originalAmount, that.originalAmount)
            && Objects.equals(this.officialWebsiteDiscountAmount, that.officialWebsiteDiscountAmount)
            && Objects.equals(this.optionalDiscountAmount, that.optionalDiscountAmount)
            && Objects.equals(this.discountAmount, that.discountAmount)
            && Objects.equals(this.perAmount, that.perAmount)
            && Objects.equals(this.perDiscountAmount, that.perDiscountAmount)
            && Objects.equals(this.perOriginalAmount, that.perOriginalAmount)
            && Objects.equals(this.perOfficialWebsiteAmount, that.perOfficialWebsiteAmount)
            && Objects.equals(this.perOfficialWebsiteDiscountAmount, that.perOfficialWebsiteDiscountAmount)
            && Objects.equals(this.perOptionalDiscountAmount, that.perOptionalDiscountAmount)
            && Objects.equals(this.perPeriodType, that.perPeriodType) && Objects.equals(this.measureId, that.measureId)
            && Objects.equals(this.discountType, that.discountType)
            && Objects.equals(this.discountName, that.discountName) && Objects.equals(this.bestOffer, that.bestOffer)
            && Objects.equals(this.sameRatioFlag, that.sameRatioFlag)
            && Objects.equals(this.discountRatio, that.discountRatio)
            && Objects.equals(this.promotionInfo, that.promotionInfo)
            && Objects.equals(this.productRatingResults, that.productRatingResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountId,
            amount,
            officialWebsiteAmount,
            originalAmount,
            officialWebsiteDiscountAmount,
            optionalDiscountAmount,
            discountAmount,
            perAmount,
            perDiscountAmount,
            perOriginalAmount,
            perOfficialWebsiteAmount,
            perOfficialWebsiteDiscountAmount,
            perOptionalDiscountAmount,
            perPeriodType,
            measureId,
            discountType,
            discountName,
            bestOffer,
            sameRatioFlag,
            discountRatio,
            promotionInfo,
            productRatingResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OptionalDiscountRatingResult {\n");
        sb.append("    discountId: ").append(toIndentedString(discountId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
        sb.append("    officialWebsiteDiscountAmount: ")
            .append(toIndentedString(officialWebsiteDiscountAmount))
            .append("\n");
        sb.append("    optionalDiscountAmount: ").append(toIndentedString(optionalDiscountAmount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    perAmount: ").append(toIndentedString(perAmount)).append("\n");
        sb.append("    perDiscountAmount: ").append(toIndentedString(perDiscountAmount)).append("\n");
        sb.append("    perOriginalAmount: ").append(toIndentedString(perOriginalAmount)).append("\n");
        sb.append("    perOfficialWebsiteAmount: ").append(toIndentedString(perOfficialWebsiteAmount)).append("\n");
        sb.append("    perOfficialWebsiteDiscountAmount: ")
            .append(toIndentedString(perOfficialWebsiteDiscountAmount))
            .append("\n");
        sb.append("    perOptionalDiscountAmount: ").append(toIndentedString(perOptionalDiscountAmount)).append("\n");
        sb.append("    perPeriodType: ").append(toIndentedString(perPeriodType)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    discountType: ").append(toIndentedString(discountType)).append("\n");
        sb.append("    discountName: ").append(toIndentedString(discountName)).append("\n");
        sb.append("    bestOffer: ").append(toIndentedString(bestOffer)).append("\n");
        sb.append("    sameRatioFlag: ").append(toIndentedString(sameRatioFlag)).append("\n");
        sb.append("    discountRatio: ").append(toIndentedString(discountRatio)).append("\n");
        sb.append("    promotionInfo: ").append(toIndentedString(promotionInfo)).append("\n");
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
