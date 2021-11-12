package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListPartnerAccountChangeRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance_type")

    private String balanceType;

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
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public ListPartnerAccountChangeRecordsRequest withBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }

    /** 账户类型。BALANCE_TYPE_DEBIT：现金账户BALANCE_TYPE_CREDIT：信用账户
     * 
     * @return balanceType */
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public ListPartnerAccountChangeRecordsRequest withTradeType(String tradeType) {
        this.tradeType = tradeType;
        return this;
    }

    /** 交易类型。RECHARGE：充值DEDEUCT：消费REFUND：退款RFROZEN：冻结TRANS：转账，余额和保证金互换（老商务模式，当前已无保证金账户）ADJUST：调账（华为核销等）BEADJUST：经销商拨款BERETRIEVE：经销商回收BEUNBIND：解绑/关联模式切换导致的回收EXPIRED：过期清零BONUSCONVERT：奖励金转换（老商务模式，当前已无奖励金账户）TRADE_MODE_TRANSFER：交易模式变更SYSTEM：系统操作（购买标销合同的伙伴涉及该模式）COUPONCANCEL：代金券回收
     * 
     * @return tradeType */
    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public ListPartnerAccountChangeRecordsRequest withTradeTimeBegin(String tradeTimeBegin) {
        this.tradeTimeBegin = tradeTimeBegin;
        return this;
    }

    /** 查询收支明细的开始日期。 说明： 东八区时间，格式为YYYY-MM-DD，如“2017-10-21”。默认值为一年前的当天日期。
     * 
     * @return tradeTimeBegin */
    public String getTradeTimeBegin() {
        return tradeTimeBegin;
    }

    public void setTradeTimeBegin(String tradeTimeBegin) {
        this.tradeTimeBegin = tradeTimeBegin;
    }

    public ListPartnerAccountChangeRecordsRequest withTradeTimeEnd(String tradeTimeEnd) {
        this.tradeTimeEnd = tradeTimeEnd;
        return this;
    }

    /** 查询收支明细的结束日期。 说明： 东八区时间，格式为YYYY-MM-DD，如“2017-12-21”。默认值为当前日期。
     * 
     * @return tradeTimeEnd */
    public String getTradeTimeEnd() {
        return tradeTimeEnd;
    }

    public void setTradeTimeEnd(String tradeTimeEnd) {
        this.tradeTimeEnd = tradeTimeEnd;
    }

    public ListPartnerAccountChangeRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 偏移量，从0开始。默认值为0。 说明： offset用于分页处理，如不涉及分页，请使用默认值0。offset表示相对于满足条件的第一个数据的偏移量。如offset =
     * 1，则返回满足条件的第二个数据至最后一个数据。例如，满足查询条件的结果共10条数据，limit取值为10，offset取值为1，则返回的数据为2~10，第一条数据不返回。 minimum: 0 maximum:
     * 2147483647
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPartnerAccountChangeRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每次查询的数量，默认值为10。 minimum: 1 maximum: 100
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPartnerAccountChangeRecordsRequest withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /** 精英服务商ID。获取方法请参见查询精英服务商列表。 说明： 华为云伙伴能力中心（一级经销商）查询精英服务商（二级经销商）的收支明细时，需携带此参数；否则只能查询自身的收支明细。
     * 
     * @return indirectPartnerId */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListPartnerAccountChangeRecordsRequest listPartnerAccountChangeRecordsRequest =
            (ListPartnerAccountChangeRecordsRequest) o;
        return Objects.equals(this.balanceType, listPartnerAccountChangeRecordsRequest.balanceType)
            && Objects.equals(this.tradeType, listPartnerAccountChangeRecordsRequest.tradeType)
            && Objects.equals(this.tradeTimeBegin, listPartnerAccountChangeRecordsRequest.tradeTimeBegin)
            && Objects.equals(this.tradeTimeEnd, listPartnerAccountChangeRecordsRequest.tradeTimeEnd)
            && Objects.equals(this.offset, listPartnerAccountChangeRecordsRequest.offset)
            && Objects.equals(this.limit, listPartnerAccountChangeRecordsRequest.limit)
            && Objects.equals(this.indirectPartnerId, listPartnerAccountChangeRecordsRequest.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(balanceType, tradeType, tradeTimeBegin, tradeTimeEnd, offset, limit, indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPartnerAccountChangeRecordsRequest {\n");
        sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
        sb.append("    tradeType: ").append(toIndentedString(tradeType)).append("\n");
        sb.append("    tradeTimeBegin: ").append(toIndentedString(tradeTimeBegin)).append("\n");
        sb.append("    tradeTimeEnd: ").append(toIndentedString(tradeTimeEnd)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
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
