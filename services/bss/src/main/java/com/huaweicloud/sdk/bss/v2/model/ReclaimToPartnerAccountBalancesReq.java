package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * ReclaimToPartnerAccountBalancesReq
 */
public class ReclaimToPartnerAccountBalancesReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private BigDecimal amount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    public ReclaimToPartnerAccountBalancesReq withCustomerId(String customerId) {
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

    public ReclaimToPartnerAccountBalancesReq withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 回收的金额。 单位：元。取值大于0且精确到小数点后2位。
     * minimum: 0
     * maximum: 2147483647
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public ReclaimToPartnerAccountBalancesReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见[查询云经销商列表](https://support.huaweicloud.com/api-bpconsole/espp_00003.html)。云经销商（二级经销商）回收云经销商（二级经销商）的子客户账户余额时，需携带此参数；除此之外，该参数不做处理；否则只能回收自己的子客户账户余额。
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
        ReclaimToPartnerAccountBalancesReq reclaimToPartnerAccountBalancesReq = (ReclaimToPartnerAccountBalancesReq) o;
        return Objects.equals(this.customerId, reclaimToPartnerAccountBalancesReq.customerId)
            && Objects.equals(this.amount, reclaimToPartnerAccountBalancesReq.amount)
            && Objects.equals(this.indirectPartnerId, reclaimToPartnerAccountBalancesReq.indirectPartnerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, amount, indirectPartnerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReclaimToPartnerAccountBalancesReq {\n");
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
