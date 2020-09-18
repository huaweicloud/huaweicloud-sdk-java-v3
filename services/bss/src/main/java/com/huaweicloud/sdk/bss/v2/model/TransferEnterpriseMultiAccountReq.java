package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TransferEnterpriseMultiAccountReq
 */
public class TransferEnterpriseMultiAccountReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private String amount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="trans_id")
    
    private String transId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="balance_type")
    
    private String balanceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expire_time")
    
    private String expireTime;

    public TransferEnterpriseMultiAccountReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：企业子账号的客户ID。| |参数约束及描述：企业子账号的客户ID。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public TransferEnterpriseMultiAccountReq withAmount(String amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：现金账户总划拨金额。金额单位为货币标准单位，如人民币则单位为元。| |参数约束及描述：现金账户总划拨金额。金额单位为货币标准单位，如人民币则单位为元。|
     * @return amount
     */
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public TransferEnterpriseMultiAccountReq withTransId(String transId) {
        this.transId = transId;
        return this;
    }

    


    /**
     * |参数名称：交易序列号，用于防止重复提交。如果接口调用方不传此参数的值，则系统自动生成。如果接口调用方传入此参数的值，请采用UUID保证全局唯一。| |参数约束及描述：交易序列号，用于防止重复提交。如果接口调用方不传此参数的值，则系统自动生成。如果接口调用方传入此参数的值，请采用UUID保证全局唯一。|
     * @return transId
     */
    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public TransferEnterpriseMultiAccountReq withBalanceType(String balanceType) {
        this.balanceType = balanceType;
        return this;
    }

    


    /**
     * |参数名称：账户类型：BALANCE_TYPE_DEBIT：余额账户（默认）；BALANCE_TYPE_CREDIT：信用账户。| |参数约束及描述：账户类型：BALANCE_TYPE_DEBIT：余额账户（默认）；BALANCE_TYPE_CREDIT：信用账户。|
     * @return balanceType
     */
    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType;
    }

    public TransferEnterpriseMultiAccountReq withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    


    /**
     * |参数名称：账户到期时间，UTC时间，格式为：2016-03-28T14:45:38Z。暂只对信用账户有效，用于限制针对有效期到期时间等于该时间的信用账户余额进行拨款，精确到秒。如果查询信用账户可拨款余额的查询结果没有失效时间，表示永久有效，对于这种账本拨款的时候不用填写。| |参数约束及描述：账户到期时间，UTC时间，格式为：2016-03-28T14:45:38Z。暂只对信用账户有效，用于限制针对有效期到期时间等于该时间的信用账户余额进行拨款，精确到秒。如果查询信用账户可拨款余额的查询结果没有失效时间，表示永久有效，对于这种账本拨款的时候不用填写。|
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
        TransferEnterpriseMultiAccountReq transferEnterpriseMultiAccountReq = (TransferEnterpriseMultiAccountReq) o;
        return Objects.equals(this.customerId, transferEnterpriseMultiAccountReq.customerId) &&
            Objects.equals(this.amount, transferEnterpriseMultiAccountReq.amount) &&
            Objects.equals(this.transId, transferEnterpriseMultiAccountReq.transId) &&
            Objects.equals(this.balanceType, transferEnterpriseMultiAccountReq.balanceType) &&
            Objects.equals(this.expireTime, transferEnterpriseMultiAccountReq.expireTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerId, amount, transId, balanceType, expireTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferEnterpriseMultiAccountReq {\n");
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

