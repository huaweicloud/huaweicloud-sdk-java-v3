package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchInquiryChangeRsp
 */
public class BatchInquiryChangeRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ret_code")

    private String retCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_txt")

    private String errorTxt;

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
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_rating_result")

    private List<BatchResInquiryResult> productRatingResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_params")

    private String extendParams;

    public BatchInquiryChangeRsp withRetCode(String retCode) {
        this.retCode = retCode;
        return this;
    }

    /**
     * 返回码，恒为0
     * @return retCode
     */
    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public BatchInquiryChangeRsp withErrorTxt(String errorTxt) {
        this.errorTxt = errorTxt;
        return this;
    }

    /**
     * 返回信息
     * @return errorTxt
     */
    public String getErrorTxt() {
        return errorTxt;
    }

    public void setErrorTxt(String errorTxt) {
        this.errorTxt = errorTxt;
    }

    public BatchInquiryChangeRsp withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 总额，即最终优惠后的金额(降配场景下包含退还的现金、现金券、储值卡的总额)
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BatchInquiryChangeRsp withCouponResults(List<CouponUnsubscribeResult> couponResults) {
        this.couponResults = couponResults;
        return this;
    }

    public BatchInquiryChangeRsp addCouponResultsItem(CouponUnsubscribeResult couponResultsItem) {
        if (this.couponResults == null) {
            this.couponResults = new ArrayList<>();
        }
        this.couponResults.add(couponResultsItem);
        return this;
    }

    public BatchInquiryChangeRsp withCouponResults(Consumer<List<CouponUnsubscribeResult>> couponResultsSetter) {
        if (this.couponResults == null) {
            this.couponResults = new ArrayList<>();
        }
        couponResultsSetter.accept(this.couponResults);
        return this;
    }

    /**
     * 券的退订金额（降配存在）
     * @return couponResults
     */
    public List<CouponUnsubscribeResult> getCouponResults() {
        return couponResults;
    }

    public void setCouponResults(List<CouponUnsubscribeResult> couponResults) {
        this.couponResults = couponResults;
    }

    public BatchInquiryChangeRsp withDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * 优惠额
     * @return discountAmount
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BatchInquiryChangeRsp withOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }

    /**
     * 原总额，即优惠前总额
     * @return originalAmount
     */
    public BigDecimal getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(BigDecimal originalAmount) {
        this.originalAmount = originalAmount;
    }

    public BatchInquiryChangeRsp withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 度量单位标识
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public BatchInquiryChangeRsp withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 货币单位代码（遵循ISO 4217标准）
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BatchInquiryChangeRsp withProductRatingResult(List<BatchResInquiryResult> productRatingResult) {
        this.productRatingResult = productRatingResult;
        return this;
    }

    public BatchInquiryChangeRsp addProductRatingResultItem(BatchResInquiryResult productRatingResultItem) {
        if (this.productRatingResult == null) {
            this.productRatingResult = new ArrayList<>();
        }
        this.productRatingResult.add(productRatingResultItem);
        return this;
    }

    public BatchInquiryChangeRsp withProductRatingResult(
        Consumer<List<BatchResInquiryResult>> productRatingResultSetter) {
        if (this.productRatingResult == null) {
            this.productRatingResult = new ArrayList<>();
        }
        productRatingResultSetter.accept(this.productRatingResult);
        return this;
    }

    /**
     * 批价结果
     * @return productRatingResult
     */
    public List<BatchResInquiryResult> getProductRatingResult() {
        return productRatingResult;
    }

    public void setProductRatingResult(List<BatchResInquiryResult> productRatingResult) {
        this.productRatingResult = productRatingResult;
    }

    public BatchInquiryChangeRsp withExtendParams(String extendParams) {
        this.extendParams = extendParams;
        return this;
    }

    /**
     * 扩展参数
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
        BatchInquiryChangeRsp that = (BatchInquiryChangeRsp) obj;
        return Objects.equals(this.retCode, that.retCode) && Objects.equals(this.errorTxt, that.errorTxt)
            && Objects.equals(this.amount, that.amount) && Objects.equals(this.couponResults, that.couponResults)
            && Objects.equals(this.discountAmount, that.discountAmount)
            && Objects.equals(this.originalAmount, that.originalAmount)
            && Objects.equals(this.measureId, that.measureId) && Objects.equals(this.currency, that.currency)
            && Objects.equals(this.productRatingResult, that.productRatingResult)
            && Objects.equals(this.extendParams, that.extendParams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retCode,
            errorTxt,
            amount,
            couponResults,
            discountAmount,
            originalAmount,
            measureId,
            currency,
            productRatingResult,
            extendParams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchInquiryChangeRsp {\n");
        sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
        sb.append("    errorTxt: ").append(toIndentedString(errorTxt)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    couponResults: ").append(toIndentedString(couponResults)).append("\n");
        sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
        sb.append("    originalAmount: ").append(toIndentedString(originalAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    productRatingResult: ").append(toIndentedString(productRatingResult)).append("\n");
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
