package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCustomerAccountChangeRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance_type")

    private String balanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revenue_expense_type")

    private String revenueExpenseType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_type")

    private String tradeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_time_begin")

    private String tradeTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_time_end")

    private String tradeTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_channel_id")

    private String paymentChannelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "payment_channel_no")

    private String paymentChannelNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListCustomerAccountChangeRecordsRequest withBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }

    /**
     * |参数名称：账户类型。BALANCE_TYPE_DEBIT：现金账户BALANCE_TYPE_CREDIT：信用账户| |参数的约束及描述：必填|
     * @return balanceType
     */
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public ListCustomerAccountChangeRecordsRequest withRevenueExpenseType(String revenueExpenseType) {
        this.revenueExpenseType = revenueExpenseType;
        return this;
    }

    /**
     * |参数名称：收支类型。REVENUE：收入EXPENSE：支出| |参数的约束及描述：非必填|
     * @return revenueExpenseType
     */
    public String getRevenueExpenseType() {
        return revenueExpenseType;
    }

    public void setRevenueExpenseType(String revenueExpenseType) {
        this.revenueExpenseType = revenueExpenseType;
    }

    public ListCustomerAccountChangeRecordsRequest withTradeType(String tradeType) {
        this.tradeType = tradeType;
        return this;
    }

    /**
     * |参数名称：交易类型。RECHARGE：充值DEDEUCT：消费REFUND：退款RFROZEN：冻结TRANS：转账，余额和保证金互换（老商务模式，当前已无保证金账户）ADJUST：调账（华为核销等）BEADJUST：经销商拨款BERETRIEVE：经销商回收BEUNBIND：解绑/关联模式切换导致的回收EXPIRED：过期清零BONUSCONVERT：奖励金转换（老商务模式，当前已无奖励金账户）TRADE_MODE_TRANSFER：交易模式变更DEPOSIT：保证金| |参数的约束及描述：非必填|
     * @return tradeType
     */
    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public ListCustomerAccountChangeRecordsRequest withTradeTimeBegin(String tradeTimeBegin) {
        this.tradeTimeBegin = tradeTimeBegin;
        return this;
    }

    /**
     * |参数名称：查询收支明细的开始日期| |参数的约束及描述：非必填|
     * @return tradeTimeBegin
     */
    public String getTradeTimeBegin() {
        return tradeTimeBegin;
    }

    public void setTradeTimeBegin(String tradeTimeBegin) {
        this.tradeTimeBegin = tradeTimeBegin;
    }

    public ListCustomerAccountChangeRecordsRequest withTradeTimeEnd(String tradeTimeEnd) {
        this.tradeTimeEnd = tradeTimeEnd;
        return this;
    }

    /**
     * |参数名称：查询收支明细的结束日期| |参数的约束及描述：非必填|
     * @return tradeTimeEnd
     */
    public String getTradeTimeEnd() {
        return tradeTimeEnd;
    }

    public void setTradeTimeEnd(String tradeTimeEnd) {
        this.tradeTimeEnd = tradeTimeEnd;
    }

    public ListCustomerAccountChangeRecordsRequest withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /**
     * |参数名称：交易ID/订单ID| |参数的约束及描述：非必填|
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public ListCustomerAccountChangeRecordsRequest withPaymentChannelId(String paymentChannelId) {
        this.paymentChannelId = paymentChannelId;
        return this;
    }

    /**
     * |参数名称：交易渠道。可以一次查询多个，用逗号分隔。1：支付宝2：银行转账4：支付宝/网银5：微信支付6：提现7：激励返点10：交易模式变更11：调账317：银联（统一支付平台）319：Huawei Pay320：华为支付| |参数的约束及描述：非必填|
     * @return paymentChannelId
     */
    public String getPaymentChannelId() {
        return paymentChannelId;
    }

    public void setPaymentChannelId(String paymentChannelId) {
        this.paymentChannelId = paymentChannelId;
    }

    public ListCustomerAccountChangeRecordsRequest withPaymentChannelNo(String paymentChannelNo) {
        this.paymentChannelNo = paymentChannelNo;
        return this;
    }

    /**
     * |参数名称：交易渠道流水号| |参数的约束及描述：非必填|
     * @return paymentChannelNo
     */
    public String getPaymentChannelNo() {
        return paymentChannelNo;
    }

    public void setPaymentChannelNo(String paymentChannelNo) {
        this.paymentChannelNo = paymentChannelNo;
    }

    public ListCustomerAccountChangeRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * |参数名称：偏移量| |参数的约束及描述：非必填|
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListCustomerAccountChangeRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * |参数名称：每页的显示条数| |参数的约束及描述：非必填|
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerAccountChangeRecordsRequest listCustomerAccountChangeRecordsRequest =
            (ListCustomerAccountChangeRecordsRequest) o;
        return Objects.equals(this.balanceType, listCustomerAccountChangeRecordsRequest.balanceType)
            && Objects.equals(this.revenueExpenseType, listCustomerAccountChangeRecordsRequest.revenueExpenseType)
            && Objects.equals(this.tradeType, listCustomerAccountChangeRecordsRequest.tradeType)
            && Objects.equals(this.tradeTimeBegin, listCustomerAccountChangeRecordsRequest.tradeTimeBegin)
            && Objects.equals(this.tradeTimeEnd, listCustomerAccountChangeRecordsRequest.tradeTimeEnd)
            && Objects.equals(this.tradeId, listCustomerAccountChangeRecordsRequest.tradeId)
            && Objects.equals(this.paymentChannelId, listCustomerAccountChangeRecordsRequest.paymentChannelId)
            && Objects.equals(this.paymentChannelNo, listCustomerAccountChangeRecordsRequest.paymentChannelNo)
            && Objects.equals(this.offset, listCustomerAccountChangeRecordsRequest.offset)
            && Objects.equals(this.limit, listCustomerAccountChangeRecordsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balanceType,
            revenueExpenseType,
            tradeType,
            tradeTimeBegin,
            tradeTimeEnd,
            tradeId,
            paymentChannelId,
            paymentChannelNo,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerAccountChangeRecordsRequest {\n");
        sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
        sb.append("    revenueExpenseType: ").append(toIndentedString(revenueExpenseType)).append("\n");
        sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
        sb.append("    tradeTimeBegin: ").append(toIndentedString(tradeTimeBegin)).append("\n");
        sb.append("    tradeTimeEnd: ").append(toIndentedString(tradeTimeEnd)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    paymentChannelId: ").append(toIndentedString(paymentChannelId)).append("\n");
        sb.append("    paymentChannelNo: ").append(toIndentedString(paymentChannelNo)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
