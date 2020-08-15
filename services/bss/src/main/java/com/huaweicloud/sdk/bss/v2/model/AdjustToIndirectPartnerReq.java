package com.huaweicloud.sdk.bss.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AdjustToIndirectPartnerReq
 */
public class AdjustToIndirectPartnerReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="amount")
    
    private BigDecimal amount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;

    public AdjustToIndirectPartnerReq withAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    


    /**
     * |参数名称：授信金额。单位为元不能为负数，精确到小数点后两位。| |参数的约束及描述：授信金额。单位为元不能为负数，精确到小数点后两位。|
     * minimum: 0
     * maximum: 999999999.99
     * @return amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public AdjustToIndirectPartnerReq withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * |参数名称：合作伙伴关联的二级经销商伙伴ID。| |参数约束及描述：必填，最大长度64，合作伙伴关联的二级经销商伙伴ID。|
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
        AdjustToIndirectPartnerReq adjustToIndirectPartnerReq = (AdjustToIndirectPartnerReq) o;
        return Objects.equals(this.amount, adjustToIndirectPartnerReq.amount) &&
            Objects.equals(this.indirectPartnerId, adjustToIndirectPartnerReq.indirectPartnerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(amount, indirectPartnerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdjustToIndirectPartnerReq {\n");
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

