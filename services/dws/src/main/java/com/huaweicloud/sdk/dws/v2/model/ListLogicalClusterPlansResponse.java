package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListLogicalClusterPlansResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plans")

    private List<LogicalClusterPlanVo> plans = null;

    public ListLogicalClusterPlansResponse withPlans(List<LogicalClusterPlanVo> plans) {
        this.plans = plans;
        return this;
    }

    public ListLogicalClusterPlansResponse addPlansItem(LogicalClusterPlanVo plansItem) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }
        this.plans.add(plansItem);
        return this;
    }

    public ListLogicalClusterPlansResponse withPlans(Consumer<List<LogicalClusterPlanVo>> plansSetter) {
        if (this.plans == null) {
            this.plans = new ArrayList<>();
        }
        plansSetter.accept(this.plans);
        return this;
    }

    /**
     * 显示逻辑集群增删计划
     * @return plans
     */
    public List<LogicalClusterPlanVo> getPlans() {
        return plans;
    }

    public void setPlans(List<LogicalClusterPlanVo> plans) {
        this.plans = plans;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogicalClusterPlansResponse that = (ListLogicalClusterPlansResponse) obj;
        return Objects.equals(this.plans, that.plans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plans);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogicalClusterPlansResponse {\n");
        sb.append("    plans: ").append(toIndentedString(plans)).append("\n");
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
