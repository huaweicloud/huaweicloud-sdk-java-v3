package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListBackPoolMembersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "back_pool_id")

    private Long backPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cid")

    private String cid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_cycle")

    private String billingCycle;

    public ListBackPoolMembersRequest withBackPoolId(Long backPoolId) {
        this.backPoolId = backPoolId;
        return this;
    }

    /**
     * 流量池标识
     * minimum: 0
     * @return backPoolId
     */
    public Long getBackPoolId() {
        return backPoolId;
    }

    public void setBackPoolId(Long backPoolId) {
        this.backPoolId = backPoolId;
    }

    public ListBackPoolMembersRequest withCid(String cid) {
        this.cid = cid;
        return this;
    }

    /**
     * 容器ID
     * @return cid
     */
    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public ListBackPoolMembersRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页记录数
     * minimum: 10
     * maximum: 500
     * @return limit
     */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListBackPoolMembersRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 页码
     * minimum: 1
     * maximum: 1000000
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public ListBackPoolMembersRequest withBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }

    /**
     * 账期，例如：2021-04
     * @return billingCycle
     */
    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBackPoolMembersRequest that = (ListBackPoolMembersRequest) obj;
        return Objects.equals(this.backPoolId, that.backPoolId) && Objects.equals(this.cid, that.cid)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.billingCycle, that.billingCycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(backPoolId, cid, limit, offset, billingCycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackPoolMembersRequest {\n");
        sb.append("    backPoolId: ").append(toIndentedString(backPoolId)).append("\n");
        sb.append("    cid: ").append(toIndentedString(cid)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
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
