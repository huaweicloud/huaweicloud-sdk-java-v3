package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 产品计算结果。
 */
public class ProductResult {

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
    @JsonProperty(value = "discount_amount")

    private BigDecimal discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_amount")

    private BigDecimal originalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_amount")

    private BigDecimal officialWebsiteAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "official_website_discount_amount")

    private BigDecimal officialWebsiteDiscountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "optional_discount_amount")

    private BigDecimal optionalDiscountAmount;

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
    @JsonProperty(value = "extend_params")

    private String extendParams;

    public ProductResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 对应请求体中的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductResult withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ProductResult withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 总额，即最终优惠后的金额(预留实例只包含预付部分)。
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public ProductResult withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 优惠额(预留实例只包含预付部分)。
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public ProductResult withOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }

    /**
     * 原总额，即优惠前总额(预留实例只包含预付部分)。
     * @return originalAmount
     */
    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public ProductResult withOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
        return this;
    }

    /**
     * 官网价（非所有接口有该字段）(预留实例只包含预付部分)。
     * @return officialWebsiteAmount
     */
    public BigDecimal getOfficialWebsiteAmount() {
        return officialWebsiteAmount;
    }

    public void setOfficialWebsiteAmount(BigDecimal officialWebsiteAmount) {
        this.officialWebsiteAmount = officialWebsiteAmount;
    }

    public ProductResult withOfficialWebsiteDiscountAmount(BigDecimal officialWebsiteDiscountAmount) {
        this.officialWebsiteDiscountAmount = officialWebsiteDiscountAmount;
        return this;
    }

    /**
     * 官网价优惠额（非所有接口有该字段）(预留实例只包含预付部分)。
     * @return officialWebsiteDiscountAmount
     */
    public BigDecimal getOfficialWebsiteDiscountAmount() {
        return officialWebsiteDiscountAmount;
    }

    public void setOfficialWebsiteDiscountAmount(BigDecimal officialWebsiteDiscountAmount) {
        this.officialWebsiteDiscountAmount = officialWebsiteDiscountAmount;
    }

    public ProductResult withOptionalDiscountAmount(BigDecimal optionalDiscountAmount) {
        this.optionalDiscountAmount = optionalDiscountAmount;
        return this;
    }

    /**
     * 可选折扣优惠额(预留实例只包含预付部分)，如商务折扣、伙伴折扣、促销折扣和折扣券选用时的优惠额（非所有接口有该字段）。
     * @return optionalDiscountAmount
     */
    public BigDecimal getOptionalDiscountAmount() {
        return optionalDiscountAmount;
    }

    public void setOptionalDiscountAmount(BigDecimal optionalDiscountAmount) {
        this.optionalDiscountAmount = optionalDiscountAmount;
    }

    public ProductResult withPerAmount(BigDecimal perAmount) {
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

    public ProductResult withPerDiscountAmount(BigDecimal perDiscountAmount) {
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

    public ProductResult withPerOriginalAmount(BigDecimal perOriginalAmount) {
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

    public ProductResult withPerOfficialWebsiteAmount(BigDecimal perOfficialWebsiteAmount) {
        this.perOfficialWebsiteAmount = perOfficialWebsiteAmount;
        return this;
    }

    /**
     * 分期金额的官网价。
     * @return perOfficialWebsiteAmount
     */
    public BigDecimal getPerOfficialWebsiteAmount() {
        return perOfficialWebsiteAmount;
    }

    public void setPerOfficialWebsiteAmount(BigDecimal perOfficialWebsiteAmount) {
        this.perOfficialWebsiteAmount = perOfficialWebsiteAmount;
    }

    public ProductResult withPerOfficialWebsiteDiscountAmount(BigDecimal perOfficialWebsiteDiscountAmount) {
        this.perOfficialWebsiteDiscountAmount = perOfficialWebsiteDiscountAmount;
        return this;
    }

    /**
     * 分期金额的官网价官网价优惠额，即：perOfficialWebsiteDiscountAmount =perOriginalAmount-perOfficialWebsiteAmount。
     * @return perOfficialWebsiteDiscountAmount
     */
    public BigDecimal getPerOfficialWebsiteDiscountAmount() {
        return perOfficialWebsiteDiscountAmount;
    }

    public void setPerOfficialWebsiteDiscountAmount(BigDecimal perOfficialWebsiteDiscountAmount) {
        this.perOfficialWebsiteDiscountAmount = perOfficialWebsiteDiscountAmount;
    }

    public ProductResult withPerOptionalDiscountAmount(BigDecimal perOptionalDiscountAmount) {
        this.perOptionalDiscountAmount = perOptionalDiscountAmount;
        return this;
    }

    /**
     * 分期金额的可选折扣优惠额，如商务折扣、伙伴折扣、促销折扣和折扣券选用时的优惠额 perOptionalDiscountAmount= perOfficialWebsiteAmount- perAmount。
     * @return perOptionalDiscountAmount
     */
    public BigDecimal getPerOptionalDiscountAmount() {
        return perOptionalDiscountAmount;
    }

    public void setPerOptionalDiscountAmount(BigDecimal perOptionalDiscountAmount) {
        this.perOptionalDiscountAmount = perOptionalDiscountAmount;
    }

    public ProductResult withPerPeriodType(Integer perPeriodType) {
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

    public ProductResult withMeasureId(Integer measureId) {
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

    public ProductResult withExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    /**
     * 扩展参数。
     * @return extendParams
     */
    public String getExtendParams() {
        return extendParams;
    }

    public void setExtendParams(String extendParams) {
        this.extendParams = extendParams;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductResult that = (ProductResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.amount, that.amount) && Objects.equals(this.discountAmount, that.discountAmount)
            && Objects.equals(this.originalAmount, that.originalAmount)
            && Objects.equals(this.officialWebsiteAmount, that.officialWebsiteAmount)
            && Objects.equals(this.officialWebsiteDiscountAmount, that.officialWebsiteDiscountAmount)
            && Objects.equals(this.optionalDiscountAmount, that.optionalDiscountAmount)
            && Objects.equals(this.perAmount, that.perAmount)
            && Objects.equals(this.perDiscountAmount, that.perDiscountAmount)
            && Objects.equals(this.perOriginalAmount, that.perOriginalAmount)
            && Objects.equals(this.perOfficialWebsiteAmount, that.perOfficialWebsiteAmount)
            && Objects.equals(this.perOfficialWebsiteDiscountAmount, that.perOfficialWebsiteDiscountAmount)
            && Objects.equals(this.perOptionalDiscountAmount, that.perOptionalDiscountAmount)
            && Objects.equals(this.perPeriodType, that.perPeriodType) && Objects.equals(this.measureId, that.measureId)
            && Objects.equals(this.extendParams, that.extendParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            productId,
            amount,
            discountAmount,
            originalAmount,
            officialWebsiteAmount,
            officialWebsiteDiscountAmount,
            optionalDiscountAmount,
            perAmount,
            perDiscountAmount,
            perOriginalAmount,
            perOfficialWebsiteAmount,
            perOfficialWebsiteDiscountAmount,
            perOptionalDiscountAmount,
            perPeriodType,
            measureId,
            extendParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
        sb.append("    officialWebsiteAmount: ").append(toIndentedString(officialWebsiteAmount)).append("\n");
        sb.append("    officialWebsiteDiscountAmount: ")
            .append(toIndentedString(officialWebsiteDiscountAmount))
            .append("\n");
        sb.append("    optionalDiscountAmount: ").append(toIndentedString(optionalDiscountAmount)).append("\n");
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
        sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
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
