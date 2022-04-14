package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ListPostpaidBillSumResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_cycle")

    private String billCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_amount_due")

    private Double initialAmountDue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_amount")

    private Double consumeAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refunds")

    private Double refunds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjustments")

    private Double adjustments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_amount")

    private Double taxAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    public ListPostpaidBillSumResponse withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    /** 账单所归属的月份。只有成功才返回这个参数。 格式：YYYY-MM
     * 
     * @return billCycle */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public ListPostpaidBillSumResponse withInitialAmountDue(Double initialAmountDue) {
        this.initialAmountDue = initialAmountDue;
        return this;
    }

    /** 账单中的应还金额（含税）。 应还金额（包含销项税）=消费金额+退款金额+调账金额
     * 
     * @return initialAmountDue */
    public Double getInitialAmountDue() {
        return initialAmountDue;
    }

    public void setInitialAmountDue(Double initialAmountDue) {
        this.initialAmountDue = initialAmountDue;
    }

    public ListPostpaidBillSumResponse withConsumeAmount(Double consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }

    /** 账单中的消费金额。
     * 
     * @return consumeAmount */
    public Double getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(Double consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public ListPostpaidBillSumResponse withRefunds(Double refunds) {
        this.refunds = refunds;
        return this;
    }

    /** 账单中的退款金额。
     * 
     * @return refunds */
    public Double getRefunds() {
        return refunds;
    }

    public void setRefunds(Double refunds) {
        this.refunds = refunds;
    }

    public ListPostpaidBillSumResponse withAdjustments(Double adjustments) {
        this.adjustments = adjustments;
        return this;
    }

    /** 账单中的调账金额，即伙伴在账期内的调账信息如：欠款核销金额等。
     * 
     * @return adjustments */
    public Double getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(Double adjustments) {
        this.adjustments = adjustments;
    }

    public ListPostpaidBillSumResponse withTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /** 账单中的销项税金额，销项税不计入应还金额。
     * 
     * @return taxAmount */
    public Double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public ListPostpaidBillSumResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /** 只有成功才返回这个参数。 美金：USD
     * 
     * @return currency */
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
        ListPostpaidBillSumResponse listPostpaidBillSumResponse = (ListPostpaidBillSumResponse) o;
        return Objects.equals(this.billCycle, listPostpaidBillSumResponse.billCycle)
            && Objects.equals(this.initialAmountDue, listPostpaidBillSumResponse.initialAmountDue)
            && Objects.equals(this.consumeAmount, listPostpaidBillSumResponse.consumeAmount)
            && Objects.equals(this.refunds, listPostpaidBillSumResponse.refunds)
            && Objects.equals(this.adjustments, listPostpaidBillSumResponse.adjustments)
            && Objects.equals(this.taxAmount, listPostpaidBillSumResponse.taxAmount)
            && Objects.equals(this.currency, listPostpaidBillSumResponse.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billCycle, initialAmountDue, consumeAmount, refunds, adjustments, taxAmount, currency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPostpaidBillSumResponse {\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    initialAmountDue: ").append(toIndentedString(initialAmountDue)).append("\n");
        sb.append("    consumeAmount: ").append(toIndentedString(consumeAmount)).append("\n");
        sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
        sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
        sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
