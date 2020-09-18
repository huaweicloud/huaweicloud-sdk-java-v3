package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ReclaimIndirectPartnerAccountReq
 */
public class ReclaimIndirectPartnerAccountReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private BigDecimal amount = null;

    public ReclaimIndirectPartnerAccountReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * |参数名称：精英服务商伙伴的ID。| |参数约束及描述：精英服务商伙伴的ID。|
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public ReclaimIndirectPartnerAccountReq withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：拨款金额。单位为元。不能为负数，精确到小数点后两位。| |参数的约束及描述：拨款金额。单位为元。不能为负数，浮点数精度为:小数点后两位。|
     * minimum: 0.01
     * maximum: 999999999999
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
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
        return Objects.equals(this.indirectPartnerId, reclaimIndirectPartnerAccountReq.indirectPartnerId) &&
            Objects.equals(this.amount, reclaimIndirectPartnerAccountReq.amount);
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

