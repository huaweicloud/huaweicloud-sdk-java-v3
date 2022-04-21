package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReclaimCouponQuotasReq
 */
public class ReclaimCouponQuotasReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quota_ids")

    private List<String> quotaIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    private String remark;

    public ReclaimCouponQuotasReq withQuotaIds(List<String> quotaIds) {
        this.quotaIds = quotaIds;
        return this;
    }

    public ReclaimCouponQuotasReq addQuotaIdsItem(String quotaIdsItem) {
        if (this.quotaIds == null) {
            this.quotaIds = new ArrayList<>();
        }
        this.quotaIds.add(quotaIdsItem);
        return this;
    }

    public ReclaimCouponQuotasReq withQuotaIds(Consumer<List<String>> quotaIdsSetter) {
        if (this.quotaIds == null) {
            this.quotaIds = new ArrayList<>();
        }
        quotaIdsSetter.accept(this.quotaIds);
        return this;
    }

    /**
     * 被回收的精英服务商的代金券额度ID。获取方法请参见查询优惠券额度。
     * @return quotaIds
     */
    public List<String> getQuotaIds() {
        return quotaIds;
    }

    public void setQuotaIds(List<String> quotaIds) {
        this.quotaIds = quotaIds;
    }

    public ReclaimCouponQuotasReq withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * 回收时的备注。
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReclaimCouponQuotasReq reclaimCouponQuotasReq = (ReclaimCouponQuotasReq) o;
        return Objects.equals(this.quotaIds, reclaimCouponQuotasReq.quotaIds)
            && Objects.equals(this.remark, reclaimCouponQuotasReq.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quotaIds, remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReclaimCouponQuotasReq {\n");
        sb.append("    quotaIds: ").append(toIndentedString(quotaIds)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
