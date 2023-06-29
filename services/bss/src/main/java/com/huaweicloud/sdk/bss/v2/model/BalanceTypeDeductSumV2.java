package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * BalanceTypeDeductSumV2
 */
public class BalanceTypeDeductSumV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance_type")

    private String balanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private BigDecimal amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_type")

    private String billType;

    public BalanceTypeDeductSumV2 withBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }

    /**
     * 账户类型。 BALANCE_TYPE_DEBIT：现金BALANCE_TYPE_CREDIT：信用BALANCE_TYPE_BONUS：奖励BALANCE_TYPE_COUPON：代金券BALANCE_TYPE_RCASH_COUPON 现金券。BALANCE_TYPE_STORED_VALUE_CARD：储值卡消费
     * @return balanceType
     */
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public BalanceTypeDeductSumV2 withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 金额。 对于billType=1或者2的账单，该金额为负值。
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BalanceTypeDeductSumV2 withBillType(String billType) {
        this.billType = billType;
        return this;
    }

    /**
     * 账单类型。 0：正常1：退订2：华为核销
     * @return billType
     */
    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BalanceTypeDeductSumV2 that = (BalanceTypeDeductSumV2) obj;
        return Objects.equals(this.balanceType, that.balanceType) && Objects.equals(this.amount, that.amount)
            && Objects.equals(this.billType, that.billType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balanceType, amount, billType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BalanceTypeDeductSumV2 {\n");
        sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    billType: ").append(toIndentedString(billType)).append("\n");
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
