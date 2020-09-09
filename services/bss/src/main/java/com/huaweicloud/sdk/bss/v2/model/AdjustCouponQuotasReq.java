package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AdjustCouponQuotasReq
 */
public class AdjustCouponQuotasReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_ids")
    
    private List<String> indirectPartnerIds = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_amount")
    
    private BigDecimal quotaAmount = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_id")
    
    private String quotaId;

    public AdjustCouponQuotasReq withIndirectPartnerIds(List<String> indirectPartnerIds) {
        this.indirectPartnerIds = indirectPartnerIds;
        return this;
    }

    
    public AdjustCouponQuotasReq addIndirectPartnerIdsItem(String indirectPartnerIdsItem) {
        this.indirectPartnerIds.add(indirectPartnerIdsItem);
        return this;
    }

    public AdjustCouponQuotasReq withIndirectPartnerIds(Consumer<List<String>> indirectPartnerIdsSetter) {
        if(this.indirectPartnerIds == null ){
            this.indirectPartnerIds = new ArrayList<>();
        }
        indirectPartnerIdsSetter.accept(this.indirectPartnerIds);
        return this;
    }

    /**
     * |参数名称：二级分销商伙伴id列表。最大100条| |参数约束以及描述：二级分销商伙伴id列表。最大100条|
     * @return indirectPartnerIds
     */
    public List<String> getIndirectPartnerIds() {
        return indirectPartnerIds;
    }

    public void setIndirectPartnerIds(List<String> indirectPartnerIds) {
        this.indirectPartnerIds = indirectPartnerIds;
    }

    public AdjustCouponQuotasReq withQuotaAmount(BigDecimal quotaAmount) {
        this.quotaAmount = quotaAmount;
        return this;
    }

    


    /**
     * |参数名称：额度值。保留小数点后2位| |参数的约束及描述：额度值。保留小数点后2位|
     * minimum: 0.01
     * maximum: 1E+8
     * @return quotaAmount
     */
    public BigDecimal getQuotaAmount() {
        return quotaAmount;
    }

    public void setQuotaAmount(BigDecimal quotaAmount) {
        this.quotaAmount = quotaAmount;
    }

    public AdjustCouponQuotasReq withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    


    /**
     * |参数名称：优惠券额度ID。| |参数约束及描述：优惠券额度ID。|
     * @return quotaId
     */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AdjustCouponQuotasReq adjustCouponQuotasReq = (AdjustCouponQuotasReq) o;
        return Objects.equals(this.indirectPartnerIds, adjustCouponQuotasReq.indirectPartnerIds) &&
            Objects.equals(this.quotaAmount, adjustCouponQuotasReq.quotaAmount) &&
            Objects.equals(this.quotaId, adjustCouponQuotasReq.quotaId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(indirectPartnerIds, quotaAmount, quotaId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdjustCouponQuotasReq {\n");
        sb.append("    indirectPartnerIds: ").append(toIndentedString(indirectPartnerIds)).append("\n");
        sb.append("    quotaAmount: ").append(toIndentedString(quotaAmount)).append("\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
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

