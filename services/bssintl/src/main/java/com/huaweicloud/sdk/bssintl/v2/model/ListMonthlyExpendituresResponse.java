package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListMonthlyExpendituresResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_amount")

    private Double totalAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debt_amount")

    private Double debtAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_amount")

    private Double couponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cashcoupon_amount")

    private Double cashcouponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storedcard_amount")

    private Double storedcardAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debit_amount")

    private Double debitAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credit_amount")

    private Double creditAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_sums")

    private List<BillSumRecordInfo> billSums = null;

    public ListMonthlyExpendituresResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 返回码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ListMonthlyExpendituresResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 返回码描述
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ListMonthlyExpendituresResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 货币单位代码 USD：美元
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ListMonthlyExpendituresResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总条数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListMonthlyExpendituresResponse withTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    /**
     * 总金额（包含退订）。
     * @return totalAmount
     */
    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public ListMonthlyExpendituresResponse withDebtAmount(Double debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    /**
     * 总欠费金额。
     * @return debtAmount
     */
    public Double getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(Double debtAmount) {
        this.debtAmount = debtAmount;
    }

    public ListMonthlyExpendituresResponse withCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    /**
     * 代金券金额。
     * @return couponAmount
     */
    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public ListMonthlyExpendituresResponse withCashcouponAmount(Double cashcouponAmount) {
        this.cashcouponAmount = cashcouponAmount;
        return this;
    }

    /**
     * 现金券金额，预留。
     * @return cashcouponAmount
     */
    public Double getCashcouponAmount() {
        return cashcouponAmount;
    }

    public void setCashcouponAmount(Double cashcouponAmount) {
        this.cashcouponAmount = cashcouponAmount;
    }

    public ListMonthlyExpendituresResponse withStoredcardAmount(Double storedcardAmount) {
        this.storedcardAmount = storedcardAmount;
        return this;
    }

    /**
     * 储值卡金额，预留。
     * @return storedcardAmount
     */
    public Double getStoredcardAmount() {
        return storedcardAmount;
    }

    public void setStoredcardAmount(Double storedcardAmount) {
        this.storedcardAmount = storedcardAmount;
    }

    public ListMonthlyExpendituresResponse withDebitAmount(Double debitAmount) {
        this.debitAmount = debitAmount;
        return this;
    }

    /**
     * 现金账户金额。
     * @return debitAmount
     */
    public Double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(Double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public ListMonthlyExpendituresResponse withCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    /**
     * 信用账户金额。
     * @return creditAmount
     */
    public Double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public ListMonthlyExpendituresResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 金额单位。 1：元3：分 默认值为3。
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ListMonthlyExpendituresResponse withBillSums(List<BillSumRecordInfo> billSums) {
        this.billSums = billSums;
        return this;
    }

    public ListMonthlyExpendituresResponse addBillSumsItem(BillSumRecordInfo billSumsItem) {
        if (this.billSums == null) {
            this.billSums = new ArrayList<>();
        }
        this.billSums.add(billSumsItem);
        return this;
    }

    public ListMonthlyExpendituresResponse withBillSums(Consumer<List<BillSumRecordInfo>> billSumsSetter) {
        if (this.billSums == null) {
            this.billSums = new ArrayList<>();
        }
        billSumsSetter.accept(this.billSums);
        return this;
    }

    /**
     * 账单记录，具体参考表3。
     * @return billSums
     */
    public List<BillSumRecordInfo> getBillSums() {
        return billSums;
    }

    public void setBillSums(List<BillSumRecordInfo> billSums) {
        this.billSums = billSums;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMonthlyExpendituresResponse listMonthlyExpendituresResponse = (ListMonthlyExpendituresResponse) o;
        return Objects.equals(this.errorCode, listMonthlyExpendituresResponse.errorCode)
            && Objects.equals(this.errorMsg, listMonthlyExpendituresResponse.errorMsg)
            && Objects.equals(this.currency, listMonthlyExpendituresResponse.currency)
            && Objects.equals(this.totalCount, listMonthlyExpendituresResponse.totalCount)
            && Objects.equals(this.totalAmount, listMonthlyExpendituresResponse.totalAmount)
            && Objects.equals(this.debtAmount, listMonthlyExpendituresResponse.debtAmount)
            && Objects.equals(this.couponAmount, listMonthlyExpendituresResponse.couponAmount)
            && Objects.equals(this.cashcouponAmount, listMonthlyExpendituresResponse.cashcouponAmount)
            && Objects.equals(this.storedcardAmount, listMonthlyExpendituresResponse.storedcardAmount)
            && Objects.equals(this.debitAmount, listMonthlyExpendituresResponse.debitAmount)
            && Objects.equals(this.creditAmount, listMonthlyExpendituresResponse.creditAmount)
            && Objects.equals(this.measureId, listMonthlyExpendituresResponse.measureId)
            && Objects.equals(this.billSums, listMonthlyExpendituresResponse.billSums);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorCode,
            errorMsg,
            currency,
            totalCount,
            totalAmount,
            debtAmount,
            couponAmount,
            cashcouponAmount,
            storedcardAmount,
            debitAmount,
            creditAmount,
            measureId,
            billSums);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMonthlyExpendituresResponse {\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    cashcouponAmount: ").append(toIndentedString(cashcouponAmount)).append("\n");
        sb.append("    storedcardAmount: ").append(toIndentedString(storedcardAmount)).append("\n");
        sb.append("    debitAmount: ").append(toIndentedString(debitAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    billSums: ").append(toIndentedString(billSums)).append("\n");
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
