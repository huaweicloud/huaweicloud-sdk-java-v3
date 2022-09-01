package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ReclaimIndirectPartnerAccountReq
 */
public class ReclaimIndirectPartnerAccountReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    @JacksonXmlProperty(localName = "indirect_partner_id")

    private String indirectPartnerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amount")

    @JacksonXmlProperty(localName = "amount")

    private Double amount;

    public ReclaimIndirectPartnerAccountReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见[查询云经销商列表](https://support.huaweicloud.com/api-bpconsole/espp_00003.html)。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public ReclaimIndirectPartnerAccountReq withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * 回收金额。 华为云总经销商回收的云经销商的账户金额。  说明： 回收金额不能大于云经销商的账户余额。 单位：元。取值大于0且精确到小数点后2位。
     * minimum: 0.01
     * maximum: 999999999999
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
        ReclaimIndirectPartnerAccountReq reclaimIndirectPartnerAccountReq = (ReclaimIndirectPartnerAccountReq) o;
        return Objects.equals(this.indirectPartnerId, reclaimIndirectPartnerAccountReq.indirectPartnerId)
            && Objects.equals(this.amount, reclaimIndirectPartnerAccountReq.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indirectPartnerId, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReclaimIndirectPartnerAccountReq {\n");
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
