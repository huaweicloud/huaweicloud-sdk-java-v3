package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListSimPricePlansRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_card_id")

    private Long simCardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_price_plan_id")

    private Long simPricePlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_time")

    private Boolean realTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Long limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    public ListSimPricePlansRequest withSimCardId(Long simCardId) {
        this.simCardId = simCardId;
        return this;
    }

    /** SIM卡标识，可通过[查询SIM卡列表接口](https://support.huaweicloud.com/api-ocgsl/gsl_07_0008.html)获取 minimum: 0
     * 
     * @return simCardId */
    public Long getSimCardId() {
        return simCardId;
    }

    public void setSimCardId(Long simCardId) {
        this.simCardId = simCardId;
    }

    public ListSimPricePlansRequest withSimPricePlanId(Long simPricePlanId) {
        this.simPricePlanId = simPricePlanId;
        return this;
    }

    /** 套餐实例ID minimum: 0
     * 
     * @return simPricePlanId */
    public Long getSimPricePlanId() {
        return simPricePlanId;
    }

    public void setSimPricePlanId(Long simPricePlanId) {
        this.simPricePlanId = simPricePlanId;
    }

    public ListSimPricePlansRequest withRealTime(Boolean realTime) {
        this.realTime = realTime;
        return this;
    }

    /** 是否查实时流量
     * 
     * @return realTime */
    public Boolean getRealTime() {
        return realTime;
    }

    public void setRealTime(Boolean realTime) {
        this.realTime = realTime;
    }

    public ListSimPricePlansRequest withLimit(Long limit) {
        this.limit = limit;
        return this;
    }

    /** 分页查询时每页显示的记录数，默认值为10，取值范围为10-500的整数 minimum: 10 maximum: 500
     * 
     * @return limit */
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public ListSimPricePlansRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /** 分页查询时的页码数，默认值为1，取值范围为1-1000000的整数 minimum: 1 maximum: 1000000
     * 
     * @return offset */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSimPricePlansRequest listSimPricePlansRequest = (ListSimPricePlansRequest) o;
        return Objects.equals(this.simCardId, listSimPricePlansRequest.simCardId)
            && Objects.equals(this.simPricePlanId, listSimPricePlansRequest.simPricePlanId)
            && Objects.equals(this.realTime, listSimPricePlansRequest.realTime)
            && Objects.equals(this.limit, listSimPricePlansRequest.limit)
            && Objects.equals(this.offset, listSimPricePlansRequest.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simCardId, simPricePlanId, realTime, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSimPricePlansRequest {\n");
        sb.append("    simCardId: ").append(toIndentedString(simCardId)).append("\n");
        sb.append("    simPricePlanId: ").append(toIndentedString(simPricePlanId)).append("\n");
        sb.append("    realTime: ").append(toIndentedString(realTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
