package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListCustomerCouponChangeRecordsRequest {

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
    @JsonProperty(value = "trade_id")

    private String tradeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_time_begin")

    private String tradeTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trade_time_end")

    private String tradeTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_id")

    private String couponId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListCustomerCouponChangeRecordsRequest withBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }

    /**
     * |参数名称：账户类型| |参数的约束及描述：该参数必填，BALANCE_TYPE_COUPON：代金券账户|
     * @return balanceType
     */
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public ListCustomerCouponChangeRecordsRequest withRevenueExpenseType(String revenueExpenseType) {
        this.revenueExpenseType = revenueExpenseType;
        return this;
    }

    /**
     * |参数名称：收支类型| |参数的约束及描述：该参数非必填，REVENUE：收入 EXPENSE：支出。此参数不携带时，不作为筛选条件；此参数携带值不允许为空、空串，有枚举值校验。|
     * @return revenueExpenseType
     */
    public String getRevenueExpenseType() {
        return revenueExpenseType;
    }

    public void setRevenueExpenseType(String revenueExpenseType) {
        this.revenueExpenseType = revenueExpenseType;
    }

    public ListCustomerCouponChangeRecordsRequest withTradeType(String tradeType) {
        this.tradeType = tradeType;
        return this;
    }

    /**
     * |参数名称：交易类型| |参数的约束及描述：该参数非必填，ADJUST：激活 DEDEUCT：消费 REFUND：退券 RFROZEN：冻结 EXPIRED：过期清零 COUPONADJUST：划拨 COUPONCANCEL：回收。此参数不携带时，不作为筛选条件；此参数携带值不允许为空、空串，有枚举值校验。|
     * @return tradeType
     */
    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public ListCustomerCouponChangeRecordsRequest withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /**
     * |参数名称：交易ID/订单ID| |参数的约束及描述：该参数非必填，范围限制：0-128。此参数不携带或携带值为空时，不作为筛选条件。|
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public ListCustomerCouponChangeRecordsRequest withTradeTimeBegin(String tradeTimeBegin) {
        this.tradeTimeBegin = tradeTimeBegin;
        return this;
    }

    /**
     * |参数名称：查询收支明细的开始日期| |参数的约束及描述：该参数非必填，东八区时间，格式为YYYY-MM-DD，此参数不携带、携带值为空时，默认值为一年前的当天日期；此参数不允许携带值为空串，有参数校验。|
     * @return tradeTimeBegin
     */
    public String getTradeTimeBegin() {
        return tradeTimeBegin;
    }

    public void setTradeTimeBegin(String tradeTimeBegin) {
        this.tradeTimeBegin = tradeTimeBegin;
    }

    public ListCustomerCouponChangeRecordsRequest withTradeTimeEnd(String tradeTimeEnd) {
        this.tradeTimeEnd = tradeTimeEnd;
        return this;
    }

    /**
     * |参数名称：查询收支明细的结束日期| |参数的约束及描述：该参数非必填，东八区时间，格式为YYYY-MM-DD，此参数不携带、携带值为空时，默认值为当前日期；此参数不允许携带值为空串，有参数校验。|
     * @return tradeTimeEnd
     */
    public String getTradeTimeEnd() {
        return tradeTimeEnd;
    }

    public void setTradeTimeEnd(String tradeTimeEnd) {
        this.tradeTimeEnd = tradeTimeEnd;
    }

    public ListCustomerCouponChangeRecordsRequest withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * |参数名称：优惠券ID。| |参数的约束及描述：该参数非必填，范围限制：0-64。此参数不携带或携带值为空时，不作为筛选条件。|
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public ListCustomerCouponChangeRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * |参数名称：偏移量| |参数的约束及描述：该参数非必填，范围限制：0-2147483647，默认值为0。此参数不携带或携带值为空时，默认传参为0。|
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

    public ListCustomerCouponChangeRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * |参数名称：每次查询的数量| |参数的约束及描述：该参数非必填，范围限制：1-100，默认值为10。此参数不携带或携带值为空时，默认传参为10。|
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomerCouponChangeRecordsRequest that = (ListCustomerCouponChangeRecordsRequest) obj;
        return Objects.equals(this.balanceType, that.balanceType)
            && Objects.equals(this.revenueExpenseType, that.revenueExpenseType)
            && Objects.equals(this.tradeType, that.tradeType) && Objects.equals(this.tradeId, that.tradeId)
            && Objects.equals(this.tradeTimeBegin, that.tradeTimeBegin)
            && Objects.equals(this.tradeTimeEnd, that.tradeTimeEnd) && Objects.equals(this.couponId, that.couponId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balanceType,
            revenueExpenseType,
            tradeType,
            tradeId,
            tradeTimeBegin,
            tradeTimeEnd,
            couponId,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerCouponChangeRecordsRequest {\n");
        sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
        sb.append("    revenueExpenseType: ").append(toIndentedString(revenueExpenseType)).append("\n");
        sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    tradeTimeBegin: ").append(toIndentedString(tradeTimeBegin)).append("\n");
        sb.append("    tradeTimeEnd: ").append(toIndentedString(tradeTimeEnd)).append("\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
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
