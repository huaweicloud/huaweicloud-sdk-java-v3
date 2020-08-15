package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ReclaimToPartnerAccountBalancesReq
 */
public class ReclaimToPartnerAccountBalancesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private BigDecimal amount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public ReclaimToPartnerAccountBalancesReq withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：回收金额。| |参数的约束及描述：单位为元不能为负数，精确到小数点后两位。|
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

    public ReclaimToPartnerAccountBalancesReq withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * |参数名称：合作伙伴关联的客户的客户ID。| |参数约束及描述：合作伙伴关联的客户的客户ID。|
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ReclaimToPartnerAccountBalancesReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * |参数名称：二级经销商ID。| |参数约束及描述：一级经销商回收二级经销商子客户余额时，需携带该字段。|
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
        return Objects.equals(this.amount, reclaimToPartnerAccountBalancesReq.amount) &&
            Objects.equals(this.customerId, reclaimToPartnerAccountBalancesReq.customerId) &&
            Objects.equals(this.indirectPartnerId, reclaimToPartnerAccountBalancesReq.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount, customerId, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReclaimToPartnerAccountBalancesReq {\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
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

