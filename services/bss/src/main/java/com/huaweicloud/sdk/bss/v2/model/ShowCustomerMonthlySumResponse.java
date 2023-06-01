package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCustomerMonthlySumResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_sums")

    private List<BillSumRecordInfoV2> billSums = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_amount")

    private BigDecimal consumeAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "debt_amount")

    private BigDecimal debtAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_amount")

    private BigDecimal couponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flexipurchase_coupon_amount")

    private BigDecimal flexipurchaseCouponAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stored_value_card_amount")

    private BigDecimal storedValueCardAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cash_amount")

    private BigDecimal cashAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credit_amount")

    private BigDecimal creditAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "writeoff_amount")

    private BigDecimal writeoffAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    public ShowCustomerMonthlySumResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总条数，必须大于等于0。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowCustomerMonthlySumResponse withBillSums(List<BillSumRecordInfoV2> billSums) {
        this.billSums = billSums;
        return this;
    }

    public ShowCustomerMonthlySumResponse addBillSumsItem(BillSumRecordInfoV2 billSumsItem) {
        if (this.billSums == null) {
            this.billSums = new ArrayList<>();
        }
        this.billSums.add(billSumsItem);
        return this;
    }

    public ShowCustomerMonthlySumResponse withBillSums(Consumer<List<BillSumRecordInfoV2>> billSumsSetter) {
        if (this.billSums == null) {
            this.billSums = new ArrayList<>();
        }
        billSumsSetter.accept(this.billSums);
        return this;
    }

    /**
     * 账单记录，具体参考表2。
     * @return billSums
     */
    public List<BillSumRecordInfoV2> getBillSums() {
        return billSums;
    }

    public void setBillSums(List<BillSumRecordInfoV2> billSums) {
        this.billSums = billSums;
    }

    public ShowCustomerMonthlySumResponse withConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }

    /**
     * 总金额（包含退订）。
     * @return consumeAmount
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public ShowCustomerMonthlySumResponse withDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
        return this;
    }

    /**
     * 总欠费金额。
     * @return debtAmount
     */
    public BigDecimal getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public ShowCustomerMonthlySumResponse withCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
        return this;
    }

    /**
     * 代金券金额。
     * @return couponAmount
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    public ShowCustomerMonthlySumResponse withFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
        return this;
    }

    /**
     * 现金券金额，预留。
     * @return flexipurchaseCouponAmount
     */
    public BigDecimal getFlexipurchaseCouponAmount() {
        return flexipurchaseCouponAmount;
    }

    public void setFlexipurchaseCouponAmount(BigDecimal flexipurchaseCouponAmount) {
        this.flexipurchaseCouponAmount = flexipurchaseCouponAmount;
    }

    public ShowCustomerMonthlySumResponse withStoredValueCardAmount(BigDecimal storedValueCardAmount) {
        this.storedValueCardAmount = storedValueCardAmount;
        return this;
    }

    /**
     * 储值卡金额，预留。
     * @return storedValueCardAmount
     */
    public BigDecimal getStoredValueCardAmount() {
        return storedValueCardAmount;
    }

    public void setStoredValueCardAmount(BigDecimal storedValueCardAmount) {
        this.storedValueCardAmount = storedValueCardAmount;
    }

    public ShowCustomerMonthlySumResponse withCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
        return this;
    }

    /**
     * 现金账户金额。
     * @return cashAmount
     */
    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public ShowCustomerMonthlySumResponse withCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    /**
     * 信用账户金额。
     * @return creditAmount
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public ShowCustomerMonthlySumResponse withWriteoffAmount(BigDecimal writeoffAmount) {
        this.writeoffAmount = writeoffAmount;
        return this;
    }

    /**
     * 欠费核销金额。
     * @return writeoffAmount
     */
    public BigDecimal getWriteoffAmount() {
        return writeoffAmount;
    }

    public void setWriteoffAmount(BigDecimal writeoffAmount) {
        this.writeoffAmount = writeoffAmount;
    }

    public ShowCustomerMonthlySumResponse withMeasureId(Integer measureId) {
        this.measureId = measureId;
        return this;
    }

    /**
     * 金额单位。 1：元
     * @return measureId
     */
    public Integer getMeasureId() {
        return measureId;
    }

    public void setMeasureId(Integer measureId) {
        this.measureId = measureId;
    }

    public ShowCustomerMonthlySumResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种。 CNY：人民币。
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCustomerMonthlySumResponse showCustomerMonthlySumResponse = (ShowCustomerMonthlySumResponse) o;
        return Objects.equals(this.totalCount, showCustomerMonthlySumResponse.totalCount)
            && Objects.equals(this.billSums, showCustomerMonthlySumResponse.billSums)
            && Objects.equals(this.consumeAmount, showCustomerMonthlySumResponse.consumeAmount)
            && Objects.equals(this.debtAmount, showCustomerMonthlySumResponse.debtAmount)
            && Objects.equals(this.couponAmount, showCustomerMonthlySumResponse.couponAmount)
            && Objects.equals(this.flexipurchaseCouponAmount, showCustomerMonthlySumResponse.flexipurchaseCouponAmount)
            && Objects.equals(this.storedValueCardAmount, showCustomerMonthlySumResponse.storedValueCardAmount)
            && Objects.equals(this.cashAmount, showCustomerMonthlySumResponse.cashAmount)
            && Objects.equals(this.creditAmount, showCustomerMonthlySumResponse.creditAmount)
            && Objects.equals(this.writeoffAmount, showCustomerMonthlySumResponse.writeoffAmount)
            && Objects.equals(this.measureId, showCustomerMonthlySumResponse.measureId)
            && Objects.equals(this.currency, showCustomerMonthlySumResponse.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount,
            billSums,
            consumeAmount,
            debtAmount,
            couponAmount,
            flexipurchaseCouponAmount,
            storedValueCardAmount,
            cashAmount,
            creditAmount,
            writeoffAmount,
            measureId,
            currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCustomerMonthlySumResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    billSums: ").append(toIndentedString(billSums)).append("\n");
        sb.append("    consumeAmount: ").append(toIndentedString(consumeAmount)).append("\n");
        sb.append("    debtAmount: ").append(toIndentedString(debtAmount)).append("\n");
        sb.append("    couponAmount: ").append(toIndentedString(couponAmount)).append("\n");
        sb.append("    flexipurchaseCouponAmount: ").append(toIndentedString(flexipurchaseCouponAmount)).append("\n");
        sb.append("    storedValueCardAmount: ").append(toIndentedString(storedValueCardAmount)).append("\n");
        sb.append("    cashAmount: ").append(toIndentedString(cashAmount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    writeoffAmount: ").append(toIndentedString(writeoffAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
