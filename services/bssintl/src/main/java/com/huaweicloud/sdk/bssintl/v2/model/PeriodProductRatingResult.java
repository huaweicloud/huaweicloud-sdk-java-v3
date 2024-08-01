package com.huaweicloud.sdk.bssintl.v2.model;

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
     * minimum: 1
     * maximum: 2147483647
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
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
            && Objects.equals(this.measureId, that.measureId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, productId, amount, officialWebsiteAmount, discountAmount, measureId);
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
