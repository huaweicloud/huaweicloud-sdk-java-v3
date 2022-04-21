package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AdjustToIndirectPartnerReq
 */
public class AdjustToIndirectPartnerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    private Double amount;

    public AdjustToIndirectPartnerReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 精英服务商ID。获取方法请参见查询精英服务商列表。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public AdjustToIndirectPartnerReq withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 华为云伙伴能力中心向精英服务商拨款的金额。 单位：元。取值大于0且精确到小数点后2位。
     * minimum: 0
     * maximum: 999999999.99
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdjustToIndirectPartnerReq adjustToIndirectPartnerReq = (AdjustToIndirectPartnerReq) o;
        return Objects.equals(this.indirectPartnerId, adjustToIndirectPartnerReq.indirectPartnerId)
            && Objects.equals(this.amount, adjustToIndirectPartnerReq.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indirectPartnerId, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdjustToIndirectPartnerReq {\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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
