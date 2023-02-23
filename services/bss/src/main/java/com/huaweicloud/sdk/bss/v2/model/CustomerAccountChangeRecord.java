package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomerAccountChangeRecord
 */
public class CustomerAccountChangeRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_change_id")

    private String accountChangeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_detail_type")

    private String tradeDetailType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_time")

    private String tradeTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "change_amount")

    private String changeAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance_after_change")

    private String balanceAfterChange;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revenue_expense_type")

    private String revenueExpenseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bill_cycle")

    private String billCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_channel_id")

    private String paymentChannelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_channel_no")

    private String paymentChannelNo;

    public CustomerAccountChangeRecord withAccountChangeId(String accountChangeId) {
        this.accountChangeId = accountChangeId;
        return this;
    }

    /**
     * |参数名称：收支明细流水号| |参数约束及描述：收支明细流水号|
     * @return accountChangeId
     */
    public String getAccountChangeId() {
        return accountChangeId;
    }

    public void setAccountChangeId(String accountChangeId) {
        this.accountChangeId = accountChangeId;
    }

    public CustomerAccountChangeRecord withTradeDetailType(String tradeDetailType) {
        this.tradeDetailType = tradeDetailType;
        return this;
    }

    /**
     * |参数名称：交易详细类型| |参数约束及描述：交易详细类型|
     * @return tradeDetailType
     */
    public String getTradeDetailType() {
        return tradeDetailType;
    }

    public void setTradeDetailType(String tradeDetailType) {
        this.tradeDetailType = tradeDetailType;
    }

    public CustomerAccountChangeRecord withTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    /**
     * |参数名称：交易时间| |参数约束及描述：交易时间|
     * @return tradeTime
     */
    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public CustomerAccountChangeRecord withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /**
     * |参数名称：交易ID/订单ID| |参数约束及描述：交易ID/订单ID|
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public CustomerAccountChangeRecord withChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
        return this;
    }

    /**
     * |参数名称：变更金额| |参数约束及描述：变更金额|
     * @return changeAmount
     */
    public String getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    public CustomerAccountChangeRecord withBalanceAfterChange(String balanceAfterChange) {
        this.balanceAfterChange = balanceAfterChange;
        return this;
    }

    /**
     * |参数名称：变更后余额| |参数约束及描述：变更后余额|
     * @return balanceAfterChange
     */
    public String getBalanceAfterChange() {
        return balanceAfterChange;
    }

    public void setBalanceAfterChange(String balanceAfterChange) {
        this.balanceAfterChange = balanceAfterChange;
    }

    public CustomerAccountChangeRecord withRevenueExpenseType(String revenueExpenseType) {
        this.revenueExpenseType = revenueExpenseType;
        return this;
    }

    /**
     * |参数名称：收支类型| |参数约束及描述：收支类型|
     * @return revenueExpenseType
     */
    public String getRevenueExpenseType() {
        return revenueExpenseType;
    }

    public void setRevenueExpenseType(String revenueExpenseType) {
        this.revenueExpenseType = revenueExpenseType;
    }

    public CustomerAccountChangeRecord withBillCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    /**
     * |参数名称：账期| |参数约束及描述：账期|
     * @return billCycle
     */
    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public CustomerAccountChangeRecord withPaymentChannelId(String paymentChannelId) {
        this.paymentChannelId = paymentChannelId;
        return this;
    }

    /**
     * |参数名称：交易渠道| |参数约束及描述：交易渠道|
     * @return paymentChannelId
     */
    public String getPaymentChannelId() {
        return paymentChannelId;
    }

    public void setPaymentChannelId(String paymentChannelId) {
        this.paymentChannelId = paymentChannelId;
    }

    public CustomerAccountChangeRecord withPaymentChannelNo(String paymentChannelNo) {
        this.paymentChannelNo = paymentChannelNo;
        return this;
    }

    /**
     * |参数名称：交易渠道流水号| |参数约束及描述：交易渠道流水号|
     * @return paymentChannelNo
     */
    public String getPaymentChannelNo() {
        return paymentChannelNo;
    }

    public void setPaymentChannelNo(String paymentChannelNo) {
        this.paymentChannelNo = paymentChannelNo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CustomerAccountChangeRecord customerAccountChangeRecord = (CustomerAccountChangeRecord) o;
        return Objects.equals(this.accountChangeId, customerAccountChangeRecord.accountChangeId)
            && Objects.equals(this.tradeDetailType, customerAccountChangeRecord.tradeDetailType)
            && Objects.equals(this.tradeTime, customerAccountChangeRecord.tradeTime)
            && Objects.equals(this.tradeId, customerAccountChangeRecord.tradeId)
            && Objects.equals(this.changeAmount, customerAccountChangeRecord.changeAmount)
            && Objects.equals(this.balanceAfterChange, customerAccountChangeRecord.balanceAfterChange)
            && Objects.equals(this.revenueExpenseType, customerAccountChangeRecord.revenueExpenseType)
            && Objects.equals(this.billCycle, customerAccountChangeRecord.billCycle)
            && Objects.equals(this.paymentChannelId, customerAccountChangeRecord.paymentChannelId)
            && Objects.equals(this.paymentChannelNo, customerAccountChangeRecord.paymentChannelNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountChangeId,
            tradeDetailType,
            tradeTime,
            tradeId,
            changeAmount,
            balanceAfterChange,
            revenueExpenseType,
            billCycle,
            paymentChannelId,
            paymentChannelNo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerAccountChangeRecord {\n");
        sb.append("    accountChangeId: ").append(toIndentedString(accountChangeId)).append("\n");
        sb.append("    tradeDetailType: ").append(toIndentedString(tradeDetailType)).append("\n");
        sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    changeAmount: ").append(toIndentedString(changeAmount)).append("\n");
        sb.append("    balanceAfterChange: ").append(toIndentedString(balanceAfterChange)).append("\n");
        sb.append("    revenueExpenseType: ").append(toIndentedString(revenueExpenseType)).append("\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    paymentChannelId: ").append(toIndentedString(paymentChannelId)).append("\n");
        sb.append("    paymentChannelNo: ").append(toIndentedString(paymentChannelNo)).append("\n");
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
