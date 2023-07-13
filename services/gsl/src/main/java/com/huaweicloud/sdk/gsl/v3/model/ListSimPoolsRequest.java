package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSimPoolsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "billing_cycle")

    private String billingCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_billing_cycle")

    private Boolean allBillingCycle;

    public ListSimPoolsRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * 流量池名称
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public ListSimPoolsRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页查询时每页显示的记录数，默认值为10，取值范围为10-500的整数
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

    public ListSimPoolsRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询时的页码数，默认值为1，取值范围为1-1000000的整数
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

    public ListSimPoolsRequest withBillingCycle(String billingCycle) {
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

    public ListSimPoolsRequest withAllBillingCycle(Boolean allBillingCycle) {
        this.allBillingCycle = allBillingCycle;
        return this;
    }

    /**
     * 是否查询近六个月账期标识
     * @return allBillingCycle
     */
    public Boolean getAllBillingCycle() {
        return allBillingCycle;
    }

    public void setAllBillingCycle(Boolean allBillingCycle) {
        this.allBillingCycle = allBillingCycle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSimPoolsRequest that = (ListSimPoolsRequest) obj;
        return Objects.equals(this.poolName, that.poolName) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.billingCycle, that.billingCycle)
            && Objects.equals(this.allBillingCycle, that.allBillingCycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolName, limit, offset, billingCycle, allBillingCycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSimPoolsRequest {\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
        sb.append("    allBillingCycle: ").append(toIndentedString(allBillingCycle)).append("\n");
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
