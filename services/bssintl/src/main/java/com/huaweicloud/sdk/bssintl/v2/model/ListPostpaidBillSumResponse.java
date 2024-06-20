package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPostpaidBillSumResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_cycle")

    private String billCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_amount_due")

    private BigDecimal initialAmountDue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "consume_amount")

    private BigDecimal consumeAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refunds")

    private BigDecimal refunds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjustments")

    private BigDecimal adjustments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tax_amount")

    private BigDecimal taxAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    public ListPostpaidBillSumResponse withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    /**
     * 账单所归属的月份。只有成功才返回这个参数。 格式：YYYY-MM
     * @return billCycle
     */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public ListPostpaidBillSumResponse withInitialAmountDue(BigDecimal initialAmountDue) {
        this.initialAmountDue = initialAmountDue;
        return this;
    }

    /**
     * 账单中的应还金额（含税）。 应还金额（包含销项税）=消费金额+退款金额+调账金额
     * @return initialAmountDue
     */
    public BigDecimal getInitialAmountDue() {
        return initialAmountDue;
    }

    public void setInitialAmountDue(BigDecimal initialAmountDue) {
        this.initialAmountDue = initialAmountDue;
    }

    public ListPostpaidBillSumResponse withConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
        return this;
    }

    /**
     * 账单中的消费金额。
     * @return consumeAmount
     */
    public BigDecimal getConsumeAmount() {
        return consumeAmount;
    }

    public void setConsumeAmount(BigDecimal consumeAmount) {
        this.consumeAmount = consumeAmount;
    }

    public ListPostpaidBillSumResponse withRefunds(BigDecimal refunds) {
        this.refunds = refunds;
        return this;
    }

    /**
     * 账单中的退款金额。
     * @return refunds
     */
    public BigDecimal getRefunds() {
        return refunds;
    }

    public void setRefunds(BigDecimal refunds) {
        this.refunds = refunds;
    }

    public ListPostpaidBillSumResponse withAdjustments(BigDecimal adjustments) {
        this.adjustments = adjustments;
        return this;
    }

    /**
     * 账单中的调账金额，即伙伴在账期内的调账信息如：欠款核销金额等。
     * @return adjustments
     */
    public BigDecimal getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(BigDecimal adjustments) {
        this.adjustments = adjustments;
    }

    public ListPostpaidBillSumResponse withTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
        return this;
    }

    /**
     * 账单中的销项税金额，销项税不计入应还金额。
     * @return taxAmount
     */
    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public ListPostpaidBillSumResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 只有成功才返回这个参数。 美金：USD
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPostpaidBillSumResponse that = (ListPostpaidBillSumResponse) obj;
        return Objects.equals(this.billCycle, that.billCycle)
            && Objects.equals(this.initialAmountDue, that.initialAmountDue)
            && Objects.equals(this.consumeAmount, that.consumeAmount) && Objects.equals(this.refunds, that.refunds)
            && Objects.equals(this.adjustments, that.adjustments) && Objects.equals(this.taxAmount, that.taxAmount)
            && Objects.equals(this.currency, that.currency);
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
