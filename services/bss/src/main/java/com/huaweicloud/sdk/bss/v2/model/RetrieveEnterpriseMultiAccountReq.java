package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RetrieveEnterpriseMultiAccountReq
 */
public class RetrieveEnterpriseMultiAccountReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private String amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trans_id")

    private String transId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "balance_type")

    private String balanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    public RetrieveEnterpriseMultiAccountReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 企业子账号的客户ID。您可以调用查询企业子账号列表接口，获取响应参数“id”的返回值。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public RetrieveEnterpriseMultiAccountReq withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 总回收金额。 金额单位为货币标准单位，如人民币则单位为元。取值大于0且精确到小数点后2位。
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public RetrieveEnterpriseMultiAccountReq withTransId(String transId) {
        this.transId = transId;
        return this;
    }

    /**
     * 交易序列号，用于防止重复提交。 如果接口调用方不传，则企业管理微服务后台生成如果接口调用方传入，则请采用UUID保证全局唯一
     * @return transId
     */
    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public RetrieveEnterpriseMultiAccountReq withBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }

    /**
     * 账户类型： BALANCE_TYPE_DEBIT：余额账户（默认）BALANCE_TYPE_CREDIT：信用账户
     * @return balanceType
     */
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public RetrieveEnterpriseMultiAccountReq withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 账户到期时间，UTC时间，格式为：2016-03-28T14:45:38Z。 暂只对信用账户有效，用于限制针对有效期到期时间等于该时间的信用账户余额进行回收。如果查询信用账户可回收余额的查询结果没有失效时间，表示永久有效，对于这种账本回收的情况无需填写。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RetrieveEnterpriseMultiAccountReq retrieveEnterpriseMultiAccountReq = (RetrieveEnterpriseMultiAccountReq) o;
        return Objects.equals(this.customerId, retrieveEnterpriseMultiAccountReq.customerId)
            && Objects.equals(this.amount, retrieveEnterpriseMultiAccountReq.amount)
            && Objects.equals(this.transId, retrieveEnterpriseMultiAccountReq.transId)
            && Objects.equals(this.balanceType, retrieveEnterpriseMultiAccountReq.balanceType)
            && Objects.equals(this.expireTime, retrieveEnterpriseMultiAccountReq.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, amount, transId, balanceType, expireTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetrieveEnterpriseMultiAccountReq {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
        sb.append("    balanceType: ").append(toIndentedString(balanceType)).append("\n");
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
