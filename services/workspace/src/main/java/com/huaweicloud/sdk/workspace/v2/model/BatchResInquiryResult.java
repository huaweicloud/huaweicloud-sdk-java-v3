package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchResInquiryResult
 */
public class BatchResInquiryResult {

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
    @JsonProperty(value = "coupon_results")

    private List<CouponUnsubscribeResult> couponResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discount_amount")

    private BigDecimal discountAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "original_amount")

    private BigDecimal originalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_params")

    private String extendParams;

    public BatchResInquiryResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID标识,同一次询价中不能重复。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchResInquiryResult withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 变更后的产品ID。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public BatchResInquiryResult withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 总额，即最终优惠后的金额(降配场景下包含退还的现金、现金券、储值卡的总额)。
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BatchResInquiryResult withCouponResults(List<CouponUnsubscribeResult> couponResults) {
        this.couponResults = couponResults;
        return this;
    }

    public BatchResInquiryResult addCouponResultsItem(CouponUnsubscribeResult couponResultsItem) {
        if (this.couponResults == null) {
            this.couponResults = new ArrayList<>();
        }
        this.couponResults.add(couponResultsItem);
        return this;
    }

    public BatchResInquiryResult withCouponResults(Consumer<List<CouponUnsubscribeResult>> couponResultsSetter) {
        if (this.couponResults == null) {
            this.couponResults = new ArrayList<>();
        }
        couponResultsSetter.accept(this.couponResults);
        return this;
    }

    /**
     * 券的退订金额（降配存在）。
     * @return couponResults
     */
    public List<CouponUnsubscribeResult> getCouponResults() {
        return couponResults;
    }

    public void setCouponResults(List<CouponUnsubscribeResult> couponResults) {
        this.couponResults = couponResults;
    }

    public BatchResInquiryResult withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 优惠额。
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BatchResInquiryResult withOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }

    /**
     * 原总额，即优惠前总额。
     * @return originalAmount
     */
    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public BatchResInquiryResult withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位标识。
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public BatchResInquiryResult withExtendParams(String extendParams) {
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
        BatchResInquiryResult that = (BatchResInquiryResult) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.productId, that.productId)
            && Objects.equals(this.amount, that.amount) && Objects.equals(this.couponResults, that.couponResults)
            && Objects.equals(this.discountAmount, that.discountAmount)
            && Objects.equals(this.originalAmount, that.originalAmount)
            && Objects.equals(this.measureId, that.measureId) && Objects.equals(this.extendParams, that.extendParams);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, productId, amount, couponResults, discountAmount, originalAmount, measureId, extendParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchResInquiryResult {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    couponResults: ").append(toIndentedString(couponResults)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
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
