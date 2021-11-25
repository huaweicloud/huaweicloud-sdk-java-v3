package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** AdjustCouponQuotasReq */
public class AdjustCouponQuotasReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_id")

    private String quotaId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_ids")

    private List<String> indirectPartnerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_amount")

    private Double quotaAmount;

    public AdjustCouponQuotasReq withQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }

    /** 华为云伙伴能力中心发放的代金券额度的ID。获取方法请参见查询优惠券额度。
     * 
     * @return quotaId */
    public String getQuotaId() {
        return quotaId;
    }

    public void setQuotaId(String quotaId) {
        this.quotaId = quotaId;
    }

    public AdjustCouponQuotasReq withIndirectPartnerIds(List<String> indirectPartnerIds) {
        this.indirectPartnerIds = indirectPartnerIds;
        return this;
    }

    public AdjustCouponQuotasReq addIndirectPartnerIdsItem(String indirectPartnerIdsItem) {
        if (this.indirectPartnerIds == null) {
            this.indirectPartnerIds = new ArrayList<>();
        }
        this.indirectPartnerIds.add(indirectPartnerIdsItem);
        return this;
    }

    public AdjustCouponQuotasReq withIndirectPartnerIds(Consumer<List<String>> indirectPartnerIdsSetter) {
        if (this.indirectPartnerIds == null) {
            this.indirectPartnerIds = new ArrayList<>();
        }
        indirectPartnerIdsSetter.accept(this.indirectPartnerIds);
        return this;
    }

    /** 精英服务商ID列表。
     * 
     * @return indirectPartnerIds */
    public List<String> getIndirectPartnerIds() {
        return indirectPartnerIds;
    }

    public void setIndirectPartnerIds(List<String> indirectPartnerIds) {
        this.indirectPartnerIds = indirectPartnerIds;
    }

    public AdjustCouponQuotasReq withQuotaAmount(Double quotaAmount) {
        this.quotaAmount = quotaAmount;
        return this;
    }

    /** 华为云伙伴能力中心向精英服务商发放的代金券额度值。 单位：元。取值大于0且精确到小数点后2位。 minimum: 0.01 maximum: 1E+8
     * 
     * @return quotaAmount */
    public Double getQuotaAmount() {
        return quotaAmount;
    }

    public void setQuotaAmount(Double quotaAmount) {
        this.quotaAmount = quotaAmount;
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
        return Objects.equals(this.quotaId, adjustCouponQuotasReq.quotaId)
            && Objects.equals(this.indirectPartnerIds, adjustCouponQuotasReq.indirectPartnerIds)
            && Objects.equals(this.quotaAmount, adjustCouponQuotasReq.quotaAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaId, indirectPartnerIds, quotaAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdjustCouponQuotasReq {\n");
        sb.append("    quotaId: ").append(toIndentedString(quotaId)).append("\n");
        sb.append("    indirectPartnerIds: ").append(toIndentedString(indirectPartnerIds)).append("\n");
        sb.append("    quotaAmount: ").append(toIndentedString(quotaAmount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
