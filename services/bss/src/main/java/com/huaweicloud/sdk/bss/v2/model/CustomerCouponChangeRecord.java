package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CustomerCouponChangeRecord
 */
public class CustomerCouponChangeRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coupon_id")

    private String couponId;

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
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_service_type_name")

    private String cloudServiceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type_name")

    private String resourceTypeName;

    public CustomerCouponChangeRecord withCouponId(String couponId) {
        this.couponId = couponId;
        return this;
    }

    /**
     * |参数名称：优惠券ID| |参数约束及描述：优惠券ID，范围限制:0-64|
     * @return couponId
     */
    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public CustomerCouponChangeRecord withTradeDetailType(String tradeDetailType) {
        this.tradeDetailType = tradeDetailType;
        return this;
    }

    /**
     * |参数名称：交易详细类型| |参数约束及描述：交易详细类型，范围限制:0-128， SOURCE_OPERAIION_DEDEUCT：消费(包年/包月) SOURCE_OPERAIION_USAGE：消费(按需) SOURCE_OPERAIION_SAVINGS_PLANS：消费(节省计划) SOURCE_OPERAIION_WRITEOFF：消费(欠费还款) SOURCE_OPERAIION_EXPIRECLEAR：过期清零 SOURCE_OPERAIION_UNSUBSCRIBE：退券(退订) SOURCE_OPERAIION_UNFROZEN：退券(流程中) SOURCE_OPERAIION_RFROZEN：退券(流程中) SOURCE_OPERAIION_PRIZE：激活 SOURCE_OPERAIION_BILLREFUND：调账(华为核销) SOURCE_OPERATION_COUPONCANCEL：优惠券回收 SOURCE_OPERATION_DEPOSIT_FROZEN：保证金冻结 SOURCE_OPERATION_DEPOSIT_UNFROZEN：保证金解冻 SOURCE_OPERATION_RETRIEVE：回收(企业回收) SOURCE_OPERATION_TRANSFER：划拨(企业划拨)|
     * @return tradeDetailType
     */
    public String getTradeDetailType() {
        return tradeDetailType;
    }

    public void setTradeDetailType(String tradeDetailType) {
        this.tradeDetailType = tradeDetailType;
    }

    public CustomerCouponChangeRecord withTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    /**
     * |参数名称：交易时间| |参数约束及描述：交易时间，UTC时间，格式：yyyy-MM-ddTHH:mm:ssZ|
     * @return tradeTime
     */
    public String getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(String tradeTime) {
        this.tradeTime = tradeTime;
    }

    public CustomerCouponChangeRecord withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /**
     * |参数名称：交易ID/订单ID| |参数约束及描述：交易ID/订单ID，范围限制：0-128|
     * @return tradeId
     */
    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public CustomerCouponChangeRecord withChangeAmount(String changeAmount) {
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

    public CustomerCouponChangeRecord withBalanceAfterChange(String balanceAfterChange) {
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

    public CustomerCouponChangeRecord withRevenueExpenseType(String revenueExpenseType) {
        this.revenueExpenseType = revenueExpenseType;
        return this;
    }

    /**
     * |参数名称：收支类型| |参数约束及描述：收支类型。REVENUE：收入 EXPENSE：支出|
     * @return revenueExpenseType
     */
    public String getRevenueExpenseType() {
        return revenueExpenseType;
    }

    public void setRevenueExpenseType(String revenueExpenseType) {
        this.revenueExpenseType = revenueExpenseType;
    }

    public CustomerCouponChangeRecord withBillCycle(String billCycle) {
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

    public CustomerCouponChangeRecord withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * |参数名称：账号名称| |参数约束及描述：账号名称，范围限制：0-128|
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public CustomerCouponChangeRecord withCloudServiceTypeName(String cloudServiceTypeName) {
        this.cloudServiceTypeName = cloudServiceTypeName;
        return this;
    }

    /**
     * |参数名称：云服务类型名称| |参数约束及描述：产品的云服务名称，范围限制：0-200|
     * @return cloudServiceTypeName
     */
    public String getCloudServiceTypeName() {
        return cloudServiceTypeName;
    }

    public void setCloudServiceTypeName(String cloudServiceTypeName) {
        this.cloudServiceTypeName = cloudServiceTypeName;
    }

    public CustomerCouponChangeRecord withResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
        return this;
    }

    /**
     * |参数名称：资源类型名称| |参数约束及描述：产品的资源类型名称，范围限制：0-200|
     * @return resourceTypeName
     */
    public String getResourceTypeName() {
        return resourceTypeName;
    }

    public void setResourceTypeName(String resourceTypeName) {
        this.resourceTypeName = resourceTypeName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomerCouponChangeRecord that = (CustomerCouponChangeRecord) obj;
        return Objects.equals(this.couponId, that.couponId)
            && Objects.equals(this.tradeDetailType, that.tradeDetailType)
            && Objects.equals(this.tradeTime, that.tradeTime) && Objects.equals(this.tradeId, that.tradeId)
            && Objects.equals(this.changeAmount, that.changeAmount)
            && Objects.equals(this.balanceAfterChange, that.balanceAfterChange)
            && Objects.equals(this.revenueExpenseType, that.revenueExpenseType)
            && Objects.equals(this.billCycle, that.billCycle) && Objects.equals(this.accountName, that.accountName)
            && Objects.equals(this.cloudServiceTypeName, that.cloudServiceTypeName)
            && Objects.equals(this.resourceTypeName, that.resourceTypeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId,
            tradeDetailType,
            tradeTime,
            tradeId,
            changeAmount,
            balanceAfterChange,
            revenueExpenseType,
            billCycle,
            accountName,
            cloudServiceTypeName,
            resourceTypeName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerCouponChangeRecord {\n");
        sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
        sb.append("    tradeDetailType: ").append(toIndentedString(tradeDetailType)).append("\n");
        sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
        sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("    changeAmount: ").append(toIndentedString(changeAmount)).append("\n");
        sb.append("    balanceAfterChange: ").append(toIndentedString(balanceAfterChange)).append("\n");
        sb.append("    revenueExpenseType: ").append(toIndentedString(revenueExpenseType)).append("\n");
        sb.append("    billCycle: ").append(toIndentedString(billCycle)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    cloudServiceTypeName: ").append(toIndentedString(cloudServiceTypeName)).append("\n");
        sb.append("    resourceTypeName: ").append(toIndentedString(resourceTypeName)).append("\n");
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
