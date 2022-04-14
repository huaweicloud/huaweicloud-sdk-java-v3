package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** BalanceTypePay */
public class BalanceTypePay {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance_type_id")

    private String balanceTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deduct_amount")

    private Double deductAmount;

    public BalanceTypePay withBalanceTypeId(String balanceTypeId) {
        this.balanceTypeId = balanceTypeId;
        return this;
    }

    /** 账户类型。
     * BALANCE_TYPE_DEBIT：现金账户BALANCE_TYPE_CREDIT：信用账户BALANCE_TYPE_BONUS：奖励账户（该账户已下线）BALANCE_TYPE_COUPON：代金券账户BALANCE_TYPE_DEBIT_RATE：折扣账户
     * 
     * @return balanceTypeId */
    public String getBalanceTypeId() {
        return balanceTypeId;
    }

    public void setBalanceTypeId(String balanceTypeId) {
        this.balanceTypeId = balanceTypeId;
    }

    public BalanceTypePay withDeductAmount(Double deductAmount) {
        this.deductAmount = deductAmount;
        return this;
    }

    /** 支出金额。 单位：分
     * 
     * @return deductAmount */
    public Double getDeductAmount() {
        return deductAmount;
    }

    public void setDeductAmount(Double deductAmount) {
        this.deductAmount = deductAmount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BalanceTypePay balanceTypePay = (BalanceTypePay) o;
        return Objects.equals(this.balanceTypeId, balanceTypePay.balanceTypeId)
            && Objects.equals(this.deductAmount, balanceTypePay.deductAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balanceTypeId, deductAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BalanceTypePay {\n");
        sb.append("    balanceTypeId: ").append(toIndentedString(balanceTypeId)).append("\n");
        sb.append("    deductAmount: ").append(toIndentedString(deductAmount)).append("\n");
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
