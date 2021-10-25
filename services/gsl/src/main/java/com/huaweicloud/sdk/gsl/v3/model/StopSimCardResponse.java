package com.huaweicloud.sdk.gsl.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class StopSimCardResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_order_id")

    private Long workOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sim_price_plan_list")

    private List<SimPricePlanInfoVO> simPricePlanList = null;

    public StopSimCardResponse withWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
        return this;
    }

    /** 业务受理单号
     * 
     * @return workOrderId */
    public Long getWorkOrderId() {
        return workOrderId;
    }

    public void setWorkOrderId(Long workOrderId) {
        this.workOrderId = workOrderId;
    }

    public StopSimCardResponse withSimPricePlanList(List<SimPricePlanInfoVO> simPricePlanList) {
        this.simPricePlanList = simPricePlanList;
        return this;
    }

    public StopSimCardResponse addSimPricePlanListItem(SimPricePlanInfoVO simPricePlanListItem) {
        if (this.simPricePlanList == null) {
            this.simPricePlanList = new ArrayList<>();
        }
        this.simPricePlanList.add(simPricePlanListItem);
        return this;
    }

    public StopSimCardResponse withSimPricePlanList(Consumer<List<SimPricePlanInfoVO>> simPricePlanListSetter) {
        if (this.simPricePlanList == null) {
            this.simPricePlanList = new ArrayList<>();
        }
        simPricePlanListSetter.accept(this.simPricePlanList);
        return this;
    }

    /** 套餐列表
     * 
     * @return simPricePlanList */
    public List<SimPricePlanInfoVO> getSimPricePlanList() {
        return simPricePlanList;
    }

    public void setSimPricePlanList(List<SimPricePlanInfoVO> simPricePlanList) {
        this.simPricePlanList = simPricePlanList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StopSimCardResponse stopSimCardResponse = (StopSimCardResponse) o;
        return Objects.equals(this.workOrderId, stopSimCardResponse.workOrderId)
            && Objects.equals(this.simPricePlanList, stopSimCardResponse.simPricePlanList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workOrderId, simPricePlanList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopSimCardResponse {\n");
        sb.append("    workOrderId: ").append(toIndentedString(workOrderId)).append("\n");
        sb.append("    simPricePlanList: ").append(toIndentedString(simPricePlanList)).append("\n");
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
