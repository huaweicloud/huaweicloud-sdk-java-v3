package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class OfficialWebsiteRatingResult {

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
    @JsonProperty(value = "per_period_type")

    private Integer perPeriodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_rating_results")

    private List<ProductResult> productRatingResults = null;

    public OfficialWebsiteRatingResult withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 订单总额，即最终优惠后的订单金额(预留实例只包含预付部分)
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public OfficialWebsiteRatingResult withOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    /**
     * 官网价(预留实例只包含预付部分)
     * @return officialWebsiteAmount
     */
    public BigDecimal getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public OfficialWebsiteRatingResult withOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }

    /**
     * 订单原总额，即优惠前订单总额(预留实例只包含预付部分)
     * @return originalAmount
     */
    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public OfficialWebsiteRatingResult withOfficialWebsiteDiscountAmount(BigDecimal officialWebsiteDiscountAmount) {
        this.officialWebsiteDiscountAmount = officialWebsiteDiscountAmount;
        return this;
    }

    /**
     * 官网价优惠额(预留实例只包含预付部分)
     * @return officialWebsiteDiscountAmount
     */
    public BigDecimal getOfficialWebsiteDiscountAmount() {
        return officialWebsiteDiscountAmount;
    }

    public void setOfficialWebsiteDiscountAmount(BigDecimal officialWebsiteDiscountAmount) {
        this.officialWebsiteDiscountAmount = officialWebsiteDiscountAmount;
    }

    public OfficialWebsiteRatingResult withOptionalDiscountAmount(BigDecimal optionalDiscountAmount) {
        this.optionalDiscountAmount = optionalDiscountAmount;
        return this;
    }

    /**
     * 可选折扣优惠额(预留实例只包含预付部分)
     * @return optionalDiscountAmount
     */
    public BigDecimal getOptionalDiscountAmount() {
        return optionalDiscountAmount;
    }

    public void setOptionalDiscountAmount(BigDecimal optionalDiscountAmount) {
        this.optionalDiscountAmount = optionalDiscountAmount;
    }

    public OfficialWebsiteRatingResult withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 总优惠额(预留实例只包含预付部分)
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public OfficialWebsiteRatingResult withPerAmount(BigDecimal perAmount) {
        this.perAmount = perAmount;
        return this;
    }

    /**
     * 总分期金额(批量询价的商品分期周期类型一致，才会有总分期金额，分期周期类型不一致，该信息没有)
     * @return perAmount
     */
    public BigDecimal getPerAmount() {
        return perAmount;
    }

    public void setPerAmount(BigDecimal perAmount) {
        this.perAmount = perAmount;
    }

    public OfficialWebsiteRatingResult withPerDiscountAmount(BigDecimal perDiscountAmount) {
        this.perDiscountAmount = perDiscountAmount;
        return this;
    }

    /**
     * 总分期金额的优惠额(perDiscountAmount = perOriginalAmount - perAmount)
     * @return perDiscountAmount
     */
    public BigDecimal getPerDiscountAmount() {
        return perDiscountAmount;
    }

    public void setPerDiscountAmount(BigDecimal perDiscountAmount) {
        this.perDiscountAmount = perDiscountAmount;
    }

    public OfficialWebsiteRatingResult withPerOriginalAmount(BigDecimal perOriginalAmount) {
        this.perOriginalAmount = perOriginalAmount;
        return this;
    }

    /**
     * 总分期金额原价
     * @return perOriginalAmount
     */
    public BigDecimal getPerOriginalAmount() {
        return perOriginalAmount;
    }

    public void setPerOriginalAmount(BigDecimal perOriginalAmount) {
        this.perOriginalAmount = perOriginalAmount;
    }

    public OfficialWebsiteRatingResult withPerPeriodType(Integer perPeriodType) {
        this.perPeriodType = perPeriodType;
        return this;
    }

    /**
     * 分期周期类型 2:月 4:小时
     * @return perPeriodType
     */
    public Integer getPerPeriodType() {
        return perPeriodType;
    }

    public void setPerPeriodType(Integer perPeriodType) {
        this.perPeriodType = perPeriodType;
    }

    public OfficialWebsiteRatingResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public OfficialWebsiteRatingResult withProductRatingResults(List<ProductResult> productRatingResults) {
        this.productRatingResults = productRatingResults;
        return this;
    }

    public OfficialWebsiteRatingResult addProductRatingResultsItem(ProductResult productRatingResultsItem) {
        if (this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        this.productRatingResults.add(productRatingResultsItem);
        return this;
    }

    public OfficialWebsiteRatingResult withProductRatingResults(
        Consumer<List<ProductResult>> productRatingResultsSetter) {
        if (this.productRatingResults == null) {
            this.productRatingResults = new ArrayList<>();
        }
        productRatingResultsSetter.accept(this.productRatingResults);
        return this;
    }

    /**
     * 产品询价结果
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
        OfficialWebsiteRatingResult that = (OfficialWebsiteRatingResult) obj;
        return Objects.equals(this.amount, that.amount)
            && Objects.equals(this.officialWebsiteAmount, that.officialWebsiteAmount)
            && Objects.equals(this.originalAmount, that.originalAmount)
            && Objects.equals(this.officialWebsiteDiscountAmount, that.officialWebsiteDiscountAmount)
            && Objects.equals(this.optionalDiscountAmount, that.optionalDiscountAmount)
            && Objects.equals(this.discountAmount, that.discountAmount)
            && Objects.equals(this.perAmount, that.perAmount)
            && Objects.equals(this.perDiscountAmount, that.perDiscountAmount)
            && Objects.equals(this.perOriginalAmount, that.perOriginalAmount)
            && Objects.equals(this.perPeriodType, that.perPeriodType) && Objects.equals(this.measureId, that.measureId)
            && Objects.equals(this.productRatingResults, that.productRatingResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount,
            officialWebsiteAmount,
            originalAmount,
            officialWebsiteDiscountAmount,
            optionalDiscountAmount,
            discountAmount,
            perAmount,
            perDiscountAmount,
            perOriginalAmount,
            perPeriodType,
            measureId,
            productRatingResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfficialWebsiteRatingResult {\n");
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
        sb.append("    perPeriodType: ").append(toIndentedString(perPeriodType)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
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
