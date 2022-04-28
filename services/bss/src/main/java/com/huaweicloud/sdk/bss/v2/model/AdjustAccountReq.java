package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AdjustAccountReq
 */
public class AdjustAccountReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Double amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public AdjustAccountReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。您可以调用[查询客户列表](https://support.huaweicloud.com/api-bpconsole/mc_00021.html)接口获取customer_id。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public AdjustAccountReq withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 拨款金额。 单位：元。取值大于0且精确到小数点后2位。 注意该值不能大于“查询伙伴账户余额”接口响应消息表2中参数amount - designated_amount的值。
     * minimum: 0
     * maximum: 2147483647
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public AdjustAccountReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 精英服务商ID。获取方法请参见[查询精英服务商列表](https://support.huaweicloud.com/api-bpconsole/espp_00003.html)。 精英服务商（二级经销商）给子客户拨款时，需携带该参数。  说明： 该参数存在的情况下，如果结果返回余额不足，表示对应的二级经销商的余额不足，如果该参数不存在，则余额不足表示调用的伙伴自身账号的余额不足。
     * @return indirectPartnerId
     */
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
        AdjustAccountReq adjustAccountReq = (AdjustAccountReq) o;
        return Objects.equals(this.customerId, adjustAccountReq.customerId)
            && Objects.equals(this.amount, adjustAccountReq.amount)
            && Objects.equals(this.indirectPartnerId, adjustAccountReq.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, amount, indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdjustAccountReq {\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
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
