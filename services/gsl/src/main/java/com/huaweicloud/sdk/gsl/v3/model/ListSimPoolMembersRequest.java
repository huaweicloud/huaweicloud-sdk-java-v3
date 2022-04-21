package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSimPoolMembersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_pool_id")

    private Long simPoolId;

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

    public ListSimPoolMembersRequest withSimPoolId(Long simPoolId) {
        this.simPoolId = simPoolId;
        return this;
    }

    /**
     * 流量池标识
     * minimum: 0
     * @return simPoolId
     */
    public Long getSimPoolId() {
        return simPoolId;
    }

    public void setSimPoolId(Long simPoolId) {
        this.simPoolId = simPoolId;
    }

    public ListSimPoolMembersRequest withCid(String cid) {
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

    public ListSimPoolMembersRequest withLimit(Long limit) {
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

    public ListSimPoolMembersRequest withOffset(Long offset) {
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

    public ListSimPoolMembersRequest withBillingCycle(String billingCycle) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSimPoolMembersRequest listSimPoolMembersRequest = (ListSimPoolMembersRequest) o;
        return Objects.equals(this.simPoolId, listSimPoolMembersRequest.simPoolId)
            && Objects.equals(this.cid, listSimPoolMembersRequest.cid)
            && Objects.equals(this.limit, listSimPoolMembersRequest.limit)
            && Objects.equals(this.offset, listSimPoolMembersRequest.offset)
            && Objects.equals(this.billingCycle, listSimPoolMembersRequest.billingCycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simPoolId, cid, limit, offset, billingCycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSimPoolMembersRequest {\n");
        sb.append("    simPoolId: ").append(toIndentedString(simPoolId)).append("\n");
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
