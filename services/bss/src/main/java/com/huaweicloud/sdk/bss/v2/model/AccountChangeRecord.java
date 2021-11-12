package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** AccountChangeRecord */
public class AccountChangeRecord {

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
    @JsonProperty(value = "type")

    private String type;

    public AccountChangeRecord withAccountChangeId(String accountChangeId) {
        this.accountChangeId = accountChangeId;
        return this;
    }

    /** |参数名称：收支明细流水号| |参数约束及描述：数据表主键|
     * 
     * @return accountChangeId */
    public String getAccountChangeId() {
        return accountChangeId;
    }

    public void setAccountChangeId(String accountChangeId) {
        this.accountChangeId = accountChangeId;
    }

    public AccountChangeRecord withTradeDetailType(String tradeDetailType) {
        this.tradeDetailType = tradeDetailType;
        return this;
    }

    /** 交易详细类型。
     * SOURCE_OPERAIION_ADJUST_CREDIT：调账(信用额度调整)SOURCE_OPERAIION_RECHARGE：充值SOURCE_OPERAIION_DEDEUCT：消费(包年/包月)SOURCE_OPERAIION_MANUALFROZE：冻结(人工冻结)SOURCE_OPERAIION_MANUALUNFROZE：冻结(人工解冻)SOURCE_OPERAIION_MANUALCLEARFROZEN：冻结(人工清零)SOURCE_OPERAIION_TRANS_TO_BALANCE：转账(保证金转余额)SOURCE_OPERATION_BEADJUST：伙伴拨款SOURCE_OPERATION_BEUNBIND：交易模式变更(切换/解除关联回收)SOURCE_OPERAIION_EXPIRECLEAR：过期清零SOURCE_OPERAIION_ONETIME：消费(一次性扣费)SOURCE_OPERAIION_REFUND：退款SOURCE_OPERAIION_UNFROZEN：退款(退款解冻)SOURCE_OPERAIION_CLEARFROZEN：退款(退款清零)SOURCE_OPERAIION_ADJUST：调账(余额调整)SOURCE_OPERAIION_USAGE：消费(按需)SOURCE_OPERAIION_WRITEOFF：消费(欠费还款)SOURCE_OPERAIION_UNSUBSCRIBE：退款SOURCE_OPERAIION_RFROZEN：退款(退款冻结)SOURCE_OPERAIION_TRANS_TO_FOREGIFT：转账(余额转保证金)SOURCE_OPERAIION_PRIZE：调账(赠送)SOURCE_OPERATION_BERETRIEVE：伙伴回收SOURCE_OPERAIION_PRECISIONCOMP：消费(精度补扣)SOURCE_OPERAIION_FREERESDEDUCT：消费(免费资源扣减)SOURCE_OPERAIION_MERGE：奖励金转换(合并)SOURCE_OPERAIION_CONVERT_BONUS：奖励金转换SOURCE_OPERAIION_RECHARGE_REBATE：充值(激励返点)SOURCE_OPERATION_COUPONCANCEL：优惠券回收SOURCE_OPERAIION_BILLREFUND：调账(华为核销)SOURCE_OPERATION_TRADEMODE_TRANSFER：交易模式变更(和伙伴关联)SOURCE_OPERATION_SYSTEM_FROZEN：系统冻结（购买标销合同的伙伴涉及该模式）SOURCE_OPERATION_SYSTEM_UNFROZEN：系统解冻（购买标销合同的伙伴涉及该模式）SOURCE_OPERATION_COUPON_QUOTA_TRANSFER：调账(兑换现金券额度)SOURCE_OPERATIION_RIDEDUCT：消费(预留实例)SOURCE_OPERATION_COUPON_QUOTA_RECLAIM：代金券回收
     * 
     * @return tradeDetailType */
    public String getTradeDetailType() {
        return tradeDetailType;
    }

    public void setTradeDetailType(String tradeDetailType) {
        this.tradeDetailType = tradeDetailType;
    }

    public AccountChangeRecord withTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    /** 交易时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2016-03-28T14:45:38Z”。
     * 
     * @return tradeTime */
    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public AccountChangeRecord withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /** 交易ID/订单ID。
     * 
     * @return tradeId */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public AccountChangeRecord withChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
        return this;
    }

    /** 变更金额，单位为元。
     * 
     * @return changeAmount */
    public String getChangeAmount() {
        return changeAmount;
    }

    public void setChangeAmount(String changeAmount) {
        this.changeAmount = changeAmount;
    }

    public AccountChangeRecord withBalanceAfterChange(String balanceAfterChange) {
        this.balanceAfterChange = balanceAfterChange;
        return this;
    }

    /** 变更后余额，单位 为元。
     * 
     * @return balanceAfterChange */
    public String getBalanceAfterChange() {
        return balanceAfterChange;
    }

    public void setBalanceAfterChange(String balanceAfterChange) {
        this.balanceAfterChange = balanceAfterChange;
    }

    public AccountChangeRecord withType(String type) {
        this.type = type;
        return this;
    }

    /** 收支类型。 1：收入2：支出
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountChangeRecord accountChangeRecord = (AccountChangeRecord) o;
        return Objects.equals(this.accountChangeId, accountChangeRecord.accountChangeId)
            && Objects.equals(this.tradeDetailType, accountChangeRecord.tradeDetailType)
            && Objects.equals(this.tradeTime, accountChangeRecord.tradeTime)
            && Objects.equals(this.tradeId, accountChangeRecord.tradeId)
            && Objects.equals(this.changeAmount, accountChangeRecord.changeAmount)
            && Objects.equals(this.balanceAfterChange, accountChangeRecord.balanceAfterChange)
            && Objects.equals(this.type, accountChangeRecord.type);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(accountChangeId, tradeDetailType, tradeTime, tradeId, changeAmount, balanceAfterChange, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountChangeRecord {\n");
        sb.append("    accountChangeId: ").append(toIndentedString(accountChangeId)).append("\n");
        sb.append("    tradeDetailType: ").append(toIndentedString(tradeDetailType)).append("\n");
        sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    changeAmount: ").append(toIndentedString(changeAmount)).append("\n");
        sb.append("    balanceAfterChange: ").append(toIndentedString(balanceAfterChange)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
