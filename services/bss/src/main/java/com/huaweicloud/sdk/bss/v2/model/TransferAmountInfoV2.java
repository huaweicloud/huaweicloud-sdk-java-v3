package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * TransferAmountInfoV2
 */
public class TransferAmountInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avail_transfer_amount")

    private BigDecimal availTransferAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "measure_id")

    private Integer measureId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "currency")

    private String currency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private BigDecimal amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "credit_amount")

    private BigDecimal creditAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    public TransferAmountInfoV2 withAvailTransferAmount(BigDecimal availTransferAmount) {
        this.availTransferAmount = availTransferAmount;
        return this;
    }

    /**
     * 可拨款的金额。
     * @return availTransferAmount
     */
    public BigDecimal getAvailTransferAmount() {
        return availTransferAmount;
    }

    public void setAvailTransferAmount(BigDecimal availTransferAmount) {
        this.availTransferAmount = availTransferAmount;
    }

    public TransferAmountInfoV2 withMeasureId(Integer measureId) {
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

    public TransferAmountInfoV2 withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 币种。 CNY：人民币
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public TransferAmountInfoV2 withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 账户余额（仅balance_type=信用账户时才有这个字段）。
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TransferAmountInfoV2 withCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
        return this;
    }

    /**
     * 信用额度（仅balance_type=信用账户时才有这个字段）。
     * @return creditAmount
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public TransferAmountInfoV2 withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 信用额度过期时间。 UTC时间，格式为：2016-03-28T14:45:38Z。 （仅balance_type=信用账户时才有这个字段）。 如果查询信用账户可拨款余额的查询结果没有失效时间，表示永久有效。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TransferAmountInfoV2 that = (TransferAmountInfoV2) obj;
        return Objects.equals(this.availTransferAmount, that.availTransferAmount)
            && Objects.equals(this.measureId, that.measureId) && Objects.equals(this.currency, that.currency)
            && Objects.equals(this.amount, that.amount) && Objects.equals(this.creditAmount, that.creditAmount)
            && Objects.equals(this.expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availTransferAmount, measureId, currency, amount, creditAmount, expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferAmountInfoV2 {\n");
        sb.append("    availTransferAmount: ").append(toIndentedString(availTransferAmount)).append("\n");
        sb.append("    measureId: ").append(toIndentedString(measureId)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    creditAmount: ").append(toIndentedString(creditAmount)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
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
